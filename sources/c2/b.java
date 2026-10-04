package c2;

import ai.o8;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f3947a;
    public final AudioManager.OnAudioFocusChangeListener f3948b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f3948b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f8538a;
        this.f3947a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.U(this.f3947a, new o8(this, i10, 1));
    }
}
