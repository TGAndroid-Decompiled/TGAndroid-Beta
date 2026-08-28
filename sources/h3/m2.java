package h3;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import gh.i3;
public final class m2 {
    public final Context f9592a;
    public final Handler f9593b;
    public final h0 f9594c;
    public final AudioManager d;
    public androidx.mediarouter.app.h f9595e;
    public int f9596f;
    public int f9597g;
    public boolean h;

    public m2(Context context, Handler handler, h0 h0Var) {
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        this.f9592a = applicationContext;
        this.f9593b = handler;
        this.f9594c = h0Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        d5.a.j(audioManager);
        this.d = audioManager;
        this.f9596f = 3;
        this.f9597g = b(audioManager, 3);
        int i9 = this.f9596f;
        if (d5.f0.f4349a >= 23) {
            z10 = audioManager.isStreamMute(i9);
        } else if (b(audioManager, i9) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        androidx.mediarouter.app.h hVar = new androidx.mediarouter.app.h(this, 6);
        try {
            d5.f0.M(applicationContext, hVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f9595e = hVar;
        } catch (RuntimeException e10) {
            d5.a.L("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static int b(AudioManager audioManager, int i9) {
        try {
            return audioManager.getStreamVolume(i9);
        } catch (RuntimeException e10) {
            d5.a.L("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i9, e10);
            return audioManager.getStreamMaxVolume(i9);
        }
    }

    public final int a() {
        if (d5.f0.f4349a >= 28) {
            return this.d.getStreamMinVolume(this.f9596f);
        }
        return 0;
    }

    public final void c(int i9) {
        if (this.f9596f != i9) {
            this.f9596f = i9;
            d();
            k0 k0Var = this.f9594c.f9440a;
            m2 m2Var = k0Var.B;
            m mVar = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f9596f));
            if (!mVar.equals(k0Var.f9540f0)) {
                k0Var.f9540f0 = mVar;
                k0Var.f9550l.e(29, new i3(mVar, 13));
            }
        }
    }

    public final void d() {
        final boolean z10;
        int i9 = this.f9596f;
        AudioManager audioManager = this.d;
        final int b10 = b(audioManager, i9);
        int i10 = this.f9596f;
        if (d5.f0.f4349a >= 23) {
            z10 = audioManager.isStreamMute(i10);
        } else if (b(audioManager, i10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9597g == b10 && this.h == z10) {
            return;
        }
        this.f9597g = b10;
        this.h = z10;
        this.f9594c.f9440a.f9550l.e(30, new d5.k() {
            @Override
            public final void invoke(Object obj) {
                ((a2) obj).onDeviceVolumeChanged(b10, z10);
            }
        });
    }
}
