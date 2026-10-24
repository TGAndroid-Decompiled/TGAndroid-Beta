package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.z1;
import ei.bc;
import java.util.ArrayList;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.j81;
public final class b0 implements a3.m0, k2.v, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final h0 f12353a;

    public b0(h0 h0Var) {
        this.f12353a = h0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        h0 h0Var = this.f12353a;
        b81 b81Var = h0Var.f12443s0;
        if (b81Var != null) {
            b81Var.execute(new z(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        h0Var.x1(surface);
        h0Var.U = surface;
        h0Var.q1(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        h0 h0Var = this.f12353a;
        ArrayList arrayList = h0Var.f12445t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((j81) ((z1) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        b81 b81Var = h0Var.f12443s0;
        if (b81Var != null) {
            b81Var.execute(new bc(this, surfaceTexture));
            return true;
        }
        h0Var.x1(null);
        h0Var.q1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        h0 h0Var = this.f12353a;
        b81 b81Var = h0Var.f12443s0;
        if (b81Var != null) {
            b81Var.execute(new hg.n(this, surfaceTexture, i10, i11));
        } else {
            h0Var.q1(i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        h0 h0Var = this.f12353a;
        b81 b81Var = h0Var.f12443s0;
        if (b81Var != null) {
            b81Var.execute(new hi.t(2, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = h0Var.f12445t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((j81) ((z1) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f12353a.q1(i11, i12);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        h0 h0Var = this.f12353a;
        if (h0Var.W) {
            h0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        h0 h0Var = this.f12353a;
        if (h0Var.W) {
            h0Var.x1(null);
        }
        h0Var.q1(0, 0);
    }
}
