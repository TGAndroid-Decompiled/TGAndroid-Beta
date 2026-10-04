package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f17929a;
    public final BaseController f17930b;
    public final long f17931c;
    public final long d;
    public final int f17932e;
    public final int f17933f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17929a = i12;
        this.f17930b = baseController;
        this.f17931c = j3;
        this.d = j10;
        this.f17932e = i10;
        this.f17933f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17929a) {
            case 0:
                ((MediaDataController) this.f17930b).lambda$getMediaCountDatabase$139(this.f17931c, this.d, this.f17932e, this.f17933f);
                return;
            case 1:
                ((MediaDataController) this.f17930b).lambda$putMediaCountDatabase$138(this.f17931c, this.d, this.f17932e, this.f17933f);
                return;
            default:
                ((MessagesStorage) this.f17930b).lambda$updateRepliesMaxReadId$193(this.f17931c, this.d, this.f17932e, this.f17933f);
                return;
        }
    }
}
