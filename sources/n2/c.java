package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f20136a;

    public c(e eVar) {
        this.f20136a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f20136a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f20136a;
        if (h2.m0.l(audioDeviceInfoArr, eVar.f20148i)) {
            eVar.f20148i = null;
        }
        eVar.c();
    }
}
