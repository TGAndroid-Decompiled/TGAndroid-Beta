package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f19453a;
    public final Object f19454b;

    public r0(Object obj, int i10) {
        this.f19453a = i10;
        this.f19454b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19453a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19454b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19454b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19454b);
                return;
            default:
                ((NativeInstance) this.f19454b).stopGroup();
                return;
        }
    }
}
