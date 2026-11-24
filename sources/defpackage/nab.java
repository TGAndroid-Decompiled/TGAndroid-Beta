package defpackage;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class nab extends VideoPlayerHolderBase {
    public boolean a;
    public final oab b;

    public nab(oab oabVar, SurfaceView surfaceView, gab gabVar) {
        this.b = oabVar;
        if (oabVar.a) {
            with(surfaceView);
        } else {
            with(gabVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        oab oabVar = this.b;
        c40 c40Var = oabVar.G0;
        if (c40Var != null) {
            c40Var.a = true;
            this.firstFrameRendered = true;
            c40Var.m();
            if (this.paused && oabVar.D0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        if (i == 3 || i == 2) {
            if (this.firstFrameRendered && i == 2) {
                this.a = true;
                gm.c3(new Runnable(this) {
                    public final nab b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        nab nabVar = this.b;
                        switch (b) {
                            case 0:
                                a58 w = nabVar.b.w();
                                if (w != null) {
                                    z48 z48Var = w.E1;
                                    if (z48Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        b10.p(z48Var.a.id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                a58 w2 = nabVar.b.w();
                                if (w2 != null) {
                                    z48 z48Var2 = w2.E1;
                                    if (z48Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        b10.p(z48Var2.a.id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.a && i == 3) {
                this.a = false;
                gm.c3(new Runnable(this) {
                    public final nab b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        nab nabVar = this.b;
                        switch (b) {
                            case 0:
                                a58 w = nabVar.b.w();
                                if (w != null) {
                                    z48 z48Var = w.E1;
                                    if (z48Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        b10.p(z48Var.a.id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                a58 w2 = nabVar.b.w();
                                if (w2 != null) {
                                    z48 z48Var2 = w2.E1;
                                    if (z48Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        b10.p(z48Var2.a.id, sb2);
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
