package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
public final class e00 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final AudioManager.OnAudioFocusChangeListener b;

    public e00(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = g8c.a;
        this.a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i) {
        g8c.X(this.a, new eg(this, i, (byte) 3));
    }
}
