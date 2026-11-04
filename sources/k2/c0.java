package k2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import d2.z1;
import gi.f6;
import java.util.ArrayList;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.m51;
public final class c0 implements c3.i0, m2.u, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final i0 f16459a;

    public c0(i0 i0Var) {
        this.f16459a = i0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        i0 i0Var = this.f16459a;
        e51 e51Var = i0Var.f16573s0;
        if (e51Var != null) {
            e51Var.execute(new a0(this, surfaceTexture, i3, i10, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        i0Var.x1(surface);
        i0Var.U = surface;
        i0Var.q1(i3, i10);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i0 i0Var = this.f16459a;
        ArrayList arrayList = i0Var.f16575t0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((m51) ((z1) obj)).K.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        e51 e51Var = i0Var.f16573s0;
        if (e51Var != null) {
            e51Var.execute(new f6(this, surfaceTexture));
            return true;
        }
        i0Var.x1(null);
        i0Var.q1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        i0 i0Var = this.f16459a;
        e51 e51Var = i0Var.f16573s0;
        if (e51Var != null) {
            e51Var.execute(new u(this, surfaceTexture, i3, i10));
        } else {
            i0Var.q1(i3, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        i0 i0Var = this.f16459a;
        e51 e51Var = i0Var.f16573s0;
        if (e51Var != null) {
            e51Var.execute(new ii.e(11, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = i0Var.f16575t0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((m51) ((z1) obj)).K.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i10, int i11) {
        this.f16459a.q1(i10, i11);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.f16459a;
        if (i0Var.W) {
            i0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.f16459a;
        if (i0Var.W) {
            i0Var.x1(null);
        }
        i0Var.q1(0, 0);
    }
}
