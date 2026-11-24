package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.List;
public final class ska {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final rka d;

    public ska(Context context, Runnable runnable, Boolean bool) {
        AudioManager e;
        boolean z;
        if (context == null) {
            e = null;
        } else {
            e = i00.e(context);
        }
        if (e != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = e.getSpatializer();
            this.a = spatializer;
            if (spatializer.getImmersiveAudioLevel() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.c = handler;
            rka rkaVar = new rka(runnable);
            this.d = rkaVar;
            spatializer.addOnSpatializerStateChangedListener(new g40(handler, (byte) 0), rkaVar);
            return;
        }
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }

    public final boolean a(nz nzVar, fm4 fm4Var) {
        int i;
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = fm4Var.t;
        int i2 = fm4Var.N;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i2 == 16) {
                i = 12;
            }
            i = i2;
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i2 == -1) {
                i = 6;
            }
            i = i2;
        } else {
            if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
                i = 24;
            }
            i = i2;
        }
        int i3 = fm4Var.O;
        if (i3 == -1 || i2 != i) {
            i3 = g8c.t(i);
        }
        if (i3 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i3);
        int i4 = fm4Var.P;
        if (i4 != -1) {
            channelMask.setSampleRate(i4);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(nzVar.b(), channelMask.build());
    }

    public final List b() {
        if (this.a != null && this.b && c() && d()) {
            if (Build.VERSION.SDK_INT >= 36) {
                Spatializer spatializer = this.a;
                spatializer.getClass();
                return spatializer.getSpatializedChannelMasks();
            }
            return mm5.u(252);
        }
        km5 km5Var = mm5.b;
        return w59.e;
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        if (spatializer != null && spatializer.isAvailable()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        Spatializer spatializer = this.a;
        if (spatializer != null && spatializer.isEnabled()) {
            return true;
        }
        return false;
    }

    public final void e() {
        rka rkaVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer != null && (rkaVar = this.d) != null && (handler = this.c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(rkaVar);
            handler.removeCallbacksAndMessages(null);
        }
    }
}
