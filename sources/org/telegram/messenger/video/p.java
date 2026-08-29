package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f21895a;
    public final long f21896b;
    public final Object f21897c;

    public p(Object obj, long j10, int i10) {
        this.f21895a = i10;
        this.f21897c = obj;
        this.f21896b = j10;
    }

    @Override
    public final void run() {
        switch (this.f21895a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f21897c).lambda$onError$0(this.f21896b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f21897c).lambda$seekTo$11(this.f21896b);
                return;
        }
    }
}
