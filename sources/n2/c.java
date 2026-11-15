package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f20711a;

    public c(e eVar) {
        this.f20711a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f20711a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f20711a;
        if (h2.l0.l(audioDeviceInfoArr, eVar.f20725i)) {
            eVar.f20725i = null;
        }
        eVar.c();
    }
}
