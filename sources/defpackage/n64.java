package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
public final class n64 implements vfc, p30, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final s64 a;

    public n64(s64 s64Var) {
        this.a = s64Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        s64 s64Var = this.a;
        pe2 pe2Var = s64Var.s0;
        if (pe2Var != null) {
            pe2Var.execute(new aq1(this, surfaceTexture, i, i2, (byte) 5));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        s64Var.q1(surface);
        s64Var.U = surface;
        s64Var.f1(i, i2);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        s64 s64Var = this.a;
        ArrayList arrayList = s64Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((kfc) ((cfc) obj)).K.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        pe2 pe2Var = s64Var.s0;
        if (pe2Var != null) {
            pe2Var.execute(new lw3(this, surfaceTexture));
            return true;
        }
        s64Var.q1(null);
        s64Var.f1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        s64 s64Var = this.a;
        pe2 pe2Var = s64Var.s0;
        if (pe2Var != null) {
            pe2Var.execute(new bt(this, surfaceTexture, i, i2));
        } else {
            s64Var.f1(i, i2);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        s64 s64Var = this.a;
        pe2 pe2Var = s64Var.s0;
        if (pe2Var != null) {
            pe2Var.execute(new vx3(this, surfaceTexture, (byte) 10));
            return;
        }
        ArrayList arrayList = s64Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((kfc) ((cfc) obj)).K.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.f1(i2, i3);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        s64 s64Var = this.a;
        if (s64Var.W) {
            s64Var.q1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        s64 s64Var = this.a;
        if (s64Var.W) {
            s64Var.q1(null);
        }
        s64Var.f1(0, 0);
    }
}
