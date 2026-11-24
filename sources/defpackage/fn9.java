package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.voip.VoIPService;
public final class fn9 implements TextureView.SurfaceTextureListener {
    public final on9 a;

    public fn9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        on9 on9Var = this.a;
        on9Var.r0 = surface;
        on9Var.v();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        on9 on9Var = this.a;
        Surface surface = on9Var.r0;
        on9Var.r0 = null;
        y76 y76Var = new y76(surface, surfaceTexture, (byte) 3);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (on9Var.s0 && sharedInstance != null) {
            on9Var.s0 = false;
            sharedInstance.setRtmpStreamVideoOutput(null, y76Var);
        } else {
            on9Var.s0 = false;
            y76Var.run();
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        on9 on9Var = this.a;
        if (!on9Var.u0) {
            on9Var.u0 = true;
            gl.r(on9Var.M0);
            on9Var.w.setVisibility(8);
            on9Var.x.setVisibility(8);
            on9Var.p();
            on9Var.j();
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
