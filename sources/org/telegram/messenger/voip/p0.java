package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class p0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f19600a;
    public final VoIPService f19601b;
    public final int f19602c;

    public p0(VoIPService voIPService, int i10, int i11) {
        this.f19600a = i11;
        this.f19601b = voIPService;
        this.f19602c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f19601b.lambda$createGroupInstance$80(this.f19602c, i10, z10);
    }

    @Override
    public void run(long j3) {
        this.f19601b.lambda$createGroupInstance$79(this.f19602c, j3);
    }

    @Override
    public void run(long j3, long j10, int i10, int i11) {
        switch (this.f19600a) {
            case 2:
                this.f19601b.lambda$createGroupInstance$75(this.f19602c, j3, j10, i10, i11);
                return;
            default:
                this.f19601b.lambda$createGroupInstance$77(this.f19602c, j3, j10, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        this.f19601b.lambda$createGroupInstance$70(this.f19602c, j3, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f19601b.lambda$createGroupInstance$68(this.f19602c, iArr, fArr, zArr);
    }
}
