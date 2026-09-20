package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f17926a;
    public final Object f17927b;

    public r0(Object obj, int i10) {
        this.f17926a = i10;
        this.f17927b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17926a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17927b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17927b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17927b);
                return;
            default:
                ((NativeInstance) this.f17927b).stopGroup();
                return;
        }
    }
}
