package og;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ia;
public final class d1 implements TextureView.SurfaceTextureListener {
    public final ia f14343a;
    public final h1 f14344b;

    public d1(h1 h1Var, ia iaVar) {
        this.f14344b = h1Var;
        this.f14343a = iaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            h1 h1Var = this.f14344b;
            if (h1Var.d == null) {
                f1 f1Var = new f1(h1Var, surfaceTexture, this.f14343a);
                h1Var.d = f1Var;
                f1Var.f14358n = i10;
                f1Var.f14359r = i11;
                h1Var.i();
                h1Var.post(new c1(this, 1));
                v0 v0Var = h1Var.f14390c;
                if (v0Var.v) {
                    v0Var.f14515f.f(new s0(v0Var, v0Var.f14530w, 0));
                    v0Var.f14530w = null;
                    v0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        h1 h1Var = this.f14344b;
        if (h1Var.d != null && !h1Var.f14397y) {
            v0 v0Var = h1Var.f14390c;
            v0Var.f14515f.f(new m4.w(9, v0Var, new c1(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        h1 h1Var = this.f14344b;
        f1 f1Var = h1Var.d;
        if (f1Var == null) {
            return;
        }
        f1Var.f14358n = i10;
        f1Var.f14359r = i11;
        h1Var.i();
        f1 f1Var2 = h1Var.d;
        f1Var2.postRunnable(f1Var2.f14361w);
        h1Var.d.postRunnable(new c1(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
