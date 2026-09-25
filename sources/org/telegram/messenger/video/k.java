package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.lz;
public final class k implements Runnable {
    public final int f17818a;
    public final boolean f17819b;
    public final boolean f17820c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17818a = i10;
        this.d = obj;
        this.f17819b = z10;
        this.f17820c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17819b, this.f17820c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17819b, this.f17820c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17819b, this.f17820c);
                return;
            default:
                ((lz) this.d).P(false, this.f17819b, this.f17820c);
                return;
        }
    }
}
