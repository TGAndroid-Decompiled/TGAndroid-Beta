package c2;

import ai.p8;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f3996a;
    public final AudioManager.OnAudioFocusChangeListener f3997b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f3997b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f8531a;
        this.f3996a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.T(this.f3996a, new p8(this, i10, 1));
    }
}
