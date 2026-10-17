package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f18151a;
    public final ImageLoader.ArtworkLoadTask f18152b;

    public d5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18151a = i10;
        this.f18152b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18151a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18152b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18152b);
                return;
        }
    }
}
