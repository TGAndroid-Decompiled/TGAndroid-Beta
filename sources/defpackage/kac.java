package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class kac extends TextureView implements TextureView.SurfaceTextureListener {
    public lbc a;
    public td4 b;
    public final l29 c;
    public int d;
    public int e;
    public e4b f;
    public jac h;
    public int n;
    public int r;
    public sl0 s;

    public kac(lbc lbcVar, Context context) {
        super(context);
        this.c = new Object();
        this.a = lbcVar;
        setSurfaceTextureListener(this);
    }

    public final void a(float f, float f2, float f3, float f4) {
        l29 l29Var = this.c;
        l29Var.a = f;
        l29Var.b = f2;
        l29Var.c = f3;
        l29Var.d = f4;
    }

    public Bitmap getUiBlurBitmap() {
        xl0 xl0Var;
        td4 td4Var = this.b;
        if (td4Var == null || (xl0Var = td4Var.J) == null) {
            return null;
        }
        synchronized (xl0Var.n) {
            if (!xl0Var.q) {
                return null;
            }
            return xl0Var.p;
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
            td4 td4Var = new td4(surfaceTexture, new hza(this, (byte) 26), this.f, this.s, i, i2);
            this.b = td4Var;
            td4Var.f(this.n, this.r);
            td4 td4Var2 = this.b;
            sl0 sl0Var = this.s;
            xl0 xl0Var = td4Var2.J;
            if (xl0Var != null) {
                sl0 sl0Var2 = xl0Var.t;
                if (sl0Var2 != null && sl0Var2.m != null) {
                    sl0Var2.m = null;
                }
                xl0Var.t = sl0Var;
                if (sl0Var != null && sl0Var.m != xl0Var) {
                    sl0Var.m = xl0Var;
                    sl0Var.d();
                }
            }
            int i4 = this.d;
            if (i4 != 0 && (i3 = this.e) != 0) {
                td4 td4Var3 = this.b;
                td4Var3.getClass();
                td4Var3.postRunnable(new qd4(td4Var3, i4, i3, (byte) 0));
            }
            this.b.b(true, true, false);
            jac jacVar = this.h;
            if (jacVar != null) {
                jacVar.a(this.b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        td4 td4Var = this.b;
        if (td4Var != null) {
            td4Var.postRunnable(new rd4(td4Var, (byte) 0));
            this.b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        td4 td4Var = this.b;
        if (td4Var != null) {
            td4Var.postRunnable(new qd4(td4Var, i, i2, (byte) 1));
            this.b.b(false, true, false);
            this.b.postRunnable(new cib(this, (byte) 25));
        }
    }

    public void setDelegate(jac jacVar) {
        this.h = jacVar;
        td4 td4Var = this.b;
        if (td4Var != null) {
            if (jacVar == null) {
                td4Var.c(null);
            } else {
                jacVar.a(td4Var);
            }
        }
    }

    public void setHDRInfo(e4b e4bVar) {
        this.f = e4bVar;
        td4 td4Var = this.b;
        if (td4Var != null) {
            td4Var.postRunnable(new vc4(td4Var, e4bVar, (byte) 4));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        td4 td4Var = this.b;
        if (td4Var != null) {
            int width = getWidth();
            int height = getHeight();
            xl0 xl0Var = td4Var.J;
            if (xl0Var != null) {
                Matrix matrix2 = xl0Var.v;
                matrix.invert(matrix2);
                float f = width;
                float f2 = height;
                matrix2.preScale(f, f2);
                matrix2.postScale(1.0f / f, 1.0f / f2);
                xl0Var.c(matrix2);
                td4Var.b(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
