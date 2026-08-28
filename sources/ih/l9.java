package ih;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class l9 extends VideoPlayerHolderBase {
    public boolean f11746a;
    public final m9 f11747b;

    public l9(m9 m9Var, SurfaceView surfaceView, e9 e9Var) {
        this.f11747b = m9Var;
        if (m9Var.f11783a) {
            with(surfaceView);
        } else {
            with(e9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f11747b.f11805i1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        m9 m9Var = this.f11747b;
        h4 h4Var = m9Var.C0;
        if (h4Var != null) {
            h4Var.f11504f = true;
            this.firstFrameRendered = true;
            h4Var.a();
            if (this.paused && m9Var.f11835y0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i9) {
        if (i9 == 3 || i9 == 2) {
            if (this.firstFrameRendered && i9 == 2) {
                this.f11746a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final l9 f11692b;

                    {
                        this.f11692b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                i4 t10 = this.f11692b.f11747b.t();
                                if (t10 != null) {
                                    g4 g4Var = t10.K1;
                                    if (g4Var.f11466a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.l0.n(g4Var.f11466a.f22617id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i4 t11 = this.f11692b.f11747b.t();
                                if (t11 != null) {
                                    g4 g4Var2 = t11.K1;
                                    if (g4Var2.f11466a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.l0.n(g4Var2.f11466a.f22617id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f11746a && i9 == 3) {
                this.f11746a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final l9 f11692b;

                    {
                        this.f11692b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                i4 t10 = this.f11692b.f11747b.t();
                                if (t10 != null) {
                                    g4 g4Var = t10.K1;
                                    if (g4Var.f11466a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.l0.n(g4Var.f11466a.f22617id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i4 t11 = this.f11692b.f11747b.t();
                                if (t11 != null) {
                                    g4 g4Var2 = t11.K1;
                                    if (g4Var2.f11466a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.l0.n(g4Var2.f11466a.f22617id, sb3);
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
