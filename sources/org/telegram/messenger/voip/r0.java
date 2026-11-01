package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class r0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f18858a;
    public final VoIPService f18859b;
    public final int f18860c;

    public r0(VoIPService voIPService, int i10, int i11) {
        this.f18858a = i11;
        this.f18859b = voIPService;
        this.f18860c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f18859b.lambda$createGroupInstance$80(this.f18860c, i10, z10);
    }

    @Override
    public void run(long j10) {
        this.f18859b.lambda$createGroupInstance$79(this.f18860c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f18858a) {
            case 2:
                this.f18859b.lambda$createGroupInstance$75(this.f18860c, j10, j11, i10, i11);
                return;
            default:
                this.f18859b.lambda$createGroupInstance$77(this.f18860c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f18859b.lambda$createGroupInstance$70(this.f18860c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f18859b.lambda$createGroupInstance$68(this.f18860c, iArr, fArr, zArr);
    }
}
