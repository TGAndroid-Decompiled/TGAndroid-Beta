package org.telegram.messenger.voip;

public final class VoIPService$$ExternalSyntheticLambda121 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final int f$1;

    public VoIPService$$ExternalSyntheticLambda121(VoIPService voIPService, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = voIPService;
        this.f$1 = i;
    }

    @Override
    public void onStateUpdated(int i, boolean z) {
        this.f$0.lambda$createGroupInstance$80(this.f$1, i, z);
    }

    @Override
    public void run(long j) {
        this.f$0.lambda$createGroupInstance$79(this.f$1, j);
    }

    @Override
    public void run(long j, long j2, int i, int i2) {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.lambda$createGroupInstance$75(this.f$1, j, j2, i, i2);
                break;
            default:
                this.f$0.lambda$createGroupInstance$77(this.f$1, j, j2, i, i2);
                break;
        }
    }

    @Override
    public void run(long j, int[] iArr) {
        this.f$0.lambda$createGroupInstance$70(this.f$1, j, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f$0.lambda$createGroupInstance$68(this.f$1, iArr, fArr, zArr);
    }
}
