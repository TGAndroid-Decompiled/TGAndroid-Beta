package org.telegram.messenger;

public final class ImageLoader$ArtworkLoadTask$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ImageLoader.ArtworkLoadTask f$0;

    public ImageLoader$ArtworkLoadTask$$ExternalSyntheticLambda0(ImageLoader.ArtworkLoadTask artworkLoadTask, int i) {
        this.$r8$classId = i;
        this.f$0 = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCancelled$2();
                break;
            default:
                this.f$0.lambda$onPostExecute$1();
                break;
        }
    }
}
