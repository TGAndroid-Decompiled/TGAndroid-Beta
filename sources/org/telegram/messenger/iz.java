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
public final class iz extends DefaultHandler {
    public final HashMap E;
    public boolean F;
    public boolean G;
    public StringBuilder H;
    public boolean I;
    public int J;
    public ArrayList K;
    public Canvas f24885a;
    public Bitmap f24886b;
    public final kz f24887c;
    public final int d;
    public final int f24888e;
    public float f24889f;
    public final Paint h;
    public final RectF f24890n;
    public final RectF f24891r;
    public final Integer f24892s;
    public final float f24893w;
    public final int f24894x;
    public boolean f24895y;

    public iz(int i7, int i10, Integer num, boolean z10) {
        this(i7, i10, num, z10, 1.0f, 1);
    }

    public final void a(j6.k r3, java.lang.Integer r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iz.a(j6.k, java.lang.Integer, boolean):void");
    }

    public final boolean b(j6.k kVar) {
        if (!"none".equals(kVar.f0("display"))) {
            String f02 = kVar.f0("fill");
            if (f02 != null && f02.startsWith("url(#")) {
                f02.substring(5, f02.length() - 1);
                return false;
            }
            Integer h02 = kVar.h0("fill");
            Paint paint = this.h;
            if (h02 != null) {
                a(kVar, h02, true);
                paint.setStyle(Paint.Style.FILL);
                return true;
            } else if (kVar.f0("fill") == null && kVar.f0("stroke") == null) {
                paint.setStyle(Paint.Style.FILL);
                Integer num = this.f24892s;
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

    public final boolean c(j6.k r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iz.c(j6.k):boolean");
    }

    @Override
    public final void characters(char[] cArr, int i7, int i10) {
        StringBuilder sb2 = this.H;
        if (sb2 != null) {
            sb2.append(cArr, i7, i10);
        }
    }

    public final Bitmap d() {
        return this.f24886b;
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
                            this.E.put(split[i10].substring(1, indexOf).trim(), new jz(split[i10].substring(indexOf + 1)));
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
        if (this.f24895y) {
            kz kzVar = this.f24887c;
            if (kzVar != null) {
                kzVar.f25406a.add(null);
            } else {
                this.f24885a.restore();
            }
        }
    }

    public final void g(Attributes attributes) {
        boolean z10;
        String l10 = lz.l("transform", attributes);
        if (l10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24895y = z10;
        if (z10) {
            Matrix o4 = lz.o(l10);
            kz kzVar = this.f24887c;
            if (kzVar != null) {
                kzVar.f25406a.add(o4);
                return;
            }
            this.f24885a.save();
            this.f24885a.concat(o4);
        }
    }

    @Override
    public final void startElement(java.lang.String r27, java.lang.String r28, java.lang.String r29, org.xml.sax.Attributes r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iz.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public iz(int i7, int i10, Integer num, boolean z10, float f10, int i11) {
        this.f24889f = 1.0f;
        this.h = new Paint(1);
        this.f24890n = new RectF();
        this.f24891r = new RectF();
        this.f24893w = 1.0f;
        this.f24895y = false;
        this.E = new HashMap();
        this.I = false;
        this.J = 0;
        this.f24893w = f10;
        this.d = i7;
        this.f24888e = i10;
        this.f24892s = num;
        this.f24894x = i11;
        if (z10) {
            this.f24887c = new kz();
        }
    }

    @Override
    public final void endDocument() {
    }

    @Override
    public final void startDocument() {
    }
}
