package di;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o9 extends VideoPlayerHolderBase {
    public boolean f9480a;
    public final p9 f9481b;

    public o9(p9 p9Var, SurfaceView surfaceView, h9 h9Var) {
        this.f9481b = p9Var;
        if (p9Var.f9529a) {
            with(surfaceView);
        } else {
            with(h9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f9481b.l1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        p9 p9Var = this.f9481b;
        h4 h4Var = p9Var.F0;
        if (h4Var != null) {
            h4Var.f9074a = true;
            this.firstFrameRendered = true;
            h4Var.b();
            if (this.paused && p9Var.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z9, int i7) {
        if (i7 == 3 || i7 == 2) {
            if (this.firstFrameRendered && i7 == 2) {
                this.f9480a = true;
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final o9 f9437b;

                    {
                        this.f9437b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                i4 z10 = this.f9437b.f9481b.z();
                                if (z10 != null) {
                                    g4 g4Var = z10.f9213x1;
                                    if (g4Var.f9038a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        jg.g.s(g4Var.f9038a.f27192id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i4 z11 = this.f9437b.f9481b.z();
                                if (z11 != null) {
                                    g4 g4Var2 = z11.f9213x1;
                                    if (g4Var2.f9038a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        jg.g.s(g4Var2.f9038a.f27192id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f9480a && i7 == 3) {
                this.f9480a = false;
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final o9 f9437b;

                    {
                        this.f9437b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                i4 z10 = this.f9437b.f9481b.z();
                                if (z10 != null) {
                                    g4 g4Var = z10.f9213x1;
                                    if (g4Var.f9038a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        jg.g.s(g4Var.f9038a.f27192id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i4 z11 = this.f9437b.f9481b.z();
                                if (z11 != null) {
                                    g4 g4Var2 = z11.f9213x1;
                                    if (g4Var2.f9038a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        jg.g.s(g4Var2.f9038a.f27192id, sb3);
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
