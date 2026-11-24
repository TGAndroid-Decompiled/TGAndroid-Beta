package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class y69 implements TextureView.SurfaceTextureListener {
    public final sl0 a;
    public final c79 b;

    public y69(c79 c79Var, sl0 sl0Var) {
        this.b = c79Var;
        this.a = sl0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture != null) {
            c79 c79Var = this.b;
            if (c79Var.d == null) {
                a79 a79Var = new a79(c79Var, surfaceTexture, this.a);
                c79Var.d = a79Var;
                a79Var.n = i;
                a79Var.r = i2;
                c79Var.i();
                c79Var.post(new x69(this, (byte) 1));
                gu7 gu7Var = c79Var.c;
                if (gu7Var.v) {
                    gu7Var.f.f(new eu7(gu7Var, gu7Var.w, (byte) 0));
                    gu7Var.w = null;
                    gu7Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c79 c79Var = this.b;
        if (c79Var.d != null && !c79Var.E) {
            gu7 gu7Var = c79Var.c;
            gu7Var.f.f(new bj7(gu7Var, new x69(this, (byte) 2), (byte) 16));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        c79 c79Var = this.b;
        a79 a79Var = c79Var.d;
        if (a79Var == null) {
            return;
        }
        a79Var.n = i;
        a79Var.r = i2;
        c79Var.i();
        a79 a79Var2 = c79Var.d;
        a79Var2.postRunnable(a79Var2.x);
        c79Var.d.postRunnable(new x69(this, (byte) 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
