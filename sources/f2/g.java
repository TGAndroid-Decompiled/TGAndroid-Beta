package f2;

import ai.w0;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import h2.l0;
public final class g implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f11040a;
    public final AudioManager.OnAudioFocusChangeListener f11041b;

    public g(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f11041b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = l0.f13786a;
        this.f11040a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        l0.W(this.f11040a, new w0(this, i7, 7));
    }
}
