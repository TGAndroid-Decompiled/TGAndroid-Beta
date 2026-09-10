package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import bi.h8;
public final class c extends AudioDeviceCallback {
    public final h8 f12078a;

    public c(h8 h8Var) {
        this.f12078a = h8Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        h8 h8Var = this.f12078a;
        h8Var.a(b.c((Context) h8Var.f2794b, (b2.e) h8Var.f2799j, (a6.i) h8Var.f2798i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (a6.i) this.f12078a.f2798i)) {
            this.f12078a.f2798i = null;
        }
        h8 h8Var = this.f12078a;
        h8Var.a(b.c((Context) h8Var.f2794b, (b2.e) h8Var.f2799j, (a6.i) h8Var.f2798i));
    }
}
