package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.nz;
public final class k implements Runnable {
    public final int f19474a;
    public final boolean f19475b;
    public final boolean f19476c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f19474a = i10;
        this.d = obj;
        this.f19475b = z10;
        this.f19476c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19474a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f19475b, this.f19476c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f19475b, this.f19476c);
                return;
            case 2:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((Utilities.Callback2) this.d, this.f19475b, this.f19476c);
                return;
            default:
                ((nz) this.d).N(false, this.f19475b, this.f19476c);
                return;
        }
    }
}
