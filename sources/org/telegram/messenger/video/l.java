package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.b00;
public final class l implements Runnable {
    public final int f19485a;
    public final boolean f19486b;
    public final boolean f19487c;
    public final Object d;

    public l(Object obj, boolean z10, boolean z11, int i10) {
        this.f19485a = i10;
        this.d = obj;
        this.f19486b = z10;
        this.f19487c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19485a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f19486b, this.f19487c);
                return;
            case 1:
                NativeInstance.d((NativeInstance) this.d, this.f19486b, this.f19487c);
                return;
            case 2:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((Utilities.Callback2) this.d, this.f19486b, this.f19487c);
                return;
            default:
                ((b00) this.d).P(false, this.f19486b, this.f19487c);
                return;
        }
    }
}
