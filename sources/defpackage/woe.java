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
public final class woe implements Runnable {
    public final byte a;
    public final n9f b;

    public woe(n9f n9fVar, byte b) {
        this.a = b;
        this.b = n9fVar;
    }

    private final void a() {
        while (true) {
            n9f n9fVar = this.b;
            synchronized (n9fVar) {
                if (n9fVar.a == 2) {
                    ArrayDeque arrayDeque = n9fVar.d;
                    if (arrayDeque.isEmpty()) {
                        n9fVar.d();
                        return;
                    }
                    fdf fdfVar = (fdf) arrayDeque.poll();
                    SparseArray sparseArray = n9fVar.e;
                    int i = fdfVar.a;
                    sparseArray.put(i, fdfVar);
                    ((ScheduledExecutorService) n9fVar.f.c).schedule(new us4(n9fVar, fdfVar, (byte) 22), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(fdfVar)));
                    }
                    jif jifVar = n9fVar.f;
                    Messenger messenger = n9fVar.b;
                    byte b = fdfVar.c;
                    Message obtain = Message.obtain();
                    obtain.what = b;
                    obtain.arg1 = i;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", fdfVar.a());
                    bundle.putString("pkg", ((Context) jifVar.b).getPackageName());
                    bundle.putBundle("data", fdfVar.d);
                    obtain.setData(bundle);
                    try {
                        rhb rhbVar = n9fVar.c;
                        Messenger messenger2 = (Messenger) rhbVar.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            kpd kpdVar = (kpd) rhbVar.c;
                            if (kpdVar != null) {
                                kpdVar.a.send(obtain);
                            } else {
                                throw new IllegalStateException("Both messengers are null");
                                break;
                            }
                        }
                    } catch (RemoteException e) {
                        n9fVar.b(e.getMessage());
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
                n9f n9fVar = this.b;
                synchronized (n9fVar) {
                    if (n9fVar.a == 1) {
                        n9fVar.b("Timed out while binding");
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
