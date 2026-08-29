package b8;

import ag.q1;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import g6.e;
import g6.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import z5.l;
public final class a {
    public static final long f1975n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f1976o = null;
    public static final Object f1977p = new Object();
    public final Object f1978a;
    public final PowerManager.WakeLock f1979b;
    public int f1980c;
    public ScheduledFuture d;
    public long f1981e;
    public final HashSet f1982f;
    public boolean f1983g;
    public o7.a h;
    public final g6.a f1984i;
    public final String f1985j;
    public final HashMap f1986k;
    public final AtomicInteger f1987l;
    public final ScheduledExecutorService f1988m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f1978a = new Object();
        this.f1980c = 0;
        this.f1982f = new HashSet();
        this.f1983g = true;
        this.f1984i = g6.a.f7109a;
        this.f1986k = new HashMap();
        this.f1987l = new AtomicInteger(0);
        l.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f1985j = str;
        } else {
            this.f1985j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f1979b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f7117a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = i6.b.a(context).f1053a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f1979b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f1976o;
            if (scheduledExecutorService == null) {
                synchronized (f1977p) {
                    try {
                        scheduledExecutorService = f1976o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f1976o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f1988m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j10) {
        this.f1987l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f1975n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f1978a) {
            try {
                if (!b()) {
                    this.h = o7.a.f19467a;
                    this.f1979b.acquire();
                    this.f1984i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f1980c++;
                if (this.f1983g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f1986k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f1986k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f1989a++;
                this.f1984i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.f1981e) {
                    this.f1981e = j11;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f1988m.schedule(new q1(this, 9), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f1978a) {
            if (this.f1980c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f1987l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f1985j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f1978a) {
            try {
                if (this.f1983g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f1986k.containsKey(null)) {
                    b bVar = (b) this.f1986k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f1989a - 1;
                        bVar.f1989a = i10;
                        if (i10 == 0) {
                            this.f1986k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f1985j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f1982f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void e() {
        synchronized (this.f1978a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f1983g) {
                    int i10 = this.f1980c - 1;
                    this.f1980c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f1980c = 0;
                }
                d();
                for (b bVar : this.f1986k.values()) {
                    bVar.f1989a = 0;
                }
                this.f1986k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f1981e = 0L;
                }
                if (this.f1979b.isHeld()) {
                    try {
                        this.f1979b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f1985j).concat(" failed to release!"), e10);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e10;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f1985j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
