package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class r0 implements Runnable {
    public final int f21942a;
    public final Object f21943b;

    public r0(Object obj, int i9) {
        this.f21942a = i9;
        this.f21943b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21942a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f21943b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f21943b).lambda$run$0();
                return;
            case 2:
                AudioTrackJNI.a((AudioTrackJNI) this.f21943b);
                return;
            case 3:
                VoIPPendingCall.a((VoIPPendingCall) this.f21943b);
                return;
            default:
                ((NativeInstance) this.f21943b).stopGroup();
                return;
        }
    }
}
