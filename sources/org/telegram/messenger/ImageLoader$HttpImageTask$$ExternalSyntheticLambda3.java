package org.telegram.messenger;

public final class ImageLoader$HttpImageTask$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ImageLoader.HttpImageTask f$0;
    public final Boolean f$1;

    public ImageLoader$HttpImageTask$$ExternalSyntheticLambda3(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i) {
        this.$r8$classId = i;
        this.f$0 = httpImageTask;
        this.f$1 = bool;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onPostExecute$3(this.f$1);
                break;
            default:
                this.f$0.lambda$onPostExecute$4(this.f$1);
                break;
        }
    }
}
