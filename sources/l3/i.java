package l3;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import c2.z0;
public final class i extends AudioDeviceCallback {
    public final z0 f11152a;

    public i(z0 z0Var) {
        this.f11152a = z0Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        z0 z0Var = this.f11152a;
        z0.a(z0Var, g.a((Context) z0Var.f2047b));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        z0 z0Var = this.f11152a;
        z0.a(z0Var, g.a((Context) z0Var.f2047b));
    }
}
