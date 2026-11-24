package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
import org.telegram.ui.PhotoViewer;
public final class l68 implements Runnable {
    public final byte a;
    public final PhotoViewer b;

    public l68(PhotoViewer photoViewer, byte b) {
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
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.o2(1, false);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer2.o2(-1, false);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.f9;
                photoViewer3.n2(0);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer4.H0();
                return;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.f9;
                photoViewer5.E1.b(photoViewer5.J2, photoViewer5.K2, photoViewer5.L2, photoViewer5.P2, photoViewer5.R2, photoViewer5.O2, photoViewer5.y1(true), photoViewer5.y1(true), photoViewer5.M2, photoViewer5.N2, 0.0f, 0.0f, photoViewer5.Q2);
                photoViewer5.n2(0);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.f9;
                photoViewer6.q5.b.setLoading(false);
                photoViewer6.n2(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.f9;
                photoViewer7.q5.b.setLoading(false);
                photoViewer7.n2(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.f9;
                photoViewer8.s(false);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.f9;
                photoViewer9.p5.W = false;
                return;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.f9;
                photoViewer10.e();
                return;
            case 10:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.f9;
                photoViewer11.y4.setBackground(null);
                return;
            case 11:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.f9;
                photoViewer12.i7 = null;
                photoViewer12.e();
                photoViewer12.n2(0);
                return;
            case 12:
                PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.f9;
                if (photoViewer13.G3 == 2) {
                    photoViewer13.s(false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.f9;
                photoViewer14.n2(0);
                return;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.f9;
                photoViewer15.q5.b.setLoading(false);
                photoViewer15.n2(0);
                return;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.f9;
                photoViewer16.q5.b.setLoading(false);
                photoViewer16.n2(0);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr17 = PhotoViewer.f9;
                photoViewer17.c();
                return;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr18 = PhotoViewer.f9;
                photoViewer18.C2();
                return;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr19 = PhotoViewer.f9;
                photoViewer19.x2(true);
                return;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr20 = PhotoViewer.f9;
                if (photoViewer20.w0.isEnabled()) {
                    Activity activity = photoViewer20.E;
                    Typeface typeface = gl.a;
                    if (Settings.canDrawOverlays(activity) && mb3.c().a() == null && photoViewer20.P3) {
                        if (photoViewer20.t4) {
                            x88 x88Var = photoViewer20.g0;
                            if (x88Var != null && !x88Var.c() && photoViewer20.g0.d()) {
                                photoViewer20.K3 = false;
                                if (PhotoViewer.m9 != null) {
                                    PhotoViewer.m9.M();
                                }
                                photoViewer20.J3 = true;
                                PhotoViewer.m9 = PhotoViewer.l9;
                                PhotoViewer.l9 = null;
                                photoViewer20.e = false;
                                p98 p98Var = photoViewer20.d5;
                                if (p98Var != null) {
                                    ImageReceiver imageReceiver = p98Var.a;
                                    if (!imageReceiver.R0) {
                                        imageReceiver.v0(true, true);
                                    }
                                }
                                photoViewer20.m6 = 1.0f;
                                photoViewer20.f0.invalidate();
                                photoViewer20.P();
                                return;
                            }
                            return;
                        }
                        photoViewer20.K3 = false;
                        photoViewer20.q2();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr21 = PhotoViewer.f9;
                if (photoViewer21.e && photoViewer21.n4 == 0) {
                    photoViewer21.G2(photoViewer21.K);
                    return;
                }
                return;
            case 21:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr22 = PhotoViewer.f9;
                photoViewer22.G0();
                return;
            case 22:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr23 = PhotoViewer.f9;
                photoViewer23.K2();
                return;
            case 23:
                PhotoViewer photoViewer24 = this.b;
                lbc lbcVar = photoViewer24.G2;
                if (lbcVar != null && photoViewer24.a6 <= 1.35f) {
                    long S = lbcVar.S();
                    long U = photoViewer24.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f = photoViewer24.K7;
                        int i0 = photoViewer24.i0(photoViewer24.u4);
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
                        photoViewer24.c4.startRewind(photoViewer24.G2, z, photoViewer24.K7, photoViewer24.u1, photoViewer24.B1);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr24 = PhotoViewer.f9;
                photoViewer25.b9 = false;
                photoViewer25.H0();
                return;
            case 25:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr25 = PhotoViewer.f9;
                if (photoViewer26.U4.isPopupShown()) {
                    VideoAds videoAds = photoViewer26.U4;
                    lbc lbcVar2 = photoViewer26.G2;
                    if (lbcVar2 != null) {
                        z2 = lbcVar2.c0();
                    }
                    videoAds.videoWasPlaying = z2;
                    lbc lbcVar3 = photoViewer26.G2;
                    if (lbcVar3 != null) {
                        lbcVar3.f0();
                        return;
                    }
                    return;
                }
                lbc lbcVar4 = photoViewer26.G2;
                if (lbcVar4 != null && photoViewer26.U4.videoWasPlaying) {
                    lbcVar4.g0();
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr26 = PhotoViewer.f9;
                v48 v48Var = photoViewer27.D1;
                b33 b33Var = v48Var.c;
                b33Var.b(0.0f);
                b33Var.setMirrored(false);
                b33Var.setRotated(false);
                v48Var.b.l(true);
                return;
            case 27:
                PhotoViewer photoViewer28 = this.b;
                Drawable[] drawableArr27 = PhotoViewer.f9;
                photoViewer28.M2();
                return;
            case 28:
                PhotoViewer photoViewer29 = this.b;
                Drawable[] drawableArr28 = PhotoViewer.f9;
                photoViewer29.E1(true, 0, 0, false, true, false);
                return;
            default:
                PhotoViewer photoViewer30 = this.b;
                Drawable[] drawableArr29 = PhotoViewer.f9;
                photoViewer30.E1(true, 0, 0, false, false, false);
                return;
        }
    }
}
