package k2;

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
import e9.x1;
import j$.util.Objects;
import java.util.List;
import ji.h5;
import ji.m5;
import v7.v6;
public final class j0 implements p {
    public final Context f13917a;
    public final t0 f13918b;
    public final m0 f13919c;
    public final h5 d;
    public final float e;
    public e2.r f13920f;
    public e2.g0 f13921g;
    public b h;
    public e f13922i;
    public Looper f13923j;
    public Context f13924k;

    public j0(i0 i0Var) {
        h5 h5Var;
        Context context = i0Var.f13909a;
        this.f13917a = context;
        m0 m0Var = i0Var.f13910b;
        m0Var.getClass();
        this.f13919c = m0Var;
        this.f13918b = i0Var.f13911c;
        this.h = i0Var.d;
        if (context == null) {
            h5Var = null;
        } else {
            h5Var = new h5(this, 1);
        }
        this.d = h5Var;
        this.e = i0Var.e;
        this.f13921g = e2.g0.f8352a;
    }

    public final h0 a(o oVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i10 = oVar.h;
            int i11 = oVar.f13971i;
            if (i11 != -1 && (context2 = this.f13917a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f13924k;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f13924k = context2.createDeviceContext(i11);
                }
                context = this.f13924k;
                i10 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(oVar.f13967b).setChannelMask(oVar.f13968c).setEncoding(oVar.f13966a).build();
            b2.f fVar = oVar.f13970g;
            if (oVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = fVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(oVar.f13969f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(oVar.e);
            }
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new h0(build2, oVar, this.d, this.e, this.f13921g);
            }
            try {
                build2.release();
            } catch (Exception unused) {
            }
            throw new Exception();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new Exception(e);
        } catch (UnsupportedOperationException e7) {
            e = e7;
            throw new Exception(e);
        }
    }

    public final l b(j jVar) {
        e(jVar);
        b2.x xVar = jVar.f13912a;
        b2.f fVar = jVar.f13913b;
        g b10 = this.f13919c.b(fVar, xVar);
        k kVar = new k();
        String str = xVar.f2523s;
        int i10 = xVar.M;
        int i11 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, xVar) != null : i10 == 2) {
            i11 = 2;
        }
        kVar.f13925a = i11;
        kVar.f13926b = b10.f13883a;
        kVar.f13927c = b10.f13884b;
        kVar.d = b10.f13885c;
        return kVar.a();
    }

    public final k2.o c(k2.j r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.j0.c(k2.j):k2.o");
    }

    public final void d() {
        z2.d dVar;
        e2.r rVar = this.f13920f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.f13922i;
        if (eVar != null) {
            Context context = eVar.f13872a;
            if (eVar.f13879k) {
                eVar.h = null;
                c2.i.e(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f13876g) != null) {
                    dVar.e();
                    eVar.f13876g = null;
                }
                context.unregisterReceiver(eVar.e);
                d dVar2 = eVar.f13875f;
                if (dVar2 != null) {
                    dVar2.f13866a.unregisterContentObserver(dVar2);
                }
                eVar.f13879k = false;
            }
        }
    }

    public final void e(j jVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = jVar.f13914c;
        b2.f fVar = jVar.f13913b;
        f();
        e eVar = this.f13922i;
        if (eVar == null && (context = this.f13917a) != null) {
            e eVar2 = new e(context, new m5(this, 1), fVar, audioDeviceInfo);
            this.f13922i = eVar2;
            if (eVar2.f13879k) {
                b10 = eVar2.h;
                b10.getClass();
            } else {
                eVar2.f13879k = true;
                d dVar = eVar2.f13875f;
                if (dVar != null) {
                    dVar.f13866a.registerContentObserver(dVar.f13867b, false, dVar);
                }
                Context context2 = eVar2.f13872a;
                AudioManager e = c2.i.e(context2);
                c cVar = eVar2.d;
                Handler handler = eVar2.f13874c;
                e.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar2.f13876g == null) {
                    eVar2.f13876g = new z2.d(context2, new ig.t0(eVar2, 12), Boolean.valueOf(e2.m0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar2.f13878j, eVar2.f13877i, eVar2.a());
                eVar2.h = b10;
            }
            this.h = b10;
        } else if (eVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar.f13877i)) {
                eVar.f13877i = audioDeviceInfo;
                Context context3 = eVar.f13872a;
                b2.f fVar2 = eVar.f13878j;
                List a2 = eVar.a();
                x1 x1Var = b.e;
                eVar.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a2));
            }
            e eVar3 = this.f13922i;
            if (!Objects.equals(fVar, eVar3.f13878j)) {
                eVar3.f13878j = fVar;
                Context context4 = eVar3.f13872a;
                AudioDeviceInfo audioDeviceInfo2 = eVar3.f13877i;
                List a10 = eVar3.a();
                x1 x1Var2 = b.e;
                eVar3.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo2, a10));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z10;
        String name;
        if (this.f13917a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f13923j;
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
            this.f13923j = myLooper;
            return;
        }
        throw new IllegalStateException(v6.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
