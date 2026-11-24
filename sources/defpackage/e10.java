package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
public final class e10 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final AudioManager.OnAudioFocusChangeListener b;

    public e10(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = hac.a;
        this.a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i) {
        hac.X(this.a, new eh(this, i, (byte) 3));
    }
}
