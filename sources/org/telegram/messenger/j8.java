package org.telegram.messenger;

public final class j8 implements Runnable {

    public final int f20652a;

    public final BaseController f20653b;

    public final long f20654c;
    public final long d;

    public final int f20655e;

    public final int f20656f;

    public j8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f20652a = i12;
        this.f20653b = baseController;
        this.f20654c = j10;
        this.d = j11;
        this.f20655e = i10;
        this.f20656f = i11;
    }

    @Override
    public final void run() {
        switch (this.f20652a) {
            case 0:
                ((MediaDataController) this.f20653b).lambda$getMediaCountDatabase$139(this.f20654c, this.d, this.f20655e, this.f20656f);
                break;
            case 1:
                ((MediaDataController) this.f20653b).lambda$putMediaCountDatabase$138(this.f20654c, this.d, this.f20655e, this.f20656f);
                break;
            default:
                ((MessagesStorage) this.f20653b).lambda$updateRepliesMaxReadId$193(this.f20654c, this.d, this.f20655e, this.f20656f);
                break;
        }
    }
}
