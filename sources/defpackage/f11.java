package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class f11 implements l01 {
    public final HandlerThread a;
    public final Handler b;
    public final h11 c;
    public final w01 d;
    public final NativeInstance e;
    public final e11 f;
    public final Object g = new Object();
    public boolean h;
    public final d11 i;

    public f11(int i, TLRPC.InputGroupCall inputGroupCall, int i2, NativeInstance nativeInstance, e11 e11Var) {
        this.e = nativeInstance;
        this.f = e11Var;
        HandlerThread handlerThread = new HandlerThread("BroadcastListener");
        this.a = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.b = handler;
        this.c = new h11(i, inputGroupCall, i2, false, new g50(handler, (byte) 0), null);
        this.d = new w01(this, true);
        this.i = new d11(nativeInstance);
    }

    @Override
    public final void b(s01 s01Var) {
        synchronized (this.g) {
            if (this.h) {
                return;
            }
            int i = s01Var.d;
            if (i > 0 && !this.e.deliverListenerAudio(s01Var.a, s01Var.c, i)) {
                d("segment " + s01Var.a + " was not queued");
            }
            ArrayList arrayList = s01Var.f;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                v01 v01Var = (v01) obj;
                if (!this.i.a(s01Var.a, v01Var)) {
                    this.e.deliverListenerVideo(s01Var.a, v01Var.d, v01Var.e);
                }
            }
        }
    }

    @Override
    public final void d(String str) {
        if (e21.a) {
            fc4.b("[BroadcastListener] ".concat(str));
        }
    }

    @Override
    public final void e(c01 c01Var) {
        this.c.b(c01Var);
    }

    @Override
    public final void f() {
        boolean z;
        e11 e11Var = this.f;
        synchronized (this.g) {
            z = this.h;
        }
        if (!z) {
            e11Var.onRejoinRequested();
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
    public final ji i(p01 p01Var, o01 o01Var) {
        return this.c.a(p01Var, new o(p01Var, o01Var, (byte) 28));
    }

    @Override
    public final k01 j(Runnable runnable, long j) {
        x30 x30Var = new x30(this, runnable, (byte) 27);
        this.b.postDelayed(x30Var, Math.max(0L, j));
        return new o(this, x30Var, (byte) 27);
    }

    public final void k() {
        synchronized (this.g) {
            this.h = true;
        }
        d11 d11Var = this.i;
        d11Var.f = true;
        ArrayList arrayList = new ArrayList(d11Var.b.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d11Var.e((String) obj);
        }
        d11Var.e.clear();
        this.b.post(new yt0(this, (byte) 9));
    }

    @Override
    public final void a(float f) {
    }

    @Override
    public final void c(long j) {
    }
}
