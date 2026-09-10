package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f15141a;
    public final ImageLoader.ArtworkLoadTask f15142b;

    public f5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f15141a = i10;
        this.f15142b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f15141a) {
            case 0:
                this.f15142b.lambda$onCancelled$2();
                return;
            default:
                this.f15142b.lambda$onPostExecute$1();
                return;
        }
    }
}
