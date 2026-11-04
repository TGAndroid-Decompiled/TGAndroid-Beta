package a2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
public final class e extends VolumeProvider {
    public final q f53a;

    public e(q qVar, int i3, int i10, int i11, String str) {
        super(i3, i10, i11, str);
        this.f53a = qVar;
    }

    @Override
    public final void onAdjustVolume(int i3) {
        q qVar = this.f53a;
        ((r4.e) ((p7.d) qVar.f1751f).f53346c).f54257a.post(new r4.c(qVar, i3, 1));
    }

    @Override
    public final void onSetVolumeTo(int i3) {
        q qVar = this.f53a;
        ((r4.e) ((p7.d) qVar.f1751f).f53346c).f54257a.post(new r4.c(qVar, i3, 0));
    }
}
