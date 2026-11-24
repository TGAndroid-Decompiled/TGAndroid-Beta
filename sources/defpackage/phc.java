package defpackage;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
public final class phc implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, NativeInstance.BroadcastStateCallback, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final VoIPService a;

    public phc(VoIPService voIPService) {
        this.a = voIPService;
    }

    @Override
    public final void onBroadcastStateChanged(boolean z, boolean z2) {
        this.a.lambda$createGroupInstance$76(z, z2);
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        this.a.lambda$initiateActualEncryptedCall$83(i, i2);
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
        this.a.lambda$initiateActualEncryptedCall$81(iArr, fArr, zArr);
    }
}
