package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f17403a;
    public final ImageLoader.ArtworkLoadTask f17404b;

    public b5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17403a = i10;
        this.f17404b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17403a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17404b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17404b);
                return;
        }
    }
}
