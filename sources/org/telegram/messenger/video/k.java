package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.kz;
public final class k implements Runnable {
    public final int f17815a;
    public final boolean f17816b;
    public final boolean f17817c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17815a = i10;
        this.d = obj;
        this.f17816b = z10;
        this.f17817c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17815a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17816b, this.f17817c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17816b, this.f17817c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17816b, this.f17817c);
                return;
            default:
                ((kz) this.d).P(false, this.f17816b, this.f17817c);
                return;
        }
    }
}
