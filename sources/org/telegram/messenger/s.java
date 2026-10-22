package org.telegram.messenger;
public final class s implements Runnable {
    public final int f19435a;
    public final Object f19436b;
    public final long f19437c;
    public final int d;
    public final int e;

    public s(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
        this.f19435a = i12;
        this.f19436b = accountInstance;
        this.f19437c = j10;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19435a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f19436b, this.f19437c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f19436b, this.f19437c, this.d, this.e);
                return;
            default:
                ((MediaController) this.f19436b).lambda$startRecordingV2$23(this.d, this.f19437c, this.e);
                return;
        }
    }

    public s(MediaController mediaController, int i10, long j10, int i11) {
        this.f19435a = 2;
        this.f19436b = mediaController;
        this.d = i10;
        this.f19437c = j10;
        this.e = i11;
    }
}
