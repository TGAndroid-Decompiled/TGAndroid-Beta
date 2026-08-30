package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f17826a;
    public final BaseController f17827b;
    public final long f17828c;
    public final long d;
    public final int e;
    public final int f17829f;

    public m8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f17826a = i12;
        this.f17827b = baseController;
        this.f17828c = j10;
        this.d = j11;
        this.e = i10;
        this.f17829f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17826a) {
            case 0:
                ((MediaDataController) this.f17827b).lambda$getMediaCountDatabase$139(this.f17828c, this.d, this.e, this.f17829f);
                return;
            case 1:
                ((MediaDataController) this.f17827b).lambda$putMediaCountDatabase$138(this.f17828c, this.d, this.e, this.f17829f);
                return;
            default:
                ((MessagesStorage) this.f17827b).lambda$updateRepliesMaxReadId$193(this.f17828c, this.d, this.e, this.f17829f);
                return;
        }
    }
}
