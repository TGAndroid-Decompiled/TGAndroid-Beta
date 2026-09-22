package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f17941a;
    public final Object f17942b;

    public r0(Object obj, int i10) {
        this.f17941a = i10;
        this.f17942b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17941a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f17942b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f17942b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f17942b);
                return;
            default:
                ((NativeInstance) this.f17942b).stopGroup();
                return;
        }
    }
}
