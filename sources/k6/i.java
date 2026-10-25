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
    public final int f16413a;
    public final k f16414b;

    public i(k kVar, int i10) {
        this.f16413a = i10;
        this.f16414b = kVar;
    }

    private final void a() {
        k kVar = this.f16414b;
        synchronized (kVar) {
            if (kVar.f16416a == 1) {
                kVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f16413a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f16414b.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar = this.f16414b;
            synchronized (kVar) {
                try {
                    if (kVar.f16416a == 2) {
                        if (kVar.d.isEmpty()) {
                            kVar.c();
                            return;
                        }
                        l lVar = (l) kVar.d.poll();
                        kVar.e.put(lVar.f16420a, lVar);
                        ((ScheduledExecutorService) kVar.f16419f.f16425c).schedule(new u(18, kVar, lVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                        }
                        m mVar = kVar.f16419f;
                        Messenger messenger = kVar.f16417b;
                        int i10 = lVar.f16422c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = lVar.f16420a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", lVar.a());
                        bundle.putString("pkg", ((Context) mVar.f16424b).getPackageName());
                        bundle.putBundle("data", lVar.d);
                        obtain.setData(bundle);
                        try {
                            s sVar = kVar.f16418c;
                            Messenger messenger2 = (Messenger) sVar.f18696b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                g gVar = (g) sVar.f18697c;
                                if (gVar != null) {
                                    Messenger messenger3 = gVar.f16409a;
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
