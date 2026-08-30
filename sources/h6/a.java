package h6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import b6.i0;
import b6.m;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import k6.c;
public final class a {
    public static final Object f7008b = new Object();
    public static volatile a f7009c;
    public final ConcurrentHashMap f7010a = new ConcurrentHashMap();

    public static a a() {
        if (f7009c == null) {
            synchronized (f7008b) {
                try {
                    if (f7009c == null) {
                        f7009c = new a();
                    }
                } finally {
                }
            }
        }
        a aVar = f7009c;
        m.h(aVar);
        return aVar;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof i0)) {
            ConcurrentHashMap concurrentHashMap = this.f7010a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).f9754a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof i0)) {
            ConcurrentHashMap concurrentHashMap = this.f7010a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29 && executor != null) {
                    bindService = context.bindService(intent, i10, executor, serviceConnection);
                } else {
                    bindService = context.bindService(intent, serviceConnection, i10);
                }
                if (!bindService) {
                    return false;
                }
                return bindService;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        }
        if (executor == null) {
            executor = null;
        }
        if (Build.VERSION.SDK_INT >= 29 && executor != null) {
            return context.bindService(intent, i10, executor, serviceConnection);
        }
        return context.bindService(intent, serviceConnection, i10);
    }
}
