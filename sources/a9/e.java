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
    public static final HashMap f343o = new HashMap();
    public final Context f344a;
    public final i0 f345b;
    public final String f346c;
    public boolean f349g;
    public final Intent h;
    public final m0 f350i;
    public d f354m;
    public IInterface f355n;
    public final ArrayList d = new ArrayList();
    public final HashSet f347e = new HashSet();
    public final Object f348f = new Object();
    public final k0 f352k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            e eVar = e.this;
            int i10 = 0;
            eVar.f345b.b("reportBinderDeath", new Object[0]);
            if (eVar.f351j.get() == null) {
                eVar.f345b.b("%s : Binder has died.", eVar.f346c);
                ArrayList arrayList = eVar.d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((j0) obj).a(new RemoteException(String.valueOf(eVar.f346c).concat(" : Binder has died.")));
                }
                eVar.d.clear();
                synchronized (eVar.f348f) {
                    eVar.e();
                }
                return;
            }
            throw new ClassCastException();
        }
    };
    public final AtomicInteger f353l = new AtomicInteger(0);
    public final WeakReference f351j = new WeakReference(null);

    public e(Context context, i0 i0Var, String str, Intent intent, m0 m0Var) {
        this.f344a = context;
        this.f345b = i0Var;
        this.f346c = str;
        this.h = intent;
        this.f350i = m0Var;
    }

    public static void b(e eVar, j0 j0Var) {
        IInterface iInterface = eVar.f355n;
        i0 i0Var = eVar.f345b;
        ArrayList arrayList = eVar.d;
        int i10 = 0;
        if (iInterface == null && !eVar.f349g) {
            i0Var.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(j0Var);
            d dVar = new d(eVar, 0);
            eVar.f354m = dVar;
            eVar.f349g = true;
            if (!eVar.f344a.bindService(eVar.h, dVar, 1)) {
                i0Var.b("Failed to bind to the service.", new Object[0]);
                eVar.f349g = false;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((j0) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (eVar.f349g) {
            i0Var.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(j0Var);
        } else {
            j0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f343o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f346c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f346c, 10);
                    handlerThread.start();
                    hashMap.put(this.f346c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f346c);
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
        synchronized (this.f348f) {
            this.f347e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f347e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f346c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
