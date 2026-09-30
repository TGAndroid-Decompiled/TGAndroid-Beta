package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f16447a;
    public final BaseController f16448b;
    public final long f16449c;
    public final long d;
    public final int e;
    public final int f16450f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16447a = i12;
        this.f16448b = baseController;
        this.f16449c = j3;
        this.d = j10;
        this.e = i10;
        this.f16450f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16447a) {
            case 0:
                ((MediaDataController) this.f16448b).lambda$getMediaCountDatabase$139(this.f16449c, this.d, this.e, this.f16450f);
                return;
            case 1:
                ((MediaDataController) this.f16448b).lambda$putMediaCountDatabase$138(this.f16449c, this.d, this.e, this.f16450f);
                return;
            default:
                ((MessagesStorage) this.f16448b).lambda$updateRepliesMaxReadId$193(this.f16449c, this.d, this.e, this.f16450f);
                return;
        }
    }
}
