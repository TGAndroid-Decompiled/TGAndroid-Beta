package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class m0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f21918a;
    public final VoIPService f21919b;
    public final int f21920c;

    public m0(VoIPService voIPService, int i9, int i10) {
        this.f21918a = i10;
        this.f21919b = voIPService;
        this.f21920c = i9;
    }

    @Override
    public void onStateUpdated(int i9, boolean z10) {
        this.f21919b.lambda$createGroupInstance$80(this.f21920c, i9, z10);
    }

    @Override
    public void run(long j10) {
        this.f21919b.lambda$createGroupInstance$79(this.f21920c, j10);
    }

    @Override
    public void run(long j10, long j11, int i9, int i10) {
        switch (this.f21918a) {
            case 2:
                this.f21919b.lambda$createGroupInstance$75(this.f21920c, j10, j11, i9, i10);
                return;
            default:
                this.f21919b.lambda$createGroupInstance$77(this.f21920c, j10, j11, i9, i10);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f21919b.lambda$createGroupInstance$70(this.f21920c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f21919b.lambda$createGroupInstance$68(this.f21920c, iArr, fArr, zArr);
    }
}
