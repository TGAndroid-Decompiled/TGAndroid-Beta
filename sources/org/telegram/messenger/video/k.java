package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.kz;
public final class k implements Runnable {
    public final int f17595a;
    public final boolean f17596b;
    public final boolean f17597c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17595a = i10;
        this.d = obj;
        this.f17596b = z10;
        this.f17597c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17595a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17596b, this.f17597c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17596b, this.f17597c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17596b, this.f17597c);
                return;
            default:
                ((kz) this.d).Q(false, this.f17596b, this.f17597c);
                return;
        }
    }
}
