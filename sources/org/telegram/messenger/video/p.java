package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17601a;
    public final long f17602b;
    public final Object f17603c;

    public p(Object obj, long j3, int i10) {
        this.f17601a = i10;
        this.f17603c = obj;
        this.f17602b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17601a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17603c).lambda$onError$0(this.f17602b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17603c).lambda$seekTo$11(this.f17602b);
                return;
        }
    }
}
