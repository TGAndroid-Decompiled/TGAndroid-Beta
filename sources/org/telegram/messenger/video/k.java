package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.fz;
public final class k implements Runnable {
    public final int f21879a;
    public final boolean f21880b;
    public final boolean f21881c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f21879a = i10;
        this.d = obj;
        this.f21880b = z10;
        this.f21881c = z11;
    }

    @Override
    public final void run() {
        switch (this.f21879a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f21880b, this.f21881c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f21880b, this.f21881c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f21880b, this.f21881c);
                return;
            default:
                ((fz) this.d).R(false, this.f21880b, this.f21881c);
                return;
        }
    }
}
