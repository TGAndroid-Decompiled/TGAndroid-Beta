package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16466a;
    public final BaseController f16467b;
    public final long f16468c;
    public final long d;
    public final int e;
    public final int f16469f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16466a = i12;
        this.f16467b = baseController;
        this.f16468c = j3;
        this.d = j10;
        this.e = i10;
        this.f16469f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16466a) {
            case 0:
                ((MediaDataController) this.f16467b).lambda$getMediaCountDatabase$139(this.f16468c, this.d, this.e, this.f16469f);
                return;
            case 1:
                ((MediaDataController) this.f16467b).lambda$putMediaCountDatabase$138(this.f16468c, this.d, this.e, this.f16469f);
                return;
            default:
                ((MessagesStorage) this.f16467b).lambda$updateRepliesMaxReadId$193(this.f16468c, this.d, this.e, this.f16469f);
                return;
        }
    }
}
