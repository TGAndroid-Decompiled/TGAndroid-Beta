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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadialProgress2;
public final class v4 {
    public static ColorMatrixColorFilter f18943f;
    public final ImageReceiver f18944a;
    public final ImageReceiver f18945b;
    public Bitmap f18946c;
    public final RadialProgress2 d;
    public s f18947e;

    public v4(s4 s4Var, g6 g6Var) {
        this.f18944a = new ImageReceiver(s4Var);
        this.f18945b = new ImageReceiver(s4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(s4Var, g6Var);
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
        s sVar = this.f18947e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f18944a;
        if (sVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i7 = org.telegram.messenger.g0.f22563q.x;
        String j3 = com.google.android.recaptcha.internal.a.j(i7, "_", i7);
        StringBuilder sb3 = new StringBuilder();
        s sVar2 = this.f18947e;
        if (sVar2 == null) {
            sb2 = "null";
        } else {
            if (sVar2.f18815b) {
                str = "v";
            } else if (sVar2.f18816c) {
                str = "a";
            } else {
                str = "p";
            }
            if (sVar2.f18817e != null) {
                StringBuilder j10 = rf.b.j(str, ":local:");
                j10.append(this.f18947e.f18817e);
                sb2 = j10.toString();
            } else {
                long j11 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.f18947e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j11 = document2.f26962id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.f18819g;
                        if (photo2 != null) {
                            j11 = photo2.f26980id;
                        }
                    }
                }
                StringBuilder j12 = rf.b.j(str, ":");
                j12.append(this.f18947e.f18814a);
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
        this.f18947e.getClass();
        s sVar4 = this.f18947e;
        if (sVar4.f18815b) {
            if (sVar4.f18817e != null) {
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(hc.o(this.f18947e.f18817e), "g", null, j3, null, j3, null, 0L, null, null, 0);
            } else if (sVar4.b() && (document = this.f18947e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Z0 = org.telegram.messenger.g0.Z0(false);
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i10 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.PhotoSize photoSize3 = arrayList.get(i11);
                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.f26981w, photoSize3.h) - Z0)) < i10) {
                            photoSize = photoSize3;
                            i10 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f18947e.h.thumbs;
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
                imageReceiver.u0(hc.b(this.f18947e.h), "g", hc.c(photoSize, this.f18947e.h), j3, hc.c(photoSize2, this.f18947e.h), j3, null, 0L, null, this.f18947e.h, 0);
            } else {
                imageReceiver.w0(null);
            }
        } else if (sVar4.f18817e != null) {
            imageReceiver.G0(sVar4.f18823l, sVar4.f18824m, true);
            imageReceiver.q0(hc.g(this.f18947e.f18817e), j3, null, null, null, 0);
        } else if (sVar4.b() && (photo = this.f18947e.f18819g) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = w7.w(this.f18947e.f18819g.sizes, 100, false, null, false);
            imageReceiver.G0(0, 0, false);
            imageReceiver.r0(hc.i(w10, this.f18947e.f18819g), j3, hc.i(w11, this.f18947e.f18819g), j3, null, 0L, null, this.f18947e.f18819g, 0);
        } else {
            imageReceiver.w0(null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n10;
        if (c() && (n10 = (imageReceiver = this.f18944a).n()) != null && !n10.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f18945b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 != this.f18946c || imageReceiver2.n() == null)) {
                this.f18946c = n10;
                imageReceiver2.v0(Utilities.D(n10, false));
                if (f18943f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                    f18943f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.f21209o1 = f18943f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        s sVar = this.f18947e;
        if (sVar != null) {
            if (sVar.f18817e != null || sVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.f18947e;
        if (sVar != null && !sVar.f18815b && !sVar.b()) {
            int i7 = this.f18947e.f18823l;
            if (i7 == 90 || i7 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
