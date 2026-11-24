package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z;
public final class q78 implements o7, sa8 {
    public final PhotoViewer a;

    public q78(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override
    public final void A0(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.a;
        photoViewer.Y8 = false;
        try {
            z zVar = photoViewer.h0;
            if (zVar != null && zVar.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (photoViewer.E2) {
            lbc lbcVar = photoViewer.G2;
            if (lbcVar != null) {
                lbcVar.z0(null);
                photoViewer.G2.y0(photoViewer.D2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.C2;
        if (textureView != null && photoViewer.z2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            gl.B2(photoViewer.C2);
            photoViewer.z2.addView(photoViewer.C2, 0, nme.e(-1, -1, 17));
        }
    }

    @Override
    public final View C0() {
        if (a()) {
            return this.a.g0.getWebView();
        }
        return null;
    }

    @Override
    public final boolean F2() {
        if (a() && !this.a.g0.y) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean G0() {
        z zVar;
        PhotoViewer photoViewer = PhotoViewer.l9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer == photoViewer2 && photoViewer2.e && !photoViewer2.J3 && !photoViewer2.Y8 && (zVar = photoViewer2.h0) != null && zVar.getParent() != null) {
            PhotoViewer photoViewer3 = this.a;
            if (!photoViewer3.B3 && photoViewer3.n4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void H0(ya8 ya8Var) {
        PhotoViewer photoViewer = this.a;
        photoViewer.Y8 = true;
        if (photoViewer.E2) {
            lbc lbcVar = photoViewer.G2;
            if (lbcVar != null) {
                lbcVar.y0(null);
                photoViewer.G2.z0(null);
                photoViewer.G2.z0(ya8Var);
            }
        } else {
            TextureView textureView = photoViewer.C2;
            if (textureView != null) {
                photoViewer.W8 = ya8Var;
                gl.B2(textureView);
                photoViewer.W8 = null;
            }
        }
        try {
            z zVar = photoViewer.h0;
            if (zVar != null && zVar.getParent() != null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.h0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void L0() {
        this.a.c4.cancelRewind();
    }

    @Override
    public final void N() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            gl.r(photoViewer.y2);
        }
    }

    @Override
    public final void P1() {
        View view;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J3) {
            if (PhotoViewer.l9 != null) {
                PhotoViewer.l9.B(false, true);
            }
            x88 x88Var = photoViewer.g0;
            if (x88Var != null && x88Var.f != null) {
                if (a.x) {
                    try {
                        x88Var.getContext().startService(new Intent(a.b, BringAppForegroundService.class));
                    } catch (Throwable th) {
                        fa4.g(th, true);
                    }
                }
                x88Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) x88Var.f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(x88Var.f);
                }
                x88Var.addView(x88Var.f, 0, nme.e(-1, -1, 51));
                xa8 xa8Var = x88Var.b.V8;
                if (xa8Var != null) {
                    xa8Var.a(new bm0((byte) 21));
                }
            }
            PhotoViewer.l9 = PhotoViewer.m9;
            PhotoViewer.m9 = null;
            if (photoViewer.g0 == null) {
                photoViewer.L3 = true;
                Bitmap bitmap = photoViewer.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer.C3 = null;
                }
                photoViewer.F3 = true;
            }
            photoViewer.J3 = false;
            if (photoViewer.E2) {
                view = photoViewer.D2;
            } else {
                view = photoViewer.C2;
            }
            if (photoViewer.g0 == null && view != null) {
                gl.B2(view);
                view.setVisibility(4);
                photoViewer.z2.addView(view);
            }
            if (a.x) {
                try {
                    photoViewer.E.startService(new Intent(a.b, BringAppForegroundService.class));
                } catch (Throwable th2) {
                    fa4.g(th2, true);
                }
            }
            if (photoViewer.g0 == null) {
                if (view != null) {
                    photoViewer.B3 = true;
                    l29 u0 = photoViewer.u0(false);
                    float f = u0.c / photoViewer.x3.getLayoutParams().width;
                    photoViewer.x3.setScaleX(f);
                    photoViewer.x3.setScaleY(f);
                    photoViewer.x3.setTranslationX(u0.a);
                    photoViewer.x3.setTranslationY(u0.b);
                    view.setScaleX(f);
                    view.setScaleY(f);
                    view.setTranslationX(u0.a - photoViewer.z2.getX());
                    view.setTranslationY(u0.b - photoViewer.z2.getY());
                    j98 j98Var = photoViewer.F2;
                    if (j98Var != null) {
                        j98Var.setScaleX(f);
                        photoViewer.F2.setScaleY(f);
                        photoViewer.F2.setTranslationX(view.getTranslationX());
                        photoViewer.F2.setTranslationY(view.getTranslationY());
                    }
                    photoViewer.X = 0.0f;
                    d88 d88Var = new d88(photoViewer, f, (byte) 1);
                    view.setOutlineProvider(d88Var);
                    view.setClipToOutline(true);
                    photoViewer.x3.setOutlineProvider(d88Var);
                    photoViewer.x3.setClipToOutline(true);
                    j98 j98Var2 = photoViewer.F2;
                    if (j98Var2 != null) {
                        j98Var2.setOutlineProvider(d88Var);
                        photoViewer.F2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.m6 = 0.0f;
            }
            try {
                photoViewer.e = true;
                photoViewer.f = true;
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).a1.add(photoViewer.t1);
                }
                p98 p98Var = photoViewer.d5;
                if (p98Var != null && !p98Var.s) {
                    p98Var.a.v0(false, false);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (photoViewer.E2) {
                y54 y54Var = photoViewer.G2.d;
                if (y54Var != null) {
                    y54Var.s1(null);
                }
                photoViewer.G2.y0(photoViewer.D2);
                photoViewer.D2.setVisibility(4);
                photoViewer.G3 = (byte) 2;
                photoViewer.F3 = false;
                photoViewer.f0.invalidate();
                photoViewer.v3 = 4;
                return;
            }
            photoViewer.v3 = 4;
        }
    }

    @Override
    public final int Q0() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getEmbedWidth();
        }
        m88 m88Var = photoViewer.z2;
        if (m88Var != null && m88Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.z2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.V;
    }

    @Override
    public final void S0(float f) {
        this.a.c4.setX(f);
    }

    @Override
    public final int S1() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getEmbedHeight();
        }
        m88 m88Var = photoViewer.z2;
        if (m88Var != null && m88Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.W;
    }

    @Override
    public final boolean T() {
        if (a() && this.a.g0.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean Z(boolean z, float f, iv9 iv9Var) {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.c4.startRewind(photoViewer.g0, z, f, photoViewer.u1, iv9Var);
            return true;
        }
        lbc lbcVar = photoViewer.G2;
        if (lbcVar == null) {
            return false;
        }
        photoViewer.c4.startRewind(lbcVar, z, f, photoViewer.u1, iv9Var);
        return true;
    }

    public final boolean a() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.t4 && photoViewer.g0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean a0() {
        return this.a.c4.rewinding;
    }

    @Override
    public final boolean a1() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.s2 && j() && !photoViewer.t4) {
            return true;
        }
        return false;
    }

    @Override
    public final float a2() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getBufferedPosition();
        }
        lbc lbcVar = photoViewer.G2;
        if (lbcVar != null && lbcVar.U() > 0) {
            return Math.max(photoViewer.X8, ((float) photoViewer.G2.N()) / ((float) photoViewer.G2.U()));
        }
        return photoViewer.X8;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final void e() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.g0.e();
            return;
        }
        lbc lbcVar = photoViewer.G2;
        if (lbcVar != null) {
            lbcVar.f0();
        }
    }

    @Override
    public final void f(long j) {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.g0.i(j);
            return;
        }
        lbc lbcVar = photoViewer.G2;
        if (lbcVar != null) {
            lbcVar.o0(j);
        }
    }

    @Override
    public final long getDuration() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getVideoDuration();
        }
        lbc lbcVar = photoViewer.G2;
        if (lbcVar != null) {
            return lbcVar.U();
        }
        return 0L;
    }

    @Override
    public final boolean j() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.H;
        }
        lbc lbcVar = photoViewer.G2;
        if (lbcVar != null && lbcVar.c0()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.g0.f();
            return;
        }
        lbc lbcVar = photoViewer.G2;
        if (lbcVar != null) {
            lbcVar.g0();
        }
    }

    @Override
    public final oc8 k1() {
        lbc lbcVar;
        if (!a() && (lbcVar = this.a.G2) != null) {
            return lbcVar.d;
        }
        return null;
    }

    @Override
    public final long m() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getCurrentPosition();
        }
        lbc lbcVar = photoViewer.G2;
        if (lbcVar != null) {
            return lbcVar.S();
        }
        return 0L;
    }

    @Override
    public final void m0(Rect rect) {
        k98 k98Var;
        PhotoViewer photoViewer = this.a;
        RectF rectF = photoViewer.Z8;
        if (photoViewer.a9 && (k98Var = photoViewer.f0) != null && k98Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f0.getLocationOnScreen(iArr);
            rect.set(Math.round(rectF.left + iArr[0]), Math.round(rectF.top + iArr[1]), Math.round(rectF.right + iArr[0]), Math.round(rectF.bottom + iArr[1]));
            return;
        }
        rect.setEmpty();
    }

    @Override
    public final View o0(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public final boolean p1() {
        return false;
    }

    @Override
    public final void r2(Canvas canvas, int i, int i2) {
        this.a.b4.draw(canvas, i, i2);
    }

    @Override
    public final int u() {
        return 0;
    }

    @Override
    public final void u1() {
        this.a.V8 = null;
        PhotoViewer photoViewer = PhotoViewer.m9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer == photoViewer2) {
            photoViewer2.M();
            MediaController.w().E0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.l9;
        PhotoViewer photoViewer4 = this.a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.Y8) {
                photoViewer4.Y8 = false;
                try {
                    z zVar = photoViewer4.h0;
                    if (zVar != null && zVar.getParent() == null) {
                        PhotoViewer photoViewer5 = this.a;
                        ((WindowManager) this.a.E.getSystemService("window")).addView(photoViewer5.h0, photoViewer5.e0);
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            this.a.B(false, false);
        }
    }

    @Override
    public final void z() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.z1();
        }
    }

    @Override
    public final void G2(int i) {
    }

    @Override
    public final void L1(View view) {
    }

    @Override
    public final void n(View view) {
    }

    @Override
    public final void p0(View view) {
    }

    @Override
    public final void x0(View view) {
    }

    @Override
    public final void o2(int i, ArrayList arrayList) {
    }
}
