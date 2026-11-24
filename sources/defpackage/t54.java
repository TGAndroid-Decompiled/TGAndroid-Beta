package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
public final class t54 implements xbc, o30, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final y54 a;

    public t54(y54 y54Var) {
        this.a = y54Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        y54 y54Var = this.a;
        ge2 ge2Var = y54Var.s0;
        if (ge2Var != null) {
            ge2Var.execute(new mp1(this, surfaceTexture, i, i2, (byte) 5));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        y54Var.q1(surface);
        y54Var.U = surface;
        y54Var.f1(i, i2);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        y54 y54Var = this.a;
        ArrayList arrayList = y54Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((lbc) ((cbc) obj)).K.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        ge2 ge2Var = y54Var.s0;
        if (ge2Var != null) {
            ge2Var.execute(new s54(this, surfaceTexture));
            return true;
        }
        y54Var.q1(null);
        y54Var.f1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        y54 y54Var = this.a;
        ge2 ge2Var = y54Var.s0;
        if (ge2Var != null) {
            ge2Var.execute(new bt(this, surfaceTexture, i, i2));
        } else {
            y54Var.f1(i, i2);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        y54 y54Var = this.a;
        ge2 ge2Var = y54Var.s0;
        if (ge2Var != null) {
            ge2Var.execute(new eu3(this, surfaceTexture, (byte) 13));
            return;
        }
        ArrayList arrayList = y54Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((lbc) ((cbc) obj)).K.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.f1(i2, i3);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        y54 y54Var = this.a;
        if (y54Var.W) {
            y54Var.q1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        y54 y54Var = this.a;
        if (y54Var.W) {
            y54Var.q1(null);
        }
        y54Var.f1(0, 0);
    }
}
