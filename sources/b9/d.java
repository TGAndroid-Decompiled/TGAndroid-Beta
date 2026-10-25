package b9;

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
public final class d {
    public static final HashMap f3684o = new HashMap();
    public final Context f3685a;
    public final h0 f3686b;
    public final String f3687c;
    public boolean f3689g;
    public final Intent h;
    public final l0 f3690i;
    public c f3694m;
    public IInterface f3695n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f3688f = new Object();
    public final j0 f3692k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            d dVar = d.this;
            int i10 = 0;
            dVar.f3686b.b("reportBinderDeath", new Object[0]);
            if (dVar.f3691j.get() == null) {
                dVar.f3686b.b("%s : Binder has died.", dVar.f3687c);
                ArrayList arrayList = dVar.d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((i0) obj).a(new RemoteException(String.valueOf(dVar.f3687c).concat(" : Binder has died.")));
                }
                dVar.d.clear();
                synchronized (dVar.f3688f) {
                    dVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f3693l = new AtomicInteger(0);
    public final WeakReference f3691j = new WeakReference(null);

    public d(Context context, h0 h0Var, String str, Intent intent, l0 l0Var) {
        this.f3685a = context;
        this.f3686b = h0Var;
        this.f3687c = str;
        this.h = intent;
        this.f3690i = l0Var;
    }

    public static void b(d dVar, i0 i0Var) {
        IInterface iInterface = dVar.f3695n;
        h0 h0Var = dVar.f3686b;
        ArrayList arrayList = dVar.d;
        int i10 = 0;
        if (iInterface == null && !dVar.f3689g) {
            h0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(i0Var);
            c cVar = new c(dVar, 0);
            dVar.f3694m = cVar;
            dVar.f3689g = true;
            if (!dVar.f3685a.bindService(dVar.h, cVar, 1)) {
                h0Var.b("Failed to bind to the service.", new Object[0]);
                dVar.f3689g = false;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((i0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (dVar.f3689g) {
            h0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(i0Var);
        } else {
            i0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f3684o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f3687c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f3687c, 10);
                    handlerThread.start();
                    hashMap.put(this.f3687c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f3687c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(i0 i0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new k0(this, i0Var.c(), taskCompletionSource, i0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f3688f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f3687c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
