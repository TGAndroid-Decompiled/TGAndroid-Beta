package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.TextStyleSpan;

public class CodeHighlighting {
    public static final int MATCH_COMMENT = 6;
    public static final int MATCH_CONSTANT = 3;
    public static final int MATCH_FUNCTION = 7;
    public static final int MATCH_KEYWORD = 1;
    public static final int MATCH_NONE = 0;
    public static final int MATCH_NUMBER = 5;
    public static final int MATCH_OPERATOR = 2;
    public static final int MATCH_STRING = 4;
    private static HashMap<String, TokenPattern[]> compiledPatterns;
    private static final HashMap<String, Highlighting> processedHighlighting = new HashMap<>();

    public static int getTextSizeDecrement(int i) {
        if (i > 120) {
            return 5;
        }
        return i > 50 ? 3 : 2;
    }

    public static class Span extends CharacterStyle {
        public final String code;
        public final int currentType;
        public final float decrementSize;
        public final String lng;
        public final boolean smallerSize;
        public final TextStyleSpan.TextStyleRun style;

        public Span(boolean z, int i, TextStyleSpan.TextStyleRun textStyleRun, String str, String str2) {
            this.smallerSize = z;
            this.lng = str;
            this.code = str2;
            this.decrementSize = CodeHighlighting.getTextSizeDecrement(str2 == null ? 0 : str2.length());
            this.currentType = i;
            this.style = textStyleRun;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            if (this.smallerSize) {
                textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.decrementSize));
            }
            int i = this.currentType;
            if (i == 2) {
                textPaint.setColor(-1);
            } else if (i == 1) {
                textPaint.setColor(Theme.getColor(Theme.key_chat_messageTextOut));
            } else {
                textPaint.setColor(Theme.getColor(Theme.key_chat_messageTextIn));
            }
            TextStyleSpan.TextStyleRun textStyleRun = this.style;
            if (textStyleRun != null) {
                textStyleRun.applyStyle(textPaint);
            } else {
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setUnderlineText(false);
            }
        }
    }

    public static class ColorSpan extends CharacterStyle {
        public int group;

        public ColorSpan(int i) {
            this.group = i;
        }

        public int getColorKey() {
            switch (this.group) {
                case 1:
                    return Theme.key_code_keyword;
                case 2:
                    return Theme.key_code_operator;
                case 3:
                    return Theme.key_code_constant;
                case 4:
                    return Theme.key_code_string;
                case 5:
                    return Theme.key_code_number;
                case 6:
                    return Theme.key_code_comment;
                case 7:
                    return Theme.key_code_function;
                default:
                    return -1;
            }
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Theme.getColor(getColorKey()));
        }
    }

    public static class LockedSpannableString extends SpannableString {
        private boolean ready;

        public LockedSpannableString(CharSequence charSequence) {
            super(charSequence);
        }

        public void unlock() {
            this.ready = true;
        }

        @Override
        public <T> T[] getSpans(int i, int i2, Class<T> cls) {
            return !this.ready ? (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0)) : (T[]) super.getSpans(i, i2, cls);
        }

        @Override
        public int nextSpanTransition(int i, int i2, Class cls) {
            return !this.ready ? i2 : super.nextSpanTransition(i, i2, cls);
        }

        @Override
        public int getSpanStart(Object obj) {
            if (this.ready) {
                return super.getSpanStart(obj);
            }
            return -1;
        }

        @Override
        public int getSpanEnd(Object obj) {
            if (this.ready) {
                return super.getSpanEnd(obj);
            }
            return -1;
        }

        @Override
        public int getSpanFlags(Object obj) {
            if (this.ready) {
                return super.getSpanFlags(obj);
            }
            return 0;
        }
    }

    public static class Highlighting {
        String language;
        SpannableString result;
        String text;

        private Highlighting() {
        }
    }

    public static SpannableString getHighlighted(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return new SpannableString(str);
        }
        String str3 = str2 + "`" + str;
        HashMap<String, Highlighting> hashMap = processedHighlighting;
        Highlighting highlighting = hashMap.get(str3);
        if (highlighting == null) {
            highlighting = new Highlighting();
            highlighting.text = str;
            highlighting.language = str2;
            LockedSpannableString lockedSpannableString = new LockedSpannableString(str);
            highlighting.result = lockedSpannableString;
            highlight(lockedSpannableString, 0, lockedSpannableString.length(), str2, 0, null, true);
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext() && processedHighlighting.size() > 8) {
                it.next();
                it.remove();
            }
            processedHighlighting.put(str3, highlighting);
        }
        return highlighting.result;
    }

    public static void highlight(final Spannable spannable, final int i, final int i2, final String str, int i3, TextStyleSpan.TextStyleRun textStyleRun, boolean z) {
        if (spannable == null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                CodeHighlighting.lambda$highlight$2(spannable, i, i2, str);
            }
        });
    }

    public static void lambda$highlight$2(final Spannable spannable, int i, int i2, String str) {
        if (compiledPatterns == null) {
            parse();
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringToken[][] stringTokenArr = new StringToken[1];
        try {
            String charSequence = spannable.subSequence(i, i2).toString();
            HashMap<String, TokenPattern[]> hashMap = compiledPatterns;
            stringTokenArr[0] = tokenize(charSequence, hashMap == null ? null : hashMap.get(str), 0).toArray();
        } catch (Exception e) {
            FileLog.e(e);
        }
        FileLog.d("[CodeHighlighter] tokenize took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        long currentTimeMillis2 = System.currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        colorize(spannable, i, i2, stringTokenArr[0], -1, arrayList);
        FileLog.d("[CodeHighlighter] colorize took " + (System.currentTimeMillis() - currentTimeMillis2) + "ms");
        if (arrayList.isEmpty()) {
            return;
        }
        if (spannable instanceof LockedSpannableString) {
            long currentTimeMillis3 = System.currentTimeMillis();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i3);
                spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
            }
            FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - currentTimeMillis3) + "ms in another thread");
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CodeHighlighting.lambda$highlight$0(spannable);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CodeHighlighting.lambda$highlight$1(arrayList, spannable);
            }
        });
    }

    public static void lambda$highlight$0(Spannable spannable) {
        ((LockedSpannableString) spannable).unlock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static void lambda$highlight$1(ArrayList arrayList, Spannable spannable) {
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i);
            spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    private static void colorize(Spannable spannable, int i, int i2, StringToken[] stringTokenArr, int i3, ArrayList<CachedToSpan> arrayList) {
        int length;
        if (stringTokenArr == null) {
            return;
        }
        for (int i4 = 0; i4 < stringTokenArr.length && i < i2; i4++) {
            StringToken stringToken = stringTokenArr[i4];
            if (stringToken != null) {
                if (stringToken.string != null) {
                    int i5 = stringToken.group;
                    if (i3 != -1) {
                        i5 = i3;
                    }
                    if (i5 == -1) {
                        length = stringToken.length();
                        i += length;
                    } else {
                        arrayList.add(new CachedToSpan(i5, i, stringToken.length() + i));
                    }
                } else if (stringToken.inside != null) {
                    colorize(spannable, i, i + stringToken.length(), stringToken.inside.toArray(), stringToken.group, arrayList);
                }
                length = stringToken.length();
                i += length;
            }
        }
    }

    public static class CachedToSpan {
        public int end;
        public int group;
        public int start;

        public CachedToSpan(int i, int i2, int i3) {
            this.group = i;
            this.start = i2;
            this.end = i3;
        }
    }

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, int i) {
        return tokenize(str, tokenPatternArr, null, i);
    }

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, TokenPattern tokenPattern, int i) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAfter(linkedList.head, new StringToken(str));
        matchGrammar(str, linkedList, flatRest(tokenPatternArr), linkedList.head, 0, null, tokenPattern, i);
        return linkedList;
    }

    private static TokenPattern[] flatRest(TokenPattern[] tokenPatternArr) {
        HashMap<String, TokenPattern[]> hashMap;
        TokenPattern[] tokenPatternArr2;
        ArrayList arrayList = null;
        if (tokenPatternArr == null) {
            return null;
        }
        for (int i = 0; i < tokenPatternArr.length; i++) {
            CachedPattern cachedPattern = tokenPatternArr[i].pattern;
            if (cachedPattern != null && "REST".equals(cachedPattern.patternSource)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Collections.addAll(arrayList, tokenPatternArr);
                }
                arrayList.remove(tokenPatternArr[i]);
                if (!TextUtils.isEmpty(tokenPatternArr[i].insideLanguage) && (hashMap = compiledPatterns) != null && (tokenPatternArr2 = hashMap.get(tokenPatternArr[i].insideLanguage)) != null) {
                    Collections.addAll(arrayList, tokenPatternArr2);
                }
            }
        }
        return arrayList != null ? (TokenPattern[]) arrayList.toArray(new TokenPattern[0]) : tokenPatternArr;
    }

    private static void matchGrammar(String str, LinkedList linkedList, TokenPattern[] tokenPatternArr, Node node, int i, RematchOptions rematchOptions, TokenPattern tokenPattern, int i2) {
        TokenPattern tokenPattern2;
        int i3;
        int i4;
        Match matchPattern;
        int i5;
        StringToken stringToken;
        int i6;
        String str2 = str;
        TokenPattern[] tokenPatternArr2 = tokenPatternArr;
        if (tokenPatternArr2 == null || i2 > 20) {
            return;
        }
        int length = tokenPatternArr2.length;
        int i7 = 0;
        while (i7 < length) {
            TokenPattern tokenPattern3 = tokenPatternArr2[i7];
            if (tokenPattern3 == tokenPattern) {
                return;
            }
            if (rematchOptions != null && rematchOptions.cause == tokenPattern3) {
                return;
            }
            Node node2 = node.next;
            int i8 = i;
            while (node2 != linkedList.tail) {
                if (rematchOptions != null && i8 >= rematchOptions.reach) {
                    return;
                }
                if (linkedList.length > str.length()) {
                    FileLog.e("[CodeHighlighter] Something went terribly wrong, ABORT, ABORT!");
                    return;
                }
                StringToken stringToken2 = node2.value;
                String str3 = stringToken2.string;
                if (str3 != null && !stringToken2.token) {
                    if (tokenPattern3.greedy) {
                        matchPattern = matchPattern(tokenPattern3, i8, str2);
                        if (matchPattern == null || matchPattern.index >= str.length()) {
                            break;
                        }
                        int i9 = matchPattern.index;
                        int i10 = matchPattern.length + i9;
                        int length2 = node2.value.length();
                        while (true) {
                            i8 += length2;
                            if (i9 < i8) {
                                break;
                            }
                            node2 = node2.next;
                            length2 = node2.value.length();
                        }
                        i8 -= node2.value.length();
                        StringToken stringToken3 = node2.value;
                        if (stringToken3.string == null || stringToken3.token) {
                            tokenPattern2 = tokenPattern3;
                            i3 = length;
                            node2 = node2;
                            i8 += node2.value.length();
                            node2 = node2.next;
                            str2 = str;
                            tokenPattern3 = tokenPattern2;
                            length = i3;
                        } else {
                            Node node3 = node2;
                            int i11 = i8;
                            int i12 = 1;
                            while (node3 != linkedList.tail && (i11 < i10 || !node3.value.token)) {
                                i12++;
                                i11 += node3.value.length();
                                node3 = node3.next;
                            }
                            str3 = str2.substring(i8, i11);
                            matchPattern.index -= i8;
                            i5 = i12 - 1;
                            node2 = node3;
                            i4 = 0;
                        }
                    } else {
                        i4 = 0;
                        matchPattern = matchPattern(tokenPattern3, 0, str3);
                        if (matchPattern != null) {
                            i5 = 1;
                        }
                    }
                    int i13 = matchPattern.index;
                    String substring = str3.substring(i4, i13);
                    String substring2 = str3.substring(i13 + matchPattern.length);
                    int length3 = str3.length() + i8;
                    if (rematchOptions != null && length3 > rematchOptions.reach) {
                        rematchOptions.reach = length3;
                    }
                    Node node4 = node2.prev;
                    if (substring.length() > 0) {
                        node4 = linkedList.addAfter(node4, new StringToken(substring));
                        i8 += substring.length();
                    }
                    int i14 = i8;
                    linkedList.removeRange(node4, i5);
                    TokenPattern[] tokenPatternArr3 = tokenPattern3.insideTokenPatterns;
                    if (tokenPatternArr3 != null) {
                        i3 = length;
                        stringToken = new StringToken(tokenPattern3.group, tokenize(matchPattern.string, tokenPatternArr3, tokenPattern3, i2 + 1), matchPattern.length);
                    } else {
                        i3 = length;
                        String str4 = tokenPattern3.insideLanguage;
                        if (str4 != null) {
                            stringToken = new StringToken(tokenPattern3.group, tokenize(matchPattern.string, compiledPatterns.get(str4), tokenPattern3, i2 + 1), matchPattern.length);
                        } else {
                            stringToken = new StringToken(tokenPattern3.group, matchPattern.string);
                        }
                    }
                    Node addAfter = linkedList.addAfter(node4, stringToken);
                    if (substring2.length() > 0) {
                        linkedList.addAfter(addAfter, new StringToken(substring2));
                    }
                    if (i5 > 1) {
                        RematchOptions rematchOptions2 = new RematchOptions();
                        rematchOptions2.cause = tokenPattern3;
                        rematchOptions2.reach = length3;
                        tokenPattern2 = tokenPattern3;
                        matchGrammar(str, linkedList, tokenPatternArr, addAfter.prev, i14, rematchOptions2, tokenPattern, i2 + 1);
                        if (rematchOptions != null && (i6 = rematchOptions2.reach) > rematchOptions.reach) {
                            rematchOptions.reach = i6;
                        }
                    } else {
                        tokenPattern2 = tokenPattern3;
                    }
                    node2 = addAfter;
                    i8 = i14;
                    i8 += node2.value.length();
                    node2 = node2.next;
                    str2 = str;
                    tokenPattern3 = tokenPattern2;
                    length = i3;
                }
                tokenPattern2 = tokenPattern3;
                i3 = length;
                i8 += node2.value.length();
                node2 = node2.next;
                str2 = str;
                tokenPattern3 = tokenPattern2;
                length = i3;
            }
            i7++;
            str2 = str;
            tokenPatternArr2 = tokenPatternArr;
            length = length;
        }
    }

    private static Match matchPattern(TokenPattern tokenPattern, int i, String str) {
        try {
            Matcher matcher = tokenPattern.pattern.getPattern().matcher(str);
            matcher.region(i, str.length());
            if (!matcher.find()) {
                return null;
            }
            Match match = new Match();
            match.index = matcher.start();
            if (tokenPattern.lookbehind && matcher.groupCount() >= 1) {
                match.index += matcher.end(1) - matcher.start(1);
            }
            int end = matcher.end();
            int i2 = match.index;
            int i3 = end - i2;
            match.length = i3;
            match.string = str.substring(i2, i3 + i2);
            return match;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static class RematchOptions {
        TokenPattern cause;
        int reach;

        private RematchOptions() {
        }
    }

    public static class Match {
        int index;
        int length;
        String string;

        private Match() {
        }
    }

    public static class LinkedList {
        public Node head;
        public int length = 0;
        public Node tail;

        public LinkedList() {
            this.head = new Node();
            Node node = new Node();
            this.tail = node;
            Node node2 = this.head;
            node2.next = node;
            node.prev = node2;
        }

        public Node addAfter(Node node, StringToken stringToken) {
            Node node2 = node.next;
            Node node3 = new Node();
            node3.value = stringToken;
            node3.prev = node;
            node3.next = node2;
            node.next = node3;
            node2.prev = node3;
            this.length++;
            return node3;
        }

        public void removeRange(Node node, int i) {
            Node node2 = node.next;
            int i2 = 0;
            while (i2 < i && node2 != this.tail) {
                node2 = node2.next;
                i2++;
            }
            node.next = node2;
            node2.prev = node;
            this.length -= i2;
        }

        public StringToken[] toArray() {
            StringToken[] stringTokenArr = new StringToken[this.length];
            Node node = this.head.next;
            for (int i = 0; i < this.length && node != this.tail; i++) {
                stringTokenArr[i] = node.value;
                node = node.next;
            }
            return stringTokenArr;
        }
    }

    public static class Node {
        public Node next;
        public Node prev;
        public StringToken value;

        private Node() {
        }
    }

    public static class StringToken {
        final int group;
        final LinkedList inside;
        final int insideLength;
        final String string;
        final boolean token;

        public StringToken(int i, String str) {
            this.token = true;
            this.group = i;
            this.string = str;
            this.inside = null;
            this.insideLength = 0;
        }

        public StringToken(int i, LinkedList linkedList, int i2) {
            this.token = true;
            this.group = i;
            this.string = null;
            this.inside = linkedList;
            this.insideLength = i2;
        }

        public StringToken(String str) {
            this.token = false;
            this.group = -1;
            this.string = str;
            this.inside = null;
            this.insideLength = 0;
        }

        public int length() {
            String str = this.string;
            if (str != null) {
                return str.length();
            }
            return this.insideLength;
        }
    }

    private static void parse() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.CodeHighlighting.parse():void");
    }

    public static class ParsedPattern {
        private CachedPattern cachedPattern;
        boolean caseInsensitive;
        boolean multiline;
        String pattern;

        private ParsedPattern() {
        }

        public int flags() {
            return (this.multiline ? 8 : 0) | (this.caseInsensitive ? 2 : 0);
        }

        public CachedPattern getCachedPattern() {
            if (this.cachedPattern == null) {
                this.cachedPattern = new CachedPattern(this.pattern, flags());
            }
            return this.cachedPattern;
        }
    }

    private static TokenPattern[] readTokens(StreamReader streamReader, ParsedPattern[] parsedPatternArr, HashMap<Integer, String[]> hashMap) throws IOException {
        int readUint8 = streamReader.readUint8();
        TokenPattern[] tokenPatternArr = new TokenPattern[readUint8];
        for (int i = 0; i < readUint8; i++) {
            int readUint82 = streamReader.readUint8();
            int i2 = readUint82 & 3;
            int i3 = (readUint82 >> 2) & 7;
            boolean z = (readUint82 & 32) != 0;
            boolean z2 = (readUint82 & 64) != 0;
            int readUint16 = streamReader.readUint16();
            if (i2 == 0) {
                tokenPatternArr[i] = new TokenPattern(i3, parsedPatternArr[readUint16].getCachedPattern());
            } else if (i2 == 1) {
                if (i3 == 0) {
                    tokenPatternArr[i] = new TokenPattern(parsedPatternArr[readUint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, hashMap));
                } else {
                    tokenPatternArr[i] = new TokenPattern(i3, parsedPatternArr[readUint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, hashMap));
                }
            } else if (i2 == 2) {
                tokenPatternArr[i] = new TokenPattern(parsedPatternArr[readUint16].getCachedPattern(), hashMap.get(Integer.valueOf(streamReader.readUint8()))[0]);
            }
            if (z) {
                tokenPatternArr[i].greedy = true;
            }
            if (z2) {
                tokenPatternArr[i].lookbehind = true;
            }
        }
        return tokenPatternArr;
    }

    public static class StreamReader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        public int readUint8() throws IOException {
            return this.is.read() & 255;
        }

        public int readUint16() throws IOException {
            return (this.is.read() & 255) | ((this.is.read() & 255) << 8);
        }

        public String readString() throws IOException {
            int read = this.is.read();
            if (read >= 254) {
                read = this.is.read() | (this.is.read() << 8) | (this.is.read() << 16);
            }
            byte[] bArr = new byte[read];
            for (int i = 0; i < read; i++) {
                bArr[i] = (byte) this.is.read();
            }
            return new String(bArr, StandardCharsets.US_ASCII);
        }
    }

    public static class TokenPattern {
        public boolean greedy;
        public int group;
        public String insideLanguage;
        public TokenPattern[] insideTokenPatterns;
        public boolean lookbehind;
        public final CachedPattern pattern;

        public TokenPattern(int i, CachedPattern cachedPattern) {
            this.pattern = cachedPattern;
            this.group = i;
        }

        public TokenPattern(CachedPattern cachedPattern, TokenPattern... tokenPatternArr) {
            this.group = -1;
            this.pattern = cachedPattern;
            this.insideTokenPatterns = tokenPatternArr;
        }

        public TokenPattern(CachedPattern cachedPattern, String str) {
            this.group = -1;
            this.pattern = cachedPattern;
            this.insideLanguage = str;
        }

        public TokenPattern(int i, CachedPattern cachedPattern, TokenPattern... tokenPatternArr) {
            this.group = i;
            this.pattern = cachedPattern;
            this.insideTokenPatterns = tokenPatternArr;
        }
    }

    public static class CachedPattern {
        private Pattern pattern;
        private String patternSource;
        private int patternSourceFlags;

        public CachedPattern(String str, int i) {
            this.patternSource = str;
            this.patternSourceFlags = i;
        }

        public Pattern getPattern() {
            if (this.pattern == null) {
                this.pattern = Pattern.compile(this.patternSource, this.patternSourceFlags);
            }
            return this.pattern;
        }
    }
}
