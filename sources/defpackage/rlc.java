package defpackage;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
public final class rlc implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener, NativeInstance.BroadcastStateCallback {
    public final VoIPService a;

    public rlc(VoIPService voIPService) {
        this.a = voIPService;
    }

    @Override
    public final void onBroadcastStateChanged(boolean z, boolean z2) {
        this.a.lambda$createGroupInstance$77(z, z2);
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        this.a.lambda$initiateActualEncryptedCall$84(i, i2);
    }

    @Override
    public final void onSignalBarsUpdated(int i) {
        this.a.onSignalBarCountChanged(i);
    }

    @Override
    public final void onSignalingData(byte[] bArr) {
        this.a.onSignalingData(bArr);
    }

    @Override
    public final void onStateUpdated(int i, boolean z) {
        this.a.onConnectionStateChanged(i, z);
    }

    @Override
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.a.lambda$initiateActualEncryptedCall$82(iArr, fArr, zArr);
    }
}
