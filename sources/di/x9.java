package di;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class x9 extends VideoPlayerHolderBase {
    public boolean f9389a;
    public final y9 f9390b;

    public x9(y9 y9Var, SurfaceView surfaceView, q9 q9Var) {
        this.f9390b = y9Var;
        if (y9Var.f9416a) {
            with(surfaceView);
        } else {
            with(q9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f9390b.f9443m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        y9 y9Var = this.f9390b;
        p4 p4Var = y9Var.G0;
        if (p4Var != null) {
            p4Var.f8900a = true;
            this.firstFrameRendered = true;
            p4Var.b();
            if (this.paused && y9Var.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f9389a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final x9 f9339b;

                    {
                        this.f9339b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                q4 t10 = this.f9339b.f9390b.t();
                                if (t10 != null) {
                                    o4 o4Var = t10.D1;
                                    if (o4Var.f8871a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.t.o(o4Var.f8871a.f22264id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                q4 t11 = this.f9339b.f9390b.t();
                                if (t11 != null) {
                                    o4 o4Var2 = t11.D1;
                                    if (o4Var2.f8871a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.t.o(o4Var2.f8871a.f22264id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f9389a && i10 == 3) {
                this.f9389a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final x9 f9339b;

                    {
                        this.f9339b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                q4 t10 = this.f9339b.f9390b.t();
                                if (t10 != null) {
                                    o4 o4Var = t10.D1;
                                    if (o4Var.f8871a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.t.o(o4Var.f8871a.f22264id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                q4 t11 = this.f9339b.f9390b.t();
                                if (t11 != null) {
                                    o4 o4Var2 = t11.D1;
                                    if (o4Var2.f8871a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.t.o(o4Var2.f8871a.f22264id, sb3);
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
