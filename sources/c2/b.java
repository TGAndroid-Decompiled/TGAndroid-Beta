package c2;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f4168a;
    public final AudioManager.OnAudioFocusChangeListener f4169b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f4169b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f8765a;
        this.f4168a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.U(this.f4168a, new ah.g(this, i10, 2));
    }
}
