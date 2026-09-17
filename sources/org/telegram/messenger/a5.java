package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15656a;
    public final ImageLoader.ArtworkLoadTask f15657b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15656a = i10;
        this.f15657b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15656a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15657b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15657b);
                return;
        }
    }
}
