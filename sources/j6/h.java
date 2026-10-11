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
import n4.x;
public final class h implements Runnable {
    public final int f14047a;
    public final j f14048b;

    public h(j jVar, int i10) {
        this.f14047a = i10;
        this.f14048b = jVar;
    }

    private final void a() {
        j jVar = this.f14048b;
        synchronized (jVar) {
            if (jVar.f14050a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f14047a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f14048b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f14048b;
            synchronized (jVar) {
                try {
                    if (jVar.f14050a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.f14053e.put(kVar.f14055a, kVar);
                        ((ScheduledExecutorService) jVar.f14054f.f14062c).schedule(new s(18, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f14054f;
                        Messenger messenger = jVar.f14051b;
                        int i10 = kVar.f14057c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f14055a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f14061b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            x xVar = jVar.f14052c;
                            Messenger messenger2 = (Messenger) xVar.f16658b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) xVar.f16659c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f14042a;
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
