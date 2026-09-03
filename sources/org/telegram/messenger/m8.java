package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f17806a;
    public final BaseController f17807b;
    public final long f17808c;
    public final long d;
    public final int e;
    public final int f17809f;

    public m8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f17806a = i12;
        this.f17807b = baseController;
        this.f17808c = j10;
        this.d = j11;
        this.e = i10;
        this.f17809f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17806a) {
            case 0:
                ((MediaDataController) this.f17807b).lambda$getMediaCountDatabase$139(this.f17808c, this.d, this.e, this.f17809f);
                return;
            case 1:
                ((MediaDataController) this.f17807b).lambda$putMediaCountDatabase$138(this.f17808c, this.d, this.e, this.f17809f);
                return;
            default:
                ((MessagesStorage) this.f17807b).lambda$updateRepliesMaxReadId$193(this.f17808c, this.d, this.e, this.f17809f);
                return;
        }
    }
}
