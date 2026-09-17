package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19337a;
    public final long f19338b;
    public final Object f19339c;

    public p(Object obj, long j3, int i10) {
        this.f19337a = i10;
        this.f19339c = obj;
        this.f19338b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19337a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19339c).lambda$onError$0(this.f19338b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19339c).lambda$seekTo$11(this.f19338b);
                return;
        }
    }
}
