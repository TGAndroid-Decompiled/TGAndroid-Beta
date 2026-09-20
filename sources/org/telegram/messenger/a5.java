package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15864a;
    public final ImageLoader.ArtworkLoadTask f15865b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15864a = i10;
        this.f15865b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15864a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15865b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15865b);
                return;
        }
    }
}
