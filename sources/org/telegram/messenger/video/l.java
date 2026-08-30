package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.kz;
public final class l implements Runnable {
    public final int f18717a;
    public final boolean f18718b;
    public final boolean f18719c;
    public final Object d;

    public l(Object obj, boolean z4, boolean z10, int i10) {
        this.f18717a = i10;
        this.d = obj;
        this.f18718b = z4;
        this.f18719c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18717a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f18718b, this.f18719c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f18718b, this.f18719c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f18718b, this.f18719c);
                return;
            default:
                ((kz) this.d).R(false, this.f18718b, this.f18719c);
                return;
        }
    }
}
