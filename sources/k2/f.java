package k2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import f9.s1;
import java.util.List;
import jg.e1;
public final class f {
    public final Context f16153a;
    public final e1 f16154b;
    public final Handler f16155c;
    public final d d;
    public final androidx.mediarouter.app.g e;
    public final e f16156f;
    public z2.d f16157g;
    public b h;
    public AudioDeviceInfo f16158i;
    public b2.f f16159j;
    public boolean f16160k;

    public f(Context context, e1 e1Var, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f16153a = applicationContext;
        this.f16154b = e1Var;
        this.f16159j = fVar;
        this.f16158i = audioDeviceInfo;
        String str = e2.n0.f9692a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f16155c = handler;
        this.d = new d(this);
        this.e = new androidx.mediarouter.app.g(this, 5);
        s1 s1Var = b.e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f16156f = uriFor != null ? new e(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f16157g) != null) {
            return dVar.b();
        }
        f9.g0 g0Var = f9.i0.f10287b;
        return s1.e;
    }

    public final void b(b bVar) {
        if (this.f16160k && !bVar.equals(this.h)) {
            this.h = bVar;
            l0 l0Var = (l0) this.f16154b.f15690b;
            l0Var.f();
            b bVar2 = l0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                l0Var.h = bVar;
                e2.r rVar = l0Var.f16207f;
                if (rVar != null) {
                    rVar.e(-1, new jh.l(7));
                }
            }
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.f16159j;
        AudioDeviceInfo audioDeviceInfo = this.f16158i;
        s1 s1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f16153a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
