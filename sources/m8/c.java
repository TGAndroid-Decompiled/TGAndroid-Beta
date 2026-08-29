package m8;

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
    public static final HashMap f16891o = new HashMap();
    public final Context f16892a;
    public final g0 f16893b;
    public final String f16894c;
    public boolean f16897g;
    public final Intent h;
    public final k0 f16898i;
    public gf.a f16902m;
    public IInterface f16903n;
    public final ArrayList d = new ArrayList();
    public final HashSet f16895e = new HashSet();
    public final Object f16896f = new Object();
    public final i0 f16900k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = c.this;
            int i10 = 0;
            cVar.f16893b.b("reportBinderDeath", new Object[0]);
            if (cVar.f16899j.get() == null) {
                cVar.f16893b.b("%s : Binder has died.", cVar.f16894c);
                ArrayList arrayList = cVar.d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((h0) obj).a(new RemoteException(String.valueOf(cVar.f16894c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f16896f) {
                    cVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f16901l = new AtomicInteger(0);
    public final WeakReference f16899j = new WeakReference(null);

    public c(Context context, g0 g0Var, String str, Intent intent, k0 k0Var) {
        this.f16892a = context;
        this.f16893b = g0Var;
        this.f16894c = str;
        this.h = intent;
        this.f16898i = k0Var;
    }

    public static void b(c cVar, h0 h0Var) {
        IInterface iInterface = cVar.f16903n;
        g0 g0Var = cVar.f16893b;
        ArrayList arrayList = cVar.d;
        int i10 = 0;
        if (iInterface == null && !cVar.f16897g) {
            g0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(h0Var);
            gf.a aVar = new gf.a(cVar, 2);
            cVar.f16902m = aVar;
            cVar.f16897g = true;
            if (!cVar.f16892a.bindService(cVar.h, aVar, 1)) {
                g0Var.b("Failed to bind to the service.", new Object[0]);
                cVar.f16897g = false;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((h0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (cVar.f16897g) {
            g0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(h0Var);
        } else {
            h0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f16891o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f16894c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f16894c, 10);
                    handlerThread.start();
                    hashMap.put(this.f16894c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f16894c);
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
        synchronized (this.f16896f) {
            this.f16895e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f16895e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f16894c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
