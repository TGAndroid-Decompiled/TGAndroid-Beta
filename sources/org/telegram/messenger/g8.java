package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f18435a;
    public final BaseController f18436b;
    public final long f18437c;
    public final long d;
    public final int e;
    public final int f18438f;

    public g8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18435a = i12;
        this.f18436b = baseController;
        this.f18437c = j10;
        this.d = j11;
        this.e = i10;
        this.f18438f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18435a) {
            case 0:
                ((MediaDataController) this.f18436b).lambda$getMediaCountDatabase$139(this.f18437c, this.d, this.e, this.f18438f);
                return;
            case 1:
                ((MediaDataController) this.f18436b).lambda$putMediaCountDatabase$138(this.f18437c, this.d, this.e, this.f18438f);
                return;
            default:
                ((MessagesStorage) this.f18436b).lambda$updateRepliesMaxReadId$193(this.f18437c, this.d, this.e, this.f18438f);
                return;
        }
    }
}
