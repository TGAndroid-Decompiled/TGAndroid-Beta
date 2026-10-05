package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f17930a;
    public final BaseController f17931b;
    public final long f17932c;
    public final long d;
    public final int f17933e;
    public final int f17934f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17930a = i12;
        this.f17931b = baseController;
        this.f17932c = j3;
        this.d = j10;
        this.f17933e = i10;
        this.f17934f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17930a) {
            case 0:
                ((MediaDataController) this.f17931b).lambda$getMediaCountDatabase$139(this.f17932c, this.d, this.f17933e, this.f17934f);
                return;
            case 1:
                ((MediaDataController) this.f17931b).lambda$putMediaCountDatabase$138(this.f17932c, this.d, this.f17933e, this.f17934f);
                return;
            default:
                ((MessagesStorage) this.f17931b).lambda$updateRepliesMaxReadId$193(this.f17932c, this.d, this.f17933e, this.f17934f);
                return;
        }
    }
}
