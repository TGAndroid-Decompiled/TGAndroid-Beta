package f2;

import ai.c1;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import h2.l0;
public final class g implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f11069a;
    public final AudioManager.OnAudioFocusChangeListener f11070b;

    public g(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f11070b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = l0.f13815a;
        this.f11069a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        l0.W(this.f11069a, new c1(this, i7, 7));
    }
}
