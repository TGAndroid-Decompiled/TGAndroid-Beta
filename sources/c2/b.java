package c2;

import ai.o8;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f3653a;
    public final AudioManager.OnAudioFocusChangeListener f3654b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f3654b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f7872a;
        this.f3653a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.U(this.f3653a, new o8(this, i10, 1));
    }
}
