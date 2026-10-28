package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class d extends AudioDeviceCallback {
    public final f f16137a;

    public d(f fVar) {
        this.f16137a = fVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f16137a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        f fVar = this.f16137a;
        if (e2.n0.l(audioDeviceInfoArr, fVar.f16157i)) {
            fVar.f16157i = null;
        }
        fVar.c();
    }
}
