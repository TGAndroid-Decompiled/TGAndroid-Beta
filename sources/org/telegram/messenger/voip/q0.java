package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f19986a;
    public final Object f19987b;

    public q0(Object obj, int i10) {
        this.f19986a = i10;
        this.f19987b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19986a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19987b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19987b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19987b);
                return;
            case 3:
                ((NativeInstance) this.f19987b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f19987b);
                return;
        }
    }
}
