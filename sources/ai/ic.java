package ai;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class ic extends VideoPlayerHolderBase {
    public boolean f1032a;
    public final jc f1033b;

    public ic(jc jcVar, SurfaceView surfaceView, bc bcVar) {
        this.f1033b = jcVar;
        if (jcVar.f1067a) {
            with(surfaceView);
        } else {
            with(bcVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f1033b.f1094m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        jc jcVar = this.f1033b;
        e6 e6Var = jcVar.G0;
        if (e6Var != null) {
            e6Var.f764a = true;
            this.firstFrameRendered = true;
            e6Var.b();
            if (this.paused && jcVar.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f1032a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ic f965b;

                    {
                        this.f965b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                f6 t10 = this.f965b.f1033b.t();
                                if (t10 != null) {
                                    d6 d6Var = t10.O1;
                                    if (d6Var.f706a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.l0.m(d6Var.f706a.f18563id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                f6 t11 = this.f965b.f1033b.t();
                                if (t11 != null) {
                                    d6 d6Var2 = t11.O1;
                                    if (d6Var2.f706a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.l0.m(d6Var2.f706a.f18563id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f1032a && i10 == 3) {
                this.f1032a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ic f965b;

                    {
                        this.f965b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                f6 t10 = this.f965b.f1033b.t();
                                if (t10 != null) {
                                    d6 d6Var = t10.O1;
                                    if (d6Var.f706a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.l0.m(d6Var.f706a.f18563id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                f6 t11 = this.f965b.f1033b.t();
                                if (t11 != null) {
                                    d6 d6Var2 = t11.O1;
                                    if (d6Var2.f706a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.l0.m(d6Var2.f706a.f18563id, sb3);
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
