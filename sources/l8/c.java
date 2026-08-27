package l8;

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

    public static final HashMap f15451o = new HashMap();

    public final Context f15452a;

    public final f0 f15453b;

    public final String f15454c;

    public boolean f15457g;
    public final Intent h;

    public final j0 f15458i;

    public ef.a f15462m;

    public IInterface f15463n;
    public final ArrayList d = new ArrayList();

    public final HashSet f15455e = new HashSet();

    public final Object f15456f = new Object();

    public final h0 f15460k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = this.f15472a;
            int i10 = 0;
            cVar.f15453b.b("reportBinderDeath", new Object[0]);
            if (cVar.f15459j.get() != null) {
                throw new ClassCastException();
            }
            cVar.f15453b.b("%s : Binder has died.", cVar.f15454c);
            ArrayList arrayList = cVar.d;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((g0) obj).a(new RemoteException(String.valueOf(cVar.f15454c).concat(" : Binder has died.")));
            }
            cVar.d.clear();
            synchronized (cVar.f15456f) {
                cVar.e();
            }
        }
    };

    public final AtomicInteger f15461l = new AtomicInteger(0);

    public final WeakReference f15459j = new WeakReference(null);

    public c(Context context, f0 f0Var, String str, Intent intent, j0 j0Var) {
        this.f15452a = context;
        this.f15453b = f0Var;
        this.f15454c = str;
        this.h = intent;
        this.f15458i = j0Var;
    }

    public static void b(c cVar, g0 g0Var) {
        IInterface iInterface = cVar.f15463n;
        f0 f0Var = cVar.f15453b;
        ArrayList arrayList = cVar.d;
        int i10 = 0;
        if (iInterface != null || cVar.f15457g) {
            if (!cVar.f15457g) {
                g0Var.run();
                return;
            } else {
                f0Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(g0Var);
                return;
            }
        }
        f0Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(g0Var);
        ef.a aVar = new ef.a(cVar, 2);
        cVar.f15462m = aVar;
        cVar.f15457g = true;
        if (cVar.f15452a.bindService(cVar.h, aVar, 1)) {
            return;
        }
        f0Var.b("Failed to bind to the service.", new Object[0]);
        cVar.f15457g = false;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g0) obj).a(new d("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f15451o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f15454c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f15454c, 10);
                    handlerThread.start();
                    map.put(this.f15454c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f15454c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(g0 g0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new i0(this, g0Var.c(), taskCompletionSource, g0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f15456f) {
            this.f15455e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f15455e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f15454c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
