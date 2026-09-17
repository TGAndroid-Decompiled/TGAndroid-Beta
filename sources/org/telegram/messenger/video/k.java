package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.kz;
public final class k implements Runnable {
    public final int f19321a;
    public final boolean f19322b;
    public final boolean f19323c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f19321a = i10;
        this.d = obj;
        this.f19322b = z10;
        this.f19323c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19321a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f19322b, this.f19323c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f19322b, this.f19323c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f19322b, this.f19323c);
                return;
            default:
                ((kz) this.d).R(false, this.f19322b, this.f19323c);
                return;
        }
    }
}
