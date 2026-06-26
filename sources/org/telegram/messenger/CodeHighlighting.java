package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
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
    private static HashSet<String> languages;
    private static final ConcurrentHashMap<String, Highlighting> processedHighlighting = new ConcurrentHashMap<>();

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
        public boolean ready;

        public LockedSpannableString(CharSequence charSequence) {
            super(charSequence);
            this.ready = false;
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

    public static class LockedWithFallbackSpannableString extends LockedSpannableString {
        public SpannableStringBuilder fallback;

        public LockedWithFallbackSpannableString(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
            super(charSequence);
            this.fallback = spannableStringBuilder;
        }

        @Override
        public <T> T[] getSpans(int i, int i2, Class<T> cls) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? (T[]) super.getSpans(i, i2, cls) : (T[]) spannableStringBuilder.getSpans(i, i2, cls);
        }

        @Override
        public int nextSpanTransition(int i, int i2, Class cls) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.nextSpanTransition(i, i2, cls) : spannableStringBuilder.nextSpanTransition(i, i2, cls);
        }

        @Override
        public int getSpanStart(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.getSpanStart(obj) : spannableStringBuilder.getSpanStart(obj);
        }

        @Override
        public int getSpanEnd(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.getSpanEnd(obj) : spannableStringBuilder.getSpanEnd(obj);
        }

        @Override
        public int getSpanFlags(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.getSpanFlags(obj) : spannableStringBuilder.getSpanFlags(obj);
        }
    }

    private static class Highlighting {
        String language;
        SpannableString result;
        CharSequence text;

        private Highlighting() {
        }
    }

    public static SpannableString getHighlighted(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString(charSequence);
        }
        String str2 = str + "`" + ((Object) charSequence);
        ConcurrentHashMap<String, Highlighting> concurrentHashMap = processedHighlighting;
        Highlighting highlighting = concurrentHashMap.get(str2);
        if (highlighting == null) {
            highlighting = new Highlighting();
            highlighting.text = charSequence;
            highlighting.language = str;
            LockedSpannableString lockedSpannableString = new LockedSpannableString(charSequence);
            highlighting.result = lockedSpannableString;
            highlight(lockedSpannableString, 0, lockedSpannableString.length(), str, 0, null, true);
            Iterator<String> it = concurrentHashMap.keySet().iterator();
            while (it.hasNext() && processedHighlighting.size() > 8) {
                it.next();
                it.remove();
            }
            processedHighlighting.put(str2, highlighting);
        }
        return highlighting.result;
    }

    public static void highlightEditable(CharSequence charSequence, final String str, final Utilities.Callback<SpannableString> callback) {
        if (callback == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        final SpannableString spannableString = new SpannableString(charSequence);
        if (TextUtils.isEmpty(str) || spannableString.length() == 0) {
            callback.run(spannableString);
        } else {
            final String string = spannableString.toString();
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    CodeHighlighting.lambda$highlightEditable$1(string, str, spannableString, callback);
                }
            });
        }
    }

    public static void lambda$highlightEditable$1(String str, String str2, final SpannableString spannableString, final Utilities.Callback callback) throws Throwable {
        if (compiledPatterns == null) {
            parse();
        }
        final ArrayList arrayList = new ArrayList();
        try {
            HashMap<String, TokenPattern[]> map = compiledPatterns;
            colorize(spannableString, 0, spannableString.length(), tokenize(str, map == null ? null : map.get(str2), 0).toArray(), -1, arrayList);
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CodeHighlighting.lambda$highlightEditable$0(arrayList, spannableString, callback);
            }
        });
    }

    public static void lambda$highlightEditable$0(ArrayList arrayList, SpannableString spannableString, Utilities.Callback callback) {
        for (int i = 0; i < arrayList.size(); i++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i);
            spannableString.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        callback.run(spannableString);
    }

    public static void prepare() {
        if (compiledPatterns != null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                CodeHighlighting.lambda$prepare$2();
            }
        });
    }

    public static void lambda$prepare$2() throws Throwable {
        if (compiledPatterns == null) {
            parse();
        }
    }

    public static Set<String> getLanguages() {
        HashSet<String> hashSet = languages;
        if (hashSet == null) {
            return null;
        }
        return hashSet;
    }

    public static void highlight(final Spannable spannable, final int i, final int i2, final String str, int i3, TextStyleSpan.TextStyleRun textStyleRun, boolean z) {
        if (spannable == null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                CodeHighlighting.lambda$highlight$5(spannable, i, i2, str);
            }
        });
    }

    public static void lambda$highlight$5(final Spannable spannable, int i, int i2, String str) throws Throwable {
        if (compiledPatterns == null) {
            parse();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringToken[][] stringTokenArr = new StringToken[1][];
        try {
            String string = spannable.subSequence(i, i2).toString();
            HashMap<String, TokenPattern[]> map = compiledPatterns;
            stringTokenArr[0] = tokenize(string, map == null ? null : map.get(str), 0).toArray();
        } catch (Exception e) {
            FileLog.e(e);
        }
        FileLog.d("[CodeHighlighter] tokenize took " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        colorize(spannable, i, i2, stringTokenArr[0], -1, arrayList);
        FileLog.d("[CodeHighlighter] colorize took " + (System.currentTimeMillis() - jCurrentTimeMillis2) + "ms");
        if (arrayList.isEmpty()) {
            return;
        }
        if (spannable instanceof LockedSpannableString) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i3);
                spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
            }
            FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - jCurrentTimeMillis3) + "ms in another thread");
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CodeHighlighting.lambda$highlight$3(spannable);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CodeHighlighting.lambda$highlight$4(arrayList, spannable);
            }
        });
    }

    public static void lambda$highlight$3(Spannable spannable) {
        ((LockedSpannableString) spannable).unlock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static void lambda$highlight$4(ArrayList arrayList, Spannable spannable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i);
            spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
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

    private static class CachedToSpan {
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
        HashMap<String, TokenPattern[]> map;
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
                if (!TextUtils.isEmpty(tokenPatternArr[i].insideLanguage) && (map = compiledPatterns) != null && (tokenPatternArr2 = map.get(tokenPatternArr[i].insideLanguage)) != null) {
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
        Match matchMatchPattern;
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
            int length2 = i;
            while (node2 != linkedList.tail) {
                if (rematchOptions != null && length2 >= rematchOptions.reach) {
                    return;
                }
                if (linkedList.length > str.length()) {
                    FileLog.e("[CodeHighlighter] Something went terribly wrong, ABORT, ABORT!");
                    return;
                }
                StringToken stringToken2 = node2.value;
                String strSubstring = stringToken2.string;
                if (strSubstring == null || stringToken2.token) {
                    tokenPattern2 = tokenPattern3;
                    i3 = length;
                } else {
                    if (tokenPattern3.greedy) {
                        matchMatchPattern = matchPattern(tokenPattern3, length2, str2);
                        if (matchMatchPattern == null || matchMatchPattern.index >= str.length()) {
                            break;
                        }
                        int i8 = matchMatchPattern.index;
                        int i9 = matchMatchPattern.length + i8;
                        int length3 = node2.value.length();
                        while (true) {
                            length2 += length3;
                            if (i8 < length2) {
                                break;
                            }
                            node2 = node2.next;
                            length3 = node2.value.length();
                        }
                        length2 -= node2.value.length();
                        StringToken stringToken3 = node2.value;
                        if (stringToken3.string == null || stringToken3.token) {
                            tokenPattern2 = tokenPattern3;
                            i3 = length;
                            node2 = node2;
                        } else {
                            Node node3 = node2;
                            int length4 = length2;
                            int i10 = 1;
                            while (node3 != linkedList.tail && (length4 < i9 || !node3.value.token)) {
                                i10++;
                                length4 += node3.value.length();
                                node3 = node3.next;
                            }
                            strSubstring = str2.substring(length2, length4);
                            matchMatchPattern.index -= length2;
                            i5 = i10 - 1;
                            node2 = node3;
                            i4 = 0;
                        }
                    } else {
                        i4 = 0;
                        matchMatchPattern = matchPattern(tokenPattern3, 0, strSubstring);
                        if (matchMatchPattern != null) {
                            i5 = 1;
                        }
                        tokenPattern2 = tokenPattern3;
                        i3 = length;
                    }
                    int i11 = matchMatchPattern.index;
                    String strSubstring2 = strSubstring.substring(i4, i11);
                    String strSubstring3 = strSubstring.substring(i11 + matchMatchPattern.length);
                    int length5 = strSubstring.length() + length2;
                    if (rematchOptions != null && length5 > rematchOptions.reach) {
                        rematchOptions.reach = length5;
                    }
                    Node nodeAddAfter = node2.prev;
                    if (strSubstring2.length() > 0) {
                        nodeAddAfter = linkedList.addAfter(nodeAddAfter, new StringToken(strSubstring2));
                        length2 += strSubstring2.length();
                    }
                    int i12 = length2;
                    linkedList.removeRange(nodeAddAfter, i5);
                    TokenPattern[] tokenPatternArr3 = tokenPattern3.insideTokenPatterns;
                    if (tokenPatternArr3 != null) {
                        i3 = length;
                        stringToken = new StringToken(tokenPattern3.group, tokenize(matchMatchPattern.string, tokenPatternArr3, tokenPattern3, i2 + 1), matchMatchPattern.length);
                    } else {
                        i3 = length;
                        String str3 = tokenPattern3.insideLanguage;
                        if (str3 != null) {
                            stringToken = new StringToken(tokenPattern3.group, tokenize(matchMatchPattern.string, compiledPatterns.get(str3), tokenPattern3, i2 + 1), matchMatchPattern.length);
                        } else {
                            stringToken = new StringToken(tokenPattern3.group, matchMatchPattern.string);
                        }
                    }
                    Node nodeAddAfter2 = linkedList.addAfter(nodeAddAfter, stringToken);
                    if (strSubstring3.length() > 0) {
                        linkedList.addAfter(nodeAddAfter2, new StringToken(strSubstring3));
                    }
                    if (i5 > 1) {
                        RematchOptions rematchOptions2 = new RematchOptions();
                        rematchOptions2.cause = tokenPattern3;
                        rematchOptions2.reach = length5;
                        tokenPattern2 = tokenPattern3;
                        matchGrammar(str, linkedList, tokenPatternArr, nodeAddAfter2.prev, i12, rematchOptions2, tokenPattern, i2 + 1);
                        if (rematchOptions != null && (i6 = rematchOptions2.reach) > rematchOptions.reach) {
                            rematchOptions.reach = i6;
                        }
                    } else {
                        tokenPattern2 = tokenPattern3;
                    }
                    node2 = nodeAddAfter2;
                    length2 = i12;
                }
                length2 += node2.value.length();
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
            int iEnd = matcher.end();
            int i2 = match.index;
            int i3 = iEnd - i2;
            match.length = i3;
            match.string = str.substring(i2, i3 + i2);
            return match;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    private static class RematchOptions {
        TokenPattern cause;
        int reach;

        private RematchOptions() {
        }
    }

    private static class Match {
        int index;
        int length;
        String string;

        private Match() {
        }
    }

    private static class LinkedList {
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

    private static class Node {
        public Node next;
        public Node prev;
        public StringToken value;

        private Node() {
        }
    }

    private static class StringToken {
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

    private static void parse() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.CodeHighlighting.parse():void");
    }

    private static class ParsedPattern {
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

    private static TokenPattern[] readTokens(StreamReader streamReader, ParsedPattern[] parsedPatternArr, HashMap<Integer, String[]> map) {
        int uint8 = streamReader.readUint8();
        TokenPattern[] tokenPatternArr = new TokenPattern[uint8];
        for (int i = 0; i < uint8; i++) {
            int uint82 = streamReader.readUint8();
            int i2 = uint82 & 3;
            int i3 = (uint82 >> 2) & 7;
            boolean z = (uint82 & 32) != 0;
            boolean z2 = (uint82 & 64) != 0;
            int uint16 = streamReader.readUint16();
            if (i2 == 0) {
                tokenPatternArr[i] = new TokenPattern(i3, parsedPatternArr[uint16].getCachedPattern());
            } else if (i2 == 1) {
                if (i3 == 0) {
                    tokenPatternArr[i] = new TokenPattern(parsedPatternArr[uint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, map));
                } else {
                    tokenPatternArr[i] = new TokenPattern(i3, parsedPatternArr[uint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, map));
                }
            } else if (i2 == 2) {
                tokenPatternArr[i] = new TokenPattern(parsedPatternArr[uint16].getCachedPattern(), map.get(Integer.valueOf(streamReader.readUint8()))[0]);
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

    private static class StreamReader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        public int readUint8() {
            return this.is.read() & 255;
        }

        public int readUint16() {
            return (this.is.read() & 255) | ((this.is.read() & 255) << 8);
        }

        public String readString() throws IOException {
            int i = this.is.read();
            if (i >= 254) {
                i = this.is.read() | (this.is.read() << 8) | (this.is.read() << 16);
            }
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) this.is.read();
            }
            return new String(bArr, StandardCharsets.US_ASCII);
        }
    }

    private static class TokenPattern {
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

    private static class CachedPattern {
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
