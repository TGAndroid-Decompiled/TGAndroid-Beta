package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f17888a;
    public final Object f17889b;

    public r0(Object obj, int i10) {
        this.f17888a = i10;
        this.f17889b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17888a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17889b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17889b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17889b);
                return;
            default:
                ((NativeInstance) this.f17889b).stopGroup();
                return;
        }
    }
}
