package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class g0 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final VoIPService f26006a;

    public g0(VoIPService voIPService) {
        this.f26006a = voIPService;
    }

    @Override
    public void onMediaStateUpdated(int i3, int i10) {
        this.f26006a.lambda$initiateActualEncryptedCall$87(i3, i10);
    }

    @Override
    public void onSignalBarsUpdated(int i3) {
        this.f26006a.onSignalBarCountChanged(i3);
    }

    @Override
    public void onSignalingData(byte[] bArr) {
        this.f26006a.onSignalingData(bArr);
    }

    @Override
    public void onStateUpdated(int i3, boolean z10) {
        this.f26006a.onConnectionStateChanged(i3, z10);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f26006a.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
