package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19810a;
    public final long f19811b;
    public final Object f19812c;

    public o(Object obj, long j10, int i10) {
        this.f19810a = i10;
        this.f19812c = obj;
        this.f19811b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19810a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19812c).lambda$onError$0(this.f19811b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19812c).lambda$seekTo$11(this.f19811b);
                return;
        }
    }
}
