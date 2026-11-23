package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f27635a;
    public final Object f27636b;

    public q0(Object obj, int i7) {
        this.f27635a = i7;
        this.f27636b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27635a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f27636b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f27636b).lambda$run$0();
                return;
            case 2:
                ((VoIPPendingCall) this.f27636b).lambda$new$1();
                return;
            case 3:
                ((NativeInstance) this.f27636b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f27636b);
                return;
        }
    }
}
