package l3;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import c2.a1;
public final class i extends AudioDeviceCallback {
    public final a1 f11262a;

    public i(a1 a1Var) {
        this.f11262a = a1Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        a1 a1Var = this.f11262a;
        a1.a(a1Var, g.a((Context) a1Var.f1902b));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        a1 a1Var = this.f11262a;
        a1.a(a1Var, g.a((Context) a1Var.f1902b));
    }
}
