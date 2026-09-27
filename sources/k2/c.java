package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.e7;
public final class c extends AudioDeviceCallback {
    public final e7 f13226a;

    public c(e7 e7Var) {
        this.f13226a = e7Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.f13226a;
        e7Var.a(b.c((Context) e7Var.f4650b, (b2.e) e7Var.f4655j, (a6.m) e7Var.f4654i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (a6.m) this.f13226a.f4654i)) {
            this.f13226a.f4654i = null;
        }
        e7 e7Var = this.f13226a;
        e7Var.a(b.c((Context) e7Var.f4650b, (b2.e) e7Var.f4655j, (a6.m) e7Var.f4654i));
    }
}
