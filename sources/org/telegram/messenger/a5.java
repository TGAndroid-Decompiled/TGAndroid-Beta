package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f15643a;
    public final ImageLoader.ArtworkLoadTask f15644b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15643a = i10;
        this.f15644b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15643a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f15644b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f15644b);
                return;
        }
    }
}
