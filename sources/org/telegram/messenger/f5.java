package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f18337a;
    public final ImageLoader.ArtworkLoadTask f18338b;

    public f5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18337a = i10;
        this.f18338b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18337a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18338b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18338b);
                return;
        }
    }
}
