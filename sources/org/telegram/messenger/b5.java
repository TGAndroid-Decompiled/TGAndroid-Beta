package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f17432a;
    public final ImageLoader.ArtworkLoadTask f17433b;

    public b5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17432a = i10;
        this.f17433b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17432a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17433b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17433b);
                return;
        }
    }
}
