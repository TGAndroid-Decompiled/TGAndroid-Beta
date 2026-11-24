package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.List;
public final class l40 implements s00 {
    public static final qbb k = vue.a(new k40((byte) 0));
    public final Context a;
    public final ie7 b;
    public final m93 c;
    public final l69 d;
    public a66 e;
    public adb f;
    public rz g;
    public uz h;
    public Looper i;
    public Context j;

    public l40(wtc wtcVar) {
        l69 l69Var;
        Context context = (Context) wtcVar.a;
        this.a = context;
        m93 m93Var = (m93) wtcVar.b;
        m93Var.getClass();
        this.c = m93Var;
        this.b = (ie7) wtcVar.c;
        this.g = (rz) wtcVar.d;
        if (context == null) {
            l69Var = null;
        } else {
            l69Var = new l69(this, (byte) 8);
        }
        this.d = l69Var;
        this.f = adb.a;
    }

    public final j40 a(r00 r00Var) {
        Context context;
        AudioAttributes b;
        Context context2;
        try {
            int i = r00Var.h;
            int i2 = r00Var.i;
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
            AudioFormat build = new AudioFormat.Builder().setSampleRate(r00Var.b).setChannelMask(r00Var.c).setEncoding(r00Var.a).build();
            nz nzVar = r00Var.g;
            if (r00Var.d) {
                b = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b = nzVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(r00Var.f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(r00Var.e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new j40(build2, r00Var, this.d, this.f);
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

    public final o00 b(n00 n00Var) {
        e(n00Var);
        fm4 fm4Var = (fm4) n00Var.a;
        nz nzVar = (nz) n00Var.b;
        k00 a = this.c.a(nzVar, fm4Var);
        ?? obj = new Object();
        byte b = 0;
        obj.d = (byte) 0;
        String str = fm4Var.t;
        int i = fm4Var.Q;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(nzVar, fm4Var) != null : i == 2) {
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
            sc8.j("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        ?? obj2 = new Object();
        obj2.a = obj.a;
        obj2.b = obj.b;
        obj2.c = obj.c;
        obj2.d = obj.d;
        return obj2;
    }

    public final defpackage.r00 c(defpackage.n00 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l40.c(n00):r00");
    }

    public final void d() {
        ska skaVar;
        a66 a66Var = this.e;
        if (a66Var != null) {
            a66Var.d();
        }
        uz uzVar = this.h;
        if (uzVar != null) {
            Context context = uzVar.a;
            if (uzVar.k) {
                uzVar.h = null;
                i00.e(context).unregisterAudioDeviceCallback(uzVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (skaVar = uzVar.g) != null) {
                    skaVar.e();
                    uzVar.g = null;
                }
                context.unregisterReceiver(uzVar.e);
                tz tzVar = uzVar.f;
                if (tzVar != null) {
                    tzVar.a.unregisterContentObserver(tzVar);
                }
                uzVar.k = false;
            }
        }
    }

    public final void e(n00 n00Var) {
        rz b;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) n00Var.c;
        nz nzVar = (nz) n00Var.b;
        f();
        uz uzVar = this.h;
        if (uzVar == null) {
            Context context = this.a;
            if (context != null) {
                uz uzVar2 = new uz(context, new l0(this, (byte) 23), nzVar, audioDeviceInfo);
                this.h = uzVar2;
                if (uzVar2.k) {
                    b = uzVar2.h;
                    b.getClass();
                } else {
                    uzVar2.k = true;
                    tz tzVar = uzVar2.f;
                    if (tzVar != null) {
                        tzVar.a.registerContentObserver(tzVar.b, false, tzVar);
                    }
                    Context context2 = uzVar2.a;
                    AudioManager e = i00.e(context2);
                    sz szVar = uzVar2.d;
                    Handler handler = uzVar2.c;
                    e.registerAudioDeviceCallback(szVar, handler);
                    if (Build.VERSION.SDK_INT >= 32 && uzVar2.g == null) {
                        uzVar2.g = new ska(context2, new oz(uzVar2, (byte) 1), Boolean.valueOf(g8c.Q(context2)));
                    }
                    b = rz.b(context2, context2.registerReceiver(uzVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), uzVar2.j, uzVar2.i, uzVar2.a());
                    uzVar2.h = b;
                }
                this.g = b;
            }
        } else {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(uzVar.i)) {
                uzVar.i = audioDeviceInfo;
                Context context3 = uzVar.a;
                nz nzVar2 = uzVar.j;
                List a = uzVar.a();
                w59 w59Var = rz.e;
                uzVar.b(rz.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), nzVar2, audioDeviceInfo, a));
            }
            uz uzVar3 = this.h;
            if (!Objects.equals(nzVar, uzVar3.j)) {
                uzVar3.j = nzVar;
                Context context4 = uzVar3.a;
                AudioDeviceInfo audioDeviceInfo2 = uzVar3.i;
                List a2 = uzVar3.a();
                w59 w59Var2 = rz.e;
                uzVar3.b(rz.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), nzVar, audioDeviceInfo2, a2));
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
            sc8.j(nue.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
        }
    }
}
