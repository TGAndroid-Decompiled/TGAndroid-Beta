package e2;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.rz;
public final class n0 implements Runnable {
    public final int f8270a;
    public final boolean f8271b;
    public final boolean f8272c;
    public final Object d;

    public n0(Object obj, boolean z10, boolean z11, int i10) {
        this.f8270a = i10;
        this.d = obj;
        this.f8271b = z10;
        this.f8272c = z11;
    }

    @Override
    public final void run() {
        switch (this.f8270a) {
            case 0:
                qf.b.o((qf.b) ((ac.a) this.d).f481c, this.f8271b, this.f8272c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f8271b, this.f8272c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f8271b, this.f8272c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((Utilities.Callback2) this.d, this.f8271b, this.f8272c);
                return;
            default:
                ((rz) this.d).P(false, this.f8271b, this.f8272c);
                return;
        }
    }
}
