package a8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import f6.e;
import f6.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import y5.l;

public final class a {

    public static final long f139n = TimeUnit.DAYS.toMillis(366);

    public static volatile ScheduledExecutorService f140o = null;

    public static final Object f141p = new Object();

    public final Object f142a;

    public final PowerManager.WakeLock f143b;

    public int f144c;
    public ScheduledFuture d;

    public long f145e;

    public final HashSet f146f;

    public boolean f147g;
    public n7.a h;

    public final f6.a f148i;

    public final String f149j;

    public final HashMap f150k;

    public final AtomicInteger f151l;

    public final ScheduledExecutorService f152m;

    public a(Context context) {
        String packageName = context.getPackageName();
        this.f142a = new Object();
        this.f144c = 0;
        this.f146f = new HashSet();
        this.f147g = true;
        this.f148i = f6.a.f5886a;
        this.f150k = new HashMap();
        this.f151l = new AtomicInteger(0);
        l.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f149j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f149j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new a7.c(sb2.toString());
        }
        this.f143b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (f.b(context)) {
            int i10 = e.f5894a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = h6.b.a(context).f48802a.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i11 = applicationInfo.uid;
                        workSource = new WorkSource();
                        f.a(workSource, i11, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f143b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e9) {
                    Log.wtf("WakeLock", e9.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f140o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f141p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f140o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f140o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f152m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j10) {
        this.f151l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f139n), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f142a) {
            try {
                if (!b()) {
                    this.h = n7.a.f18443a;
                    this.f143b.acquire();
                    this.f148i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f144c++;
                if (this.f147g) {
                    TextUtils.isEmpty(null);
                }
                c cVar = (c) this.f150k.get(null);
                if (cVar == null) {
                    cVar = new c();
                    this.f150k.put(null, cVar);
                }
                cVar.f155a++;
                this.f148i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j11 > this.f145e) {
                    this.f145e = j11;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f152m.schedule(new b(this, 0), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f142a) {
            z10 = this.f144c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.f151l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f149j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f142a) {
            try {
                if (this.f147g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f150k.containsKey(null)) {
                    c cVar = (c) this.f150k.get(null);
                    if (cVar != null) {
                        int i10 = cVar.f155a - 1;
                        cVar.f155a = i10;
                        if (i10 == 0) {
                            this.f150k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f149j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f146f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f142a) {
            try {
                if (b()) {
                    if (this.f147g) {
                        int i10 = this.f144c - 1;
                        this.f144c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f144c = 0;
                    }
                    d();
                    Iterator it = this.f150k.values().iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).f155a = 0;
                    }
                    this.f150k.clear();
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.d = null;
                        this.f145e = 0L;
                    }
                    if (this.f143b.isHeld()) {
                        try {
                            try {
                                this.f143b.release();
                                if (this.h != null) {
                                    this.h = null;
                                }
                            } catch (RuntimeException e9) {
                                if (!e9.getClass().equals(RuntimeException.class)) {
                                    throw e9;
                                }
                                Log.e("WakeLock", String.valueOf(this.f149j).concat(" failed to release!"), e9);
                                if (this.h != null) {
                                    this.h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.h != null) {
                                this.h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f149j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
