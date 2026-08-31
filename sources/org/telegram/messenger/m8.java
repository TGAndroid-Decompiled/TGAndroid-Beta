package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f19344a;
    public final BaseController f19345b;
    public final long f19346c;
    public final long d;
    public final int f19347e;
    public final int f19348f;

    public m8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f19344a = i12;
        this.f19345b = baseController;
        this.f19346c = j10;
        this.d = j11;
        this.f19347e = i10;
        this.f19348f = i11;
    }

    @Override
    public final void run() {
        switch (this.f19344a) {
            case 0:
                ((MediaDataController) this.f19345b).lambda$getMediaCountDatabase$139(this.f19346c, this.d, this.f19347e, this.f19348f);
                return;
            case 1:
                ((MediaDataController) this.f19345b).lambda$putMediaCountDatabase$138(this.f19346c, this.d, this.f19347e, this.f19348f);
                return;
            default:
                ((MessagesStorage) this.f19345b).lambda$updateRepliesMaxReadId$193(this.f19346c, this.d, this.f19347e, this.f19348f);
                return;
        }
    }
}
