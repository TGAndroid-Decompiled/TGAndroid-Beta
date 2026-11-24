package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nn6 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public nn6(TLObject tLObject, na7 na7Var, xy9 xy9Var) {
        this.a = (byte) 21;
        this.d = tLObject;
        this.c = na7Var;
        this.b = xy9Var;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.c;
        Handler handler = (Handler) this.b;
        a66 a66Var = (a66) this.d;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new oz(a66Var, (byte) 3));
            }
            synchronized (j40.s) {
                int i = j40.u - 1;
                j40.u = i;
                if (i == 0) {
                    ScheduledExecutorService scheduledExecutorService = j40.t;
                    scheduledExecutorService.getClass();
                    scheduledExecutorService.shutdown();
                    j40.t = null;
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new oz(a66Var, (byte) 3));
            }
            synchronized (j40.s) {
                int i2 = j40.u - 1;
                j40.u = i2;
                if (i2 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = j40.t;
                    scheduledExecutorService2.getClass();
                    scheduledExecutorService2.shutdown();
                    j40.t = null;
                }
                throw th;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn6.run():void");
    }

    public nn6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public nn6(byte b, Object obj, Object obj2, TLObject tLObject) {
        this.a = b;
        this.c = obj;
        this.d = tLObject;
        this.b = obj2;
    }

    public nn6(TLRPC.TL_error tL_error, p8c p8cVar, p8c p8cVar2) {
        this.a = (byte) 22;
        this.b = tL_error;
        this.c = p8cVar;
        this.d = p8cVar2;
    }
}
