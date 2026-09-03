package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f18818a;
    public final Object f18819b;

    public s0(Object obj, int i10) {
        this.f18818a = i10;
        this.f18819b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18818a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f18819b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f18819b).lambda$run$0();
                return;
            case 2:
                VoIPPendingCall.a((VoIPPendingCall) this.f18819b);
                return;
            default:
                ((NativeInstance) this.f18819b).stopGroup();
                return;
        }
    }
}
