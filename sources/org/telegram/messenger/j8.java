package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f18038a;
    public final BaseController f18039b;
    public final long f18040c;
    public final long d;
    public final int f18041e;
    public final int f18042f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f18038a = i12;
        this.f18039b = baseController;
        this.f18040c = j3;
        this.d = j10;
        this.f18041e = i10;
        this.f18042f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18038a) {
            case 0:
                ((MediaDataController) this.f18039b).lambda$getMediaCountDatabase$139(this.f18040c, this.d, this.f18041e, this.f18042f);
                return;
            case 1:
                ((MediaDataController) this.f18039b).lambda$putMediaCountDatabase$138(this.f18040c, this.d, this.f18041e, this.f18042f);
                return;
            default:
                ((MessagesStorage) this.f18039b).lambda$updateRepliesMaxReadId$193(this.f18040c, this.d, this.f18041e, this.f18042f);
                return;
        }
    }
}
