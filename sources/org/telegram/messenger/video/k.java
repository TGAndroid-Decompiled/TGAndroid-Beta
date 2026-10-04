package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.nz;
public final class k implements Runnable {
    public final int f19467a;
    public final boolean f19468b;
    public final boolean f19469c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f19467a = i10;
        this.d = obj;
        this.f19468b = z10;
        this.f19469c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19467a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f19468b, this.f19469c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f19468b, this.f19469c);
                return;
            case 2:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((Utilities.Callback2) this.d, this.f19468b, this.f19469c);
                return;
            default:
                ((nz) this.d).N(false, this.f19468b, this.f19469c);
                return;
        }
    }
}
