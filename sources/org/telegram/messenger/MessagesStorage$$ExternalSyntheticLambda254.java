package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda254 implements Runnable {
    public final int $r8$classId;
    public final BaseController f$0;
    public final long f$1;
    public final long f$2;
    public final int f$3;
    public final int f$4;

    public MessagesStorage$$ExternalSyntheticLambda254(BaseController baseController, long j, long j2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = baseController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$updateRepliesMaxReadId$193(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$getMediaCountDatabase$139(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                ((MediaDataController) this.f$0).lambda$putMediaCountDatabase$138(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
