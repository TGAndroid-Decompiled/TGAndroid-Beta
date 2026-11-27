package defpackage;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
public final class mz3 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public mz3(Object obj, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((o24) obj).O(false, z2, z);
                return;
            case 1:
                ((NativeInstance) obj).lambda$onNetworkStateUpdated$0(z2, z);
                return;
            case 2:
                ((VideoPlayerHolderBase) obj).lambda$setAudioEnabled$8(z2, z);
                return;
            case 3:
                ((VoIPService) obj).lambda$createGroupInstance$76(z2, z);
                return;
            case 4:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((icc) obj, z2, z);
                return;
            default:
                ((zhc) ((qoc) obj).c).d(z2, z);
                return;
        }
    }
}
