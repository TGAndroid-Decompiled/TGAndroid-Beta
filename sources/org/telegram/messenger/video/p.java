package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19301a;
    public final long f19302b;
    public final Object f19303c;

    public p(Object obj, long j3, int i10) {
        this.f19301a = i10;
        this.f19303c = obj;
        this.f19302b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19301a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19303c).lambda$onError$0(this.f19302b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19303c).lambda$seekTo$11(this.f19302b);
                return;
        }
    }
}
