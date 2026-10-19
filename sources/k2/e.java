package k2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import e9.x1;
import java.util.List;
public final class e {
    public final Context f14672a;
    public final j5.b f14673b;
    public final Handler f14674c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f14675f;
    public z2.e f14676g;
    public b h;
    public AudioDeviceInfo f14677i;
    public b2.f f14678j;
    public boolean f14679k;

    public e(Context context, j5.b bVar, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f14672a = applicationContext;
        this.f14673b = bVar;
        this.f14678j = fVar;
        this.f14677i = audioDeviceInfo;
        String str = e2.m0.f8252a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f14674c = handler;
        this.d = new c(this);
        this.e = new androidx.mediarouter.app.f(this, 5);
        x1 x1Var = b.e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f14675f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.e eVar;
        if (Build.VERSION.SDK_INT >= 32 && (eVar = this.f14676g) != null) {
            return eVar.b();
        }
        e9.l0 l0Var = e9.n0.f8474b;
        return x1.e;
    }

    public final void b(b bVar) {
        if (this.f14679k && !bVar.equals(this.h)) {
            this.h = bVar;
            k0 k0Var = (k0) this.f14673b.f14255b;
            k0Var.f();
            b bVar2 = k0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                k0Var.h = bVar;
                e2.r rVar = k0Var.f14724f;
                if (rVar != null) {
                    rVar.e(-1, new f0(1));
                }
            }
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.f14678j;
        AudioDeviceInfo audioDeviceInfo = this.f14677i;
        x1 x1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f14672a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
