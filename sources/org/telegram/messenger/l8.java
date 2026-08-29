package org.telegram.messenger;
public final class l8 implements Runnable {
    public final int f20832a;
    public final BaseController f20833b;
    public final long f20834c;
    public final long d;
    public final int f20835e;
    public final int f20836f;

    public l8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f20832a = i12;
        this.f20833b = baseController;
        this.f20834c = j10;
        this.d = j11;
        this.f20835e = i10;
        this.f20836f = i11;
    }

    @Override
    public final void run() {
        switch (this.f20832a) {
            case 0:
                ((MediaDataController) this.f20833b).lambda$getMediaCountDatabase$139(this.f20834c, this.d, this.f20835e, this.f20836f);
                return;
            case 1:
                ((MediaDataController) this.f20833b).lambda$putMediaCountDatabase$138(this.f20834c, this.d, this.f20835e, this.f20836f);
                return;
            default:
                ((MessagesStorage) this.f20833b).lambda$updateRepliesMaxReadId$193(this.f20834c, this.d, this.f20835e, this.f20836f);
                return;
        }
    }
}
