package org.telegram.messenger.video;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.yy;

public final class k implements Runnable {

    public final int f21851a;

    public final boolean f21852b;

    public final boolean f21853c;
    public final Object d;

    public k(Object obj, boolean z10, boolean z11, int i10) {
        this.f21851a = i10;
        this.d = obj;
        this.f21852b = z10;
        this.f21853c = z11;
    }

    @Override
    public final void run() {
        switch (this.f21851a) {
            case 0:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f21852b, this.f21853c);
                break;
            case 1:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f21852b, this.f21853c);
                break;
            case 2:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$1((Utilities.Callback2) this.d, this.f21852b, this.f21853c);
                break;
            default:
                ((yy) this.d).R(false, this.f21852b, this.f21853c);
                break;
        }
    }
}
