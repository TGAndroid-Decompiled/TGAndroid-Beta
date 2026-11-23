package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.Components.i61;
public final class e extends VolumeProvider {
    public final q f2831a;

    public e(q qVar, int i7, int i10, int i11, String str) {
        super(i7, i10, i11, str);
        this.f2831a = qVar;
    }

    @Override
    public final void onAdjustVolume(int i7) {
        q qVar = this.f2831a;
        ((s4.e) ((i61) qVar.f2242f).d).f57053a.post(new s4.c(qVar, i7, 1));
    }

    @Override
    public final void onSetVolumeTo(int i7) {
        q qVar = this.f2831a;
        ((s4.e) ((i61) qVar.f2242f).d).f57053a.post(new s4.c(qVar, i7, 0));
    }
}
