package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16709a;
    public final BaseController f16710b;
    public final long f16711c;
    public final long d;
    public final int e;
    public final int f16712f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16709a = i12;
        this.f16710b = baseController;
        this.f16711c = j3;
        this.d = j10;
        this.e = i10;
        this.f16712f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16709a) {
            case 0:
                ((MediaDataController) this.f16710b).lambda$getMediaCountDatabase$139(this.f16711c, this.d, this.e, this.f16712f);
                return;
            case 1:
                ((MediaDataController) this.f16710b).lambda$putMediaCountDatabase$138(this.f16711c, this.d, this.e, this.f16712f);
                return;
            default:
                ((MessagesStorage) this.f16710b).lambda$updateRepliesMaxReadId$193(this.f16711c, this.d, this.e, this.f16712f);
                return;
        }
    }
}
