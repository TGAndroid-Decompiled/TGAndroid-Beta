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
public final class u4 {
    public static ColorMatrixColorFilter f22418f;
    public final ImageReceiver f22419a;
    public final ImageReceiver f22420b;
    public Bitmap f22421c;
    public final RadialProgress2 d;
    public r f22422e;

    public u4(r4 r4Var, h6 h6Var) {
        this.f22419a = new ImageReceiver(r4Var);
        this.f22420b = new ImageReceiver(r4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(r4Var, h6Var);
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
        r rVar = this.f22422e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f22419a;
        if (rVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i7 = org.telegram.messenger.g0.f24010q.x;
        String j3 = com.google.android.gms.internal.vision.e2.j(i7, "_", i7);
        StringBuilder sb3 = new StringBuilder();
        r rVar2 = this.f22422e;
        if (rVar2 == null) {
            sb2 = "null";
        } else {
            if (rVar2.f22290b) {
                str = "v";
            } else if (rVar2.f22291c) {
                str = "a";
            } else {
                str = "p";
            }
            if (rVar2.f22292e != null) {
                StringBuilder n10 = p5.c.n(str, ":local:");
                n10.append(this.f22422e.f22292e);
                sb2 = n10.toString();
            } else {
                long j10 = 0;
                if (rVar2.b()) {
                    r rVar3 = this.f22422e;
                    TLRPC.Document document2 = rVar3.h;
                    if (document2 != null) {
                        j10 = document2.f28404id;
                    } else {
                        TLRPC.Photo photo2 = rVar3.f22294g;
                        if (photo2 != null) {
                            j10 = photo2.f28422id;
                        }
                    }
                }
                StringBuilder n11 = p5.c.n(str, ":");
                n11.append(this.f22422e.f22289a);
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
        this.f22422e.getClass();
        r rVar4 = this.f22422e;
        if (rVar4.f22290b) {
            if (rVar4.f22292e != null) {
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(gc.o(this.f22422e.f22292e), "g", null, j3, null, j3, null, 0L, null, null, 0);
            } else if (rVar4.b() && (document = this.f22422e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Z0 = org.telegram.messenger.g0.Z0(false);
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i10 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.PhotoSize photoSize3 = arrayList.get(i11);
                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.f28423w, photoSize3.h) - Z0)) < i10) {
                            photoSize = photoSize3;
                            i10 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f22422e.h.thumbs;
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
                imageReceiver.u0(gc.b(this.f22422e.h), "g", gc.c(photoSize, this.f22422e.h), j3, gc.c(photoSize2, this.f22422e.h), j3, null, 0L, null, this.f22422e.h, 0);
            } else {
                imageReceiver.w0(null);
            }
        } else if (rVar4.f22292e != null) {
            imageReceiver.G0(rVar4.f22298l, rVar4.f22299m, true);
            imageReceiver.q0(gc.g(this.f22422e.f22292e), j3, null, null, null, 0);
        } else if (rVar4.b() && (photo = this.f22422e.f22294g) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = w7.w(this.f22422e.f22294g.sizes, 100, false, null, false);
            imageReceiver.G0(0, 0, false);
            imageReceiver.r0(gc.i(w10, this.f22422e.f22294g), j3, gc.i(w11, this.f22422e.f22294g), j3, null, 0L, null, this.f22422e.f22294g, 0);
        } else {
            imageReceiver.w0(null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n10;
        if (c() && (n10 = (imageReceiver = this.f22419a).n()) != null && !n10.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f22420b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 != this.f22421c || imageReceiver2.n() == null)) {
                this.f22421c = n10;
                imageReceiver2.v0(Utilities.D(n10, false));
                if (f22418f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                    f22418f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.f22648p1 = f22418f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        r rVar = this.f22422e;
        if (rVar != null) {
            if (rVar.f22292e != null || rVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        r rVar = this.f22422e;
        if (rVar != null && !rVar.f22290b && !rVar.b()) {
            int i7 = this.f22422e.f22298l;
            if (i7 == 90 || i7 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
