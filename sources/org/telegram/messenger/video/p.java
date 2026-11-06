package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f26029a;
    public final long f26030b;
    public final Object f26031c;

    public p(Object obj, long j3, int i7) {
        this.f26029a = i7;
        this.f26031c = obj;
        this.f26030b = j3;
    }

    @Override
    public final void run() {
        switch (this.f26029a) {
            case 0:
                VideoPlayerHolderBase.AnonymousClass2.c((VideoPlayerHolderBase.AnonymousClass2) this.f26031c, this.f26030b);
                return;
            default:
                VideoPlayerHolderBase.j((VideoPlayerHolderBase) this.f26031c, this.f26030b);
                return;
        }
    }
}
