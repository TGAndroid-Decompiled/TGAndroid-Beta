package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f20666a;
    public final BaseController f20667b;
    public final long f20668c;
    public final long d;
    public final int e;
    public final int f20669f;

    public m8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f20666a = i12;
        this.f20667b = baseController;
        this.f20668c = j10;
        this.d = j11;
        this.e = i10;
        this.f20669f = i11;
    }

    @Override
    public final void run() {
        switch (this.f20666a) {
            case 0:
                ((MediaDataController) this.f20667b).lambda$getMediaCountDatabase$139(this.f20668c, this.d, this.e, this.f20669f);
                return;
            case 1:
                ((MediaDataController) this.f20667b).lambda$putMediaCountDatabase$138(this.f20668c, this.d, this.e, this.f20669f);
                return;
            default:
                ((MessagesStorage) this.f20667b).lambda$updateRepliesMaxReadId$196(this.f20668c, this.d, this.e, this.f20669f);
                return;
        }
    }
}
