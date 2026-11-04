package mi;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class w4 {
    public static ColorMatrixColorFilter f20005f;
    public final ImageReceiver f20006a;
    public final ImageReceiver f20007b;
    public Bitmap f20008c;
    public final RadialProgress2 d;
    public s f20009e;

    public w4(t4 t4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f20006a = new ImageReceiver(t4Var);
        this.f20007b = new ImageReceiver(t4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(t4Var, e6Var);
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
        s sVar = this.f20009e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f20006a;
        if (sVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i3 = org.telegram.messenger.g0.f22608q.x;
        String i10 = com.google.android.recaptcha.internal.a.i(i3, "_", i3);
        StringBuilder sb3 = new StringBuilder();
        s sVar2 = this.f20009e;
        if (sVar2 == null) {
            sb2 = "null";
        } else {
            if (sVar2.f19860b) {
                str = "v";
            } else if (sVar2.f19861c) {
                str = "a";
            } else {
                str = "p";
            }
            if (sVar2.f19862e != null) {
                StringBuilder h = t4.c.h(str, ":local:");
                h.append(this.f20009e.f19862e);
                sb2 = h.toString();
            } else {
                long j10 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.f20009e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j10 = document2.f27007id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.f19864g;
                        if (photo2 != null) {
                            j10 = photo2.f27025id;
                        }
                    }
                }
                StringBuilder h7 = t4.c.h(str, ":");
                h7.append(this.f20009e.f19859a);
                h7.append(":");
                h7.append(j10);
                sb2 = h7.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(i10);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.f20009e.getClass();
        s sVar4 = this.f20009e;
        if (sVar4.f19860b) {
            if (sVar4.f19862e != null) {
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(ac.o(this.f20009e.f19862e), "g", null, i10, null, i10, null, 0L, null, null, 0);
            } else if (sVar4.b() && (document = this.f20009e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Z0 = org.telegram.messenger.g0.Z0(false);
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize3 = arrayList.get(i12);
                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.f27026w, photoSize3.h) - Z0)) < i11) {
                            photoSize = photoSize3;
                            i11 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f20009e.h.thumbs;
                if (arrayList2 != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize2 = arrayList2.get(i13);
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(ac.b(this.f20009e.h), "g", ac.c(photoSize, this.f20009e.h), i10, ac.c(photoSize2, this.f20009e.h), i10, null, 0L, null, this.f20009e.h, 0);
            } else {
                imageReceiver.w0(null);
            }
        } else if (sVar4.f19862e != null) {
            imageReceiver.G0(sVar4.f19868l, sVar4.f19869m, true);
            imageReceiver.q0(ac.g(this.f20009e.f19862e), i10, null, null, null, 0);
        } else if (sVar4.b() && (photo = this.f20009e.f19864g) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = w7.w(this.f20009e.f19864g.sizes, 100, false, null, false);
            imageReceiver.G0(0, 0, false);
            imageReceiver.r0(ac.i(w10, this.f20009e.f19864g), i10, ac.i(w11, this.f20009e.f19864g), i10, null, 0L, null, this.f20009e.f19864g, 0);
        } else {
            imageReceiver.w0(null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n4;
        if (c() && (n4 = (imageReceiver = this.f20006a).n()) != null && !n4.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f20007b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n4 != this.f20008c || imageReceiver2.n() == null)) {
                this.f20008c = n4;
                imageReceiver2.v0(Utilities.D(n4, false));
                if (f20005f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                    f20005f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.f21261p1 = f20005f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        s sVar = this.f20009e;
        if (sVar != null) {
            if (sVar.f19862e != null || sVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.f20009e;
        if (sVar != null && !sVar.f19860b && !sVar.b()) {
            int i3 = this.f20009e.f19868l;
            if (i3 == 90 || i3 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
