package defpackage;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class xv extends VideoPlayerHolderBase {
    public final yv a;

    public xv(yv yvVar) {
        this.a = yvVar;
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
            yv yvVar = this.a;
            yvVar.n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = yvVar.M;
            if (pageblockvideo != null) {
                xi5 xi5Var = yvVar.a;
                zh6 zh6Var = xi5Var.E;
                long j = pageblockvideo.video_id;
                zv a = zv.a(xi5Var.x, yvVar);
                yvVar.c(a);
                zh6Var.k(j, a);
            }
        }
    }
}
