package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.mz;
public final class l implements Runnable {
    public final int f20341a;
    public final boolean f20342b;
    public final boolean f20343c;
    public final Object d;

    public l(Object obj, boolean z4, boolean z10, int i10) {
        this.f20341a = i10;
        this.d = obj;
        this.f20342b = z4;
        this.f20343c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20341a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f20342b, this.f20343c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f20342b, this.f20343c);
                return;
            case 2:
                VoipAudioManager.b((Utilities.Callback2) this.d, this.f20342b, this.f20343c);
                return;
            default:
                ((mz) this.d).R(false, this.f20342b, this.f20343c);
                return;
        }
    }
}
