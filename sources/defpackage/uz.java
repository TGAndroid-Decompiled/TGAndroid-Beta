package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import java.util.List;
public final class uz {
    public final Context a;
    public final l0 b;
    public final Handler c;
    public final sz d;
    public final zj e;
    public final tz f;
    public ska g;
    public rz h;
    public AudioDeviceInfo i;
    public nz j;
    public boolean k;

    public uz(Context context, l0 l0Var, nz nzVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = l0Var;
        this.j = nzVar;
        this.i = audioDeviceInfo;
        Handler handler = new Handler(g8c.z(), null);
        this.c = handler;
        this.d = new sz(this);
        this.e = new zj(this, (byte) 2);
        w59 w59Var = rz.e;
        String str = Build.MANUFACTURER;
        if (!str.equals("Amazon") && !str.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f = uriFor != null ? new tz(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        ska skaVar;
        if (Build.VERSION.SDK_INT >= 32 && (skaVar = this.g) != null) {
            return skaVar.b();
        }
        km5 km5Var = mm5.b;
        return w59.e;
    }

    public final void b(rz rzVar) {
        if (this.k && !rzVar.equals(this.h)) {
            this.h = rzVar;
            l40 l40Var = (l40) this.b.b;
            l40Var.f();
            rz rzVar2 = l40Var.g;
            if (rzVar2 != null && !rzVar.equals(rzVar2)) {
                l40Var.g = rzVar;
                a66 a66Var = l40Var.e;
                if (a66Var != null) {
                    a66Var.e(-1, new wz((byte) 6));
                }
            }
        }
    }

    public final void c() {
        List a = a();
        nz nzVar = this.j;
        AudioDeviceInfo audioDeviceInfo = this.i;
        w59 w59Var = rz.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.a;
        b(rz.b(context, context.registerReceiver(null, intentFilter), nzVar, audioDeviceInfo, a));
    }
}
