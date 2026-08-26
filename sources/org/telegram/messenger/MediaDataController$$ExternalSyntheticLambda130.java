package org.telegram.messenger;

public final class MediaDataController$$ExternalSyntheticLambda130 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final long f$1;
    public final long f$2;
    public final int[] f$3;

    public MediaDataController$$ExternalSyntheticLambda130(MediaDataController mediaDataController, long j, long j2, int[] iArr, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = iArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getMediaCounts$128(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$getMediaCounts$127(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$getMediaCounts$130(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
