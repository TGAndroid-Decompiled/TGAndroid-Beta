package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.w1;
import ci.rc;
import java.util.ArrayList;
import org.telegram.ui.Components.m81;
public final class c0 implements a3.l0, k2.j, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final f0 f11619a;

    public c0(f0 f0Var) {
        this.f11619a = f0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.f11619a;
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new a0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        f0Var.v1(surface);
        f0Var.S = surface;
        f0Var.o1(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f11619a;
        ArrayList arrayList = f0Var.f11677n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((m81) ((w1) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new rc(this, surfaceTexture));
            return true;
        }
        f0Var.v1(null);
        f0Var.o1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.f11619a;
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new gg.n(this, surfaceTexture, i10, i11));
        } else {
            f0Var.o1(i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.f11619a;
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new gg.w1(10, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = f0Var.f11677n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m81) ((w1) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f11619a.o1(i11, i12);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f11619a;
        if (f0Var.U) {
            f0Var.v1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.f11619a;
        if (f0Var.U) {
            f0Var.v1(null);
        }
        f0Var.o1(0, 0);
    }
}
