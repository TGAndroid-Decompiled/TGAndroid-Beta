package l2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import e2.w1;
import java.util.ArrayList;
import kg.t1;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.u51;
public final class z implements d3.h0, n2.s, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final f0 f19233a;

    public z(f0 f0Var) {
        this.f19233a = f0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        f0 f0Var = this.f19233a;
        n51 n51Var = f0Var.f18981s0;
        if (n51Var != null) {
            n51Var.execute(new x(this, surfaceTexture, i7, i10, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        f0Var.x1(surface);
        f0Var.U = surface;
        f0Var.q1(i7, i10);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f19233a;
        ArrayList arrayList = f0Var.f18983t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((u51) ((w1) obj)).K.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        n51 n51Var = f0Var.f18981s0;
        if (n51Var != null) {
            n51Var.execute(new kg.j1(this, surfaceTexture));
            return true;
        }
        f0Var.x1(null);
        f0Var.q1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        f0 f0Var = this.f19233a;
        n51 n51Var = f0Var.f18981s0;
        if (n51Var != null) {
            n51Var.execute(new jg.q(this, surfaceTexture, i7, i10));
        } else {
            f0Var.q1(i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f19233a;
        n51 n51Var = f0Var.f18981s0;
        if (n51Var != null) {
            n51Var.execute(new t1(12, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = f0Var.f18983t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((u51) ((w1) obj)).K.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        this.f19233a.q1(i10, i11);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f19233a;
        if (f0Var.W) {
            f0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f19233a;
        if (f0Var.W) {
            f0Var.x1(null);
        }
        f0Var.q1(0, 0);
    }
}
