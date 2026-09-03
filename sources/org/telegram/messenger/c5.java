package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f18327a;
    public final ImageLoader.ArtworkLoadTask f18328b;

    public c5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18327a = i10;
        this.f18328b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18327a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18328b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18328b);
                return;
        }
    }
}
