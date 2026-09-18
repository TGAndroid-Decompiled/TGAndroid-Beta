package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.kz;
public final class k implements Runnable {
    public final int f17769a;
    public final boolean f17770b;
    public final boolean f17771c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17769a = i10;
        this.d = obj;
        this.f17770b = z10;
        this.f17771c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17769a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17770b, this.f17771c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17770b, this.f17771c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17770b, this.f17771c);
                return;
            default:
                ((kz) this.d).P(false, this.f17770b, this.f17771c);
                return;
        }
    }
}
