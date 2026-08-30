package j3;

import android.media.AudioManager;
import android.os.Handler;
public final class c implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f8439a;
    public final d f8440b;

    public c(d dVar, Handler handler) {
        this.f8440b = dVar;
        this.f8439a = handler;
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        this.f8439a.post(new af.b(this, i10, 6));
    }
}
