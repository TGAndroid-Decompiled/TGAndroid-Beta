package a2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
public final class f extends VolumeProvider {
    public final q f54a;

    public f(q qVar, int i3, int i10, int i11) {
        super(i3, i10, i11);
        this.f54a = qVar;
    }

    @Override
    public final void onAdjustVolume(int i3) {
        q qVar = this.f54a;
        ((r4.e) ((p7.d) qVar.f1751f).f53346c).f54257a.post(new r4.c(qVar, i3, 1));
    }

    @Override
    public final void onSetVolumeTo(int i3) {
        q qVar = this.f54a;
        ((r4.e) ((p7.d) qVar.f1751f).f53346c).f54257a.post(new r4.c(qVar, i3, 0));
    }
}
