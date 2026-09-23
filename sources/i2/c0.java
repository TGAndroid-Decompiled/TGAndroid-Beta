package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.w1;
import ci.rc;
import gg.x1;
import java.util.ArrayList;
import org.telegram.ui.Components.f71;
public final class c0 implements a3.l0, k2.j, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final f0 f10616a;

    public c0(f0 f0Var) {
        this.f10616a = f0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.f10616a;
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new a0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        f0Var.t1(surface);
        f0Var.S = surface;
        f0Var.m1(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f10616a;
        ArrayList arrayList = f0Var.f10670n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((f71) ((w1) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new rc(this, surfaceTexture));
            return true;
        }
        f0Var.t1(null);
        f0Var.m1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.f10616a;
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new gg.n(this, surfaceTexture, i10, i11));
        } else {
            f0Var.m1(i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f10616a;
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new x1(10, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = f0Var.f10670n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f71) ((w1) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f10616a.m1(i11, i12);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f10616a;
        if (f0Var.U) {
            f0Var.t1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f10616a;
        if (f0Var.U) {
            f0Var.t1(null);
        }
        f0Var.m1(0, 0);
    }
}
