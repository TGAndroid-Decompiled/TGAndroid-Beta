package org.telegram.messenger;

public final class ImageLoader$HttpImageTask$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ImageLoader.HttpImageTask f$0;

    public ImageLoader$HttpImageTask$$ExternalSyntheticLambda1(ImageLoader.HttpImageTask httpImageTask, int i) {
        this.$r8$classId = i;
        this.f$0 = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCancelled$6();
                break;
            case 1:
                this.f$0.lambda$onCancelled$8();
                break;
            case 2:
                this.f$0.lambda$onPostExecute$5();
                break;
            default:
                this.f$0.lambda$onCancelled$7();
                break;
        }
    }
}
