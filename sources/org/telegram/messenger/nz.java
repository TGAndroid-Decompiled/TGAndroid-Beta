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
public final class nz extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas f25674a;
    public Bitmap f25675b;
    public final pz f25676c;
    public final int d;
    public final int f25677e;
    public float f25678f;
    public final Paint h;
    public final RectF f25679n;
    public final RectF f25680r;
    public final Integer f25681s;
    public final float f25682w;
    public final int f25683x;
    public boolean f25684y;

    public nz(int i7, int i10, Integer num, boolean z10) {
        this(i7, i10, num, z10, 1.0f, 1);
    }

    public final void a(ji.j r3, java.lang.Integer r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nz.a(ji.j, java.lang.Integer, boolean):void");
    }

    public final boolean b(ji.j jVar) {
        if (!"none".equals(jVar.c0("display"))) {
            String c02 = jVar.c0("fill");
            if (c02 != null && c02.startsWith("url(#")) {
                c02.substring(5, c02.length() - 1);
                return false;
            }
            Integer e02 = jVar.e0("fill");
            Paint paint = this.h;
            if (e02 != null) {
                a(jVar, e02, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            } else if (jVar.c0("fill") == null && jVar.c0("stroke") == null) {
                paint.setStyle(Paint.Style.FILL);
                Integer num = this.f25681s;
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

    public final boolean c(ji.j r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nz.c(ji.j):boolean");
    }

    @Override
    public final void characters(char[] cArr, int i7, int i10) {
        StringBuilder sb2 = this.H;
        if (sb2 != null) {
            sb2.append(cArr, i7, i10);
        }
    }

    public final Bitmap d() {
        return this.f25675b;
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
                            this.E.put(split[i10].substring(1, indexOf).trim(), new oz(split[i10].substring(indexOf + 1)));
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
        if (this.f25684y) {
            pz pzVar = this.f25676c;
            if (pzVar != null) {
                pzVar.f26026a.add(null);
            } else {
                this.f25674a.restore();
            }
        }
    }

    public final void g(Attributes attributes) {
        boolean z10;
        String l10 = qz.l("transform", attributes);
        if (l10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25684y = z10;
        if (z10) {
            Matrix o4 = qz.o(l10);
            pz pzVar = this.f25676c;
            if (pzVar != null) {
                pzVar.f26026a.add(o4);
                return;
            }
            this.f25674a.save();
            this.f25674a.concat(o4);
        }
    }

    @Override
    public final void startElement(java.lang.String r27, java.lang.String r28, java.lang.String r29, org.xml.sax.Attributes r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nz.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public nz(int i7, int i10, Integer num, boolean z10, float f10, int i11) {
        this.f25678f = 1.0f;
        this.h = new Paint(1);
        this.f25679n = new RectF();
        this.f25680r = new RectF();
        this.f25682w = 1.0f;
        this.f25684y = false;
        this.E = new HashMap();
        this.I = false;
        this.J = 0;
        this.f25682w = f10;
        this.d = i7;
        this.f25677e = i10;
        this.f25681s = num;
        this.f25683x = i11;
        if (z10) {
            this.f25676c = new pz();
        }
    }

    @Override
    public final void endDocument() {
    }

    @Override
    public final void startDocument() {
    }
}
