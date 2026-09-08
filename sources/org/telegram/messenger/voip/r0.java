package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f19439a;
    public final Object f19440b;

    public r0(Object obj, int i10) {
        this.f19439a = i10;
        this.f19440b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19439a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19440b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19440b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19440b);
                return;
            default:
                ((NativeInstance) this.f19440b).stopGroup();
                return;
        }
    }
}
