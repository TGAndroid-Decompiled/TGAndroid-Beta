package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class q0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f18850a;
    public final VoIPService f18851b;
    public final int f18852c;

    public q0(VoIPService voIPService, int i10, int i11) {
        this.f18850a = i11;
        this.f18851b = voIPService;
        this.f18852c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f18851b.lambda$createGroupInstance$80(this.f18852c, i10, z10);
    }

    @Override
    public void run(long j10) {
        this.f18851b.lambda$createGroupInstance$79(this.f18852c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f18850a) {
            case 2:
                this.f18851b.lambda$createGroupInstance$75(this.f18852c, j10, j11, i10, i11);
                return;
            default:
                this.f18851b.lambda$createGroupInstance$77(this.f18852c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f18851b.lambda$createGroupInstance$70(this.f18852c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f18851b.lambda$createGroupInstance$68(this.f18852c, iArr, fArr, zArr);
    }
}
