package e2;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.wz;
public final class n0 implements Runnable {
    public final int f8383a;
    public final boolean f8384b;
    public final boolean f8385c;
    public final Object d;

    public n0(Object obj, boolean z10, boolean z11, int i10) {
        this.f8383a = i10;
        this.d = obj;
        this.f8384b = z10;
        this.f8385c = z11;
    }

    @Override
    public final void run() {
        switch (this.f8383a) {
            case 0:
                qf.b.s((qf.b) ((ac.a) this.d).f479c, this.f8384b, this.f8385c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f8384b, this.f8385c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f8384b, this.f8385c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((Utilities.Callback2) this.d, this.f8384b, this.f8385c);
                return;
            default:
                ((wz) this.d).P(false, this.f8384b, this.f8385c);
                return;
        }
    }
}
