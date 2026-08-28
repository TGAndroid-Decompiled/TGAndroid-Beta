package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.wy;
public final class l implements Runnable {
    public final int f21815a;
    public final boolean f21816b;
    public final boolean f21817c;
    public final Object d;

    public l(Object obj, boolean z10, boolean z11, int i9) {
        this.f21815a = i9;
        this.d = obj;
        this.f21816b = z10;
        this.f21817c = z11;
    }

    @Override
    public final void run() {
        switch (this.f21815a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f21816b, this.f21817c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f21816b, this.f21817c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f21816b, this.f21817c);
                return;
            default:
                ((wy) this.d).Q(false, this.f21816b, this.f21817c);
                return;
        }
    }
}
