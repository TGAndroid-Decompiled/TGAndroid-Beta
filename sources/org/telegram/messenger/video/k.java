package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.kz;
public final class k implements Runnable {
    public final int f17800a;
    public final boolean f17801b;
    public final boolean f17802c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17800a = i10;
        this.d = obj;
        this.f17801b = z10;
        this.f17802c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17800a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17801b, this.f17802c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17801b, this.f17802c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17801b, this.f17802c);
                return;
            default:
                ((kz) this.d).P(false, this.f17801b, this.f17802c);
                return;
        }
    }
}
