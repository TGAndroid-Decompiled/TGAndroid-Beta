package fi;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class e9 extends VideoPlayerHolderBase {
    public boolean f11919a;
    public final f9 f11920b;

    public e9(f9 f9Var, SurfaceView surfaceView, x8 x8Var) {
        this.f11920b = f9Var;
        if (f9Var.f11952a) {
            with(surfaceView);
        } else {
            with(x8Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f11920b.f11980m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        f9 f9Var = this.f11920b;
        y3 y3Var = f9Var.G0;
        if (y3Var != null) {
            y3Var.f12770a = true;
            this.firstFrameRendered = true;
            y3Var.b();
            if (this.paused && f9Var.D0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i7) {
        if (i7 == 3 || i7 == 2) {
            if (this.firstFrameRendered && i7 == 2) {
                this.f11919a = true;
                org.telegram.messenger.g0.g3(new Runnable(this) {
                    public final e9 f11864b;

                    {
                        this.f11864b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z3 z11 = this.f11864b.f11920b.z();
                                if (z11 != null) {
                                    x3 x3Var = z11.f12893y1;
                                    if (x3Var.f12720a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.t(x3Var.f12720a.f28642id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                z3 z12 = this.f11864b.f11920b.z();
                                if (z12 != null) {
                                    x3 x3Var2 = z12.f12893y1;
                                    if (x3Var2.f12720a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.t(x3Var2.f12720a.f28642id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f11919a && i7 == 3) {
                this.f11919a = false;
                org.telegram.messenger.g0.g3(new Runnable(this) {
                    public final e9 f11864b;

                    {
                        this.f11864b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z3 z11 = this.f11864b.f11920b.z();
                                if (z11 != null) {
                                    x3 x3Var = z11.f12893y1;
                                    if (x3Var.f12720a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.t(x3Var.f12720a.f28642id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                z3 z12 = this.f11864b.f11920b.z();
                                if (z12 != null) {
                                    x3 x3Var2 = z12.f12893y1;
                                    if (x3Var2.f12720a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.t(x3Var2.f12720a.f28642id, sb3);
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
