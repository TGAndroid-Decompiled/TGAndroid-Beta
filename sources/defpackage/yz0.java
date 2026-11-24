package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class yz0 implements ez0 {
    public final HandlerThread a;
    public final Handler b;
    public final zz0 c;
    public final pz0 d;
    public final NativeInstance e;
    public final xz0 f;
    public final Object g = new Object();
    public boolean h;
    public final wz0 i;

    public yz0(int i, TLRPC.InputGroupCall inputGroupCall, int i2, NativeInstance nativeInstance, xz0 xz0Var) {
        this.e = nativeInstance;
        this.f = xz0Var;
        HandlerThread handlerThread = new HandlerThread("BroadcastListener");
        this.a = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.b = handler;
        this.c = new zz0(i, inputGroupCall, i2, false, new g40(handler, (byte) 0), null);
        this.d = new pz0(this, true);
        this.i = new wz0(nativeInstance);
    }

    @Override
    public final void b(lz0 lz0Var) {
        synchronized (this.g) {
            if (this.h) {
                return;
            }
            int i = lz0Var.d;
            if (i > 0 && !this.e.deliverListenerAudio(lz0Var.a, lz0Var.c, i)) {
                d("segment " + lz0Var.a + " was not queued");
            }
            ArrayList arrayList = lz0Var.f;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                oz0 oz0Var = (oz0) obj;
                if (!this.i.a(lz0Var.a, oz0Var)) {
                    this.e.deliverListenerVideo(lz0Var.a, oz0Var.d, oz0Var.e);
                }
            }
        }
    }

    @Override
    public final void d(String str) {
        if (w01.a) {
            fa4.b("[BroadcastListener] ".concat(str));
        }
    }

    @Override
    public final void e(vy0 vy0Var) {
        this.c.b(vy0Var);
    }

    @Override
    public final void f() {
        boolean z;
        xz0 xz0Var = this.f;
        synchronized (this.g) {
            z = this.h;
        }
        if (!z) {
            xz0Var.onRejoinRequested();
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
    public final jh i(iz0 iz0Var, hz0 hz0Var) {
        return this.c.a(iz0Var, new o(iz0Var, hz0Var, (byte) 27));
    }

    @Override
    public final dz0 j(Runnable runnable, long j) {
        z20 z20Var = new z20(this, runnable, (byte) 26);
        this.b.postDelayed(z20Var, Math.max(0L, j));
        return new o(this, z20Var, (byte) 26);
    }

    public final void k() {
        synchronized (this.g) {
            this.h = true;
        }
        wz0 wz0Var = this.i;
        wz0Var.f = true;
        ArrayList arrayList = new ArrayList(wz0Var.b.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wz0Var.e((String) obj);
        }
        wz0Var.e.clear();
        this.b.post(new nv0(this, (byte) 6));
    }

    @Override
    public final void a(float f) {
    }

    @Override
    public final void c(long j) {
    }
}
