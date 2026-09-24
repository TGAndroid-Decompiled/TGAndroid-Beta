package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.lz;
public final class k implements Runnable {
    public final int f17803a;
    public final boolean f17804b;
    public final boolean f17805c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17803a = i10;
        this.d = obj;
        this.f17804b = z10;
        this.f17805c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17803a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17804b, this.f17805c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17804b, this.f17805c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17804b, this.f17805c);
                return;
            default:
                ((lz) this.d).P(false, this.f17804b, this.f17805c);
                return;
        }
    }
}
