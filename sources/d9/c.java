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
    public static final HashMap f7883o = new HashMap();
    public final Context f7884a;
    public final g0 f7885b;
    public final String f7886c;
    public boolean f7889g;
    public final Intent h;
    public final k0 f7890i;
    public ag.a f7894m;
    public IInterface f7895n;
    public final ArrayList d = new ArrayList();
    public final HashSet f7887e = new HashSet();
    public final Object f7888f = new Object();
    public final i0 f7892k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = c.this;
            int i7 = 0;
            cVar.f7885b.b("reportBinderDeath", new Object[0]);
            if (cVar.f7891j.get() == null) {
                cVar.f7885b.b("%s : Binder has died.", cVar.f7886c);
                ArrayList arrayList = cVar.d;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RemoteException(String.valueOf(cVar.f7886c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f7888f) {
                    cVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f7893l = new AtomicInteger(0);
    public final WeakReference f7891j = new WeakReference(null);

    public c(Context context, g0 g0Var, String str, Intent intent, k0 k0Var) {
        this.f7884a = context;
        this.f7885b = g0Var;
        this.f7886c = str;
        this.h = intent;
        this.f7890i = k0Var;
    }

    public static void b(c cVar, h0 h0Var) {
        IInterface iInterface = cVar.f7895n;
        g0 g0Var = cVar.f7885b;
        ArrayList arrayList = cVar.d;
        int i7 = 0;
        if (iInterface == null && !cVar.f7889g) {
            g0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(h0Var);
            ag.a aVar = new ag.a(cVar, 1);
            cVar.f7894m = aVar;
            cVar.f7889g = true;
            if (!cVar.f7884a.bindService(cVar.h, aVar, 1)) {
                g0Var.b("Failed to bind to the service.", new Object[0]);
                cVar.f7889g = false;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (cVar.f7889g) {
            g0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(h0Var);
        } else {
            h0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f7883o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f7886c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f7886c, 10);
                    handlerThread.start();
                    hashMap.put(this.f7886c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f7886c);
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
        synchronized (this.f7888f) {
            this.f7887e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f7887e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f7886c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
