package defpackage;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class l8b extends VideoPlayerHolderBase {
    public boolean a;
    public final m8b b;

    public l8b(m8b m8bVar, SurfaceView surfaceView, e8b e8bVar) {
        this.b = m8bVar;
        if (m8bVar.a) {
            with(surfaceView);
        } else {
            with(e8bVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        m8b m8bVar = this.b;
        c30 c30Var = m8bVar.G0;
        if (c30Var != null) {
            c30Var.a = true;
            this.firstFrameRendered = true;
            c30Var.m();
            if (this.paused && m8bVar.D0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        if (i == 3 || i == 2) {
            if (this.firstFrameRendered && i == 2) {
                this.a = true;
                gl.d3(new Runnable(this) {
                    public final l8b b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        l8b l8bVar = this.b;
                        switch (b) {
                            case 0:
                                y28 w = l8bVar.b.w();
                                if (w != null) {
                                    x28 x28Var = w.E1;
                                    if (x28Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        b00.p(x28Var.a.id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                y28 w2 = l8bVar.b.w();
                                if (w2 != null) {
                                    x28 x28Var2 = w2.E1;
                                    if (x28Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        b00.p(x28Var2.a.id, sb2);
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
                gl.d3(new Runnable(this) {
                    public final l8b b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        l8b l8bVar = this.b;
                        switch (b) {
                            case 0:
                                y28 w = l8bVar.b.w();
                                if (w != null) {
                                    x28 x28Var = w.E1;
                                    if (x28Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        b00.p(x28Var.a.id, sb);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                y28 w2 = l8bVar.b.w();
                                if (w2 != null) {
                                    x28 x28Var2 = w2.E1;
                                    if (x28Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        b00.p(x28Var2.a.id, sb2);
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
