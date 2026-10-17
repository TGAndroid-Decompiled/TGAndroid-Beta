package org.telegram.messenger;
public final class t implements Runnable {
    public final int f19524a;
    public final Object f19525b;
    public final long f19526c;
    public final int d;
    public final int e;

    public t(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
        this.f19524a = i12;
        this.f19525b = accountInstance;
        this.f19526c = j10;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19524a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f19525b, this.f19526c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f19525b, this.f19526c, this.d, this.e);
                return;
            default:
                ((MediaController) this.f19525b).lambda$startRecordingV2$23(this.d, this.f19526c, this.e);
                return;
        }
    }

    public t(MediaController mediaController, int i10, long j10, int i11) {
        this.f19524a = 2;
        this.f19525b = mediaController;
        this.d = i10;
        this.f19526c = j10;
        this.e = i11;
    }
}
