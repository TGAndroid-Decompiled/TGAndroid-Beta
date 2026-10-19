package org.telegram.messenger;
public final class s implements Runnable {
    public final int f19464a;
    public final Object f19465b;
    public final long f19466c;
    public final int d;
    public final int e;

    public s(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
        this.f19464a = i12;
        this.f19465b = accountInstance;
        this.f19466c = j10;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19464a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f19465b, this.f19466c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f19465b, this.f19466c, this.d, this.e);
                return;
            default:
                ((MediaController) this.f19465b).lambda$startRecordingV2$23(this.d, this.f19466c, this.e);
                return;
        }
    }

    public s(MediaController mediaController, int i10, long j10, int i11) {
        this.f19464a = 2;
        this.f19465b = mediaController;
        this.d = i10;
        this.f19466c = j10;
        this.e = i11;
    }
}
