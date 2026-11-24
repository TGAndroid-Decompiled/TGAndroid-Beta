package defpackage;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class wv extends VideoPlayerHolderBase {
    public final xv a;

    public wv(xv xvVar) {
        this.a = xvVar;
    }

    @Override
    public final boolean needRepeat() {
        return true;
    }

    @Override
    public final void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
        if (!this.firstFrameRendered) {
            this.firstFrameRendered = true;
            xv xvVar = this.a;
            xvVar.n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = xvVar.M;
            if (pageblockvideo != null) {
                vg5 vg5Var = xvVar.a;
                vf6 vf6Var = vg5Var.E;
                long j = pageblockvideo.video_id;
                yv a = yv.a(vg5Var.x, xvVar);
                xvVar.c(a);
                vf6Var.k(a, j);
            }
        }
    }
}
