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
    public final Context f14715a;
    public final j5.b f14716b;
    public final Handler f14717c;
    public final c d;
    public final androidx.mediarouter.app.f e;
    public final d f14718f;
    public z2.e f14719g;
    public b h;
    public AudioDeviceInfo f14720i;
    public b2.f f14721j;
    public boolean f14722k;

    public e(Context context, j5.b bVar, b2.f fVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f14715a = applicationContext;
        this.f14716b = bVar;
        this.f14721j = fVar;
        this.f14720i = audioDeviceInfo;
        String str = e2.m0.f8259a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f14717c = handler;
        this.d = new c(this);
        this.e = new androidx.mediarouter.app.f(this, 5);
        x1 x1Var = b.e;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f14718f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        z2.e eVar;
        if (Build.VERSION.SDK_INT >= 32 && (eVar = this.f14719g) != null) {
            return eVar.b();
        }
        e9.l0 l0Var = e9.n0.f8481b;
        return x1.e;
    }

    public final void b(b bVar) {
        if (this.f14722k && !bVar.equals(this.h)) {
            this.h = bVar;
            k0 k0Var = (k0) this.f14716b.f14300b;
            k0Var.f();
            b bVar2 = k0Var.h;
            if (bVar2 != null && !bVar.equals(bVar2)) {
                k0Var.h = bVar;
                e2.r rVar = k0Var.f14767f;
                if (rVar != null) {
                    rVar.e(-1, new f(5));
                }
            }
        }
    }

    public final void c() {
        List a2 = a();
        b2.f fVar = this.f14721j;
        AudioDeviceInfo audioDeviceInfo = this.f14720i;
        x1 x1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f14715a;
        b(b.b(context, context.registerReceiver(null, intentFilter), fVar, audioDeviceInfo, a2));
    }
}
