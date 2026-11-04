package ei;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q9 extends VideoPlayerHolderBase {
    public boolean f10820a;
    public final r9 f10821b;

    public q9(r9 r9Var, SurfaceView surfaceView, j9 j9Var) {
        this.f10821b = r9Var;
        if (r9Var.f10908a) {
            with(surfaceView);
        } else {
            with(j9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f10821b.f10938n1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        r9 r9Var = this.f10821b;
        i4 i4Var = r9Var.H0;
        if (i4Var != null) {
            i4Var.f10402a = true;
            this.firstFrameRendered = true;
            i4Var.b();
            if (this.paused && r9Var.D0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i3) {
        if (i3 == 3 || i3 == 2) {
            if (this.firstFrameRendered && i3 == 2) {
                this.f10820a = true;
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final q9 f10779b;

                    {
                        this.f10779b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                j4 H = this.f10779b.f10821b.H();
                                if (H != null) {
                                    h4 h4Var = H.f10527y1;
                                    if (h4Var.f10358a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        k2.p1.q(h4Var.f10358a.f27240id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j4 H2 = this.f10779b.f10821b.H();
                                if (H2 != null) {
                                    h4 h4Var2 = H2.f10527y1;
                                    if (h4Var2.f10358a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        k2.p1.q(h4Var2.f10358a.f27240id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f10820a && i3 == 3) {
                this.f10820a = false;
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final q9 f10779b;

                    {
                        this.f10779b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                j4 H = this.f10779b.f10821b.H();
                                if (H != null) {
                                    h4 h4Var = H.f10527y1;
                                    if (h4Var.f10358a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        k2.p1.q(h4Var.f10358a.f27240id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j4 H2 = this.f10779b.f10821b.H();
                                if (H2 != null) {
                                    h4 h4Var2 = H2.f10527y1;
                                    if (h4Var2.f10358a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        k2.p1.q(h4Var2.f10358a.f27240id, sb3);
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
