package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f17261a;
    public final BaseController f17262b;
    public final long f17263c;
    public final long d;
    public final int e;
    public final int f17264f;

    public j8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f17261a = i12;
        this.f17262b = baseController;
        this.f17263c = j10;
        this.d = j11;
        this.e = i10;
        this.f17264f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17261a) {
            case 0:
                ((MediaDataController) this.f17262b).lambda$getMediaCountDatabase$139(this.f17263c, this.d, this.e, this.f17264f);
                return;
            case 1:
                ((MediaDataController) this.f17262b).lambda$putMediaCountDatabase$138(this.f17263c, this.d, this.e, this.f17264f);
                return;
            default:
                ((MessagesStorage) this.f17262b).lambda$updateRepliesMaxReadId$193(this.f17263c, this.d, this.e, this.f17264f);
                return;
        }
    }
}
