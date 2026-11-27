package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
public final class f00 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final AudioManager.OnAudioFocusChangeListener b;

    public f00(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = gcc.a;
        this.a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i) {
        gcc.X(this.a, new zd(this, i, (byte) 3));
    }
}
