package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17480a;
    public final ImageLoader.ArtworkLoadTask f17481b;

    public e5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17480a = i10;
        this.f17481b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17480a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17481b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17481b);
                return;
        }
    }
}
