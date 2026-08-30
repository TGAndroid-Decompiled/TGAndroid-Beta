package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class s0 implements Runnable {
    public final int f18836a;
    public final Object f18837b;

    public s0(Object obj, int i10) {
        this.f18836a = i10;
        this.f18837b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18836a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f18837b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f18837b).lambda$run$0();
                return;
            case 2:
                AudioTrackJNI.a((AudioTrackJNI) this.f18837b);
                return;
            case 3:
                VoIPPendingCall.a((VoIPPendingCall) this.f18837b);
                return;
            default:
                ((NativeInstance) this.f18837b).stopGroup();
                return;
        }
    }
}
