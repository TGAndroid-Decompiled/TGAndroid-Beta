package n2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f21103a;

    public c(e eVar) {
        this.f21103a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f21103a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f21103a;
        if (h2.l0.l(audioDeviceInfoArr, eVar.f21117i)) {
            eVar.f21117i = null;
        }
        eVar.c();
    }
}
