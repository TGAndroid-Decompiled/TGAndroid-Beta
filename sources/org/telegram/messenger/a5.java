package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15860a;
    public final ImageLoader.ArtworkLoadTask f15861b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15860a = i10;
        this.f15861b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15860a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15861b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15861b);
                return;
        }
    }
}
