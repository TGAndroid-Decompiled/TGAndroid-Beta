package ai;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class jc extends VideoPlayerHolderBase {
    public boolean f1213a;
    public final kc f1214b;

    public jc(kc kcVar, SurfaceView surfaceView, cc ccVar) {
        this.f1214b = kcVar;
        if (kcVar.f1253a) {
            with(surfaceView);
        } else {
            with(ccVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f1214b.f1281m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        kc kcVar = this.f1214b;
        e6 e6Var = kcVar.G0;
        if (e6Var != null) {
            e6Var.f882a = true;
            this.firstFrameRendered = true;
            e6Var.b();
            if (this.paused && kcVar.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f1213a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final jc f1170b;

                    {
                        this.f1170b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                f6 t10 = this.f1170b.f1214b.t();
                                if (t10 != null) {
                                    d6 d6Var = t10.O1;
                                    if (d6Var.f822a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.q.o(d6Var.f822a.f20279id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                f6 t11 = this.f1170b.f1214b.t();
                                if (t11 != null) {
                                    d6 d6Var2 = t11.O1;
                                    if (d6Var2.f822a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.q.o(d6Var2.f822a.f20279id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f1213a && i10 == 3) {
                this.f1213a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final jc f1170b;

                    {
                        this.f1170b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                f6 t10 = this.f1170b.f1214b.t();
                                if (t10 != null) {
                                    d6 d6Var = t10.O1;
                                    if (d6Var.f822a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.q.o(d6Var.f822a.f20279id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                f6 t11 = this.f1170b.f1214b.t();
                                if (t11 != null) {
                                    d6 d6Var2 = t11.O1;
                                    if (d6Var2.f822a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.q.o(d6Var2.f822a.f20279id, sb3);
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
