package ag;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ga;
public final class n1 implements TextureView.SurfaceTextureListener {
    public final ga f615a;
    public final t1 f616b;

    public n1(t1 t1Var, ga gaVar) {
        this.f616b = t1Var;
        this.f615a = gaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            t1 t1Var = this.f616b;
            if (t1Var.d == null) {
                r1 r1Var = new r1(t1Var, surfaceTexture, this.f615a);
                t1Var.d = r1Var;
                r1Var.f645n = i10;
                r1Var.f646r = i11;
                t1Var.i();
                t1Var.post(new m1(this, 1));
                f1 f1Var = t1Var.f660c;
                if (f1Var.v) {
                    f1Var.f473f.f(new c1(f1Var, f1Var.f488w, 0));
                    f1Var.f488w = null;
                    f1Var.v = false;
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t1 t1Var = this.f616b;
        if (t1Var.d != null && !t1Var.f668y) {
            f1 f1Var = t1Var.f660c;
            f1Var.f473f.f(new a1.e(4, f1Var, new m1(this, 2)));
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        t1 t1Var = this.f616b;
        r1 r1Var = t1Var.d;
        if (r1Var == null) {
            return;
        }
        r1Var.f645n = i10;
        r1Var.f646r = i11;
        t1Var.i();
        r1 r1Var2 = t1Var.d;
        r1Var2.postRunnable(r1Var2.f648w);
        t1Var.d.postRunnable(new m1(this, 0));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
