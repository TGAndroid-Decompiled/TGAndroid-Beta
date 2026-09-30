package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class p0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f17945a;
    public final VoIPService f17946b;
    public final int f17947c;

    public p0(VoIPService voIPService, int i10, int i11) {
        this.f17945a = i11;
        this.f17946b = voIPService;
        this.f17947c = i10;
    }

    @Override
    public void onStateUpdated(int i10, boolean z10) {
        this.f17946b.lambda$createGroupInstance$80(this.f17947c, i10, z10);
    }

    @Override
    public void run(long j3) {
        this.f17946b.lambda$createGroupInstance$79(this.f17947c, j3);
    }

    @Override
    public void run(long j3, long j10, int i10, int i11) {
        switch (this.f17945a) {
            case 2:
                this.f17946b.lambda$createGroupInstance$75(this.f17947c, j3, j10, i10, i11);
                return;
            default:
                this.f17946b.lambda$createGroupInstance$77(this.f17947c, j3, j10, i10, i11);
                return;
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        this.f17946b.lambda$createGroupInstance$70(this.f17947c, j3, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f17946b.lambda$createGroupInstance$68(this.f17947c, iArr, fArr, zArr);
    }
}
