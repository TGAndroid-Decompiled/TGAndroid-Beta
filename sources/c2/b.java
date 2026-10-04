package c2;

import ai.o8;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f3946a;
    public final AudioManager.OnAudioFocusChangeListener f3947b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f3947b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f8537a;
        this.f3946a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.U(this.f3946a, new o8(this, i10, 1));
    }
}
