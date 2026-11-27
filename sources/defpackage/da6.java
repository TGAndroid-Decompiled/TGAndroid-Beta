package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
public final class da6 implements qr9, TextureView.SurfaceTextureListener {
    public final ne8 a;
    public volatile Surface b;
    public boolean c;

    public da6(ne8 ne8Var) {
        this.a = ne8Var;
        ne8Var.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = ne8Var.getSurfaceTexture();
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
                kq9.I(this, new z96(surfaceTexture, (byte) 1));
                return;
            }
            return;
        }
        this.c = true;
        Surface surface = this.b;
        this.b = null;
        kq9.I(this, new ca6(surface, surfaceTexture, (byte) 1));
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
        kq9.I(this, null);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.c) {
            return false;
        }
        Surface surface = this.b;
        this.b = null;
        kq9.I(this, new ca6(surface, surfaceTexture, (byte) 0));
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
