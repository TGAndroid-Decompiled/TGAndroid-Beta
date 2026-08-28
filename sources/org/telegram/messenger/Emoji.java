package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
public class Emoji {
    private static final String[] DEFAULT_RECENT;
    private static final int MAX_RECENT_EMOJI_COUNT = 48;
    public static int bigImgSize;
    public static int drawImgSize;
    private static Bitmap[][] emojiBmp;
    public static final HashMap<String, String> emojiColor;
    private static final int[] emojiCounts;
    public static boolean emojiDrawingUseAlpha;
    public static float emojiDrawingYOffset;
    public static final HashMap<String, Integer> emojiUseHistory;
    public static final Runnable invalidateUiRunnable;
    private static boolean[][] loadingEmoji;
    public static Paint placeholderPaint;
    public static final ArrayList<String> recentEmoji;
    private static boolean recentEmojiLoaded;
    private static final HashMap<CharSequence, DrawableInfo> rects = new HashMap<>();
    private static boolean inited = false;

    public static class DrawableInfo {
        public int emojiIndex;
        public byte page;
        public short page2;

        public DrawableInfo(byte b10, short s10, int i9) {
            this.page = b10;
            this.page2 = s10;
            this.emojiIndex = i9;
        }
    }

    public static class EmojiSpanRange {
        public CharSequence code;
        public int end;
        public int start;

        public EmojiSpanRange(int i9, int i10, CharSequence charSequence) {
            this.start = i9;
            this.end = i10;
            this.code = charSequence;
        }
    }

    static {
        float f10;
        String[][] strArr = EmojiData.data;
        emojiCounts = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        emojiBmp = new Bitmap[8];
        loadingEmoji = new boolean[8];
        emojiUseHistory = new HashMap<>();
        recentEmoji = new ArrayList<>();
        emojiColor = new HashMap<>();
        invalidateUiRunnable = new w1(8);
        emojiDrawingUseAlpha = true;
        DEFAULT_RECENT = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        drawImgSize = AndroidUtilities.dp(20.0f);
        if (AndroidUtilities.isTablet()) {
            f10 = 40.0f;
        } else {
            f10 = 34.0f;
        }
        bigImgSize = AndroidUtilities.dp(f10);
        int i9 = 0;
        while (true) {
            Bitmap[][] bitmapArr = emojiBmp;
            if (i9 >= bitmapArr.length) {
                break;
            }
            int i10 = emojiCounts[i9];
            bitmapArr[i9] = new Bitmap[i10];
            loadingEmoji[i9] = new boolean[i10];
            i9++;
        }
        for (int i11 = 0; i11 < EmojiData.data.length; i11++) {
            int i12 = 0;
            while (true) {
                String[] strArr2 = EmojiData.data[i11];
                if (i12 < strArr2.length) {
                    rects.put(strArr2[i12], new DrawableInfo((byte) i11, (short) i12, i12));
                    i12++;
                }
            }
        }
        Paint paint = new Paint();
        placeholderPaint = paint;
        paint.setColor(0);
    }

    public static void addRecentEmoji(String str) {
        HashMap<String, Integer> hashMap = emojiUseHistory;
        Integer num = hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && hashMap.size() >= 48) {
            ArrayList<String> arrayList = recentEmoji;
            hashMap.remove((String) j3.r0.j(1, arrayList));
            arrayList.set(arrayList.size() - 1, str);
        }
        hashMap.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void clearRecentEmoji() {
        MessagesController.getGlobalEmojiSettings().edit().putBoolean("filled_default", true).commit();
        emojiUseHistory.clear();
        recentEmoji.clear();
        saveRecentEmoji();
    }

