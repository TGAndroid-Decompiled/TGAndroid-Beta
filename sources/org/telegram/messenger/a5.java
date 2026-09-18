package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15832a;
    public final ImageLoader.ArtworkLoadTask f15833b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15832a = i10;
        this.f15833b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15832a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15833b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15833b);
                return;
        }
    }
}
