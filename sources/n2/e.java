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
import kg.y1;
public final class e {
    public final Context f21077a;
    public final y1 f21078b;
    public final Handler f21079c;
    public final c d;
    public final androidx.mediarouter.app.f f21080e;
    public final d f21081f;
    public c3.d f21082g;
    public b h;
    public AudioDeviceInfo f21083i;
    public e2.e f21084j;
    public boolean f21085k;

    public e(Context context, y1 y1Var, e2.e eVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f21077a = applicationContext;
        this.f21078b = y1Var;
        this.f21084j = eVar;
        this.f21083i = audioDeviceInfo;
        String str = h2.l0.f13778a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f21079c = handler;
        this.d = new c(this);
        this.f21080e = new androidx.mediarouter.app.f(this, 4);
        t1 t1Var = b.f21062e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f21081f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        c3.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f21082g) != null) {
            return dVar.b();
        }
        h9.g0 g0Var = h9.i0.f13998b;
        return t1.f14066e;
    }

    public final void b(b bVar) {
        if (this.f21085k && !bVar.equals(this.h)) {
            this.h = bVar;
            i0 i0Var = (i0) this.f21078b.f18538b;
            i0Var.f();
            b bVar2 = i0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                i0Var.h = bVar;
                h2.r rVar = i0Var.f21128f;
                if (rVar != null) {
                    rVar.e(-1, new a0(4));
                }
            }
        }
    }

    public final void c() {
        List a10 = a();
        e2.e eVar = this.f21084j;
        AudioDeviceInfo audioDeviceInfo = this.f21083i;
        t1 t1Var = b.f21062e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f21077a;
        b(b.b(context, context.registerReceiver(null, intentFilter), eVar, audioDeviceInfo, a10));
    }
}
