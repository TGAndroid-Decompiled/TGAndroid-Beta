package n2;

import a8.ma;
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
import h9.t1;
import hi.t5;
import j$.util.Objects;
import java.util.List;
import kg.x1;
public final class i0 implements o {
    public final Context f21158a;
    public final s0 f21159b;
    public final l0 f21160c;
    public final t5 d;
    public final float f21161e;
    public h2.r f21162f;
    public h2.g0 f21163g;
    public b h;
    public e f21164i;
    public Looper f21165j;
    public Context f21166k;

    public i0(h0 h0Var) {
        t5 t5Var;
        Context context = h0Var.f21148a;
        this.f21158a = context;
        l0 l0Var = h0Var.f21149b;
        l0Var.getClass();
        this.f21160c = l0Var;
        this.f21159b = h0Var.f21150c;
        this.h = h0Var.d;
        if (context == null) {
            t5Var = null;
        } else {
            t5Var = new t5(this, 16);
        }
        this.d = t5Var;
        this.f21161e = h0Var.f21151e;
        this.f21163g = h2.g0.f13792a;
    }

    public final g0 a(n nVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i7 = nVar.h;
            int i10 = nVar.f21216i;
            if (i10 != -1 && (context2 = this.f21158a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f21166k;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.f21166k = context2.createDeviceContext(i10);
                }
                context = this.f21166k;
                i7 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(nVar.f21211b).setChannelMask(nVar.f21212c).setEncoding(nVar.f21210a).build();
            e2.e eVar = nVar.f21215g;
            if (nVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = eVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(nVar.f21214f).setSessionId(i7);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(nVar.f21213e);
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new g0(build2, nVar, this.d, this.f21161e, this.f21163g);
            }
            try {
                build2.release();
            } catch (Exception unused) {
            }
            throw new Exception();
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new Exception(e);
        } catch (UnsupportedOperationException e11) {
            e = e11;
            throw new Exception(e);
        }
    }

    public final k b(i iVar) {
        e(iVar);
        e2.u uVar = iVar.f21152a;
        e2.e eVar = iVar.f21153b;
        f a10 = this.f21160c.a(eVar, uVar);
        j jVar = new j();
        String str = uVar.f10798s;
        int i7 = uVar.M;
        int i10 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(eVar, uVar) != null : i7 == 2) {
            i10 = 2;
        }
        jVar.f21167a = i10;
        jVar.f21168b = a10.f21121a;
        jVar.f21169c = a10.f21122b;
        jVar.d = a10.f21123c;
        return jVar.a();
    }

    public final n2.n c(n2.i r25) {
        throw new UnsupportedOperationException("Method not decompiled: n2.i0.c(n2.i):n2.n");
    }

    public final void d() {
        c3.d dVar;
        h2.r rVar = this.f21162f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.f21164i;
        if (eVar != null) {
            Context context = eVar.f21111a;
            if (eVar.f21119k) {
                eVar.h = null;
                f2.i.d(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f21116g) != null) {
                    dVar.e();
                    eVar.f21116g = null;
                }
                context.unregisterReceiver(eVar.f21114e);
                d dVar2 = eVar.f21115f;
                if (dVar2 != null) {
                    dVar2.f21107a.unregisterContentObserver(dVar2);
                }
                eVar.f21119k = false;
            }
        }
    }

    public final void e(i iVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = iVar.f21154c;
        e2.e eVar = iVar.f21153b;
        f();
        e eVar2 = this.f21164i;
        if (eVar2 == null && (context = this.f21158a) != null) {
            e eVar3 = new e(context, new x1(this, 18), eVar, audioDeviceInfo);
            this.f21164i = eVar3;
            if (eVar3.f21119k) {
                b10 = eVar3.h;
                b10.getClass();
            } else {
                eVar3.f21119k = true;
                d dVar = eVar3.f21115f;
                if (dVar != null) {
                    dVar.f21107a.registerContentObserver(dVar.f21108b, false, dVar);
                }
                Context context2 = eVar3.f21111a;
                AudioManager d = f2.i.d(context2);
                c cVar = eVar3.d;
                Handler handler = eVar3.f21113c;
                d.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar3.f21116g == null) {
                    eVar3.f21116g = new c3.d(context2, new kg.i0(eVar3, 21), Boolean.valueOf(h2.l0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar3.f21114e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar3.f21118j, eVar3.f21117i, eVar3.a());
                eVar3.h = b10;
            }
            this.h = b10;
        } else if (eVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar2.f21117i)) {
                eVar2.f21117i = audioDeviceInfo;
                Context context3 = eVar2.f21111a;
                e2.e eVar4 = eVar2.f21118j;
                List a10 = eVar2.a();
                t1 t1Var = b.f21096e;
                eVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar4, audioDeviceInfo, a10));
            }
            e eVar5 = this.f21164i;
            if (!Objects.equals(eVar, eVar5.f21118j)) {
                eVar5.f21118j = eVar;
                Context context4 = eVar5.f21111a;
                AudioDeviceInfo audioDeviceInfo2 = eVar5.f21117i;
                List a11 = eVar5.a();
                t1 t1Var2 = b.f21096e;
                eVar5.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, audioDeviceInfo2, a11));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z10;
        String name;
        if (this.f21158a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f21165j;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
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
        if (z10) {
            this.f21165j = myLooper;
            return;
        }
        throw new IllegalStateException(ma.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
