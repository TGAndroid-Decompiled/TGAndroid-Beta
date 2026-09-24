package c2;

import ai.o8;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f3651a;
    public final AudioManager.OnAudioFocusChangeListener f3652b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f3652b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f7870a;
        this.f3651a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.U(this.f3651a, new o8(this, i10, 1));
    }
}
