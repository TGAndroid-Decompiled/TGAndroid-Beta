package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
public abstract class nyc {
    public static final int[] a = {cmb.qa, cmb.Uc, cmb.de, cmb.Wc, cmb.Md};
    public static final int[] b = {cmb.qb, cmb.Vc, cmb.ic, cmb.Xc, cmb.Sb};
    public static final int[] c = {cmb.tb, cmb.ub, cmb.vb};

    public static String a(ylb ylbVar, boolean z) {
        boolean o;
        int[] iArr;
        int i;
        Object obj;
        String str = "light";
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        if (z) {
            iArr = b;
        } else {
            iArr = a;
        }
        try {
            int b2 = b(ylbVar, z);
            if (o) {
                i = -16777216;
            } else {
                i = -1;
            }
            int v = cmb.v(i, b2);
            int v0 = cmb.v0(iArr[1], ylbVar);
            int v02 = cmb.v0(iArr[2], ylbVar);
            int v03 = cmb.v0(iArr[3], ylbVar);
            int v04 = cmb.v0(iArr[4], ylbVar);
            int v05 = cmb.v0(cmb.Ei, ylbVar);
            int v06 = cmb.v0(cmb.Ii, ylbVar);
            int v2 = cmb.v(v, cmb.p1(0.1f, v04));
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
            jSONObject.put("destructive_text_color", c(cmb.v0(cmb.o7, ylbVar), v));
            jSONObject.put("section_bg_color", c(v, v));
            jSONObject.put("section_header_text_color", c(v04, v));
            jSONObject.put("section_separator_color", c(cmb.p1(0.12f, v0), v));
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
            fc4.g(e, true);
            StringBuilder sb = new StringBuilder("{\"colorScheme\":\"");
            if (o) {
                str = "dark";
            }
            return b10.j(sb, str, "\"}");
        }
    }

    public static int b(ylb ylbVar, boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            i = b[0];
        } else {
            i = a[0];
        }
        int v0 = cmb.v0(i, ylbVar);
        if (z) {
            int[] iArr = c;
            int i4 = iArr[0];
            if (ylbVar != null) {
                i2 = ylbVar.j(i4);
            } else {
                i2 = cmb.km.get(i4);
            }
            if (i2 != 0) {
                int red = Color.red(v0);
                int green = Color.green(v0);
                int blue = Color.blue(v0);
                int i5 = 1;
                for (int i6 : iArr) {
                    if (ylbVar != null) {
                        i3 = ylbVar.j(i6);
                    } else {
                        i3 = cmb.km.get(i6);
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
        int v = cmb.v(i2, i);
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
        return b10.j(sb, str, "\"}");
    }

    public static int e(ylb ylbVar, boolean z) {
        int i;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3 = 0;
        if (ylbVar == null ? cmb.I.o() : ylbVar.a()) {
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
            i = (i * 31) + cmb.v0(i4, ylbVar);
        }
        if (z) {
            for (int i5 : c) {
                int i6 = i * 31;
                if (ylbVar != null) {
                    i2 = ylbVar.j(i5);
                } else {
                    i2 = cmb.km.get(i5);
                }
                i = i6 + i2;
            }
        }
        int v0 = (((cmb.v0(cmb.o7, ylbVar) + ((cmb.v0(cmb.Ii, ylbVar) + ((cmb.v0(cmb.Ei, ylbVar) + (i * 31)) * 31)) * 31)) * 31) + gda.S0) * 31;
        TextPaint textPaint = cmb.n2;
        if (textPaint != null) {
            i3 = Float.floatToIntBits(textPaint.getTextSize());
        }
        return al9.i0() + ((v0 + i3) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", gda.S0);
        TextPaint textPaint = cmb.n2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        int round = Math.round(al9.i0() / gm.p);
        jSONObject.put("padding", "8px " + round + "px");
        return jSONObject;
    }
}
