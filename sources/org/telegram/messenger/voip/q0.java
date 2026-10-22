package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f19918a;
    public final Object f19919b;

    public q0(Object obj, int i10) {
        this.f19918a = i10;
        this.f19919b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19918a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19919b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19919b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19919b);
                return;
            case 3:
                ((NativeInstance) this.f19919b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f19919b);
                return;
        }
    }
}
