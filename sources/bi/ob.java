package bi;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class ob extends VideoPlayerHolderBase {
    public boolean f3491a;
    public final pb f3492b;

    public ob(pb pbVar, SurfaceView surfaceView, hb hbVar) {
        this.f3492b = pbVar;
        if (pbVar.f3531a) {
            with(surfaceView);
        } else {
            with(hbVar);
        }
    }

    @Override
    public final boolean needRepeat() {
        return this.f3492b.f3559m1;
    }

    @Override
    public final void onRenderedFirstFrame() {
        pb pbVar = this.f3492b;
        n5 n5Var = pbVar.G0;
        if (n5Var != null) {
            n5Var.f3364a = true;
            this.firstFrameRendered = true;
            n5Var.b();
            if (this.paused && pbVar.C0 != null) {
                prepareStub();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.f3491a = true;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ob f3391b;

                    {
                        this.f3391b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                o5 t10 = this.f3391b.f3492b.t();
                                if (t10 != null) {
                                    m5 m5Var = t10.O1;
                                    if (m5Var.f3310a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i2.g.o(m5Var.f3310a.f20107id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                o5 t11 = this.f3391b.f3492b.t();
                                if (t11 != null) {
                                    m5 m5Var2 = t11.O1;
                                    if (m5Var2.f3310a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i2.g.o(m5Var2.f3310a.f20107id, sb3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (this.f3491a && i10 == 3) {
                this.f3491a = false;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final ob f3391b;

                    {
                        this.f3391b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                o5 t10 = this.f3391b.f3492b.t();
                                if (t10 != null) {
                                    m5 m5Var = t10.O1;
                                    if (m5Var.f3310a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i2.g.o(m5Var.f3310a.f20107id, sb2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                o5 t11 = this.f3391b.f3492b.t();
                                if (t11 != null) {
                                    m5 m5Var2 = t11.O1;
                                    if (m5Var2.f3310a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i2.g.o(m5Var2.f3310a.f20107id, sb3);
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
