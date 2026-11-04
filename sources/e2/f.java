package e2;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import cg.l0;
import g2.n0;
public final class f implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f9341a;
    public final AudioManager.OnAudioFocusChangeListener f9342b;

    public f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f9342b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = n0.f11873a;
        this.f9341a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i3) {
        n0.W(this.f9341a, new l0(this, i3, 3));
    }
}
