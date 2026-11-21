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
import kg.x1;
public final class e {
    public final Context f21108a;
    public final x1 f21109b;
    public final Handler f21110c;
    public final c d;
    public final androidx.mediarouter.app.f f21111e;
    public final d f21112f;
    public c3.d f21113g;
    public b h;
    public AudioDeviceInfo f21114i;
    public e2.e f21115j;
    public boolean f21116k;

    public e(Context context, x1 x1Var, e2.e eVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f21108a = applicationContext;
        this.f21109b = x1Var;
        this.f21115j = eVar;
        this.f21114i = audioDeviceInfo;
        String str = h2.l0.f13812a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f21110c = handler;
        this.d = new c(this);
        this.f21111e = new androidx.mediarouter.app.f(this, 4);
        t1 t1Var = b.f21093e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f21112f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        c3.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f21113g) != null) {
            return dVar.b();
        }
        h9.g0 g0Var = h9.i0.f14032b;
        return t1.f14100e;
    }

    public final void b(b bVar) {
        if (this.f21116k && !bVar.equals(this.h)) {
            this.h = bVar;
            i0 i0Var = (i0) this.f21109b.f18561b;
            i0Var.f();
            b bVar2 = i0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                i0Var.h = bVar;
                h2.r rVar = i0Var.f21159f;
                if (rVar != null) {
                    rVar.e(-1, new a0(4));
                }
            }
        }
    }

    public final void c() {
        List a10 = a();
        e2.e eVar = this.f21115j;
        AudioDeviceInfo audioDeviceInfo = this.f21114i;
        t1 t1Var = b.f21093e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f21108a;
        b(b.b(context, context.registerReceiver(null, intentFilter), eVar, audioDeviceInfo, a10));
    }
}
