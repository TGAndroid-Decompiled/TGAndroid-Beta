package j3;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.i71;
public final class c0 implements l3.q, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final f0 f8423a;

    public c0(f0 f0Var) {
        this.f8423a = f0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.f8423a;
        Executor executor = f0Var.f8534i0;
        if (executor != null) {
            executor.execute(new b0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        f0Var.Z(surface);
        f0Var.Q = surface;
        f0Var.T(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f8423a;
        ArrayList arrayList = f0Var.f8536j0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((i71) ((i5.t) obj)).G.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        Executor executor = f0Var.f8534i0;
        if (executor != null) {
            executor.execute(new e3.h(this, surfaceTexture));
            return true;
        }
        f0Var.Z(null);
        f0Var.T(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.f8423a;
        Executor executor = f0Var.f8534i0;
        if (executor != null) {
            executor.execute(new v(this, surfaceTexture, i10, i11));
        } else {
            f0Var.T(i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f8423a;
        Executor executor = f0Var.f8534i0;
        if (executor != null) {
            executor.execute(new ff.c(18, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = f0Var.f8536j0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i71) ((i5.t) obj)).G.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f8423a.T(i11, i12);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f8423a;
        if (f0Var.S) {
            f0Var.Z(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f8423a;
        if (f0Var.S) {
            f0Var.Z(null);
        }
        f0Var.T(0, 0);
    }
}
