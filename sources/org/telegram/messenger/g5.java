package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f18406a;
    public final ImageLoader.ArtworkLoadTask f18407b;

    public g5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f18406a = i10;
        this.f18407b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f18406a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f18407b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f18407b);
                return;
        }
    }
}
