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
    public final int f13563a;
    public final j f13564b;

    public h(j jVar, int i10) {
        this.f13563a = i10;
        this.f13564b = jVar;
    }

    private final void a() {
        j jVar = this.f13564b;
        synchronized (jVar) {
            if (jVar.f13566a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f13563a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f13564b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f13564b;
            synchronized (jVar) {
                try {
                    if (jVar.f13566a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.f13569e.put(kVar.f13571a, kVar);
                        ((ScheduledExecutorService) jVar.f13570f.f13578c).schedule(new s(17, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f13570f;
                        Messenger messenger = jVar.f13567b;
                        int i10 = kVar.f13573c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f13571a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f13577b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            y yVar = jVar.f13568c;
                            Messenger messenger2 = (Messenger) yVar.f16523b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) yVar.f16524c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f13558a;
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
