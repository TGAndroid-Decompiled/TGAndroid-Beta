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
    public final Context f14667a;
    public final j5.b f14668b;
    public final Handler f14669c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f14670f;
    public z2.d f14671g;
    public b h;
    public AudioDeviceInfo f14672i;
    public b2.f f14673j;
    public boolean f14674k;

    public e(Context context, j5.b bVar, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f14667a = applicationContext;
        this.f14668b = bVar;
        this.f14673j = fVar;
        this.f14672i = audioDeviceInfo;
        String str = e2.m0.f8254a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f14669c = handler;
        this.d = new c(this);
        this.e = new androidx.mediarouter.app.f(this, 5);
        x1 x1Var = b.e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f14670f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f14671g) != null) {
            return dVar.b();
        }
        e9.l0 l0Var = e9.n0.f8476b;
        return x1.e;
    }

    public final void b(b bVar) {
        if (this.f14674k && !bVar.equals(this.h)) {
            this.h = bVar;
            k0 k0Var = (k0) this.f14668b.f14250b;
            k0Var.f();
            b bVar2 = k0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                k0Var.h = bVar;
                e2.r rVar = k0Var.f14719f;
                if (rVar != null) {
                    rVar.e(-1, new f0(1));
                }
            }
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.f14673j;
        AudioDeviceInfo audioDeviceInfo = this.f14672i;
        x1 x1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f14667a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
