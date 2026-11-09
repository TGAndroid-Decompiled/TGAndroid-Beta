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
    public static final HashMap f8218o = new HashMap();
    public final Context f8219a;
    public final g0 f8220b;
    public final String f8221c;
    public boolean f8224g;
    public final Intent h;
    public final k0 f8225i;
    public ag.a f8229m;
    public IInterface f8230n;
    public final ArrayList d = new ArrayList();
    public final HashSet f8222e = new HashSet();
    public final Object f8223f = new Object();
    public final i0 f8227k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            c cVar = c.this;
            int i7 = 0;
            cVar.f8220b.b("reportBinderDeath", new Object[0]);
            if (cVar.f8226j.get() == null) {
                cVar.f8220b.b("%s : Binder has died.", cVar.f8221c);
                ArrayList arrayList = cVar.d;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RemoteException(String.valueOf(cVar.f8221c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f8223f) {
                    cVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f8228l = new AtomicInteger(0);
    public final WeakReference f8226j = new WeakReference(null);

    public c(Context context, g0 g0Var, String str, Intent intent, k0 k0Var) {
        this.f8219a = context;
        this.f8220b = g0Var;
        this.f8221c = str;
        this.h = intent;
        this.f8225i = k0Var;
    }

    public static void b(c cVar, h0 h0Var) {
        IInterface iInterface = cVar.f8230n;
        g0 g0Var = cVar.f8220b;
        ArrayList arrayList = cVar.d;
        int i7 = 0;
        if (iInterface == null && !cVar.f8224g) {
            g0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(h0Var);
            ag.a aVar = new ag.a(cVar, 1);
            cVar.f8229m = aVar;
            cVar.f8224g = true;
            if (!cVar.f8219a.bindService(cVar.h, aVar, 1)) {
                g0Var.b("Failed to bind to the service.", new Object[0]);
                cVar.f8224g = false;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((h0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (cVar.f8224g) {
            g0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(h0Var);
        } else {
            h0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f8218o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f8221c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f8221c, 10);
                    handlerThread.start();
                    hashMap.put(this.f8221c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f8221c);
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
        synchronized (this.f8223f) {
            this.f8222e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f8222e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f8221c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
