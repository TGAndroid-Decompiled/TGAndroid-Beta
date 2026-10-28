package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f20307a;
    public final ImageLoader.ArtworkLoadTask f20308b;

    public i5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f20307a = i10;
        this.f20308b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f20307a) {
            case 0:
                this.f20308b.lambda$onCancelled$2();
                return;
            default:
                this.f20308b.lambda$onPostExecute$1();
                return;
        }
    }
}
