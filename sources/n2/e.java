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
    public final Context f20150a;
    public final l2.x f20151b;
    public final Handler f20152c;
    public final c d;
    public final androidx.mediarouter.app.f f20153e;
    public final d f20154f;
    public c3.d f20155g;
    public b h;
    public AudioDeviceInfo f20156i;
    public e2.e f20157j;
    public boolean f20158k;

    public e(Context context, l2.x xVar, e2.e eVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f20150a = applicationContext;
        this.f20151b = xVar;
        this.f20157j = eVar;
        this.f20156i = audioDeviceInfo;
        String str = h2.m0.f14114a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f20152c = handler;
        this.d = new c(this);
        this.f20153e = new androidx.mediarouter.app.f(this, 4);
        t1 t1Var = b.f20135e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f20154f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        c3.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f20155g) != null) {
            return dVar.b();
        }
        h9.g0 g0Var = h9.i0.f14331b;
        return t1.f14399e;
    }

    public final void b(b bVar) {
        if (this.f20158k && !bVar.equals(this.h)) {
            this.h = bVar;
            h0 h0Var = (h0) this.f20151b.f18074b;
            h0Var.f();
            b bVar2 = h0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                h0Var.h = bVar;
                h2.r rVar = h0Var.f20194f;
                if (rVar != null) {
                    rVar.e(-1, new m2.d(27));
                }
            }
        }
    }

    public final void c() {
        List a10 = a();
        e2.e eVar = this.f20157j;
        AudioDeviceInfo audioDeviceInfo = this.f20156i;
        t1 t1Var = b.f20135e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f20150a;
        b(b.b(context, context.registerReceiver(null, intentFilter), eVar, audioDeviceInfo, a10));
    }
}
