package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f26040a;
    public final long f26041b;
    public final Object f26042c;

    public p(Object obj, long j3, int i7) {
        this.f26040a = i7;
        this.f26042c = obj;
        this.f26041b = j3;
    }

    @Override
    public final void run() {
        switch (this.f26040a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f26042c).lambda$onError$0(this.f26041b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f26042c).lambda$seekTo$11(this.f26041b);
                return;
        }
    }
}
