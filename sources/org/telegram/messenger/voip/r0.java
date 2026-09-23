package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f17686a;
    public final Object f17687b;

    public r0(Object obj, int i10) {
        this.f17686a = i10;
        this.f17687b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17686a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17687b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17687b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17687b);
                return;
            default:
                ((NativeInstance) this.f17687b).stopGroup();
                return;
        }
    }
}
