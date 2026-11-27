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
public final class n40 implements t00 {
    public static final mfb k = nze.a(new m40((byte) 0));
    public final Context a;
    public final sg7 b;
    public final fa3 c;
    public final ri6 d;
    public e86 e;
    public vgb f;
    public sz g;
    public vz h;
    public Looper i;
    public Context j;

    public n40(lyc lycVar) {
        ri6 ri6Var;
        Context context = (Context) lycVar.b;
        this.a = context;
        fa3 fa3Var = (fa3) lycVar.c;
        fa3Var.getClass();
        this.c = fa3Var;
        this.b = (sg7) lycVar.d;
        this.g = (sz) lycVar.e;
        if (context == null) {
            ri6Var = null;
        } else {
            ri6Var = new ri6(this, (byte) 7);
        }
        this.d = ri6Var;
        this.f = vgb.a;
    }

    public final l40 a(s00 s00Var) {
        Context context;
        AudioAttributes b;
        Context context2;
        try {
            int i = s00Var.h;
            int i2 = s00Var.i;
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
            AudioFormat build = new AudioFormat.Builder().setSampleRate(s00Var.b).setChannelMask(s00Var.c).setEncoding(s00Var.a).build();
            oz ozVar = s00Var.g;
            if (s00Var.d) {
                b = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b = ozVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(s00Var.f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(s00Var.e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new l40(build2, s00Var, this.d, this.f);
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

    public final p00 b(o00 o00Var) {
        e(o00Var);
        ko4 ko4Var = (ko4) o00Var.a;
        oz ozVar = (oz) o00Var.b;
        l00 a = this.c.a(ozVar, ko4Var);
        ?? obj = new Object();
        byte b = 0;
        obj.d = (byte) 0;
        String str = ko4Var.t;
        int i = ko4Var.Q;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(ozVar, ko4Var) != null : i == 2) {
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
            grb.i("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        ?? obj2 = new Object();
        obj2.a = obj.a;
        obj2.b = obj.b;
        obj2.c = obj.c;
        obj2.d = obj.d;
        return obj2;
    }

    public final defpackage.s00 c(defpackage.o00 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.c(o00):s00");
    }

    public final void d() {
        moa moaVar;
        e86 e86Var = this.e;
        if (e86Var != null) {
            e86Var.d();
        }
        vz vzVar = this.h;
        if (vzVar != null) {
            Context context = (Context) vzVar.b;
            if (vzVar.a) {
                vzVar.r = null;
                j00.e(context).unregisterAudioDeviceCallback((tz) vzVar.e);
                if (Build.VERSION.SDK_INT >= 32 && (moaVar = (moa) vzVar.n) != null) {
                    moaVar.e();
                    vzVar.n = null;
                }
                context.unregisterReceiver((ak) vzVar.f);
                uz uzVar = (uz) vzVar.h;
                if (uzVar != null) {
                    uzVar.a.unregisterContentObserver(uzVar);
                }
                vzVar.a = false;
            }
        }
    }

    public final void e(o00 o00Var) {
        sz b;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) o00Var.c;
        oz ozVar = (oz) o00Var.b;
        f();
        vz vzVar = this.h;
        if (vzVar == null) {
            Context context = this.a;
            if (context != null) {
                vz vzVar2 = new vz(context, new m0(this, (byte) 23), ozVar, audioDeviceInfo);
                this.h = vzVar2;
                Handler handler = (Handler) vzVar2.d;
                Context context2 = (Context) vzVar2.b;
                if (vzVar2.a) {
                    b = (sz) vzVar2.r;
                    b.getClass();
                } else {
                    vzVar2.a = true;
                    uz uzVar = (uz) vzVar2.h;
                    if (uzVar != null) {
                        uzVar.a.registerContentObserver(uzVar.b, false, uzVar);
                    }
                    j00.e(context2).registerAudioDeviceCallback((tz) vzVar2.e, handler);
                    if (Build.VERSION.SDK_INT >= 32 && ((moa) vzVar2.n) == null) {
                        vzVar2.n = new moa(context2, new pz(vzVar2, (byte) 1), Boolean.valueOf(gcc.Q(context2)));
                    }
                    b = sz.b(context2, context2.registerReceiver((ak) vzVar2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (oz) vzVar2.w, (AudioDeviceInfo) vzVar2.s, vzVar2.j());
                    vzVar2.r = b;
                }
                this.g = b;
            }
        } else {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) vzVar.s)) {
                vzVar.s = audioDeviceInfo;
                Context context3 = (Context) vzVar.b;
                List j = vzVar.j();
                j99 j99Var = sz.e;
                vzVar.k(sz.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), (oz) vzVar.w, audioDeviceInfo, j));
            }
            vz vzVar3 = this.h;
            if (!Objects.equals(ozVar, (oz) vzVar3.w)) {
                vzVar3.w = ozVar;
                Context context4 = (Context) vzVar3.b;
                List j2 = vzVar3.j();
                j99 j99Var2 = sz.e;
                vzVar3.k(sz.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ozVar, (AudioDeviceInfo) vzVar3.s, j2));
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
            grb.i(fze.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
        }
    }
}
