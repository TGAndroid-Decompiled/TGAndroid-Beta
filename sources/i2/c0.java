package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.a2;
import java.util.ArrayList;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.u61;
public final class c0 implements a3.m0, k2.w, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final i0 f7821a;

    public c0(i0 i0Var) {
        this.f7821a = i0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        i0 i0Var = this.f7821a;
        n61 n61Var = i0Var.f7928s0;
        if (n61Var != null) {
            n61Var.execute(new a0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        i0Var.x1(surface);
        i0Var.U = surface;
        i0Var.q1(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i0 i0Var = this.f7821a;
        ArrayList arrayList = i0Var.f7930t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((u61) ((a2) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        n61 n61Var = i0Var.f7928s0;
        if (n61Var != null) {
            n61Var.execute(new gg.c(this, surfaceTexture));
            return true;
        }
        i0Var.x1(null);
        i0Var.q1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        i0 i0Var = this.f7821a;
        n61 n61Var = i0Var.f7928s0;
        if (n61Var != null) {
            n61Var.execute(new u(this, surfaceTexture, i10, i11));
        } else {
            i0Var.q1(i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        i0 i0Var = this.f7821a;
        n61 n61Var = i0Var.f7928s0;
        if (n61Var != null) {
            n61Var.execute(new d1.e(16, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = i0Var.f7930t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u61) ((a2) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f7821a.q1(i11, i12);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.f7821a;
        if (i0Var.W) {
            i0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.f7821a;
        if (i0Var.W) {
            i0Var.x1(null);
        }
        i0Var.q1(0, 0);
    }
}
