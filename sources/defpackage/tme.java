package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class tme implements Runnable {
    public final byte a;
    public final l7f b;

    public tme(l7f l7fVar, byte b) {
        this.a = b;
        this.b = l7fVar;
    }

    private final void a() {
        while (true) {
            l7f l7fVar = this.b;
            synchronized (l7fVar) {
                if (l7fVar.a == 2) {
                    ArrayDeque arrayDeque = l7fVar.d;
                    if (arrayDeque.isEmpty()) {
                        l7fVar.d();
                        return;
                    }
                    ebf ebfVar = (ebf) arrayDeque.poll();
                    SparseArray sparseArray = l7fVar.e;
                    int i = ebfVar.a;
                    sparseArray.put(i, ebfVar);
                    ((ScheduledExecutorService) l7fVar.f.c).schedule(new tq4(l7fVar, ebfVar, (byte) 22), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(ebfVar)));
                    }
                    igf igfVar = l7fVar.f;
                    Messenger messenger = l7fVar.b;
                    byte b = ebfVar.c;
                    Message obtain = Message.obtain();
                    obtain.what = b;
                    obtain.arg1 = i;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", ebfVar.a());
                    bundle.putString("pkg", ((Context) igfVar.b).getPackageName());
                    bundle.putBundle("data", ebfVar.d);
                    obtain.setData(bundle);
                    try {
                        aec aecVar = l7fVar.c;
                        Messenger messenger2 = (Messenger) aecVar.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            hnd hndVar = (hnd) aecVar.c;
                            if (hndVar != null) {
                                hndVar.a.send(obtain);
                            } else {
                                throw new IllegalStateException("Both messengers are null");
                                break;
                            }
                        }
                    } catch (RemoteException e) {
                        l7fVar.b(e.getMessage());
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                l7f l7fVar = this.b;
                synchronized (l7fVar) {
                    if (l7fVar.a == 1) {
                        l7fVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                a();
                return;
            default:
                this.b.b("Service disconnected");
                return;
        }
    }
}
