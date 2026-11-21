package h2;

import org.telegram.messenger.q10;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.ty;
public final class m0 implements Runnable {
    public final int f13822a;
    public final boolean f13823b;
    public final boolean f13824c;
    public final Object d;

    public m0(Object obj, boolean z10, boolean z11, int i7) {
        this.f13822a = i7;
        this.d = obj;
        this.f13823b = z10;
        this.f13824c = z11;
    }

    @Override
    public final void run() {
        switch (this.f13822a) {
            case 0:
                wf.b.p((wf.b) ((o0) this.d).d, this.f13823b, this.f13824c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f13823b, this.f13824c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f13823b, this.f13824c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((q10) this.d, this.f13823b, this.f13824c);
                return;
            default:
                ((ty) this.d).Q(false, this.f13823b, this.f13824c);
                return;
        }
    }
}
