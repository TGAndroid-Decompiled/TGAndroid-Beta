package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.w1;
import ci.uc;
import gg.x1;
import java.util.ArrayList;
import org.telegram.ui.Components.g71;
public final class b0 implements a3.l0, k2.j, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final e0 f10621a;

    public b0(e0 e0Var) {
        this.f10621a = e0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        e0 e0Var = this.f10621a;
        org.telegram.messenger.b1 b1Var = e0Var.m0;
        if (b1Var != null) {
            b1Var.execute(new z(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        e0Var.t1(surface);
        e0Var.S = surface;
        e0Var.m1(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e0 e0Var = this.f10621a;
        ArrayList arrayList = e0Var.f10666n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((g71) ((w1) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        org.telegram.messenger.b1 b1Var = e0Var.m0;
        if (b1Var != null) {
            b1Var.execute(new uc(this, surfaceTexture));
            return true;
        }
        e0Var.t1(null);
        e0Var.m1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e0 e0Var = this.f10621a;
        org.telegram.messenger.b1 b1Var = e0Var.m0;
        if (b1Var != null) {
            b1Var.execute(new gg.n(this, surfaceTexture, i10, i11));
        } else {
            e0Var.m1(i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        e0 e0Var = this.f10621a;
        org.telegram.messenger.b1 b1Var = e0Var.m0;
        if (b1Var != null) {
            b1Var.execute(new x1(10, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = e0Var.f10666n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g71) ((w1) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f10621a.m1(i11, i12);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        e0 e0Var = this.f10621a;
        if (e0Var.U) {
            e0Var.t1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        e0 e0Var = this.f10621a;
        if (e0Var.U) {
            e0Var.t1(null);
        }
        e0Var.m1(0, 0);
    }
}
