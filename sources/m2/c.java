package m2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f18837a;

    public c(e eVar) {
        this.f18837a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f18837a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f18837a;
        if (g2.n0.l(audioDeviceInfoArr, eVar.f18851i)) {
            eVar.f18851i = null;
        }
        eVar.c();
    }
}
