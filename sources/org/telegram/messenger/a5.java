package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f17126a;
    public final ImageLoader.ArtworkLoadTask f17127b;

    public a5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f17126a = i10;
        this.f17127b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f17126a) {
            case 0:
                ImageLoader.ArtworkLoadTask.a(this.f17127b);
                return;
            default:
                ImageLoader.ArtworkLoadTask.c(this.f17127b);
                return;
        }
    }
}
