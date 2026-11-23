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
public abstract class j6 {
    public static final HashMap f24920a = new HashMap();
    public static final int f24921b;
    public static final int f24922c;
    public static final Paint d;
    public static final int[] f24923e;
    public static final Bitmap[][] f24924f;
    public static final boolean[][] f24925g;
    public static final HashMap h;
    public static final ArrayList f24926i;
    public static final HashMap f24927j;
    public static boolean f24928k;
    public static final j2 f24929l;
    public static float f24930m;
    public static boolean f24931n;
    public static final String[] f24932o;

    static {
        float f10;
        String[][] strArr = k6.f25092i;
        f24923e = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        f24924f = new Bitmap[8];
        f24925g = new boolean[8];
        h = new HashMap();
        f24926i = new ArrayList();
        f24927j = new HashMap();
        f24929l = new j2(2);
        f24931n = true;
        f24932o = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        f24921b = g0.L(20.0f);
        if (g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 34.0f;
        }
        f24922c = g0.L(f10);
        int i7 = 0;
        while (true) {
            Bitmap[][] bitmapArr = f24924f;
            if (i7 >= bitmapArr.length) {
                break;
            }
            int i10 = f24923e[i7];
            bitmapArr[i7] = new Bitmap[i10];
            f24925g[i7] = new boolean[i10];
            i7++;
        }
        int i11 = 0;
        while (true) {
            char[] cArr = k6.f25086a;
            if (i11 < 8) {
                int i12 = 0;
                while (true) {
                    String[] strArr2 = k6.f25092i[i11];
                    if (i12 < strArr2.length) {
                        HashMap hashMap = f24920a;
                        String str = strArr2[i12];
                        ?? obj = new Object();
                        obj.f23766a = (byte) i11;
                        obj.f23767b = (short) i12;
                        hashMap.put(str, obj);
                        i12++;
                    }
                }
                i11++;
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
            ArrayList arrayList = f24926i;
            hashMap.remove((String) i5.c.h(1, arrayList));
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
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 55356 && charAt <= 55358) {
                if (charAt == 55356 && i7 < length - 1) {
                    int i10 = i7 + 1;
                    char charAt2 = str.charAt(i10);
                    if (charAt2 != 56879 && charAt2 != 56324 && charAt2 != 56858 && charAt2 != 56703) {
                        i7 = i10;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        i7 += 2;
                        sb2.append(str.substring(0, i7));
                        sb2.append("️");
                        sb2.append(str.substring(i7));
                        str = sb2.toString();
                        length++;
                    }
                } else {
                    i7++;
                }
            } else if (charAt == 8419) {
                return str;
            } else {
                if (charAt >= 8252 && charAt <= 12953 && k6.f25093j.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb3 = new StringBuilder();
                    i7++;
                    sb3.append(str.substring(0, i7));
                    sb3.append("️");
                    sb3.append(str.substring(i7));
                    str = sb3.toString();
                    length++;
                }
            }
            i7++;
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

    public static e6 e(CharSequence charSequence) {
        CharSequence charSequence2;
        if (b(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap hashMap = f24920a;
        e6 e6Var = (e6) hashMap.get(charSequence);
        if (e6Var == null && (charSequence2 = (CharSequence) k6.f25097n.get(charSequence)) != null) {
            return (e6) hashMap.get(charSequence2);
        }
        return e6Var;
    }

    public static f6 f(String str) {
        CharSequence charSequence;
        f6 a10 = j4.a(str, null, null);
        if (a10 != null) {
            int i7 = f24921b;
            a10.setBounds(0, 0, i7, i7);
        } else {
            a10 = null;
        }
        if (a10 == null) {
            a10 = g(str);
        }
        if (a10 == null && (charSequence = (CharSequence) k6.f25097n.get(str)) != null) {
            a10 = g(charSequence);
        }
        if (a10 == null) {
            return null;
        }
        int i10 = f24922c;
        a10.setBounds(0, 0, i10, i10);
        a10.f23959a = true;
        return a10;
    }

    public static f6 g(CharSequence charSequence) {
        h4 a10;
        e6 e10 = e(charSequence);
        int i7 = f24921b;
        if (e10 == null) {
            if (charSequence == null || (a10 = j4.a(charSequence.toString(), null, null)) == null) {
                return null;
            }
            a10.setBounds(0, 0, i7, i7);
            return a10;
        }
        boolean b10 = b(charSequence);
        ?? f6Var = new f6();
        f6Var.f24709c = e10;
        f6Var.d = b10;
        f6Var.setBounds(0, 0, i7, i7);
        return f6Var;
    }

    public static boolean h(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap hashMap = f24920a;
        e6 e6Var = (e6) hashMap.get(charSequence);
        if (e6Var == null && (charSequence2 = (CharSequence) k6.f25097n.get(charSequence)) != null) {
            e6Var = (e6) hashMap.get(charSequence2);
        }
        if (e6Var == null) {
            return false;
        }
        return true;
    }

    public static void i(final byte b10, final short s5) {
        if (f24924f[b10][s5] == null) {
            boolean[] zArr = f24925g[b10];
            if (!zArr[s5]) {
                zArr[s5] = true;
                Utilities.f22877e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        byte b11 = b10;
                        short s9 = s5;
                        try {
                            bitmap = l6.f25448a.h(b11, s9);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            j6.f24924f[b11][s9] = bitmap;
                            j2 j2Var = j6.f24929l;
                            g0.r(j2Var);
                            g0.g3(j2Var);
                        }
                        j6.f24925g[b11][s9] = false;
                    }
                });
            }
        }
    }

    public static java.util.ArrayList j(java.lang.CharSequence r27, int[] r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.j6.j(java.lang.CharSequence, int[]):java.util.ArrayList");
    }

    public static void k(CharSequence charSequence) {
        e6 e10 = e(charSequence);
        if (e10 != null) {
            i(e10.f23766a, e10.f23767b);
        }
    }

    public static CharSequence l(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return m(charSequence, fontMetricsInt, z10, null, 0);
    }

    public static CharSequence m(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i7) {
        return n(charSequence, fontMetricsInt, z10, iArr, i7, 1.0f, 0);
    }

    public static CharSequence n(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i7, float f10, int i10) {
        Spannable newSpannable;
        int i11;
        String charSequence2;
        if (!bz.U0 && charSequence != null && charSequence.length() != 0) {
            if (!z10 && (charSequence instanceof Spannable)) {
                newSpannable = (Spannable) charSequence;
            } else {
                newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
            }
            ArrayList j3 = j(newSpannable, iArr);
            if (j3.isEmpty()) {
                return charSequence;
            }
            org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.x5.class);
            org.telegram.ui.Components.kq[] kqVarArr = (org.telegram.ui.Components.kq[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.kq.class);
            if (bz.o() >= 2) {
                i11 = 100;
            } else {
                i11 = 50;
            }
            int i12 = i11 - i10;
            for (int i13 = 0; i13 < j3.size(); i13++) {
                try {
                    h6 h6Var = (h6) j3.get(i13);
                    if (x5VarArr != null && x5VarArr.length > 0) {
                        for (org.telegram.ui.Components.x5 x5Var : x5VarArr) {
                            if (x5Var == null || newSpannable.getSpanStart(x5Var) != h6Var.f24487a || newSpannable.getSpanEnd(x5Var) != h6Var.f24488b) {
                            }
                        }
                    }
                    if (kqVarArr != null && kqVarArr.length > 0) {
                        for (org.telegram.ui.Components.kq kqVar : kqVarArr) {
                            if (kqVar == null || newSpannable.getSpanStart(kqVar) != h6Var.f24487a || newSpannable.getSpanEnd(kqVar) != h6Var.f24488b) {
                            }
                        }
                    }
                    f6 g10 = g(h6Var.f24489c);
                    if (g10 != null) {
                        ?? imageSpan = new ImageSpan(g10, i7);
                        imageSpan.f24275b = 1.0f;
                        imageSpan.f24276c = g0.L(20.0f);
                        imageSpan.f24274a = fontMetricsInt;
                        if (fontMetricsInt != null) {
                            int abs = Math.abs(imageSpan.f24274a.ascent) + Math.abs(fontMetricsInt.descent);
                            imageSpan.f24276c = abs;
                            if (abs == 0) {
                                imageSpan.f24276c = g0.L(20.0f);
                            }
                        }
                        CharSequence charSequence3 = h6Var.f24489c;
                        if (charSequence3 == null) {
                            charSequence2 = null;
                        } else {
                            charSequence2 = charSequence3.toString();
                        }
                        imageSpan.d = charSequence2;
                        imageSpan.f24275b = f10;
                        newSpannable.setSpan(imageSpan, h6Var.f24487a, h6Var.f24488b, 33);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (Build.VERSION.SDK_INT >= 29 && i13 + 1 >= i12) {
                    break;
                }
            }
            return newSpannable;
        }
        return charSequence;
    }

    public static CharSequence o(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i7, Runnable runnable) {
        a4 a4Var;
        Spannable newSpannable;
        int i10;
        h6 h6Var;
        TLRPC.Document document;
        org.telegram.ui.Components.x5 x5Var;
        if (bz.U0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i11 = i10.f24637t0;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        ri d02 = ri.d0(i11);
        if (runnable == null) {
            a4Var = null;
        } else {
            a4Var = new a4(runnable, 1);
        }
        TLRPC.TL_messages_stickerSet n02 = d02.n0(tL_inputStickerSetShortName, 0, false, true, a4Var);
        if (charSequence instanceof Spannable) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList j3 = j(newSpannable, null);
        if (j3.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.x5.class);
        if (bz.o() >= 2) {
            i10 = 100;
        } else {
            i10 = 50;
        }
        int i12 = i10;
        for (int i13 = 0; i13 < j3.size(); i13++) {
            try {
                h6Var = (h6) j3.get(i13);
                if (x5VarArr != null) {
                    for (org.telegram.ui.Components.x5 x5Var2 : x5VarArr) {
                        if (x5Var2 == null || newSpannable.getSpanStart(x5Var2) != h6Var.f24487a || newSpannable.getSpanEnd(x5Var2) != h6Var.f24488b) {
                        }
                    }
                }
                if (n02 != null) {
                    ArrayList<TLRPC.Document> arrayList = n02.documents;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TLRPC.Document document2 = arrayList.get(i14);
                        i14++;
                        document = document2;
                        if (fj.V(document, null, null).contains(h6Var.f24489c)) {
                            break;
                        }
                    }
                }
                document = null;
                if (document != null) {
                    x5Var = new org.telegram.ui.Components.x5(document, fontMetricsInt);
                } else {
                    x5Var = new org.telegram.ui.Components.x5(0L, fontMetricsInt);
                }
                x5Var.emoji = h6Var.f24489c.toString();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                x5Var.cacheType = i7;
                newSpannable.setSpan(x5Var, h6Var.f24487a, h6Var.f24488b, 33);
            } catch (Exception e11) {
                e = e11;
                a8.g(e, true);
                if (Build.VERSION.SDK_INT >= 29) {
                    break;
                    return newSpannable;
                }
                continue;
            }
            if (Build.VERSION.SDK_INT >= 29 && i13 + 1 >= i12) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence p(CharSequence charSequence, TextView textView, Runnable runnable) {
        return o(charSequence, textView.getPaint().getFontMetricsInt(), 20, runnable);
    }

    public static void q() {
        SharedPreferences f12 = mp.f1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : f24927j.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append((String) entry.getValue());
        }
        f12.edit().putString("color", sb2.toString()).commit();
    }

    public static void r() {
        SharedPreferences f12 = mp.f1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : h.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        f12.edit().putString("emojis2", sb2.toString()).commit();
    }

    public static void s() {
        ArrayList arrayList = f24926i;
        arrayList.clear();
        for (Map.Entry entry : h.entrySet()) {
            arrayList.add((String) entry.getKey());
        }
        Collections.sort(arrayList, new jg.w(14));
        while (arrayList.size() > 48) {
            a8.p0.z(1, arrayList);
        }
    }
}
