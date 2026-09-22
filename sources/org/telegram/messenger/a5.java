package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15879a;
    public final ImageLoader.ArtworkLoadTask f15880b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15879a = i10;
        this.f15880b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15879a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15880b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15880b);
                return;
        }
    }
}
