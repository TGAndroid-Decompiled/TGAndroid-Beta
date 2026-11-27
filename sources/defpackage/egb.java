package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
public final class egb extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas a;
    public Bitmap b;
    public final ggb c;
    public final int d;
    public final int e;
    public float f;
    public final Paint h;
    public final RectF n;
    public final RectF r;
    public final Integer s;
    public final float w;
    public final int x;
    public boolean y;

    public egb(int i, int i2, Integer num, boolean z, float f, int i3) {
        this.f = 1.0f;
        this.h = new Paint(1);
        this.n = new RectF();
        this.r = new RectF();
        this.w = 1.0f;
        this.y = false;
        this.E = new HashMap();
        this.I = false;
        this.J = 0;
        this.w = f;
        this.d = i;
        this.e = i2;
        this.s = num;
        this.x = i3;
        if (z) {
            this.c = new ggb();
        }
    }

    public final void a(defpackage.k7b r2, java.lang.Integer r3, boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egb.a(k7b, java.lang.Integer, boolean):void");
    }

    public final boolean b(k7b k7bVar) {
        if (!"none".equals(k7bVar.m("display"))) {
            String m = k7bVar.m("fill");
            if (m != null && m.startsWith("url(#")) {
                m.substring(5, m.length() - 1);
                return false;
            }
            Integer n = k7bVar.n("fill");
            Paint paint = this.h;
            if (n != null) {
                a(k7bVar, n, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            } else if (k7bVar.m("fill") == null && k7bVar.m("stroke") == null) {
                paint.setStyle(Paint.Style.FILL);
                Integer num = this.s;
                if (num != null) {
                    paint.setColor(num.intValue());
                    return true;
                }
                paint.setColor(-16777216);
                return true;
            }
        }
        return false;
    }

    public final boolean c(defpackage.k7b r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egb.c(k7b):boolean");
    }

    @Override
    public final void characters(char[] cArr, int i, int i2) {
        StringBuilder sb = this.H;
        if (sb != null) {
            sb.append(cArr, i, i2);
        }
    }

    public final Bitmap d() {
        return this.b;
    }

    public final List e() {
        return this.K;
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        int indexOf;
        if (this.I) {
            int i = this.J - 1;
            this.J = i;
            if (i == 0) {
                this.I = false;
                return;
            }
            return;
        }
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case 103:
                if (str2.equals("g")) {
                    c = 0;
                    break;
                }
                break;
            case 3079438:
                if (str2.equals("defs")) {
                    c = 1;
                    break;
                }
                break;
            case 109780401:
                if (str2.equals("style")) {
                    c = 2;
                    break;
                }
                break;
            case 917656469:
                if (str2.equals("clipPath")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
                this.G = false;
                return;
            case 2:
                StringBuilder sb = this.H;
                if (sb != null) {
                    String[] split = sb.toString().split("\\}");
                    for (int i2 = 0; i2 < split.length; i2++) {
                        String replace = split[i2].trim().replace("\t", "").replace("\n", "");
                        split[i2] = replace;
                        if (replace.length() != 0 && split[i2].charAt(0) == '.' && (indexOf = split[i2].indexOf(123)) >= 0) {
                            this.E.put(split[i2].substring(1, indexOf).trim(), new fgb(split[i2].substring(indexOf + 1)));
                        }
                    }
                    this.H = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void f() {
        if (this.y) {
            ggb ggbVar = this.c;
            if (ggbVar != null) {
                int[] iArr = ggb.u;
                ggbVar.a.add(null);
                return;
            }
            this.a.restore();
        }
    }

    public final void g(Attributes attributes) {
        boolean z;
        String k = hgb.k("transform", attributes);
        if (k != null) {
            z = true;
        } else {
            z = false;
        }
        this.y = z;
        if (z) {
            Matrix n = hgb.n(k);
            ggb ggbVar = this.c;
            if (ggbVar != null) {
                int[] iArr = ggb.u;
                ggbVar.a.add(n);
                return;
            }
            this.a.save();
            this.a.concat(n);
        }
    }

    @Override
    public final void startElement(java.lang.String r27, java.lang.String r28, java.lang.String r29, org.xml.sax.Attributes r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egb.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    @Override
    public final void endDocument() {
    }

    @Override
    public final void startDocument() {
    }

    public egb(int i, int i2, Integer num, boolean z) {
        this(i, i2, num, z, 1.0f, 1);
    }
}
