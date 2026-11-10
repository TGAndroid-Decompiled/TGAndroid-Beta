package f2;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import h2.m0;
public final class f implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f10907a;
    public final AudioManager.OnAudioFocusChangeListener f10908b;

    public f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f10908b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = m0.f14114a;
        this.f10907a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        m0.W(this.f10907a, new bg.m0(this, i7, 4));
    }
}
