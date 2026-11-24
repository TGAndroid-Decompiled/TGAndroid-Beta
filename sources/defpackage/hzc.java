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
public final class hzc {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final q0d b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final y0d i;
    public b5a m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final u0d k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            hzc hzcVar = hzc.this;
            int i = 0;
            hzcVar.b.b("reportBinderDeath", new Object[0]);
            if (hzcVar.j.get() == null) {
                hzcVar.b.b("%s : Binder has died.", hzcVar.c);
                ArrayList arrayList = hzcVar.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((s0d) obj).a(new RemoteException(String.valueOf(hzcVar.c).concat(" : Binder has died.")));
                }
                hzcVar.d.clear();
                synchronized (hzcVar.f) {
                    hzcVar.e();
                }
                return;
            }
            fyb.g();
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public hzc(Context context, q0d q0dVar, String str, Intent intent, y0d y0dVar) {
        this.a = context;
        this.b = q0dVar;
        this.c = str;
        this.h = intent;
        this.i = y0dVar;
    }

    public static void b(hzc hzcVar, s0d s0dVar) {
        IInterface iInterface = hzcVar.n;
        q0d q0dVar = hzcVar.b;
        ArrayList arrayList = hzcVar.d;
        int i = 0;
        if (iInterface == null && !hzcVar.g) {
            q0dVar.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(s0dVar);
            b5a b5aVar = new b5a(hzcVar, (byte) 1);
            hzcVar.m = b5aVar;
            hzcVar.g = true;
            if (!hzcVar.a.bindService(hzcVar.h, b5aVar, 1)) {
                q0dVar.b("Failed to bind to the service.", new Object[0]);
                hzcVar.g = false;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((s0d) obj).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (hzcVar.g) {
            q0dVar.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(s0dVar);
        } else {
            s0dVar.run();
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

    public final void c(s0d s0dVar, TaskCompletionSource taskCompletionSource) {
        a().post(new w0d(this, s0dVar.c(), taskCompletionSource, s0dVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new gzc(this, (byte) 1));
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
