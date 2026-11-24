package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class s00 extends AudioDeviceCallback {
    public final u00 a;

    public s00(u00 u00Var) {
        this.a = u00Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.l();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        u00 u00Var = this.a;
        if (hac.l(audioDeviceInfoArr, (AudioDeviceInfo) u00Var.s)) {
            u00Var.s = null;
        }
        u00Var.l();
    }
}
