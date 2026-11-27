package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class es6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public es6(TLObject tLObject, uc7 uc7Var, r2a r2aVar) {
        this.a = (byte) 22;
        this.d = tLObject;
        this.c = uc7Var;
        this.b = r2aVar;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.c;
        Handler handler = (Handler) this.b;
        e86 e86Var = (e86) this.d;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new pz(e86Var, (byte) 3));
            }
            synchronized (l40.s) {
                int i = l40.u - 1;
                l40.u = i;
                if (i == 0) {
                    ScheduledExecutorService scheduledExecutorService = l40.t;
                    scheduledExecutorService.getClass();
                    scheduledExecutorService.shutdown();
                    l40.t = null;
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new pz(e86Var, (byte) 3));
            }
            synchronized (l40.s) {
                int i2 = l40.u - 1;
                l40.u = i2;
                if (i2 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = l40.t;
                    scheduledExecutorService2.getClass();
                    scheduledExecutorService2.shutdown();
                    l40.t = null;
                }
                throw th;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es6.run():void");
    }

    public es6(Object obj, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = tLObject;
        this.b = obj2;
    }

    public es6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public es6(TLRPC.TL_error tL_error, pcc pccVar, pcc pccVar2) {
        this.a = (byte) 20;
        this.b = tL_error;
        this.c = pccVar;
        this.d = pccVar2;
    }
}
