package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f16891a;
    public final ImageLoader.ArtworkLoadTask f16892b;

    public c5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f16891a = i10;
        this.f16892b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f16891a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f16892b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f16892b);
                return;
        }
    }
}
