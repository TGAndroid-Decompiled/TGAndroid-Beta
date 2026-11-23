package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.md0;
public final class f extends VolumeProvider {
    public final q f2880a;

    public f(q qVar, int i7, int i10, int i11) {
        super(i7, i10, i11);
        this.f2880a = qVar;
    }

    @Override
    public final void onAdjustVolume(int i7) {
        q qVar = this.f2880a;
        ((s4.e) ((md0) qVar.f2290f).d).f56972a.post(new s4.c(qVar, i7, 1));
    }

    @Override
    public final void onSetVolumeTo(int i7) {
        q qVar = this.f2880a;
        ((s4.e) ((md0) qVar.f2290f).d).f56972a.post(new s4.c(qVar, i7, 0));
    }
}
