package f2;

import ai.u0;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import h2.l0;
public final class g implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f11030a;
    public final AudioManager.OnAudioFocusChangeListener f11031b;

    public g(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f11031b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = l0.f13778a;
        this.f11030a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        l0.W(this.f11030a, new u0(this, i7, 8));
    }
}
