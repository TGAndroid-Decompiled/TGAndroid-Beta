package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class o0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f19903a;
    public final VoIPService f19904b;
    public final int f19905c;

    public o0(VoIPService voIPService, int i10, int i11) {
        this.f19903a = i11;
        this.f19904b = voIPService;
        this.f19905c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f19904b.lambda$createGroupInstance$80(this.f19905c, i10, z10);
    }

    @Override
    public void run(long j10) {
        this.f19904b.lambda$createGroupInstance$79(this.f19905c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f19903a) {
            case 2:
                this.f19904b.lambda$createGroupInstance$75(this.f19905c, j10, j11, i10, i11);
                return;
            default:
                this.f19904b.lambda$createGroupInstance$77(this.f19905c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f19904b.lambda$createGroupInstance$70(this.f19905c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f19904b.lambda$createGroupInstance$68(this.f19905c, iArr, fArr, zArr);
    }
}
