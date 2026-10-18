package ci;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class y9 extends VideoPlayerHolderBase {
    public boolean f6162a;
    public final z9 f6163b;

    public y9(z9 z9Var, SurfaceView surfaceView, r9 r9Var) {
        this.f6163b = z9Var;
        if (z9Var.f6209a) {
            with(surfaceView);
        } else {
            with(r9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f6163b.f6236m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        z9 z9Var = this.f6163b;
        o4 o4Var = z9Var.G0;
        if (o4Var != null) {
            o4Var.f5627a = true;
            this.firstFrameRendered = true;
            o4Var.b();
            if (this.paused && z9Var.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f6162a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final y9 f6138b;

                    {
                        this.f6138b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p4 t10 = this.f6138b.f6163b.t();
                                if (t10 != null) {
                                    n4 n4Var = t10.O1;
                                    if (n4Var.f5591a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(n4Var.f5591a.f20506id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                p4 t11 = this.f6138b.f6163b.t();
                                if (t11 != null) {
                                    n4 n4Var2 = t11.O1;
                                    if (n4Var2.f5591a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(n4Var2.f5591a.f20506id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f6162a && i10 == 3) {
                this.f6162a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final y9 f6138b;

                    {
                        this.f6138b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p4 t10 = this.f6138b.f6163b.t();
                                if (t10 != null) {
                                    n4 n4Var = t10.O1;
                                    if (n4Var.f5591a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(n4Var.f5591a.f20506id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                p4 t11 = this.f6138b.f6163b.t();
                                if (t11 != null) {
                                    n4 n4Var2 = t11.O1;
                                    if (n4Var2.f5591a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(n4Var2.f5591a.f20506id, sb3);
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
