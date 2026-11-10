package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class m0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f26153a;
    public final VoIPService f26154b;
    public final int f26155c;

    public m0(VoIPService voIPService, int i7, int i10) {
        this.f26153a = i10;
        this.f26154b = voIPService;
        this.f26155c = i7;
    }

    @Override
    public void onStateUpdated(int i7, boolean z9) {
        this.f26154b.lambda$createGroupInstance$80(this.f26155c, i7, z9);
    }

    @Override
    public void run(long j3) {
        this.f26154b.lambda$createGroupInstance$79(this.f26155c, j3);
    }

    @Override
    public void run(long j3, long j10, int i7, int i10) {
        switch (this.f26153a) {
            case 2:
                this.f26154b.lambda$createGroupInstance$75(this.f26155c, j3, j10, i7, i10);
                return;
            default:
                this.f26154b.lambda$createGroupInstance$77(this.f26155c, j3, j10, i7, i10);
                return;
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        this.f26154b.lambda$createGroupInstance$70(this.f26155c, j3, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f26154b.lambda$createGroupInstance$68(this.f26155c, iArr, fArr, zArr);
    }
}
