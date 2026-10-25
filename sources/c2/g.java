package c2;

import ag.r0;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.n0;
public final class g implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f5943a;
    public final AudioManager.OnAudioFocusChangeListener f5944b;

    public g(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f5944b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = n0.f9692a;
        this.f5943a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        n0.W(this.f5943a, new r0(this, i10, 4));
    }
}
