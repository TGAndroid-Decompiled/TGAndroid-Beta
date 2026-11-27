package defpackage;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
public final class zlc implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, Instance.OnStateUpdatedListener {
    public final VoIPService a;
    public final int b;

    public zlc(VoIPService voIPService, int i) {
        this.a = voIPService;
        this.b = i;
    }

    @Override
    public final void onStateUpdated(int i, boolean z) {
        this.a.lambda$createGroupInstance$75(this.b, i, z);
    }

    @Override
    public final void run(long j, int[] iArr) {
        this.a.lambda$createGroupInstance$74(this.b, j, iArr);
    }

    @Override
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.a.lambda$createGroupInstance$72(this.b, iArr, fArr, zArr);
    }
}
