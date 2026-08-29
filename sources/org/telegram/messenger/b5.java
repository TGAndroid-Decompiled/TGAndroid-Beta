package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f19773a;
    public final ImageLoader.ArtworkLoadTask f19774b;

    public b5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f19773a = i10;
        this.f19774b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f19773a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f19774b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f19774b);
                return;
        }
    }
}
