package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f27529a;
    public final VoIPService f27530b;
    public final int f27531c;

    public n0(VoIPService voIPService, int i7, int i10) {
        this.f27529a = i10;
        this.f27530b = voIPService;
        this.f27531c = i7;
    }

    @Override
    public void onStateUpdated(int i7, boolean z10) {
        this.f27530b.lambda$createGroupInstance$80(this.f27531c, i7, z10);
    }

    @Override
    public void run(long j3) {
        this.f27530b.lambda$createGroupInstance$79(this.f27531c, j3);
    }

    @Override
    public void run(long j3, long j10, int i7, int i10) {
        switch (this.f27529a) {
            case 2:
                this.f27530b.lambda$createGroupInstance$75(this.f27531c, j3, j10, i7, i10);
                return;
            default:
                this.f27530b.lambda$createGroupInstance$77(this.f27531c, j3, j10, i7, i10);
                return;
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        this.f27530b.lambda$createGroupInstance$70(this.f27531c, j3, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f27530b.lambda$createGroupInstance$68(this.f27531c, iArr, fArr, zArr);
    }
}
