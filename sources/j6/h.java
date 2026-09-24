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
    public final int f12889a;
    public final j f12890b;

    public h(j jVar, int i10) {
        this.f12889a = i10;
        this.f12890b = jVar;
    }

    private final void a() {
        j jVar = this.f12890b;
        synchronized (jVar) {
            if (jVar.f12892a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f12889a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f12890b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f12890b;
            synchronized (jVar) {
                try {
                    if (jVar.f12892a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.e.put(kVar.f12896a, kVar);
                        ((ScheduledExecutorService) jVar.f12895f.f12901c).schedule(new s(17, jVar, kVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f12895f;
                        Messenger messenger = jVar.f12893b;
                        int i10 = kVar.f12898c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f12896a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f12900b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            y yVar = jVar.f12894c;
                            Messenger messenger2 = (Messenger) yVar.f15207b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) yVar.f15208c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f12885a;
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
