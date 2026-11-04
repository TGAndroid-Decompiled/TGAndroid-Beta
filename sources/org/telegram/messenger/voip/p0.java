package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class p0 implements Runnable {
    public final int f26045a;
    public final Object f26046b;

    public p0(Object obj, int i3) {
        this.f26045a = i3;
        this.f26046b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26045a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f26046b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f26046b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f26046b);
                return;
            case 3:
                ((NativeInstance) this.f26046b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f26046b);
                return;
        }
    }
}
