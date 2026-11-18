package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f21075a;

    public c(e eVar) {
        this.f21075a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f21075a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f21075a;
        if (h2.l0.l(audioDeviceInfoArr, eVar.f21089i)) {
            eVar.f21089i = null;
        }
        eVar.c();
    }
}
