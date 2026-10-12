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
    public final Context f13869a;
    public final m5 f13870b;
    public final Handler f13871c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f13872f;
    public z2.d f13873g;
    public b h;
    public AudioDeviceInfo f13874i;
    public b2.f f13875j;
    public boolean f13876k;

    public e(Context context, m5 m5Var, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f13869a = applicationContext;
        this.f13870b = m5Var;
        this.f13875j = fVar;
        this.f13874i = audioDeviceInfo;
        String str = e2.m0.f8372a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f13871c = handler;
        this.d = new c(this);
        this.e = new androidx.mediarouter.app.f(this, 5);
        x1 x1Var = b.e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f13872f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f13873g) != null) {
            return dVar.b();
        }
        e9.l0 l0Var = e9.n0.f8592b;
        return x1.e;
    }

    public final void b(b bVar) {
        if (this.f13876k && !bVar.equals(this.h)) {
            this.h = bVar;
            j0 j0Var = (j0) this.f13870b.f13411b;
            j0Var.f();
            b bVar2 = j0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                j0Var.h = bVar;
                e2.r rVar = j0Var.f13917f;
                if (rVar != null) {
                    rVar.e(-1, new j2.e(29));
                }
            }
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.f13875j;
        AudioDeviceInfo audioDeviceInfo = this.f13874i;
        x1 x1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f13869a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
