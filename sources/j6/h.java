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
    public final int f9689a;
    public final j f9690b;

    public h(j jVar, int i10) {
        this.f9689a = i10;
        this.f9690b = jVar;
    }

    private final void a() {
        j jVar = this.f9690b;
        synchronized (jVar) {
            if (jVar.f9692a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f9689a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f9690b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f9690b;
            synchronized (jVar) {
                try {
                    if (jVar.f9692a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.e.put(kVar.f9696a, kVar);
                        ((ScheduledExecutorService) jVar.f9695f.f9701c).schedule(new u(17, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        m mVar = jVar.f9695f;
                        Messenger messenger = jVar.f9693b;
                        int i10 = kVar.f9698c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f9696a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) mVar.f9700b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            q qVar = jVar.f9694c;
                            Messenger messenger2 = (Messenger) qVar.f13527a;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) qVar.f13528b;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f9685a;
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
