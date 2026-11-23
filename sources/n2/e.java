package n2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import h9.s1;
import java.util.List;
import kg.f1;
public final class e {
    public final Context f21176a;
    public final f1 f21177b;
    public final Handler f21178c;
    public final c d;
    public final androidx.mediarouter.app.f f21179e;
    public final d f21180f;
    public c3.d f21181g;
    public b h;
    public AudioDeviceInfo f21182i;
    public e2.e f21183j;
    public boolean f21184k;

    public e(Context context, f1 f1Var, e2.e eVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f21176a = applicationContext;
        this.f21177b = f1Var;
        this.f21183j = eVar;
        this.f21182i = audioDeviceInfo;
        String str = h2.l0.f13778a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f21178c = handler;
        this.d = new c(this);
        this.f21179e = new androidx.mediarouter.app.f(this, 4);
        s1 s1Var = b.f21152e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f21180f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        c3.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f21181g) != null) {
            return dVar.b();
        }
        h9.g0 g0Var = h9.i0.f13995b;
        return s1.f14058e;
    }

    public final void b(b bVar) {
        if (this.f21184k && !bVar.equals(this.h)) {
            this.h = bVar;
            j0 j0Var = (j0) this.f21177b.f18412b;
            j0Var.f();
            b bVar2 = j0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                j0Var.h = bVar;
                h2.r rVar = j0Var.f21231f;
                if (rVar != null) {
                    rVar.e(-1, new a0(4));
                }
            }
        }
    }

    public final void c() {
        List a10 = a();
        e2.e eVar = this.f21183j;
        AudioDeviceInfo audioDeviceInfo = this.f21182i;
        s1 s1Var = b.f21152e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f21176a;
        b(b.b(context, context.registerReceiver(null, intentFilter), eVar, audioDeviceInfo, a10));
    }
}
