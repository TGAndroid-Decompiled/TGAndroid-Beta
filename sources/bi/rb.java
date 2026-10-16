package bi;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class rb extends VideoPlayerHolderBase {
    public boolean f3625a;
    public final sb f3626b;

    public rb(sb sbVar, SurfaceView surfaceView, kb kbVar) {
        this.f3626b = sbVar;
        if (sbVar.f3664a) {
            with(surfaceView);
        } else {
            with(kbVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f3626b.f3691m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        sb sbVar = this.f3626b;
        p5 p5Var = sbVar.G0;
        if (p5Var != null) {
            p5Var.f3468a = true;
            this.firstFrameRendered = true;
            p5Var.b();
            if (this.paused && sbVar.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f3625a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final rb f3605b;

                    {
                        this.f3605b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                q5 t10 = this.f3605b.f3626b.t();
                                if (t10 != null) {
                                    o5 o5Var = t10.O1;
                                    if (o5Var.f3417a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(o5Var.f3417a.f19151id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                q5 t11 = this.f3605b.f3626b.t();
                                if (t11 != null) {
                                    o5 o5Var2 = t11.O1;
                                    if (o5Var2.f3417a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(o5Var2.f3417a.f19151id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f3625a && i10 == 3) {
                this.f3625a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final rb f3605b;

                    {
                        this.f3605b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                q5 t10 = this.f3605b.f3626b.t();
                                if (t10 != null) {
                                    o5 o5Var = t10.O1;
                                    if (o5Var.f3417a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.g0.o(o5Var.f3417a.f19151id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                q5 t11 = this.f3605b.f3626b.t();
                                if (t11 != null) {
                                    o5 o5Var2 = t11.O1;
                                    if (o5Var2.f3417a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.g0.o(o5Var2.f3417a.f19151id, sb3);
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
