package l2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import e2.w1;
import java.util.ArrayList;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.u51;
public final class c0 implements d3.h0, n2.s, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final i0 f17772a;

    public c0(i0 i0Var) {
        this.f17772a = i0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        i0 i0Var = this.f17772a;
        l51 l51Var = i0Var.f17883s0;
        if (l51Var != null) {
            l51Var.execute(new z(this, surfaceTexture, i7, i10, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        i0Var.x1(surface);
        i0Var.U = surface;
        i0Var.q1(i7, i10);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i0 i0Var = this.f17772a;
        ArrayList arrayList = i0Var.f17885t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((u51) ((w1) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        l51 l51Var = i0Var.f17883s0;
        if (l51Var != null) {
            l51Var.execute(new a0(this, surfaceTexture));
            return true;
        }
        i0Var.x1(null);
        i0Var.q1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        i0 i0Var = this.f17772a;
        l51 l51Var = i0Var.f17883s0;
        if (l51Var != null) {
            l51Var.execute(new jg.r(this, surfaceTexture, i7, i10));
        } else {
            i0Var.q1(i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        i0 i0Var = this.f17772a;
        l51 l51Var = i0Var.f17883s0;
        if (l51Var != null) {
            l51Var.execute(new ha.b(24, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = i0Var.f17885t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((u51) ((w1) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        this.f17772a.q1(i10, i11);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.f17772a;
        if (i0Var.W) {
            i0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.f17772a;
        if (i0Var.W) {
            i0Var.x1(null);
        }
        i0Var.q1(0, 0);
    }
}
