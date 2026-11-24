package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
public final class sz extends AudioDeviceCallback {
    public final uz a;

    public sz(uz uzVar) {
        this.a = uzVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.c();
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        uz uzVar = this.a;
        if (g8c.l(audioDeviceInfoArr, uzVar.i)) {
            uzVar.i = null;
        }
        uzVar.c();
    }
}
