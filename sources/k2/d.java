package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class d extends AudioDeviceCallback {
    public final f f16138a;

    public d(f fVar) {
        this.f16138a = fVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f16138a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        f fVar = this.f16138a;
        if (e2.n0.l(audioDeviceInfoArr, fVar.f16158i)) {
            fVar.f16158i = null;
        }
        fVar.c();
    }
}
