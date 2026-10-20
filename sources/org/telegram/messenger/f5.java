package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f18331a;
    public final ImageLoader.ArtworkLoadTask f18332b;

    public f5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18331a = i10;
        this.f18332b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18331a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18332b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18332b);
                return;
        }
    }
}
