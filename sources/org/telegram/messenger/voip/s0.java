package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f20469a;
    public final Object f20470b;

    public s0(Object obj, int i10) {
        this.f20469a = i10;
        this.f20470b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20469a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f20470b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f20470b).lambda$run$0();
                return;
            case 2:
                AudioTrackJNI.a((AudioTrackJNI) this.f20470b);
                return;
            case 3:
                VoIPPendingCall.a((VoIPPendingCall) this.f20470b);
                return;
            default:
                ((NativeInstance) this.f20470b).stopGroup();
                return;
        }
    }
}
