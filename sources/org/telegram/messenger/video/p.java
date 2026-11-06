package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f26037a;
    public final long f26038b;
    public final Object f26039c;

    public p(Object obj, long j3, int i7) {
        this.f26037a = i7;
        this.f26039c = obj;
        this.f26038b = j3;
    }

    @Override
    public final void run() {
        switch (this.f26037a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f26039c).lambda$onError$0(this.f26038b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f26039c).lambda$seekTo$11(this.f26038b);
                return;
        }
    }
}
