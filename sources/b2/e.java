package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import org.telegram.ui.ly0;
public final class e extends VolumeProvider {
    public final p f2911a;

    public e(p pVar, int i7, int i10, int i11, String str) {
        super(i7, i10, i11, str);
        this.f2911a = pVar;
    }

    @Override
    public final void onAdjustVolume(int i7) {
        p pVar = this.f2911a;
        ((s4.e) ((ly0) pVar.f2327f).d).f54799a.post(new s4.c(pVar, i7, 1));
    }

    @Override
    public final void onSetVolumeTo(int i7) {
        p pVar = this.f2911a;
        ((s4.e) ((ly0) pVar.f2327f).d).f54799a.post(new s4.c(pVar, i7, 0));
    }
}
