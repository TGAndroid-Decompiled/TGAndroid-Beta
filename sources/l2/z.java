package l2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import e2.w1;
import java.util.ArrayList;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.y51;
public final class z implements d3.h0, n2.s, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final f0 f19600a;

    public z(f0 f0Var) {
        this.f19600a = f0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        f0 f0Var = this.f19600a;
        y51 y51Var = f0Var.f19348s0;
        if (y51Var != null) {
            y51Var.execute(new x(this, surfaceTexture, i7, i10, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        f0Var.x1(surface);
        f0Var.U = surface;
        f0Var.q1(i7, i10);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f19600a;
        ArrayList arrayList = f0Var.f19350t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((f61) ((w1) obj)).K.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        y51 y51Var = f0Var.f19348s0;
        if (y51Var != null) {
            y51Var.execute(new kg.j0(this, surfaceTexture));
            return true;
        }
        f0Var.x1(null);
        f0Var.q1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        f0 f0Var = this.f19600a;
        y51 y51Var = f0Var.f19348s0;
        if (y51Var != null) {
            y51Var.execute(new jg.q(this, surfaceTexture, i7, i10));
        } else {
            f0Var.q1(i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f19600a;
        y51 y51Var = f0Var.f19348s0;
        if (y51Var != null) {
            y51Var.execute(new kg.h0(15, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = f0Var.f19350t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((f61) ((w1) obj)).K.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        this.f19600a.q1(i10, i11);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f19600a;
        if (f0Var.W) {
            f0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f19600a;
        if (f0Var.W) {
            f0Var.x1(null);
        }
        f0Var.q1(0, 0);
    }
}
