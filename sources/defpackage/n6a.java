package defpackage;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Predicate;
public final class n6a {
    public final iz2 a;
    public final nz2 b;
    public final w73 c;
    public final tg2 d;
    public final jb4 e;
    public final wj5 f;
    public final mv6 g;

    public n6a(iz2 iz2Var, nz2 nz2Var, w73 w73Var, tg2 tg2Var, jb4 jb4Var, wj5 wj5Var, mv6 mv6Var) {
        this.a = iz2Var;
        this.b = nz2Var;
        this.c = w73Var;
        this.d = tg2Var;
        this.e = jb4Var;
        this.f = wj5Var;
        this.g = mv6Var;
    }

    public static r80 a(r80 r80Var, tg2 tg2Var, jb4 jb4Var, Map map) {
        Map unmodifiableMap;
        q80 a = r80Var.a();
        String b = ((ga4) tg2Var.c).b();
        if (b != null) {
            a.e = new e90(b);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean isEmpty = map.isEmpty();
        xf4 xf4Var = (xf4) jb4Var.d;
        if (isEmpty) {
            unmodifiableMap = ((qv5) ((AtomicMarkableReference) xf4Var.b).getReference()).a();
        } else {
            HashMap hashMap = new HashMap(((qv5) ((AtomicMarkableReference) xf4Var.b).getReference()).a());
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b2 = qv5.b(1024, (String) entry.getKey());
                if (hashMap.size() >= 64 && !hashMap.containsKey(b2)) {
                    i++;
                } else {
                    hashMap.put(b2, qv5.b(1024, (String) entry.getValue()));
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        }
        List f = f(unmodifiableMap);
        List f2 = f(((qv5) ((AtomicMarkableReference) ((xf4) jb4Var.e).b).getReference()).a());
        if (!f.isEmpty() || !f2.isEmpty()) {
            s80 a2 = r80Var.c.a();
            a2.b = f;
            a2.c = f2;
            a.c = a2.a();
        }
        return a.a();
    }

    public static dz2 b(r80 r80Var, jb4 jb4Var) {
        List g = ((yg2) jb4Var.f).g();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < g.size(); i++) {
            kj9 kj9Var = (kj9) g.get(i);
            kj9Var.getClass();
            ?? obj = new Object();
            ia0 ia0Var = (ia0) kj9Var;
            String str = ia0Var.e;
            if (str != null) {
                String str2 = ia0Var.b;
                if (str2 != null) {
                    obj.a = new h90(str2, str);
                    String str3 = ia0Var.c;
                    if (str3 != null) {
                        obj.b = str3;
                        obj.c = ia0Var.d;
                        obj.d = ia0Var.f;
                        obj.e = (byte) (obj.e | 1);
                        arrayList.add(obj.a());
                    } else {
                        fvc.f("Null parameterKey");
                        return null;
                    }
                } else {
                    fvc.f("Null rolloutId");
                    return null;
                }
            } else {
                fvc.f("Null variantId");
                return null;
            }
        }
        if (arrayList.isEmpty()) {
            return r80Var;
        }
        q80 a = r80Var.a();
        a.f = new i90(arrayList);
        return a.a();
    }

    public static String c(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static n6a d(Context context, wj5 wj5Var, jb4 jb4Var, dr drVar, tg2 tg2Var, jb4 jb4Var2, sk4 sk4Var, dv8 dv8Var, sk4 sk4Var2, zx2 zx2Var, mv6 mv6Var) {
        iz2 iz2Var = new iz2(context, wj5Var, drVar, sk4Var, dv8Var);
        nz2 nz2Var = new nz2(jb4Var, dv8Var, zx2Var);
        lz2 lz2Var = w73.b;
        i1c.b(context);
        return new n6a(iz2Var, nz2Var, new w73(new f89(i1c.a().c(new i51(w73.c, w73.d)).a("FIREBASE_CRASHLYTICS_REPORT", new s24("json"), w73.e), dv8Var.c(), sk4Var2)), tg2Var, jb4Var2, wj5Var, mv6Var);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new f80(str, str2));
                } else {
                    fvc.f("Null value");
                    return null;
                }
            } else {
                fvc.f("Null key");
                return null;
            }
        }
        Collections.sort(arrayList, new fx7((byte) 21));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final ApplicationExitInfo e(String str, List list, Predicate predicate) {
        long lastModified = this.b.b.b(str, "start-time").lastModified();
        for (Object obj : list) {
            ApplicationExitInfo a = ho9.a(obj);
            if (a.getTimestamp() >= lastModified && predicate.test(a)) {
                return a;
            }
        }
        return null;
    }

    public final void g(Throwable th, Thread thread, String str, k44 k44Var, boolean z) {
        Boolean bool;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        boolean equals = str.equals("crash");
        long j = k44Var.b;
        iz2 iz2Var = this.a;
        Context context = iz2Var.a;
        int i = context.getResources().getConfiguration().orientation;
        sk4 sk4Var = iz2Var.d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        wtc wtcVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            wtcVar = new wtc(th3.getLocalizedMessage(), th3.getClass().getName(), sk4Var.j(th3.getStackTrace()), wtcVar);
        }
        ?? obj = new Object();
        obj.b = str;
        obj.a = j;
        boolean z2 = true;
        obj.g = (byte) (obj.g | 1);
        wy2 b = al8.a.b(context);
        int i2 = ((b90) b).c;
        if (i2 > 0) {
            if (i2 == 100) {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        ArrayList a = al8.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) wtcVar.c;
        String name = thread.getName();
        if (name != null) {
            List d = iz2.d(stackTraceElementArr, 4);
            if (d != null) {
                arrayList.add(new y80(name, 4, d));
                if (z) {
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                        Thread key = next.getKey();
                        if (!key.equals(thread)) {
                            StackTraceElement[] j2 = sk4Var.j(next.getValue());
                            String name2 = key.getName();
                            if (name2 != null) {
                                it = it2;
                                List d2 = iz2.d(j2, 0);
                                if (d2 != null) {
                                    arrayList.add(new y80(name2, 0, d2));
                                } else {
                                    fvc.f("Null frames");
                                    return;
                                }
                            } else {
                                fvc.f("Null name");
                                return;
                            }
                        } else {
                            it = it2;
                        }
                        it2 = it;
                    }
                }
                List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                w80 c = iz2.c(wtcVar, 0);
                x80 e = iz2.e();
                List a2 = iz2Var.a();
                if (a2 != null) {
                    obj.c = new t80(new u80(unmodifiableList, c, null, null, e, a2), null, null, bool, b, a, i);
                    obj.d = iz2Var.b(i);
                    r80 a3 = obj.a();
                    Map map = k44Var.c;
                    tg2 tg2Var = this.d;
                    jb4 jb4Var = this.e;
                    dz2 b2 = b(a(a3, tg2Var, jb4Var, map), jb4Var);
                    if (!z) {
                        ((pz2) this.g.c).a(new d97(this, b2, k44Var, equals, (byte) 13));
                        return;
                    } else {
                        this.b.e(b2, k44Var.a, equals);
                        return;
                    }
                }
                fvc.f("Null binaries");
                return;
            }
            fvc.f("Null frames");
            return;
        }
        fvc.f("Null name");
    }

    public final Task h(Executor executor, String str) {
        boolean z;
        TaskCompletionSource taskCompletionSource;
        ArrayList c = this.b.c();
        ArrayList arrayList = new ArrayList();
        int size = c.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            File file = (File) c.get(i);
            try {
                lz2 lz2Var = nz2.g;
                String f = nz2.f(file);
                lz2Var.getClass();
                arrayList.add(new b80(lz2.j(f), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            b80 b80Var = (b80) obj;
            if (str == null || str.equals(b80Var.b)) {
                w73 w73Var = this.c;
                a80 a80Var = b80Var.a;
                if (a80Var.f == null || a80Var.g == null) {
                    ng4 b = this.f.b(true);
                    a80 a80Var2 = b80Var.a;
                    String str2 = b.a;
                    z70 a = a80Var2.a();
                    a.e = str2;
                    a80 a2 = a.a();
                    String str3 = b.b;
                    z70 a3 = a2.a();
                    a3.f = str3;
                    b80Var = new b80(a3.a(), b80Var.b, b80Var.c);
                }
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                f89 f89Var = w73Var.a;
                synchronized (f89Var.f) {
                    taskCompletionSource = new TaskCompletionSource();
                    if (z) {
                        ((AtomicInteger) f89Var.i.b).getAndIncrement();
                        if (f89Var.f.size() < f89Var.e) {
                            c6e c6eVar = c6e.b;
                            c6eVar.g("Enqueueing report: " + b80Var.b);
                            c6eVar.g("Queue size: " + f89Var.f.size());
                            f89Var.g.execute(new ey1(f89Var, b80Var, taskCompletionSource, (byte) 1));
                            c6eVar.g("Closing task for report: " + b80Var.b);
                            taskCompletionSource.trySetResult(b80Var);
                        } else {
                            f89Var.a();
                            String str4 = "Dropping report due to queue being full: " + b80Var.b;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str4, null);
                            }
                            ((AtomicInteger) f89Var.i.c).getAndIncrement();
                            taskCompletionSource.trySetResult(b80Var);
                        }
                    } else {
                        f89Var.b(b80Var, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new ho9(this, (byte) 10)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
