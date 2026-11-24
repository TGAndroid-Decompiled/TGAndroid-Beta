package defpackage;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class vu3 {
    public static final HashMap a = new HashMap();
    public static final int b;
    public static final int c;
    public static final Paint d;
    public static final int[] e;
    public static final Bitmap[][] f;
    public static final boolean[][] g;
    public static final HashMap h;
    public static final ArrayList i;
    public static final HashMap j;
    public static boolean k;
    public static final ql3 l;
    public static float m;
    public static boolean n;
    public static final String[] o;

    static {
        float f2;
        String[][] strArr = ow3.i;
        e = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        f = new Bitmap[8];
        g = new boolean[8];
        h = new HashMap();
        i = new ArrayList();
        j = new HashMap();
        l = new ql3((byte) 4);
        n = true;
        o = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        b = gl.L(20.0f);
        if (gl.O1()) {
            f2 = 40.0f;
        } else {
            f2 = 34.0f;
        }
        c = gl.L(f2);
        int i2 = 0;
        while (true) {
            Bitmap[][] bitmapArr = f;
            if (i2 >= bitmapArr.length) {
                break;
            }
            int i3 = e[i2];
            bitmapArr[i2] = new Bitmap[i3];
            g[i2] = new boolean[i3];
            i2++;
        }
        int i4 = 0;
        while (true) {
            char[] cArr = ow3.a;
            if (i4 < 8) {
                int i5 = 0;
                while (true) {
                    String[] strArr2 = ow3.i[i4];
                    if (i5 < strArr2.length) {
                        HashMap hashMap = a;
                        String str = strArr2[i5];
                        ?? obj = new Object();
                        obj.a = (byte) i4;
                        obj.b = (short) i5;
                        hashMap.put(str, obj);
                        i5++;
                    }
                }
                i4++;
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
            ArrayList arrayList = i;
            hashMap.remove((String) b00.f(1, arrayList));
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
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt >= 55356 && charAt <= 55358) {
                if (charAt == 55356 && i2 < length - 1) {
                    int i3 = i2 + 1;
                    char charAt2 = str.charAt(i3);
                    if (charAt2 != 56879 && charAt2 != 56324 && charAt2 != 56858 && charAt2 != 56703) {
                        i2 = i3;
                    } else {
                        i2 += 2;
                        str = str.substring(0, i2) + "️" + str.substring(i2);
                        length++;
                    }
                } else {
                    i2++;
                }
            } else if (charAt == 8419) {
                break;
            } else if (charAt >= 8252 && charAt <= 12953 && ow3.j.containsKey(Character.valueOf(charAt))) {
                i2++;
                str = str.substring(0, i2) + "️" + str.substring(i2);
                length++;
            }
            i2++;
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

    public static qu3 e(CharSequence charSequence) {
        CharSequence charSequence2;
        if (b(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap hashMap = a;
        qu3 qu3Var = (qu3) hashMap.get(charSequence);
        if (qu3Var == null && (charSequence2 = (CharSequence) ow3.n.get(charSequence)) != null) {
            return (qu3) hashMap.get(charSequence2);
        }
        return qu3Var;
    }

    public static ru3 f(String str) {
        CharSequence charSequence;
        ru3 a2 = qq2.a(str, null, null);
        if (a2 != null) {
            int i2 = b;
            a2.setBounds(0, 0, i2, i2);
        } else {
            a2 = null;
        }
        if (a2 == null) {
            a2 = g(str);
        }
        if (a2 == null && (charSequence = (CharSequence) ow3.n.get(str)) != null) {
            a2 = g(charSequence);
        }
        if (a2 == null) {
            return null;
        }
        int i3 = c;
        a2.setBounds(0, 0, i3, i3);
        a2.a = true;
        return a2;
    }

    public static ru3 g(CharSequence charSequence) {
        oq2 a2;
        qu3 e2 = e(charSequence);
        int i2 = b;
        if (e2 == null) {
            if (charSequence == null || (a2 = qq2.a(charSequence.toString(), null, null)) == null) {
                return null;
            }
            a2.setBounds(0, 0, i2, i2);
            return a2;
        }
        boolean b2 = b(charSequence);
        ?? ru3Var = new ru3();
        ru3Var.c = e2;
        ru3Var.d = b2;
        ru3Var.setBounds(0, 0, i2, i2);
        return ru3Var;
    }

    public static boolean h(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap hashMap = a;
        qu3 qu3Var = (qu3) hashMap.get(charSequence);
        if (qu3Var == null && (charSequence2 = (CharSequence) ow3.n.get(charSequence)) != null) {
            qu3Var = (qu3) hashMap.get(charSequence2);
        }
        if (qu3Var == null) {
            return false;
        }
        return true;
    }

    public static void i(final byte b2, final short s) {
        if (f[b2][s] == null) {
            boolean[] zArr = g[b2];
            if (!zArr[s]) {
                zArr[s] = true;
                Utilities.e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        byte b3 = b2;
                        short s2 = s;
                        try {
                            bitmap = vw3.a.h(b3, s2);
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            vu3.f[b3][s2] = bitmap;
                            ql3 ql3Var = vu3.l;
                            gl.r(ql3Var);
                            gl.d3(ql3Var);
                        }
                        vu3.g[b3][s2] = false;
                    }
                });
            }
        }
    }

    public static java.util.ArrayList j(java.lang.CharSequence r27, int[] r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu3.j(java.lang.CharSequence, int[]):java.util.ArrayList");
    }

    public static void k(CharSequence charSequence) {
        qu3 e2 = e(charSequence);
        if (e2 != null) {
            i(e2.a, e2.b);
        }
    }

    public static CharSequence l(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z) {
        return m(charSequence, fontMetricsInt, z, null, 0);
    }

    public static CharSequence m(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr, int i2) {
        return n(charSequence, fontMetricsInt, z, iArr, i2, 1.0f, 0);
    }

    public static CharSequence n(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr, int i2, float f2, int i3) {
        Spannable newSpannable;
        int i4;
        String charSequence2;
        if (!gba.R0 && charSequence != null && charSequence.length() != 0) {
            if (!z && (charSequence instanceof Spannable)) {
                newSpannable = (Spannable) charSequence;
            } else {
                newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
            }
            ArrayList j2 = j(newSpannable, iArr);
            if (j2.isEmpty()) {
                return charSequence;
            }
            gm[] gmVarArr = (gm[]) newSpannable.getSpans(0, newSpannable.length(), gm.class);
            cm2[] cm2VarArr = (cm2[]) newSpannable.getSpans(0, newSpannable.length(), cm2.class);
            if (gba.o() >= 2) {
                i4 = 100;
            } else {
                i4 = 50;
            }
            int i5 = i4 - i3;
            for (int i6 = 0; i6 < j2.size(); i6++) {
                try {
                    tu3 tu3Var = (tu3) j2.get(i6);
                    if (gmVarArr != null && gmVarArr.length > 0) {
                        for (gm gmVar : gmVarArr) {
                            if (gmVar == null || newSpannable.getSpanStart(gmVar) != tu3Var.a || newSpannable.getSpanEnd(gmVar) != tu3Var.b) {
                            }
                        }
                    }
                    if (cm2VarArr != null && cm2VarArr.length > 0) {
                        for (cm2 cm2Var : cm2VarArr) {
                            if (cm2Var == null || newSpannable.getSpanStart(cm2Var) != tu3Var.a || newSpannable.getSpanEnd(cm2Var) != tu3Var.b) {
                            }
                        }
                    }
                    ru3 g2 = g(tu3Var.c);
                    if (g2 != null) {
                        ?? imageSpan = new ImageSpan(g2, i2);
                        imageSpan.b = 1.0f;
                        imageSpan.c = gl.L(20.0f);
                        imageSpan.a = fontMetricsInt;
                        if (fontMetricsInt != null) {
                            int abs = Math.abs(imageSpan.a.ascent) + Math.abs(fontMetricsInt.descent);
                            imageSpan.c = abs;
                            if (abs == 0) {
                                imageSpan.c = gl.L(20.0f);
                            }
                        }
                        CharSequence charSequence3 = tu3Var.c;
                        if (charSequence3 == null) {
                            charSequence2 = null;
                        } else {
                            charSequence2 = charSequence3.toString();
                        }
                        imageSpan.d = charSequence2;
                        imageSpan.b = f2;
                        newSpannable.setSpan(imageSpan, tu3Var.a, tu3Var.b, 33);
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                if (Build.VERSION.SDK_INT >= 29 && i6 + 1 >= i5) {
                    break;
                }
            }
            return newSpannable;
        }
        return charSequence;
    }

    public static CharSequence o(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i2, Runnable runnable) {
        hj3 hj3Var;
        Spannable newSpannable;
        int i3;
        TLRPC.Document document;
        gm gmVar;
        if (gba.R0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i4 = y6c.t0;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        hq6 d0 = hq6.d0(i4);
        if (runnable == null) {
            hj3Var = null;
        } else {
            hj3Var = new hj3(runnable, (byte) 5);
        }
        TLRPC.TL_messages_stickerSet m0 = d0.m0(tL_inputStickerSetShortName, 0, false, true, hj3Var);
        if (charSequence instanceof Spannable) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList j2 = j(newSpannable, null);
        if (j2.isEmpty()) {
            return charSequence;
        }
        gm[] gmVarArr = (gm[]) newSpannable.getSpans(0, newSpannable.length(), gm.class);
        if (gba.o() >= 2) {
            i3 = 100;
        } else {
            i3 = 50;
        }
        int i5 = i3;
        for (int i6 = 0; i6 < j2.size(); i6++) {
            try {
                tu3 tu3Var = (tu3) j2.get(i6);
                if (gmVarArr != null) {
                    for (gm gmVar2 : gmVarArr) {
                        if (gmVar2 == null || newSpannable.getSpanStart(gmVar2) != tu3Var.a || newSpannable.getSpanEnd(gmVar2) != tu3Var.b) {
                        }
                    }
                }
                if (m0 != null) {
                    ArrayList<TLRPC.Document> arrayList = m0.documents;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.Document document2 = arrayList.get(i7);
                        i7++;
                        document = document2;
                        if (k27.V(document, null, null).contains(tu3Var.c)) {
                            break;
                        }
                    }
                }
                document = null;
                if (document != null) {
                    gmVar = new gm(document, fontMetricsInt);
                } else {
                    gmVar = new gm(0L, fontMetricsInt);
                }
                gmVar.emoji = tu3Var.c.toString();
                gmVar.cacheType = i2;
                newSpannable.setSpan(gmVar, tu3Var.a, tu3Var.b, 33);
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            if (Build.VERSION.SDK_INT >= 29 && i6 + 1 >= i5) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence p(CharSequence charSequence, TextView textView, Runnable runnable) {
        return o(charSequence, textView.getPaint().getFontMetricsInt(), 20, runnable);
    }

    public static void q() {
        SharedPreferences b1 = na7.b1();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : j.entrySet()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        b1.edit().putString("color", sb.toString()).commit();
    }

    public static void r() {
        SharedPreferences b1 = na7.b1();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : h.entrySet()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        b1.edit().putString("emojis2", sb.toString()).commit();
    }

    public static void s() {
        ArrayList arrayList = i;
        arrayList.clear();
        for (Map.Entry entry : h.entrySet()) {
            arrayList.add((String) entry.getKey());
        }
        Collections.sort(arrayList, new mz2((byte) 14));
        while (arrayList.size() > 48) {
            tb4.v(1, arrayList);
        }
    }
}
