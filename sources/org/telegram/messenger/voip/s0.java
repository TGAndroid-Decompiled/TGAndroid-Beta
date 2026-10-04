package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f19615a;
    public final Object f19616b;

    public s0(Object obj, int i10) {
        this.f19615a = i10;
        this.f19616b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19615a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19616b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19616b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19616b);
                return;
            case 3:
                ((NativeInstance) this.f19616b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f19616b);
                return;
        }
    }
}
