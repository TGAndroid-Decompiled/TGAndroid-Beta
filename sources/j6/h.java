package j6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import i9.s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class h implements Runnable {
    public final int f11791a;
    public final j f11792b;

    public h(j jVar, int i10) {
        this.f11791a = i10;
        this.f11792b = jVar;
    }

    private final void a() {
        j jVar = this.f11792b;
        synchronized (jVar) {
            if (jVar.f11794a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f11791a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f11792b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f11792b;
            synchronized (jVar) {
                try {
                    if (jVar.f11794a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.e.put(kVar.f11798a, kVar);
                        ((ScheduledExecutorService) jVar.f11797f.f11803c).schedule(new s(18, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f11797f;
                        Messenger messenger = jVar.f11795b;
                        int i10 = kVar.f11800c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f11798a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f11802b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            of.b bVar = jVar.f11796c;
                            Messenger messenger2 = (Messenger) bVar.f14294b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) bVar.f14295c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f11787a;
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
