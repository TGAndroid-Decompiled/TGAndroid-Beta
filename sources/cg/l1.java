package cg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ba;
public final class l1 implements TextureView.SurfaceTextureListener {
    public final ba f2428a;
    public final p1 f2429b;

    public l1(p1 p1Var, ba baVar) {
        this.f2429b = p1Var;
        this.f2428a = baVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            p1 p1Var = this.f2429b;
            if (p1Var.d == null) {
                n1 n1Var = new n1(p1Var, surfaceTexture, this.f2428a);
                p1Var.d = n1Var;
                n1Var.f2463n = i10;
                n1Var.f2464r = i11;
                p1Var.i();
                p1Var.post(new k1(this, 1));
                d1 d1Var = p1Var.f2477c;
                if (d1Var.v) {
                    d1Var.f2320f.f(new a1(d1Var, d1Var.f2335w, 0));
                    d1Var.f2335w = null;
                    d1Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        p1 p1Var = this.f2429b;
        if (p1Var.d != null && !p1Var.f2484y) {
            d1 d1Var = p1Var.f2477c;
            d1Var.f2320f.f(new a1.e(10, d1Var, new k1(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        p1 p1Var = this.f2429b;
        n1 n1Var = p1Var.d;
        if (n1Var == null) {
            return;
        }
        n1Var.f2463n = i10;
        n1Var.f2464r = i11;
        p1Var.i();
        n1 n1Var2 = p1Var.d;
        n1Var2.postRunnable(n1Var2.f2466w);
        p1Var.d.postRunnable(new k1(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
