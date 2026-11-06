package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class m0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f26135a;
    public final VoIPService f26136b;
    public final int f26137c;

    public m0(VoIPService voIPService, int i7, int i10) {
        this.f26135a = i10;
        this.f26136b = voIPService;
        this.f26137c = i7;
    }

    @Override
    public void onStateUpdated(int i7, boolean z9) {
        this.f26136b.lambda$createGroupInstance$80(this.f26137c, i7, z9);
    }

    @Override
    public void run(long j3) {
        this.f26136b.lambda$createGroupInstance$79(this.f26137c, j3);
    }

    @Override
    public void run(long j3, long j10, int i7, int i10) {
        switch (this.f26135a) {
            case 2:
                this.f26136b.lambda$createGroupInstance$75(this.f26137c, j3, j10, i7, i10);
                return;
            default:
                this.f26136b.lambda$createGroupInstance$77(this.f26137c, j3, j10, i7, i10);
                return;
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        this.f26136b.lambda$createGroupInstance$70(this.f26137c, j3, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f26136b.lambda$createGroupInstance$68(this.f26137c, iArr, fArr, zArr);
    }
}
