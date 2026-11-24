package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class ci9 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public i07 e;

    public ci9(zh9 zh9Var, ylb ylbVar) {
        this.a = new ImageReceiver(zh9Var);
        this.b = new ImageReceiver(zh9Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(zh9Var, ylbVar);
        this.d = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void a() {
        String str;
        String sb;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int abs;
        i07 i07Var = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.a;
        if (i07Var == null) {
            imageReceiver.g0(null);
            return;
        }
        int i = gm.q.x;
        String n = td4.n(i, i, "_");
        StringBuilder sb2 = new StringBuilder();
        i07 i07Var2 = this.e;
        if (i07Var2 == null) {
            sb = "null";
        } else {
            if (i07Var2.b) {
                str = "v";
            } else if (i07Var2.c) {
                str = "a";
            } else {
                str = "p";
            }
            if (i07Var2.e != null) {
                StringBuilder k = b10.k(str, ":local:");
                k.append(this.e.e);
                sb = k.toString();
            } else {
                long j = 0;
                if (i07Var2.b()) {
                    i07 i07Var3 = this.e;
                    TLRPC.Document document2 = i07Var3.h;
                    if (document2 != null) {
                        j = document2.id;
                    } else {
                        TLRPC.Photo photo2 = i07Var3.g;
                        if (photo2 != null) {
                            j = photo2.id;
                        }
                    }
                }
                StringBuilder k2 = b10.k(str, ":");
                k2.append((int) this.e.a);
                k2.append(":");
                k2.append(j);
                sb = k2.toString();
            }
        }
        sb2.append(sb);
        sb2.append("@");
        sb2.append(n);
        if (sb2.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        i07 i07Var4 = this.e;
        boolean z = i07Var4.b;
        String str2 = i07Var4.e;
        if (z) {
            if (str2 != null) {
                imageReceiver.o0(0, 0, false);
                imageReceiver.Y(gn5.o(this.e.e), "g", null, n, null, n, null, 0L, null, null, 0);
            } else if (i07Var4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Y0 = gm.Y0(false);
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i2 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        TLRPC.PhotoSize photoSize3 = arrayList.get(i3);
                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.w, photoSize3.h) - Y0)) < i2) {
                            photoSize = photoSize3;
                            i2 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
                if (arrayList2 != null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i4) instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize2 = arrayList2.get(i4);
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                imageReceiver.o0(0, 0, false);
                imageReceiver.Y(gn5.b(this.e.h), "g", gn5.c(photoSize, this.e.h), n, gn5.c(photoSize2, this.e.h), n, null, 0L, null, this.e.h, 0);
            } else {
                imageReceiver.g0(null);
            }
        } else if (str2 != null) {
            imageReceiver.o0(i07Var4.l, i07Var4.m, true);
            imageReceiver.d0(gn5.g(this.e.e), n, null, null, null, 0);
        } else if (i07Var4.b() && (photo = this.e.g) != null) {
            TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.Y0(false), false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(this.e.g.sizes, 100, false, null, false);
            imageReceiver.o0(0, 0, false);
            imageReceiver.Z(gn5.i(w, this.e.g), n, gn5.i(w2, this.e.g), n, null, 0L, null, this.e.g, 0);
        } else {
            imageReceiver.g0(null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n;
        if (c() && (n = (imageReceiver = this.a).n()) != null && !n.isRecycled()) {
            ImageReceiver imageReceiver2 = this.b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n != this.c || imageReceiver2.n() == null)) {
                this.c = n;
                imageReceiver2.f0(Utilities.D(n, false));
                ColorMatrixColorFilter colorMatrixColorFilter = f;
                if (colorMatrixColorFilter == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    gm.l2(colorMatrix, 0.9f);
                    gm.i(colorMatrix, 0.6f);
                    ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
                    f = colorMatrixColorFilter2;
                    colorMatrixColorFilter = colorMatrixColorFilter2;
                }
                imageReceiver2.p1 = colorMatrixColorFilter;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        i07 i07Var = this.e;
        if (i07Var != null) {
            if (i07Var.e != null || i07Var.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        i07 i07Var = this.e;
        if (i07Var != null && !i07Var.b && !i07Var.b()) {
            int i = this.e.l;
            if (i == 90 || i == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
