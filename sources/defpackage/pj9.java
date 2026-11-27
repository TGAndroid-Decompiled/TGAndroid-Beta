package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class pj9 {
    public static ColorMatrixColorFilter f;
    public final ImageReceiver a;
    public final ImageReceiver b;
    public Bitmap c;
    public final RadialProgress2 d;
    public p07 e;

    public pj9(mj9 mj9Var, vnb vnbVar) {
        this.a = new ImageReceiver(mj9Var);
        this.b = new ImageReceiver(mj9Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(mj9Var, vnbVar);
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
        p07 p07Var = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.a;
        if (p07Var == null) {
            imageReceiver.g0(null);
            return;
        }
        int i = hl.q.x;
        String m = qd4.m(i, i, "_");
        StringBuilder sb2 = new StringBuilder();
        p07 p07Var2 = this.e;
        if (p07Var2 == null) {
            sb = "null";
        } else {
            if (p07Var2.b) {
                str = "v";
            } else if (p07Var2.c) {
                str = "a";
            } else {
                str = "p";
            }
            if (p07Var2.e != null) {
                StringBuilder l = c00.l(str, ":local:");
                l.append(this.e.e);
                sb = l.toString();
            } else {
                long j = 0;
                if (p07Var2.b()) {
                    p07 p07Var3 = this.e;
                    TLRPC.Document document2 = p07Var3.h;
                    if (document2 != null) {
                        j = document2.id;
                    } else {
                        TLRPC.Photo photo2 = p07Var3.g;
                        if (photo2 != null) {
                            j = photo2.id;
                        }
                    }
                }
                StringBuilder l2 = c00.l(str, ":");
                l2.append((int) this.e.a);
                l2.append(":");
                l2.append(j);
                sb = l2.toString();
            }
        }
        sb2.append(sb);
        sb2.append("@");
        sb2.append(m);
        if (sb2.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        p07 p07Var4 = this.e;
        boolean z = p07Var4.b;
        String str2 = p07Var4.e;
        if (z) {
            if (str2 != null) {
                imageReceiver.o0(0, 0, false);
                imageReceiver.Y(jn5.o(this.e.e), "g", null, m, null, m, null, 0L, null, null, 0);
            } else if (p07Var4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Y0 = hl.Y0(false);
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
                imageReceiver.Y(jn5.b(this.e.h), "g", jn5.c(photoSize, this.e.h), m, jn5.c(photoSize2, this.e.h), m, null, 0L, null, this.e.h, 0);
            } else {
                imageReceiver.g0(null);
            }
        } else if (str2 != null) {
            imageReceiver.o0(p07Var4.l, p07Var4.m, true);
            imageReceiver.d0(jn5.g(this.e.e), m, null, null, null, 0);
        } else if (p07Var4.b() && (photo = this.e.g) != null) {
            TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(this.e.g.sizes, 100, false, null, false);
            imageReceiver.o0(0, 0, false);
            imageReceiver.Z(jn5.i(w, this.e.g), m, jn5.i(w2, this.e.g), m, null, 0L, null, this.e.g, 0);
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
                    hl.l2(colorMatrix, 0.9f);
                    hl.i(colorMatrix, 0.6f);
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
        p07 p07Var = this.e;
        if (p07Var != null) {
            if (p07Var.e != null || p07Var.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        p07 p07Var = this.e;
        if (p07Var != null && !p07Var.b && !p07Var.b()) {
            int i = this.e.l;
            if (i == 90 || i == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
