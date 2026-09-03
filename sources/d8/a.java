package d8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.i;
import b6.m;
import i6.e;
import i6.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k6.c;
public final class a {
    public static final long f4330n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f4331o = null;
    public static final Object f4332p = new Object();
    public final Object f4333a;
    public final PowerManager.WakeLock f4334b;
    public int f4335c;
    public ScheduledFuture d;
    public long f4336e;
    public final HashSet f4337f;
    public boolean f4338g;
    public q7.a h;
    public final i6.a f4339i;
    public final String f4340j;
    public final HashMap f4341k;
    public final AtomicInteger f4342l;
    public final ScheduledExecutorService f4343m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f4333a = new Object();
        this.f4335c = 0;
        this.f4337f = new HashSet();
        this.f4338g = true;
        this.f4339i = i6.a.f7902a;
        this.f4341k = new HashMap();
        this.f4342l = new AtomicInteger(0);
        m.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f4340j = str;
        } else {
            this.f4340j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f4334b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f7910a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = c.a(context).f10475a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f4334b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e6) {
                        Log.wtf("WakeLock", e6.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f4331o;
            if (scheduledExecutorService == null) {
                synchronized (f4332p) {
                    try {
                        scheduledExecutorService = f4331o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f4331o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f4343m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb.toString());
    }

    public final void a(long j10) {
        this.f4342l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f4330n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f4333a) {
            try {
                if (!b()) {
                    this.h = q7.a.f44788a;
                    this.f4334b.acquire();
                    this.f4339i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f4335c++;
                if (this.f4338g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f4341k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f4341k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f4344a++;
                this.f4339i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.f4336e) {
                    this.f4336e = j11;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f4343m.schedule(new i(this, 15), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z4;
        synchronized (this.f4333a) {
            if (this.f4335c > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public final void c() {
        if (this.f4342l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f4340j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f4333a) {
            try {
                if (this.f4338g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f4341k.containsKey(null)) {
                    b bVar = (b) this.f4341k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f4344a - 1;
                        bVar.f4344a = i10;
                        if (i10 == 0) {
                            this.f4341k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f4340j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f4337f;
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
        synchronized (this.f4333a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f4338g) {
                    int i10 = this.f4335c - 1;
                    this.f4335c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f4335c = 0;
                }
                d();
                for (b bVar : this.f4341k.values()) {
                    bVar.f4344a = 0;
                }
                this.f4341k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f4336e = 0L;
                }
                if (this.f4334b.isHeld()) {
                    try {
                        this.f4334b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e6) {
                        if (e6.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f4340j).concat(" failed to release!"), e6);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e6;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f4340j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
