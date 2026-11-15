package h2;

import org.telegram.messenger.s10;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.ly;
public final class m0 implements Runnable {
    public final int f13481a;
    public final boolean f13482b;
    public final boolean f13483c;
    public final Object d;

    public m0(Object obj, boolean z10, boolean z11, int i7) {
        this.f13481a = i7;
        this.d = obj;
        this.f13482b = z10;
        this.f13483c = z11;
    }

    @Override
    public final void run() {
        switch (this.f13481a) {
            case 0:
                wf.b.o((wf.b) ((o0) this.d).d, this.f13482b, this.f13483c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f13482b, this.f13483c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f13482b, this.f13483c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((s10) this.d, this.f13482b, this.f13483c);
                return;
            default:
                ((ly) this.d).Q(false, this.f13482b, this.f13483c);
                return;
        }
    }
}
