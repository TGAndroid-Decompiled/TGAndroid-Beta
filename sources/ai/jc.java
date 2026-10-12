package ai;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class jc extends VideoPlayerHolderBase {
    public boolean f1211a;
    public final kc f1212b;

    public jc(kc kcVar, SurfaceView surfaceView, cc ccVar) {
        this.f1212b = kcVar;
        if (kcVar.f1251a) {
            with(surfaceView);
        } else {
            with(ccVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f1212b.f1279m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        kc kcVar = this.f1212b;
        e6 e6Var = kcVar.G0;
        if (e6Var != null) {
            e6Var.f880a = true;
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
                this.f1211a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final jc f1168b;

                    {
                        this.f1168b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                f6 t10 = this.f1168b.f1212b.t();
                                if (t10 != null) {
                                    d6 d6Var = t10.O1;
                                    if (d6Var.f820a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.v0.o(d6Var.f820a.f20041id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                f6 t11 = this.f1168b.f1212b.t();
                                if (t11 != null) {
                                    d6 d6Var2 = t11.O1;
                                    if (d6Var2.f820a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.v0.o(d6Var2.f820a.f20041id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f1211a && i10 == 3) {
                this.f1211a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final jc f1168b;

                    {
                        this.f1168b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                f6 t10 = this.f1168b.f1212b.t();
                                if (t10 != null) {
                                    d6 d6Var = t10.O1;
                                    if (d6Var.f820a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.v0.o(d6Var.f820a.f20041id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                f6 t11 = this.f1168b.f1212b.t();
                                if (t11 != null) {
                                    d6 d6Var2 = t11.O1;
                                    if (d6Var2.f820a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.v0.o(d6Var2.f820a.f20041id, sb3);
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
