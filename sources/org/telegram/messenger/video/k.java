package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.mz;
public final class k implements Runnable {
    public final int f17828a;
    public final boolean f17829b;
    public final boolean f17830c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17828a = i10;
        this.d = obj;
        this.f17829b = z10;
        this.f17830c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17828a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17829b, this.f17830c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17829b, this.f17830c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17829b, this.f17830c);
                return;
            default:
                ((mz) this.d).P(false, this.f17829b, this.f17830c);
                return;
        }
    }
}
