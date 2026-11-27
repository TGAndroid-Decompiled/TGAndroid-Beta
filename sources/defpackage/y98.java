package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
import org.telegram.ui.PhotoViewer;
public final class y98 implements Runnable {
    public final byte a;
    public final PhotoViewer b;

    public y98(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.N2();
                return;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer2.o2(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer3.E1.b(photoViewer3.J2, photoViewer3.K2, photoViewer3.L2, photoViewer3.P2, photoViewer3.R2, photoViewer3.O2, photoViewer3.z1(true), photoViewer3.z1(true), photoViewer3.M2, photoViewer3.N2, 0.0f, 0.0f, photoViewer3.Q2);
                photoViewer3.o2(0);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                if (photoViewer4.T4.isPopupShown()) {
                    VideoAds videoAds = photoViewer4.T4;
                    kfc kfcVar = photoViewer4.G2;
                    if (kfcVar != null) {
                        z2 = kfcVar.c0();
                    }
                    videoAds.videoWasPlaying = z2;
                    kfc kfcVar2 = photoViewer4.G2;
                    if (kfcVar2 != null) {
                        kfcVar2.f0();
                        return;
                    }
                    return;
                }
                kfc kfcVar3 = photoViewer4.G2;
                if (kfcVar3 != null && photoViewer4.T4.videoWasPlaying) {
                    kfcVar3.g0();
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                photoViewer5.p5.b.setLoading(false);
                photoViewer5.o2(0);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.d9;
                photoViewer6.p5.b.setLoading(false);
                photoViewer6.o2(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.d9;
                photoViewer7.e();
                return;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.d9;
                photoViewer8.p2(1, false);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.d9;
                photoViewer9.p2(-1, false);
                return;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.d9;
                photoViewer10.o5.W = false;
                return;
            case 10:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.d9;
                photoViewer11.I0();
                return;
            case 11:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.d9;
                photoViewer12.x4.setBackground(null);
                return;
            case 12:
                PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.d9;
                photoViewer13.h7 = null;
                photoViewer13.e();
                photoViewer13.o2(0);
                return;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.d9;
                photoViewer14.o2(0);
                return;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.d9;
                photoViewer15.q(false);
                return;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.d9;
                photoViewer16.p5.b.setLoading(false);
                photoViewer16.o2(0);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr17 = PhotoViewer.d9;
                photoViewer17.p5.b.setLoading(false);
                photoViewer17.o2(0);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr18 = PhotoViewer.d9;
                if (photoViewer18.G3 == 2) {
                    photoViewer18.q(false);
                    return;
                }
                return;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr19 = PhotoViewer.d9;
                photoViewer19.c();
                return;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr20 = PhotoViewer.d9;
                photoViewer20.D2();
                return;
            case 20:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr21 = PhotoViewer.d9;
                photoViewer21.y2(true);
                return;
            case 21:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr22 = PhotoViewer.d9;
                if (photoViewer22.w0.isEnabled()) {
                    Activity activity = photoViewer22.E;
                    Typeface typeface = hl.a;
                    if (Settings.canDrawOverlays(activity) && fc3.b().a() == null && photoViewer22.P3) {
                        if (photoViewer22.s4) {
                            nc8 nc8Var = photoViewer22.g0;
                            if (nc8Var != null && !nc8Var.c() && photoViewer22.g0.d()) {
                                photoViewer22.K3 = false;
                                if (PhotoViewer.k9 != null) {
                                    PhotoViewer.k9.L();
                                }
                                photoViewer22.J3 = true;
                                PhotoViewer.k9 = PhotoViewer.j9;
                                PhotoViewer.j9 = null;
                                photoViewer22.e = false;
                                fd8 fd8Var = photoViewer22.c5;
                                if (fd8Var != null) {
                                    ImageReceiver imageReceiver = fd8Var.a;
                                    if (!imageReceiver.R0) {
                                        imageReceiver.v0(true, true);
                                    }
                                }
                                photoViewer22.l6 = 1.0f;
                                photoViewer22.f0.invalidate();
                                photoViewer22.O();
                                return;
                            }
                            return;
                        }
                        photoViewer22.K3 = false;
                        photoViewer22.r2();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr23 = PhotoViewer.d9;
                if (photoViewer23.e && photoViewer23.m4 == 0) {
                    photoViewer23.H2(photoViewer23.K);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr24 = PhotoViewer.d9;
                photoViewer24.H0();
                return;
            case 24:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr25 = PhotoViewer.d9;
                photoViewer25.L2();
                return;
            case 25:
                PhotoViewer photoViewer26 = this.b;
                kfc kfcVar4 = photoViewer26.G2;
                if (kfcVar4 != null && photoViewer26.Z5 <= 1.35f) {
                    long S = kfcVar4.S();
                    long U = photoViewer26.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f = photoViewer26.J7;
                        int h0 = photoViewer26.h0(photoViewer26.t4);
                        if (U > 180000) {
                            int i = h0 / 3;
                            if (f < (i << 1)) {
                                if (f < i) {
                                    z2 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer26.a4.startRewind(photoViewer26.G2, z2, photoViewer26.u1);
                            return;
                        }
                        if (f > h0 / 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        photoViewer26.c4.startRewind(photoViewer26.G2, z, photoViewer26.J7, photoViewer26.u1, photoViewer26.B1);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr26 = PhotoViewer.d9;
                photoViewer27.a9 = false;
                photoViewer27.I0();
                return;
            case 27:
                PhotoViewer photoViewer28 = this.b;
                Drawable[] drawableArr27 = PhotoViewer.d9;
                k88 k88Var = photoViewer28.D1;
                t33 t33Var = k88Var.c;
                t33Var.b(0.0f);
                t33Var.setMirrored(false);
                t33Var.setRotated(false);
                k88Var.b.l(true);
                return;
            case 28:
                PhotoViewer photoViewer29 = this.b;
                Drawable[] drawableArr28 = PhotoViewer.d9;
                photoViewer29.F1(true, 0, 0, false, true, false);
                return;
            default:
                PhotoViewer photoViewer30 = this.b;
                Drawable[] drawableArr29 = PhotoViewer.d9;
                photoViewer30.F1(true, 0, 0, false, false, false);
                return;
        }
    }
}
