package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f19394a;
    public final VoIPService f19395b;
    public final int f19396c;

    public n0(VoIPService voIPService, int i10, int i11) {
        this.f19394a = i11;
        this.f19395b = voIPService;
        this.f19396c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f19395b.lambda$createGroupInstance$80(this.f19396c, i10, z10);
    }

    @Override
    public void run(long j3) {
        this.f19395b.lambda$createGroupInstance$79(this.f19396c, j3);
    }

    @Override
    public void run(long j3, long j10, int i10, int i11) {
        switch (this.f19394a) {
            case 2:
                this.f19395b.lambda$createGroupInstance$75(this.f19396c, j3, j10, i10, i11);
                return;
            default:
                this.f19395b.lambda$createGroupInstance$77(this.f19396c, j3, j10, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        this.f19395b.lambda$createGroupInstance$70(this.f19396c, j3, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f19395b.lambda$createGroupInstance$68(this.f19396c, iArr, fArr, zArr);
    }
}
