package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.ActionBar.e;
public final class rc6 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener a;
    public final uc6 b;

    public rc6(uc6 uc6Var, TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.b = uc6Var;
        this.a = surfaceTextureListener;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.a;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        vy4 vy4Var;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        vy4Var = ((e) this.b).glassEngine;
        vy4Var.g();
    }
}
