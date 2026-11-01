package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f18739a;
    public final VideoPlayerHolderBase.AnonymousClass2 f18740b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f18739a = i10;
        this.f18740b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18739a) {
            case 0:
                VideoPlayerHolderBase.AnonymousClass2.a(this.f18740b);
                return;
            default:
                VideoPlayerHolderBase.AnonymousClass2.b(this.f18740b);
                return;
        }
    }
}
