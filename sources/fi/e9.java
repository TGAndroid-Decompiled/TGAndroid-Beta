package fi;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class e9 extends VideoPlayerHolderBase {
    public boolean f11914a;
    public final f9 f11915b;

    public e9(f9 f9Var, SurfaceView surfaceView, x8 x8Var) {
        this.f11915b = f9Var;
        if (f9Var.f11947a) {
            with(surfaceView);
        } else {
            with(x8Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f11915b.f11975m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        f9 f9Var = this.f11915b;
        y3 y3Var = f9Var.G0;
        if (y3Var != null) {
            y3Var.f12765a = true;
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
                this.f11914a = true;
                org.telegram.messenger.g0.g3(new Runnable(this) {
                    public final e9 f11859b;

                    {
                        this.f11859b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z3 z11 = this.f11859b.f11915b.z();
                                if (z11 != null) {
                                    x3 x3Var = z11.f12888y1;
                                    if (x3Var.f12715a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.t(x3Var.f12715a.f28637id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                z3 z12 = this.f11859b.f11915b.z();
                                if (z12 != null) {
                                    x3 x3Var2 = z12.f12888y1;
                                    if (x3Var2.f12715a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.t(x3Var2.f12715a.f28637id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f11914a && i7 == 3) {
                this.f11914a = false;
                org.telegram.messenger.g0.g3(new Runnable(this) {
                    public final e9 f11859b;

                    {
                        this.f11859b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z3 z11 = this.f11859b.f11915b.z();
                                if (z11 != null) {
                                    x3 x3Var = z11.f12888y1;
                                    if (x3Var.f12715a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.t(x3Var.f12715a.f28637id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                z3 z12 = this.f11859b.f11915b.z();
                                if (z12 != null) {
                                    x3 x3Var2 = z12.f12888y1;
                                    if (x3Var2.f12715a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.t(x3Var2.f12715a.f28637id, sb3);
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
