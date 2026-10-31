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
import n4.q;
public final class h implements Runnable {
    public final int f9688a;
    public final j f9689b;

    public h(j jVar, int i10) {
        this.f9688a = i10;
        this.f9689b = jVar;
    }

    private final void a() {
        j jVar = this.f9689b;
        synchronized (jVar) {
            if (jVar.f9691a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f9688a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f9689b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f9689b;
            synchronized (jVar) {
                try {
                    if (jVar.f9691a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.e.put(kVar.f9695a, kVar);
                        ((ScheduledExecutorService) jVar.f9694f.f9700c).schedule(new u(17, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        m mVar = jVar.f9694f;
                        Messenger messenger = jVar.f9692b;
                        int i10 = kVar.f9697c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f9695a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) mVar.f9699b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            q qVar = jVar.f9693c;
                            Messenger messenger2 = (Messenger) qVar.f13526a;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) qVar.f13527b;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f9684a;
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
