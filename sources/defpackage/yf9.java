package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class yf9 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public iy6 e;

    public yf9(vf9 vf9Var, wjb wjbVar) {
        this.a = new ImageReceiver(vf9Var);
        this.b = new ImageReceiver(vf9Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(vf9Var, wjbVar);
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
        iy6 iy6Var = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.a;
        if (iy6Var == null) {
            imageReceiver.g0(null);
            return;
        }
        int i = gl.q.x;
        String m = tb4.m(i, i, "_");
        StringBuilder sb2 = new StringBuilder();
        iy6 iy6Var2 = this.e;
        if (iy6Var2 == null) {
            sb = "null";
        } else {
            if (iy6Var2.b) {
                str = "v";
            } else if (iy6Var2.c) {
                str = "a";
            } else {
                str = "p";
            }
            if (iy6Var2.e != null) {
                StringBuilder k = b00.k(str, ":local:");
                k.append(this.e.e);
                sb = k.toString();
            } else {
                long j = 0;
                if (iy6Var2.b()) {
                    iy6 iy6Var3 = this.e;
                    TLRPC.Document document2 = iy6Var3.h;
                    if (document2 != null) {
                        j = document2.id;
                    } else {
                        TLRPC.Photo photo2 = iy6Var3.g;
                        if (photo2 != null) {
                            j = photo2.id;
                        }
                    }
                }
                StringBuilder k2 = b00.k(str, ":");
                k2.append((int) this.e.a);
                k2.append(":");
                k2.append(j);
                sb = k2.toString();
            }
        }
        sb2.append(sb);
        sb2.append("@");
        sb2.append(m);
        if (sb2.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        iy6 iy6Var4 = this.e;
        boolean z = iy6Var4.b;
        String str2 = iy6Var4.e;
        if (z) {
            if (str2 != null) {
                imageReceiver.o0(0, 0, false);
                imageReceiver.Y(gl5.o(this.e.e), "g", null, m, null, m, null, 0L, null, null, 0);
            } else if (iy6Var4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Y0 = gl.Y0(false);
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
                imageReceiver.Y(gl5.b(this.e.h), "g", gl5.c(photoSize, this.e.h), m, gl5.c(photoSize2, this.e.h), m, null, 0L, null, this.e.h, 0);
            } else {
                imageReceiver.g0(null);
            }
        } else if (str2 != null) {
            imageReceiver.o0(iy6Var4.l, iy6Var4.m, true);
            imageReceiver.d0(gl5.g(this.e.e), m, null, null, null, 0);
        } else if (iy6Var4.b() && (photo = this.e.g) != null) {
            TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.Y0(false), false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(this.e.g.sizes, 100, false, null, false);
            imageReceiver.o0(0, 0, false);
            imageReceiver.Z(gl5.i(w, this.e.g), m, gl5.i(w2, this.e.g), m, null, 0L, null, this.e.g, 0);
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
                    gl.l2(colorMatrix, 0.9f);
                    gl.i(colorMatrix, 0.6f);
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
        iy6 iy6Var = this.e;
        if (iy6Var != null) {
            if (iy6Var.e != null || iy6Var.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        iy6 iy6Var = this.e;
        if (iy6Var != null && !iy6Var.b && !iy6Var.b()) {
            int i = this.e.l;
            if (i == 90 || i == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
