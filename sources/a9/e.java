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
    public static final HashMap f318o = new HashMap();
    public final Context f319a;
    public final j0 f320b;
    public final String f321c;
    public boolean f323g;
    public final Intent h;
    public final n0 f324i;
    public d f328m;
    public IInterface f329n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f322f = new Object();
    public final l0 f326k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            e eVar = e.this;
            int i10 = 0;
            eVar.f320b.b("reportBinderDeath", new Object[0]);
            if (eVar.f325j.get() == null) {
                eVar.f320b.b("%s : Binder has died.", eVar.f321c);
                ArrayList arrayList = eVar.d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((k0) obj).a(new RemoteException(String.valueOf(eVar.f321c).concat(" : Binder has died.")));
                }
                eVar.d.clear();
                synchronized (eVar.f322f) {
                    eVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f327l = new AtomicInteger(0);
    public final WeakReference f325j = new WeakReference(null);

    public e(Context context, j0 j0Var, String str, Intent intent, n0 n0Var) {
        this.f319a = context;
        this.f320b = j0Var;
        this.f321c = str;
        this.h = intent;
        this.f324i = n0Var;
    }

    public static void b(e eVar, k0 k0Var) {
        IInterface iInterface = eVar.f329n;
        j0 j0Var = eVar.f320b;
        ArrayList arrayList = eVar.d;
        int i10 = 0;
        if (iInterface == null && !eVar.f323g) {
            j0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(k0Var);
            d dVar = new d(eVar, 0);
            eVar.f328m = dVar;
            eVar.f323g = true;
            if (!eVar.f319a.bindService(eVar.h, dVar, 1)) {
                j0Var.b("Failed to bind to the service.", new Object[0]);
                eVar.f323g = false;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((k0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (eVar.f323g) {
            j0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(k0Var);
        } else {
            k0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f318o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f321c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f321c, 10);
                    handlerThread.start();
                    hashMap.put(this.f321c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f321c);
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
        synchronized (this.f322f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f321c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
