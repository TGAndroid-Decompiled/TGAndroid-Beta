package org.telegram.messenger;
public final class s implements Runnable {
    public final int f19481a;
    public final Object f19482b;
    public final long f19483c;
    public final int d;
    public final int e;

    public s(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
        this.f19481a = i12;
        this.f19482b = accountInstance;
        this.f19483c = j10;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19481a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f19482b, this.f19483c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f19482b, this.f19483c, this.d, this.e);
                return;
            default:
                ((MediaController) this.f19482b).lambda$startRecordingV2$23(this.d, this.f19483c, this.e);
                return;
        }
    }

    public s(MediaController mediaController, int i10, long j10, int i11) {
        this.f19481a = 2;
        this.f19482b = mediaController;
        this.d = i10;
        this.f19483c = j10;
        this.e = i11;
    }
}
