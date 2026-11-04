package b3;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d2.f;
import d2.v;
import e2.h;
import g2.n0;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.util.List;
import k2.g0;
public final class d {
    public final Spatializer f2349a;
    public final boolean f2350b;
    public final Handler f2351c;
    public final c d;

    public d(Context context, Runnable runnable, Boolean bool) {
        AudioManager e10;
        if (context == null) {
            e10 = null;
        } else {
            e10 = h.e(context);
        }
        if (e10 != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = e10.getSpatializer();
            this.f2349a = spatializer;
            this.f2350b = spatializer.getImmersiveAudioLevel() != 0;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.f2351c = handler;
            c cVar = new c(runnable);
            this.d = cVar;
            spatializer.addOnSpatializerStateChangedListener(new g0(handler, 1), cVar);
            return;
        }
        this.f2349a = null;
        this.f2350b = false;
        this.f2351c = null;
        this.d = null;
    }

    public final boolean a(f fVar, v vVar) {
        if (this.f2349a == null || !this.f2350b || !c() || !d()) {
            return false;
        }
        String str = vVar.f8489s;
        int i3 = vVar.K;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i3 == 16) {
                i3 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i3 == -1) {
                i3 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i3 == 18 || i3 == 21)) {
            i3 = 24;
        }
        int t10 = n0.t(i3);
        if (t10 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t10);
        int i10 = vVar.L;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        Spatializer spatializer = this.f2349a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(fVar.b(), channelMask.build());
    }

    public final List b() {
        if (this.f2349a != null && this.f2350b && c() && d()) {
            if (Build.VERSION.SDK_INT >= 36) {
                Spatializer spatializer = this.f2349a;
                spatializer.getClass();
                return spatializer.getSpatializedChannelMasks();
            }
            return i0.u(252);
        }
        g9.g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    public final boolean c() {
        Spatializer spatializer = this.f2349a;
        if (spatializer != null && spatializer.isAvailable()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        Spatializer spatializer = this.f2349a;
        if (spatializer != null && spatializer.isEnabled()) {
            return true;
        }
        return false;
    }

    public final void e() {
        c cVar;
        Handler handler;
        Spatializer spatializer = this.f2349a;
        if (spatializer != null && (cVar = this.d) != null && (handler = this.f2351c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(cVar);
            handler.removeCallbacksAndMessages(null);
        }
    }
}
