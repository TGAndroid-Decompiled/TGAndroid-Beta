package c2;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import bi.s;
import e2.d0;
public final class b implements AudioManager.OnAudioFocusChangeListener {
    public final Handler f4073a;
    public final AudioManager.OnAudioFocusChangeListener f4074b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f4074b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = d0.f7188a;
        this.f4073a = new Handler(looper, null);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        d0.U(this.f4073a, new s(this, i10, 5));
    }
}
