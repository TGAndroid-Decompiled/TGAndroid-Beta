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
public final class e {
    public final Context f20719a;
    public final ki.e f20720b;
    public final Handler f20721c;
    public final c d;
    public final androidx.mediarouter.app.f f20722e;
    public final d f20723f;
    public c3.d f20724g;
    public b h;
    public AudioDeviceInfo f20725i;
    public e2.e f20726j;
    public boolean f20727k;

    public e(Context context, ki.e eVar, e2.e eVar2, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f20719a = applicationContext;
        this.f20720b = eVar;
        this.f20726j = eVar2;
        this.f20725i = audioDeviceInfo;
        String str = h2.l0.f13471a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f20721c = handler;
        this.d = new c(this);
        this.f20722e = new androidx.mediarouter.app.f(this, 4);
        s1 s1Var = b.f20704e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f20723f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        c3.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f20724g) != null) {
            return dVar.b();
        }
        h9.g0 g0Var = h9.i0.f13686b;
        return s1.f13749e;
    }

    public final void b(b bVar) {
        if (this.f20727k && !bVar.equals(this.h)) {
            this.h = bVar;
            i0 i0Var = (i0) this.f20720b.f18272b;
            i0Var.f();
            b bVar2 = i0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                i0Var.h = bVar;
                h2.r rVar = i0Var.f20770f;
                if (rVar != null) {
                    rVar.e(-1, new a0(3));
                }
            }
        }
    }

    public final void c() {
        List a10 = a();
        e2.e eVar = this.f20726j;
        AudioDeviceInfo audioDeviceInfo = this.f20725i;
        s1 s1Var = b.f20704e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f20719a;
        b(b.b(context, context.registerReceiver(null, intentFilter), eVar, audioDeviceInfo, a10));
    }
}
