package e2;

import org.telegram.messenger.k20;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.vy;
public final class m0 implements Runnable {
    public final int f6174a;
    public final boolean f6175b;
    public final boolean f6176c;
    public final Object d;

    public m0(Object obj, boolean z10, boolean z11, int i10) {
        this.f6174a = i10;
        this.d = obj;
        this.f6175b = z10;
        this.f6176c = z11;
    }

    @Override
    public final void run() {
        switch (this.f6174a) {
            case 0:
                hf.b.J((hf.b) ((o0) this.d).f6184c, this.f6175b, this.f6176c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f6175b, this.f6176c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f6175b, this.f6176c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((k20) this.d, this.f6175b, this.f6176c);
                return;
            default:
                ((vy) this.d).Q(false, this.f6175b, this.f6176c);
                return;
        }
    }
}
