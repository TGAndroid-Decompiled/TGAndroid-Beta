package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f26027a;
    public final VideoPlayerHolderBase.AnonymousClass2 f26028b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f26027a = i7;
        this.f26028b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f26027a) {
            case 0:
                VideoPlayerHolderBase.AnonymousClass2.a(this.f26028b);
                return;
            default:
                VideoPlayerHolderBase.AnonymousClass2.b(this.f26028b);
                return;
        }
    }
}
