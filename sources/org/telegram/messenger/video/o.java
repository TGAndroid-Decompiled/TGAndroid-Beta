package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f21575a;
    public final long f21576b;
    public final Object f21577c;

    public o(Object obj, long j10, int i10) {
        this.f21575a = i10;
        this.f21577c = obj;
        this.f21576b = j10;
    }

    @Override
    public final void run() {
        switch (this.f21575a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f21577c).lambda$onError$0(this.f21576b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f21577c).lambda$seekTo$11(this.f21576b);
                return;
        }
    }
}
