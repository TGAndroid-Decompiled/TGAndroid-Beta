package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.g7;
public final class c extends AudioDeviceCallback {
    public final g7 f13234a;

    public c(g7 g7Var) {
        this.f13234a = g7Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        g7 g7Var = this.f13234a;
        g7Var.a(b.c((Context) g7Var.f4690b, (b2.e) g7Var.f4695j, (a6.m) g7Var.f4694i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (a6.m) this.f13234a.f4694i)) {
            this.f13234a.f4694i = null;
        }
        g7 g7Var = this.f13234a;
        g7Var.a(b.c((Context) g7Var.f4690b, (b2.e) g7Var.f4695j, (a6.m) g7Var.f4694i));
    }
}
