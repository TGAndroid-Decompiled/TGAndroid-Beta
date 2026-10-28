package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f21660a;
    public final VoIPService f21661b;
    public final int f21662c;

    public n0(VoIPService voIPService, int i10, int i11) {
        this.f21660a = i11;
        this.f21661b = voIPService;
        this.f21662c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f21661b.lambda$createGroupInstance$80(this.f21662c, i10, z10);
    }

    @Override
    public void run(long j10) {
        this.f21661b.lambda$createGroupInstance$79(this.f21662c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f21660a) {
            case 2:
                this.f21661b.lambda$createGroupInstance$75(this.f21662c, j10, j11, i10, i11);
                return;
            default:
                this.f21661b.lambda$createGroupInstance$77(this.f21662c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f21661b.lambda$createGroupInstance$70(this.f21662c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f21661b.lambda$createGroupInstance$68(this.f21662c, iArr, fArr, zArr);
    }
}
