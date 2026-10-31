package c2;

import ag.d3;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.l0;
public final class f implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f3537a;
    public final AudioManager.OnAudioFocusChangeListener f3538b;

    public f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f3538b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = l0.f6165a;
        this.f3537a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        l0.W(this.f3537a, new d3(this, i10, 2));
    }
}
