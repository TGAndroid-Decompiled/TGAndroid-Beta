package org.telegram.messenger;
public final class t implements Runnable {
    public final int f18937a;
    public final Object f18938b;
    public final long f18939c;
    public final int d;
    public final int f18940e;

    public t(AccountInstance accountInstance, long j3, int i10, int i11, int i12) {
        this.f18937a = i12;
        this.f18938b = accountInstance;
        this.f18939c = j3;
        this.d = i10;
        this.f18940e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18937a) {
            case 0:
                AutoMessageHeardReceiver.a((AccountInstance) this.f18938b, this.f18939c, this.d, this.f18940e);
                return;
            case 1:
                AutoMessageHeardReceiver.b((AccountInstance) this.f18938b, this.f18939c, this.d, this.f18940e);
                return;
            default:
                ((MediaController) this.f18938b).lambda$startRecordingV2$23(this.d, this.f18939c, this.f18940e);
                return;
        }
    }

    public t(MediaController mediaController, int i10, long j3, int i11) {
        this.f18937a = 2;
        this.f18938b = mediaController;
        this.d = i10;
        this.f18939c = j3;
        this.f18940e = i11;
    }
}
