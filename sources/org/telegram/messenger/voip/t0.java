package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f18556a;
    public final Object f18557b;

    public t0(Object obj, int i10) {
        this.f18556a = i10;
        this.f18557b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18556a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f18557b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f18557b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f18557b);
                return;
            case 3:
                ((NativeInstance) this.f18557b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f18557b);
                return;
        }
    }
}
