package m6;

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
import m9.u;
public final class j implements Runnable {
    public final int f20896a;
    public final l f20897b;

    public j(l lVar, int i7) {
        this.f20896a = i7;
        this.f20897b = lVar;
    }

    private final void a() {
        while (true) {
            l lVar = this.f20897b;
            synchronized (lVar) {
                try {
                    if (lVar.f20899a == 2) {
                        ArrayDeque arrayDeque = lVar.d;
                        if (arrayDeque.isEmpty()) {
                            lVar.d();
                            return;
                        }
                        m mVar = (m) arrayDeque.poll();
                        SparseArray sparseArray = lVar.f20902e;
                        int i7 = mVar.f20904a;
                        sparseArray.put(i7, mVar);
                        ((ScheduledExecutorService) lVar.f20903f.f20911c).schedule(new u(23, lVar, mVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(mVar)));
                        }
                        n nVar = lVar.f20903f;
                        Messenger messenger = lVar.f20900b;
                        int i10 = mVar.f20906c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = i7;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", mVar.a());
                        bundle.putString("pkg", ((Context) nVar.f20910b).getPackageName());
                        bundle.putBundle("data", mVar.d);
                        obtain.setData(bundle);
                        try {
                            k8.a aVar = lVar.f20901c;
                            Messenger messenger2 = (Messenger) aVar.f18214b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                g gVar = (g) aVar.f18215c;
                                if (gVar != null) {
                                    gVar.f20889a.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                    break;
                                }
                            }
                        } catch (RemoteException e10) {
                            lVar.b(e10.getMessage());
                        }
                    } else {
                        return;
                    }
                } finally {
                }
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f20896a) {
            case 0:
                l lVar = this.f20897b;
                synchronized (lVar) {
                    if (lVar.f20899a == 1) {
                        lVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                a();
                return;
            default:
                this.f20897b.b("Service disconnected");
                return;
        }
    }
}
