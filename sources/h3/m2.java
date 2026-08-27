package h3;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

public final class m2 {

    public final Context f8022a;

    public final Handler f8023b;

    public final h0 f8024c;
    public final AudioManager d;

    public androidx.mediarouter.app.f f8025e;

    public int f8026f;

    public int f8027g;
    public boolean h;

    public m2(Context context, Handler handler, h0 h0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f8022a = applicationContext;
        this.f8023b = handler;
        this.f8024c = h0Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        d5.a.j(audioManager);
        this.d = audioManager;
        this.f8026f = 3;
        this.f8027g = b(audioManager, 3);
        int i10 = this.f8026f;
        this.h = d5.g0.f4795a >= 23 ? audioManager.isStreamMute(i10) : b(audioManager, i10) == 0;
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 6);
        try {
            d5.g0.M(applicationContext, fVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f8025e = fVar;
        } catch (RuntimeException e9) {
            d5.a.L("StreamVolumeManager", "Error registering stream volume receiver", e9);
        }
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e9) {
            d5.a.L("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e9);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final int a() {
        if (d5.g0.f4795a >= 28) {
            return this.d.getStreamMinVolume(this.f8026f);
        }
        return 0;
    }

    public final void c(int i10) {
        if (this.f8026f == i10) {
            return;
        }
        this.f8026f = i10;
        d();
        k0 k0Var = this.f8024c.f7870a;
        m2 m2Var = k0Var.B;
        m mVar = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f8026f));
        if (mVar.equals(k0Var.f7970f0)) {
            return;
        }
        k0Var.f7970f0 = mVar;
        k0Var.f7980l.e(29, new x(mVar, 4));
    }

    public final void d() {
        final boolean zIsStreamMute;
        int i10 = this.f8026f;
        AudioManager audioManager = this.d;
        final int iB = b(audioManager, i10);
        int i11 = this.f8026f;
        if (d5.g0.f4795a >= 23) {
            zIsStreamMute = audioManager.isStreamMute(i11);
        } else {
            zIsStreamMute = b(audioManager, i11) == 0;
        }
        if (this.f8027g == iB && this.h == zIsStreamMute) {
            return;
        }
        this.f8027g = iB;
        this.h = zIsStreamMute;
        this.f8024c.f7870a.f7980l.e(30, new d5.k() {
            @Override
            public final void invoke(Object obj) {
                ((a2) obj).onDeviceVolumeChanged(iB, zIsStreamMute);
            }
        });
    }
}
