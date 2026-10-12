package di;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.fi1;
public final class c0 extends VideoPlayerHolderBase {
    public final int f6680a;
    public final Object f6681b;

    public c0(Object obj, int i10) {
        this.f6680a = i10;
        this.f6681b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f6680a) {
            case 0:
                return !((d0) this.f6681b).f6777p.f6871n0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f6680a) {
            case 0:
                d0 d0Var = (d0) this.f6681b;
                d0Var.f6768f = true;
                d0Var.f6777p.invalidate();
                return;
            default:
                sg.a2 a2Var = (sg.a2) this.f6681b;
                TextureView textureView = a2Var.J;
                if (textureView != null && !a2Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new fi1(this, 14)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        switch (this.f6680a) {
            case 1:
                sg.a2 a2Var = (sg.a2) this.f6681b;
                c0 c0Var = a2Var.H;
                if (c0Var != null) {
                    if (i10 == 4) {
                        c0Var.seekTo(0L);
                        a2Var.H.play();
                        return;
                    } else if (i10 == 1) {
                        c0Var.play();
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
        switch (this.f6680a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this, i10, i11, i12, 0));
                return;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                return;
        }
    }
}
