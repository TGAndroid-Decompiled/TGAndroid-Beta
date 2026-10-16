package org.telegram.messenger;
public final class s implements Runnable {
    public final int f18046a;
    public final Object f18047b;
    public final long f18048c;
    public final int d;
    public final int e;

    public s(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
        this.f18046a = i12;
        this.f18047b = accountInstance;
        this.f18048c = j10;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18046a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f18047b, this.f18048c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f18047b, this.f18048c, this.d, this.e);
                return;
            default:
                ((MediaController) this.f18047b).lambda$startRecordingV2$23(this.d, this.f18048c, this.e);
                return;
        }
    }

    public s(MediaController mediaController, int i10, long j10, int i11) {
        this.f18046a = 2;
        this.f18047b = mediaController;
        this.d = i10;
        this.f18048c = j10;
        this.e = i11;
    }
}
