package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
public abstract class c1d {
    public static final int[] a = {aob.ra, aob.Vc, aob.ee, aob.Xc, aob.Nd};
    public static final int[] b = {aob.rb, aob.Wc, aob.jc, aob.Yc, aob.Tb};
    public static final int[] c = {aob.ub, aob.vb, aob.wb};

    public static String a(vnb vnbVar, boolean z) {
        boolean o;
        int[] iArr;
        int i;
        Object obj;
        String str = "light";
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        if (z) {
            iArr = b;
        } else {
            iArr = a;
        }
        try {
            int b2 = b(vnbVar, z);
            if (o) {
                i = -16777216;
            } else {
                i = -1;
            }
            int v = aob.v(i, b2);
            int v0 = aob.v0(iArr[1], vnbVar);
            int v02 = aob.v0(iArr[2], vnbVar);
            int v03 = aob.v0(iArr[3], vnbVar);
            int v04 = aob.v0(iArr[4], vnbVar);
            int v05 = aob.v0(aob.Fi, vnbVar);
            int v06 = aob.v0(aob.Ji, vnbVar);
            int v2 = aob.v(v, aob.p1(0.1f, v04));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", c(v, v));
            jSONObject.put("text_color", c(v0, v));
            jSONObject.put("hint_color", c(v02, v));
            jSONObject.put("link_color", c(v03, v));
            jSONObject.put("button_color", c(v05, v));
            jSONObject.put("button_text_color", c(v06, v05));
            jSONObject.put("secondary_bg_color", c(v2, v));
            jSONObject.put("accent_text_color", c(v04, v));
            jSONObject.put("subtitle_text_color", c(v02, v));
            jSONObject.put("destructive_text_color", c(aob.v0(aob.p7, vnbVar), v));
            jSONObject.put("section_bg_color", c(v, v));
            jSONObject.put("section_header_text_color", c(v04, v));
            jSONObject.put("section_separator_color", c(aob.p1(0.12f, v0), v));
            jSONObject.put("header_bg_color", c(v2, v));
            jSONObject.put("bottom_bar_bg_color", c(v2, v));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", c(v04, v));
            JSONObject jSONObject3 = new JSONObject();
            if (!o) {
                obj = "light";
            } else {
                obj = "dark";
            }
            jSONObject3.put("colorScheme", obj);
            jSONObject3.put("params", jSONObject);
            jSONObject3.put("button", jSONObject2);
            jSONObject3.put("text", f());
            return jSONObject3.toString();
        } catch (Exception e) {
            cc4.g(e, true);
            StringBuilder sb = new StringBuilder("{\"colorScheme\":\"");
            if (o) {
                str = "dark";
            }
            return c00.k(sb, str, "\"}");
        }
    }

    public static int b(vnb vnbVar, boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            i = b[0];
        } else {
            i = a[0];
        }
        int v0 = aob.v0(i, vnbVar);
        if (z) {
            int[] iArr = c;
            int i4 = iArr[0];
            if (vnbVar != null) {
                i2 = vnbVar.j(i4);
            } else {
                i2 = aob.lm.get(i4);
            }
            if (i2 != 0) {
                int red = Color.red(v0);
                int green = Color.green(v0);
                int blue = Color.blue(v0);
                int i5 = 1;
                for (int i6 : iArr) {
                    if (vnbVar != null) {
                        i3 = vnbVar.j(i6);
                    } else {
                        i3 = aob.lm.get(i6);
                    }
                    if (i3 != 0) {
                        int red2 = Color.red(i3) + red;
                        int green2 = Color.green(i3) + green;
                        i5++;
                        blue = Color.blue(i3) + blue;
                        green = green2;
                        red = red2;
                    }
                }
                return Color.argb(Color.alpha(v0), red / i5, green / i5, blue / i5);
            }
        }
        return v0;
    }

    public static String c(int i, int i2) {
        int v = aob.v(i2, i);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(v)), Integer.valueOf(Color.green(v)), Integer.valueOf(Color.blue(v)));
    }

    public static String d(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("{\"colorScheme\":\"");
        if (z) {
            str = "dark";
        } else {
            str = "light";
        }
        return c00.k(sb, str, "\"}");
    }

    public static int e(vnb vnbVar, boolean z) {
        int i;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3 = 0;
        if (vnbVar == null ? aob.I.o() : vnbVar.a()) {
            i = 1;
        } else {
            i = 0;
        }
        if (z) {
            iArr = b;
        } else {
            iArr = a;
        }
        for (int i4 : iArr) {
            i = (i * 31) + aob.v0(i4, vnbVar);
        }
        if (z) {
            for (int i5 : c) {
                int i6 = i * 31;
                if (vnbVar != null) {
                    i2 = vnbVar.j(i5);
                } else {
                    i2 = aob.lm.get(i5);
                }
                i = i6 + i2;
            }
        }
        int v0 = (((aob.v0(aob.p7, vnbVar) + ((aob.v0(aob.Ji, vnbVar) + ((aob.v0(aob.Fi, vnbVar) + (i * 31)) * 31)) * 31)) * 31) + xea.S0) * 31;
        TextPaint textPaint = aob.o2;
        if (textPaint != null) {
            i3 = Float.floatToIntBits(textPaint.getTextSize());
        }
        return nm9.i0() + ((v0 + i3) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", xea.S0);
        TextPaint textPaint = aob.o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        int round = Math.round(nm9.i0() / hl.p);
        jSONObject.put("padding", "8px " + round + "px");
        return jSONObject;
    }
}
