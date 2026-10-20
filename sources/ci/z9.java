package ci;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class z9 extends VideoPlayerHolderBase {
    public boolean f6263a;
    public final aa f6264b;

    public z9(aa aaVar, SurfaceView surfaceView, s9 s9Var) {
        this.f6264b = aaVar;
        if (aaVar.f5174a) {
            with(surfaceView);
        } else {
            with(s9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f6264b.f5201m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        aa aaVar = this.f6264b;
        p4 p4Var = aaVar.G0;
        if (p4Var != null) {
            p4Var.f5725a = true;
            this.firstFrameRendered = true;
            p4Var.b();
            if (this.paused && aaVar.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f6263a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final z9 f6235b;

                    {
                        this.f6235b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                q4 t10 = this.f6235b.f6264b.t();
                                if (t10 != null) {
                                    o4 o4Var = t10.O1;
                                    if (o4Var.f5688a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(o4Var.f5688a.f20510id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                q4 t11 = this.f6235b.f6264b.t();
                                if (t11 != null) {
                                    o4 o4Var2 = t11.O1;
                                    if (o4Var2.f5688a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(o4Var2.f5688a.f20510id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f6263a && i10 == 3) {
                this.f6263a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final z9 f6235b;

                    {
                        this.f6235b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                q4 t10 = this.f6235b.f6264b.t();
                                if (t10 != null) {
                                    o4 o4Var = t10.O1;
                                    if (o4Var.f5688a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(o4Var.f5688a.f20510id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                q4 t11 = this.f6235b.f6264b.t();
                                if (t11 != null) {
                                    o4 o4Var2 = t11.O1;
                                    if (o4Var2.f5688a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(o4Var2.f5688a.f20510id, sb3);
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
