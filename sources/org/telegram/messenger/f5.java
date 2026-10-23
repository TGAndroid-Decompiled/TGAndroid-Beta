package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f18400a;
    public final ImageLoader.ArtworkLoadTask f18401b;

    public f5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18400a = i10;
        this.f18401b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18400a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18401b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18401b);
                return;
        }
    }
}
