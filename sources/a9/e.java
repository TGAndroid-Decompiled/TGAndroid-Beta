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
    public static final HashMap f331o = new HashMap();
    public final Context f332a;
    public final i0 f333b;
    public final String f334c;
    public boolean f337g;
    public final Intent h;
    public final m0 f338i;
    public d f342m;
    public IInterface f343n;
    public final ArrayList d = new ArrayList();
    public final HashSet f335e = new HashSet();
    public final Object f336f = new Object();
    public final k0 f340k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            e eVar = e.this;
            int i10 = 0;
            eVar.f333b.b("reportBinderDeath", new Object[0]);
            if (eVar.f339j.get() == null) {
                eVar.f333b.b("%s : Binder has died.", eVar.f334c);
                ArrayList arrayList = eVar.d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((j0) obj).a(new RemoteException(String.valueOf(eVar.f334c).concat(" : Binder has died.")));
                }
                eVar.d.clear();
                synchronized (eVar.f336f) {
                    eVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f341l = new AtomicInteger(0);
    public final WeakReference f339j = new WeakReference(null);

    public e(Context context, i0 i0Var, String str, Intent intent, m0 m0Var) {
        this.f332a = context;
        this.f333b = i0Var;
        this.f334c = str;
        this.h = intent;
        this.f338i = m0Var;
    }

    public static void b(e eVar, j0 j0Var) {
        IInterface iInterface = eVar.f343n;
        i0 i0Var = eVar.f333b;
        ArrayList arrayList = eVar.d;
        int i10 = 0;
        if (iInterface == null && !eVar.f337g) {
            i0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(j0Var);
            d dVar = new d(eVar, 0);
            eVar.f342m = dVar;
            eVar.f337g = true;
            if (!eVar.f332a.bindService(eVar.h, dVar, 1)) {
                i0Var.b("Failed to bind to the service.", new Object[0]);
                eVar.f337g = false;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((j0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (eVar.f337g) {
            i0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(j0Var);
        } else {
            j0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f331o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f334c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f334c, 10);
                    handlerThread.start();
                    hashMap.put(this.f334c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f334c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(j0 j0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new l0(this, j0Var.c(), taskCompletionSource, j0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f336f) {
            this.f335e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f335e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f334c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
