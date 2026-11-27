package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class tz extends AudioDeviceCallback {
    public final vz a;

    public tz(vz vzVar) {
        this.a = vzVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.l();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        vz vzVar = this.a;
        if (gcc.l(audioDeviceInfoArr, (AudioDeviceInfo) vzVar.s)) {
            vzVar.s = null;
        }
        vzVar.l();
    }
}
