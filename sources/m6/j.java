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
    public final int f19907a;
    public final l f19908b;

    public j(l lVar, int i7) {
        this.f19907a = i7;
        this.f19908b = lVar;
    }

    private final void a() {
        while (true) {
            l lVar = this.f19908b;
            synchronized (lVar) {
                try {
                    if (lVar.f19910a == 2) {
                        ArrayDeque arrayDeque = lVar.d;
                        if (arrayDeque.isEmpty()) {
                            lVar.d();
                            return;
                        }
                        m mVar = (m) arrayDeque.poll();
                        SparseArray sparseArray = lVar.f19913e;
                        int i7 = mVar.f19915a;
                        sparseArray.put(i7, mVar);
                        ((ScheduledExecutorService) lVar.f19914f.f19922c).schedule(new u(23, lVar, mVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(mVar)));
                        }
                        n nVar = lVar.f19914f;
                        Messenger messenger = lVar.f19911b;
                        int i10 = mVar.f19917c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = i7;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", mVar.a());
                        bundle.putString("pkg", ((Context) nVar.f19921b).getPackageName());
                        bundle.putBundle("data", mVar.d);
                        obtain.setData(bundle);
                        try {
                            j2.n nVar2 = lVar.f19912c;
                            Messenger messenger2 = (Messenger) nVar2.f16456b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                g gVar = (g) nVar2.f16457c;
                                if (gVar != null) {
                                    gVar.f19900a.send(obtain);
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
        switch (this.f19907a) {
            case 0:
                l lVar = this.f19908b;
                synchronized (lVar) {
                    if (lVar.f19910a == 1) {
                        lVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                a();
                return;
            default:
                this.f19908b.b("Service disconnected");
                return;
        }
    }
}
