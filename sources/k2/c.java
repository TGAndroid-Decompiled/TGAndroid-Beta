package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.e7;
public final class c extends AudioDeviceCallback {
    public final e7 f13238a;

    public c(e7 e7Var) {
        this.f13238a = e7Var;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.f13238a;
        e7Var.a(b.c((Context) e7Var.f4648b, (b2.e) e7Var.f4653j, (a6.m) e7Var.f4652i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (a6.m) this.f13238a.f4652i)) {
            this.f13238a.f4652i = null;
        }
        e7 e7Var = this.f13238a;
        e7Var.a(b.c((Context) e7Var.f4648b, (b2.e) e7Var.f4653j, (a6.m) e7Var.f4652i));
    }
}
