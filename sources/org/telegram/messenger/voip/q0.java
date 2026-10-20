package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f19900a;
    public final Object f19901b;

    public q0(Object obj, int i10) {
        this.f19900a = i10;
        this.f19901b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19900a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19901b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19901b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19901b);
                return;
            case 3:
                ((NativeInstance) this.f19901b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f19901b);
                return;
        }
    }
}
