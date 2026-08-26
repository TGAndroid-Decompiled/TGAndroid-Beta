package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
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
import java.util.zip.GZIPInputStream;
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
            textPaint.setColor(Theme.getColor(null, getColorKey(), false));
        }
    }

    public static class Highlighting {
        String language;
        SpannableString result;
        CharSequence text;

        private Highlighting() {
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

    public static class LockedSpannableString extends SpannableString {
        public boolean ready;

        public LockedSpannableString(CharSequence charSequence) {
            super(charSequence);
            this.ready = false;
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

        @Override
        public int getSpanStart(Object obj) {
            if (this.ready) {
                return super.getSpanStart(obj);
            }
            return -1;
        }

        @Override
        public <T> T[] getSpans(int i, int i2, Class<T> cls) {
            return !this.ready ? (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0)) : (T[]) super.getSpans(i, i2, cls);
        }

        @Override
        public int nextSpanTransition(int i, int i2, Class cls) {
            return !this.ready ? i2 : super.nextSpanTransition(i, i2, cls);
        }

        public void unlock() {
            this.ready = true;
        }
    }

    public static class LockedWithFallbackSpannableString extends LockedSpannableString {
        public SpannableStringBuilder fallback;

        public LockedWithFallbackSpannableString(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
            super(charSequence);
            this.fallback = spannableStringBuilder;
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

        @Override
        public int getSpanStart(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            return (this.ready || (spannableStringBuilder = this.fallback) == null) ? super.getSpanStart(obj) : spannableStringBuilder.getSpanStart(obj);
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
    }

    public static class Match {
        int index;
        int length;
        String string;

        private Match() {
        }
    }

    public static class Node {
        public Node next;
        public Node prev;
        public StringToken value;

        private Node() {
        }
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

    public static class RematchOptions {
        TokenPattern cause;
        int reach;

        private RematchOptions() {
        }
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
                textPaint.setColor(Theme.getColor(null, Theme.key_chat_messageTextOut, false));
            } else {
                textPaint.setColor(Theme.getColor(null, Theme.key_chat_messageTextIn, false));
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

    public static class StreamReader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
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

        public int readUint16() {
            return (this.is.read() & 255) | ((this.is.read() & 255) << 8);
        }

        public int readUint8() {
            return this.is.read() & 255;
        }
    }

    private static void colorize(Spannable spannable, int i, int i2, StringToken[] stringTokenArr, int i3, ArrayList<CachedToSpan> arrayList) {
        Spannable spannable2;
        ArrayList<CachedToSpan> arrayList2;
        if (stringTokenArr == null) {
            return;
        }
        int i4 = 0;
        int length = i;
        while (i4 < stringTokenArr.length && length < i2) {
            StringToken stringToken = stringTokenArr[i4];
            if (stringToken != null) {
                if (stringToken.string != null) {
                    int i5 = stringToken.group;
                    if (i3 != -1) {
                        i5 = i3;
                    }
                    if (i5 == -1) {
                        length += stringToken.length();
                        spannable2 = spannable;
                        arrayList2 = arrayList;
                    } else {
                        arrayList.add(new CachedToSpan(i5, length, stringToken.length() + length));
                    }
                } else {
                    if (stringToken.inside != null) {
                        spannable2 = spannable;
                        arrayList2 = arrayList;
                        colorize(spannable2, length, length + stringToken.length(), stringToken.inside.toArray(), stringToken.group, arrayList2);
                    }
                    length += stringToken.length();
                }
                spannable2 = spannable;
                arrayList2 = arrayList;
                length += stringToken.length();
            } else {
                spannable2 = spannable;
                arrayList2 = arrayList;
            }
            i4++;
            spannable = spannable2;
            arrayList = arrayList2;
        }
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

    public static Set<String> getLanguages() {
        HashSet<String> hashSet = languages;
        if (hashSet == null) {
            return null;
        }
        return hashSet;
    }

    public static int getTextSizeDecrement(int i) {
        if (i > 120) {
            return 5;
        }
        return i > 50 ? 3 : 2;
    }

    public static void highlight(Spannable spannable, int i, int i2, String str, int i3, TextStyleSpan.TextStyleRun textStyleRun, boolean z) {
        if (spannable == null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new ImageLoader$5$$ExternalSyntheticLambda6(spannable, i, i2, str, 1));
    }

    public static void highlightEditable(CharSequence charSequence, String str, Utilities.Callback<SpannableString> callback) {
        if (callback == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (TextUtils.isEmpty(str) || spannableString.length() == 0) {
            callback.run(spannableString);
        } else {
            Utilities.searchQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda10(spannableString.toString(), str, spannableString, callback));
        }
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

    public static void lambda$highlight$5(Spannable spannable, int i, int i2, String str) throws Throwable {
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
        ArrayList arrayList = new ArrayList();
        colorize(spannable, i, i2, stringTokenArr[0], -1, arrayList);
        FileLog.d("[CodeHighlighter] colorize took " + (System.currentTimeMillis() - jCurrentTimeMillis2) + "ms");
        if (arrayList.isEmpty()) {
            return;
        }
        if (!(spannable instanceof LockedSpannableString)) {
            AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda5(21, arrayList, spannable));
            return;
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i3);
            spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - jCurrentTimeMillis3) + "ms in another thread");
        AndroidUtilities.runOnUIThread(new ANRDetector$$ExternalSyntheticLambda0((LockedSpannableString) spannable, 15));
    }

    public static void lambda$highlightEditable$0(ArrayList arrayList, SpannableString spannableString, Utilities.Callback callback) {
        for (int i = 0; i < arrayList.size(); i++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i);
            spannableString.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        callback.run(spannableString);
    }

    public static void lambda$highlightEditable$1(String str, String str2, SpannableString spannableString, Utilities.Callback callback) throws Throwable {
        SpannableString spannableString2;
        if (compiledPatterns == null) {
            parse();
        }
        ArrayList arrayList = new ArrayList();
        try {
            HashMap<String, TokenPattern[]> map = compiledPatterns;
            spannableString2 = spannableString;
            try {
                colorize(spannableString2, 0, spannableString.length(), tokenize(str, map == null ? null : map.get(str2), 0).toArray(), -1, arrayList);
            } catch (Exception e) {
                e = e;
                FileLog.e(e);
            }
        } catch (Exception e2) {
            e = e2;
            spannableString2 = spannableString;
        }
        AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda0(arrayList, spannableString2, callback, 13));
    }

    public static void lambda$prepare$2() throws Throwable {
        if (compiledPatterns == null) {
            parse();
        }
    }

    private static void matchGrammar(String str, LinkedList linkedList, TokenPattern[] tokenPatternArr, Node node, int i, RematchOptions rematchOptions, TokenPattern tokenPattern, int i2) {
        int i3;
        Match matchMatchPattern;
        int i4;
        String strSubstring;
        String strSubstring2;
        int length;
        Node nodeAddAfter;
        TokenPattern[] tokenPatternArr2;
        int i5;
        String str2;
        StringToken stringToken;
        Node nodeAddAfter2;
        int i6;
        TokenPattern[] tokenPatternArr3 = tokenPatternArr;
        if (tokenPatternArr3 == null || i2 > 20) {
            return;
        }
        int length2 = tokenPatternArr3.length;
        int i7 = 0;
        while (i7 < length2) {
            TokenPattern tokenPattern2 = tokenPatternArr3[i7];
            if (tokenPattern2 == tokenPattern) {
                return;
            }
            if (rematchOptions != null && rematchOptions.cause == tokenPattern2) {
                return;
            }
            Node node2 = node.next;
            int length3 = i;
            while (node2 != linkedList.tail) {
                if (rematchOptions != null && length3 >= rematchOptions.reach) {
                    return;
                }
                if (linkedList.length > str.length()) {
                    FileLog.e("[CodeHighlighter] Something went terribly wrong, ABORT, ABORT!");
                    return;
                }
                StringToken stringToken2 = node2.value;
                String strSubstring3 = stringToken2.string;
                if (strSubstring3 != null && !stringToken2.token) {
                    if (tokenPattern2.greedy) {
                        matchMatchPattern = matchPattern(tokenPattern2, length3, str);
                        if (matchMatchPattern == null || matchMatchPattern.index >= str.length()) {
                            break;
                        }
                        int i8 = matchMatchPattern.index;
                        int i9 = matchMatchPattern.length + i8;
                        int length4 = node2.value.length();
                        while (true) {
                            length3 += length4;
                            if (i8 < length3) {
                                break;
                            }
                            node2 = node2.next;
                            length4 = node2.value.length();
                        }
                        length3 -= node2.value.length();
                        StringToken stringToken3 = node2.value;
                        if (stringToken3.string != null && !stringToken3.token) {
                            int length5 = length3;
                            int i10 = 1;
                            for (Node node3 = node2; node3 != linkedList.tail && (length5 < i9 || !node3.value.token); node3 = node3.next) {
                                i10++;
                                length5 += node3.value.length();
                            }
                            strSubstring3 = str.substring(length3, length5);
                            matchMatchPattern.index -= length3;
                            i4 = i10 - 1;
                            i3 = 0;
                            int i11 = matchMatchPattern.index;
                            strSubstring = strSubstring3.substring(i3, i11);
                            strSubstring2 = strSubstring3.substring(i11 + matchMatchPattern.length);
                            length = strSubstring3.length() + length3;
                            if (rematchOptions != null && length > rematchOptions.reach) {
                                rematchOptions.reach = length;
                            }
                            nodeAddAfter = node2.prev;
                            if (strSubstring.length() > 0) {
                                nodeAddAfter = linkedList.addAfter(nodeAddAfter, new StringToken(strSubstring));
                                length3 += strSubstring.length();
                            }
                            linkedList.removeRange(nodeAddAfter, i4);
                            tokenPatternArr2 = tokenPattern2.insideTokenPatterns;
                            if (tokenPatternArr2 != null) {
                                i5 = length3;
                                stringToken = new StringToken(tokenPattern2.group, tokenize(matchMatchPattern.string, tokenPatternArr2, tokenPattern2, i2 + 1), matchMatchPattern.length);
                            } else {
                                i5 = length3;
                                str2 = tokenPattern2.insideLanguage;
                                if (str2 != null) {
                                    stringToken = new StringToken(tokenPattern2.group, tokenize(matchMatchPattern.string, compiledPatterns.get(str2), tokenPattern2, i2 + 1), matchMatchPattern.length);
                                } else {
                                    stringToken = new StringToken(tokenPattern2.group, matchMatchPattern.string);
                                }
                            }
                            nodeAddAfter2 = linkedList.addAfter(nodeAddAfter, stringToken);
                            if (strSubstring2.length() > 0) {
                                linkedList.addAfter(nodeAddAfter2, new StringToken(strSubstring2));
                            }
                            if (i4 > 1) {
                                RematchOptions rematchOptions2 = new RematchOptions();
                                rematchOptions2.cause = tokenPattern2;
                                rematchOptions2.reach = length;
                                matchGrammar(str, linkedList, tokenPatternArr, nodeAddAfter2.prev, i5, rematchOptions2, tokenPattern, i2 + 1);
                                if (rematchOptions != null && (i6 = rematchOptions2.reach) > rematchOptions.reach) {
                                    rematchOptions.reach = i6;
                                }
                            }
                            node2 = nodeAddAfter2;
                            length3 = i5;
                        }
                    } else {
                        i3 = 0;
                        matchMatchPattern = matchPattern(tokenPattern2, 0, strSubstring3);
                        if (matchMatchPattern != null) {
                            i4 = 1;
                            int i12 = matchMatchPattern.index;
                            strSubstring = strSubstring3.substring(i3, i12);
                            strSubstring2 = strSubstring3.substring(i12 + matchMatchPattern.length);
                            length = strSubstring3.length() + length3;
                            if (rematchOptions != null) {
                                rematchOptions.reach = length;
                            }
                            nodeAddAfter = node2.prev;
                            if (strSubstring.length() > 0) {
                                nodeAddAfter = linkedList.addAfter(nodeAddAfter, new StringToken(strSubstring));
                                length3 += strSubstring.length();
                            }
                            linkedList.removeRange(nodeAddAfter, i4);
                            tokenPatternArr2 = tokenPattern2.insideTokenPatterns;
                            if (tokenPatternArr2 != null) {
                                i5 = length3;
                                stringToken = new StringToken(tokenPattern2.group, tokenize(matchMatchPattern.string, tokenPatternArr2, tokenPattern2, i2 + 1), matchMatchPattern.length);
                            } else {
                                i5 = length3;
                                str2 = tokenPattern2.insideLanguage;
                                if (str2 != null) {
                                    stringToken = new StringToken(tokenPattern2.group, tokenize(matchMatchPattern.string, compiledPatterns.get(str2), tokenPattern2, i2 + 1), matchMatchPattern.length);
                                } else {
                                    stringToken = new StringToken(tokenPattern2.group, matchMatchPattern.string);
                                }
                            }
                            nodeAddAfter2 = linkedList.addAfter(nodeAddAfter, stringToken);
                            if (strSubstring2.length() > 0) {
                                linkedList.addAfter(nodeAddAfter2, new StringToken(strSubstring2));
                            }
                            if (i4 > 1) {
                                RematchOptions rematchOptions3 = new RematchOptions();
                                rematchOptions3.cause = tokenPattern2;
                                rematchOptions3.reach = length;
                                matchGrammar(str, linkedList, tokenPatternArr, nodeAddAfter2.prev, i5, rematchOptions3, tokenPattern, i2 + 1);
                                if (rematchOptions != null) {
                                    rematchOptions.reach = i6;
                                }
                            }
                            node2 = nodeAddAfter2;
                            length3 = i5;
                        }
                    }
                }
                length3 += node2.value.length();
                node2 = node2.next;
                str = str;
                linkedList = linkedList;
            }
            i7++;
            tokenPatternArr3 = tokenPatternArr;
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
                match.index = (matcher.end(1) - matcher.start(1)) + match.index;
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

    private static void parse() throws Throwable {
        GZIPInputStream gZIPInputStream;
        InputStream inputStreamOpen;
        BufferedInputStream bufferedInputStream;
        ?? r6;
        GZIPInputStream gZIPInputStream2;
        Throwable th;
        BufferedInputStream bufferedInputStream2;
        ?? r1 = 0;
        gZIPInputStream = null;
        r1 = 0;
        GZIPInputStream gZIPInputStream3 = null;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("codelng.gzip");
            try {
                gZIPInputStream2 = new GZIPInputStream(inputStreamOpen, 65536);
                try {
                    BufferedInputStream bufferedInputStream3 = new BufferedInputStream(gZIPInputStream2, 65536);
                    try {
                        StreamReader streamReader = new StreamReader(bufferedInputStream3);
                        HashMap map = new HashMap();
                        int uint8 = streamReader.readUint8();
                        for (int i = 0; i < uint8; i++) {
                            int uint9 = streamReader.readUint8();
                            int uint10 = streamReader.readUint8();
                            String[] strArr = new String[uint10];
                            for (int i2 = 0; i2 < uint10; i2++) {
                                strArr[i2] = streamReader.readString();
                            }
                            map.put(Integer.valueOf(uint9), strArr);
                        }
                        int uint16 = streamReader.readUint16();
                        ParsedPattern[] parsedPatternArr = new ParsedPattern[uint16];
                        for (int i3 = 0; i3 < uint16; i3++) {
                            parsedPatternArr[i3] = new ParsedPattern();
                            int uint11 = streamReader.readUint8();
                            ParsedPattern parsedPattern = parsedPatternArr[i3];
                            parsedPattern.multiline = (uint11 & 1) != 0;
                            parsedPattern.caseInsensitive = (uint11 & 2) != 0;
                            parsedPattern.pattern = streamReader.readString();
                        }
                        if (compiledPatterns == null) {
                            compiledPatterns = new HashMap<>();
                        }
                        if (languages == null) {
                            languages = new HashSet<>();
                        }
                        int i4 = 0;
                        while (i4 < uint8) {
                            int uint12 = streamReader.readUint8();
                            TokenPattern[] tokens = readTokens(streamReader, parsedPatternArr, map);
                            String[] strArr2 = (String[]) map.get(Integer.valueOf(uint12));
                            int length = strArr2.length;
                            int i5 = 0;
                            while (i5 < length) {
                                compiledPatterns.put(strArr2[i5], tokens);
                                i5++;
                                streamReader = streamReader;
                            }
                            StreamReader streamReader2 = streamReader;
                            if (strArr2.length > 0 && !"plain".equals(strArr2[0]) && !strArr2[0].endsWith("like") && !strArr2[0].startsWith("markup")) {
                                languages.add(strArr2[0]);
                            }
                            i4++;
                            streamReader = streamReader2;
                        }
                        FileLog.d("[CodeHighlighter] Successfully read " + uint8 + " languages, " + uint16 + " patterns in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms from codelng.gzip");
                        try {
                            gZIPInputStream2.close();
                            bufferedInputStream3.close();
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedInputStream2 = bufferedInputStream3;
                        gZIPInputStream3 = gZIPInputStream2;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            FileLog.e(e);
                            if (gZIPInputStream3 != null) {
                                try {
                                    gZIPInputStream3.close();
                                } catch (Exception e3) {
                                    FileLog.e(e3);
                                    return;
                                }
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPInputStream = gZIPInputStream3;
                            r1 = bufferedInputStream;
                            r6 = r1;
                            gZIPInputStream2 = gZIPInputStream;
                            th = th;
                            if (gZIPInputStream2 != null) {
                                try {
                                    gZIPInputStream2.close();
                                } catch (Exception e4) {
                                    FileLog.e(e4);
                                    throw th;
                                }
                            }
                            if (r6 != 0) {
                                r6.close();
                            }
                            if (inputStreamOpen == null) {
                                throw th;
                            }
                            inputStreamOpen.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r6 = bufferedInputStream3;
                        th = th;
                        if (gZIPInputStream2 != null) {
                            gZIPInputStream2.close();
                        }
                        if (r6 != 0) {
                            r6.close();
                        }
                        if (inputStreamOpen == null) {
                            throw th;
                        }
                        inputStreamOpen.close();
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    bufferedInputStream2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    r6 = 0;
                }
            } catch (Exception e6) {
                e = e6;
                bufferedInputStream = null;
            } catch (Throwable th5) {
                th = th5;
                gZIPInputStream = null;
                r6 = r1;
                gZIPInputStream2 = gZIPInputStream;
                th = th;
                if (gZIPInputStream2 != null) {
                    gZIPInputStream2.close();
                }
                if (r6 != 0) {
                    r6.close();
                }
                if (inputStreamOpen == null) {
                    throw th;
                }
                inputStreamOpen.close();
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            inputStreamOpen = null;
            bufferedInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            gZIPInputStream = null;
            inputStreamOpen = null;
        }
    }

    public static void prepare() {
        if (compiledPatterns != null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new Emoji$$ExternalSyntheticLambda1(8));
    }

    private static TokenPattern[] readTokens(StreamReader streamReader, ParsedPattern[] parsedPatternArr, HashMap<Integer, String[]> map) {
        int uint8 = streamReader.readUint8();
        TokenPattern[] tokenPatternArr = new TokenPattern[uint8];
        for (int i = 0; i < uint8; i++) {
            int uint9 = streamReader.readUint8();
            int i2 = uint9 & 3;
            int i3 = (uint9 >> 2) & 7;
            boolean z = (uint9 & 32) != 0;
            boolean z2 = (uint9 & 64) != 0;
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

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, int i) {
        return tokenize(str, tokenPatternArr, null, i);
    }

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, TokenPattern tokenPattern, int i) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAfter(linkedList.head, new StringToken(str));
        matchGrammar(str, linkedList, flatRest(tokenPatternArr), linkedList.head, 0, null, tokenPattern, i);
        return linkedList;
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

        public int length() {
            String str = this.string;
            return str != null ? str.length() : this.insideLength;
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
    }
}
