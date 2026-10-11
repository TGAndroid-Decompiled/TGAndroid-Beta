package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f17957a;
    public final BaseController f17958b;
    public final long f17959c;
    public final long d;
    public final int f17960e;
    public final int f17961f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17957a = i12;
        this.f17958b = baseController;
        this.f17959c = j3;
        this.d = j10;
        this.f17960e = i10;
        this.f17961f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17957a) {
            case 0:
                ((MediaDataController) this.f17958b).lambda$getMediaCountDatabase$139(this.f17959c, this.d, this.f17960e, this.f17961f);
                return;
            case 1:
                ((MediaDataController) this.f17958b).lambda$putMediaCountDatabase$138(this.f17959c, this.d, this.f17960e, this.f17961f);
                return;
            default:
                ((MessagesStorage) this.f17958b).lambda$updateRepliesMaxReadId$193(this.f17959c, this.d, this.f17960e, this.f17961f);
                return;
        }
    }
}
