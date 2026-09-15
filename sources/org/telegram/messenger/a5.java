package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15647a;
    public final ImageLoader.ArtworkLoadTask f15648b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15647a = i10;
        this.f15648b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15647a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15648b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15648b);
                return;
        }
    }
}
