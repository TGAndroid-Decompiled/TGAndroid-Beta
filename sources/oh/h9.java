package oh;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class h9 extends VideoPlayerHolderBase {
    public boolean f17201a;
    public final i9 f17202b;

    public h9(i9 i9Var, SurfaceView surfaceView, a9 a9Var) {
        this.f17202b = i9Var;
        if (i9Var.f17252a) {
            with(surfaceView);
        } else {
            with(a9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f17202b.f17276j1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        i9 i9Var = this.f17202b;
        e4 e4Var = i9Var.D0;
        if (e4Var != null) {
            e4Var.f17023f = true;
            this.firstFrameRendered = true;
            e4Var.a();
            if (this.paused && i9Var.f17306z0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z4, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f17201a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final h9 f17170b;

                    {
                        this.f17170b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                f4 t6 = this.f17170b.f17202b.t();
                                if (t6 != null) {
                                    d4 d4Var = t6.L1;
                                    if (d4Var.f16961a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(t6.getCurrentPeer());
                                        sb.append(" storyId=");
                                        l.d.t(d4Var.f16961a.f21080id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                f4 t9 = this.f17170b.f17202b.t();
                                if (t9 != null) {
                                    d4 d4Var2 = t9.L1;
                                    if (d4Var2.f16961a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(t9.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        l.d.t(d4Var2.f16961a.f21080id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f17201a && i10 == 3) {
                this.f17201a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final h9 f17170b;

                    {
                        this.f17170b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                f4 t6 = this.f17170b.f17202b.t();
                                if (t6 != null) {
                                    d4 d4Var = t6.L1;
                                    if (d4Var.f16961a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(t6.getCurrentPeer());
                                        sb.append(" storyId=");
                                        l.d.t(d4Var.f16961a.f21080id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                f4 t9 = this.f17170b.f17202b.t();
                                if (t9 != null) {
                                    d4 d4Var2 = t9.L1;
                                    if (d4Var2.f16961a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(t9.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        l.d.t(d4Var2.f16961a.f21080id, sb2);
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
