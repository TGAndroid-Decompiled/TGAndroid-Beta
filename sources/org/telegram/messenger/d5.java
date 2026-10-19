package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f18158a;
    public final ImageLoader.ArtworkLoadTask f18159b;

    public d5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18158a = i10;
        this.f18159b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18158a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18159b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18159b);
                return;
        }
    }
}
