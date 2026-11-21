package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f21100a;

    public c(e eVar) {
        this.f21100a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f21100a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f21100a;
        if (h2.l0.l(audioDeviceInfoArr, eVar.f21114i)) {
            eVar.f21114i = null;
        }
        eVar.c();
    }
}
