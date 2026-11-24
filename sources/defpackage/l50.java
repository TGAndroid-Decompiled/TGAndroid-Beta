package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.List;
public final class l50 implements s10 {
    public static final sdb k = xwe.a(new k50((byte) 0));
    public final Context a;
    public final kg7 b;
    public final ya3 c;
    public final ni6 d;
    public a86 e;
    public bfb f;
    public r00 g;
    public u00 h;
    public Looper i;
    public Context j;

    public l50(xvc xvcVar) {
        ni6 ni6Var;
        Context context = (Context) xvcVar.b;
        this.a = context;
        ya3 ya3Var = (ya3) xvcVar.c;
        ya3Var.getClass();
        this.c = ya3Var;
        this.b = (kg7) xvcVar.d;
        this.g = (r00) xvcVar.e;
        if (context == null) {
            ni6Var = null;
        } else {
            ni6Var = new ni6(this, (byte) 7);
        }
        this.d = ni6Var;
        this.f = bfb.a;
    }

    public final j50 a(r10 r10Var) {
        Context context;
        AudioAttributes b;
        Context context2;
        try {
            int i = r10Var.h;
            int i2 = r10Var.i;
            if (i2 != -1 && (context2 = this.a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.j;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.j = context2.createDeviceContext(i2);
                }
                context = this.j;
                i = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(r10Var.b).setChannelMask(r10Var.c).setEncoding(r10Var.a).build();
            o00 o00Var = r10Var.g;
            if (r10Var.d) {
                b = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b = o00Var.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(r10Var.f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(r10Var.e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new j50(build2, r10Var, this.d, this.f);
            }
            try {
                build2.release();
            } catch (Exception unused) {
            }
            throw new Exception();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new Exception(e);
        }
    }

    public final o10 b(n10 n10Var) {
        e(n10Var);
        go4 go4Var = (go4) n10Var.a;
        o00 o00Var = (o00) n10Var.b;
        k10 a = this.c.a(o00Var, go4Var);
        ?? obj = new Object();
        byte b = 0;
        obj.d = (byte) 0;
        String str = go4Var.t;
        int i = go4Var.Q;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(o00Var, go4Var) != null : i == 2) {
            b = 2;
        }
        obj.d = b;
        boolean z = a.a;
        obj.a = z;
        boolean z2 = a.b;
        obj.b = z2;
        boolean z3 = a.c;
        obj.c = z3;
        if (!z && (z2 || z3)) {
            dq9.m("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        ?? obj2 = new Object();
        obj2.a = obj.a;
        obj2.b = obj.b;
        obj2.c = obj.c;
        obj2.d = obj.d;
        return obj2;
    }

    public final defpackage.r10 c(defpackage.n10 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l50.c(n10):r10");
    }

    public final void d() {
        tma tmaVar;
        a86 a86Var = this.e;
        if (a86Var != null) {
            a86Var.d();
        }
        u00 u00Var = this.h;
        if (u00Var != null) {
            Context context = (Context) u00Var.b;
            if (u00Var.a) {
                u00Var.r = null;
                i10.e(context).unregisterAudioDeviceCallback((s00) u00Var.e);
                if (Build.VERSION.SDK_INT >= 32 && (tmaVar = (tma) u00Var.n) != null) {
                    tmaVar.e();
                    u00Var.n = null;
                }
                context.unregisterReceiver((zk) u00Var.f);
                t00 t00Var = (t00) u00Var.h;
                if (t00Var != null) {
                    t00Var.a.unregisterContentObserver(t00Var);
                }
                u00Var.a = false;
            }
        }
    }

    public final void e(n10 n10Var) {
        r00 b;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) n10Var.c;
        o00 o00Var = (o00) n10Var.b;
        f();
        u00 u00Var = this.h;
        if (u00Var == null) {
            Context context = this.a;
            if (context != null) {
                u00 u00Var2 = new u00(context, new l0(this, (byte) 25), o00Var, audioDeviceInfo);
                this.h = u00Var2;
                Handler handler = (Handler) u00Var2.d;
                Context context2 = (Context) u00Var2.b;
                if (u00Var2.a) {
                    b = (r00) u00Var2.r;
                    b.getClass();
                } else {
                    u00Var2.a = true;
                    t00 t00Var = (t00) u00Var2.h;
                    if (t00Var != null) {
                        t00Var.a.registerContentObserver(t00Var.b, false, t00Var);
                    }
                    i10.e(context2).registerAudioDeviceCallback((s00) u00Var2.e, handler);
                    if (Build.VERSION.SDK_INT >= 32 && ((tma) u00Var2.n) == null) {
                        u00Var2.n = new tma(context2, new f00(u00Var2, (byte) 3), Boolean.valueOf(hac.Q(context2)));
                    }
                    b = r00.b(context2, context2.registerReceiver((zk) u00Var2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (o00) u00Var2.w, (AudioDeviceInfo) u00Var2.s, u00Var2.j());
                    u00Var2.r = b;
                }
                this.g = b;
            }
        } else {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) u00Var.s)) {
                u00Var.s = audioDeviceInfo;
                Context context3 = (Context) u00Var.b;
                List j = u00Var.j();
                y79 y79Var = r00.e;
                u00Var.k(r00.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), (o00) u00Var.w, audioDeviceInfo, j));
            }
            u00 u00Var3 = this.h;
            if (!Objects.equals(o00Var, (o00) u00Var3.w)) {
                u00Var3.w = o00Var;
                Context context4 = (Context) u00Var3.b;
                List j2 = u00Var3.j();
                y79 y79Var2 = r00.e;
                u00Var3.k(r00.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), o00Var, (AudioDeviceInfo) u00Var3.s, j2));
            }
        }
        this.g.getClass();
    }

    public final void f() {
        boolean z;
        String name;
        if (this.a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.i;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        String str = "null";
        if (looper == null) {
            name = "null";
        } else {
            name = looper.getThread().getName();
        }
        if (myLooper != null) {
            str = myLooper.getThread().getName();
        }
        if (z) {
            this.i = myLooper;
        } else {
            dq9.m(pwe.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
        }
    }
}
