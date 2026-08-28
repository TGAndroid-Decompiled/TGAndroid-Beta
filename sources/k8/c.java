package k8;

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
    public static final HashMap f14670o = new HashMap();
    public final Context f14671a;
    public final g0 f14672b;
    public final String f14673c;
    public boolean f14676g;
    public final Intent h;
    public final k0 f14677i;
    public df.a f14681m;
    public IInterface f14682n;
    public final ArrayList d = new ArrayList();
    public final HashSet f14674e = new HashSet();
    public final Object f14675f = new Object();
    public final i0 f14679k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = c.this;
            int i9 = 0;
            cVar.f14672b.b("reportBinderDeath", new Object[0]);
            if (cVar.f14678j.get() == null) {
                cVar.f14672b.b("%s : Binder has died.", cVar.f14673c);
                ArrayList arrayList = cVar.d;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((h0) obj).a(new RemoteException(String.valueOf(cVar.f14673c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f14675f) {
                    cVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f14680l = new AtomicInteger(0);
    public final WeakReference f14678j = new WeakReference(null);

    public c(Context context, g0 g0Var, String str, Intent intent, k0 k0Var) {
        this.f14671a = context;
        this.f14672b = g0Var;
        this.f14673c = str;
        this.h = intent;
        this.f14677i = k0Var;
    }

    public static void b(c cVar, h0 h0Var) {
        IInterface iInterface = cVar.f14682n;
        g0 g0Var = cVar.f14672b;
        ArrayList arrayList = cVar.d;
        int i9 = 0;
        if (iInterface == null && !cVar.f14676g) {
            g0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(h0Var);
            df.a aVar = new df.a(cVar, 2);
            cVar.f14681m = aVar;
            cVar.f14676g = true;
            if (!cVar.f14671a.bindService(cVar.h, aVar, 1)) {
                g0Var.b("Failed to bind to the service.", new Object[0]);
                cVar.f14676g = false;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((h0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (cVar.f14676g) {
            g0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(h0Var);
        } else {
            h0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f14670o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f14673c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f14673c, 10);
                    handlerThread.start();
                    hashMap.put(this.f14673c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f14673c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(h0 h0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new j0(this, h0Var.c(), taskCompletionSource, h0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f14675f) {
            this.f14674e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f14674e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f14673c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
