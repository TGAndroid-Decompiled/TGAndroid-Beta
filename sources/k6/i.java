package k6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k9.u;
import n4.s;
public final class i implements Runnable {
    public final int f16412a;
    public final k f16413b;

    public i(k kVar, int i10) {
        this.f16412a = i10;
        this.f16413b = kVar;
    }

    private final void a() {
        k kVar = this.f16413b;
        synchronized (kVar) {
            if (kVar.f16415a == 1) {
                kVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f16412a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f16413b.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar = this.f16413b;
            synchronized (kVar) {
                try {
                    if (kVar.f16415a == 2) {
                        if (kVar.d.isEmpty()) {
                            kVar.c();
                            return;
                        }
                        l lVar = (l) kVar.d.poll();
                        kVar.e.put(lVar.f16419a, lVar);
                        ((ScheduledExecutorService) kVar.f16418f.f16424c).schedule(new u(18, kVar, lVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                        }
                        m mVar = kVar.f16418f;
                        Messenger messenger = kVar.f16416b;
                        int i10 = lVar.f16421c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = lVar.f16419a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", lVar.a());
                        bundle.putString("pkg", ((Context) mVar.f16423b).getPackageName());
                        bundle.putBundle("data", lVar.d);
                        obtain.setData(bundle);
                        try {
                            s sVar = kVar.f16417c;
                            Messenger messenger2 = (Messenger) sVar.f18695b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                g gVar = (g) sVar.f18696c;
                                if (gVar != null) {
                                    Messenger messenger3 = gVar.f16408a;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e) {
                            kVar.a(e.getMessage());
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
