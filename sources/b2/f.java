package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.ld0;
public final class f extends VolumeProvider {
    public final q f2869a;

    public f(q qVar, int i7, int i10, int i11) {
        super(i7, i10, i11);
        this.f2869a = qVar;
    }

    @Override
    public final void onAdjustVolume(int i7) {
        q qVar = this.f2869a;
        ((s4.e) ((ld0) qVar.f2279f).d).f56353a.post(new s4.c(qVar, i7, 1));
    }

    @Override
    public final void onSetVolumeTo(int i7) {
        q qVar = this.f2869a;
        ((s4.e) ((ld0) qVar.f2279f).d).f56353a.post(new s4.c(qVar, i7, 0));
    }
}
