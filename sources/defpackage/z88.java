package defpackage;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class z88 implements TextureView.SurfaceTextureListener {
    public final boolean a;
    public final tl0 b;
    public final c98 c;

    public z88(c98 c98Var, boolean z, tl0 tl0Var) {
        this.c = c98Var;
        this.a = z;
        this.b = tl0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        c98 c98Var = this.c;
        TextureView textureView = c98Var.j0;
        if (c98Var.m0 == null && surfaceTexture != null) {
            rf4 rf4Var = new rf4(surfaceTexture, c98Var.D0, c98Var.I0, c98Var.x0, this.a, this.b, i, i2);
            c98Var.m0 = rf4Var;
            if (!this.a) {
                rf4Var.f(c98Var.K0, c98Var.L0);
                rf4 rf4Var2 = c98Var.m0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                yl0 yl0Var = rf4Var2.J;
                if (yl0Var != null) {
                    Matrix matrix = yl0Var.v;
                    transform.invert(matrix);
                    float f = width;
                    float f2 = height;
                    matrix.preScale(f, f2);
                    matrix.postScale(1.0f / f, 1.0f / f2);
                    yl0Var.c(matrix);
                    rf4Var2.b(false, false, false);
                }
            }
            c98Var.m0.c(c98Var);
            rf4 rf4Var3 = c98Var.m0;
            rf4Var3.getClass();
            rf4Var3.postRunnable(new of4(rf4Var3, i, i2, (byte) 1));
            c98Var.m0.b(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c98 c98Var = this.c;
        rf4 rf4Var = c98Var.m0;
        if (rf4Var != null) {
            rf4Var.postRunnable(new pf4(rf4Var, (byte) 0));
            c98Var.m0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        c98 c98Var = this.c;
        rf4 rf4Var = c98Var.m0;
        if (rf4Var != null) {
            rf4Var.postRunnable(new of4(rf4Var, i, i2, (byte) 1));
            c98Var.m0.b(false, true, false);
            c98Var.m0.postRunnable(new x38(this, (byte) 5));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
