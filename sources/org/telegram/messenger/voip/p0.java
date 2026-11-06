package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
public final class p0 implements Runnable {
    public final int f26145a;
    public final Object f26146b;

    public p0(Object obj, int i7) {
        this.f26145a = i7;
        this.f26146b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26145a) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f26146b).lambda$run$0();
                return;
            case 1:
                ((VoIPService.AnonymousClass9) this.f26146b).lambda$run$0();
                return;
            case 2:
                ((VoIPPendingCall) this.f26146b).lambda$new$1();
                return;
            case 3:
                ((NativeInstance) this.f26146b).stopGroup();
                return;
            default:
                VoIPService.lambda$updateBluetoothHeadsetState$113((VoipAudioManager) this.f26146b);
                return;
        }
    }
}
