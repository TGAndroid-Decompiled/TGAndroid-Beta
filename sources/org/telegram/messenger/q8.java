package org.telegram.messenger;
public final class q8 implements Runnable {
    public final int f16120a;
    public final BaseController f16121b;
    public final long f16122c;
    public final long d;
    public final int e;
    public final int f16123f;

    public q8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16120a = i12;
        this.f16121b = baseController;
        this.f16122c = j3;
        this.d = j10;
        this.e = i10;
        this.f16123f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16120a) {
            case 0:
                ((MediaDataController) this.f16121b).lambda$getMediaCountDatabase$139(this.f16122c, this.d, this.e, this.f16123f);
                return;
            case 1:
                ((MediaDataController) this.f16121b).lambda$putMediaCountDatabase$138(this.f16122c, this.d, this.e, this.f16123f);
                return;
            default:
                ((MessagesStorage) this.f16121b).lambda$updateRepliesMaxReadId$193(this.f16122c, this.d, this.e, this.f16123f);
                return;
        }
    }
}
