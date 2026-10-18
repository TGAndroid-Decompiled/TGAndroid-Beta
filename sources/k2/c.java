package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f14659a;

    public c(e eVar) {
        this.f14659a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f14659a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f14659a;
        if (e2.m0.l(audioDeviceInfoArr, eVar.f14679i)) {
            eVar.f14679i = null;
        }
        eVar.c();
    }
}
