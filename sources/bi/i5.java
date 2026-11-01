package bi;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class i5 {
    public static ColorMatrixColorFilter f3098f;
    public final ImageReceiver f3099a;
    public final ImageReceiver f3100b;
    public Bitmap f3101c;
    public final RadialProgress2 d;
    public w e;

    public i5(f5 f5Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f3099a = new ImageReceiver(f5Var);
        this.f3100b = new ImageReceiver(f5Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(f5Var, p6Var);
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
        w wVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f3099a;
        if (wVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i10 = org.telegram.messenger.i0.f16172q.x;
        String i11 = a1.g.i(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        w wVar2 = this.e;
        if (wVar2 == null) {
            sb2 = "null";
        } else {
            if (wVar2.f3417b) {
                str = "v";
            } else if (wVar2.f3418c) {
                str = "a";
            } else {
                str = "p";
            }
            if (wVar2.e != null) {
                StringBuilder i12 = sc.e.i(str, ":local:");
                i12.append(this.e.e);
                sb2 = i12.toString();
            } else {
                long j10 = 0;
                if (wVar2.b()) {
                    w wVar3 = this.e;
                    TLRPC.Document document2 = wVar3.h;
                    if (document2 != null) {
                        j10 = document2.f19800id;
                    } else {
                        TLRPC.Photo photo2 = wVar3.f3420g;
                        if (photo2 != null) {
                            j10 = photo2.f19818id;
                        }
                    }
                }
                StringBuilder i13 = sc.e.i(str, ":");
                i13.append(this.e.f3416a);
                i13.append(":");
                i13.append(j10);
                sb2 = i13.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(i11);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        w wVar4 = this.e;
        if (wVar4.f3417b) {
            if (wVar4.e != null) {
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(jc.o(this.e.e), "g", null, i11, null, i11, null, 0L, null, null, 0);
            } else if (wVar4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Z0 = org.telegram.messenger.i0.Z0(false);
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i14 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        TLRPC.PhotoSize photoSize3 = arrayList.get(i15);
                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.f19819w, photoSize3.h) - Z0)) < i14) {
                            photoSize = photoSize3;
                            i14 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
                if (arrayList2 != null) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i16) instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize2 = arrayList2.get(i16);
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(jc.b(this.e.h), "g", jc.c(photoSize, this.e.h), i11, jc.c(photoSize2, this.e.h), i11, null, 0L, null, this.e.h, 0);
            } else {
                imageReceiver.w0(null);
            }
        } else if (wVar4.e != null) {
            imageReceiver.G0(wVar4.f3424l, wVar4.f3425m, true);
            imageReceiver.q0(jc.g(this.e.e), i11, null, null, null, 0);
        } else if (wVar4.b() && (photo = this.e.f3420g) != null) {
            TLRPC.PhotoSize w9 = b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
            TLRPC.PhotoSize w10 = b8.w(this.e.f3420g.sizes, 100, false, null, false);
            imageReceiver.G0(0, 0, false);
            imageReceiver.r0(jc.i(w9, this.e.f3420g), i11, jc.i(w10, this.e.f3420g), i11, null, 0L, null, this.e.f3420g, 0);
        } else {
            imageReceiver.w0(null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n10;
        if (c() && (n10 = (imageReceiver = this.f3099a).n()) != null && !n10.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f3100b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 != this.f3101c || imageReceiver2.n() == null)) {
                this.f3101c = n10;
                imageReceiver2.v0(Utilities.D(n10, false));
                if (f3098f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.i0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.i0.i(colorMatrix, 0.6f);
                    f3098f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.f14398o1 = f3098f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        w wVar = this.e;
        if (wVar != null) {
            if (wVar.e != null || wVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        w wVar = this.e;
        if (wVar != null && !wVar.f3417b && !wVar.b()) {
            int i10 = this.e.f3424l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
