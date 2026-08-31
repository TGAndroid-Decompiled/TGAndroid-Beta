package l3;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import c2.z0;
public final class i extends AudioDeviceCallback {
    public final z0 f11516a;

    public i(z0 z0Var) {
        this.f11516a = z0Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        z0 z0Var = this.f11516a;
        z0.a(z0Var, g.a((Context) z0Var.f2224b));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        z0 z0Var = this.f11516a;
        z0.a(z0Var, g.a((Context) z0Var.f2224b));
    }
}
