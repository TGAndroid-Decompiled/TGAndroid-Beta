package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f21069a;

    public c(e eVar) {
        this.f21069a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f21069a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f21069a;
        if (h2.l0.l(audioDeviceInfoArr, eVar.f21083i)) {
            eVar.f21083i = null;
        }
        eVar.c();
    }
}
