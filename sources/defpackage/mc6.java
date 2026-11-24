package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.ActionBar.d;
public final class mc6 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener a;
    public final pc6 b;

    public mc6(pc6 pc6Var, TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.b = pc6Var;
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
        sy4 sy4Var;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        sy4Var = ((d) this.b).glassEngine;
        sy4Var.g();
    }
}
