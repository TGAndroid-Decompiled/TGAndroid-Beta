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
    public final Context f10637a;
    public final ig.c0 f10638b;
    public final Handler f10639c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f10640f;
    public z2.d f10641g;
    public b h;
    public AudioDeviceInfo f10642i;
    public b2.f f10643j;
    public boolean f10644k;

    public e(Context context, ig.c0 c0Var, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f10637a = applicationContext;
        this.f10638b = c0Var;
        this.f10643j = fVar;
        this.f10642i = audioDeviceInfo;
        String str = e2.l0.f6165a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f10639c = handler;
        this.d = new c(this);
        this.e = new androidx.mediarouter.app.f(this, 5);
        x1 x1Var = b.e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f10640f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f10641g) != null) {
            return dVar.b();
        }
        e9.l0 l0Var = e9.n0.f6390b;
        return x1.e;
    }

    public final void b(b bVar) {
        if (this.f10644k && !bVar.equals(this.h)) {
            this.h = bVar;
            n0 n0Var = (n0) this.f10638b.f8282b;
            n0Var.f();
            b bVar2 = n0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                n0Var.h = bVar;
                e2.r rVar = n0Var.f10713f;
                if (rVar != null) {
                    rVar.e(-1, new k0(0));
                }
            }
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.f10643j;
        AudioDeviceInfo audioDeviceInfo = this.f10642i;
        x1 x1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f10637a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
