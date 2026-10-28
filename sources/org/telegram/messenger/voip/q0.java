package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f21671a;
    public final Object f21672b;

    public q0(Object obj, int i10) {
        this.f21671a = i10;
        this.f21672b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21671a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f21672b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f21672b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f21672b);
                return;
            case 3:
                ((NativeInstance) this.f21672b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f21672b);
                return;
        }
    }
}
