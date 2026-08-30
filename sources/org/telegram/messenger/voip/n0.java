package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f18814a;
    public final VoIPService f18815b;
    public final int f18816c;

    public n0(VoIPService voIPService, int i10, int i11) {
        this.f18814a = i11;
        this.f18815b = voIPService;
        this.f18816c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z4) {
        this.f18815b.lambda$createGroupInstance$80(this.f18816c, i10, z4);
    }

    @Override
    public void run(long j10) {
        this.f18815b.lambda$createGroupInstance$79(this.f18816c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f18814a) {
            case 2:
                this.f18815b.lambda$createGroupInstance$75(this.f18816c, j10, j11, i10, i11);
                return;
            default:
                this.f18815b.lambda$createGroupInstance$77(this.f18816c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f18815b.lambda$createGroupInstance$70(this.f18816c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f18815b.lambda$createGroupInstance$68(this.f18816c, iArr, fArr, zArr);
    }
}
