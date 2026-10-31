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
    public final Context f10636a;
    public final ig.c0 f10637b;
    public final Handler f10638c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f10639f;
    public z2.d f10640g;
    public b h;
    public AudioDeviceInfo f10641i;
    public b2.f f10642j;
    public boolean f10643k;

    public e(Context context, ig.c0 c0Var, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f10636a = applicationContext;
        this.f10637b = c0Var;
        this.f10642j = fVar;
        this.f10641i = audioDeviceInfo;
        String str = e2.l0.f6165a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f10638c = handler;
        this.d = new c(this);
        this.e = new androidx.mediarouter.app.f(this, 5);
        x1 x1Var = b.e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f10639f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f10640g) != null) {
            return dVar.b();
        }
        e9.l0 l0Var = e9.n0.f6390b;
        return x1.e;
    }

    public final void b(b bVar) {
        if (this.f10643k && !bVar.equals(this.h)) {
            this.h = bVar;
            n0 n0Var = (n0) this.f10637b.f8281b;
            n0Var.f();
            b bVar2 = n0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                n0Var.h = bVar;
                e2.r rVar = n0Var.f10712f;
                if (rVar != null) {
                    rVar.e(-1, new k0(0));
                }
            }
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.f10642j;
        AudioDeviceInfo audioDeviceInfo = this.f10641i;
        x1 x1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f10636a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
