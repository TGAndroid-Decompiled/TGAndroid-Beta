package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f19614a;
    public final Object f19615b;

    public s0(Object obj, int i10) {
        this.f19614a = i10;
        this.f19615b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19614a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19615b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19615b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19615b);
                return;
            case 3:
                ((NativeInstance) this.f19615b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f19615b);
                return;
        }
    }
}
