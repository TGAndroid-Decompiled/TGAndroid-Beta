package c3;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import e2.e;
import e2.u;
import f2.h;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.s1;
import j$.util.Objects;
import java.util.List;
import l2.d0;
public final class d {
    public final Spatializer f4091a;
    public final boolean f4092b;
    public final Handler f4093c;
    public final c d;

    public d(Context context, Runnable runnable, Boolean bool) {
        AudioManager d;
        if (context == null) {
            d = null;
        } else {
            d = h.d(context);
        }
        if (d != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = d.getSpatializer();
            this.f4091a = spatializer;
            this.f4092b = spatializer.getImmersiveAudioLevel() != 0;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.f4093c = handler;
            c cVar = new c(runnable);
            this.d = cVar;
            spatializer.addOnSpatializerStateChangedListener(new d0(handler, 1), cVar);
            return;
        }
        this.f4091a = null;
        this.f4092b = false;
        this.f4093c = null;
        this.d = null;
    }

    public final boolean a(e eVar, u uVar) {
        if (this.f4091a == null || !this.f4092b || !c() || !d()) {
            return false;
        }
        String str = uVar.f10451s;
        int i7 = uVar.K;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i7 == 16) {
                i7 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i7 == -1) {
                i7 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i7 == 18 || i7 == 21)) {
            i7 = 24;
        }
        int t6 = l0.t(i7);
        if (t6 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t6);
        int i10 = uVar.L;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        Spatializer spatializer = this.f4091a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(eVar.b(), channelMask.build());
    }

    public final List b() {
        if (this.f4091a != null && this.f4092b && c() && d()) {
            if (Build.VERSION.SDK_INT >= 36) {
                Spatializer spatializer = this.f4091a;
                spatializer.getClass();
                return spatializer.getSpatializedChannelMasks();
            }
            return i0.u(252);
        }
        g0 g0Var = i0.f13686b;
        return s1.f13749e;
    }

    public final boolean c() {
        Spatializer spatializer = this.f4091a;
        if (spatializer != null && spatializer.isAvailable()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        Spatializer spatializer = this.f4091a;
        if (spatializer != null && spatializer.isEnabled()) {
            return true;
        }
        return false;
    }

    public final void e() {
        c cVar;
        Handler handler;
        Spatializer spatializer = this.f4091a;
        if (spatializer != null && (cVar = this.d) != null && (handler = this.f4093c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(cVar);
            handler.removeCallbacksAndMessages(null);
        }
    }
}
