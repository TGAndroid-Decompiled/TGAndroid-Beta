package org.telegram.messenger;

public final class b5 implements Runnable {

    public final int f19764a;

    public final ImageLoader.ArtworkLoadTask f19765b;

    public b5(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f19764a = i10;
        this.f19765b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f19764a) {
            case 0:
                this.f19765b.lambda$onCancelled$2();
                break;
            default:
                this.f19765b.lambda$onPostExecute$1();
                break;
        }
    }
}
