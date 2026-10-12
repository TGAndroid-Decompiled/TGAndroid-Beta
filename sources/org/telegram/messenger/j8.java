package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f17566a;
    public final BaseController f17567b;
    public final long f17568c;
    public final long d;
    public final int e;
    public final int f17569f;

    public j8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f17566a = i12;
        this.f17567b = baseController;
        this.f17568c = j10;
        this.d = j11;
        this.e = i10;
        this.f17569f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17566a) {
            case 0:
                ((MediaDataController) this.f17567b).lambda$getMediaCountDatabase$139(this.f17568c, this.d, this.e, this.f17569f);
                return;
            case 1:
                ((MediaDataController) this.f17567b).lambda$putMediaCountDatabase$138(this.f17568c, this.d, this.e, this.f17569f);
                return;
            default:
                ((MessagesStorage) this.f17567b).lambda$updateRepliesMaxReadId$193(this.f17568c, this.d, this.e, this.f17569f);
                return;
        }
    }
}
