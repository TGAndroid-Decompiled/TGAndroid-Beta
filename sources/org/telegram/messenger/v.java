package org.telegram.messenger;
public final class v implements Runnable {
    public final int f21475a;
    public final Object f21476b;
    public final long f21477c;
    public final int d;
    public final int e;

    public v(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
        this.f21475a = i12;
        this.f21476b = accountInstance;
        this.f21477c = j10;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f21475a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f21476b, this.f21477c, this.d, this.e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f21476b, this.f21477c, this.d, this.e);
                return;
            default:
                ((MediaController) this.f21476b).lambda$startRecordingV2$23(this.d, this.f21477c, this.e);
                return;
        }
    }

    public v(MediaController mediaController, int i10, long j10, int i11) {
        this.f21475a = 2;
        this.f21476b = mediaController;
        this.d = i10;
        this.f21477c = j10;
        this.e = i11;
    }
}
