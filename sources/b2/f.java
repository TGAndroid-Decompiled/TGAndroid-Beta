package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.Components.i61;
public final class f extends VolumeProvider {
    public final q f2832a;

    public f(q qVar, int i7, int i10, int i11) {
        super(i7, i10, i11);
        this.f2832a = qVar;
    }

    @Override
    public final void onAdjustVolume(int i7) {
        q qVar = this.f2832a;
        ((s4.e) ((i61) qVar.f2242f).d).f57053a.post(new s4.c(qVar, i7, 1));
    }

    @Override
    public final void onSetVolumeTo(int i7) {
        q qVar = this.f2832a;
        ((s4.e) ((i61) qVar.f2242f).d).f57053a.post(new s4.c(qVar, i7, 0));
    }
}
