package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f19893a;
    public final VoIPService f19894b;
    public final int f19895c;

    public n0(VoIPService voIPService, int i10, int i11) {
        this.f19893a = i11;
        this.f19894b = voIPService;
        this.f19895c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f19894b.lambda$createGroupInstance$80(this.f19895c, i10, z10);
    }

    @Override
    public void run(long j10) {
        this.f19894b.lambda$createGroupInstance$79(this.f19895c, j10);
    }

    @Override
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.f19893a) {
            case 2:
                this.f19894b.lambda$createGroupInstance$75(this.f19895c, j10, j11, i10, i11);
                return;
            default:
                this.f19894b.lambda$createGroupInstance$77(this.f19895c, j10, j11, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f19894b.lambda$createGroupInstance$70(this.f19895c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f19894b.lambda$createGroupInstance$68(this.f19895c, iArr, fArr, zArr);
    }
}
