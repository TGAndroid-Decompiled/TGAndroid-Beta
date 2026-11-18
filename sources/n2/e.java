package n2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import h9.t1;
import java.util.List;
public final class e {
    public final Context f21080a;
    public final ki.e f21081b;
    public final Handler f21082c;
    public final c d;
    public final androidx.mediarouter.app.f f21083e;
    public final d f21084f;
    public c3.d f21085g;
    public b h;
    public AudioDeviceInfo f21086i;
    public e2.e f21087j;
    public boolean f21088k;

    public e(Context context, ki.e eVar, e2.e eVar2, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f21080a = applicationContext;
        this.f21081b = eVar;
        this.f21087j = eVar2;
        this.f21086i = audioDeviceInfo;
        String str = h2.l0.f13783a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f21082c = handler;
        this.d = new c(this);
        this.f21083e = new androidx.mediarouter.app.f(this, 4);
        t1 t1Var = b.f21065e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f21084f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        c3.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f21085g) != null) {
            return dVar.b();
        }
        h9.g0 g0Var = h9.i0.f14003b;
        return t1.f14071e;
    }

    public final void b(b bVar) {
        if (this.f21088k && !bVar.equals(this.h)) {
            this.h = bVar;
            i0 i0Var = (i0) this.f21081b.f18629b;
            i0Var.f();
            b bVar2 = i0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                i0Var.h = bVar;
                h2.r rVar = i0Var.f21131f;
                if (rVar != null) {
                    rVar.e(-1, new a0(4));
                }
            }
        }
    }

    public final void c() {
        List a10 = a();
        e2.e eVar = this.f21087j;
        AudioDeviceInfo audioDeviceInfo = this.f21086i;
        t1 t1Var = b.f21065e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f21080a;
        b(b.b(context, context.registerReceiver(null, intentFilter), eVar, audioDeviceInfo, a10));
    }
}
