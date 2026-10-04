package ai;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class ic extends VideoPlayerHolderBase {
    public boolean f1103a;
    public final jc f1104b;

    public ic(jc jcVar, SurfaceView surfaceView, bc bcVar) {
        this.f1104b = jcVar;
        if (jcVar.f1144a) {
            with(surfaceView);
        } else {
            with(bcVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f1104b.f1172m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        jc jcVar = this.f1104b;
        d6 d6Var = jcVar.G0;
        if (d6Var != null) {
            d6Var.f772a = true;
            this.firstFrameRendered = true;
            d6Var.b();
            if (this.paused && jcVar.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f1103a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ic f1055b;

                    {
                        this.f1055b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                e6 t10 = this.f1055b.f1104b.t();
                                if (t10 != null) {
                                    c6 c6Var = t10.O1;
                                    if (c6Var.f696a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.f0.n(c6Var.f696a.f20274id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                e6 t11 = this.f1055b.f1104b.t();
                                if (t11 != null) {
                                    c6 c6Var2 = t11.O1;
                                    if (c6Var2.f696a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.f0.n(c6Var2.f696a.f20274id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f1103a && i10 == 3) {
                this.f1103a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ic f1055b;

                    {
                        this.f1055b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                e6 t10 = this.f1055b.f1104b.t();
                                if (t10 != null) {
                                    c6 c6Var = t10.O1;
                                    if (c6Var.f696a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.f0.n(c6Var.f696a.f20274id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                e6 t11 = this.f1055b.f1104b.t();
                                if (t11 != null) {
                                    c6 c6Var2 = t11.O1;
                                    if (c6Var2.f696a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.f0.n(c6Var2.f696a.f20274id, sb3);
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
