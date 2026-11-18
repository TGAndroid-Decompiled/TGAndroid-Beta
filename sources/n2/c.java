package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f21072a;

    public c(e eVar) {
        this.f21072a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f21072a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f21072a;
        if (h2.l0.l(audioDeviceInfoArr, eVar.f21086i)) {
            eVar.f21086i = null;
        }
        eVar.c();
    }
}
