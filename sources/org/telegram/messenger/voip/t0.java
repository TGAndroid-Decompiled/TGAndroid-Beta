package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f18860a;
    public final Object f18861b;

    public t0(Object obj, int i10) {
        this.f18860a = i10;
        this.f18861b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18860a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f18861b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f18861b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f18861b);
                return;
            case 3:
                ((NativeInstance) this.f18861b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f18861b);
                return;
        }
    }
}
