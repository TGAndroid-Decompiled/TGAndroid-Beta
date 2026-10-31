package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f10619a;

    public c(e eVar) {
        this.f10619a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f10619a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f10619a;
        if (e2.l0.l(audioDeviceInfoArr, eVar.f10641i)) {
            eVar.f10641i = null;
        }
        eVar.c();
    }
}
