package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.voip.VoIPService;
public final class vq9 implements TextureView.SurfaceTextureListener {
    public final er9 a;

    public vq9(er9 er9Var) {
        this.a = er9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        er9 er9Var = this.a;
        er9Var.r0 = surface;
        er9Var.v();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        er9 er9Var = this.a;
        Surface surface = er9Var.r0;
        er9Var.r0 = null;
        ca6 ca6Var = new ca6(surface, surfaceTexture, (byte) 3);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (er9Var.s0 && sharedInstance != null) {
            er9Var.s0 = false;
            sharedInstance.setRtmpStreamVideoOutput(null, ca6Var);
        } else {
            er9Var.s0 = false;
            ca6Var.run();
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        er9 er9Var = this.a;
        if (!er9Var.u0) {
            er9Var.u0 = true;
            hl.r(er9Var.M0);
            er9Var.w.setVisibility(8);
            er9Var.x.setVisibility(8);
            er9Var.p();
            er9Var.j();
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
