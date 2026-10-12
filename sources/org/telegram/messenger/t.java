package org.telegram.messenger;
public final class t implements Runnable {
    public final int f18936a;
    public final Object f18937b;
    public final long f18938c;
    public final int d;
    public final int f18939e;

    public t(AccountInstance accountInstance, long j3, int i10, int i11, int i12) {
        this.f18936a = i12;
        this.f18937b = accountInstance;
        this.f18938c = j3;
        this.d = i10;
        this.f18939e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18936a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f18937b, this.f18938c, this.d, this.f18939e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f18937b, this.f18938c, this.d, this.f18939e);
                return;
            default:
                ((MediaController) this.f18937b).lambda$startRecordingV2$23(this.d, this.f18938c, this.f18939e);
                return;
        }
    }

    public t(MediaController mediaController, int i10, long j3, int i11) {
        this.f18936a = 2;
        this.f18937b = mediaController;
        this.d = i10;
        this.f18938c = j3;
        this.f18939e = i11;
    }
}
