package h2;

import org.telegram.messenger.r10;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.ty;
public final class m0 implements Runnable {
    public final int f13825a;
    public final boolean f13826b;
    public final boolean f13827c;
    public final Object d;

    public m0(Object obj, boolean z10, boolean z11, int i7) {
        this.f13825a = i7;
        this.d = obj;
        this.f13826b = z10;
        this.f13827c = z11;
    }

    @Override
    public final void run() {
        switch (this.f13825a) {
            case 0:
                wf.b.p((wf.b) ((o0) this.d).d, this.f13826b, this.f13827c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f13826b, this.f13827c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f13826b, this.f13827c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((r10) this.d, this.f13826b, this.f13827c);
                return;
            default:
                ((ty) this.d).Q(false, this.f13826b, this.f13827c);
                return;
        }
    }
}
