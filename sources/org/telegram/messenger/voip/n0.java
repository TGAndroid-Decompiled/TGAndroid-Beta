package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f19976a;
    public final VoIPService f19977b;
    public final int f19978c;

    public n0(VoIPService voIPService, int i10, int i11) {
        this.f19976a = i11;
        this.f19977b = voIPService;
        this.f19978c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f19977b.lambda$createGroupInstance$80(this.f19978c, i10, z10);
    }

    @Override
    public void run(long j10) {
        this.f19977b.lambda$createGroupInstance$79(this.f19978c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f19976a) {
            case 2:
                this.f19977b.lambda$createGroupInstance$75(this.f19978c, j10, j11, i10, i11);
                return;
            default:
                this.f19977b.lambda$createGroupInstance$77(this.f19978c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f19977b.lambda$createGroupInstance$70(this.f19978c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f19977b.lambda$createGroupInstance$68(this.f19978c, iArr, fArr, zArr);
    }
}
