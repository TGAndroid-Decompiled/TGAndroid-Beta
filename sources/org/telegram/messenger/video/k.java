package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.nz;
public final class k implements Runnable {
    public final int f17845a;
    public final boolean f17846b;
    public final boolean f17847c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17845a = i10;
        this.d = obj;
        this.f17846b = z10;
        this.f17847c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17845a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17846b, this.f17847c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17846b, this.f17847c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17846b, this.f17847c);
                return;
            default:
                ((nz) this.d).P(false, this.f17846b, this.f17847c);
                return;
        }
    }
}
