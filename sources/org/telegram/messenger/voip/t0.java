package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class t0 implements Runnable {
    public final int f19624a;
    public final Object f19625b;

    public t0(Object obj, int i10) {
        this.f19624a = i10;
        this.f19625b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19624a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19625b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19625b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19625b);
                return;
            case 3:
                ((NativeInstance) this.f19625b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f19625b);
                return;
        }
    }
}
