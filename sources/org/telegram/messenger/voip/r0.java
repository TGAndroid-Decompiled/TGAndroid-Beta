package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f17702a;
    public final Object f17703b;

    public r0(Object obj, int i10) {
        this.f17702a = i10;
        this.f17703b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17702a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17703b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17703b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17703b);
                return;
            default:
                ((NativeInstance) this.f17703b).stopGroup();
                return;
        }
    }
}
