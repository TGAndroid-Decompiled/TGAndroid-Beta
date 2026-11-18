package h2;

import org.telegram.messenger.q10;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.ry;
public final class m0 implements Runnable {
    public final int f13796a;
    public final boolean f13797b;
    public final boolean f13798c;
    public final Object d;

    public m0(Object obj, boolean z10, boolean z11, int i7) {
        this.f13796a = i7;
        this.d = obj;
        this.f13797b = z10;
        this.f13798c = z11;
    }

    @Override
    public final void run() {
        switch (this.f13796a) {
            case 0:
                wf.b.p((wf.b) ((o0) this.d).d, this.f13797b, this.f13798c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f13797b, this.f13798c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f13797b, this.f13798c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((q10) this.d, this.f13797b, this.f13798c);
                return;
            default:
                ((ry) this.d).Q(false, this.f13797b, this.f13798c);
                return;
        }
    }
}
