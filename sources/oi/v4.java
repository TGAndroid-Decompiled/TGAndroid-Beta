package oi;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.RadialProgress2;
public final class v4 {
    public static ColorMatrixColorFilter f22548f;
    public final ImageReceiver f22549a;
    public final ImageReceiver f22550b;
    public Bitmap f22551c;
    public final RadialProgress2 d;
    public s f22552e;

    public v4(s4 s4Var, i6 i6Var) {
        this.f22549a = new ImageReceiver(s4Var);
        this.f22550b = new ImageReceiver(s4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(s4Var, i6Var);
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
        s sVar = this.f22552e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f22549a;
        if (sVar == null) {
            imageReceiver.x0(null);
            return;
        }
        int i7 = org.telegram.messenger.g0.f24226q.x;
        String j3 = com.google.android.gms.internal.vision.e2.j(i7, "_", i7);
        StringBuilder sb3 = new StringBuilder();
        s sVar2 = this.f22552e;
        if (sVar2 == null) {
            sb2 = "null";
        } else {
            if (sVar2.f22422b) {
                str = "v";
            } else if (sVar2.f22423c) {
                str = "a";
            } else {
                str = "p";
            }
            if (sVar2.f22424e != null) {
                StringBuilder n10 = p5.c.n(str, ":local:");
                n10.append(this.f22552e.f22424e);
                sb2 = n10.toString();
            } else {
                long j10 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.f22552e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j10 = document2.f28498id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.f22426g;
                        if (photo2 != null) {
                            j10 = photo2.f28516id;
                        }
                    }
                }
                StringBuilder n11 = p5.c.n(str, ":");
                n11.append(this.f22552e.f22421a);
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
        this.f22552e.getClass();
        s sVar4 = this.f22552e;
        if (sVar4.f22422b) {
            if (sVar4.f22424e != null) {
                imageReceiver.H0(0, 0, false);
                imageReceiver.v0(fc.o(this.f22552e.f22424e), "g", null, j3, null, j3, null, 0L, null, null, 0);
            } else if (sVar4.b() && (document = this.f22552e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Z0 = org.telegram.messenger.g0.Z0(false);
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i10 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.PhotoSize photoSize3 = arrayList.get(i11);
                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.f28517w, photoSize3.h) - Z0)) < i10) {
                            photoSize = photoSize3;
                            i10 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f22552e.h.thumbs;
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
                imageReceiver.H0(0, 0, false);
                imageReceiver.v0(fc.b(this.f22552e.h), "g", fc.c(photoSize, this.f22552e.h), j3, fc.c(photoSize2, this.f22552e.h), j3, null, 0L, null, this.f22552e.h, 0);
            } else {
                imageReceiver.x0(null);
            }
        } else if (sVar4.f22424e != null) {
            imageReceiver.H0(sVar4.f22430l, sVar4.f22431m, true);
            imageReceiver.r0(fc.g(this.f22552e.f22424e), j3, null, null, null, 0);
        } else if (sVar4.b() && (photo = this.f22552e.f22426g) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = w7.w(this.f22552e.f22426g.sizes, 100, false, null, false);
            imageReceiver.H0(0, 0, false);
            imageReceiver.s0(fc.i(w10, this.f22552e.f22426g), j3, fc.i(w11, this.f22552e.f22426g), j3, null, 0L, null, this.f22552e.f22426g, 0);
        } else {
            imageReceiver.x0(null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n10;
        if (c() && (n10 = (imageReceiver = this.f22549a).n()) != null && !n10.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f22550b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 != this.f22551c || imageReceiver2.n() == null)) {
                this.f22551c = n10;
                imageReceiver2.w0(Utilities.D(n10, false));
                if (f22548f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                    f22548f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.f22751p1 = f22548f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        s sVar = this.f22552e;
        if (sVar != null) {
            if (sVar.f22424e != null || sVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.f22552e;
        if (sVar != null && !sVar.f22422b && !sVar.b()) {
            int i7 = this.f22552e.f22430l;
            if (i7 == 90 || i7 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
