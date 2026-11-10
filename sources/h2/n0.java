package h2;

import org.telegram.messenger.v10;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.gy;
public final class n0 implements Runnable {
    public final int f14126a;
    public final boolean f14127b;
    public final boolean f14128c;
    public final Object d;

    public n0(Object obj, boolean z9, boolean z10, int i7) {
        this.f14126a = i7;
        this.d = obj;
        this.f14127b = z9;
        this.f14128c = z10;
    }

    @Override
    public final void run() {
        switch (this.f14126a) {
            case 0:
                wf.b.w((wf.b) ((p0) this.d).d, this.f14127b, this.f14128c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f14127b, this.f14128c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f14127b, this.f14128c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((v10) this.d, this.f14127b, this.f14128c);
                return;
            default:
                ((gy) this.d).P(false, this.f14127b, this.f14128c);
                return;
        }
    }
}
