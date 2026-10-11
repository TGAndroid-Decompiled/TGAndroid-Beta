package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f17396a;
    public final ImageLoader.ArtworkLoadTask f17397b;

    public b5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17396a = i10;
        this.f17397b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17396a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17397b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17397b);
                return;
        }
    }
}
