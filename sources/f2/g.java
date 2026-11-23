package f2;

import ai.t0;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import h2.l0;
public final class g implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f11032a;
    public final AudioManager.OnAudioFocusChangeListener f11033b;

    public g(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f11033b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = l0.f13778a;
        this.f11032a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        l0.W(this.f11032a, new t0(this, i7, 8));
    }
}
