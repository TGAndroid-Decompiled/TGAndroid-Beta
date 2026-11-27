package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
public final class poc {
    public static volatile ScheduledExecutorService n;
    public static final Object o = new Object();
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f;
    public boolean g;
    public zfd h;
    public final sae i;
    public final String j;
    public final HashMap k;
    public final AtomicInteger l;
    public final ScheduledExecutorService m;

    public poc(Context context) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.i = sae.a;
        this.k = new HashMap();
        this.l = new AtomicInteger(0);
        xve.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.j = "*gcore*:wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (g3d.b(context)) {
                int i = cdb.a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = h3d.a(context).a.getPackageManager().getApplicationInfo(packageName, 0);
                        if (applicationInfo == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i2 = applicationInfo.uid;
                            workSource = new WorkSource();
                            g3d.a(workSource, i2, packageName);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = n;
            if (scheduledExecutorService == null) {
                synchronized (o) {
                    scheduledExecutorService = n;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        n = scheduledExecutorService;
                    }
                }
            }
            this.m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb.toString());
    }

    public final void a() {
        this.l.incrementAndGet();
        synchronized (this.a) {
            if (!b()) {
                this.h = zfd.a;
                this.b.acquire();
                this.i.getClass();
                SystemClock.elapsedRealtime();
            }
            this.c++;
            uld uldVar = (uld) this.k.get(null);
            uld uldVar2 = uldVar;
            if (uldVar == null) {
                Object obj = new Object();
                this.k.put(null, obj);
                uldVar2 = obj;
            }
            uldVar2.a++;
            this.i.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = Long.MAX_VALUE;
            if (Long.MAX_VALUE - elapsedRealtime > 60000) {
                j = elapsedRealtime + 60000;
            }
            if (j > this.e) {
                this.e = j;
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.d = this.m.schedule(new bva(this, (byte) 24), 60000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            if (this.c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            if (this.k.containsKey(null)) {
                uld uldVar = (uld) this.k.get(null);
                if (uldVar != null) {
                    int i = uldVar.a - 1;
                    uldVar.a = i;
                    if (i == 0) {
                        this.k.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
            }
            e();
        }
    }

    public final void d() {
        HashSet hashSet = this.f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            grb.o();
        }
    }

    public final void e() {
        synchronized (this.a) {
            if (!b()) {
                return;
            }
            if (this.g) {
                int i = this.c - 1;
                this.c = i;
                if (i > 0) {
                    return;
                }
            } else {
                this.c = 0;
            }
            d();
            for (uld uldVar : this.k.values()) {
                uldVar.a = 0;
            }
            this.k.clear();
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.d = null;
                this.e = 0L;
            }
            if (this.b.isHeld()) {
                try {
                    this.b.release();
                    if (this.h != null) {
                        this.h = null;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass().equals(RuntimeException.class)) {
                        Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e);
                        if (this.h != null) {
                            this.h = null;
                        }
                    } else {
                        throw e;
                    }
                }
            } else {
                Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
            }
        }
    }
}
