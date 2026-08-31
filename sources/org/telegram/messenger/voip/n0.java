package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f20445a;
    public final VoIPService f20446b;
    public final int f20447c;

    public n0(VoIPService voIPService, int i10, int i11) {
        this.f20445a = i11;
        this.f20446b = voIPService;
        this.f20447c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z4) {
        this.f20446b.lambda$createGroupInstance$80(this.f20447c, i10, z4);
    }

    @Override
    public void run(long j10) {
        this.f20446b.lambda$createGroupInstance$79(this.f20447c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f20445a) {
            case 2:
                this.f20446b.lambda$createGroupInstance$75(this.f20447c, j10, j11, i10, i11);
                return;
            default:
                this.f20446b.lambda$createGroupInstance$77(this.f20447c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f20446b.lambda$createGroupInstance$70(this.f20447c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f20446b.lambda$createGroupInstance$68(this.f20447c, iArr, fArr, zArr);
    }
}
