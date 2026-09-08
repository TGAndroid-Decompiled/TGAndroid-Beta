package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f17153a;
    public final ImageLoader.ArtworkLoadTask f17154b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17153a = i10;
        this.f17154b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17153a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17154b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17154b);
                return;
        }
    }
}
