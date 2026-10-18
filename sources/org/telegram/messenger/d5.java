package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f18161a;
    public final ImageLoader.ArtworkLoadTask f18162b;

    public d5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18161a = i10;
        this.f18162b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18161a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18162b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18162b);
                return;
        }
    }
}
