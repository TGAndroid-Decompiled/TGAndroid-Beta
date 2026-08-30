package o8;

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
    public static final HashMap f16467o = new HashMap();
    public final Context f16468a;
    public final f0 f16469b;
    public final String f16470c;
    public boolean f16472g;
    public final Intent h;
    public final j0 f16473i;
    public jf.a f16477m;
    public IInterface f16478n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f16471f = new Object();
    public final h0 f16475k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = c.this;
            int i10 = 0;
            cVar.f16469b.b("reportBinderDeath", new Object[0]);
            if (cVar.f16474j.get() == null) {
                cVar.f16469b.b("%s : Binder has died.", cVar.f16470c);
                ArrayList arrayList = cVar.d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((g0) obj).a(new RemoteException(String.valueOf(cVar.f16470c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f16471f) {
                    cVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f16476l = new AtomicInteger(0);
    public final WeakReference f16474j = new WeakReference(null);

    public c(Context context, f0 f0Var, String str, Intent intent, j0 j0Var) {
        this.f16468a = context;
        this.f16469b = f0Var;
        this.f16470c = str;
        this.h = intent;
        this.f16473i = j0Var;
    }

    public static void b(c cVar, g0 g0Var) {
        IInterface iInterface = cVar.f16478n;
        f0 f0Var = cVar.f16469b;
        ArrayList arrayList = cVar.d;
        int i10 = 0;
        if (iInterface == null && !cVar.f16472g) {
            f0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(g0Var);
            jf.a aVar = new jf.a(cVar, 2);
            cVar.f16477m = aVar;
            cVar.f16472g = true;
            if (!cVar.f16468a.bindService(cVar.h, aVar, 1)) {
                f0Var.b("Failed to bind to the service.", new Object[0]);
                cVar.f16472g = false;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((g0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (cVar.f16472g) {
            f0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(g0Var);
        } else {
            g0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f16467o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f16470c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f16470c, 10);
                    handlerThread.start();
                    hashMap.put(this.f16470c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f16470c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(g0 g0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new i0(this, g0Var.c(), taskCompletionSource, g0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f16471f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f16470c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
