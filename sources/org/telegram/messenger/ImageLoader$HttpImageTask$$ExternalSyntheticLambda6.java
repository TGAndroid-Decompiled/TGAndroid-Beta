package org.telegram.messenger;

public final class ImageLoader$HttpImageTask$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final ImageLoader.HttpImageTask f$0;
    public final long f$1;
    public final long f$2;

    public ImageLoader$HttpImageTask$$ExternalSyntheticLambda6(ImageLoader.HttpImageTask httpImageTask, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = httpImageTask;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$reportProgress$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$reportProgress$1(this.f$1, this.f$2);
                break;
        }
    }
}
