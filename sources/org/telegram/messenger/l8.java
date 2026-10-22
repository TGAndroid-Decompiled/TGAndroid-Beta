package org.telegram.messenger;
public final class l8 implements Runnable {
    public final int f18854a;
    public final BaseController f18855b;
    public final long f18856c;
    public final long d;
    public final int e;
    public final int f18857f;

    public l8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18854a = i12;
        this.f18855b = baseController;
        this.f18856c = j10;
        this.d = j11;
        this.e = i10;
        this.f18857f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18854a) {
            case 0:
                ((MediaDataController) this.f18855b).lambda$getMediaCountDatabase$139(this.f18856c, this.d, this.e, this.f18857f);
                return;
            case 1:
                ((MediaDataController) this.f18855b).lambda$putMediaCountDatabase$138(this.f18856c, this.d, this.e, this.f18857f);
                return;
            default:
                ((MessagesStorage) this.f18855b).lambda$updateRepliesMaxReadId$193(this.f18856c, this.d, this.e, this.f18857f);
                return;
        }
    }
}
