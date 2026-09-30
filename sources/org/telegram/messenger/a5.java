package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15876a;
    public final ImageLoader.ArtworkLoadTask f15877b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15876a = i10;
        this.f15877b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15876a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15877b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15877b);
                return;
        }
    }
}
