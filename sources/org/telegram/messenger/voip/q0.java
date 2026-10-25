package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class q0 implements Runnable {
    public final int f21683a;
    public final Object f21684b;

    public q0(Object obj, int i10) {
        this.f21683a = i10;
        this.f21684b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21683a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f21684b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f21684b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f21684b);
                return;
            case 3:
                ((NativeInstance) this.f21684b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f21684b);
                return;
        }
    }
}
