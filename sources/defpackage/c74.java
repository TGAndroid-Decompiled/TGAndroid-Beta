package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
public final class c74 implements ydc, o40, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final h74 a;

    public c74(h74 h74Var) {
        this.a = h74Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        h74 h74Var = this.a;
        rf2 rf2Var = h74Var.s0;
        if (rf2Var != null) {
            rf2Var.execute(new zq1(this, surfaceTexture, i, i2, (byte) 5));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        h74Var.q1(surface);
        h74Var.U = surface;
        h74Var.f1(i, i2);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        h74 h74Var = this.a;
        ArrayList arrayList = h74Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((ndc) ((fdc) obj)).K.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        rf2 rf2Var = h74Var.s0;
        if (rf2Var != null) {
            rf2Var.execute(new a14(this, surfaceTexture));
            return true;
        }
        h74Var.q1(null);
        h74Var.f1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        h74 h74Var = this.a;
        rf2 rf2Var = h74Var.s0;
        if (rf2Var != null) {
            rf2Var.execute(new cu(this, surfaceTexture, i, i2));
        } else {
            h74Var.f1(i, i2);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        h74 h74Var = this.a;
        rf2 rf2Var = h74Var.s0;
        if (rf2Var != null) {
            rf2Var.execute(new pv3(this, surfaceTexture, (byte) 14));
            return;
        }
        ArrayList arrayList = h74Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ndc) ((fdc) obj)).K.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.f1(i2, i3);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        h74 h74Var = this.a;
        if (h74Var.W) {
            h74Var.q1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        h74 h74Var = this.a;
        if (h74Var.W) {
            h74Var.q1(null);
        }
        h74Var.f1(0, 0);
    }
}
