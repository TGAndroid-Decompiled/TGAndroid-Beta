package c2;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.m0;
public final class g implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f4136a;
    public final AudioManager.OnAudioFocusChangeListener f4137b;

    public g(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f4137b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = m0.f8375a;
        this.f4136a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        m0.W(this.f4136a, new ah.g(this, i10, 2));
    }
}
