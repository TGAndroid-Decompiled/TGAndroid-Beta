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
    public final int f14011a;
    public final j f14012b;

    public h(j jVar, int i10) {
        this.f14011a = i10;
        this.f14012b = jVar;
    }

    private final void a() {
        j jVar = this.f14012b;
        synchronized (jVar) {
            if (jVar.f14014a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f14011a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f14012b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f14012b;
            synchronized (jVar) {
                try {
                    if (jVar.f14014a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.f14017e.put(kVar.f14019a, kVar);
                        ((ScheduledExecutorService) jVar.f14018f.f14026c).schedule(new s(17, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f14018f;
                        Messenger messenger = jVar.f14015b;
                        int i10 = kVar.f14021c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f14019a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f14025b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            y yVar = jVar.f14016c;
                            Messenger messenger2 = (Messenger) yVar.f16649b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) yVar.f16650c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f14006a;
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
