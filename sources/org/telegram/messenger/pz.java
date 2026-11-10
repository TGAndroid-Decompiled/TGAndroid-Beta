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
public final class pz extends DefaultHandler {
    public final HashMap D;
    public boolean E;
    public boolean F;
    public StringBuilder G;
    public boolean H;
    public int I;
    public ArrayList J;
    public Canvas f24651a;
    public Bitmap f24652b;
    public final rz f24653c;
    public final int d;
    public final int f24654e;
    public float f24655f;
    public final Paint h;
    public final RectF f24656n;
    public final RectF f24657r;
    public final Integer f24658s;
    public final float f24659w;
    public final int f24660x;
    public boolean f24661y;

    public pz(int i7, int i10, Integer num, boolean z9) {
        this(i7, i10, num, z9, 1.0f, 1);
    }

    public final void a(j2.n r3, java.lang.Integer r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pz.a(j2.n, java.lang.Integer, boolean):void");
    }

    public final boolean b(j2.n nVar) {
        if (!"none".equals(nVar.f0("display"))) {
            String f02 = nVar.f0("fill");
            if (f02 != null && f02.startsWith("url(#")) {
                f02.substring(5, f02.length() - 1);
                return false;
            }
            Integer g02 = nVar.g0("fill");
            Paint paint = this.h;
            if (g02 != null) {
                a(nVar, g02, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            } else if (nVar.f0("fill") == null && nVar.f0("stroke") == null) {
                paint.setStyle(Paint.Style.FILL);
                Integer num = this.f24658s;
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

    public final boolean c(j2.n r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pz.c(j2.n):boolean");
    }

    @Override
    public final void characters(char[] cArr, int i7, int i10) {
        StringBuilder sb2 = this.G;
        if (sb2 != null) {
            sb2.append(cArr, i7, i10);
        }
    }

    public final Bitmap d() {
        return this.f24652b;
    }

    public final ArrayList e() {
        return this.J;
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        int indexOf;
        if (this.H) {
            int i7 = this.I - 1;
            this.I = i7;
            if (i7 == 0) {
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
                    for (int i10 = 0; i10 < split.length; i10++) {
                        String replace = split[i10].trim().replace("\t", "").replace("\n", "");
                        split[i10] = replace;
                        if (replace.length() != 0 && split[i10].charAt(0) == '.' && (indexOf = split[i10].indexOf(123)) >= 0) {
                            this.D.put(split[i10].substring(1, indexOf).trim(), new qz(split[i10].substring(indexOf + 1)));
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
        if (this.f24661y) {
            rz rzVar = this.f24653c;
            if (rzVar != null) {
                rzVar.f25383a.add(null);
            } else {
                this.f24651a.restore();
            }
        }
    }

    public final void g(Attributes attributes) {
        boolean z9;
        String l10 = sz.l("transform", attributes);
        if (l10 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f24661y = z9;
        if (z9) {
            Matrix o4 = sz.o(l10);
            rz rzVar = this.f24653c;
            if (rzVar != null) {
                rzVar.f25383a.add(o4);
                return;
            }
            this.f24651a.save();
            this.f24651a.concat(o4);
        }
    }

    @Override
    public final void startElement(java.lang.String r27, java.lang.String r28, java.lang.String r29, org.xml.sax.Attributes r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pz.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public pz(int i7, int i10, Integer num, boolean z9, float f10, int i11) {
        this.f24655f = 1.0f;
        this.h = new Paint(1);
        this.f24656n = new RectF();
        this.f24657r = new RectF();
        this.f24659w = 1.0f;
        this.f24661y = false;
        this.D = new HashMap();
        this.H = false;
        this.I = 0;
        this.f24659w = f10;
        this.d = i7;
        this.f24654e = i10;
        this.f24658s = num;
        this.f24660x = i11;
        if (z9) {
            this.f24653c = new rz();
        }
    }

    @Override
    public final void endDocument() {
    }

    @Override
    public final void startDocument() {
    }
}
