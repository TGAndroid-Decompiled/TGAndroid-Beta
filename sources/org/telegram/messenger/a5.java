package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f17301a;
    public final ImageLoader.ArtworkLoadTask f17302b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17301a = i10;
        this.f17302b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17301a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17302b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17302b);
                return;
        }
    }
}
