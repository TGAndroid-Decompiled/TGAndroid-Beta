package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f20139a;

    public c(e eVar) {
        this.f20139a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f20139a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f20139a;
        if (h2.m0.l(audioDeviceInfoArr, eVar.f20151i)) {
            eVar.f20151i = null;
        }
        eVar.c();
    }
}
