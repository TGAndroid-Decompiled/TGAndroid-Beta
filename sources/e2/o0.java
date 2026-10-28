package e2;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.sz;
public final class o0 implements Runnable {
    public final int f9700a;
    public final boolean f9701b;
    public final boolean f9702c;
    public final Object d;

    public o0(Object obj, boolean z10, boolean z11, int i10) {
        this.f9700a = i10;
        this.d = obj;
        this.f9701b = z10;
        this.f9702c = z11;
    }

    @Override
    public final void run() {
        switch (this.f9700a) {
            case 0:
                n4.s.c((n4.s) ((bc.a) this.d).f3837c, this.f9701b, this.f9702c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f9701b, this.f9702c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f9701b, this.f9702c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((Utilities.Callback2) this.d, this.f9701b, this.f9702c);
                return;
            default:
                ((sz) this.d).Q(false, this.f9701b, this.f9702c);
                return;
        }
    }
}
