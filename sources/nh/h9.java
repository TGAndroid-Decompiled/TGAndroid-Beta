package nh;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class h9 extends VideoPlayerHolderBase {
    public boolean f15399a;
    public final i9 f15400b;

    public h9(i9 i9Var, SurfaceView surfaceView, a9 a9Var) {
        this.f15400b = i9Var;
        if (i9Var.f15448a) {
            with(surfaceView);
        } else {
            with(a9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f15400b.f15471j1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        i9 i9Var = this.f15400b;
        c4 c4Var = i9Var.D0;
        if (c4Var != null) {
            c4Var.f15144f = true;
            this.firstFrameRendered = true;
            c4Var.a();
            if (this.paused && i9Var.f15501z0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z4, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f15399a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final h9 f15371b;

                    {
                        this.f15371b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d4 t6 = this.f15371b.f15400b.t();
                                if (t6 != null) {
                                    b4 b4Var = t6.L1;
                                    if (b4Var.f15111a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(t6.getCurrentPeer());
                                        sb.append(" storyId=");
                                        kh.a2.t(b4Var.f15111a.f19419id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                d4 t9 = this.f15371b.f15400b.t();
                                if (t9 != null) {
                                    b4 b4Var2 = t9.L1;
                                    if (b4Var2.f15111a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(t9.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        kh.a2.t(b4Var2.f15111a.f19419id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f15399a && i10 == 3) {
                this.f15399a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final h9 f15371b;

                    {
                        this.f15371b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                d4 t6 = this.f15371b.f15400b.t();
                                if (t6 != null) {
                                    b4 b4Var = t6.L1;
                                    if (b4Var.f15111a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(t6.getCurrentPeer());
                                        sb.append(" storyId=");
                                        kh.a2.t(b4Var.f15111a.f19419id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                d4 t9 = this.f15371b.f15400b.t();
                                if (t9 != null) {
                                    b4 b4Var2 = t9.L1;
                                    if (b4Var2.f15111a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(t9.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        kh.a2.t(b4Var2.f15111a.f19419id, sb2);
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
