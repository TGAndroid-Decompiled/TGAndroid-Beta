package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19820a;
    public final long f19821b;
    public final Object f19822c;

    public o(Object obj, long j10, int i10) {
        this.f19820a = i10;
        this.f19822c = obj;
        this.f19821b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19820a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19822c).lambda$onError$0(this.f19821b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19822c).lambda$seekTo$11(this.f19821b);
                return;
        }
    }
}
