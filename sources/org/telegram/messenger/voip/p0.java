package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class p0 implements Runnable {
    public final int f26159a;
    public final Object f26160b;

    public p0(Object obj, int i7) {
        this.f26159a = i7;
        this.f26160b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26159a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f26160b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f26160b).lambda$run$0();
                return;
            case 2:
                ((VoIPPendingCall) this.f26160b).lambda$new$1();
                return;
            case 3:
                ((NativeInstance) this.f26160b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f26160b);
                return;
        }
    }
}
