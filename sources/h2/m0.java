package h2;

import org.telegram.messenger.q10;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.ry;
public final class m0 implements Runnable {
    public final int f13793a;
    public final boolean f13794b;
    public final boolean f13795c;
    public final Object d;

    public m0(Object obj, boolean z10, boolean z11, int i7) {
        this.f13793a = i7;
        this.d = obj;
        this.f13794b = z10;
        this.f13795c = z11;
    }

    @Override
    public final void run() {
        switch (this.f13793a) {
            case 0:
                wf.b.p((wf.b) ((o0) this.d).d, this.f13794b, this.f13795c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f13794b, this.f13795c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f13794b, this.f13795c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((q10) this.d, this.f13794b, this.f13795c);
                return;
            default:
                ((ry) this.d).Q(false, this.f13794b, this.f13795c);
                return;
        }
    }
}
