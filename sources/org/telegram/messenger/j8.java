package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f17947a;
    public final BaseController f17948b;
    public final long f17949c;
    public final long d;
    public final int f17950e;
    public final int f17951f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17947a = i12;
        this.f17948b = baseController;
        this.f17949c = j3;
        this.d = j10;
        this.f17950e = i10;
        this.f17951f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17947a) {
            case 0:
                ((MediaDataController) this.f17948b).lambda$getMediaCountDatabase$139(this.f17949c, this.d, this.f17950e, this.f17951f);
                return;
            case 1:
                ((MediaDataController) this.f17948b).lambda$putMediaCountDatabase$138(this.f17949c, this.d, this.f17950e, this.f17951f);
                return;
            default:
                ((MessagesStorage) this.f17948b).lambda$updateRepliesMaxReadId$193(this.f17949c, this.d, this.f17950e, this.f17951f);
                return;
        }
    }
}
