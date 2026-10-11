package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f19651a;
    public final Object f19652b;

    public s0(Object obj, int i10) {
        this.f19651a = i10;
        this.f19652b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19651a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19652b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19652b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19652b);
                return;
            case 3:
                ((NativeInstance) this.f19652b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f19652b);
                return;
        }
    }
}
