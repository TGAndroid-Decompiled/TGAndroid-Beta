package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f20359a;
    public final BaseController f20360b;
    public final long f20361c;
    public final long d;
    public final int f20362e;
    public final int f20363f;

    public g8(BaseController baseController, long j10, long j11, int i9, int i10, int i11) {
        this.f20359a = i11;
        this.f20360b = baseController;
        this.f20361c = j10;
        this.d = j11;
        this.f20362e = i9;
        this.f20363f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20359a) {
            case 0:
                ((MediaDataController) this.f20360b).lambda$getMediaCountDatabase$139(this.f20361c, this.d, this.f20362e, this.f20363f);
                return;
            case 1:
                ((MediaDataController) this.f20360b).lambda$putMediaCountDatabase$138(this.f20361c, this.d, this.f20362e, this.f20363f);
                return;
            default:
                ((MessagesStorage) this.f20360b).lambda$updateRepliesMaxReadId$193(this.f20361c, this.d, this.f20362e, this.f20363f);
                return;
        }
    }
}
