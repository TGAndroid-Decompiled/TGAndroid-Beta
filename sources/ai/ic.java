package ai;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class ic extends VideoPlayerHolderBase {
    public boolean f1020a;
    public final jc f1021b;

    public ic(jc jcVar, SurfaceView surfaceView, bc bcVar) {
        this.f1021b = jcVar;
        if (jcVar.f1060a) {
            with(surfaceView);
        } else {
            with(bcVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f1021b.f1087m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        jc jcVar = this.f1021b;
        d6 d6Var = jcVar.G0;
        if (d6Var != null) {
            d6Var.f714a = true;
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
                this.f1020a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ic f975b;

                    {
                        this.f975b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                e6 t10 = this.f975b.f1021b.t();
                                if (t10 != null) {
                                    c6 c6Var = t10.O1;
                                    if (c6Var.f645a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.l0.m(c6Var.f645a.f18564id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                e6 t11 = this.f975b.f1021b.t();
                                if (t11 != null) {
                                    c6 c6Var2 = t11.O1;
                                    if (c6Var2.f645a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.l0.m(c6Var2.f645a.f18564id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f1020a && i10 == 3) {
                this.f1020a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ic f975b;

                    {
                        this.f975b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                e6 t10 = this.f975b.f1021b.t();
                                if (t10 != null) {
                                    c6 c6Var = t10.O1;
                                    if (c6Var.f645a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.l0.m(c6Var.f645a.f18564id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                e6 t11 = this.f975b.f1021b.t();
                                if (t11 != null) {
                                    c6 c6Var2 = t11.O1;
                                    if (c6Var2.f645a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.l0.m(c6Var2.f645a.f18564id, sb3);
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
