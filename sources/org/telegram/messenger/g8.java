package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f17921a;
    public final BaseController f17922b;
    public final long f17923c;
    public final long d;
    public final int f17924e;
    public final int f17925f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17921a = i12;
        this.f17922b = baseController;
        this.f17923c = j3;
        this.d = j10;
        this.f17924e = i10;
        this.f17925f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17921a) {
            case 0:
                ((MediaDataController) this.f17922b).lambda$getMediaCountDatabase$139(this.f17923c, this.d, this.f17924e, this.f17925f);
                return;
            case 1:
                ((MediaDataController) this.f17922b).lambda$putMediaCountDatabase$138(this.f17923c, this.d, this.f17924e, this.f17925f);
                return;
            default:
                ((MessagesStorage) this.f17922b).lambda$updateRepliesMaxReadId$193(this.f17923c, this.d, this.f17924e, this.f17925f);
                return;
        }
    }
}
