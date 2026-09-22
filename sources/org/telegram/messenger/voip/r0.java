package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f17697a;
    public final Object f17698b;

    public r0(Object obj, int i10) {
        this.f17697a = i10;
        this.f17698b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17697a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17698b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17698b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17698b);
                return;
            default:
                ((NativeInstance) this.f17698b).stopGroup();
                return;
        }
    }
}
