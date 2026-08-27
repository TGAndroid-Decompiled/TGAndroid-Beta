package org.telegram.messenger.voip;

public final class m0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {

    public final int f21942a;

    public final VoIPService f21943b;

    public final int f21944c;

    public m0(VoIPService voIPService, int i10, int i11) {
        this.f21942a = i11;
        this.f21943b = voIPService;
        this.f21944c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f21943b.lambda$createGroupInstance$80(this.f21944c, i10, z10);
    }

    @Override
    public void run(long j10) {
        this.f21943b.lambda$createGroupInstance$79(this.f21944c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f21942a) {
            case 2:
                this.f21943b.lambda$createGroupInstance$75(this.f21944c, j10, j11, i10, i11);
                break;
            default:
                this.f21943b.lambda$createGroupInstance$77(this.f21944c, j10, j11, i10, i11);
                break;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f21943b.lambda$createGroupInstance$70(this.f21944c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f21943b.lambda$createGroupInstance$68(this.f21944c, iArr, fArr, zArr);
    }
}
