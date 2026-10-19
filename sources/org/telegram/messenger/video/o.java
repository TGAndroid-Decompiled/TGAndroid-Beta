package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19808a;
    public final long f19809b;
    public final Object f19810c;

    public o(Object obj, long j10, int i10) {
        this.f19808a = i10;
        this.f19810c = obj;
        this.f19809b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19808a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19810c).lambda$onError$0(this.f19809b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19810c).lambda$seekTo$11(this.f19809b);
                return;
        }
    }
}
