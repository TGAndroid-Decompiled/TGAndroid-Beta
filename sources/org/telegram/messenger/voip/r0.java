package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f22006a;
    public final Object f22007b;

    public r0(Object obj, int i10) {
        this.f22006a = i10;
        this.f22007b = obj;
    }

    @Override
    public final void run() {
        switch (this.f22006a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f22007b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f22007b).lambda$run$0();
                return;
            case 2:
                AudioTrackJNI.a((AudioTrackJNI) this.f22007b);
                return;
            case 3:
                VoIPPendingCall.a((VoIPPendingCall) this.f22007b);
                return;
            default:
                ((NativeInstance) this.f22007b).stopGroup();
                return;
        }
    }
}
