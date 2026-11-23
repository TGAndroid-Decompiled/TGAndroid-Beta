package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f27494a;
    public final Object f27495b;

    public q0(Object obj, int i7) {
        this.f27494a = i7;
        this.f27495b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27494a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f27495b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f27495b).lambda$run$0();
                return;
            case 2:
                ((VoIPPendingCall) this.f27495b).lambda$new$1();
                return;
            case 3:
                ((NativeInstance) this.f27495b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f27495b);
                return;
        }
    }
}
