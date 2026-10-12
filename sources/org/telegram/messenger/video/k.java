package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.d00;
public final class k implements Runnable {
    public final int f19262a;
    public final boolean f19263b;
    public final boolean f19264c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f19262a = i10;
        this.d = obj;
        this.f19263b = z10;
        this.f19264c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19262a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f19263b, this.f19264c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f19263b, this.f19264c);
                return;
            case 2:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((Utilities.Callback2) this.d, this.f19263b, this.f19264c);
                return;
            default:
                ((d00) this.d).P(false, this.f19263b, this.f19264c);
                return;
        }
    }
}
