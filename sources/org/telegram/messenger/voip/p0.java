package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class p0 implements Runnable {
    public final int f26163a;
    public final Object f26164b;

    public p0(Object obj, int i7) {
        this.f26163a = i7;
        this.f26164b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26163a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f26164b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f26164b).lambda$run$0();
                return;
            case 2:
                ((VoIPPendingCall) this.f26164b).lambda$new$1();
                return;
            case 3:
                ((NativeInstance) this.f26164b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f26164b);
                return;
        }
    }
}
