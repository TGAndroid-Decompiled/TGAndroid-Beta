package fg;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rg;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class s2 extends VideoPlayerHolderBase {
    public final int f6549a;
    public final Object f6550b;

    public s2(Object obj, int i10) {
        this.f6549a = i10;
        this.f6550b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f6549a) {
            case 1:
                return !((qh.x) this.f6550b).f46297p.f46337k0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f6549a) {
            case 0:
                t2 t2Var = (t2) this.f6550b;
                TextureView textureView = t2Var.G;
                if (textureView != null && !t2Var.C) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new dg.l0(this, 4)).setDuration(200L);
                    return;
                }
                return;
            default:
                qh.x xVar = (qh.x) this.f6550b;
                xVar.f46288f = true;
                xVar.f46297p.invalidate();
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        switch (this.f6549a) {
            case 0:
                t2 t2Var = (t2) this.f6550b;
                s2 s2Var = t2Var.E;
                if (s2Var != null) {
                    if (i10 == 4) {
                        s2Var.seekTo(0L);
                        t2Var.E.play();
                        return;
                    } else if (i10 == 1) {
                        s2Var.play();
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
        switch (this.f6549a) {
            case 1:
                AndroidUtilities.runOnUIThread(new rg(this, i10, i11, i12, 1));
                return;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f10);
                return;
        }
    }
}
