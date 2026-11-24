package defpackage;

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
public final class i1d {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final s2d b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final a3d i;
    public d7a m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final w2d k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            i1d i1dVar = i1d.this;
            int i = 0;
            i1dVar.b.b("reportBinderDeath", new Object[0]);
            if (i1dVar.j.get() == null) {
                i1dVar.b.b("%s : Binder has died.", i1dVar.c);
                ArrayList arrayList = i1dVar.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((u2d) obj).a(new RemoteException(String.valueOf(i1dVar.c).concat(" : Binder has died.")));
                }
                i1dVar.d.clear();
                synchronized (i1dVar.f) {
                    i1dVar.e();
                }
                return;
            }
            rjb.p();
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public i1d(Context context, s2d s2dVar, String str, Intent intent, a3d a3dVar) {
        this.a = context;
        this.b = s2dVar;
        this.c = str;
        this.h = intent;
        this.i = a3dVar;
    }

    public static void b(i1d i1dVar, u2d u2dVar) {
        IInterface iInterface = i1dVar.n;
        s2d s2dVar = i1dVar.b;
        ArrayList arrayList = i1dVar.d;
        int i = 0;
        if (iInterface == null && !i1dVar.g) {
            s2dVar.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(u2dVar);
            d7a d7aVar = new d7a(i1dVar, (byte) 1);
            i1dVar.m = d7aVar;
            i1dVar.g = true;
            if (!i1dVar.a.bindService(i1dVar.h, d7aVar, 1)) {
                s2dVar.b("Failed to bind to the service.", new Object[0]);
                i1dVar.g = false;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((u2d) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (i1dVar.g) {
            s2dVar.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(u2dVar);
        } else {
            u2dVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = o;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                hashMap.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.c);
        }
        return handler;
    }

    public final void c(u2d u2dVar, TaskCompletionSource taskCompletionSource) {
        a().post(new y2d(this, u2dVar.c(), taskCompletionSource, u2dVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new h1d(this, (byte) 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
