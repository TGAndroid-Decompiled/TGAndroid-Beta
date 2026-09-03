package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.kz;
public final class l implements Runnable {
    public final int f18699a;
    public final boolean f18700b;
    public final boolean f18701c;
    public final Object d;

    public l(Object obj, boolean z4, boolean z10, int i10) {
        this.f18699a = i10;
        this.d = obj;
        this.f18700b = z4;
        this.f18701c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18699a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f18700b, this.f18701c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f18700b, this.f18701c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f18700b, this.f18701c);
                return;
            default:
                ((kz) this.d).R(false, this.f18700b, this.f18701c);
                return;
        }
    }
}
