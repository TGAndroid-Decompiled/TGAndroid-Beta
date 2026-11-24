package defpackage;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class i58 implements TextureView.SurfaceTextureListener {
    public final boolean a;
    public final sl0 b;
    public final l58 c;

    public i58(l58 l58Var, boolean z, sl0 sl0Var) {
        this.c = l58Var;
        this.a = z;
        this.b = sl0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        l58 l58Var = this.c;
        TextureView textureView = l58Var.j0;
        if (l58Var.m0 == null && surfaceTexture != null) {
            td4 td4Var = new td4(surfaceTexture, l58Var.D0, l58Var.I0, l58Var.x0, this.a, this.b, i, i2);
            l58Var.m0 = td4Var;
            if (!this.a) {
                td4Var.f(l58Var.K0, l58Var.L0);
                td4 td4Var2 = l58Var.m0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                xl0 xl0Var = td4Var2.J;
                if (xl0Var != null) {
                    Matrix matrix = xl0Var.v;
                    transform.invert(matrix);
                    float f = width;
                    float f2 = height;
                    matrix.preScale(f, f2);
                    matrix.postScale(1.0f / f, 1.0f / f2);
                    xl0Var.c(matrix);
                    td4Var2.b(false, false, false);
                }
            }
            l58Var.m0.c(l58Var);
            td4 td4Var3 = l58Var.m0;
            td4Var3.getClass();
            td4Var3.postRunnable(new qd4(td4Var3, i, i2, (byte) 1));
            l58Var.m0.b(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l58 l58Var = this.c;
        td4 td4Var = l58Var.m0;
        if (td4Var != null) {
            td4Var.postRunnable(new rd4(td4Var, (byte) 0));
            l58Var.m0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        l58 l58Var = this.c;
        td4 td4Var = l58Var.m0;
        if (td4Var != null) {
            td4Var.postRunnable(new qd4(td4Var, i, i2, (byte) 1));
            l58Var.m0.b(false, true, false);
            l58Var.m0.postRunnable(new oq7(this, (byte) 20));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
