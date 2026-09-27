package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15869a;
    public final ImageLoader.ArtworkLoadTask f15870b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15869a = i10;
        this.f15870b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15869a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15870b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15870b);
                return;
        }
    }
}
