package h3;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.Components.k61;
public final class h0 implements j3.n, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final k0 f9440a;

    public h0(k0 k0Var) {
        this.f9440a = k0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        k0 k0Var = this.f9440a;
        DispatchQueue dispatchQueue = k0Var.f9551l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new e0(this, surfaceTexture, i9, i10, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        k0Var.g0(surface);
        k0Var.S = surface;
        k0Var.a0(i9, i10);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        k0 k0Var = this.f9440a;
        ArrayList arrayList = k0Var.m0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (((k61) ((e5.t) obj)).F.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        DispatchQueue dispatchQueue = k0Var.f9551l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new fh.o1(this, surfaceTexture));
            return true;
        }
        k0Var.g0(null);
        k0Var.a0(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        k0 k0Var = this.f9440a;
        DispatchQueue dispatchQueue = k0Var.f9551l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new y(this, surfaceTexture, i9, i10));
        } else {
            k0Var.a0(i9, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        k0 k0Var = this.f9440a;
        DispatchQueue dispatchQueue = k0Var.f9551l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new g0(0, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = k0Var.m0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((k61) ((e5.t) obj)).F.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
        this.f9440a.a0(i10, i11);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        k0 k0Var = this.f9440a;
        if (k0Var.U) {
            k0Var.g0(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        k0 k0Var = this.f9440a;
        if (k0Var.U) {
            k0Var.g0(null);
        }
        k0Var.a0(0, 0);
    }
}
