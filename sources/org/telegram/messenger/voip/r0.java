package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f19412a;
    public final Object f19413b;

    public r0(Object obj, int i10) {
        this.f19412a = i10;
        this.f19413b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19412a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f19413b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f19413b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f19413b);
                return;
            default:
                ((NativeInstance) this.f19413b).stopGroup();
                return;
        }
    }
}
