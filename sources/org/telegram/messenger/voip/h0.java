package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class h0 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final VoIPService f26112a;

    public h0(VoIPService voIPService) {
        this.f26112a = voIPService;
    }

    @Override
    public void onMediaStateUpdated(int i7, int i10) {
        this.f26112a.lambda$initiateActualEncryptedCall$87(i7, i10);
    }

    @Override
    public void onSignalBarsUpdated(int i7) {
        this.f26112a.onSignalBarCountChanged(i7);
    }

    @Override
    public void onSignalingData(byte[] bArr) {
        this.f26112a.onSignalingData(bArr);
    }

    @Override
    public void onStateUpdated(int i7, boolean z9) {
        this.f26112a.onConnectionStateChanged(i7, z9);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f26112a.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
