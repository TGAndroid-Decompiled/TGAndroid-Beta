package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f17925a;
    public final BaseController f17926b;
    public final long f17927c;
    public final long d;
    public final int f17928e;
    public final int f17929f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17925a = i12;
        this.f17926b = baseController;
        this.f17927c = j3;
        this.d = j10;
        this.f17928e = i10;
        this.f17929f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17925a) {
            case 0:
                ((MediaDataController) this.f17926b).lambda$getMediaCountDatabase$139(this.f17927c, this.d, this.f17928e, this.f17929f);
                return;
            case 1:
                ((MediaDataController) this.f17926b).lambda$putMediaCountDatabase$138(this.f17927c, this.d, this.f17928e, this.f17929f);
                return;
            default:
                ((MessagesStorage) this.f17926b).lambda$updateRepliesMaxReadId$193(this.f17927c, this.d, this.f17928e, this.f17929f);
                return;
        }
    }
}
