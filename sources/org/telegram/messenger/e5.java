package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f18236a;
    public final ImageLoader.ArtworkLoadTask f18237b;

    public e5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18236a = i10;
        this.f18237b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18236a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18237b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18237b);
                return;
        }
    }
}
