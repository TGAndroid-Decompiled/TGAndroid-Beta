package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f17939a;
    public final Object f17940b;

    public r0(Object obj, int i10) {
        this.f17939a = i10;
        this.f17940b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17939a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17940b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17940b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17940b);
                return;
            default:
                ((NativeInstance) this.f17940b).stopGroup();
                return;
        }
    }
}
