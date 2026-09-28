package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f16446a;
    public final BaseController f16447b;
    public final long f16448c;
    public final long d;
    public final int e;
    public final int f16449f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16446a = i12;
        this.f16447b = baseController;
        this.f16448c = j3;
        this.d = j10;
        this.e = i10;
        this.f16449f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16446a) {
            case 0:
                ((MediaDataController) this.f16447b).lambda$getMediaCountDatabase$139(this.f16448c, this.d, this.e, this.f16449f);
                return;
            case 1:
                ((MediaDataController) this.f16447b).lambda$putMediaCountDatabase$138(this.f16448c, this.d, this.e, this.f16449f);
                return;
            default:
                ((MessagesStorage) this.f16447b).lambda$updateRepliesMaxReadId$193(this.f16448c, this.d, this.e, this.f16449f);
                return;
        }
    }
}
