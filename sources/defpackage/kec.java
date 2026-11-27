package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class kec extends TextureView implements TextureView.SurfaceTextureListener {
    public kfc a;
    public rf4 b;
    public final a69 c;
    public int d;
    public int e;
    public b8b f;
    public jec h;
    public int n;
    public int r;
    public tl0 s;

    public kec(kfc kfcVar, Context context) {
        super(context);
        this.c = new Object();
        this.a = kfcVar;
        setSurfaceTextureListener(this);
    }

    public final void a(float f, float f2, float f3, float f4) {
        a69 a69Var = this.c;
        a69Var.a = f;
        a69Var.b = f2;
        a69Var.c = f3;
        a69Var.d = f4;
    }

    public Bitmap getUiBlurBitmap() {
        yl0 yl0Var;
        rf4 rf4Var = this.b;
        if (rf4Var == null || (yl0Var = rf4Var.J) == null) {
            return null;
        }
        synchronized (yl0Var.n) {
            if (!yl0Var.q) {
                return null;
            }
            return yl0Var.p;
        }
    }

    public int getVideoHeight() {
        return this.e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3;
        if (this.b == null && surfaceTexture != null && this.a != null) {
            rf4 rf4Var = new rf4(surfaceTexture, new ftb(this, (byte) 9), this.f, this.s, i, i2);
            this.b = rf4Var;
            rf4Var.f(this.n, this.r);
            rf4 rf4Var2 = this.b;
            tl0 tl0Var = this.s;
            yl0 yl0Var = rf4Var2.J;
            if (yl0Var != null) {
                tl0 tl0Var2 = yl0Var.t;
                if (tl0Var2 != null && tl0Var2.m != null) {
                    tl0Var2.m = null;
                }
                yl0Var.t = tl0Var;
                if (tl0Var != null && tl0Var.m != yl0Var) {
                    tl0Var.m = yl0Var;
                    tl0Var.d();
                }
            }
            int i4 = this.d;
            if (i4 != 0 && (i3 = this.e) != 0) {
                rf4 rf4Var3 = this.b;
                rf4Var3.getClass();
                rf4Var3.postRunnable(new of4(rf4Var3, i4, i3, (byte) 0));
            }
            this.b.b(true, true, false);
            jec jecVar = this.h;
            if (jecVar != null) {
                jecVar.a(this.b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        rf4 rf4Var = this.b;
        if (rf4Var != null) {
            rf4Var.postRunnable(new pf4(rf4Var, (byte) 0));
            this.b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        rf4 rf4Var = this.b;
        if (rf4Var != null) {
            rf4Var.postRunnable(new of4(rf4Var, i, i2, (byte) 1));
            this.b.b(false, true, false);
            this.b.postRunnable(new azb(this, (byte) 12));
        }
    }

    public void setDelegate(jec jecVar) {
        this.h = jecVar;
        rf4 rf4Var = this.b;
        if (rf4Var != null) {
            if (jecVar == null) {
                rf4Var.c(null);
            } else {
                jecVar.a(rf4Var);
            }
        }
    }

    public void setHDRInfo(b8b b8bVar) {
        this.f = b8bVar;
        rf4 rf4Var = this.b;
        if (rf4Var != null) {
            rf4Var.postRunnable(new se4(rf4Var, b8bVar, (byte) 1));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        rf4 rf4Var = this.b;
        if (rf4Var != null) {
            int width = getWidth();
            int height = getHeight();
            yl0 yl0Var = rf4Var.J;
            if (yl0Var != null) {
                Matrix matrix2 = yl0Var.v;
                matrix.invert(matrix2);
                float f = width;
                float f2 = height;
                matrix2.preScale(f, f2);
                matrix2.postScale(1.0f / f, 1.0f / f2);
                yl0Var.c(matrix2);
                rf4Var.b(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
