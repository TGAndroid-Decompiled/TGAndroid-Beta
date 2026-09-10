package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class u0 implements Runnable {
    public final int f16791a;
    public final Object f16792b;

    public u0(Object obj, int i10) {
        this.f16791a = i10;
        this.f16792b = obj;
    }

    @Override
    public final void run() {
        switch (this.f16791a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f16792b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f16792b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f16792b);
                return;
            default:
                ((NativeInstance) this.f16792b).stopGroup();
                return;
        }
    }
}
