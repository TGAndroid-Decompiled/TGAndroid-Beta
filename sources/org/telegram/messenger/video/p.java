package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f21829a;
    public final VideoPlayerHolderBase.AnonymousClass2 f21830b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i9) {
        this.f21829a = i9;
        this.f21830b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f21829a) {
            case 0:
                VideoPlayerHolderBase.AnonymousClass2.a(this.f21830b);
                return;
            default:
                VideoPlayerHolderBase.AnonymousClass2.b(this.f21830b);
                return;
        }
    }
}
