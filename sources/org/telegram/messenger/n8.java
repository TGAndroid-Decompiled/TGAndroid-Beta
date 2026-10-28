package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f20757a;
    public final BaseController f20758b;
    public final long f20759c;
    public final long d;
    public final int e;
    public final int f20760f;

    public n8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f20757a = i12;
        this.f20758b = baseController;
        this.f20759c = j10;
        this.d = j11;
        this.e = i10;
        this.f20760f = i11;
    }

    @Override
    public final void run() {
        switch (this.f20757a) {
            case 0:
                ((MediaDataController) this.f20758b).lambda$getMediaCountDatabase$139(this.f20759c, this.d, this.e, this.f20760f);
                return;
            case 1:
                ((MediaDataController) this.f20758b).lambda$putMediaCountDatabase$138(this.f20759c, this.d, this.e, this.f20760f);
                return;
            default:
                ((MessagesStorage) this.f20758b).lambda$updateRepliesMaxReadId$197(this.f20759c, this.d, this.e, this.f20760f);
                return;
        }
    }
}
