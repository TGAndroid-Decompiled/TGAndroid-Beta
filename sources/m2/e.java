package m2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import g9.s1;
import java.util.List;
public final class e {
    public final Context f18845a;
    public final l5.b f18846b;
    public final Handler f18847c;
    public final c d;
    public final androidx.mediarouter.app.f f18848e;
    public final d f18849f;
    public b3.d f18850g;
    public b h;
    public AudioDeviceInfo f18851i;
    public d2.f f18852j;
    public boolean f18853k;

    public e(Context context, l5.b bVar, d2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f18845a = applicationContext;
        this.f18846b = bVar;
        this.f18852j = fVar;
        this.f18851i = audioDeviceInfo;
        String str = g2.n0.f11873a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f18847c = handler;
        this.d = new c(this);
        this.f18848e = new androidx.mediarouter.app.f(this, 4);
        s1 s1Var = b.f18817e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f18849f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        b3.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f18850g) != null) {
            return dVar.b();
        }
        g9.g0 g0Var = g9.i0.f12083b;
        return s1.f12146e;
    }

    public final void b(b bVar) {
        if (this.f18853k && !bVar.equals(this.h)) {
            this.h = bVar;
            j0 j0Var = (j0) this.f18846b.f18041b;
            j0Var.f();
            b bVar2 = j0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                j0Var.h = bVar;
                g2.s sVar = j0Var.f18900f;
                if (sVar != null) {
                    sVar.e(-1, new l2.d(22));
                }
            }
        }
    }

    public final void c() {
        List a10 = a();
        d2.f fVar = this.f18852j;
        AudioDeviceInfo audioDeviceInfo = this.f18851i;
        s1 s1Var = b.f18817e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f18845a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a10));
    }
}
