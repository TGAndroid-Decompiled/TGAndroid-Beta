package f2;

import ai.w0;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import h2.l0;
public final class f implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f10718a;
    public final AudioManager.OnAudioFocusChangeListener f10719b;

    public f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f10719b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = l0.f13471a;
        this.f10718a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        l0.W(this.f10718a, new w0(this, i7, 4));
    }
}
