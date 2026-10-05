package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f17311a;
    public final ImageLoader.ArtworkLoadTask f17312b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17311a = i10;
        this.f17312b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17311a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17312b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17312b);
                return;
        }
    }
}
