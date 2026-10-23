package j6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import j9.u;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n4.s;
public final class h implements Runnable {
    public final int f14323a;
    public final j f14324b;

    public h(j jVar, int i10) {
        this.f14323a = i10;
        this.f14324b = jVar;
    }

    private final void a() {
        j jVar = this.f14324b;
        synchronized (jVar) {
            if (jVar.f14326a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f14323a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f14324b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f14324b;
            synchronized (jVar) {
                try {
                    if (jVar.f14326a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.e.put(kVar.f14330a, kVar);
                        ((ScheduledExecutorService) jVar.f14329f.f14335c).schedule(new u(18, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f14329f;
                        Messenger messenger = jVar.f14327b;
                        int i10 = kVar.f14332c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f14330a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f14334b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            s sVar = jVar.f14328c;
                            Messenger messenger2 = (Messenger) sVar.f17188b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) sVar.f17189c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f14319a;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e) {
                            jVar.a(e.getMessage());
                        }
                    } else {
                        return;
                    }
                } finally {
                }
            }
        }
    }
}
