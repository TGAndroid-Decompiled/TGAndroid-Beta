package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f14652a;

    public c(e eVar) {
        this.f14652a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f14652a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f14652a;
        if (e2.m0.l(audioDeviceInfoArr, eVar.f14672i)) {
            eVar.f14672i = null;
        }
        eVar.c();
    }
}
