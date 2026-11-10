package li;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.RadialProgress2;
public final class v4 {
    public static ColorMatrixColorFilter f18948f;
    public final ImageReceiver f18949a;
    public final ImageReceiver f18950b;
    public Bitmap f18951c;
    public final RadialProgress2 d;
    public s f18952e;

    public v4(s4 s4Var, h6 h6Var) {
        this.f18949a = new ImageReceiver(s4Var);
        this.f18950b = new ImageReceiver(s4Var);
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
        s sVar = this.f18952e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f18949a;
        if (sVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i7 = org.telegram.messenger.g0.f22567q.x;
        String j3 = com.google.android.recaptcha.internal.a.j(i7, "_", i7);
        StringBuilder sb3 = new StringBuilder();
        s sVar2 = this.f18952e;
        if (sVar2 == null) {
            sb2 = "null";
        } else {
            if (sVar2.f18818b) {
                str = "v";
            } else if (sVar2.f18819c) {
                str = "a";
            } else {
                str = "p";
            }
            if (sVar2.f18820e != null) {
                StringBuilder j10 = rf.b.j(str, ":local:");
                j10.append(this.f18952e.f18820e);
                sb2 = j10.toString();
            } else {
                long j11 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.f18952e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j11 = document2.f26966id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.f18822g;
                        if (photo2 != null) {
                            j11 = photo2.f26984id;
                        }
                    }
                }
                StringBuilder j12 = rf.b.j(str, ":");
                j12.append(this.f18952e.f18817a);
                j12.append(":");
                j12.append(j11);
                sb2 = j12.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(j3);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.f18952e.getClass();
        s sVar4 = this.f18952e;
        if (sVar4.f18818b) {
            if (sVar4.f18820e != null) {
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(hc.o(this.f18952e.f18820e), "g", null, j3, null, j3, null, 0L, null, null, 0);
            } else if (sVar4.b() && (document = this.f18952e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Z0 = org.telegram.messenger.g0.Z0(false);
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i10 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.PhotoSize photoSize3 = arrayList.get(i11);
                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.f26985w, photoSize3.h) - Z0)) < i10) {
                            photoSize = photoSize3;
                            i10 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f18952e.h.thumbs;
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
                imageReceiver.u0(hc.b(this.f18952e.h), "g", hc.c(photoSize, this.f18952e.h), j3, hc.c(photoSize2, this.f18952e.h), j3, null, 0L, null, this.f18952e.h, 0);
            } else {
                imageReceiver.w0(null);
            }
        } else if (sVar4.f18820e != null) {
            imageReceiver.G0(sVar4.f18826l, sVar4.f18827m, true);
            imageReceiver.q0(hc.g(this.f18952e.f18820e), j3, null, null, null, 0);
        } else if (sVar4.b() && (photo = this.f18952e.f18822g) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = w7.w(this.f18952e.f18822g.sizes, 100, false, null, false);
            imageReceiver.G0(0, 0, false);
            imageReceiver.r0(hc.i(w10, this.f18952e.f18822g), j3, hc.i(w11, this.f18952e.f18822g), j3, null, 0L, null, this.f18952e.f18822g, 0);
        } else {
            imageReceiver.w0(null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n10;
        if (c() && (n10 = (imageReceiver = this.f18949a).n()) != null && !n10.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f18950b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 != this.f18951c || imageReceiver2.n() == null)) {
                this.f18951c = n10;
                imageReceiver2.v0(Utilities.D(n10, false));
                if (f18948f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                    f18948f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.f21214o1 = f18948f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        s sVar = this.f18952e;
        if (sVar != null) {
            if (sVar.f18820e != null || sVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.f18952e;
        if (sVar != null && !sVar.f18818b && !sVar.b()) {
            int i7 = this.f18952e.f18826l;
            if (i7 == 90 || i7 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
