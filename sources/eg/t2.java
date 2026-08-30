package eg;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rg;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class t2 extends VideoPlayerHolderBase {
    public final int f5510a;
    public final Object f5511b;

    public t2(Object obj, int i10) {
        this.f5510a = i10;
        this.f5511b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f5510a) {
            case 1:
                return !((ph.x) this.f5511b).f42530p.f42588k0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f5510a) {
            case 0:
                u2 u2Var = (u2) this.f5511b;
                TextureView textureView = u2Var.G;
                if (textureView != null && !u2Var.C) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new cg.l0(this, 4)).setDuration(200L);
                    return;
                }
                return;
            default:
                ph.x xVar = (ph.x) this.f5511b;
                xVar.f42521f = true;
                xVar.f42530p.invalidate();
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        switch (this.f5510a) {
            case 0:
                u2 u2Var = (u2) this.f5511b;
                t2 t2Var = u2Var.E;
                if (t2Var != null) {
                    if (i10 == 4) {
                        t2Var.seekTo(0L);
                        u2Var.E.play();
                        return;
                    } else if (i10 == 1) {
                        t2Var.play();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                super.onStateChanged(z4, i10);
                return;
        }
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        switch (this.f5510a) {
            case 1:
                AndroidUtilities.runOnUIThread(new rg(this, i10, i11, i12, 1));
                return;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f10);
                return;
        }
    }
}
