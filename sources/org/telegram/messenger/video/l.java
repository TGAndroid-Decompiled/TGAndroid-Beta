package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.mz;
public final class l implements Runnable {
    public final int f20343a;
    public final boolean f20344b;
    public final boolean f20345c;
    public final Object d;

    public l(Object obj, boolean z4, boolean z10, int i10) {
        this.f20343a = i10;
        this.d = obj;
        this.f20344b = z4;
        this.f20345c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20343a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f20344b, this.f20345c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f20344b, this.f20345c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f20344b, this.f20345c);
                return;
            default:
                ((mz) this.d).R(false, this.f20344b, this.f20345c);
                return;
        }
    }
}
