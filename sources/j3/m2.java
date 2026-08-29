package j3;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
public final class m2 {
    public final Context f10629a;
    public final Handler f10630b;
    public final h0 f10631c;
    public final AudioManager d;
    public af.c f10632e;
    public int f10633f;
    public int f10634g;
    public boolean h;

    public m2(Context context, Handler handler, h0 h0Var) {
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        this.f10629a = applicationContext;
        this.f10630b = handler;
        this.f10631c = h0Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        f5.a.j(audioManager);
        this.d = audioManager;
        this.f10633f = 3;
        this.f10634g = b(audioManager, 3);
        int i10 = this.f10633f;
        if (f5.d0.f6579a >= 23) {
            z10 = audioManager.isStreamMute(i10);
        } else if (b(audioManager, i10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        af.c cVar = new af.c(this, 7);
        try {
            f5.d0.M(applicationContext, cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f10632e = cVar;
        } catch (RuntimeException e10) {
            f5.a.L("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            f5.a.L("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final int a() {
        if (f5.d0.f6579a >= 28) {
            return this.d.getStreamMinVolume(this.f10633f);
        }
        return 0;
    }

    public final void c(int i10) {
        if (this.f10633f != i10) {
            this.f10633f = i10;
            d();
            k0 k0Var = this.f10631c.f10477a;
            m2 m2Var = k0Var.B;
            m mVar = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f10633f));
            if (!mVar.equals(k0Var.f10577f0)) {
                k0Var.f10577f0 = mVar;
                k0Var.f10587l.e(29, new eg.n(mVar, 15));
            }
        }
    }

    public final void d() {
        final boolean z10;
        int i10 = this.f10633f;
        AudioManager audioManager = this.d;
        final int b10 = b(audioManager, i10);
        int i11 = this.f10633f;
        if (f5.d0.f6579a >= 23) {
            z10 = audioManager.isStreamMute(i11);
        } else if (b(audioManager, i11) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f10634g == b10 && this.h == z10) {
            return;
        }
        this.f10634g = b10;
        this.h = z10;
        this.f10631c.f10477a.f10587l.e(30, new f5.j() {
            @Override
            public final void invoke(Object obj) {
                ((a2) obj).onDeviceVolumeChanged(b10, z10);
            }
        });
    }
}
