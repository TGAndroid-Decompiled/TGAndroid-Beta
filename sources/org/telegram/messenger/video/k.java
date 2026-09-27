package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.mz;
public final class k implements Runnable {
    public final int f17812a;
    public final boolean f17813b;
    public final boolean f17814c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f17812a = i10;
        this.d = obj;
        this.f17813b = z10;
        this.f17814c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17812a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f17813b, this.f17814c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f17813b, this.f17814c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f17813b, this.f17814c);
                return;
            default:
                ((mz) this.d).P(false, this.f17813b, this.f17814c);
                return;
        }
    }
}
