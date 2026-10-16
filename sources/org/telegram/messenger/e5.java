package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f16835a;
    public final ImageLoader.ArtworkLoadTask f16836b;

    public e5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f16835a = i10;
        this.f16836b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f16835a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f16836b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f16836b);
                return;
        }
    }
}
