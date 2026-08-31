package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f18325a;
    public final ImageLoader.ArtworkLoadTask f18326b;

    public c5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18325a = i10;
        this.f18326b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18325a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18326b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18326b);
                return;
        }
    }
}
