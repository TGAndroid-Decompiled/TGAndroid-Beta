package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f20227a;
    public final ImageLoader.ArtworkLoadTask f20228b;

    public h5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f20227a = i10;
        this.f20228b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f20227a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f20228b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f20228b);
                return;
        }
    }
}
