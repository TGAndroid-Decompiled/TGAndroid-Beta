package j3;

import android.media.AudioManager;
import android.os.Handler;
public final class c implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f8998a;
    public final d f8999b;

    public c(d dVar, Handler handler) {
        this.f8999b = dVar;
        this.f8998a = handler;
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        this.f8998a.post(new af.b(this, i10, 6));
    }
}
