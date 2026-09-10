package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class l0 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final VoIPService f16752a;

    public l0(VoIPService voIPService) {
        this.f16752a = voIPService;
    }

    @Override
    public void onMediaStateUpdated(int i10, int i11) {
        this.f16752a.lambda$initiateActualEncryptedCall$87(i10, i11);
    }

    @Override
    public void onSignalBarsUpdated(int i10) {
        this.f16752a.onSignalBarCountChanged(i10);
    }

    @Override
    public void onSignalingData(byte[] bArr) {
        this.f16752a.onSignalingData(bArr);
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f16752a.onConnectionStateChanged(i10, z10);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f16752a.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
