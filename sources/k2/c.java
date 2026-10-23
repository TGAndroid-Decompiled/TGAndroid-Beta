package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f14696a;

    public c(e eVar) {
        this.f14696a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f14696a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f14696a;
        if (e2.m0.l(audioDeviceInfoArr, eVar.f14720i)) {
            eVar.f14720i = null;
        }
        eVar.c();
    }
}
