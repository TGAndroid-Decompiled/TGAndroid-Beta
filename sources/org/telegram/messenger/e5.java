package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f18239a;
    public final ImageLoader.ArtworkLoadTask f18240b;

    public e5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18239a = i10;
        this.f18240b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18239a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18240b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18240b);
                return;
        }
    }
}
