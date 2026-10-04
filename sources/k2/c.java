package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.e7;
public final class c extends AudioDeviceCallback {
    public final e7 f14380a;

    public c(e7 e7Var) {
        this.f14380a = e7Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.f14380a;
        e7Var.a(b.c((Context) e7Var.f5022b, (b2.e) e7Var.f5028j, (e) e7Var.f5027i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (e) this.f14380a.f5027i)) {
            this.f14380a.f5027i = null;
        }
        e7 e7Var = this.f14380a;
        e7Var.a(b.c((Context) e7Var.f5022b, (b2.e) e7Var.f5028j, (e) e7Var.f5027i));
    }
}
