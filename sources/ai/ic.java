package ai;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class ic extends VideoPlayerHolderBase {
    public boolean f1017a;
    public final jc f1018b;

    public ic(jc jcVar, SurfaceView surfaceView, bc bcVar) {
        this.f1018b = jcVar;
        if (jcVar.f1058a) {
            with(surfaceView);
        } else {
            with(bcVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f1018b.f1085m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        jc jcVar = this.f1018b;
        d6 d6Var = jcVar.G0;
        if (d6Var != null) {
            d6Var.f711a = true;
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
                this.f1017a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ic f972b;

                    {
                        this.f972b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                e6 t10 = this.f972b.f1018b.t();
                                if (t10 != null) {
                                    c6 c6Var = t10.O1;
                                    if (c6Var.f642a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.f0.n(c6Var.f642a.f18571id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                e6 t11 = this.f972b.f1018b.t();
                                if (t11 != null) {
                                    c6 c6Var2 = t11.O1;
                                    if (c6Var2.f642a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.f0.n(c6Var2.f642a.f18571id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f1017a && i10 == 3) {
                this.f1017a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ic f972b;

                    {
                        this.f972b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                e6 t10 = this.f972b.f1018b.t();
                                if (t10 != null) {
                                    c6 c6Var = t10.O1;
                                    if (c6Var.f642a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.f0.n(c6Var.f642a.f18571id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                e6 t11 = this.f972b.f1018b.t();
                                if (t11 != null) {
                                    c6 c6Var2 = t11.O1;
                                    if (c6Var2.f642a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.f0.n(c6Var2.f642a.f18571id, sb3);
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
