package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f27530a;
    public final Object f27531b;

    public q0(Object obj, int i7) {
        this.f27530a = i7;
        this.f27531b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27530a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f27531b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f27531b).lambda$run$0();
                return;
            case 2:
                ((VoIPPendingCall) this.f27531b).lambda$new$1();
                return;
            case 3:
                ((NativeInstance) this.f27531b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f27531b);
                return;
        }
    }
}
