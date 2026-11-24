package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ncc extends TextureView implements TextureView.SurfaceTextureListener {
    public ndc a;
    public uf4 b;
    public final o49 c;
    public int d;
    public int e;
    public f6b f;
    public mcc h;
    public int n;
    public int r;
    public sm0 s;

    public ncc(ndc ndcVar, Context context) {
        super(context);
        this.c = new Object();
        this.a = ndcVar;
        setSurfaceTextureListener(this);
    }

    public final void a(float f, float f2, float f3, float f4) {
        o49 o49Var = this.c;
        o49Var.a = f;
        o49Var.b = f2;
        o49Var.c = f3;
        o49Var.d = f4;
    }

    public Bitmap getUiBlurBitmap() {
        xm0 xm0Var;
        uf4 uf4Var = this.b;
        if (uf4Var == null || (xm0Var = uf4Var.J) == null) {
            return null;
        }
        synchronized (xm0Var.n) {
            if (!xm0Var.q) {
                return null;
            }
            return xm0Var.p;
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
            uf4 uf4Var = new uf4(surfaceTexture, new lcc(this, (byte) 0), this.f, this.s, i, i2);
            this.b = uf4Var;
            uf4Var.f(this.n, this.r);
            uf4 uf4Var2 = this.b;
            sm0 sm0Var = this.s;
            xm0 xm0Var = uf4Var2.J;
            if (xm0Var != null) {
                sm0 sm0Var2 = xm0Var.t;
                if (sm0Var2 != null && sm0Var2.m != null) {
                    sm0Var2.m = null;
                }
                xm0Var.t = sm0Var;
                if (sm0Var != null && sm0Var.m != xm0Var) {
                    sm0Var.m = xm0Var;
                    sm0Var.d();
                }
            }
            int i4 = this.d;
            if (i4 != 0 && (i3 = this.e) != 0) {
                uf4 uf4Var3 = this.b;
                uf4Var3.getClass();
                uf4Var3.postRunnable(new rf4(uf4Var3, i4, i3, (byte) 0));
            }
            this.b.b(true, true, false);
            mcc mccVar = this.h;
            if (mccVar != null) {
                mccVar.a(this.b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        uf4 uf4Var = this.b;
        if (uf4Var != null) {
            uf4Var.postRunnable(new sf4(uf4Var, (byte) 0));
            this.b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        uf4 uf4Var = this.b;
        if (uf4Var != null) {
            uf4Var.postRunnable(new rf4(uf4Var, i, i2, (byte) 1));
            this.b.b(false, true, false);
            this.b.postRunnable(new f8c(this, (byte) 3));
        }
    }

    public void setDelegate(mcc mccVar) {
        this.h = mccVar;
        uf4 uf4Var = this.b;
        if (uf4Var != null) {
            if (mccVar == null) {
                uf4Var.c(null);
            } else {
                mccVar.a(uf4Var);
            }
        }
    }

    public void setHDRInfo(f6b f6bVar) {
        this.f = f6bVar;
        uf4 uf4Var = this.b;
        if (uf4Var != null) {
            uf4Var.postRunnable(new ve4(uf4Var, f6bVar, (byte) 5));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        uf4 uf4Var = this.b;
        if (uf4Var != null) {
            int width = getWidth();
            int height = getHeight();
            xm0 xm0Var = uf4Var.J;
            if (xm0Var != null) {
                Matrix matrix2 = xm0Var.v;
                matrix.invert(matrix2);
                float f = width;
                float f2 = height;
                matrix2.preScale(f, f2);
                matrix2.postScale(1.0f / f, 1.0f / f2);
                xm0Var.c(matrix2);
                uf4Var.b(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
