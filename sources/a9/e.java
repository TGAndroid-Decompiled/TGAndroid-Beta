package a9;

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
public final class e {
    public static final HashMap f325o = new HashMap();
    public final Context f326a;
    public final j0 f327b;
    public final String f328c;
    public boolean f330g;
    public final Intent h;
    public final n0 f331i;
    public d f335m;
    public IInterface f336n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f329f = new Object();
    public final l0 f333k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            e eVar = e.this;
            int i10 = 0;
            eVar.f327b.b("reportBinderDeath", new Object[0]);
            if (eVar.f332j.get() == null) {
                eVar.f327b.b("%s : Binder has died.", eVar.f328c);
                ArrayList arrayList = eVar.d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((k0) obj).a(new RemoteException(String.valueOf(eVar.f328c).concat(" : Binder has died.")));
                }
                eVar.d.clear();
                synchronized (eVar.f329f) {
                    eVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f334l = new AtomicInteger(0);
    public final WeakReference f332j = new WeakReference(null);

    public e(Context context, j0 j0Var, String str, Intent intent, n0 n0Var) {
        this.f326a = context;
        this.f327b = j0Var;
        this.f328c = str;
        this.h = intent;
        this.f331i = n0Var;
    }

    public static void b(e eVar, k0 k0Var) {
        IInterface iInterface = eVar.f336n;
        j0 j0Var = eVar.f327b;
        ArrayList arrayList = eVar.d;
        int i10 = 0;
        if (iInterface == null && !eVar.f330g) {
            j0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(k0Var);
            d dVar = new d(eVar, 0);
            eVar.f335m = dVar;
            eVar.f330g = true;
            if (!eVar.f326a.bindService(eVar.h, dVar, 1)) {
                j0Var.b("Failed to bind to the service.", new Object[0]);
                eVar.f330g = false;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((k0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (eVar.f330g) {
            j0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(k0Var);
        } else {
            k0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f325o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f328c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f328c, 10);
                    handlerThread.start();
                    hashMap.put(this.f328c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f328c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(k0 k0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new m0(this, k0Var.c(), taskCompletionSource, k0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f329f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f328c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
