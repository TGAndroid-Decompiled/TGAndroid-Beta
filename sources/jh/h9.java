package jh;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

public final class h9 extends VideoPlayerHolderBase {

    public boolean f13421a;

    public final i9 f13422b;

    public h9(i9 i9Var, SurfaceView surfaceView, a9 a9Var) {
        this.f13422b = i9Var;
        if (i9Var.f13464a) {
            with(surfaceView);
        } else {
            with(a9Var);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f13422b.f13486i1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        i9 i9Var = this.f13422b;
        d4 d4Var = i9Var.C0;
        if (d4Var == null) {
            return;
        }
        d4Var.f13195f = true;
        this.firstFrameRendered = true;
        d4Var.a();
        if (!this.paused || i9Var.f13516y0 == null) {
            return;
        }
        prepareStub();
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f13421a = true;
                final int i11 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final h9 f13375b;

                    {
                        this.f13375b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                e4 e4VarT = this.f13375b.f13422b.t();
                                if (e4VarT != null) {
                                    c4 c4Var = e4VarT.K1;
                                    if (c4Var.f13141a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(e4VarT.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i0.a.v(c4Var.f13141a.f22617id, sb2);
                                    }
                                }
                                break;
                            default:
                                e4 e4VarT2 = this.f13375b.f13422b.t();
                                if (e4VarT2 != null) {
                                    c4 c4Var2 = e4VarT2.K1;
                                    if (c4Var2.f13141a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(e4VarT2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i0.a.v(c4Var2.f13141a.f22617id, sb3);
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.f13421a && i10 == 3) {
                this.f13421a = false;
                final int i12 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final h9 f13375b;

                    {
                        this.f13375b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                e4 e4VarT = this.f13375b.f13422b.t();
                                if (e4VarT != null) {
                                    c4 c4Var = e4VarT.K1;
                                    if (c4Var.f13141a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(e4VarT.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i0.a.v(c4Var.f13141a.f22617id, sb2);
                                    }
                                }
                                break;
                            default:
                                e4 e4VarT2 = this.f13375b.f13422b.t();
                                if (e4VarT2 != null) {
                                    c4 c4Var2 = e4VarT2.K1;
                                    if (c4Var2.f13141a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(e4VarT2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i0.a.v(c4Var2.f13141a.f22617id, sb3);
                                    }
                                }
                                break;
                        }
                    }
                });
            }
        }
    }
}
