package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f18328a;
    public final ImageLoader.ArtworkLoadTask f18329b;

    public f5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18328a = i10;
        this.f18329b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18328a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18329b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18329b);
                return;
        }
    }
}
