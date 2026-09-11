package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19310a;
    public final long f19311b;
    public final Object f19312c;

    public p(Object obj, long j3, int i10) {
        this.f19310a = i10;
        this.f19312c = obj;
        this.f19311b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19310a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19312c).lambda$onError$0(this.f19311b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19312c).lambda$seekTo$11(this.f19311b);
                return;
        }
    }
}
