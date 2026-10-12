package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17138a;
    public final ImageLoader.ArtworkLoadTask f17139b;

    public e5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17138a = i10;
        this.f17139b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17138a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17139b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17139b);
                return;
        }
    }
}
