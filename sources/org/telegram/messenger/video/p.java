package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f27040a;
    public final long f27041b;
    public final Object f27042c;

    public p(Object obj, long j3, int i7) {
        this.f27040a = i7;
        this.f27042c = obj;
        this.f27041b = j3;
    }

    @Override
    public final void run() {
        switch (this.f27040a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f27042c).lambda$onError$0(this.f27041b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f27042c).lambda$seekTo$11(this.f27041b);
                return;
        }
    }
}
