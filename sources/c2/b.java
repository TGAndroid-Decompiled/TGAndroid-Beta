package c2;

import ai.n8;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f3658a;
    public final AudioManager.OnAudioFocusChangeListener f3659b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f3659b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f7887a;
        this.f3658a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.U(this.f3658a, new n8(this, i10, 1));
    }
}
