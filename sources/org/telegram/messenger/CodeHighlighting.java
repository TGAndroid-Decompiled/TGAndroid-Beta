package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import j$.util.concurrent.ConcurrentHashMap;
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
import org.telegram.ui.Components.vz0;
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

        public CachedPattern(String str, int i9) {
            this.patternSource = str;
            this.patternSourceFlags = i9;
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

        public CachedToSpan(int i9, int i10, int i11) {
            this.group = i9;
            this.start = i10;
            this.end = i11;
        }
    }

    public static class ColorSpan extends CharacterStyle {
        public int group;

        public ColorSpan(int i9) {
            this.group = i9;
        }

        public int getColorKey() {
            switch (this.group) {
                case 1:
                    return org.telegram.ui.ActionBar.f6.Ik;
                case 2:
                    return org.telegram.ui.ActionBar.f6.Jk;
                case 3:
                    return org.telegram.ui.ActionBar.f6.Kk;
                case 4:
                    return org.telegram.ui.ActionBar.f6.Lk;
                case 5:
                    return org.telegram.ui.ActionBar.f6.Mk;
                case 6:
                    return org.telegram.ui.ActionBar.f6.Nk;
                case 7:
                    return org.telegram.ui.ActionBar.f6.Ok;
                default:
                    return -1;
            }
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, getColorKey(), false));
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
        public Node tail;
        public int length = 0;
        public Node head = new Node();

        public LinkedList() {
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

        public void removeRange(Node node, int i9) {
            Node node2 = node.next;
            int i10 = 0;
            while (i10 < i9 && node2 != this.tail) {
                node2 = node2.next;
                i10++;
            }
            node.next = node2;
            node2.prev = node;
            this.length -= i10;
        }

        public StringToken[] toArray() {
            StringToken[] stringTokenArr = new StringToken[this.length];
            Node node = this.head.next;
            for (int i9 = 0; i9 < this.length && node != this.tail; i9++) {
                stringTokenArr[i9] = node.value;
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
            if (!this.ready) {
                return -1;
            }
            return super.getSpanEnd(obj);
        }

        @Override
        public int getSpanFlags(Object obj) {
            if (!this.ready) {
                return 0;
            }
            return super.getSpanFlags(obj);
        }

        @Override
        public int getSpanStart(Object obj) {
            if (!this.ready) {
                return -1;
            }
            return super.getSpanStart(obj);
        }

        @Override
        public <T> T[] getSpans(int i9, int i10, Class<T> cls) {
            if (!this.ready) {
                return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
            }
            return (T[]) super.getSpans(i9, i10, cls);
        }

        @Override
        public int nextSpanTransition(int i9, int i10, Class cls) {
            if (!this.ready) {
                return i10;
            }
            return super.nextSpanTransition(i9, i10, cls);
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
            if (!this.ready && (spannableStringBuilder = this.fallback) != null) {
                return spannableStringBuilder.getSpanEnd(obj);
            }
            return super.getSpanEnd(obj);
        }

        @Override
        public int getSpanFlags(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            if (!this.ready && (spannableStringBuilder = this.fallback) != null) {
                return spannableStringBuilder.getSpanFlags(obj);
            }
            return super.getSpanFlags(obj);
        }

        @Override
        public int getSpanStart(Object obj) {
            SpannableStringBuilder spannableStringBuilder;
            if (!this.ready && (spannableStringBuilder = this.fallback) != null) {
                return spannableStringBuilder.getSpanStart(obj);
            }
            return super.getSpanStart(obj);
        }

        @Override
        public <T> T[] getSpans(int i9, int i10, Class<T> cls) {
            SpannableStringBuilder spannableStringBuilder;
            if (!this.ready && (spannableStringBuilder = this.fallback) != null) {
                return (T[]) spannableStringBuilder.getSpans(i9, i10, cls);
            }
            return (T[]) super.getSpans(i9, i10, cls);
        }

        @Override
        public int nextSpanTransition(int i9, int i10, Class cls) {
            SpannableStringBuilder spannableStringBuilder;
            if (!this.ready && (spannableStringBuilder = this.fallback) != null) {
                return spannableStringBuilder.nextSpanTransition(i9, i10, cls);
            }
            return super.nextSpanTransition(i9, i10, cls);
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
            int i9;
            int i10 = 0;
            if (this.multiline) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            if (this.caseInsensitive) {
                i10 = 2;
            }
            return i9 | i10;
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
        public final vz0 style;

        public Span(boolean z10, int i9, vz0 vz0Var, String str, String str2) {
            int length;
            this.smallerSize = z10;
            this.lng = str;
            this.code = str2;
            if (str2 == null) {
                length = 0;
            } else {
                length = str2.length();
            }
            this.decrementSize = CodeHighlighting.getTextSizeDecrement(length);
            this.currentType = i9;
            this.style = vz0Var;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            if (this.smallerSize) {
                textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.decrementSize));
            }
            int i9 = this.currentType;
            if (i9 == 2) {
                textPaint.setColor(-1);
            } else if (i9 == 1) {
                textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.fc, false));
            } else {
                textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ec, false));
            }
            vz0 vz0Var = this.style;
            if (vz0Var != null) {
                vz0Var.a(textPaint);
                return;
            }
            textPaint.setTypeface(Typeface.MONOSPACE);
            textPaint.setUnderlineText(false);
        }
    }

    public static class StreamReader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        public String readString() {
            int read = this.is.read();
            if (read >= 254) {
                read = this.is.read() | (this.is.read() << 8) | (this.is.read() << 16);
            }
            byte[] bArr = new byte[read];
            for (int i9 = 0; i9 < read; i9++) {
                bArr[i9] = (byte) this.is.read();
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

    public static void a(LockedSpannableString lockedSpannableString) {
        lambda$highlight$3(lockedSpannableString);
    }

    public static void c(Spannable spannable, int i9, int i10, String str) {
        lambda$highlight$5(spannable, i9, i10, str);
    }

    private static void colorize(Spannable spannable, int i9, int i10, StringToken[] stringTokenArr, int i11, ArrayList<CachedToSpan> arrayList) {
        Spannable spannable2;
        ArrayList<CachedToSpan> arrayList2;
        if (stringTokenArr != null) {
            int i12 = 0;
            int i13 = i9;
            while (i12 < stringTokenArr.length && i13 < i10) {
                StringToken stringToken = stringTokenArr[i12];
                if (stringToken != null) {
                    if (stringToken.string != null) {
                        int i14 = stringToken.group;
                        if (i11 != -1) {
                            i14 = i11;
                        }
                        if (i14 == -1) {
                            i13 += stringToken.length();
                        } else {
                            arrayList.add(new CachedToSpan(i14, i13, stringToken.length() + i13));
                        }
                    } else if (stringToken.inside != null) {
                        spannable2 = spannable;
                        arrayList2 = arrayList;
                        colorize(spannable2, i13, i13 + stringToken.length(), stringToken.inside.toArray(), stringToken.group, arrayList2);
                        i13 += stringToken.length();
                        i12++;
                        spannable = spannable2;
                        arrayList = arrayList2;
                    }
                    spannable2 = spannable;
                    arrayList2 = arrayList;
                    i13 += stringToken.length();
                    i12++;
                    spannable = spannable2;
                    arrayList = arrayList2;
                }
                spannable2 = spannable;
                arrayList2 = arrayList;
                i12++;
                spannable = spannable2;
                arrayList = arrayList2;
            }
        }
    }

    public static void f() {
        lambda$prepare$2();
    }

    private static TokenPattern[] flatRest(TokenPattern[] tokenPatternArr) {
        HashMap<String, TokenPattern[]> hashMap;
        TokenPattern[] tokenPatternArr2;
        ArrayList arrayList = null;
        if (tokenPatternArr == null) {
            return null;
        }
        for (int i9 = 0; i9 < tokenPatternArr.length; i9++) {
            CachedPattern cachedPattern = tokenPatternArr[i9].pattern;
            if (cachedPattern != null && "REST".equals(cachedPattern.patternSource)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Collections.addAll(arrayList, tokenPatternArr);
                }
                arrayList.remove(tokenPatternArr[i9]);
                if (!TextUtils.isEmpty(tokenPatternArr[i9].insideLanguage) && (hashMap = compiledPatterns) != null && (tokenPatternArr2 = hashMap.get(tokenPatternArr[i9].insideLanguage)) != null) {
                    Collections.addAll(arrayList, tokenPatternArr2);
                }
            }
        }
        if (arrayList != null) {
            return (TokenPattern[]) arrayList.toArray(new TokenPattern[0]);
        }
        return tokenPatternArr;
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

    public static int getTextSizeDecrement(int i9) {
        if (i9 > 120) {
            return 5;
        }
        if (i9 > 50) {
            return 3;
        }
        return 2;
    }

    public static void highlight(Spannable spannable, int i9, int i10, String str, int i11, vz0 vz0Var, boolean z10) {
        if (spannable == null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new w4(spannable, i9, i10, str, 1));
    }

    public static void highlightEditable(CharSequence charSequence, String str, Utilities.Callback<SpannableString> callback) {
        if (callback == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (!TextUtils.isEmpty(str) && spannableString.length() != 0) {
            Utilities.searchQueue.postRunnable(new gk(spannableString.toString(), str, spannableString, callback, 4));
            return;
        }
        callback.run(spannableString);
    }

    public static void lambda$highlight$3(Spannable spannable) {
        ((LockedSpannableString) spannable).unlock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static void lambda$highlight$4(ArrayList arrayList, Spannable spannable) {
        long currentTimeMillis = System.currentTimeMillis();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i9);
            spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static void lambda$highlight$5(Spannable spannable, int i9, int i10, String str) {
        TokenPattern[] tokenPatternArr;
        if (compiledPatterns == null) {
            parse();
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringToken[][] stringTokenArr = new StringToken[1];
        try {
            String charSequence = spannable.subSequence(i9, i10).toString();
            HashMap<String, TokenPattern[]> hashMap = compiledPatterns;
            if (hashMap == null) {
                tokenPatternArr = null;
            } else {
                tokenPatternArr = hashMap.get(str);
            }
            stringTokenArr[0] = tokenize(charSequence, tokenPatternArr, 0).toArray();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        FileLog.d("[CodeHighlighter] tokenize took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        colorize(spannable, i9, i10, stringTokenArr[0], -1, arrayList);
        FileLog.d("[CodeHighlighter] colorize took " + (System.currentTimeMillis() - currentTimeMillis2) + "ms");
        if (!arrayList.isEmpty()) {
            if (spannable instanceof LockedSpannableString) {
                long currentTimeMillis3 = System.currentTimeMillis();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i11);
                    spannable.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
                }
                FileLog.d("[CodeHighlighter] applying " + arrayList.size() + " colorize spans took " + (System.currentTimeMillis() - currentTimeMillis3) + "ms in another thread");
                AndroidUtilities.runOnUIThread(new e1((LockedSpannableString) spannable, 15));
                return;
            }
            AndroidUtilities.runOnUIThread(new c3(21, arrayList, spannable));
        }
    }

    public static void lambda$highlightEditable$0(ArrayList arrayList, SpannableString spannableString, Utilities.Callback callback) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            CachedToSpan cachedToSpan = (CachedToSpan) arrayList.get(i9);
            spannableString.setSpan(new ColorSpan(cachedToSpan.group), cachedToSpan.start, cachedToSpan.end, 33);
        }
        callback.run(spannableString);
    }

    public static void lambda$highlightEditable$1(String str, String str2, SpannableString spannableString, Utilities.Callback callback) {
        SpannableString spannableString2;
        TokenPattern[] tokenPatternArr;
        if (compiledPatterns == null) {
            parse();
        }
        ArrayList arrayList = new ArrayList();
        try {
            HashMap<String, TokenPattern[]> hashMap = compiledPatterns;
            if (hashMap == null) {
                tokenPatternArr = null;
            } else {
                tokenPatternArr = hashMap.get(str2);
            }
            spannableString2 = spannableString;
        } catch (Exception e10) {
            e = e10;
            spannableString2 = spannableString;
        }
        try {
            colorize(spannableString2, 0, spannableString.length(), tokenize(str, tokenPatternArr, 0).toArray(), -1, arrayList);
        } catch (Exception e11) {
            e = e11;
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new f0(arrayList, (Object) spannableString2, (Object) callback, 12));
        }
        AndroidUtilities.runOnUIThread(new f0(arrayList, (Object) spannableString2, (Object) callback, 12));
    }

    public static void lambda$prepare$2() {
        if (compiledPatterns == null) {
            parse();
        }
    }

    private static void matchGrammar(java.lang.String r17, org.telegram.messenger.CodeHighlighting.LinkedList r18, org.telegram.messenger.CodeHighlighting.TokenPattern[] r19, org.telegram.messenger.CodeHighlighting.Node r20, int r21, org.telegram.messenger.CodeHighlighting.RematchOptions r22, org.telegram.messenger.CodeHighlighting.TokenPattern r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.CodeHighlighting.matchGrammar(java.lang.String, org.telegram.messenger.CodeHighlighting$LinkedList, org.telegram.messenger.CodeHighlighting$TokenPattern[], org.telegram.messenger.CodeHighlighting$Node, int, org.telegram.messenger.CodeHighlighting$RematchOptions, org.telegram.messenger.CodeHighlighting$TokenPattern, int):void");
    }

    private static Match matchPattern(TokenPattern tokenPattern, int i9, String str) {
        try {
            Matcher matcher = tokenPattern.pattern.getPattern().matcher(str);
            matcher.region(i9, str.length());
            if (!matcher.find()) {
                return null;
            }
            Match match = new Match();
            match.index = matcher.start();
            if (tokenPattern.lookbehind && matcher.groupCount() >= 1) {
                match.index = (matcher.end(1) - matcher.start(1)) + match.index;
            }
            int end = matcher.end();
            int i10 = match.index;
            int i11 = end - i10;
            match.length = i11;
            match.string = str.substring(i10, i11 + i10);
            return match;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    private static void parse() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.CodeHighlighting.parse():void");
    }

    public static void prepare() {
        if (compiledPatterns != null) {
            return;
        }
        Utilities.searchQueue.postRunnable(new w1(7));
    }

    private static TokenPattern[] readTokens(StreamReader streamReader, ParsedPattern[] parsedPatternArr, HashMap<Integer, String[]> hashMap) {
        boolean z10;
        boolean z11;
        int readUint8 = streamReader.readUint8();
        TokenPattern[] tokenPatternArr = new TokenPattern[readUint8];
        for (int i9 = 0; i9 < readUint8; i9++) {
            int readUint82 = streamReader.readUint8();
            int i10 = readUint82 & 3;
            int i11 = (readUint82 >> 2) & 7;
            if ((readUint82 & 32) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((readUint82 & 64) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int readUint16 = streamReader.readUint16();
            if (i10 == 0) {
                tokenPatternArr[i9] = new TokenPattern(i11, parsedPatternArr[readUint16].getCachedPattern());
            } else if (i10 == 1) {
                if (i11 == 0) {
                    tokenPatternArr[i9] = new TokenPattern(parsedPatternArr[readUint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, hashMap));
                } else {
                    tokenPatternArr[i9] = new TokenPattern(i11, parsedPatternArr[readUint16].getCachedPattern(), readTokens(streamReader, parsedPatternArr, hashMap));
                }
            } else if (i10 == 2) {
                tokenPatternArr[i9] = new TokenPattern(parsedPatternArr[readUint16].getCachedPattern(), hashMap.get(Integer.valueOf(streamReader.readUint8()))[0]);
            }
            if (z10) {
                tokenPatternArr[i9].greedy = true;
            }
            if (z11) {
                tokenPatternArr[i9].lookbehind = true;
            }
        }
        return tokenPatternArr;
    }

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, int i9) {
        return tokenize(str, tokenPatternArr, null, i9);
    }

    private static LinkedList tokenize(String str, TokenPattern[] tokenPatternArr, TokenPattern tokenPattern, int i9) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAfter(linkedList.head, new StringToken(str));
        matchGrammar(str, linkedList, flatRest(tokenPatternArr), linkedList.head, 0, null, tokenPattern, i9);
        return linkedList;
    }

    public static class TokenPattern {
        public boolean greedy;
        public int group;
        public String insideLanguage;
        public TokenPattern[] insideTokenPatterns;
        public boolean lookbehind;
        public final CachedPattern pattern;

        public TokenPattern(int i9, CachedPattern cachedPattern) {
            this.pattern = cachedPattern;
            this.group = i9;
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

        public TokenPattern(int i9, CachedPattern cachedPattern, TokenPattern... tokenPatternArr) {
            this.group = i9;
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

        public StringToken(int i9, String str) {
            this.token = true;
            this.group = i9;
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

        public StringToken(int i9, LinkedList linkedList, int i10) {
            this.token = true;
            this.group = i9;
            this.string = null;
            this.inside = linkedList;
            this.insideLength = i10;
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
