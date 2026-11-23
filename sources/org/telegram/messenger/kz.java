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
public final class kz extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas f25124a;
    public Bitmap f25125b;
    public final mz f25126c;
    public final int d;
    public final int f25127e;
    public float f25128f;
    public final Paint h;
    public final RectF f25129n;
    public final RectF f25130r;
    public final Integer f25131s;
    public final float f25132w;
    public final int f25133x;
    public boolean f25134y;

    public kz(int i7, int i10, Integer num, boolean z10) {
        this(i7, i10, num, z10, 1.0f, 1);
    }

    public final void a(ji.k r3, java.lang.Integer r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kz.a(ji.k, java.lang.Integer, boolean):void");
    }

    public final boolean b(ji.k kVar) {
        if (!"none".equals(kVar.L("display"))) {
            String L = kVar.L("fill");
            if (L != null && L.startsWith("url(#")) {
                L.substring(5, L.length() - 1);
                return false;
            }
            Integer N = kVar.N("fill");
            Paint paint = this.h;
            if (N != null) {
                a(kVar, N, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            } else if (kVar.L("fill") == null && kVar.L("stroke") == null) {
                paint.setStyle(Paint.Style.FILL);
                Integer num = this.f25131s;
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

    public final boolean c(ji.k r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kz.c(ji.k):boolean");
    }

    @Override
    public final void characters(char[] cArr, int i7, int i10) {
        StringBuilder sb2 = this.H;
        if (sb2 != null) {
            sb2.append(cArr, i7, i10);
        }
    }

    public final Bitmap d() {
        return this.f25125b;
    }

    public final ArrayList e() {
        return this.K;
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        int indexOf;
        if (this.I) {
            int i7 = this.J - 1;
            this.J = i7;
            if (i7 == 0) {
                this.I = false;
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
                            this.E.put(split[i10].substring(1, indexOf).trim(), new lz(split[i10].substring(indexOf + 1)));
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
        if (this.f25134y) {
            mz mzVar = this.f25126c;
            if (mzVar != null) {
                mzVar.f25653a.add(null);
            } else {
                this.f25124a.restore();
            }
        }
    }

    public final void g(Attributes attributes) {
        boolean z10;
        String l10 = nz.l("transform", attributes);
        if (l10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25134y = z10;
        if (z10) {
            Matrix o4 = nz.o(l10);
            mz mzVar = this.f25126c;
            if (mzVar != null) {
                mzVar.f25653a.add(o4);
                return;
            }
            this.f25124a.save();
            this.f25124a.concat(o4);
        }
    }

    @Override
    public final void startElement(java.lang.String r27, java.lang.String r28, java.lang.String r29, org.xml.sax.Attributes r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kz.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public kz(int i7, int i10, Integer num, boolean z10, float f10, int i11) {
        this.f25128f = 1.0f;
        this.h = new Paint(1);
        this.f25129n = new RectF();
        this.f25130r = new RectF();
        this.f25132w = 1.0f;
        this.f25134y = false;
        this.E = new HashMap();
        this.I = false;
        this.J = 0;
        this.f25132w = f10;
        this.d = i7;
        this.f25127e = i10;
        this.f25131s = num;
        this.f25133x = i11;
        if (z10) {
            this.f25126c = new mz();
        }
    }

    @Override
    public final void endDocument() {
    }

    @Override
    public final void startDocument() {
    }
}
