package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;
public final class m3d extends q79 {
    public final byte a;
    public final Object b;

    public m3d(Object obj, Looper looper, byte b) {
        super(looper, (byte) 1);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                o3d o3dVar = (o3d) this.b;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("Unknown message id: ");
                        sb.append(i);
                        Log.w("GoogleApiClientImpl", sb.toString());
                        return;
                    }
                    o3dVar.g();
                    return;
                }
                ReentrantLock reentrantLock = o3dVar.b;
                reentrantLock.lock();
                try {
                    if (o3dVar.e()) {
                        o3dVar.i();
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
                s3d s3dVar = (s3d) message.obj;
                t3d t3dVar = (t3d) this.b;
                s3dVar.getClass();
                t3dVar.a.lock();
                try {
                    if (t3dVar.m == s3dVar.a) {
                        s3dVar.a();
                    }
                    return;
                } finally {
                    t3dVar.a.unlock();
                }
        }
    }
}
