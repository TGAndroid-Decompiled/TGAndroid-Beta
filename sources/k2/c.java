package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class c extends AudioDeviceCallback {
    public final e f10620a;

    public c(e eVar) {
        this.f10620a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f10620a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f10620a;
        if (e2.l0.l(audioDeviceInfoArr, eVar.f10642i)) {
            eVar.f10642i = null;
        }
        eVar.c();
    }
}
