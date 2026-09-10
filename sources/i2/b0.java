package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.w1;
import fg.s1;
import gg.v1;
import java.util.ArrayList;
import org.telegram.ui.Components.t71;
public final class b0 implements a3.l0, k2.j, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final e0 f10108a;

    public b0(e0 e0Var) {
        this.f10108a = e0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        e0 e0Var = this.f10108a;
        org.telegram.messenger.e1 e1Var = e0Var.m0;
        if (e1Var != null) {
            e1Var.execute(new z(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        e0Var.t1(surface);
        e0Var.S = surface;
        e0Var.m1(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e0 e0Var = this.f10108a;
        ArrayList arrayList = e0Var.f10152n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((t71) ((w1) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        org.telegram.messenger.e1 e1Var = e0Var.m0;
        if (e1Var != null) {
            e1Var.execute(new v1(this, surfaceTexture));
            return true;
        }
        e0Var.t1(null);
        e0Var.m1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e0 e0Var = this.f10108a;
        org.telegram.messenger.e1 e1Var = e0Var.m0;
        if (e1Var != null) {
            e1Var.execute(new fg.n(this, surfaceTexture, i10, i11));
        } else {
            e0Var.m1(i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        e0 e0Var = this.f10108a;
        org.telegram.messenger.e1 e1Var = e0Var.m0;
        if (e1Var != null) {
            e1Var.execute(new s1(20, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = e0Var.f10152n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t71) ((w1) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f10108a.m1(i11, i12);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        e0 e0Var = this.f10108a;
        if (e0Var.U) {
            e0Var.t1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        e0 e0Var = this.f10108a;
        if (e0Var.U) {
            e0Var.t1(null);
        }
        e0Var.m1(0, 0);
    }
}
