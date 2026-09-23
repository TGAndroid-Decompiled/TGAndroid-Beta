package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.e7;
public final class c extends AudioDeviceCallback {
    public final e7 f13223a;

    public c(e7 e7Var) {
        this.f13223a = e7Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.f13223a;
        e7Var.a(b.c((Context) e7Var.f4640b, (b2.e) e7Var.f4645j, (a6.m) e7Var.f4644i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (a6.m) this.f13223a.f4644i)) {
            this.f13223a.f4644i = null;
        }
        e7 e7Var = this.f13223a;
        e7Var.a(b.c((Context) e7Var.f4640b, (b2.e) e7Var.f4645j, (a6.m) e7Var.f4644i));
    }
}
