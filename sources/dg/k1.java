package dg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ba;
public final class k1 implements TextureView.SurfaceTextureListener {
    public final ba f4574a;
    public final o1 f4575b;

    public k1(o1 o1Var, ba baVar) {
        this.f4575b = o1Var;
        this.f4574a = baVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            o1 o1Var = this.f4575b;
            if (o1Var.d == null) {
                m1 m1Var = new m1(o1Var, surfaceTexture, this.f4574a);
                o1Var.d = m1Var;
                m1Var.f4610n = i10;
                m1Var.f4611r = i11;
                o1Var.i();
                o1Var.post(new j1(this, 1));
                c1 c1Var = o1Var.f4626c;
                if (c1Var.v) {
                    c1Var.f4455f.f(new z0(c1Var, c1Var.f4470w, 0));
                    c1Var.f4470w = null;
                    c1Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        o1 o1Var = this.f4575b;
        if (o1Var.d != null && !o1Var.f4634y) {
            c1 c1Var = o1Var.f4626c;
            c1Var.f4455f.f(new a1.e(15, c1Var, new j1(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        o1 o1Var = this.f4575b;
        m1 m1Var = o1Var.d;
        if (m1Var == null) {
            return;
        }
        m1Var.f4610n = i10;
        m1Var.f4611r = i11;
        o1Var.i();
        m1 m1Var2 = o1Var.d;
        m1Var2.postRunnable(m1Var2.f4613w);
        o1Var.d.postRunnable(new j1(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