    public static boolean endsWithRightArrow(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145) {
            return true;
        }
        return false;
    }

    public static String fixEmoji(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt >= 55356 && charAt <= 55358) {
                if (charAt == 55356 && i9 < length - 1) {
                    int i10 = i9 + 1;
                    char charAt2 = str.charAt(i10);
                    if (charAt2 != 56879 && charAt2 != 56324 && charAt2 != 56858 && charAt2 != 56703) {
                        i9 = i10;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        i9 += 2;
                        sb2.append(str.substring(0, i9));
                        sb2.append("️");
                        sb2.append(str.substring(i9));
                        str = sb2.toString();
                        length++;
                    }
                } else {
                    i9++;
                }
            } else if (charAt == 8419) {
                return str;
            } else {
                if (charAt >= 8252 && charAt <= 12953 && EmojiData.emojiToFE0FMap.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb3 = new StringBuilder();
                    i9++;
                    sb3.append(str.substring(0, i9));
                    sb3.append("️");
                    sb3.append(str.substring(i9));
                    str = sb3.toString();
                    length++;
                }
            }
            i9++;
        }
        return str;
    }

    public static boolean fullyConsistsOfEmojis(CharSequence charSequence) {
        int[] iArr = new int[1];
        parseEmojis(charSequence, iArr);
        if (iArr[0] > 0) {
            return true;
        }
        return false;
    }

    private static DrawableInfo getDrawableInfo(CharSequence charSequence) {
        CharSequence charSequence2;
        if (endsWithRightArrow(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap<CharSequence, DrawableInfo> hashMap = rects;
        DrawableInfo drawableInfo = hashMap.get(charSequence);
        if (drawableInfo == null && (charSequence2 = EmojiData.emojiAliasMap.get(charSequence)) != null) {
            return hashMap.get(charSequence2);
        }
        return drawableInfo;
    }

    public static Drawable getEmojiBigDrawable(String str) {
        CharSequence charSequence;
        EmojiDrawable compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(str);
        if (compoundEmojiDrawable != null) {
            int i9 = drawImgSize;
            compoundEmojiDrawable.setBounds(0, 0, i9, i9);
        } else {
            compoundEmojiDrawable = null;
        }
        if (compoundEmojiDrawable == null) {
            compoundEmojiDrawable = getEmojiDrawable(str);
        }
        if (compoundEmojiDrawable == null && (charSequence = EmojiData.emojiAliasMap.get(str)) != null) {
            compoundEmojiDrawable = getEmojiDrawable(charSequence);
        }
        if (compoundEmojiDrawable == null) {
            return null;
        }
        int i10 = bigImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i10, i10);
        compoundEmojiDrawable.fullSize = true;
        return compoundEmojiDrawable;
    }

    public static EmojiDrawable getEmojiDrawable(CharSequence charSequence) {
        CompoundEmoji.CompoundEmojiDrawable compoundEmojiDrawable;
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo == null) {
            if (charSequence != null && (compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(charSequence.toString())) != null) {
                int i9 = drawImgSize;
                compoundEmojiDrawable.setBounds(0, 0, i9, i9);
                return compoundEmojiDrawable;
            }
            return null;
        }
        SimpleEmojiDrawable simpleEmojiDrawable = new SimpleEmojiDrawable(drawableInfo, endsWithRightArrow(charSequence));
        int i10 = drawImgSize;
        simpleEmojiDrawable.setBounds(0, 0, i10, i10);
        return simpleEmojiDrawable;
    }

    public static void invalidateAll(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                invalidateAll(viewGroup.getChildAt(i9));
            }
        } else if (view instanceof TextView) {
            view.invalidate();
        }
    }

    public static boolean isValidEmoji(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap<CharSequence, DrawableInfo> hashMap = rects;
        DrawableInfo drawableInfo = hashMap.get(charSequence);
        if (drawableInfo == null && (charSequence2 = EmojiData.emojiAliasMap.get(charSequence)) != null) {
            drawableInfo = hashMap.get(charSequence2);
        }
        if (drawableInfo == null) {
            return false;
        }
        return true;
    }

    public static void lambda$loadEmoji$1(byte r13, short r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.Emoji.lambda$loadEmoji$1(byte, short):void");
    }

    public static int lambda$sortEmoji$3(String str, String str2) {
        Integer num = 0;
        HashMap<String, Integer> hashMap = emojiUseHistory;
        Integer num2 = hashMap.get(str);
        Integer num3 = hashMap.get(str2);
        if (num2 == null) {
            num2 = num;
        }
        if (num3 != null) {
            num = num3;
        }
        if (num2.intValue() > num.intValue()) {
            return -1;
        }
        if (num2.intValue() >= num.intValue()) {
            return 0;
        }
        return 1;
    }

    public static void lambda$static$0() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static Bitmap loadBitmap(String str) {
        int i9;
        Bitmap bitmap;
        try {
            if (AndroidUtilities.density <= 1.0f) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            try {
                InputStream open = ApplicationLoader.applicationContext.getAssets().open(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = i9;
                bitmap = BitmapFactory.decodeStream(open, null, options);
                try {
                    open.close();
                    return bitmap;
                } catch (Throwable th) {
                    th = th;
                    FileLog.e(th);
                    return bitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap = null;
            }
        } catch (Throwable th3) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error loading emoji", th3);
            }
            return null;
        }
    }

    public static void loadEmoji(final byte b10, final short s10) {
        if (emojiBmp[b10][s10] == null) {
            boolean[] zArr = loadingEmoji[b10];
            if (!zArr[s10]) {
                zArr[s10] = true;
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        Emoji.lambda$loadEmoji$1(b10, s10);
                    }
                });
            }
        }
    }

    public static void loadRecentEmoji() {
        String string;
        if (!recentEmojiLoaded) {
            recentEmojiLoaded = true;
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            try {
                emojiUseHistory.clear();
                if (globalEmojiSettings.contains("emojis")) {
                    try {
                        String string2 = globalEmojiSettings.getString("emojis", "");
                        if (string2 != null && string2.length() > 0) {
                            for (String str : string2.split(",")) {
                                String[] split = str.split("=");
                                long longValue = Utilities.parseLong(split[0]).longValue();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i9 = 0; i9 < 4; i9++) {
                                    sb2.insert(0, (char) longValue);
                                    longValue >>= 16;
                                    if (longValue == 0) {
                                        break;
                                    }
                                }
                                if (sb2.length() > 0) {
                                    emojiUseHistory.put(sb2.toString(), Utilities.parseInt((CharSequence) split[1]));
                                }
                            }
                        }
                        globalEmojiSettings.edit().remove("emojis").commit();
                        saveRecentEmoji();
                    } catch (Exception e10) {
                        e = e10;
                        FileLog.e(e);
                        string = globalEmojiSettings.getString("color", "");
                        if (string == null) {
                        }
                        return;
                    }
                } else {
                    String string3 = globalEmojiSettings.getString("emojis2", "");
                    if (string3 != null && string3.length() > 0) {
                        for (String str2 : string3.split(",")) {
                            String[] split2 = str2.split("=");
                            emojiUseHistory.put(split2[0], Utilities.parseInt((CharSequence) split2[1]));
                        }
                    }
                }
                if (emojiUseHistory.isEmpty() && !globalEmojiSettings.getBoolean("filled_default", false)) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = DEFAULT_RECENT;
                        if (i10 >= strArr.length) {
                            break;
                        }
                        emojiUseHistory.put(strArr[i10], Integer.valueOf(strArr.length - i10));
                        i10++;
                    }
                    globalEmojiSettings.edit().putBoolean("filled_default", true).commit();
                    saveRecentEmoji();
                }
                sortEmoji();
            } catch (Exception e11) {
                e = e11;
            }
            try {
                string = globalEmojiSettings.getString("color", "");
                if (string == null && string.length() > 0) {
                    for (String str3 : string.split(",")) {
                        String[] split3 = str3.split("=");
                        emojiColor.put(split3[0], split3[1]);
                    }
                }
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
    }

    public static ArrayList<EmojiSpanRange> parseEmojis(CharSequence charSequence) {
        return parseEmojis(charSequence, null);
    }

    public static void preloadEmoji(CharSequence charSequence) {
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            loadEmoji(drawableInfo.page, drawableInfo.page2);
        }
    }

    public static void removeRecentEmoji(String str) {
        HashMap<String, Integer> hashMap = emojiUseHistory;
        hashMap.remove(str);
        ArrayList<String> arrayList = recentEmoji;
        arrayList.remove(str);
        if (!hashMap.isEmpty() && !arrayList.isEmpty()) {
            return;
        }
        addRecentEmoji(DEFAULT_RECENT[0]);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, (int[]) null);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, TextView textView, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, textView.getPaint().getFontMetricsInt(), runnable);
    }

    public static void saveEmojiColors() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : emojiColor.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append(entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("color", sb2.toString()).commit();
    }

    public static void saveRecentEmoji() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Integer> entry : emojiUseHistory.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append(entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("emojis2", sb2.toString()).commit();
    }

    public static void sortEmoji() {
        recentEmoji.clear();
        for (Map.Entry<String, Integer> entry : emojiUseHistory.entrySet()) {
            recentEmoji.add(entry.getKey());
        }
        Collections.sort(recentEmoji, new q(4));
        while (true) {
            ArrayList<String> arrayList = recentEmoji;
            if (arrayList.size() > 48) {
                aa.d.u(1, arrayList);
            } else {
                return;
            }
        }
    }

    public static class EmojiSpan extends ImageSpan {
        public boolean drawn;
        public String emoji;
        public Paint.FontMetricsInt fontMetrics;
        public float lastDrawX;
        public float lastDrawY;
        private int minimumLineHeight;
        private boolean preserveFontMetrics;
        public float scale;
        public int size;

        public EmojiSpan(Drawable drawable, int i9, Paint.FontMetricsInt fontMetricsInt) {
            super(drawable, i9);
            this.scale = 1.0f;
            this.size = AndroidUtilities.dp(20.0f);
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
                this.size = abs;
                if (abs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }

        private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i9) {
            int i10 = fontMetricsInt.descent;
            int i11 = fontMetricsInt.ascent;
            int i12 = i10 - i11;
            if (i9 <= i12) {
                return;
            }
            int i13 = i9 - i12;
            int i14 = (i13 + 1) / 2;
            int i15 = i11 - i14;
            fontMetricsInt.ascent = i15;
            fontMetricsInt.descent = i10 + (i13 - i14);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i15);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
            boolean z10;
            this.lastDrawX = aa.d.d(this.scale, this.size, 2.0f, f10);
            this.lastDrawY = ((i13 - i11) / 2.0f) + i11;
            boolean z11 = true;
            this.drawn = true;
            if (paint.getAlpha() != 255 && Emoji.emojiDrawingUseAlpha) {
                getDrawable().setAlpha(paint.getAlpha());
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = Emoji.emojiDrawingYOffset;
            int i14 = this.size;
            float f12 = f11 - ((i14 - (this.scale * i14)) / 2.0f);
            if (f12 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, f12);
            } else {
                z11 = false;
            }
            super.draw(canvas, charSequence, i9, i10, f10, i11, i12, i13, paint);
            if (z11) {
                canvas.restore();
            }
            if (z10) {
                getDrawable().setAlpha(255);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                EmojiSpan emojiSpan = (EmojiSpan) obj;
                if (Float.compare(this.scale, emojiSpan.scale) == 0 && this.size == emojiSpan.size && Objects.equals(this.emoji, emojiSpan.emoji)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
            boolean z10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
            if (this.preserveFontMetrics && fontMetricsInt2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = fontMetricsInt2.top;
            } else {
                i11 = 0;
            }
            if (z10) {
                i12 = fontMetricsInt2.ascent;
            } else {
                i12 = 0;
            }
            if (z10) {
                i13 = fontMetricsInt2.descent;
            } else {
                i13 = 0;
            }
            if (z10) {
                i14 = fontMetricsInt2.bottom;
            } else {
                i14 = 0;
            }
            if (z10) {
                i15 = fontMetricsInt2.leading;
            } else {
                i15 = 0;
            }
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
            int i16 = (int) (this.scale * this.size);
            Paint.FontMetricsInt fontMetricsInt4 = this.fontMetrics;
            if (fontMetricsInt4 == null) {
                int size = super.getSize(paint, charSequence, i9, i10, fontMetricsInt3);
                int dp = AndroidUtilities.dp(8.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int i17 = (-dp2) - dp;
                fontMetricsInt3.top = i17;
                int i18 = dp2 - dp;
                fontMetricsInt3.bottom = i18;
                fontMetricsInt3.ascent = i17;
                fontMetricsInt3.leading = 0;
                fontMetricsInt3.descent = i18;
                if (z10) {
                    fontMetricsInt3.top = i11;
                    fontMetricsInt3.ascent = i12;
                    fontMetricsInt3.descent = i13;
                    fontMetricsInt3.bottom = i14;
                    fontMetricsInt3.leading = i15;
                    expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
                }
                return size;
            }
            fontMetricsInt3.ascent = fontMetricsInt4.ascent;
            fontMetricsInt3.descent = fontMetricsInt4.descent;
            fontMetricsInt3.top = fontMetricsInt4.top;
            fontMetricsInt3.bottom = fontMetricsInt4.bottom;
            if (getDrawable() != null) {
                getDrawable().setBounds(0, 0, i16, i16);
            }
            if (z10) {
                fontMetricsInt3.top = i11;
                fontMetricsInt3.ascent = i12;
                fontMetricsInt3.descent = i13;
                fontMetricsInt3.bottom = i14;
                fontMetricsInt3.leading = i15;
                expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
            }
            return i16;
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i9) {
            this.fontMetrics = fontMetricsInt;
            this.size = i9;
        }

        public EmojiSpan setMinimumLineHeight(int i9) {
            this.minimumLineHeight = i9;
            return this;
        }

        public EmojiSpan setPreserveFontMetrics(boolean z10) {
            this.preserveFontMetrics = z10;
            return this;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            if (getDrawable() instanceof EmojiDrawable) {
                ((EmojiDrawable) getDrawable()).placeholderColor = 285212671 & textPaint.getColor();
            }
            super.updateDrawState(textPaint);
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
                this.size = abs;
                if (abs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }
    }

    public static java.util.ArrayList<org.telegram.messenger.Emoji.EmojiSpanRange> parseEmojis(java.lang.CharSequence r28, int[] r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.Emoji.parseEmojis(java.lang.CharSequence, int[]):java.util.ArrayList");
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, float f10) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, null, 0, f10, 0);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, fontMetricsInt, 20, runnable);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, iArr, 0);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i9, Runnable runnable) {
        Spannable newSpannable;
        int i10;
        EmojiSpanRange emojiSpanRange;
        TLRPC.Document document;
        org.telegram.ui.Components.t5 t5Var;
        int i11;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i12 = UserConfig.selectedAccount;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new a1(runnable, 1));
        if (charSequence instanceof Spannable) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList<EmojiSpanRange> parseEmojis = parseEmojis(newSpannable, null);
        if (parseEmojis.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.t5.class);
        int i13 = SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50;
        for (int i14 = 0; i14 < parseEmojis.size(); i14++) {
            try {
                emojiSpanRange = parseEmojis.get(i14);
                if (t5VarArr != null) {
                    while (i11 < t5VarArr.length) {
                        org.telegram.ui.Components.t5 t5Var2 = t5VarArr[i11];
                        i11 = (t5Var2 != null && newSpannable.getSpanStart(t5Var2) == emojiSpanRange.start && newSpannable.getSpanEnd(t5Var2) == emojiSpanRange.end) ? 0 : i11 + 1;
                    }
                }
                if (stickerSet != null) {
                    ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.Document document2 = arrayList.get(i15);
                        i15++;
                        document = document2;
                        if (MessageObject.findAnimatedEmojiEmoticon(document, null).contains(emojiSpanRange.code)) {
                            break;
                        }
                    }
                }
                document = null;
                if (document != null) {
                    t5Var = new org.telegram.ui.Components.t5(document, fontMetricsInt);
                } else {
                    t5Var = new org.telegram.ui.Components.t5(0L, fontMetricsInt);
                }
                t5Var.emoji = emojiSpanRange.code.toString();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                t5Var.cacheType = i9;
                newSpannable.setSpan(t5Var, emojiSpanRange.start, emojiSpanRange.end, 33);
            } catch (Exception e11) {
                e = e11;
                FileLog.e(e);
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                }
                break;
                return newSpannable;
            }
            i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 || i10 >= 29) && i14 + 1 >= i13) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i9) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, iArr, i9, 1.0f, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i9, float f10, int i10) {
        Spannable newSpannable;
        int i11;
        int i12;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        if (!z10 && (charSequence instanceof Spannable)) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
        }
        ArrayList<EmojiSpanRange> parseEmojis = parseEmojis(newSpannable, iArr);
        if (parseEmojis.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.t5.class);
        eq[] eqVarArr = (eq[]) newSpannable.getSpans(0, newSpannable.length(), eq.class);
        int i13 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i10;
        for (int i14 = 0; i14 < parseEmojis.size(); i14++) {
            try {
                EmojiSpanRange emojiSpanRange = parseEmojis.get(i14);
                if (t5VarArr != null && t5VarArr.length > 0) {
                    while (i12 < t5VarArr.length) {
                        org.telegram.ui.Components.t5 t5Var = t5VarArr[i12];
                        i12 = (t5Var != null && newSpannable.getSpanStart(t5Var) == emojiSpanRange.start && newSpannable.getSpanEnd(t5Var) == emojiSpanRange.end) ? 0 : i12 + 1;
                    }
                }
                if (eqVarArr != null && eqVarArr.length > 0) {
                    while (i11 < eqVarArr.length) {
                        eq eqVar = eqVarArr[i11];
                        i11 = (eqVar != null && newSpannable.getSpanStart(eqVar) == emojiSpanRange.start && newSpannable.getSpanEnd(eqVar) == emojiSpanRange.end) ? 0 : i11 + 1;
                    }
                }
                EmojiDrawable emojiDrawable = getEmojiDrawable(emojiSpanRange.code);
                if (emojiDrawable != null) {
                    EmojiSpan emojiSpan = new EmojiSpan(emojiDrawable, i9, fontMetricsInt);
                    CharSequence charSequence2 = emojiSpanRange.code;
                    emojiSpan.emoji = charSequence2 == null ? null : charSequence2.toString();
                    emojiSpan.scale = f10;
                    newSpannable.setSpan(emojiSpan, emojiSpanRange.start, emojiSpanRange.end, 33);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            int i15 = Build.VERSION.SDK_INT;
            if ((i15 < 23 || i15 >= 29) && i14 + 1 >= i13) {
                break;
            }
        }
        return newSpannable;
    }

    public static abstract class EmojiDrawable extends Drawable {
        public boolean fullSize = false;
        int placeholderColor = 268435456;

        public boolean isLoaded() {
            return false;
        }

        public void preload() {
        }
    }

    public static class SimpleEmojiDrawable extends EmojiDrawable {
        private static Paint paint = new Paint(2);
        private static Rect rect = new Rect();
        private DrawableInfo info;
        private boolean invert;

        public SimpleEmojiDrawable(DrawableInfo drawableInfo, boolean z10) {
            this.info = drawableInfo;
            this.invert = z10;
        }

        @Override
        public void draw(Canvas canvas) {
            Rect bounds;
            if (!isLoaded()) {
                DrawableInfo drawableInfo = this.info;
                Emoji.loadEmoji(drawableInfo.page, drawableInfo.page2);
                Emoji.placeholderPaint.setColor(this.placeholderColor);
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, Emoji.placeholderPaint);
                return;
            }
            if (this.fullSize) {
                bounds = getDrawRect();
            } else {
                bounds = getBounds();
            }
            if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
                if (this.invert) {
                    canvas.save();
                    canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
                }
                Bitmap[][] bitmapArr = Emoji.emojiBmp;
                DrawableInfo drawableInfo2 = this.info;
                canvas.drawBitmap(bitmapArr[drawableInfo2.page][drawableInfo2.page2], (Rect) null, bounds, paint);
                if (this.invert) {
                    canvas.restore();
                }
            }
        }

        public Rect getDrawRect() {
            int i9;
            int i10;
            int i11;
            int i12;
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            Rect rect2 = rect;
            boolean z10 = this.fullSize;
            if (z10) {
                i9 = Emoji.bigImgSize;
            } else {
                i9 = Emoji.drawImgSize;
            }
            rect2.left = centerX - (i9 / 2);
            Rect rect3 = rect;
            if (z10) {
                i10 = Emoji.bigImgSize;
            } else {
                i10 = Emoji.drawImgSize;
            }
            rect3.right = (i10 / 2) + centerX;
            Rect rect4 = rect;
            if (z10) {
                i11 = Emoji.bigImgSize;
            } else {
                i11 = Emoji.drawImgSize;
            }
            rect4.top = centerY - (i11 / 2);
            Rect rect5 = rect;
            if (z10) {
                i12 = Emoji.bigImgSize;
            } else {
                i12 = Emoji.drawImgSize;
            }
            rect5.bottom = (i12 / 2) + centerY;
            return rect;
        }

        public DrawableInfo getDrawableInfo() {
            return this.info;
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public boolean isLoaded() {
            Bitmap[][] bitmapArr = Emoji.emojiBmp;
            DrawableInfo drawableInfo = this.info;
            if (bitmapArr[drawableInfo.page][drawableInfo.page2] != null) {
                return true;
            }
            return false;
        }

        @Override
        public void preload() {
            if (!isLoaded()) {
                DrawableInfo drawableInfo = this.info;
                Emoji.loadEmoji(drawableInfo.page, drawableInfo.page2);
            }
        }

        @Override
        public void setAlpha(int i9) {
            paint.setAlpha(i9);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
