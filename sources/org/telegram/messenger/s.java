package org.telegram.messenger;
public final class s implements Runnable {
    public final int f19504a;
    public final Object f19505b;
    public final long f19506c;
    public final int d;
    public final int e;

    public s(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
        this.f19504a = i12;
        this.f19505b = accountInstance;
        this.f19506c = j10;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19504a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f19505b, this.f19506c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f19505b, this.f19506c, this.d, this.e);
                return;
            default:
                ((MediaController) this.f19505b).lambda$startRecordingV2$23(this.d, this.f19506c, this.e);
                return;
        }
    }

    public s(MediaController mediaController, int i10, long j10, int i11) {
        this.f19504a = 2;
        this.f19505b = mediaController;
        this.d = i10;
        this.f19506c = j10;
        this.e = i11;
    }
}
