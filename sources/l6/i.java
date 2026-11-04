package l6;

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
import l9.u;
import p4.q;
public final class i implements Runnable {
    public final int f18075a;
    public final k f18076b;

    public i(k kVar, int i3) {
        this.f18075a = i3;
        this.f18076b = kVar;
    }

    private final void a() {
        while (true) {
            k kVar = this.f18076b;
            synchronized (kVar) {
                try {
                    if (kVar.f18078a == 2) {
                        ArrayDeque arrayDeque = kVar.d;
                        if (arrayDeque.isEmpty()) {
                            kVar.d();
                            return;
                        }
                        l lVar = (l) arrayDeque.poll();
                        SparseArray sparseArray = kVar.f18081e;
                        int i3 = lVar.f18083a;
                        sparseArray.put(i3, lVar);
                        ((ScheduledExecutorService) kVar.f18082f.f18090c).schedule(new u(17, kVar, lVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                        }
                        n nVar = kVar.f18082f;
                        Messenger messenger = kVar.f18079b;
                        int i10 = lVar.f18085c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = i3;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", lVar.a());
                        bundle.putString("pkg", ((Context) nVar.f18089b).getPackageName());
                        bundle.putBundle("data", lVar.d);
                        obtain.setData(bundle);
                        try {
                            q qVar = kVar.f18080c;
                            Messenger messenger2 = (Messenger) qVar.f53181a;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) qVar.f53182b;
                                if (fVar != null) {
                                    fVar.f18068a.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                    break;
                                }
                            }
                        } catch (RemoteException e10) {
                            kVar.b(e10.getMessage());
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
        switch (this.f18075a) {
            case 0:
                k kVar = this.f18076b;
                synchronized (kVar) {
                    if (kVar.f18078a == 1) {
                        kVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                a();
                return;
            default:
                this.f18076b.b("Service disconnected");
                return;
        }
    }
}
