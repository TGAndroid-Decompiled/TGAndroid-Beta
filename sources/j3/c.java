package j3;

import android.media.AudioManager;
import android.os.Handler;
public final class c implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f10397a;
    public final d f10398b;

    public c(d dVar, Handler handler) {
        this.f10398b = dVar;
        this.f10397a = handler;
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        this.f10397a.post(new bg.f(this, i10, 4));
    }
}
