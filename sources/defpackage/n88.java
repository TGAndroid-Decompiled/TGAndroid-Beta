package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
import org.telegram.ui.PhotoViewer;
public final class n88 implements Runnable {
    public final byte a;
    public final PhotoViewer b;

    public n88(PhotoViewer photoViewer, byte b) {
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
                photoViewer.p2(1, false);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer2.p2(-1, false);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer3.o2(0);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer4.I0();
                return;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                photoViewer5.E1.b(photoViewer5.J2, photoViewer5.K2, photoViewer5.L2, photoViewer5.P2, photoViewer5.R2, photoViewer5.O2, photoViewer5.z1(true), photoViewer5.z1(true), photoViewer5.M2, photoViewer5.N2, 0.0f, 0.0f, photoViewer5.Q2);
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
                photoViewer7.p5.b.setLoading(false);
                photoViewer7.o2(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.d9;
                photoViewer8.e();
                return;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.d9;
                photoViewer9.q(false);
                return;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.d9;
                photoViewer10.o5.W = false;
                return;
            case 10:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.d9;
                photoViewer11.x4.setBackground(null);
                return;
            case 11:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.d9;
                photoViewer12.h7 = null;
                photoViewer12.e();
                photoViewer12.o2(0);
                return;
            case 12:
                PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.d9;
                photoViewer13.o2(0);
                return;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.d9;
                photoViewer14.p5.b.setLoading(false);
                photoViewer14.o2(0);
                return;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.d9;
                photoViewer15.p5.b.setLoading(false);
                photoViewer15.o2(0);
                return;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.d9;
                if (photoViewer16.G3 == 2) {
                    photoViewer16.q(false);
                    return;
                }
                return;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr17 = PhotoViewer.d9;
                photoViewer17.c();
                return;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr18 = PhotoViewer.d9;
                photoViewer18.D2();
                return;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr19 = PhotoViewer.d9;
                photoViewer19.y2(true);
                return;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr20 = PhotoViewer.d9;
                if (photoViewer20.w0.isEnabled()) {
                    Activity activity = photoViewer20.E;
                    Typeface typeface = gm.a;
                    if (Settings.canDrawOverlays(activity) && yc3.c().a() == null && photoViewer20.P3) {
                        if (photoViewer20.s4) {
                            ya8 ya8Var = photoViewer20.g0;
                            if (ya8Var != null && !ya8Var.c() && photoViewer20.g0.d()) {
                                photoViewer20.K3 = false;
                                if (PhotoViewer.k9 != null) {
                                    PhotoViewer.k9.L();
                                }
                                photoViewer20.J3 = true;
                                PhotoViewer.k9 = PhotoViewer.j9;
                                PhotoViewer.j9 = null;
                                photoViewer20.e = false;
                                qb8 qb8Var = photoViewer20.c5;
                                if (qb8Var != null) {
                                    ImageReceiver imageReceiver = qb8Var.a;
                                    if (!imageReceiver.R0) {
                                        imageReceiver.v0(true, true);
                                    }
                                }
                                photoViewer20.l6 = 1.0f;
                                photoViewer20.f0.invalidate();
                                photoViewer20.O();
                                return;
                            }
                            return;
                        }
                        photoViewer20.K3 = false;
                        photoViewer20.r2();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr21 = PhotoViewer.d9;
                if (photoViewer21.e && photoViewer21.m4 == 0) {
                    photoViewer21.H2(photoViewer21.K);
                    return;
                }
                return;
            case 21:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr22 = PhotoViewer.d9;
                photoViewer22.H0();
                return;
            case 22:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr23 = PhotoViewer.d9;
                photoViewer23.L2();
                return;
            case 23:
                PhotoViewer photoViewer24 = this.b;
                ndc ndcVar = photoViewer24.G2;
                if (ndcVar != null && photoViewer24.Z5 <= 1.35f) {
                    long S = ndcVar.S();
                    long U = photoViewer24.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f = photoViewer24.J7;
                        int i0 = photoViewer24.i0(photoViewer24.t4);
                        if (U > 180000) {
                            int i = i0 / 3;
                            if (f < (i << 1)) {
                                if (f < i) {
                                    z2 = false;
                                } else {
                                    return;
                                }
                            }
                            photoViewer24.a4.startRewind(photoViewer24.G2, z2, photoViewer24.u1);
                            return;
                        }
                        if (f > i0 / 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        photoViewer24.c4.startRewind(photoViewer24.G2, z, photoViewer24.J7, photoViewer24.u1, photoViewer24.B1);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr24 = PhotoViewer.d9;
                photoViewer25.a9 = false;
                photoViewer25.I0();
                return;
            case 25:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr25 = PhotoViewer.d9;
                if (photoViewer26.T4.isPopupShown()) {
                    VideoAds videoAds = photoViewer26.T4;
                    ndc ndcVar2 = photoViewer26.G2;
                    if (ndcVar2 != null) {
                        z2 = ndcVar2.c0();
                    }
                    videoAds.videoWasPlaying = z2;
                    ndc ndcVar3 = photoViewer26.G2;
                    if (ndcVar3 != null) {
                        ndcVar3.f0();
                        return;
                    }
                    return;
                }
                ndc ndcVar4 = photoViewer26.G2;
                if (ndcVar4 != null && photoViewer26.T4.videoWasPlaying) {
                    ndcVar4.g0();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr26 = PhotoViewer.d9;
                x68 x68Var = photoViewer27.D1;
                m43 m43Var = x68Var.c;
                m43Var.b(0.0f);
                m43Var.setMirrored(false);
                m43Var.setRotated(false);
                x68Var.b.l(true);
                return;
            case 27:
                PhotoViewer photoViewer28 = this.b;
                Drawable[] drawableArr27 = PhotoViewer.d9;
                photoViewer28.N2();
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
