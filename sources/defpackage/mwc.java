package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
public abstract class mwc {
    public static final int[] a = {bkb.qa, bkb.Uc, bkb.de, bkb.Wc, bkb.Md};
    public static final int[] b = {bkb.qb, bkb.Vc, bkb.ic, bkb.Xc, bkb.Sb};
    public static final int[] c = {bkb.tb, bkb.ub, bkb.vb};

    public static String a(wjb wjbVar, boolean z) {
        boolean o;
        int[] iArr;
        int i;
        Object obj;
        String str = "light";
        if (wjbVar != null) {
            o = wjbVar.a();
        } else {
            o = bkb.I.o();
        }
        if (z) {
            iArr = b;
        } else {
            iArr = a;
        }
        try {
            int b2 = b(wjbVar, z);
            if (o) {
                i = -16777216;
            } else {
                i = -1;
            }
            int v = bkb.v(i, b2);
            int v0 = bkb.v0(iArr[1], wjbVar);
            int v02 = bkb.v0(iArr[2], wjbVar);
            int v03 = bkb.v0(iArr[3], wjbVar);
            int v04 = bkb.v0(iArr[4], wjbVar);
            int v05 = bkb.v0(bkb.Ei, wjbVar);
            int v06 = bkb.v0(bkb.Ii, wjbVar);
            int v2 = bkb.v(v, bkb.p1(0.1f, v04));
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
            jSONObject.put("destructive_text_color", c(bkb.v0(bkb.o7, wjbVar), v));
            jSONObject.put("section_bg_color", c(v, v));
            jSONObject.put("section_header_text_color", c(v04, v));
            jSONObject.put("section_separator_color", c(bkb.p1(0.12f, v0), v));
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
            fa4.g(e, true);
            StringBuilder sb = new StringBuilder("{\"colorScheme\":\"");
            if (o) {
                str = "dark";
            }
            return b00.j(sb, str, "\"}");
        }
    }

    public static int b(wjb wjbVar, boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            i = b[0];
        } else {
            i = a[0];
        }
        int v0 = bkb.v0(i, wjbVar);
        if (z) {
            int[] iArr = c;
            int i4 = iArr[0];
            if (wjbVar != null) {
                i2 = wjbVar.j(i4);
            } else {
                i2 = bkb.km.get(i4);
            }
            if (i2 != 0) {
                int red = Color.red(v0);
                int green = Color.green(v0);
                int blue = Color.blue(v0);
                int i5 = 1;
                for (int i6 : iArr) {
                    if (wjbVar != null) {
                        i3 = wjbVar.j(i6);
                    } else {
                        i3 = bkb.km.get(i6);
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
        int v = bkb.v(i2, i);
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
        return b00.j(sb, str, "\"}");
    }

    public static int e(wjb wjbVar, boolean z) {
        int i;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3 = 0;
        if (wjbVar == null ? bkb.I.o() : wjbVar.a()) {
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
            i = (i * 31) + bkb.v0(i4, wjbVar);
        }
        if (z) {
            for (int i5 : c) {
                int i6 = i * 31;
                if (wjbVar != null) {
                    i2 = wjbVar.j(i5);
                } else {
                    i2 = bkb.km.get(i5);
                }
                i = i6 + i2;
            }
        }
        int v0 = (((bkb.v0(bkb.o7, wjbVar) + ((bkb.v0(bkb.Ii, wjbVar) + ((bkb.v0(bkb.Ei, wjbVar) + (i * 31)) * 31)) * 31)) * 31) + gba.S0) * 31;
        TextPaint textPaint = bkb.n2;
        if (textPaint != null) {
            i3 = Float.floatToIntBits(textPaint.getTextSize());
        }
        return zi9.j0() + ((v0 + i3) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", gba.S0);
        TextPaint textPaint = bkb.n2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        int round = Math.round(zi9.j0() / gl.p);
        jSONObject.put("padding", "8px " + round + "px");
        return jSONObject;
    }
}
