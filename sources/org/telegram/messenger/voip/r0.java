package org.telegram.messenger.voip;

public final class r0 implements Runnable {

    public final int f21966a;

    public final Object f21967b;

    public r0(Object obj, int i10) {
        this.f21966a = i10;
        this.f21967b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21966a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f21967b).lambda$run$0();
                break;
            case 1:
                ((VoIPService.AnonymousClass9) this.f21967b).lambda$run$0();
                break;
            case 2:
                ((AudioTrackJNI) this.f21967b).lambda$startThread$0();
                break;
            case 3:
                ((VoIPPendingCall) this.f21967b).lambda$new$1();
                break;
            default:
                ((NativeInstance) this.f21967b).stopGroup();
                break;
        }
    }
}
