package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f19346a;
    public final BaseController f19347b;
    public final long f19348c;
    public final long d;
    public final int f19349e;
    public final int f19350f;

    public m8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f19346a = i12;
        this.f19347b = baseController;
        this.f19348c = j10;
        this.d = j11;
        this.f19349e = i10;
        this.f19350f = i11;
    }

    @Override
    public final void run() {
        switch (this.f19346a) {
            case 0:
                ((MediaDataController) this.f19347b).lambda$getMediaCountDatabase$139(this.f19348c, this.d, this.f19349e, this.f19350f);
                return;
            case 1:
                ((MediaDataController) this.f19347b).lambda$putMediaCountDatabase$138(this.f19348c, this.d, this.f19349e, this.f19350f);
                return;
            default:
                ((MessagesStorage) this.f19347b).lambda$updateRepliesMaxReadId$193(this.f19348c, this.d, this.f19349e, this.f19350f);
                return;
        }
    }
}
