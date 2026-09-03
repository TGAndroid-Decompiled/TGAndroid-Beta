package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f20471a;
    public final Object f20472b;

    public s0(Object obj, int i10) {
        this.f20471a = i10;
        this.f20472b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20471a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f20472b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f20472b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f20472b);
                return;
            default:
                ((NativeInstance) this.f20472b).stopGroup();
                return;
        }
    }
}
