package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f13857a;

    public c(e eVar) {
        this.f13857a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f13857a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f13857a;
        if (e2.m0.l(audioDeviceInfoArr, eVar.f13877i)) {
            eVar.f13877i = null;
        }
        eVar.c();
    }
}
