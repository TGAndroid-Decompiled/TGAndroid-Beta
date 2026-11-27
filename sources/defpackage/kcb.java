package defpackage;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class kcb extends VideoPlayerHolderBase {
    public boolean a;
    public final lcb b;

    public kcb(lcb lcbVar, SurfaceView surfaceView, dcb dcbVar) {
        this.b = lcbVar;
        if (lcbVar.a) {
            with(surfaceView);
        } else {
            with(dcbVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        lcb lcbVar = this.b;
        d30 d30Var = lcbVar.G0;
        if (d30Var != null) {
            d30Var.a = true;
            this.firstFrameRendered = true;
            d30Var.m();
            if (this.paused && lcbVar.D0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        if (i == 3 || i == 2) {
            if (this.firstFrameRendered && i == 2) {
                this.a = true;
                hl.c3(new Runnable(this) {
                    public final kcb b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        kcb kcbVar = this.b;
                        switch (b) {
                            case 0:
                                o68 w = kcbVar.b.w();
                                if (w != null) {
                                    n68 n68Var = w.y1;
                                    if (n68Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        c00.q(n68Var.a.id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                o68 w2 = kcbVar.b.w();
                                if (w2 != null) {
                                    n68 n68Var2 = w2.y1;
                                    if (n68Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        c00.q(n68Var2.a.id, sb2);
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
                hl.c3(new Runnable(this) {
                    public final kcb b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        kcb kcbVar = this.b;
                        switch (b) {
                            case 0:
                                o68 w = kcbVar.b.w();
                                if (w != null) {
                                    n68 n68Var = w.y1;
                                    if (n68Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        c00.q(n68Var.a.id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                o68 w2 = kcbVar.b.w();
                                if (w2 != null) {
                                    n68 n68Var2 = w2.y1;
                                    if (n68Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        c00.q(n68Var2.a.id, sb2);
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
