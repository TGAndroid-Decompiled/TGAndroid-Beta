package c2;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f4141a;
    public final AudioManager.OnAudioFocusChangeListener f4142b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f4142b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f8737a;
        this.f4141a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.U(this.f4141a, new ah.g(this, i10, 2));
    }
}
