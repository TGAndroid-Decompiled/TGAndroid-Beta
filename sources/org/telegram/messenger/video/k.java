package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.kz;
public final class k implements Runnable {
    public final int f17586a;
    public final boolean f17587b;
    public final boolean f17588c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17586a = i10;
        this.d = obj;
        this.f17587b = z10;
        this.f17588c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17586a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17587b, this.f17588c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17587b, this.f17588c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17587b, this.f17588c);
                return;
            default:
                ((kz) this.d).Q(false, this.f17587b, this.f17588c);
                return;
        }
    }
}
