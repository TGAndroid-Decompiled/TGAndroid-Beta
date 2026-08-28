package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class g0 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final VoIPService f21888a;

    public g0(VoIPService voIPService) {
        this.f21888a = voIPService;
    }

    @Override
    public void onMediaStateUpdated(int i9, int i10) {
        this.f21888a.lambda$initiateActualEncryptedCall$87(i9, i10);
    }

    @Override
    public void onSignalBarsUpdated(int i9) {
        this.f21888a.onSignalBarCountChanged(i9);
    }

    @Override
    public void onSignalingData(byte[] bArr) {
        this.f21888a.onSignalingData(bArr);
    }

    @Override
    public void onStateUpdated(int i9, boolean z10) {
        this.f21888a.onConnectionStateChanged(i9, z10);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f21888a.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
