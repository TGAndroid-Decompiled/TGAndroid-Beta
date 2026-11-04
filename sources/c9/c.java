package c9;

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
    public static final HashMap f4246o = new HashMap();
    public final Context f4247a;
    public final g0 f4248b;
    public final String f4249c;
    public boolean f4252g;
    public final Intent h;
    public final k0 f4253i;
    public bg.a f4257m;
    public IInterface f4258n;
    public final ArrayList d = new ArrayList();
    public final HashSet f4250e = new HashSet();
    public final Object f4251f = new Object();
    public final i0 f4255k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = c.this;
            int i3 = 0;
            cVar.f4248b.b("reportBinderDeath", new Object[0]);
            if (cVar.f4254j.get() == null) {
                cVar.f4248b.b("%s : Binder has died.", cVar.f4249c);
                ArrayList arrayList = cVar.d;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((h0) obj).a(new RemoteException(String.valueOf(cVar.f4249c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f4251f) {
                    cVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f4256l = new AtomicInteger(0);
    public final WeakReference f4254j = new WeakReference(null);

    public c(Context context, g0 g0Var, String str, Intent intent, k0 k0Var) {
        this.f4247a = context;
        this.f4248b = g0Var;
        this.f4249c = str;
        this.h = intent;
        this.f4253i = k0Var;
    }

    public static void b(c cVar, h0 h0Var) {
        IInterface iInterface = cVar.f4258n;
        g0 g0Var = cVar.f4248b;
        ArrayList arrayList = cVar.d;
        int i3 = 0;
        if (iInterface == null && !cVar.f4252g) {
            g0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(h0Var);
            bg.a aVar = new bg.a(cVar, 1);
            cVar.f4257m = aVar;
            cVar.f4252g = true;
            if (!cVar.f4247a.bindService(cVar.h, aVar, 1)) {
                g0Var.b("Failed to bind to the service.", new Object[0]);
                cVar.f4252g = false;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((h0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (cVar.f4252g) {
            g0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(h0Var);
        } else {
            h0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f4246o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f4249c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f4249c, 10);
                    handlerThread.start();
                    hashMap.put(this.f4249c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f4249c);
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
        synchronized (this.f4251f) {
            this.f4250e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f4250e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f4249c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
