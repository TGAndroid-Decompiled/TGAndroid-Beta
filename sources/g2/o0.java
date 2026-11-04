package g2;

import org.telegram.messenger.n10;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.ey;
public final class o0 implements Runnable {
    public final int f11885a;
    public final boolean f11886b;
    public final boolean f11887c;
    public final Object d;

    public o0(Object obj, boolean z10, boolean z11, int i3) {
        this.f11885a = i3;
        this.d = obj;
        this.f11886b = z10;
        this.f11887c = z11;
    }

    @Override
    public final void run() {
        switch (this.f11885a) {
            case 0:
                p4.q.c((p4.q) ((q0) this.d).d, this.f11886b, this.f11887c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f11886b, this.f11887c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f11886b, this.f11887c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((n10) this.d, this.f11886b, this.f11887c);
                return;
            default:
                ((ey) this.d).P(false, this.f11886b, this.f11887c);
                return;
        }
    }
}
