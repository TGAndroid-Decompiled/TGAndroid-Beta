package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f14656a;

    public c(e eVar) {
        this.f14656a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f14656a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f14656a;
        if (e2.m0.l(audioDeviceInfoArr, eVar.f14677i)) {
            eVar.f14677i = null;
        }
        eVar.c();
    }
}
