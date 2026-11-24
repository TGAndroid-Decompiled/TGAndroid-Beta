package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
public final class z76 implements zn9, TextureView.SurfaceTextureListener {
    public final ya8 a;
    public volatile Surface b;
    public boolean c;

    public z76(ya8 ya8Var) {
        this.a = ya8Var;
        ya8Var.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = ya8Var.getSurfaceTexture();
        if (surfaceTexture != null) {
            this.b = new Surface(surfaceTexture);
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final void c(SurfaceTexture surfaceTexture) {
        if (this.c) {
            if (surfaceTexture != null) {
                um9.I(this, new tp5(surfaceTexture, (byte) 16));
                return;
            }
            return;
        }
        this.c = true;
        Surface surface = this.b;
        this.b = null;
        um9.I(this, new y76(surface, surfaceTexture, (byte) 1));
    }

    @Override
    public final Surface getSurface() {
        return this.b;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.c) {
            return;
        }
        this.b = new Surface(surfaceTexture);
        um9.I(this, null);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.c) {
            return false;
        }
        Surface surface = this.b;
        this.b = null;
        um9.I(this, new y76(surface, surfaceTexture, (byte) 0));
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void a(int i, int i2) {
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
