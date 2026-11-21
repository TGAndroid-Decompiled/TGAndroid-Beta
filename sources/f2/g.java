package f2;

import ai.y0;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import h2.l0;
public final class g implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f11066a;
    public final AudioManager.OnAudioFocusChangeListener f11067b;

    public g(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f11067b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = l0.f13812a;
        this.f11066a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        l0.W(this.f11066a, new y0(this, i7, 7));
    }
}
