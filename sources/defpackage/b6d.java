package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;
public final class b6d extends b99 {
    public final byte a;
    public final Object b;

    public b6d(Object obj, Looper looper, byte b) {
        super(looper, (byte) 1);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                d6d d6dVar = (d6d) this.b;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("Unknown message id: ");
                        sb.append(i);
                        Log.w("GoogleApiClientImpl", sb.toString());
                        return;
                    }
                    d6dVar.g();
                    return;
                }
                ReentrantLock reentrantLock = d6dVar.b;
                reentrantLock.lock();
                try {
                    if (d6dVar.e()) {
                        d6dVar.i();
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
                h6d h6dVar = (h6d) message.obj;
                i6d i6dVar = (i6d) this.b;
                h6dVar.getClass();
                i6dVar.a.lock();
                try {
                    if (i6dVar.m == h6dVar.a) {
                        h6dVar.a();
                    }
                    return;
                } finally {
                    i6dVar.a.unlock();
                }
        }
    }
}
