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
public final class hz extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas f23399a;
    public Bitmap f23400b;
    public final jz f23401c;
    public final int d;
    public final int f23402e;
    public float f23403f;
    public final Paint h;
    public final RectF f23404n;
    public final RectF f23405r;
    public final Integer f23406s;
    public final float f23407w;
    public final int f23408x;
    public boolean f23409y;

    public hz(int i3, int i10, Integer num, boolean z10) {
        this(i3, i10, num, z10, 1.0f, 1);
    }

    public final void a(mi.h0 r3, java.lang.Integer r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hz.a(mi.h0, java.lang.Integer, boolean):void");
    }

    public final boolean b(mi.h0 h0Var) {
        if (!"none".equals(h0Var.E("display"))) {
            String E = h0Var.E("fill");
            if (E != null && E.startsWith("url(#")) {
                E.substring(5, E.length() - 1);
                return false;
            }
            Integer G = h0Var.G("fill");
            Paint paint = this.h;
            if (G != null) {
                a(h0Var, G, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            } else if (h0Var.E("fill") == null && h0Var.E("stroke") == null) {
                paint.setStyle(Paint.Style.FILL);
                Integer num = this.f23406s;
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

    public final boolean c(mi.h0 r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hz.c(mi.h0):boolean");
    }

    @Override
    public final void characters(char[] cArr, int i3, int i10) {
        StringBuilder sb2 = this.H;
        if (sb2 != null) {
            sb2.append(cArr, i3, i10);
        }
    }

    public final Bitmap d() {
        return this.f23400b;
    }

    public final ArrayList e() {
        return this.K;
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        int indexOf;
        if (this.I) {
            int i3 = this.J - 1;
            this.J = i3;
            if (i3 == 0) {
                this.I = false;
                return;
            }
            return;
        }
        str2.getClass();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case 103:
                if (str2.equals("g")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3079438:
                if (str2.equals("defs")) {
                    c2 = 1;
                    break;
                }
                break;
            case 109780401:
                if (str2.equals("style")) {
                    c2 = 2;
                    break;
                }
                break;
            case 917656469:
                if (str2.equals("clipPath")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 3:
                this.G = false;
                return;
            case 2:
                StringBuilder sb2 = this.H;
                if (sb2 != null) {
                    String[] split = sb2.toString().split("\\}");
                    for (int i10 = 0; i10 < split.length; i10++) {
                        String replace = split[i10].trim().replace("\t", "").replace("\n", "");
                        split[i10] = replace;
                        if (replace.length() != 0 && split[i10].charAt(0) == '.' && (indexOf = split[i10].indexOf(123)) >= 0) {
                            this.E.put(split[i10].substring(1, indexOf).trim(), new iz(split[i10].substring(indexOf + 1)));
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
        if (this.f23409y) {
            jz jzVar = this.f23401c;
            if (jzVar != null) {
                jzVar.f23760a.add(null);
            } else {
                this.f23399a.restore();
            }
        }
    }

    public final void g(Attributes attributes) {
        boolean z10;
        String l10 = kz.l("transform", attributes);
        if (l10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23409y = z10;
        if (z10) {
            Matrix o10 = kz.o(l10);
            jz jzVar = this.f23401c;
            if (jzVar != null) {
                jzVar.f23760a.add(o10);
                return;
            }
            this.f23399a.save();
            this.f23399a.concat(o10);
        }
    }

    @Override
    public final void startElement(java.lang.String r27, java.lang.String r28, java.lang.String r29, org.xml.sax.Attributes r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hz.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public hz(int i3, int i10, Integer num, boolean z10, float f10, int i11) {
        this.f23403f = 1.0f;
        this.h = new Paint(1);
        this.f23404n = new RectF();
        this.f23405r = new RectF();
        this.f23407w = 1.0f;
        this.f23409y = false;
        this.E = new HashMap();
        this.I = false;
        this.J = 0;
        this.f23407w = f10;
        this.d = i3;
        this.f23402e = i10;
        this.f23406s = num;
        this.f23408x = i11;
        if (z10) {
            this.f23401c = new jz();
        }
    }

    @Override
    public final void endDocument() {
    }

    @Override
    public final void startDocument() {
    }
}
