package bi;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.mv0;
public final class h0 extends VideoPlayerHolderBase {
    public final int f2775a;
    public final Object f2776b;

    public h0(Object obj, int i10) {
        this.f2775a = i10;
        this.f2776b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f2775a) {
            case 0:
                return !((i0) this.f2776b).f2837p.f2921n0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f2775a) {
            case 0:
                i0 i0Var = (i0) this.f2776b;
                i0Var.f2828f = true;
                i0Var.f2837p.invalidate();
                return;
            default:
                qg.a2 a2Var = (qg.a2) this.f2776b;
                TextureView textureView = a2Var.J;
                if (textureView != null && !a2Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new mv0(this, 22)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        switch (this.f2775a) {
            case 1:
                qg.a2 a2Var = (qg.a2) this.f2776b;
                h0 h0Var = a2Var.H;
                if (h0Var != null) {
                    if (i10 == 4) {
                        h0Var.seekTo(0L);
                        a2Var.H.play();
                        return;
                    } else if (i10 == 1) {
                        h0Var.play();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                super.onStateChanged(z10, i10);
                return;
        }
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        switch (this.f2775a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g0(this, i10, i11, i12, 0));
                return;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                return;
        }
    }
}
