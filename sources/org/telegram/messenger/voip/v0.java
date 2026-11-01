package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class v0 implements Runnable {
    public final int f18874a;
    public final Object f18875b;

    public v0(Object obj, int i10) {
        this.f18874a = i10;
        this.f18875b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18874a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f18875b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f18875b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f18875b);
                return;
            case 3:
                ((NativeInstance) this.f18875b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f18875b);
                return;
        }
    }
}
