package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public abstract class k6 {
    public static final HashMap f16530a = new HashMap();
    public static final int f16531b;
    public static final int f16532c;
    public static final Paint d;
    public static final int[] e;
    public static final Bitmap[][] f16533f;
    public static final boolean[][] f16534g;
    public static final HashMap h;
    public static final ArrayList f16535i;
    public static final HashMap f16536j;
    public static boolean f16537k;
    public static final ag.f3 f16538l;
    public static float f16539m;
    public static boolean f16540n;
    public static final String[] f16541o;

    static {
        float f7;
        String[][] strArr = l6.f16699i;
        e = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        f16533f = new Bitmap[8];
        f16534g = new boolean[8];
        h = new HashMap();
        f16535i = new ArrayList();
        f16536j = new HashMap();
        f16538l = new ag.f3(15);
        f16540n = true;
        f16541o = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        f16531b = i0.L(20.0f);
        if (i0.Q1()) {
            f7 = 40.0f;
        } else {
            f7 = 34.0f;
        }
        f16532c = i0.L(f7);
        int i10 = 0;
        while (true) {
            Bitmap[][] bitmapArr = f16533f;
            if (i10 >= bitmapArr.length) {
                break;
            }
            int i11 = e[i10];
            bitmapArr[i10] = new Bitmap[i11];
            f16534g[i10] = new boolean[i11];
            i10++;
        }
        int i12 = 0;
        while (true) {
            char[] cArr = l6.f16694a;
            if (i12 < 8) {
                int i13 = 0;
                while (true) {
                    String[] strArr2 = l6.f16699i[i12];
                    if (i13 < strArr2.length) {
                        HashMap hashMap = f16530a;
                        String str = strArr2[i13];
                        ?? obj = new Object();
                        obj.f15518a = (byte) i12;
                        obj.f15519b = (short) i13;
                        hashMap.put(str, obj);
                        i13++;
                    }
                }
                i12++;
            } else {
                Paint paint = new Paint();
                d = paint;
                paint.setColor(0);
                return;
            }
        }
    }

    public static void a(String str) {
        HashMap hashMap = h;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && hashMap.size() >= 48) {
            ArrayList arrayList = f16535i;
            hashMap.remove((String) i0.a.g(1, arrayList));
            arrayList.set(arrayList.size() - 1, str);
        }
        hashMap.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145) {
            return true;
        }
        return false;
    }

    public static String c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 55356 && charAt <= 55358) {
                if (charAt == 55356 && i10 < length - 1) {
                    int i11 = i10 + 1;
                    char charAt2 = str.charAt(i11);
                    if (charAt2 != 56879 && charAt2 != 56324 && charAt2 != 56858 && charAt2 != 56703) {
                        i10 = i11;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        i10 += 2;
                        sb2.append(str.substring(0, i10));
                        sb2.append("️");
                        sb2.append(str.substring(i10));
                        str = sb2.toString();
                        length++;
                    }
                } else {
                    i10++;
                }
            } else if (charAt == 8419) {
                return str;
            } else {
                if (charAt >= 8252 && charAt <= 12953 && l6.f16700j.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb3 = new StringBuilder();
                    i10++;
                    sb3.append(str.substring(0, i10));
                    sb3.append("️");
                    sb3.append(str.substring(i10));
                    str = sb3.toString();
                    length++;
                }
            }
            i10++;
        }
        return str;
    }

    public static boolean d(CharSequence charSequence) {
        int[] iArr = new int[1];
        j(charSequence, iArr);
        if (iArr[0] > 0) {
            return true;
        }
        return false;
    }

    public static f6 e(CharSequence charSequence) {
        CharSequence charSequence2;
        if (b(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap hashMap = f16530a;
        f6 f6Var = (f6) hashMap.get(charSequence);
        if (f6Var == null && (charSequence2 = (CharSequence) l6.f16704n.get(charSequence)) != null) {
            return (f6) hashMap.get(charSequence2);
        }
        return f6Var;
    }

    public static g6 f(String str) {
        CharSequence charSequence;
        g6 a2 = k4.a(str, null, null);
        if (a2 != null) {
            int i10 = f16531b;
            a2.setBounds(0, 0, i10, i10);
        } else {
            a2 = null;
        }
        if (a2 == null) {
            a2 = g(str);
        }
        if (a2 == null && (charSequence = (CharSequence) l6.f16704n.get(str)) != null) {
            a2 = g(charSequence);
        }
        if (a2 == null) {
            return null;
        }
        int i11 = f16532c;
        a2.setBounds(0, 0, i11, i11);
        a2.f15678a = true;
        return a2;
    }

    public static g6 g(CharSequence charSequence) {
        i4 a2;
        f6 e7 = e(charSequence);
        int i10 = f16531b;
        if (e7 == null) {
            if (charSequence == null || (a2 = k4.a(charSequence.toString(), null, null)) == null) {
                return null;
            }
            a2.setBounds(0, 0, i10, i10);
            return a2;
        }
        boolean b10 = b(charSequence);
        ?? g6Var = new g6();
        g6Var.f16224c = e7;
        g6Var.d = b10;
        g6Var.setBounds(0, 0, i10, i10);
        return g6Var;
    }

    public static boolean h(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap hashMap = f16530a;
        f6 f6Var = (f6) hashMap.get(charSequence);
        if (f6Var == null && (charSequence2 = (CharSequence) l6.f16704n.get(charSequence)) != null) {
            f6Var = (f6) hashMap.get(charSequence2);
        }
        if (f6Var == null) {
            return false;
        }
        return true;
    }

    public static void i(final byte b10, final short s10) {
        if (f16533f[b10][s10] == null) {
            boolean[] zArr = f16534g[b10];
            if (!zArr[s10]) {
                zArr[s10] = true;
                Utilities.e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        byte b11 = b10;
                        short s11 = s10;
                        try {
                            bitmap = m6.f16869a.h(b11, s11);
                        } catch (Exception e7) {
                            f8.g(e7, true);
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            k6.f16533f[b11][s11] = bitmap;
                            ag.f3 f3Var = k6.f16538l;
                            i0.r(f3Var);
                            i0.g3(f3Var);
                        }
                        k6.f16534g[b11][s11] = false;
                    }
                });
            }
        }
    }

    public static java.util.ArrayList j(java.lang.CharSequence r27, int[] r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.k6.j(java.lang.CharSequence, int[]):java.util.ArrayList");
    }

    public static void k(CharSequence charSequence) {
        f6 e7 = e(charSequence);
        if (e7 != null) {
            i(e7.f15518a, e7.f15519b);
        }
    }

    public static CharSequence l(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return m(charSequence, fontMetricsInt, z10, null, 0);
    }

    public static CharSequence m(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10) {
        return n(charSequence, fontMetricsInt, z10, iArr, i10, 1.0f, 0);
    }

    public static CharSequence n(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10, float f7, int i11) {
        Spannable newSpannable;
        int i12;
        String charSequence2;
        if (!tz.U0 && charSequence != null && charSequence.length() != 0) {
            if (!z10 && (charSequence instanceof Spannable)) {
                newSpannable = (Spannable) charSequence;
            } else {
                newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
            }
            ArrayList j10 = j(newSpannable, iArr);
            if (j10.isEmpty()) {
                return charSequence;
            }
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.o5.class);
            org.telegram.ui.Components.dq[] dqVarArr = (org.telegram.ui.Components.dq[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.dq.class);
            if (tz.o() >= 2) {
                i12 = 100;
            } else {
                i12 = 50;
            }
            int i13 = i12 - i11;
            for (int i14 = 0; i14 < j10.size(); i14++) {
                try {
                    i6 i6Var = (i6) j10.get(i14);
                    if (o5VarArr != null && o5VarArr.length > 0) {
                        for (org.telegram.ui.Components.o5 o5Var : o5VarArr) {
                            if (o5Var == null || newSpannable.getSpanStart(o5Var) != i6Var.f16080a || newSpannable.getSpanEnd(o5Var) != i6Var.f16081b) {
                            }
                        }
                    }
                    if (dqVarArr != null && dqVarArr.length > 0) {
                        for (org.telegram.ui.Components.dq dqVar : dqVarArr) {
                            if (dqVar == null || newSpannable.getSpanStart(dqVar) != i6Var.f16080a || newSpannable.getSpanEnd(dqVar) != i6Var.f16081b) {
                            }
                        }
                    }
                    g6 g10 = g(i6Var.f16082c);
                    if (g10 != null) {
                        ?? imageSpan = new ImageSpan(g10, i10);
                        imageSpan.f15839b = 1.0f;
                        imageSpan.f15840c = i0.L(20.0f);
                        imageSpan.f15838a = fontMetricsInt;
                        if (fontMetricsInt != null) {
                            int abs = Math.abs(imageSpan.f15838a.ascent) + Math.abs(fontMetricsInt.descent);
                            imageSpan.f15840c = abs;
                            if (abs == 0) {
                                imageSpan.f15840c = i0.L(20.0f);
                            }
                        }
                        CharSequence charSequence3 = i6Var.f16082c;
                        if (charSequence3 == null) {
                            charSequence2 = null;
                        } else {
                            charSequence2 = charSequence3.toString();
                        }
                        imageSpan.d = charSequence2;
                        imageSpan.f15839b = f7;
                        newSpannable.setSpan(imageSpan, i6Var.f16080a, i6Var.f16081b, 33);
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                if (Build.VERSION.SDK_INT >= 29 && i14 + 1 >= i13) {
                    break;
                }
            }
            return newSpannable;
        }
        return charSequence;
    }

    public static CharSequence o(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i10, Runnable runnable) {
        x3 x3Var;
        Spannable newSpannable;
        int i11;
        i6 i6Var;
        TLRPC.Document document;
        org.telegram.ui.Components.o5 o5Var;
        if (tz.U0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i12 = d20.f15147s0;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        ui b02 = ui.b0(i12);
        if (runnable == null) {
            x3Var = null;
        } else {
            x3Var = new x3(runnable, 1);
        }
        TLRPC.TL_messages_stickerSet l02 = b02.l0(tL_inputStickerSetShortName, 0, false, true, x3Var);
        if (charSequence instanceof Spannable) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList j10 = j(newSpannable, null);
        if (j10.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.o5.class);
        if (tz.o() >= 2) {
            i11 = 100;
        } else {
            i11 = 50;
        }
        int i13 = i11;
        for (int i14 = 0; i14 < j10.size(); i14++) {
            try {
                i6Var = (i6) j10.get(i14);
                if (o5VarArr != null) {
                    for (org.telegram.ui.Components.o5 o5Var2 : o5VarArr) {
                        if (o5Var2 == null || newSpannable.getSpanStart(o5Var2) != i6Var.f16080a || newSpannable.getSpanEnd(o5Var2) != i6Var.f16081b) {
                        }
                    }
                }
                if (l02 != null) {
                    ArrayList<TLRPC.Document> arrayList = l02.documents;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.Document document2 = arrayList.get(i15);
                        i15++;
                        document = document2;
                        if (jj.V(document, null, null).contains(i6Var.f16082c)) {
                            break;
                        }
                    }
                }
                document = null;
                if (document != null) {
                    o5Var = new org.telegram.ui.Components.o5(document, fontMetricsInt);
                } else {
                    o5Var = new org.telegram.ui.Components.o5(0L, fontMetricsInt);
                }
                o5Var.emoji = i6Var.f16082c.toString();
            } catch (Exception e7) {
                e = e7;
            }
            try {
                o5Var.cacheType = i10;
                newSpannable.setSpan(o5Var, i6Var.f16080a, i6Var.f16081b, 33);
            } catch (Exception e10) {
                e = e10;
                f8.g(e, true);
                if (Build.VERSION.SDK_INT >= 29) {
                    break;
                    return newSpannable;
                }
                continue;
            }
            if (Build.VERSION.SDK_INT >= 29 && i14 + 1 >= i13) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence p(CharSequence charSequence, TextView textView, Runnable runnable) {
        return o(charSequence, textView.getPaint().getFontMetricsInt(), 20, runnable);
    }

    public static void q() {
        SharedPreferences c12 = vp.c1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : f16536j.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append((String) entry.getValue());
        }
        c12.edit().putString("color", sb2.toString()).commit();
    }

    public static void r() {
        SharedPreferences c12 = vp.c1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : h.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        c12.edit().putString("emojis2", sb2.toString()).commit();
    }

    public static void s() {
        ArrayList arrayList = f16535i;
        arrayList.clear();
        for (Map.Entry entry : h.entrySet()) {
            arrayList.add((String) entry.getKey());
        }
        Collections.sort(arrayList, new a4.d(17));
        while (arrayList.size() > 48) {
            a1.g.x(1, arrayList);
        }
    }
}
