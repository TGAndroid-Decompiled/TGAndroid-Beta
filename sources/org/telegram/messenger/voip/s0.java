package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f17958a;
    public final Object f17959b;

    public s0(Object obj, int i10) {
        this.f17958a = i10;
        this.f17959b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17958a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17959b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17959b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17959b);
                return;
            case 3:
                ((NativeInstance) this.f17959b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f17959b);
                return;
        }
    }
}
