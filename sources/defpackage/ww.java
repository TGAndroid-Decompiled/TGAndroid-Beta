package defpackage;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;
public final class ww extends VideoPlayerHolderBase {
    public final xw a;

    public ww(xw xwVar) {
        this.a = xwVar;
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
            xw xwVar = this.a;
            xwVar.n.setAlpha(1.0f);
            TL_iv.pageBlockVideo pageblockvideo = xwVar.M;
            if (pageblockvideo != null) {
                ui5 ui5Var = xwVar.a;
                vh6 vh6Var = ui5Var.E;
                long j = pageblockvideo.video_id;
                yw a = yw.a(ui5Var.x, xwVar);
                xwVar.c(a);
                vh6Var.k(a, j);
            }
        }
    }
}
