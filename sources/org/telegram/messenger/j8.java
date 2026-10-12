package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f17946a;
    public final BaseController f17947b;
    public final long f17948c;
    public final long d;
    public final int f17949e;
    public final int f17950f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17946a = i12;
        this.f17947b = baseController;
        this.f17948c = j3;
        this.d = j10;
        this.f17949e = i10;
        this.f17950f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17946a) {
            case 0:
                ((MediaDataController) this.f17947b).lambda$getMediaCountDatabase$139(this.f17948c, this.d, this.f17949e, this.f17950f);
                return;
            case 1:
                ((MediaDataController) this.f17947b).lambda$putMediaCountDatabase$138(this.f17948c, this.d, this.f17949e, this.f17950f);
                return;
            default:
                ((MessagesStorage) this.f17947b).lambda$updateRepliesMaxReadId$193(this.f17948c, this.d, this.f17949e, this.f17950f);
                return;
        }
    }
}
