package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
public final class b00 extends DefaultHandler {
    public final HashMap D;
    public boolean E;
    public boolean F;
    public StringBuilder G;
    public boolean H;
    public int I;
    public ArrayList J;
    public Canvas f14891a;
    public Bitmap f14892b;
    public final d00 f14893c;
    public final int d;
    public final int e;
    public float f14894f;
    public final Paint h;
    public final RectF f14895n;
    public final RectF f14896r;
    public final Integer f14897s;
    public final float f14898w;
    public final int f14899x;
    public boolean f14900y;

    public b00(int i10, int i11, Integer num, boolean z10) {
        this(i10, i11, num, z10, 1.0f, 1);
    }

    public final void a(m5.e r3, java.lang.Integer r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b00.a(m5.e, java.lang.Integer, boolean):void");
    }

    public final boolean b(m5.e eVar) {
        if (!"none".equals(eVar.P("display"))) {
            String P = eVar.P("fill");
            if (P != null && P.startsWith("url(#")) {
                P.substring(5, P.length() - 1);
                return false;
            }
            Integer Q = eVar.Q("fill");
            Paint paint = this.h;
            if (Q != null) {
                a(eVar, Q, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            } else if (eVar.P("fill") == null && eVar.P("stroke") == null) {
                paint.setStyle(Paint.Style.FILL);
                Integer num = this.f14897s;
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

    public final boolean c(m5.e r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b00.c(m5.e):boolean");
    }

    @Override
    public final void characters(char[] cArr, int i10, int i11) {
        StringBuilder sb2 = this.G;
        if (sb2 != null) {
            sb2.append(cArr, i10, i11);
        }
    }

    public final Bitmap d() {
        return this.f14892b;
    }

    public final ArrayList e() {
        return this.J;
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        int indexOf;
        if (this.H) {
            int i10 = this.I - 1;
            this.I = i10;
            if (i10 == 0) {
                this.H = false;
                return;
            }
            return;
        }
        str2.getClass();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 103:
                if (str2.equals("g")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3079438:
                if (str2.equals("defs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 109780401:
                if (str2.equals("style")) {
                    c10 = 2;
                    break;
                }
                break;
            case 917656469:
                if (str2.equals("clipPath")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 3:
                this.F = false;
                return;
            case 2:
                StringBuilder sb2 = this.G;
                if (sb2 != null) {
                    String[] split = sb2.toString().split("\\}");
                    for (int i11 = 0; i11 < split.length; i11++) {
                        String replace = split[i11].trim().replace("\t", "").replace("\n", "");
                        split[i11] = replace;
                        if (replace.length() != 0 && split[i11].charAt(0) == '.' && (indexOf = split[i11].indexOf(123)) >= 0) {
                            this.D.put(split[i11].substring(1, indexOf).trim(), new c00(split[i11].substring(indexOf + 1)));
                        }
                    }
                    this.G = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void f() {
        if (this.f14900y) {
            d00 d00Var = this.f14893c;
            if (d00Var != null) {
                d00Var.f15261a.add(null);
            } else {
                this.f14891a.restore();
            }
        }
    }

    public final void g(Attributes attributes) {
        boolean z10;
        String l4 = e00.l("transform", attributes);
        if (l4 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14900y = z10;
        if (z10) {
            Matrix o10 = e00.o(l4);
            d00 d00Var = this.f14893c;
            if (d00Var != null) {
                d00Var.f15261a.add(o10);
                return;
            }
            this.f14891a.save();
            this.f14891a.concat(o10);
        }
    }

    @Override
    public final void startElement(java.lang.String r27, java.lang.String r28, java.lang.String r29, org.xml.sax.Attributes r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b00.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public b00(int i10, int i11, Integer num, boolean z10, float f7, int i12) {
        this.f14894f = 1.0f;
        this.h = new Paint(1);
        this.f14895n = new RectF();
        this.f14896r = new RectF();
        this.f14898w = 1.0f;
        this.f14900y = false;
        this.D = new HashMap();
        this.H = false;
        this.I = 0;
        this.f14898w = f7;
        this.d = i10;
        this.e = i11;
        this.f14897s = num;
        this.f14899x = i12;
        if (z10) {
            this.f14893c = new d00();
        }
    }

    @Override
    public final void endDocument() {
    }

    @Override
    public final void startDocument() {
    }
}
