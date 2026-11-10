package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f20144a;

    public c(e eVar) {
        this.f20144a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f20144a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f20144a;
        if (h2.m0.l(audioDeviceInfoArr, eVar.f20156i)) {
            eVar.f20156i = null;
        }
        eVar.c();
    }
}
