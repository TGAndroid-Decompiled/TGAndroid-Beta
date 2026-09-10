package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.rz;
public final class k implements Runnable {
    public final int f16646a;
    public final boolean f16647b;
    public final boolean f16648c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f16646a = i10;
        this.d = obj;
        this.f16647b = z10;
        this.f16648c = z11;
    }

    @Override
    public final void run() {
        switch (this.f16646a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f16647b, this.f16648c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f16647b, this.f16648c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f16647b, this.f16648c);
                return;
            default:
                ((rz) this.d).R(false, this.f16647b, this.f16648c);
                return;
        }
    }
}
