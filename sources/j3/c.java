package j3;

import android.media.AudioManager;
import android.os.Handler;
public final class c implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f8421a;
    public final d f8422b;

    public c(d dVar, Handler handler) {
        this.f8422b = dVar;
        this.f8421a = handler;
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        this.f8421a.post(new ah.b(this, i10, 5));
    }
}
