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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.RadialProgress2;
public final class v4 {
    public static ColorMatrixColorFilter f22478f;
    public final ImageReceiver f22479a;
    public final ImageReceiver f22480b;
    public Bitmap f22481c;
    public final RadialProgress2 d;
    public r f22482e;

    public v4(s4 s4Var, h6 h6Var) {
        this.f22479a = new ImageReceiver(s4Var);
        this.f22480b = new ImageReceiver(s4Var);
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
        r rVar = this.f22482e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f22479a;
        if (rVar == null) {
            imageReceiver.w0(null);
            return;
        }
        int i7 = org.telegram.messenger.g0.f24146q.x;
        String j3 = com.google.android.gms.internal.vision.e2.j(i7, "_", i7);
        StringBuilder sb3 = new StringBuilder();
        r rVar2 = this.f22482e;
        if (rVar2 == null) {
            sb2 = "null";
        } else {
            if (rVar2.f22342b) {
                str = "v";
            } else if (rVar2.f22343c) {
                str = "a";
            } else {
                str = "p";
            }
            if (rVar2.f22344e != null) {
                StringBuilder n10 = p5.c.n(str, ":local:");
                n10.append(this.f22482e.f22344e);
                sb2 = n10.toString();
            } else {
                long j10 = 0;
                if (rVar2.b()) {
                    r rVar3 = this.f22482e;
                    TLRPC.Document document2 = rVar3.h;
                    if (document2 != null) {
                        j10 = document2.f28437id;
                    } else {
                        TLRPC.Photo photo2 = rVar3.f22346g;
                        if (photo2 != null) {
                            j10 = photo2.f28455id;
                        }
                    }
                }
                StringBuilder n11 = p5.c.n(str, ":");
                n11.append(this.f22482e.f22341a);
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
        this.f22482e.getClass();
        r rVar4 = this.f22482e;
        if (rVar4.f22342b) {
            if (rVar4.f22344e != null) {
                imageReceiver.G0(0, 0, false);
                imageReceiver.u0(fc.o(this.f22482e.f22344e), "g", null, j3, null, j3, null, 0L, null, null, 0);
            } else if (rVar4.b() && (document = this.f22482e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int Z0 = org.telegram.messenger.g0.Z0(false);
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i10 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.PhotoSize photoSize3 = arrayList.get(i11);
                        if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize3.f28456w, photoSize3.h) - Z0)) < i10) {
                            photoSize = photoSize3;
                            i10 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f22482e.h.thumbs;
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
                imageReceiver.u0(fc.b(this.f22482e.h), "g", fc.c(photoSize, this.f22482e.h), j3, fc.c(photoSize2, this.f22482e.h), j3, null, 0L, null, this.f22482e.h, 0);
            } else {
                imageReceiver.w0(null);
            }
        } else if (rVar4.f22344e != null) {
            imageReceiver.G0(rVar4.f22350l, rVar4.f22351m, true);
            imageReceiver.q0(fc.g(this.f22482e.f22344e), j3, null, null, null, 0);
        } else if (rVar4.b() && (photo = this.f22482e.f22346g) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = w7.w(this.f22482e.f22346g.sizes, 100, false, null, false);
            imageReceiver.G0(0, 0, false);
            imageReceiver.r0(fc.i(w10, this.f22482e.f22346g), j3, fc.i(w11, this.f22482e.f22346g), j3, null, 0L, null, this.f22482e.f22346g, 0);
        } else {
            imageReceiver.w0(null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap n10;
        if (c() && (n10 = (imageReceiver = this.f22479a).n()) != null && !n10.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f22480b;
            if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 != this.f22481c || imageReceiver2.n() == null)) {
                this.f22481c = n10;
                imageReceiver2.v0(Utilities.D(n10, false));
                if (f22478f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                    f22478f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.f22681p1 = f22478f;
            }
            if (imageReceiver2.n() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        r rVar = this.f22482e;
        if (rVar != null) {
            if (rVar.f22344e != null || rVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        r rVar = this.f22482e;
        if (rVar != null && !rVar.f22342b && !rVar.b()) {
            int i7 = this.f22482e.f22350l;
            if (i7 == 90 || i7 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
