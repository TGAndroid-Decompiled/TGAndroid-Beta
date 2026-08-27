package org.telegram.messenger.voip;

public final class g0 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {

    public final VoIPService f21912a;

    public g0(VoIPService voIPService) {
        this.f21912a = voIPService;
    }

    @Override
    public void onMediaStateUpdated(int i10, int i11) {
        this.f21912a.lambda$initiateActualEncryptedCall$87(i10, i11);
    }

    @Override
    public void onSignalBarsUpdated(int i10) {
        this.f21912a.onSignalBarCountChanged(i10);
    }

    @Override
    public void onSignalingData(byte[] bArr) {
        this.f21912a.onSignalingData(bArr);
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f21912a.onConnectionStateChanged(i10, z10);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f21912a.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
