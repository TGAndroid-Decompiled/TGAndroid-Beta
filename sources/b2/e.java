package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.md0;
public final class e extends VolumeProvider {
    public final q f2879a;

    public e(q qVar, int i7, int i10, int i11, String str) {
        super(i7, i10, i11, str);
        this.f2879a = qVar;
    }

    @Override
    public final void onAdjustVolume(int i7) {
        q qVar = this.f2879a;
        ((s4.e) ((md0) qVar.f2290f).d).f56972a.post(new s4.c(qVar, i7, 1));
    }

    @Override
    public final void onSetVolumeTo(int i7) {
        q qVar = this.f2879a;
        ((s4.e) ((md0) qVar.f2290f).d).f56972a.post(new s4.c(qVar, i7, 0));
    }
}
