package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f16661a;
    public final long f16662b;
    public final Object f16663c;

    public p(Object obj, long j3, int i10) {
        this.f16661a = i10;
        this.f16663c = obj;
        this.f16662b = j3;
    }

    @Override
    public final void run() {
        switch (this.f16661a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f16663c).lambda$onError$0(this.f16662b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f16663c).lambda$seekTo$11(this.f16662b);
                return;
        }
    }
}
