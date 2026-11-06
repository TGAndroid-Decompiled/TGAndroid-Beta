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
    public static final HashMap f8220o = new HashMap();
    public final Context f8221a;
    public final g0 f8222b;
    public final String f8223c;
    public boolean f8226g;
    public final Intent h;
    public final k0 f8227i;
    public ag.a f8231m;
    public IInterface f8232n;
    public final ArrayList d = new ArrayList();
    public final HashSet f8224e = new HashSet();
    public final Object f8225f = new Object();
    public final i0 f8229k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = c.this;
            int i7 = 0;
            cVar.f8222b.b("reportBinderDeath", new Object[0]);
            if (cVar.f8228j.get() == null) {
                cVar.f8222b.b("%s : Binder has died.", cVar.f8223c);
                ArrayList arrayList = cVar.d;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RemoteException(String.valueOf(cVar.f8223c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f8225f) {
                    cVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f8230l = new AtomicInteger(0);
    public final WeakReference f8228j = new WeakReference(null);

    public c(Context context, g0 g0Var, String str, Intent intent, k0 k0Var) {
        this.f8221a = context;
        this.f8222b = g0Var;
        this.f8223c = str;
        this.h = intent;
        this.f8227i = k0Var;
    }

    public static void b(c cVar, h0 h0Var) {
        IInterface iInterface = cVar.f8232n;
        g0 g0Var = cVar.f8222b;
        ArrayList arrayList = cVar.d;
        int i7 = 0;
        if (iInterface == null && !cVar.f8226g) {
            g0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(h0Var);
            ag.a aVar = new ag.a(cVar, 1);
            cVar.f8231m = aVar;
            cVar.f8226g = true;
            if (!cVar.f8221a.bindService(cVar.h, aVar, 1)) {
                g0Var.b("Failed to bind to the service.", new Object[0]);
                cVar.f8226g = false;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (cVar.f8226g) {
            g0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(h0Var);
        } else {
            h0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f8220o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f8223c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f8223c, 10);
                    handlerThread.start();
                    hashMap.put(this.f8223c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f8223c);
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
        synchronized (this.f8225f) {
            this.f8224e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f8224e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f8223c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
