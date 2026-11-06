package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import org.telegram.ui.hy0;
public final class f extends VolumeProvider {
    public final p f2912a;

    public f(p pVar, int i7, int i10, int i11) {
        super(i7, i10, i11);
        this.f2912a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i7) {
        p pVar = this.f2912a;
        ((s4.e) ((hy0) pVar.f2327f).d).f54671a.post(new s4.c(pVar, i7, 1));
    }

    @Override
    public final void onSetVolumeTo(int i7) {
        p pVar = this.f2912a;
        ((s4.e) ((hy0) pVar.f2327f).d).f54671a.post(new s4.c(pVar, i7, 0));
    }
}
