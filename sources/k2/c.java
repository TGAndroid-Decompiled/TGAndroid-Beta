package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.e7;
public final class c extends AudioDeviceCallback {
    public final e7 f14381a;

    public c(e7 e7Var) {
        this.f14381a = e7Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.f14381a;
        e7Var.a(b.c((Context) e7Var.f5023b, (b2.e) e7Var.f5029j, (e) e7Var.f5028i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (e) this.f14381a.f5028i)) {
            this.f14381a.f5028i = null;
        }
        e7 e7Var = this.f14381a;
        e7Var.a(b.c((Context) e7Var.f5023b, (b2.e) e7Var.f5029j, (e) e7Var.f5028i));
    }
}
