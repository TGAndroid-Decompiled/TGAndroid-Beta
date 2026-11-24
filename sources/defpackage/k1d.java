package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;
public final class k1d extends o59 {
    public final byte a;
    public final Object b;

    public k1d(Object obj, Looper looper, byte b) {
        super(looper, (byte) 1);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                m1d m1dVar = (m1d) this.b;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("Unknown message id: ");
                        sb.append(i);
                        Log.w("GoogleApiClientImpl", sb.toString());
                        return;
                    }
                    m1dVar.g();
                    return;
                }
                ReentrantLock reentrantLock = m1dVar.b;
                reentrantLock.lock();
                try {
                    if (m1dVar.e()) {
                        m1dVar.i();
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 != 2) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 20);
                        sb2.append("Unknown message id: ");
                        sb2.append(i2);
                        Log.w("GACStateManager", sb2.toString());
                        return;
                    }
                    throw ((RuntimeException) message.obj);
                }
                q1d q1dVar = (q1d) message.obj;
                r1d r1dVar = (r1d) this.b;
                q1dVar.getClass();
                r1dVar.a.lock();
                try {
                    if (r1dVar.m == q1dVar.a) {
                        q1dVar.a();
                    }
                    return;
                } finally {
                    r1dVar.a.unlock();
                }
        }
    }
}
