package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.kz;
public final class k implements Runnable {
    public final int f19312a;
    public final boolean f19313b;
    public final boolean f19314c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f19312a = i10;
        this.d = obj;
        this.f19313b = z10;
        this.f19314c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19312a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f19313b, this.f19314c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f19313b, this.f19314c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f19313b, this.f19314c);
                return;
            default:
                ((kz) this.d).R(false, this.f19313b, this.f19314c);
                return;
        }
    }
}
