package nh;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class h9 extends VideoPlayerHolderBase {
    public boolean f15379a;
    public final i9 f15380b;

    public h9(i9 i9Var, SurfaceView surfaceView, a9 a9Var) {
        this.f15380b = i9Var;
        if (i9Var.f15428a) {
            with(surfaceView);
        } else {
            with(a9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f15380b.f15451j1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        i9 i9Var = this.f15380b;
        c4 c4Var = i9Var.D0;
        if (c4Var != null) {
            c4Var.f15124f = true;
            this.firstFrameRendered = true;
            c4Var.a();
            if (this.paused && i9Var.f15481z0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z4, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f15379a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final h9 f15351b;

                    {
                        this.f15351b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d4 t6 = this.f15351b.f15380b.t();
                                if (t6 != null) {
                                    b4 b4Var = t6.L1;
                                    if (b4Var.f15091a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(t6.getCurrentPeer());
                                        sb.append(" storyId=");
                                        kf.k0.t(b4Var.f15091a.f19394id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                d4 t9 = this.f15351b.f15380b.t();
                                if (t9 != null) {
                                    b4 b4Var2 = t9.L1;
                                    if (b4Var2.f15091a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(t9.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        kf.k0.t(b4Var2.f15091a.f19394id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f15379a && i10 == 3) {
                this.f15379a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final h9 f15351b;

                    {
                        this.f15351b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d4 t6 = this.f15351b.f15380b.t();
                                if (t6 != null) {
                                    b4 b4Var = t6.L1;
                                    if (b4Var.f15091a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(t6.getCurrentPeer());
                                        sb.append(" storyId=");
                                        kf.k0.t(b4Var.f15091a.f19394id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                d4 t9 = this.f15351b.f15380b.t();
                                if (t9 != null) {
                                    b4 b4Var2 = t9.L1;
                                    if (b4Var2.f15091a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(t9.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        kf.k0.t(b4Var2.f15091a.f19394id, sb2);
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
