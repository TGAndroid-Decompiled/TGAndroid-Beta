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
    public static final HashMap f23446a = new HashMap();
    public static final int f23447b;
    public static final int f23448c;
    public static final Paint d;
    public static final int[] f23449e;
    public static final Bitmap[][] f23450f;
    public static final boolean[][] f23451g;
    public static final HashMap h;
    public static final ArrayList f23452i;
    public static final HashMap f23453j;
    public static boolean f23454k;
    public static final ai.y1 f23455l;
    public static float f23456m;
    public static boolean f23457n;
    public static final String[] f23458o;

    static {
        float f10;
        String[][] strArr = j6.f23646i;
        f23449e = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        f23450f = new Bitmap[8];
        f23451g = new boolean[8];
        h = new HashMap();
        f23452i = new ArrayList();
        f23453j = new HashMap();
        f23455l = new ai.y1(28);
        f23457n = true;
        f23458o = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        f23447b = g0.L(20.0f);
        if (g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 34.0f;
        }
        f23448c = g0.L(f10);
        int i3 = 0;
        while (true) {
            Bitmap[][] bitmapArr = f23450f;
            if (i3 >= bitmapArr.length) {
                break;
            }
            int i10 = f23449e[i3];
            bitmapArr[i3] = new Bitmap[i10];
            f23451g[i3] = new boolean[i10];
            i3++;
        }
        int i11 = 0;
        while (true) {
            char[] cArr = j6.f23640a;
            if (i11 < 8) {
                int i12 = 0;
                while (true) {
                    String[] strArr2 = j6.f23646i[i11];
                    if (i12 < strArr2.length) {
                        HashMap hashMap = f23446a;
                        String str = strArr2[i12];
                        ?? obj = new Object();
                        obj.f22158a = (byte) i11;
                        obj.f22159b = (short) i12;
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
            ArrayList arrayList = f23452i;
            hashMap.remove((String) k2.p1.h(1, arrayList));
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
        int i3 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt >= 55356 && charAt <= 55358) {
                if (charAt == 55356 && i3 < length - 1) {
                    int i10 = i3 + 1;
                    char charAt2 = str.charAt(i10);
                    if (charAt2 != 56879 && charAt2 != 56324 && charAt2 != 56858 && charAt2 != 56703) {
                        i3 = i10;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        i3 += 2;
                        sb2.append(str.substring(0, i3));
                        sb2.append("️");
                        sb2.append(str.substring(i3));
                        str = sb2.toString();
                        length++;
                    }
                } else {
                    i3++;
                }
            } else if (charAt == 8419) {
                return str;
            } else {
                if (charAt >= 8252 && charAt <= 12953 && j6.f23647j.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb3 = new StringBuilder();
                    i3++;
                    sb3.append(str.substring(0, i3));
                    sb3.append("️");
                    sb3.append(str.substring(i3));
                    str = sb3.toString();
                    length++;
                }
            }
            i3++;
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
        HashMap hashMap = f23446a;
        d6 d6Var = (d6) hashMap.get(charSequence);
        if (d6Var == null && (charSequence2 = (CharSequence) j6.f23651n.get(charSequence)) != null) {
            return (d6) hashMap.get(charSequence2);
        }
        return d6Var;
    }

    public static e6 f(String str) {
        CharSequence charSequence;
        e6 a10 = h4.a(str, null, null);
        if (a10 != null) {
            int i3 = f23447b;
            a10.setBounds(0, 0, i3, i3);
        } else {
            a10 = null;
        }
        if (a10 == null) {
            a10 = g(str);
        }
        if (a10 == null && (charSequence = (CharSequence) j6.f23651n.get(str)) != null) {
            a10 = g(charSequence);
        }
        if (a10 == null) {
            return null;
        }
        int i10 = f23448c;
        a10.setBounds(0, 0, i10, i10);
        a10.f22319a = true;
        return a10;
    }

    public static e6 g(CharSequence charSequence) {
        f4 a10;
        d6 e10 = e(charSequence);
        int i3 = f23447b;
        if (e10 == null) {
            if (charSequence == null || (a10 = h4.a(charSequence.toString(), null, null)) == null) {
                return null;
            }
            a10.setBounds(0, 0, i3, i3);
            return a10;
        }
        boolean b10 = b(charSequence);
        ?? e6Var = new e6();
        e6Var.f22889c = e10;
        e6Var.d = b10;
        e6Var.setBounds(0, 0, i3, i3);
        return e6Var;
    }

    public static boolean h(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap hashMap = f23446a;
        d6 d6Var = (d6) hashMap.get(charSequence);
        if (d6Var == null && (charSequence2 = (CharSequence) j6.f23651n.get(charSequence)) != null) {
            d6Var = (d6) hashMap.get(charSequence2);
        }
        if (d6Var == null) {
            return false;
        }
        return true;
    }

    public static void i(final byte b10, final short s6) {
        if (f23450f[b10][s6] == null) {
            boolean[] zArr = f23451g[b10];
            if (!zArr[s6]) {
                zArr[s6] = true;
                Utilities.f21387e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        byte b11 = b10;
                        short s10 = s6;
                        try {
                            bitmap = k6.f23798a.h(b11, s10);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            i6.f23450f[b11][s10] = bitmap;
                            ai.y1 y1Var = i6.f23455l;
                            g0.r(y1Var);
                            g0.h3(y1Var);
                        }
                        i6.f23451g[b11][s10] = false;
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
            i(e10.f22158a, e10.f22159b);
        }
    }

    public static CharSequence l(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return m(charSequence, fontMetricsInt, z10, null, 0);
    }

    public static CharSequence m(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i3) {
        return n(charSequence, fontMetricsInt, z10, iArr, i3, 1.0f, 0);
    }

    public static CharSequence n(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i3, float f10, int i10) {
        Spannable newSpannable;
        int i11;
        String charSequence2;
        if (!az.U0 && charSequence != null && charSequence.length() != 0) {
            if (!z10 && (charSequence instanceof Spannable)) {
                newSpannable = (Spannable) charSequence;
            } else {
                newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
            }
            ArrayList j10 = j(newSpannable, iArr);
            if (j10.isEmpty()) {
                return charSequence;
            }
            org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.p5.class);
            org.telegram.ui.Components.wp[] wpVarArr = (org.telegram.ui.Components.wp[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.wp.class);
            if (az.o() >= 2) {
                i11 = 100;
            } else {
                i11 = 50;
            }
            int i12 = i11 - i10;
            for (int i13 = 0; i13 < j10.size(); i13++) {
                try {
                    g6 g6Var = (g6) j10.get(i13);
                    if (p5VarArr != null && p5VarArr.length > 0) {
                        for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                            if (p5Var == null || newSpannable.getSpanStart(p5Var) != g6Var.f22667a || newSpannable.getSpanEnd(p5Var) != g6Var.f22668b) {
                            }
                        }
                    }
                    if (wpVarArr != null && wpVarArr.length > 0) {
                        for (org.telegram.ui.Components.wp wpVar : wpVarArr) {
                            if (wpVar == null || newSpannable.getSpanStart(wpVar) != g6Var.f22667a || newSpannable.getSpanEnd(wpVar) != g6Var.f22668b) {
                            }
                        }
                    }
                    e6 g7 = g(g6Var.f22669c);
                    if (g7 != null) {
                        ?? imageSpan = new ImageSpan(g7, i3);
                        imageSpan.f22453b = 1.0f;
                        imageSpan.f22454c = g0.L(20.0f);
                        imageSpan.f22452a = fontMetricsInt;
                        if (fontMetricsInt != null) {
                            int abs = Math.abs(imageSpan.f22452a.ascent) + Math.abs(fontMetricsInt.descent);
                            imageSpan.f22454c = abs;
                            if (abs == 0) {
                                imageSpan.f22454c = g0.L(20.0f);
                            }
                        }
                        CharSequence charSequence3 = g6Var.f22669c;
                        if (charSequence3 == null) {
                            charSequence2 = null;
                        } else {
                            charSequence2 = charSequence3.toString();
                        }
                        imageSpan.d = charSequence2;
                        imageSpan.f22453b = f10;
                        newSpannable.setSpan(imageSpan, g6Var.f22667a, g6Var.f22668b, 33);
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

    public static CharSequence o(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i3, Runnable runnable) {
        u3 u3Var;
        Spannable newSpannable;
        int i10;
        g6 g6Var;
        TLRPC.Document document;
        org.telegram.ui.Components.p5 p5Var;
        if (az.U0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i11 = h10.f22829t0;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        li b02 = li.b0(i11);
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
        ArrayList j10 = j(newSpannable, null);
        if (j10.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.p5.class);
        if (az.o() >= 2) {
            i10 = 100;
        } else {
            i10 = 50;
        }
        int i12 = i10;
        for (int i13 = 0; i13 < j10.size(); i13++) {
            try {
                g6Var = (g6) j10.get(i13);
                if (p5VarArr != null) {
                    for (org.telegram.ui.Components.p5 p5Var2 : p5VarArr) {
                        if (p5Var2 == null || newSpannable.getSpanStart(p5Var2) != g6Var.f22667a || newSpannable.getSpanEnd(p5Var2) != g6Var.f22668b) {
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
                        if (zi.V(document, null, null).contains(g6Var.f22669c)) {
                            break;
                        }
                    }
                }
                document = null;
                if (document != null) {
                    p5Var = new org.telegram.ui.Components.p5(document, fontMetricsInt);
                } else {
                    p5Var = new org.telegram.ui.Components.p5(0L, fontMetricsInt);
                }
                p5Var.emoji = g6Var.f22669c.toString();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                p5Var.cacheType = i3;
                newSpannable.setSpan(p5Var, g6Var.f22667a, g6Var.f22668b, 33);
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
        SharedPreferences d12 = hp.d1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : f23453j.entrySet()) {
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
        SharedPreferences d12 = hp.d1();
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
        ArrayList arrayList = f23452i;
        arrayList.clear();
        for (Map.Entry entry : h.entrySet()) {
            arrayList.add((String) entry.getKey());
        }
        Collections.sort(arrayList, new o0.a(5));
        while (arrayList.size() > 48) {
            a1.g.y(1, arrayList);
        }
    }
}
