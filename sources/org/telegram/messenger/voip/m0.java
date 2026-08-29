package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class m0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f21982a;
    public final VoIPService f21983b;
    public final int f21984c;

    public m0(VoIPService voIPService, int i10, int i11) {
        this.f21982a = i11;
        this.f21983b = voIPService;
        this.f21984c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f21983b.lambda$createGroupInstance$80(this.f21984c, i10, z10);
    }

    @Override
    public void run(long j10) {
        this.f21983b.lambda$createGroupInstance$79(this.f21984c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f21982a) {
            case 2:
                this.f21983b.lambda$createGroupInstance$75(this.f21984c, j10, j11, i10, i11);
                return;
            default:
                this.f21983b.lambda$createGroupInstance$77(this.f21984c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f21983b.lambda$createGroupInstance$70(this.f21984c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f21983b.lambda$createGroupInstance$68(this.f21984c, iArr, fArr, zArr);
    }
}
