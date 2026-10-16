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
    public final int f12866a;
    public final j f12867b;

    public h(j jVar, int i10) {
        this.f12866a = i10;
        this.f12867b = jVar;
    }

    private final void a() {
        j jVar = this.f12867b;
        synchronized (jVar) {
            if (jVar.f12869a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f12866a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f12867b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f12867b;
            synchronized (jVar) {
                try {
                    if (jVar.f12869a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.e.put(kVar.f12873a, kVar);
                        ((ScheduledExecutorService) jVar.f12872f.f12878c).schedule(new u(18, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f12872f;
                        Messenger messenger = jVar.f12870b;
                        int i10 = kVar.f12875c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f12873a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f12877b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            s sVar = jVar.f12871c;
                            Messenger messenger2 = (Messenger) sVar.f15745b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) sVar.f15746c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f12862a;
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
