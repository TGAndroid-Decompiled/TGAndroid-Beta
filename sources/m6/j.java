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
    public final int f20504a;
    public final l f20505b;

    public j(l lVar, int i7) {
        this.f20504a = i7;
        this.f20505b = lVar;
    }

    private final void a() {
        while (true) {
            l lVar = this.f20505b;
            synchronized (lVar) {
                try {
                    if (lVar.f20507a == 2) {
                        ArrayDeque arrayDeque = lVar.d;
                        if (arrayDeque.isEmpty()) {
                            lVar.d();
                            return;
                        }
                        m mVar = (m) arrayDeque.poll();
                        SparseArray sparseArray = lVar.f20510e;
                        int i7 = mVar.f20512a;
                        sparseArray.put(i7, mVar);
                        ((ScheduledExecutorService) lVar.f20511f.f20519c).schedule(new u(23, lVar, mVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(mVar)));
                        }
                        n nVar = lVar.f20511f;
                        Messenger messenger = lVar.f20508b;
                        int i10 = mVar.f20514c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = i7;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", mVar.a());
                        bundle.putString("pkg", ((Context) nVar.f20518b).getPackageName());
                        bundle.putBundle("data", mVar.d);
                        obtain.setData(bundle);
                        try {
                            k8.a aVar = lVar.f20509c;
                            Messenger messenger2 = (Messenger) aVar.f17788b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                g gVar = (g) aVar.f17789c;
                                if (gVar != null) {
                                    gVar.f20497a.send(obtain);
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
        switch (this.f20504a) {
            case 0:
                l lVar = this.f20505b;
                synchronized (lVar) {
                    if (lVar.f20507a == 1) {
                        lVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                a();
                return;
            default:
                this.f20505b.b("Service disconnected");
                return;
        }
    }
}
