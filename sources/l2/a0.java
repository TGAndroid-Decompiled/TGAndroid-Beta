package l2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import e2.w1;
import java.util.ArrayList;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.h61;
public final class a0 implements d3.h0, n2.s, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final g0 f19342a;

    public a0(g0 g0Var) {
        this.f19342a = g0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        g0 g0Var = this.f19342a;
        a61 a61Var = g0Var.f19446s0;
        if (a61Var != null) {
            a61Var.execute(new y(this, surfaceTexture, i7, i10, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        g0Var.x1(surface);
        g0Var.U = surface;
        g0Var.q1(i7, i10);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        g0 g0Var = this.f19342a;
        ArrayList arrayList = g0Var.f19448t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((h61) ((w1) obj)).K.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        a61 a61Var = g0Var.f19446s0;
        if (a61Var != null) {
            a61Var.execute(new kg.i0(this, surfaceTexture));
            return true;
        }
        g0Var.x1(null);
        g0Var.q1(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        g0 g0Var = this.f19342a;
        a61 a61Var = g0Var.f19446s0;
        if (a61Var != null) {
            a61Var.execute(new jg.q(this, surfaceTexture, i7, i10));
        } else {
            g0Var.q1(i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        g0 g0Var = this.f19342a;
        a61 a61Var = g0Var.f19446s0;
        if (a61Var != null) {
            a61Var.execute(new ji.f(19, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = g0Var.f19448t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((h61) ((w1) obj)).K.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        this.f19342a.q1(i10, i11);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        g0 g0Var = this.f19342a;
        if (g0Var.W) {
            g0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        g0 g0Var = this.f19342a;
        if (g0Var.W) {
            g0Var.x1(null);
        }
        g0Var.q1(0, 0);
    }
}
