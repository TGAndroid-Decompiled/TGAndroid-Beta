package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class p0 implements Runnable {
    public final int f26153a;
    public final Object f26154b;

    public p0(Object obj, int i7) {
        this.f26153a = i7;
        this.f26154b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26153a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f26154b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f26154b).lambda$run$0();
                return;
            case 2:
                ((VoIPPendingCall) this.f26154b).lambda$new$1();
                return;
            case 3:
                ((NativeInstance) this.f26154b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f26154b);
                return;
        }
    }
}
