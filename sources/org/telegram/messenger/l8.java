package org.telegram.messenger;
public final class l8 implements Runnable {
    public final int f18922a;
    public final BaseController f18923b;
    public final long f18924c;
    public final long d;
    public final int e;
    public final int f18925f;

    public l8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18922a = i12;
        this.f18923b = baseController;
        this.f18924c = j10;
        this.d = j11;
        this.e = i10;
        this.f18925f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18922a) {
            case 0:
                ((MediaDataController) this.f18923b).lambda$getMediaCountDatabase$139(this.f18924c, this.d, this.e, this.f18925f);
                return;
            case 1:
                ((MediaDataController) this.f18923b).lambda$putMediaCountDatabase$138(this.f18924c, this.d, this.e, this.f18925f);
                return;
            default:
                ((MessagesStorage) this.f18923b).lambda$updateRepliesMaxReadId$193(this.f18924c, this.d, this.e, this.f18925f);
                return;
        }
    }
}
