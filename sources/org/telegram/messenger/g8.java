package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f17918a;
    public final BaseController f17919b;
    public final long f17920c;
    public final long d;
    public final int f17921e;
    public final int f17922f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17918a = i12;
        this.f17919b = baseController;
        this.f17920c = j3;
        this.d = j10;
        this.f17921e = i10;
        this.f17922f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17918a) {
            case 0:
                ((MediaDataController) this.f17919b).lambda$getMediaCountDatabase$139(this.f17920c, this.d, this.f17921e, this.f17922f);
                return;
            case 1:
                ((MediaDataController) this.f17919b).lambda$putMediaCountDatabase$138(this.f17920c, this.d, this.f17921e, this.f17922f);
                return;
            default:
                ((MessagesStorage) this.f17919b).lambda$updateRepliesMaxReadId$193(this.f17920c, this.d, this.f17921e, this.f17922f);
                return;
        }
    }
}
