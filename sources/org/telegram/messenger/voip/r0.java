package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f17955a;
    public final Object f17956b;

    public r0(Object obj, int i10) {
        this.f17955a = i10;
        this.f17956b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17955a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17956b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17956b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17956b);
                return;
            default:
                ((NativeInstance) this.f17956b).stopGroup();
                return;
        }
    }
}
