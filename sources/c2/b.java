package c2;

import ai.n8;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f3654a;
    public final AudioManager.OnAudioFocusChangeListener f3655b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f3655b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f7883a;
        this.f3654a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.U(this.f3654a, new n8(this, i10, 1));
    }
}
