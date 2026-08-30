package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f16906a;
    public final ImageLoader.ArtworkLoadTask f16907b;

    public c5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f16906a = i10;
        this.f16907b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f16906a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f16907b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f16907b);
                return;
        }
    }
}
