package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import di.g7;
import ji.u4;
public final class c extends AudioDeviceCallback {
    public final g7 f14547a;

    public c(g7 g7Var) {
        this.f14547a = g7Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        g7 g7Var = this.f14547a;
        g7Var.a(b.c((Context) g7Var.f7293b, (b2.e) g7Var.f7299j, (u4) g7Var.f7298i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (u4) this.f14547a.f7298i)) {
            this.f14547a.f7298i = null;
        }
        g7 g7Var = this.f14547a;
        g7Var.a(b.c((Context) g7Var.f7293b, (b2.e) g7Var.f7299j, (u4) g7Var.f7298i));
    }
}
