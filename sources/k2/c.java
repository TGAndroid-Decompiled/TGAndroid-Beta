package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f13854a;

    public c(e eVar) {
        this.f13854a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f13854a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f13854a;
        if (e2.m0.l(audioDeviceInfoArr, eVar.f13874i)) {
            eVar.f13874i = null;
        }
        eVar.c();
    }
}
