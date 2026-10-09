package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f17399a;
    public final ImageLoader.ArtworkLoadTask f17400b;

    public b5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17399a = i10;
        this.f17400b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17399a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17400b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17400b);
                return;
        }
    }
}
