package h3;

import android.media.AudioManager;
import android.os.Handler;

public final class c implements AudioManager.OnAudioFocusChangeListener {

    public final Handler f7793a;

    public final d f7794b;

    public c(d dVar, Handler handler) {
        this.f7794b = dVar;
        this.f7793a = handler;
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        this.f7793a.post(new cg.w1(this, i10, 2));
    }
}
