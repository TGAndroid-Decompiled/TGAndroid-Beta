package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f17922a;
    public final BaseController f17923b;
    public final long f17924c;
    public final long d;
    public final int f17925e;
    public final int f17926f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17922a = i12;
        this.f17923b = baseController;
        this.f17924c = j3;
        this.d = j10;
        this.f17925e = i10;
        this.f17926f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17922a) {
            case 0:
                ((MediaDataController) this.f17923b).lambda$getMediaCountDatabase$139(this.f17924c, this.d, this.f17925e, this.f17926f);
                return;
            case 1:
                ((MediaDataController) this.f17923b).lambda$putMediaCountDatabase$138(this.f17924c, this.d, this.f17925e, this.f17926f);
                return;
            default:
                ((MessagesStorage) this.f17923b).lambda$updateRepliesMaxReadId$193(this.f17924c, this.d, this.f17925e, this.f17926f);
                return;
        }
    }
}
