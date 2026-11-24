package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class op6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public op6(TLObject tLObject, oc7 oc7Var, z0a z0aVar) {
        this.a = (byte) 21;
        this.d = tLObject;
        this.c = oc7Var;
        this.b = z0aVar;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.c;
        Handler handler = (Handler) this.b;
        a86 a86Var = (a86) this.d;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new f00(a86Var, (byte) 5));
            }
            synchronized (j50.s) {
                int i = j50.u - 1;
                j50.u = i;
                if (i == 0) {
                    ScheduledExecutorService scheduledExecutorService = j50.t;
                    scheduledExecutorService.getClass();
                    scheduledExecutorService.shutdown();
                    j50.t = null;
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new f00(a86Var, (byte) 5));
            }
            synchronized (j50.s) {
                int i2 = j50.u - 1;
                j50.u = i2;
                if (i2 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = j50.t;
                    scheduledExecutorService2.getClass();
                    scheduledExecutorService2.shutdown();
                    j50.t = null;
                }
                throw th;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op6.run():void");
    }

    public op6(Object obj, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = tLObject;
        this.b = obj2;
    }

    public op6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public op6(TLRPC.TL_error tL_error, qac qacVar, qac qacVar2) {
        this.a = (byte) 22;
        this.b = tL_error;
        this.c = qacVar;
        this.d = qacVar2;
    }
}
