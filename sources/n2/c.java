package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f21166a;

    public c(e eVar) {
        this.f21166a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f21166a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f21166a;
        if (h2.l0.l(audioDeviceInfoArr, eVar.f21182i)) {
            eVar.f21182i = null;
        }
        eVar.c();
    }
}
