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
public final class p8a {
    public final t03 a;
    public final y03 b;
    public final i93 c;
    public final hi2 d;
    public final jd4 e;
    public final vl5 f;
    public final mx6 g;

    public p8a(t03 t03Var, y03 y03Var, i93 i93Var, hi2 hi2Var, jd4 jd4Var, vl5 vl5Var, mx6 mx6Var) {
        this.a = t03Var;
        this.b = y03Var;
        this.c = i93Var;
        this.d = hi2Var;
        this.e = jd4Var;
        this.f = vl5Var;
        this.g = mx6Var;
    }

    public static r90 a(r90 r90Var, hi2 hi2Var, jd4 jd4Var, Map map) {
        Map unmodifiableMap;
        q90 a = r90Var.a();
        String b = ((gc4) hi2Var.c).b();
        if (b != null) {
            a.e = new ea0(b);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean isEmpty = map.isEmpty();
        yh4 yh4Var = (yh4) jd4Var.d;
        if (isEmpty) {
            unmodifiableMap = ((qx5) ((AtomicMarkableReference) yh4Var.b).getReference()).a();
        } else {
            HashMap hashMap = new HashMap(((qx5) ((AtomicMarkableReference) yh4Var.b).getReference()).a());
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b2 = qx5.b(1024, (String) entry.getKey());
                if (hashMap.size() >= 64 && !hashMap.containsKey(b2)) {
                    i++;
                } else {
                    hashMap.put(b2, qx5.b(1024, (String) entry.getValue()));
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        }
        List f = f(unmodifiableMap);
        List f2 = f(((qx5) ((AtomicMarkableReference) ((yh4) jd4Var.e).b).getReference()).a());
        if (!f.isEmpty() || !f2.isEmpty()) {
            s90 a2 = r90Var.c.a();
            a2.b = f;
            a2.c = f2;
            a.c = a2.a();
        }
        return a.a();
    }

    public static o03 b(r90 r90Var, jd4 jd4Var) {
        List i = ((xv6) jd4Var.f).i();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i.size(); i2++) {
            ml9 ml9Var = (ml9) i.get(i2);
            ml9Var.getClass();
            ?? obj = new Object();
            ib0 ib0Var = (ib0) ml9Var;
            String str = ib0Var.e;
            if (str != null) {
                String str2 = ib0Var.b;
                if (str2 != null) {
                    obj.a = new ha0(str2, str);
                    String str3 = ib0Var.c;
                    if (str3 != null) {
                        obj.b = str3;
                        obj.c = ib0Var.d;
                        obj.d = ib0Var.f;
                        obj.e = (byte) (obj.e | 1);
                        arrayList.add(obj.a());
                    } else {
                        gxc.d("Null parameterKey");
                        return null;
                    }
                } else {
                    gxc.d("Null rolloutId");
                    return null;
                }
            } else {
                gxc.d("Null variantId");
                return null;
            }
        }
        if (arrayList.isEmpty()) {
            return r90Var;
        }
        q90 a = r90Var.a();
        a.f = new ia0(arrayList);
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

    public static p8a d(Context context, vl5 vl5Var, jd4 jd4Var, ds dsVar, hi2 hi2Var, jd4 jd4Var2, mj4 mj4Var, ex8 ex8Var, mj4 mj4Var2, jz2 jz2Var, mx6 mx6Var) {
        t03 t03Var = new t03(context, vl5Var, dsVar, mj4Var, ex8Var);
        y03 y03Var = new y03(jd4Var, ex8Var, jz2Var);
        w03 w03Var = i93.b;
        i3c.b(context);
        return new p8a(t03Var, y03Var, new i93(new ha9(i3c.a().c(new p61(i93.c, i93.d)).a("FIREBASE_CRASHLYTICS_REPORT", new d44("json"), i93.e), ex8Var.c(), mj4Var2)), hi2Var, jd4Var2, vl5Var, mx6Var);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new f90(str, str2));
                } else {
                    gxc.d("Null value");
                    return null;
                }
            } else {
                gxc.d("Null key");
                return null;
            }
        }
        Collections.sort(arrayList, new qx7((byte) 22));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final ApplicationExitInfo e(String str, List list, Predicate predicate) {
        long lastModified = this.b.b.b(str, "start-time").lastModified();
        for (Object obj : list) {
            ApplicationExitInfo a = dq9.a(obj);
            if (a.getTimestamp() >= lastModified && predicate.test(a)) {
                return a;
            }
        }
        return null;
    }

    public final void g(Throwable th, Thread thread, String str, v54 v54Var, boolean z) {
        Boolean bool;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        boolean equals = str.equals("crash");
        long j = v54Var.b;
        t03 t03Var = this.a;
        Context context = t03Var.a;
        int i = context.getResources().getConfiguration().orientation;
        mj4 mj4Var = t03Var.d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        e7a e7aVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            e7aVar = new e7a(th3.getLocalizedMessage(), th3.getClass().getName(), mj4Var.o(th3.getStackTrace()), e7aVar);
        }
        ?? obj = new Object();
        obj.b = str;
        obj.a = j;
        boolean z2 = true;
        obj.g = (byte) (obj.g | 1);
        h03 b = cn8.a.b(context);
        int i2 = ((ba0) b).c;
        if (i2 > 0) {
            if (i2 == 100) {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        ArrayList a = cn8.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e7aVar.c;
        String name = thread.getName();
        if (name != null) {
            List d = t03.d(stackTraceElementArr, 4);
            if (d != null) {
                arrayList.add(new y90(name, 4, d));
                if (z) {
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                        Thread key = next.getKey();
                        if (!key.equals(thread)) {
                            StackTraceElement[] o = mj4Var.o(next.getValue());
                            String name2 = key.getName();
                            if (name2 != null) {
                                it = it2;
                                List d2 = t03.d(o, 0);
                                if (d2 != null) {
                                    arrayList.add(new y90(name2, 0, d2));
                                } else {
                                    gxc.d("Null frames");
                                    return;
                                }
                            } else {
                                gxc.d("Null name");
                                return;
                            }
                        } else {
                            it = it2;
                        }
                        it2 = it;
                    }
                }
                List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                w90 c = t03.c(e7aVar, 0);
                x90 e = t03.e();
                List a2 = t03Var.a();
                if (a2 != null) {
                    obj.c = new t90(new u90(unmodifiableList, c, null, null, e, a2), null, null, bool, b, a, i);
                    obj.d = t03Var.b(i);
                    r90 a3 = obj.a();
                    Map map = v54Var.c;
                    hi2 hi2Var = this.d;
                    jd4 jd4Var = this.e;
                    o03 b2 = b(a(a3, hi2Var, jd4Var, map), jd4Var);
                    if (!z) {
                        ((a13) this.g.c).a(new eb7(this, b2, v54Var, equals, (byte) 13));
                        return;
                    } else {
                        this.b.e(b2, v54Var.a, equals);
                        return;
                    }
                }
                gxc.d("Null binaries");
                return;
            }
            gxc.d("Null frames");
            return;
        }
        gxc.d("Null name");
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
                w03 w03Var = y03.g;
                String f = y03.f(file);
                w03Var.getClass();
                arrayList.add(new b90(w03.j(f), file.getName(), file));
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
            b90 b90Var = (b90) obj;
            if (str == null || str.equals(b90Var.b)) {
                i93 i93Var = this.c;
                a90 a90Var = b90Var.a;
                if (a90Var.f == null || a90Var.g == null) {
                    pi4 b = this.f.b(true);
                    a90 a90Var2 = b90Var.a;
                    String str2 = b.a;
                    z80 a = a90Var2.a();
                    a.e = str2;
                    a90 a2 = a.a();
                    String str3 = b.b;
                    z80 a3 = a2.a();
                    a3.f = str3;
                    b90Var = new b90(a3.a(), b90Var.b, b90Var.c);
                }
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                ha9 ha9Var = i93Var.a;
                synchronized (ha9Var.f) {
                    taskCompletionSource = new TaskCompletionSource();
                    if (z) {
                        ((AtomicInteger) ha9Var.i.b).getAndIncrement();
                        if (ha9Var.f.size() < ha9Var.e) {
                            f8e f8eVar = f8e.b;
                            f8eVar.f("Enqueueing report: " + b90Var.b);
                            f8eVar.f("Queue size: " + ha9Var.f.size());
                            ha9Var.g.execute(new rz1(ha9Var, b90Var, taskCompletionSource, (byte) 1));
                            f8eVar.f("Closing task for report: " + b90Var.b);
                            taskCompletionSource.trySetResult(b90Var);
                        } else {
                            ha9Var.a();
                            String str4 = "Dropping report due to queue being full: " + b90Var.b;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str4, null);
                            }
                            ((AtomicInteger) ha9Var.i.c).getAndIncrement();
                            taskCompletionSource.trySetResult(b90Var);
                        }
                    } else {
                        ha9Var.b(b90Var, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new dq9(this, (byte) 11)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
