package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f25938a;
    public final VideoPlayerHolderBase.AnonymousClass2 f25939b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i3) {
        this.f25938a = i3;
        this.f25939b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f25938a) {
            case 0:
                VideoPlayerHolderBase.AnonymousClass2.a(this.f25939b);
                return;
            default:
                VideoPlayerHolderBase.AnonymousClass2.b(this.f25939b);
                return;
        }
    }
}
