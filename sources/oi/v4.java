package oi;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.RadialProgress2;
public final class v4 {
    public static ColorMatrixColorFilter f22481f;
    public final ImageReceiver f22482a;
    public final ImageReceiver f22483b;
    public Bitmap f22484c;
    public final RadialProgress2 d;
    public r f22485e;

    public v4(s4 s4Var, h6 h6Var) {
        this.f22482a = new ImageReceiver(s4Var);
        this.f22483b = new ImageReceiver(s4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(s4Var, h6Var);
        this.d = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void a() {
        String str;
        String sb2;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int abs;
        r rVar = this.f22485e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f22482a;
        if (rVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i7 = org.telegram.messenger.g0.f24046q.x;
        String j3 = com.google.android.gms.internal.vision.e2.j(i7, "_", i7);
        StringBuilder sb3 = new StringBuilder();
        r rVar2 = this.f22485e;
        if (rVar2 == null) {
            sb2 = "null";
        } else {
            if (rVar2.f22345b) {
                str = "v";
            } else if (rVar2.f22346c) {
                str = "a";
            } else {
                str = "p";
            }
            if (rVar2.f22347e != null) {
                StringBuilder n10 = p5.c.n(str, ":local:");
                n10.append(this.f22485e.f22347e);
                sb2 = n10.toString();
            } else {
                long j10 = 0;
                if (rVar2.b()) {
                    r rVar3 = this.f22485e;
                    TLRPC.Document document2 = rVar3.h;
                    if (document2 != null) {
                        j10 = document2.f28440id;
                    } else {
                        TLRPC.Photo photo2 = rVar3.f22349g;
                        if (photo2 != null) {
                            j10 = photo2.f28458id;
                        }
                    }
                }
                StringBuilder n11 = p5.c.n(str, ":");
                n11.append(this.f22485e.f22344a);
                n11.append(":");
                n11.append(j10);
                sb2 = n11.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(j3);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.f22485e.getClass();
        r rVar4 = this.f22485e;
        if (rVar4.f22345b) {
            if (rVar4.f22347e != null) {
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(gc.o(this.f22485e.f22347e), "g", null, j3, null, j3, null, 0L, null, null, 0);
            } else if (rVar4.b() && (document = this.f22485e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Z0 = org.telegram.messenger.g0.Z0(false);
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i10 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.PhotoSize photoSize3 = arrayList.get(i11);
                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.f28459w, photoSize3.h) - Z0)) < i10) {
                            photoSize = photoSize3;
                            i10 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f22485e.h.thumbs;
                if (arrayList2 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i12) instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize2 = arrayList2.get(i12);
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(gc.b(this.f22485e.h), "g", gc.c(photoSize, this.f22485e.h), j3, gc.c(photoSize2, this.f22485e.h), j3, null, 0L, null, this.f22485e.h, 0);
            } else {
                imageReceiver.w0(null);
            }
        } else if (rVar4.f22347e != null) {
            imageReceiver.G0(rVar4.f22353l, rVar4.f22354m, true);
            imageReceiver.q0(gc.g(this.f22485e.f22347e), j3, null, null, null, 0);
        } else if (rVar4.b() && (photo = this.f22485e.f22349g) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = w7.w(this.f22485e.f22349g.sizes, 100, false, null, false);
            imageReceiver.G0(0, 0, false);
            imageReceiver.r0(gc.i(w10, this.f22485e.f22349g), j3, gc.i(w11, this.f22485e.f22349g), j3, null, 0L, null, this.f22485e.f22349g, 0);
        } else {
            imageReceiver.w0(null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n10;
        if (c() && (n10 = (imageReceiver = this.f22482a).n()) != null && !n10.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f22483b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 != this.f22484c || imageReceiver2.n() == null)) {
                this.f22484c = n10;
                imageReceiver2.v0(Utilities.D(n10, false));
                if (f22481f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                    f22481f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.f22684p1 = f22481f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        r rVar = this.f22485e;
        if (rVar != null) {
            if (rVar.f22347e != null || rVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        r rVar = this.f22485e;
        if (rVar != null && !rVar.f22345b && !rVar.b()) {
            int i7 = this.f22485e.f22353l;
            if (i7 == 90 || i7 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
