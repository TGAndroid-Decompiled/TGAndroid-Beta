package di;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p9 extends VideoPlayerHolderBase {
    public boolean f9529a;
    public final q9 f9530b;

    public p9(q9 q9Var, SurfaceView surfaceView, i9 i9Var) {
        this.f9530b = q9Var;
        if (q9Var.f9599a) {
            with(surfaceView);
        } else {
            with(i9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f9530b.l1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        q9 q9Var = this.f9530b;
        i4 i4Var = q9Var.F0;
        if (i4Var != null) {
            i4Var.f9109a = true;
            this.firstFrameRendered = true;
            i4Var.b();
            if (this.paused && q9Var.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z9, int i7) {
        if (i7 == 3 || i7 == 2) {
            if (this.firstFrameRendered && i7 == 2) {
                this.f9529a = true;
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final p9 f9475b;

                    {
                        this.f9475b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                j4 z10 = this.f9475b.f9530b.z();
                                if (z10 != null) {
                                    h4 h4Var = z10.f9250x1;
                                    if (h4Var.f9069a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        jg.g.s(h4Var.f9069a.f27199id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j4 z11 = this.f9475b.f9530b.z();
                                if (z11 != null) {
                                    h4 h4Var2 = z11.f9250x1;
                                    if (h4Var2.f9069a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        jg.g.s(h4Var2.f9069a.f27199id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f9529a && i7 == 3) {
                this.f9529a = false;
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final p9 f9475b;

                    {
                        this.f9475b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                j4 z10 = this.f9475b.f9530b.z();
                                if (z10 != null) {
                                    h4 h4Var = z10.f9250x1;
                                    if (h4Var.f9069a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        jg.g.s(h4Var.f9069a.f27199id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j4 z11 = this.f9475b.f9530b.z();
                                if (z11 != null) {
                                    h4 h4Var2 = z11.f9250x1;
                                    if (h4Var2.f9069a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        jg.g.s(h4Var2.f9069a.f27199id, sb3);
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
