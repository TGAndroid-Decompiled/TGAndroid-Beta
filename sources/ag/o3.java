package ag;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

public final class o3 extends VideoPlayerHolderBase {

    public final int f583a;

    public final Object f584b;

    public o3(Object obj, int i10) {
        this.f583a = i10;
        this.f584b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f583a) {
            case 1:
                return !((lh.d0) this.f584b).f15848p.f15903j0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f583a) {
            case 0:
                p3 p3Var = (p3) this.f584b;
                TextureView textureView = p3Var.F;
                if (textureView != null && !p3Var.B) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new r1(this, 1)).setDuration(200L);
                }
                break;
            default:
                lh.d0 d0Var = (lh.d0) this.f584b;
                d0Var.f15839f = true;
                d0Var.f15848p.invalidate();
                break;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        switch (this.f583a) {
            case 0:
                p3 p3Var = (p3) this.f584b;
                o3 o3Var = p3Var.D;
                if (o3Var != null) {
                    if (i10 == 4) {
                        o3Var.seekTo(0L);
                        p3Var.D.play();
                    } else if (i10 == 1) {
                        o3Var.play();
                    }
                    break;
                }
                break;
            default:
                super.onStateChanged(z10, i10);
                break;
        }
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        switch (this.f583a) {
            case 1:
                AndroidUtilities.runOnUIThread(new lh.c0(this, i10, i11, i12, 0));
                break;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f10);
                break;
        }
    }
}
