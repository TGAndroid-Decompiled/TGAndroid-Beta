package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class i0 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final VoIPService f18774a;

    public i0(VoIPService voIPService) {
        this.f18774a = voIPService;
    }

    @Override
    public void onMediaStateUpdated(int i10, int i11) {
        this.f18774a.lambda$initiateActualEncryptedCall$87(i10, i11);
    }

    @Override
    public void onSignalBarsUpdated(int i10) {
        this.f18774a.onSignalBarCountChanged(i10);
    }

    @Override
    public void onSignalingData(byte[] bArr) {
        this.f18774a.onSignalingData(bArr);
    }

    @Override
    public void onStateUpdated(int i10, boolean z4) {
        this.f18774a.onConnectionStateChanged(i10, z4);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f18774a.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
