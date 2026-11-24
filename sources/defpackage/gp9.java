package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.voip.VoIPService;
public final class gp9 implements TextureView.SurfaceTextureListener {
    public final pp9 a;

    public gp9(pp9 pp9Var) {
        this.a = pp9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        pp9 pp9Var = this.a;
        pp9Var.r0 = surface;
        pp9Var.v();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pp9 pp9Var = this.a;
        Surface surface = pp9Var.r0;
        pp9Var.r0 = null;
        x96 x96Var = new x96(surface, surfaceTexture, (byte) 3);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (pp9Var.s0 && sharedInstance != null) {
            pp9Var.s0 = false;
            sharedInstance.setRtmpStreamVideoOutput(null, x96Var);
        } else {
            pp9Var.s0 = false;
            x96Var.run();
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        pp9 pp9Var = this.a;
        if (!pp9Var.u0) {
            pp9Var.u0 = true;
            gm.r(pp9Var.M0);
            pp9Var.w.setVisibility(8);
            pp9Var.x.setVisibility(8);
            pp9Var.p();
            pp9Var.j();
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
