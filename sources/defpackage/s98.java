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
public final class s98 implements o7, vc8 {
    public final PhotoViewer a;

    public s98(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override
    public final boolean A0() {
        if (a() && !this.a.g0.y) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean D() {
        if (a() && this.a.g0.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean F(boolean z, float f, lx9 lx9Var) {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.c4.startRewind(photoViewer.g0, z, f, photoViewer.u1, lx9Var);
            return true;
        }
        ndc ndcVar = photoViewer.G2;
        if (ndcVar == null) {
            return false;
        }
        photoViewer.c4.startRewind(ndcVar, z, f, photoViewer.u1, lx9Var);
        return true;
    }

    @Override
    public final boolean G() {
        return this.a.c4.rewinding;
    }

    @Override
    public final void I(Rect rect) {
        lb8 lb8Var;
        PhotoViewer photoViewer = this.a;
        RectF rectF = photoViewer.Y8;
        if (photoViewer.Z8 && (lb8Var = photoViewer.f0) != null && lb8Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f0.getLocationOnScreen(iArr);
            rect.set(Math.round(rectF.left + iArr[0]), Math.round(rectF.top + iArr[1]), Math.round(rectF.right + iArr[0]), Math.round(rectF.bottom + iArr[1]));
            return;
        }
        rect.setEmpty();
    }

    @Override
    public final View J(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public final View O() {
        if (a()) {
            return this.a.g0.getWebView();
        }
        return null;
    }

    @Override
    public final boolean P() {
        z zVar;
        PhotoViewer photoViewer = PhotoViewer.j9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer == photoViewer2 && photoViewer2.e && !photoViewer2.J3 && !photoViewer2.W8 && (zVar = photoViewer2.h0) != null && zVar.getParent() != null) {
            PhotoViewer photoViewer3 = this.a;
            if (!photoViewer3.B3 && photoViewer3.m4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void Q(bd8 bd8Var) {
        PhotoViewer photoViewer = this.a;
        photoViewer.W8 = true;
        if (photoViewer.E2) {
            ndc ndcVar = photoViewer.G2;
            if (ndcVar != null) {
                ndcVar.y0(null);
                photoViewer.G2.z0(null);
                photoViewer.G2.z0(bd8Var);
            }
        } else if (photoViewer.C2 != null) {
            ndc ndcVar2 = photoViewer.G2;
            if (ndcVar2 != null) {
                ndcVar2.z0(null);
            }
            gm.B2(photoViewer.C2);
            ndc ndcVar3 = photoViewer.G2;
            if (ndcVar3 != null) {
                ndcVar3.z0(bd8Var);
            }
        }
        try {
            z zVar = photoViewer.h0;
            if (zVar != null && zVar.getParent() != null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.h0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void R() {
        this.a.c4.cancelRewind();
    }

    @Override
    public final int S() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getEmbedWidth();
        }
        oa8 oa8Var = photoViewer.z2;
        if (oa8Var != null && oa8Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.z2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.V;
    }

    @Override
    public final void T(float f) {
        this.a.c4.setX(f);
    }

    @Override
    public final boolean V() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.s2 && i() && !photoViewer.s4) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean W() {
        return false;
    }

    @Override
    public final re8 Y() {
        ndc ndcVar;
        if (!a() && (ndcVar = this.a.G2) != null) {
            return ndcVar.d;
        }
        return null;
    }

    public final boolean a() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.s4 && photoViewer.g0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void c() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.g0.e();
            return;
        }
        ndc ndcVar = photoViewer.G2;
        if (ndcVar != null) {
            ndcVar.f0();
        }
    }

    @Override
    public final void e(long j) {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.g0.i(j);
            return;
        }
        ndc ndcVar = photoViewer.G2;
        if (ndcVar != null) {
            ndcVar.o0(j);
        }
    }

    @Override
    public final void e0() {
        this.a.U8 = null;
        PhotoViewer photoViewer = PhotoViewer.k9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer == photoViewer2) {
            photoViewer2.L();
            MediaController.w().E0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.j9;
        PhotoViewer photoViewer4 = this.a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.W8) {
                photoViewer4.W8 = false;
                try {
                    z zVar = photoViewer4.h0;
                    if (zVar != null && zVar.getParent() == null) {
                        PhotoViewer photoViewer5 = this.a;
                        ((WindowManager) this.a.E.getSystemService("window")).addView(photoViewer5.h0, photoViewer5.e0);
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            this.a.A(false, false);
        }
    }

    @Override
    public final long getDuration() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getVideoDuration();
        }
        ndc ndcVar = photoViewer.G2;
        if (ndcVar != null) {
            return ndcVar.U();
        }
        return 0L;
    }

    @Override
    public final void h2() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            gm.r(photoViewer.y2);
        }
    }

    @Override
    public final boolean i() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.H;
        }
        ndc ndcVar = photoViewer.G2;
        if (ndcVar != null && ndcVar.c0()) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            photoViewer.g0.f();
            return;
        }
        ndc ndcVar = photoViewer.G2;
        if (ndcVar != null) {
            ndcVar.g0();
        }
    }

    @Override
    public final long k() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getCurrentPosition();
        }
        ndc ndcVar = photoViewer.G2;
        if (ndcVar != null) {
            return ndcVar.S();
        }
        return 0L;
    }

    @Override
    public final void n0() {
        View view;
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.J3) {
            return;
        }
        if (PhotoViewer.j9 != null) {
            PhotoViewer.j9.A(false, true);
        }
        ya8 ya8Var = photoViewer.g0;
        if (ya8Var != null && ya8Var.f != null) {
            if (a.x) {
                try {
                    ya8Var.getContext().startService(new Intent(a.b, BringAppForegroundService.class));
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
            ya8Var.h.setVisibility(0);
            ViewGroup viewGroup = (ViewGroup) ya8Var.f.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(ya8Var.f);
            }
            ya8Var.addView(ya8Var.f, 0, qoe.e(-1, -1, 51));
            ad8 ad8Var = ya8Var.b.U8;
            if (ad8Var != null) {
                ad8Var.a(new bn0((byte) 21));
            }
        }
        PhotoViewer.j9 = PhotoViewer.k9;
        PhotoViewer.k9 = null;
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
            gm.B2(view);
            view.setVisibility(4);
            photoViewer.z2.addView(view);
        }
        if (a.x) {
            try {
                photoViewer.E.startService(new Intent(a.b, BringAppForegroundService.class));
            } catch (Throwable th2) {
                fc4.g(th2, true);
            }
        }
        if (photoViewer.g0 == null) {
            if (view != null) {
                photoViewer.B3 = true;
                o49 u0 = photoViewer.u0(false);
                float f = u0.c / photoViewer.x3.getLayoutParams().width;
                photoViewer.x3.setScaleX(f);
                photoViewer.x3.setScaleY(f);
                photoViewer.x3.setTranslationX(u0.a);
                photoViewer.x3.setTranslationY(u0.b);
                view.setScaleX(f);
                view.setScaleY(f);
                view.setTranslationX(u0.a - photoViewer.z2.getX());
                view.setTranslationY(u0.b - photoViewer.z2.getY());
                kb8 kb8Var = photoViewer.F2;
                if (kb8Var != null) {
                    kb8Var.setScaleX(f);
                    photoViewer.F2.setScaleY(f);
                    photoViewer.F2.setTranslationX(view.getTranslationX());
                    photoViewer.F2.setTranslationY(view.getTranslationY());
                }
                photoViewer.X = 0.0f;
                fa8 fa8Var = new fa8(photoViewer, f, (byte) 1);
                view.setOutlineProvider(fa8Var);
                view.setClipToOutline(true);
                photoViewer.x3.setOutlineProvider(fa8Var);
                photoViewer.x3.setClipToOutline(true);
                kb8 kb8Var2 = photoViewer.F2;
                if (kb8Var2 != null) {
                    kb8Var2.setOutlineProvider(fa8Var);
                    photoViewer.F2.setClipToOutline(true);
                }
            }
        } else {
            photoViewer.l6 = 0.0f;
        }
        try {
            photoViewer.e = true;
            photoViewer.f = true;
            ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
            Activity activity = photoViewer.E;
            if (activity instanceof LaunchActivity) {
                ((LaunchActivity) activity).a1.add(photoViewer.t1);
            }
            qb8 qb8Var = photoViewer.c5;
            if (qb8Var != null && !qb8Var.s) {
                qb8Var.a.v0(false, false);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (photoViewer.E2) {
            h74 h74Var = photoViewer.G2.d;
            if (h74Var != null) {
                h74Var.s1(null);
            }
            photoViewer.G2.y0(photoViewer.D2);
            photoViewer.D2.setVisibility(4);
            photoViewer.G3 = (byte) 2;
            photoViewer.F3 = false;
            photoViewer.f0.invalidate();
        }
        photoViewer.v3 = 4;
    }

    @Override
    public final int o0() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getEmbedHeight();
        }
        oa8 oa8Var = photoViewer.z2;
        if (oa8Var != null && oa8Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.W;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final float p0() {
        boolean a = a();
        PhotoViewer photoViewer = this.a;
        if (a) {
            return photoViewer.g0.getBufferedPosition();
        }
        ndc ndcVar = photoViewer.G2;
        if (ndcVar != null && ndcVar.U() > 0) {
            return Math.max(photoViewer.V8, ((float) photoViewer.G2.N()) / ((float) photoViewer.G2.U()));
        }
        return photoViewer.V8;
    }

    @Override
    public final void r(SurfaceTexture surfaceTexture, Bitmap bitmap) {
        PhotoViewer photoViewer = this.a;
        photoViewer.W8 = false;
        try {
            z zVar = photoViewer.h0;
            if (zVar != null && zVar.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        boolean z = photoViewer.E2;
        ndc ndcVar = photoViewer.G2;
        if (z) {
            if (ndcVar != null) {
                ndcVar.z0(null);
                photoViewer.G2.y0(photoViewer.D2);
            }
            surfaceTexture.release();
            return;
        }
        if (ndcVar != null) {
            ndcVar.z0(null);
        }
        surfaceTexture.release();
        TextureView textureView = photoViewer.C2;
        if (textureView != null && photoViewer.z2 != null) {
            gm.B2(textureView);
            photoViewer.z2.addView(photoViewer.C2, 0, qoe.e(-1, -1, 17));
            ndc ndcVar2 = photoViewer.G2;
            if (ndcVar2 != null) {
                ndcVar2.z0(photoViewer.C2);
                if (bitmap != null && !photoViewer.G2.c0() && photoViewer.x3 != null && photoViewer.z2 != null) {
                    Bitmap bitmap2 = photoViewer.C3;
                    if (bitmap2 != null && bitmap2 != bitmap) {
                        bitmap2.recycle();
                    }
                    photoViewer.C3 = bitmap;
                    photoViewer.X8 = true;
                    photoViewer.x3.setScaleX(1.0f);
                    photoViewer.x3.setScaleY(1.0f);
                    photoViewer.x3.setTranslationX(photoViewer.z2.getX());
                    photoViewer.x3.setTranslationY(photoViewer.z2.getY());
                    photoViewer.x3.setImageBitmap(bitmap);
                    photoViewer.x3.setVisibility(0);
                }
            }
        }
    }

    @Override
    public final void u0(Canvas canvas, int i, int i2) {
        this.a.b4.draw(canvas, i, i2);
    }

    @Override
    public final void z0() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.A1();
        }
    }

    @Override
    public final void B0(int i) {
    }

    @Override
    public final void K(View view) {
    }

    @Override
    public final void M(View view) {
    }

    @Override
    public final void l(View view) {
    }

    @Override
    public final void m0(View view) {
    }

    @Override
    public final void q0(int i, ArrayList arrayList) {
    }
}
