package fi;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class h9 extends VideoPlayerHolderBase {
    public boolean f11808a;
    public final i9 f11809b;

    public h9(i9 i9Var, SurfaceView surfaceView, a9 a9Var) {
        this.f11809b = i9Var;
        if (i9Var.f11830a) {
            with(surfaceView);
        } else {
            with(a9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f11809b.f11858m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        i9 i9Var = this.f11809b;
        a4 a4Var = i9Var.G0;
        if (a4Var != null) {
            a4Var.f11405a = true;
            this.firstFrameRendered = true;
            a4Var.b();
            if (this.paused && i9Var.D0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i7) {
        if (i7 == 3 || i7 == 2) {
            if (this.firstFrameRendered && i7 == 2) {
                this.f11808a = true;
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final h9 f11756b;

                    {
                        this.f11756b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                b4 z11 = this.f11756b.f11809b.z();
                                if (z11 != null) {
                                    z3 z3Var = z11.f11543y1;
                                    if (z3Var.f12579a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.r(z3Var.f12579a.f28290id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                b4 z12 = this.f11756b.f11809b.z();
                                if (z12 != null) {
                                    z3 z3Var2 = z12.f11543y1;
                                    if (z3Var2.f12579a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.r(z3Var2.f12579a.f28290id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f11808a && i7 == 3) {
                this.f11808a = false;
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final h9 f11756b;

                    {
                        this.f11756b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                b4 z11 = this.f11756b.f11809b.z();
                                if (z11 != null) {
                                    z3 z3Var = z11.f11543y1;
                                    if (z3Var.f12579a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(z11.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i5.c.r(z3Var.f12579a.f28290id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                b4 z12 = this.f11756b.f11809b.z();
                                if (z12 != null) {
                                    z3 z3Var2 = z12.f11543y1;
                                    if (z3Var2.f12579a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(z12.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i5.c.r(z3Var2.f12579a.f28290id, sb3);
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
