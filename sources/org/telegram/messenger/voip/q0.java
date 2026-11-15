package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f27173a;
    public final Object f27174b;

    public q0(Object obj, int i7) {
        this.f27173a = i7;
        this.f27174b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27173a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f27174b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f27174b).lambda$run$0();
                return;
            case 2:
                ((VoIPPendingCall) this.f27174b).lambda$new$1();
                return;
            case 3:
                ((NativeInstance) this.f27174b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f27174b);
                return;
        }
    }
}
