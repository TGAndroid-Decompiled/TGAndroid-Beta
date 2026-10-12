package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17481a;
    public final ImageLoader.ArtworkLoadTask f17482b;

    public e5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17481a = i10;
        this.f17482b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17481a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17482b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17482b);
                return;
        }
    }
}
