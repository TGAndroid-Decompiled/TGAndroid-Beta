package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.e7;
public final class c extends AudioDeviceCallback {
    public final e7 f14414a;

    public c(e7 e7Var) {
        this.f14414a = e7Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.f14414a;
        e7Var.a(b.c((Context) e7Var.f5031b, (b2.e) e7Var.f5037j, (a4.l) e7Var.f5036i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.f14414a;
        if (e2.d0.k(audioDeviceInfoArr, (a4.l) e7Var.f5036i)) {
            e7Var.f5036i = null;
        }
        e7Var.a(b.c((Context) e7Var.f5031b, (b2.e) e7Var.f5037j, (a4.l) e7Var.f5036i));
    }
}
