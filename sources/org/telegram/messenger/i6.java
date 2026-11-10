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
public abstract class i6 {
    public static final HashMap f23056a = new HashMap();
    public static final int f23057b;
    public static final int f23058c;
    public static final Paint d;
    public static final int[] f23059e;
    public static final Bitmap[][] f23060f;
    public static final boolean[][] f23061g;
    public static final HashMap h;
    public static final ArrayList f23062i;
    public static final HashMap f23063j;
    public static boolean f23064k;
    public static final ai.m0 f23065l;
    public static float f23066m;
    public static boolean f23067n;
    public static final String[] f23068o;

    static {
        float f10;
        String[][] strArr = j6.f23511i;
        f23059e = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        f23060f = new Bitmap[8];
        f23061g = new boolean[8];
        h = new HashMap();
        f23062i = new ArrayList();
        f23063j = new HashMap();
        f23065l = new ai.m0(26);
        f23067n = true;
        f23068o = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        f23057b = g0.L(20.0f);
        if (g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 34.0f;
        }
        f23058c = g0.L(f10);
        int i7 = 0;
        while (true) {
            Bitmap[][] bitmapArr = f23060f;
            if (i7 >= bitmapArr.length) {
                break;
            }
            int i10 = f23059e[i7];
            bitmapArr[i7] = new Bitmap[i10];
            f23061g[i7] = new boolean[i10];
            i7++;
        }
        int i11 = 0;
        while (true) {
            char[] cArr = j6.f23505a;
            if (i11 < 8) {
                int i12 = 0;
                while (true) {
                    String[] strArr2 = j6.f23511i[i11];
                    if (i12 < strArr2.length) {
                        HashMap hashMap = f23056a;
                        String str = strArr2[i12];
                        ?? obj = new Object();
                        obj.f22001a = (byte) i11;
                        obj.f22002b = (short) i12;
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
            ArrayList arrayList = f23062i;
            hashMap.remove((String) jg.g.i(1, arrayList));
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
                if (charAt >= 8252 && charAt <= 12953 && j6.f23512j.containsKey(Character.valueOf(charAt))) {
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

    public static d6 e(CharSequence charSequence) {
        CharSequence charSequence2;
        if (b(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap hashMap = f23056a;
        d6 d6Var = (d6) hashMap.get(charSequence);
        if (d6Var == null && (charSequence2 = (CharSequence) j6.f23516n.get(charSequence)) != null) {
            return (d6) hashMap.get(charSequence2);
        }
        return d6Var;
    }

    public static e6 f(String str) {
        CharSequence charSequence;
        e6 a10 = h4.a(str, null, null);
        if (a10 != null) {
            int i7 = f23057b;
            a10.setBounds(0, 0, i7, i7);
        } else {
            a10 = null;
        }
        if (a10 == null) {
            a10 = g(str);
        }
        if (a10 == null && (charSequence = (CharSequence) j6.f23516n.get(str)) != null) {
            a10 = g(charSequence);
        }
        if (a10 == null) {
            return null;
        }
        int i10 = f23058c;
        a10.setBounds(0, 0, i10, i10);
        a10.f22195a = true;
        return a10;
    }

    public static e6 g(CharSequence charSequence) {
        f4 a10;
        d6 e10 = e(charSequence);
        int i7 = f23057b;
        if (e10 == null) {
            if (charSequence == null || (a10 = h4.a(charSequence.toString(), null, null)) == null) {
                return null;
            }
            a10.setBounds(0, 0, i7, i7);
            return a10;
        }
        boolean b10 = b(charSequence);
        ?? e6Var = new e6();
        e6Var.f22850c = e10;
        e6Var.d = b10;
        e6Var.setBounds(0, 0, i7, i7);
        return e6Var;
    }

    public static boolean h(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap hashMap = f23056a;
        d6 d6Var = (d6) hashMap.get(charSequence);
        if (d6Var == null && (charSequence2 = (CharSequence) j6.f23516n.get(charSequence)) != null) {
            d6Var = (d6) hashMap.get(charSequence2);
        }
        if (d6Var == null) {
            return false;
        }
        return true;
    }

    public static void i(final byte b10, final short s5) {
        if (f23060f[b10][s5] == null) {
            boolean[] zArr = f23061g[b10];
            if (!zArr[s5]) {
                zArr[s5] = true;
                Utilities.f21341e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        byte b11 = b10;
                        short s9 = s5;
                        try {
                            bitmap = k6.f23663a.h(b11, s9);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            i6.f23060f[b11][s9] = bitmap;
                            ai.m0 m0Var = i6.f23065l;
                            g0.r(m0Var);
                            g0.h3(m0Var);
                        }
                        i6.f23061g[b11][s9] = false;
                    }
                });
            }
        }
    }

    public static java.util.ArrayList j(java.lang.CharSequence r27, int[] r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i6.j(java.lang.CharSequence, int[]):java.util.ArrayList");
    }

    public static void k(CharSequence charSequence) {
        d6 e10 = e(charSequence);
        if (e10 != null) {
            i(e10.f22001a, e10.f22002b);
        }
    }

    public static CharSequence l(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z9) {
        return m(charSequence, fontMetricsInt, z9, null, 0);
    }

    public static CharSequence m(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z9, int[] iArr, int i7) {
        return n(charSequence, fontMetricsInt, z9, iArr, i7, 1.0f, 0);
    }

    public static CharSequence n(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z9, int[] iArr, int i7, float f10, int i10) {
        Spannable newSpannable;
        int i11;
        String charSequence2;
        if (!iz.U0 && charSequence != null && charSequence.length() != 0) {
            if (!z9 && (charSequence instanceof Spannable)) {
                newSpannable = (Spannable) charSequence;
            } else {
                newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
            }
            ArrayList j3 = j(newSpannable, iArr);
            if (j3.isEmpty()) {
                return charSequence;
            }
            org.telegram.ui.Components.q5[] q5VarArr = (org.telegram.ui.Components.q5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.q5.class);
            org.telegram.ui.Components.wp[] wpVarArr = (org.telegram.ui.Components.wp[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.wp.class);
            if (iz.o() >= 2) {
                i11 = 100;
            } else {
                i11 = 50;
            }
            int i12 = i11 - i10;
            for (int i13 = 0; i13 < j3.size(); i13++) {
                try {
                    g6 g6Var = (g6) j3.get(i13);
                    if (q5VarArr != null && q5VarArr.length > 0) {
                        for (org.telegram.ui.Components.q5 q5Var : q5VarArr) {
                            if (q5Var == null || newSpannable.getSpanStart(q5Var) != g6Var.f22627a || newSpannable.getSpanEnd(q5Var) != g6Var.f22628b) {
                            }
                        }
                    }
                    if (wpVarArr != null && wpVarArr.length > 0) {
                        for (org.telegram.ui.Components.wp wpVar : wpVarArr) {
                            if (wpVar == null || newSpannable.getSpanStart(wpVar) != g6Var.f22627a || newSpannable.getSpanEnd(wpVar) != g6Var.f22628b) {
                            }
                        }
                    }
                    e6 g10 = g(g6Var.f22629c);
                    if (g10 != null) {
                        ?? imageSpan = new ImageSpan(g10, i7);
                        imageSpan.f22374b = 1.0f;
                        imageSpan.f22375c = g0.L(20.0f);
                        imageSpan.f22373a = fontMetricsInt;
                        if (fontMetricsInt != null) {
                            int abs = Math.abs(imageSpan.f22373a.ascent) + Math.abs(fontMetricsInt.descent);
                            imageSpan.f22375c = abs;
                            if (abs == 0) {
                                imageSpan.f22375c = g0.L(20.0f);
                            }
                        }
                        CharSequence charSequence3 = g6Var.f22629c;
                        if (charSequence3 == null) {
                            charSequence2 = null;
                        } else {
                            charSequence2 = charSequence3.toString();
                        }
                        imageSpan.d = charSequence2;
                        imageSpan.f22374b = f10;
                        newSpannable.setSpan(imageSpan, g6Var.f22627a, g6Var.f22628b, 33);
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
        u3 u3Var;
        Spannable newSpannable;
        int i10;
        g6 g6Var;
        TLRPC.Document document;
        org.telegram.ui.Components.q5 q5Var;
        if (iz.U0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i11 = p10.f24474s0;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        ui b02 = ui.b0(i11);
        if (runnable == null) {
            u3Var = null;
        } else {
            u3Var = new u3(runnable, 1);
        }
        TLRPC.TL_messages_stickerSet l02 = b02.l0(tL_inputStickerSetShortName, 0, false, true, u3Var);
        if (charSequence instanceof Spannable) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList j3 = j(newSpannable, null);
        if (j3.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.q5[] q5VarArr = (org.telegram.ui.Components.q5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.q5.class);
        if (iz.o() >= 2) {
            i10 = 100;
        } else {
            i10 = 50;
        }
        int i12 = i10;
        for (int i13 = 0; i13 < j3.size(); i13++) {
            try {
                g6Var = (g6) j3.get(i13);
                if (q5VarArr != null) {
                    for (org.telegram.ui.Components.q5 q5Var2 : q5VarArr) {
                        if (q5Var2 == null || newSpannable.getSpanStart(q5Var2) != g6Var.f22627a || newSpannable.getSpanEnd(q5Var2) != g6Var.f22628b) {
                        }
                    }
                }
                if (l02 != null) {
                    ArrayList<TLRPC.Document> arrayList = l02.documents;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TLRPC.Document document2 = arrayList.get(i14);
                        i14++;
                        document = document2;
                        if (ij.V(document, null, null).contains(g6Var.f22629c)) {
                            break;
                        }
                    }
                }
                document = null;
                if (document != null) {
                    q5Var = new org.telegram.ui.Components.q5(document, fontMetricsInt);
                } else {
                    q5Var = new org.telegram.ui.Components.q5(0L, fontMetricsInt);
                }
                q5Var.emoji = g6Var.f22629c.toString();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                q5Var.cacheType = i7;
                newSpannable.setSpan(q5Var, g6Var.f22627a, g6Var.f22628b, 33);
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
        SharedPreferences d12 = qp.d1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : f23063j.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append((String) entry.getValue());
        }
        d12.edit().putString("color", sb2.toString()).commit();
    }

    public static void r() {
        SharedPreferences d12 = qp.d1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : h.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        d12.edit().putString("emojis2", sb2.toString()).commit();
    }

    public static void s() {
        ArrayList arrayList = f23062i;
        arrayList.clear();
        for (Map.Entry entry : h.entrySet()) {
            arrayList.add((String) entry.getKey());
        }
        Collections.sort(arrayList, new jg.x(15));
        while (arrayList.size() > 48) {
            a8.p0.z(1, arrayList);
        }
    }
}
