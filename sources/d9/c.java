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
    public static final HashMap f7889o = new HashMap();
    public final Context f7890a;
    public final g0 f7891b;
    public final String f7892c;
    public boolean f7895g;
    public final Intent h;
    public final k0 f7896i;
    public ag.a f7900m;
    public IInterface f7901n;
    public final ArrayList d = new ArrayList();
    public final HashSet f7893e = new HashSet();
    public final Object f7894f = new Object();
    public final i0 f7898k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = c.this;
            int i7 = 0;
            cVar.f7891b.b("reportBinderDeath", new Object[0]);
            if (cVar.f7897j.get() == null) {
                cVar.f7891b.b("%s : Binder has died.", cVar.f7892c);
                ArrayList arrayList = cVar.d;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RemoteException(String.valueOf(cVar.f7892c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f7894f) {
                    cVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f7899l = new AtomicInteger(0);
    public final WeakReference f7897j = new WeakReference(null);

    public c(Context context, g0 g0Var, String str, Intent intent, k0 k0Var) {
        this.f7890a = context;
        this.f7891b = g0Var;
        this.f7892c = str;
        this.h = intent;
        this.f7896i = k0Var;
    }

    public static void b(c cVar, h0 h0Var) {
        IInterface iInterface = cVar.f7901n;
        g0 g0Var = cVar.f7891b;
        ArrayList arrayList = cVar.d;
        int i7 = 0;
        if (iInterface == null && !cVar.f7895g) {
            g0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(h0Var);
            ag.a aVar = new ag.a(cVar, 1);
            cVar.f7900m = aVar;
            cVar.f7895g = true;
            if (!cVar.f7890a.bindService(cVar.h, aVar, 1)) {
                g0Var.b("Failed to bind to the service.", new Object[0]);
                cVar.f7895g = false;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (cVar.f7895g) {
            g0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(h0Var);
        } else {
            h0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f7889o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f7892c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f7892c, 10);
                    handlerThread.start();
                    hashMap.put(this.f7892c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f7892c);
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
        synchronized (this.f7894f) {
            this.f7893e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f7893e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f7892c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
