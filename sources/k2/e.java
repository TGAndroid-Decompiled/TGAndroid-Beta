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
import ji.m5;
public final class e {
    public final Context f13872a;
    public final m5 f13873b;
    public final Handler f13874c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f13875f;
    public z2.d f13876g;
    public b h;
    public AudioDeviceInfo f13877i;
    public b2.f f13878j;
    public boolean f13879k;

    public e(Context context, m5 m5Var, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f13872a = applicationContext;
        this.f13873b = m5Var;
        this.f13878j = fVar;
        this.f13877i = audioDeviceInfo;
        String str = e2.m0.f8375a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f13874c = handler;
        this.d = new c(this);
        this.e = new androidx.mediarouter.app.f(this, 5);
        x1 x1Var = b.e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f13875f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f13876g) != null) {
            return dVar.b();
        }
        e9.l0 l0Var = e9.n0.f8595b;
        return x1.e;
    }

    public final void b(b bVar) {
        if (this.f13879k && !bVar.equals(this.h)) {
            this.h = bVar;
            j0 j0Var = (j0) this.f13873b.f13414b;
            j0Var.f();
            b bVar2 = j0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                j0Var.h = bVar;
                e2.r rVar = j0Var.f13920f;
                if (rVar != null) {
                    rVar.e(-1, new j2.e(29));
                }
            }
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.f13878j;
        AudioDeviceInfo audioDeviceInfo = this.f13877i;
        x1 x1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f13872a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
