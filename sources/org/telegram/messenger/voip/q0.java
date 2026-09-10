package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class q0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f16774a;
    public final VoIPService f16775b;
    public final int f16776c;

    public q0(VoIPService voIPService, int i10, int i11) {
        this.f16774a = i11;
        this.f16775b = voIPService;
        this.f16776c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f16775b.lambda$createGroupInstance$80(this.f16776c, i10, z10);
    }

    @Override
    public void run(long j3) {
        this.f16775b.lambda$createGroupInstance$79(this.f16776c, j3);
    }

    @Override
    public void run(long j3, long j10, int i10, int i11) {
        switch (this.f16774a) {
            case 2:
                this.f16775b.lambda$createGroupInstance$75(this.f16776c, j3, j10, i10, i11);
                return;
            default:
                this.f16775b.lambda$createGroupInstance$77(this.f16776c, j3, j10, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        this.f16775b.lambda$createGroupInstance$70(this.f16776c, j3, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f16775b.lambda$createGroupInstance$68(this.f16776c, iArr, fArr, zArr);
    }
}
