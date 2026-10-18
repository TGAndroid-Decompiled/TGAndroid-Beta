package org.telegram.messenger;
public final class h8 implements Runnable {
    public final int f18509a;
    public final BaseController f18510b;
    public final long f18511c;
    public final long d;
    public final int e;
    public final int f18512f;

    public h8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18509a = i12;
        this.f18510b = baseController;
        this.f18511c = j10;
        this.d = j11;
        this.e = i10;
        this.f18512f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18509a) {
            case 0:
                ((MediaDataController) this.f18510b).lambda$getMediaCountDatabase$139(this.f18511c, this.d, this.e, this.f18512f);
                return;
            case 1:
                ((MediaDataController) this.f18510b).lambda$putMediaCountDatabase$138(this.f18511c, this.d, this.e, this.f18512f);
                return;
            default:
                ((MessagesStorage) this.f18510b).lambda$updateRepliesMaxReadId$193(this.f18511c, this.d, this.e, this.f18512f);
                return;
        }
    }
}
