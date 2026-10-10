package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f19628a;
    public final Object f19629b;

    public t0(Object obj, int i10) {
        this.f19628a = i10;
        this.f19629b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19628a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19629b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19629b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19629b);
                return;
            case 3:
                ((NativeInstance) this.f19629b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f19629b);
                return;
        }
    }
}
