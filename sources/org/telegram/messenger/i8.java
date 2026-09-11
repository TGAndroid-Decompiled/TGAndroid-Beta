package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f17961a;
    public final BaseController f17962b;
    public final long f17963c;
    public final long d;
    public final int f17964e;
    public final int f17965f;

    public i8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17961a = i12;
        this.f17962b = baseController;
        this.f17963c = j3;
        this.d = j10;
        this.f17964e = i10;
        this.f17965f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17961a) {
            case 0:
                ((MediaDataController) this.f17962b).lambda$getMediaCountDatabase$139(this.f17963c, this.d, this.f17964e, this.f17965f);
                return;
            case 1:
                ((MediaDataController) this.f17962b).lambda$putMediaCountDatabase$138(this.f17963c, this.d, this.f17964e, this.f17965f);
                return;
            default:
                ((MessagesStorage) this.f17962b).lambda$updateRepliesMaxReadId$193(this.f17963c, this.d, this.f17964e, this.f17965f);
                return;
        }
    }
}
