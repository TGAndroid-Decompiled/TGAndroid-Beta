package h3;

import android.media.AudioManager;
import android.os.Handler;
public final class c implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f9358a;
    public final d f9359b;

    public c(d dVar, Handler handler) {
        this.f9359b = dVar;
        this.f9358a = handler;
    }

    @Override
    public final void onAudioFocusChange(int i9) {
        this.f9358a.post(new bg.c2(this, i9, 4));
    }
}
