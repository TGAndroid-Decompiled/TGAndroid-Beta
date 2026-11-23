package d9;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
public final class c {
    public static final HashMap f7921o = new HashMap();
    public final Context f7922a;
    public final g0 f7923b;
    public final String f7924c;
    public boolean f7927g;
    public final Intent h;
    public final k0 f7928i;
    public ag.a f7932m;
    public IInterface f7933n;
    public final ArrayList d = new ArrayList();
    public final HashSet f7925e = new HashSet();
    public final Object f7926f = new Object();
    public final i0 f7930k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = c.this;
            int i7 = 0;
            cVar.f7923b.b("reportBinderDeath", new Object[0]);
            if (cVar.f7929j.get() == null) {
                cVar.f7923b.b("%s : Binder has died.", cVar.f7924c);
                ArrayList arrayList = cVar.d;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RemoteException(String.valueOf(cVar.f7924c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f7926f) {
                    cVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f7931l = new AtomicInteger(0);
    public final WeakReference f7929j = new WeakReference(null);

    public c(Context context, g0 g0Var, String str, Intent intent, k0 k0Var) {
        this.f7922a = context;
        this.f7923b = g0Var;
        this.f7924c = str;
        this.h = intent;
        this.f7928i = k0Var;
    }

    public static void b(c cVar, h0 h0Var) {
        IInterface iInterface = cVar.f7933n;
        g0 g0Var = cVar.f7923b;
        ArrayList arrayList = cVar.d;
        int i7 = 0;
        if (iInterface == null && !cVar.f7927g) {
            g0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(h0Var);
            ag.a aVar = new ag.a(cVar, 1);
            cVar.f7932m = aVar;
            cVar.f7927g = true;
            if (!cVar.f7922a.bindService(cVar.h, aVar, 1)) {
                g0Var.b("Failed to bind to the service.", new Object[0]);
                cVar.f7927g = false;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (cVar.f7927g) {
            g0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(h0Var);
        } else {
            h0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f7921o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f7924c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f7924c, 10);
                    handlerThread.start();
                    hashMap.put(this.f7924c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f7924c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(h0 h0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new j0(this, h0Var.c(), taskCompletionSource, h0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f7926f) {
            this.f7925e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f7925e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f7924c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
