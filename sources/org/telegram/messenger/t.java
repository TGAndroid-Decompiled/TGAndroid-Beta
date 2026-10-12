package org.telegram.messenger;
public final class t implements Runnable {
    public final int f18439a;
    public final Object f18440b;
    public final long f18441c;
    public final int d;
    public final int e;

    public t(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
        this.f18439a = i12;
        this.f18440b = accountInstance;
        this.f18441c = j10;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18439a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f18440b, this.f18441c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f18440b, this.f18441c, this.d, this.e);
                return;
            default:
                ((MediaController) this.f18440b).lambda$startRecordingV2$23(this.d, this.f18441c, this.e);
                return;
        }
    }

    public t(MediaController mediaController, int i10, long j10, int i11) {
        this.f18439a = 2;
        this.f18440b = mediaController;
        this.d = i10;
        this.f18441c = j10;
        this.e = i11;
    }
}
