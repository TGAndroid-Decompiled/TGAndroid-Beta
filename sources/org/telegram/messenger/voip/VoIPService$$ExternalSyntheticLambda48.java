package org.telegram.messenger.voip;

public final class VoIPService$$ExternalSyntheticLambda48 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final VoIPService f$0;

    public VoIPService$$ExternalSyntheticLambda48(VoIPService voIPService) {
        this.f$0 = voIPService;
    }

    @Override
    public void onMediaStateUpdated(int i, int i2) {
        this.f$0.lambda$initiateActualEncryptedCall$87(i, i2);
    }

    @Override
    public void onSignalBarsUpdated(int i) {
        this.f$0.onSignalBarCountChanged(i);
    }

    @Override
    public void onSignalingData(byte[] bArr) {
        this.f$0.onSignalingData(bArr);
    }

    @Override
    public void onStateUpdated(int i, boolean z) {
        this.f$0.onConnectionStateChanged(i, z);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f$0.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
