package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f17956a;
    public final Object f17957b;

    public r0(Object obj, int i10) {
        this.f17956a = i10;
        this.f17957b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17956a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17957b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17957b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17957b);
                return;
            default:
                ((NativeInstance) this.f17957b).stopGroup();
                return;
        }
    }
}
