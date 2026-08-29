package j3;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.Components.x61;
public final class h0 implements l3.o, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final k0 f10477a;

    public h0(k0 k0Var) {
        this.f10477a = k0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        k0 k0Var = this.f10477a;
        DispatchQueue dispatchQueue = k0Var.f10588l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new f0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        k0Var.g0(surface);
        k0Var.S = surface;
        k0Var.a0(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        k0 k0Var = this.f10477a;
        ArrayList arrayList = k0Var.m0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((x61) ((g5.t) obj)).F.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        DispatchQueue dispatchQueue = k0Var.f10588l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new cg.m2(this, surfaceTexture));
            return true;
        }
        k0Var.g0(null);
        k0Var.a0(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        k0 k0Var = this.f10477a;
        DispatchQueue dispatchQueue = k0Var.f10588l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new y(this, surfaceTexture, i10, i11));
        } else {
            k0Var.a0(i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        k0 k0Var = this.f10477a;
        DispatchQueue dispatchQueue = k0Var.f10588l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new ef.c(24, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = k0Var.m0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((x61) ((g5.t) obj)).F.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f10477a.a0(i11, i12);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        k0 k0Var = this.f10477a;
        if (k0Var.U) {
            k0Var.g0(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        k0 k0Var = this.f10477a;
        if (k0Var.U) {
            k0Var.g0(null);
        }
        k0Var.a0(0, 0);
    }
}
