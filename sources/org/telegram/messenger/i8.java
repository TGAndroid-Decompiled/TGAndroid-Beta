package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f18602a;
    public final BaseController f18603b;
    public final long f18604c;
    public final long d;
    public final int e;
    public final int f18605f;

    public i8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18602a = i12;
        this.f18603b = baseController;
        this.f18604c = j10;
        this.d = j11;
        this.e = i10;
        this.f18605f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18602a) {
            case 0:
                ((MediaDataController) this.f18603b).lambda$getMediaCountDatabase$139(this.f18604c, this.d, this.e, this.f18605f);
                return;
            case 1:
                ((MediaDataController) this.f18603b).lambda$putMediaCountDatabase$138(this.f18604c, this.d, this.e, this.f18605f);
                return;
            default:
                ((MessagesStorage) this.f18603b).lambda$updateRepliesMaxReadId$193(this.f18604c, this.d, this.e, this.f18605f);
                return;
        }
    }
}
