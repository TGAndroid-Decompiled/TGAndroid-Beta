package e2;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.tz;
public final class n0 implements Runnable {
    public final int f8265a;
    public final boolean f8266b;
    public final boolean f8267c;
    public final Object d;

    public n0(Object obj, boolean z10, boolean z11, int i10) {
        this.f8265a = i10;
        this.d = obj;
        this.f8266b = z10;
        this.f8267c = z11;
    }

    @Override
    public final void run() {
        switch (this.f8265a) {
            case 0:
                qf.b.y((qf.b) ((ac.a) this.d).f481c, this.f8266b, this.f8267c);
                return;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.f8266b, this.f8267c);
                return;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.f8266b, this.f8267c);
                return;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((Utilities.Callback2) this.d, this.f8266b, this.f8267c);
                return;
            default:
                ((tz) this.d).P(false, this.f8266b, this.f8267c);
                return;
        }
    }
}
