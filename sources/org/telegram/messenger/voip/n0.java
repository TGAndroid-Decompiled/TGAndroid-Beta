package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f19896a;
    public final VoIPService f19897b;
    public final int f19898c;

    public n0(VoIPService voIPService, int i10, int i11) {
        this.f19896a = i11;
        this.f19897b = voIPService;
        this.f19898c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f19897b.lambda$createGroupInstance$80(this.f19898c, i10, z10);
    }

    @Override
    public void run(long j10) {
        this.f19897b.lambda$createGroupInstance$79(this.f19898c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f19896a) {
            case 2:
                this.f19897b.lambda$createGroupInstance$75(this.f19898c, j10, j11, i10, i11);
                return;
            default:
                this.f19897b.lambda$createGroupInstance$77(this.f19898c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f19897b.lambda$createGroupInstance$70(this.f19898c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f19897b.lambda$createGroupInstance$68(this.f19898c, iArr, fArr, zArr);
    }
}
