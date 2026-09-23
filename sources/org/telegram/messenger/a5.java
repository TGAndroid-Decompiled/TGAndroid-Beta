package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15620a;
    public final ImageLoader.ArtworkLoadTask f15621b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15620a = i10;
        this.f15621b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15620a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15621b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15621b);
                return;
        }
    }
}
