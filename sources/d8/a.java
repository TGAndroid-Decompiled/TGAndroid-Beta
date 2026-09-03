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
public final class a {
    public static final long f4236n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f4237o = null;
    public static final Object f4238p = new Object();
    public final Object f4239a;
    public final PowerManager.WakeLock f4240b;
    public int f4241c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f4242f;
    public boolean f4243g;
    public q7.a h;
    public final i6.a f4244i;
    public final String f4245j;
    public final HashMap f4246k;
    public final AtomicInteger f4247l;
    public final ScheduledExecutorService f4248m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f4239a = new Object();
        this.f4241c = 0;
        this.f4242f = new HashSet();
        this.f4243g = true;
        this.f4244i = i6.a.f7327a;
        this.f4246k = new HashMap();
        this.f4247l = new AtomicInteger(0);
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
            this.f4245j = str;
        } else {
            this.f4245j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f4240b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f7334a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = ((Context) k6.b.a(context).f1772b).getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f4240b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f4237o;
            if (scheduledExecutorService == null) {
                synchronized (f4238p) {
                    try {
                        scheduledExecutorService = f4237o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f4237o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f4248m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb.toString());
    }

    public final void a(long j10) {
        this.f4247l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f4236n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f4239a) {
            try {
                if (!b()) {
                    this.h = q7.a.f43021a;
                    this.f4240b.acquire();
                    this.f4244i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f4241c++;
                if (this.f4243g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f4246k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f4246k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f4249a++;
                this.f4244i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.e) {
                    this.e = j11;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f4248m.schedule(new i(this, 16), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z4;
        synchronized (this.f4239a) {
            if (this.f4241c > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public final void c() {
        if (this.f4247l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f4245j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f4239a) {
            try {
                if (this.f4243g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f4246k.containsKey(null)) {
                    b bVar = (b) this.f4246k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f4249a - 1;
                        bVar.f4249a = i10;
                        if (i10 == 0) {
                            this.f4246k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f4245j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f4242f;
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
        synchronized (this.f4239a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f4243g) {
                    int i10 = this.f4241c - 1;
                    this.f4241c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f4241c = 0;
                }
                d();
                for (b bVar : this.f4246k.values()) {
                    bVar.f4249a = 0;
                }
                this.f4246k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f4240b.isHeld()) {
                    try {
                        this.f4240b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f4245j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f4245j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
