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
import n4.y;
public final class h implements Runnable {
    public final int f13537a;
    public final j f13538b;

    public h(j jVar, int i10) {
        this.f13537a = i10;
        this.f13538b = jVar;
    }

    private final void a() {
        j jVar = this.f13538b;
        synchronized (jVar) {
            if (jVar.f13540a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f13537a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f13538b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f13538b;
            synchronized (jVar) {
                try {
                    if (jVar.f13540a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.f13543e.put(kVar.f13545a, kVar);
                        ((ScheduledExecutorService) jVar.f13544f.f13552c).schedule(new s(17, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f13544f;
                        Messenger messenger = jVar.f13541b;
                        int i10 = kVar.f13547c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f13545a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f13551b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            y yVar = jVar.f13542c;
                            Messenger messenger2 = (Messenger) yVar.f16496b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) yVar.f16497c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f13532a;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e7) {
                            jVar.a(e7.getMessage());
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
