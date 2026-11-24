package defpackage;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class k78 implements TextureView.SurfaceTextureListener {
    public final boolean a;
    public final sm0 b;
    public final n78 c;

    public k78(n78 n78Var, boolean z, sm0 sm0Var) {
        this.c = n78Var;
        this.a = z;
        this.b = sm0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        n78 n78Var = this.c;
        TextureView textureView = n78Var.j0;
        if (n78Var.m0 == null && surfaceTexture != null) {
            uf4 uf4Var = new uf4(surfaceTexture, n78Var.D0, n78Var.I0, n78Var.x0, this.a, this.b, i, i2);
            n78Var.m0 = uf4Var;
            if (!this.a) {
                uf4Var.f(n78Var.K0, n78Var.L0);
                uf4 uf4Var2 = n78Var.m0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                xm0 xm0Var = uf4Var2.J;
                if (xm0Var != null) {
                    Matrix matrix = xm0Var.v;
                    transform.invert(matrix);
                    float f = width;
                    float f2 = height;
                    matrix.preScale(f, f2);
                    matrix.postScale(1.0f / f, 1.0f / f2);
                    xm0Var.c(matrix);
                    uf4Var2.b(false, false, false);
                }
            }
            n78Var.m0.c(n78Var);
            uf4 uf4Var3 = n78Var.m0;
            uf4Var3.getClass();
            uf4Var3.postRunnable(new rf4(uf4Var3, i, i2, (byte) 1));
            n78Var.m0.b(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n78 n78Var = this.c;
        uf4 uf4Var = n78Var.m0;
        if (uf4Var != null) {
            uf4Var.postRunnable(new sf4(uf4Var, (byte) 0));
            n78Var.m0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        n78 n78Var = this.c;
        uf4 uf4Var = n78Var.m0;
        if (uf4Var != null) {
            uf4Var.postRunnable(new rf4(uf4Var, i, i2, (byte) 1));
            n78Var.m0.b(false, true, false);
            n78Var.m0.postRunnable(new kl7(this, (byte) 27));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
