package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class g01 implements mz0 {
    public final HandlerThread a;
    public final Handler b;
    public final i01 c;
    public final xz0 d;
    public final NativeInstance e;
    public final f01 f;
    public final Object g = new Object();
    public boolean h;
    public final e01 i;

    public g01(int i, TLRPC.InputGroupCall inputGroupCall, int i2, NativeInstance nativeInstance, f01 f01Var) {
        this.e = nativeInstance;
        this.f = f01Var;
        HandlerThread handlerThread = new HandlerThread("BroadcastListener");
        this.a = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.b = handler;
        this.c = new i01(i, inputGroupCall, i2, false, new i40(handler, (byte) 0), null);
        this.d = new xz0(this, true);
        this.i = new e01(nativeInstance);
    }

    @Override
    public final void b(tz0 tz0Var) {
        synchronized (this.g) {
            if (this.h) {
                return;
            }
            int i = tz0Var.d;
            if (i > 0 && !this.e.deliverListenerAudio(tz0Var.a, tz0Var.c, i)) {
                c("segment " + tz0Var.a + " was not queued");
            }
            ArrayList arrayList = tz0Var.f;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                wz0 wz0Var = (wz0) obj;
                if (!this.i.a(tz0Var.a, wz0Var)) {
                    this.e.deliverListenerVideo(tz0Var.a, wz0Var.d, wz0Var.e);
                }
            }
        }
    }

    @Override
    public final void c(String str) {
        if (f11.a) {
            cc4.b("[BroadcastListener] ".concat(str));
        }
    }

    @Override
    public final void e(dz0 dz0Var) {
        this.c.b(dz0Var);
    }

    @Override
    public final void f() {
        boolean z;
        f01 f01Var = this.f;
        synchronized (this.g) {
            z = this.h;
        }
        if (!z) {
            f01Var.onRejoinRequested();
        }
    }

    @Override
    public final void g(long j, int i, long j2) {
        synchronized (this.g) {
            if (this.h) {
                return;
            }
            this.e.playListenerAudio(j, j2 * 1000, i);
            this.i.d(j, i, j2);
        }
    }

    @Override
    public final long h() {
        return System.nanoTime() / 1000000;
    }

    @Override
    public final wg i(qz0 qz0Var, pz0 pz0Var) {
        return this.c.a(qz0Var, new o(qz0Var, pz0Var, (byte) 28));
    }

    @Override
    public final lz0 j(Runnable runnable, long j) {
        a30 a30Var = new a30(this, runnable, (byte) 26);
        this.b.postDelayed(a30Var, Math.max(0L, j));
        return new o(this, a30Var, (byte) 27);
    }

    public final void k() {
        synchronized (this.g) {
            this.h = true;
        }
        e01 e01Var = this.i;
        e01Var.f = true;
        ArrayList arrayList = new ArrayList(e01Var.b.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e01Var.e((String) obj);
        }
        e01Var.e.clear();
        this.b.post(new fv0(this, (byte) 8));
    }

    @Override
    public final void a(float f) {
    }

    @Override
    public final void d(long j) {
    }
}
