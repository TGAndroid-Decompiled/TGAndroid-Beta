package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17598a;
    public final long f17599b;
    public final Object f17600c;

    public p(Object obj, long j3, int i10) {
        this.f17598a = i10;
        this.f17600c = obj;
        this.f17599b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17598a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17600c).lambda$onError$0(this.f17599b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17600c).lambda$seekTo$11(this.f17599b);
                return;
        }
    }
}
