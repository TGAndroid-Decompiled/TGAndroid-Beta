package lh;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class h9 extends VideoPlayerHolderBase {
    public boolean f15695a;
    public final i9 f15696b;

    public h9(i9 i9Var, SurfaceView surfaceView, a9 a9Var) {
        this.f15696b = i9Var;
        if (i9Var.f15742a) {
            with(surfaceView);
        } else {
            with(a9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f15696b.f15764i1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        i9 i9Var = this.f15696b;
        c4 c4Var = i9Var.C0;
        if (c4Var != null) {
            c4Var.f15430f = true;
            this.firstFrameRendered = true;
            c4Var.a();
            if (this.paused && i9Var.f15794y0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f15695a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final h9 f15649b;

                    {
                        this.f15649b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d4 t10 = this.f15649b.f15696b.t();
                                if (t10 != null) {
                                    b4 b4Var = t10.K1;
                                    if (b4Var.f15374a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        j7.l1.t(b4Var.f15374a.f22629id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                d4 t11 = this.f15649b.f15696b.t();
                                if (t11 != null) {
                                    b4 b4Var2 = t11.K1;
                                    if (b4Var2.f15374a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        j7.l1.t(b4Var2.f15374a.f22629id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f15695a && i10 == 3) {
                this.f15695a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final h9 f15649b;

                    {
                        this.f15649b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d4 t10 = this.f15649b.f15696b.t();
                                if (t10 != null) {
                                    b4 b4Var = t10.K1;
                                    if (b4Var.f15374a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        j7.l1.t(b4Var.f15374a.f22629id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                d4 t11 = this.f15649b.f15696b.t();
                                if (t11 != null) {
                                    b4 b4Var2 = t11.K1;
                                    if (b4Var2.f15374a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        j7.l1.t(b4Var2.f15374a.f22629id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }
}
