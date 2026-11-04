package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
public final class m0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final int f26034a;
    public final VoIPService f26035b;
    public final int f26036c;

    public m0(VoIPService voIPService, int i3, int i10) {
        this.f26034a = i10;
        this.f26035b = voIPService;
        this.f26036c = i3;
    }

    @Override
    public void onStateUpdated(int i3, boolean z10) {
        this.f26035b.lambda$createGroupInstance$80(this.f26036c, i3, z10);
    }

    @Override
    public void run(long j10) {
        this.f26035b.lambda$createGroupInstance$79(this.f26036c, j10);
    }

    @Override
    public void run(long j10, long j11, int i3, int i10) {
        switch (this.f26034a) {
            case 2:
                this.f26035b.lambda$createGroupInstance$75(this.f26036c, j10, j11, i3, i10);
                return;
            default:
                this.f26035b.lambda$createGroupInstance$77(this.f26036c, j10, j11, i3, i10);
                return;
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        this.f26035b.lambda$createGroupInstance$70(this.f26036c, j10, iArr);
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.f26035b.lambda$createGroupInstance$68(this.f26036c, iArr, fArr, zArr);
    }
}
