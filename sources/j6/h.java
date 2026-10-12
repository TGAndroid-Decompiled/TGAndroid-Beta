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
    public final int f12862a;
    public final j f12863b;

    public h(j jVar, int i10) {
        this.f12862a = i10;
        this.f12863b = jVar;
    }

    private final void a() {
        j jVar = this.f12863b;
        synchronized (jVar) {
            if (jVar.f12865a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f12862a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f12863b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f12863b;
            synchronized (jVar) {
                try {
                    if (jVar.f12865a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.e.put(kVar.f12869a, kVar);
                        ((ScheduledExecutorService) jVar.f12868f.f12874c).schedule(new u(18, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f12868f;
                        Messenger messenger = jVar.f12866b;
                        int i10 = kVar.f12871c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f12869a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f12873b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            s sVar = jVar.f12867c;
                            Messenger messenger2 = (Messenger) sVar.f16031b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) sVar.f16032c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f12858a;
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
