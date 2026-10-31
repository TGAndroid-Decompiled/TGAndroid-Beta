package ig;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.s9;
public final class y0 implements TextureView.SurfaceTextureListener {
    public final s9 f8507a;
    public final c1 f8508b;

    public y0(c1 c1Var, s9 s9Var) {
        this.f8508b = c1Var;
        this.f8507a = s9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            c1 c1Var = this.f8508b;
            if (c1Var.d == null) {
                a1 a1Var = new a1(c1Var, surfaceTexture, this.f8507a);
                c1Var.d = a1Var;
                a1Var.f8272n = i10;
                a1Var.f8273r = i11;
                c1Var.i();
                c1Var.post(new x0(this, 1));
                q0 q0Var = c1Var.f8284c;
                if (q0Var.v) {
                    q0Var.f8413f.f(new n0(q0Var, q0Var.f8428w, 0));
                    q0Var.f8428w = null;
                    q0Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c1 c1Var = this.f8508b;
        if (c1Var.d != null && !c1Var.D) {
            q0 q0Var = c1Var.f8284c;
            q0Var.f8413f.f(new d1.e(17, q0Var, new x0(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c1 c1Var = this.f8508b;
        a1 a1Var = c1Var.d;
        if (a1Var == null) {
            return;
        }
        a1Var.f8272n = i10;
        a1Var.f8273r = i11;
        c1Var.i();
        a1 a1Var2 = c1Var.d;
        a1Var2.postRunnable(a1Var2.f8276x);
        c1Var.d.postRunnable(new x0(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
