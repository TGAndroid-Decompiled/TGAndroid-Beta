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
public final class faa {
    public final d03 a;
    public final g03 b;
    public final p83 c;
    public final lh2 d;
    public final gd4 e;
    public final yl5 f;
    public final rx6 g;

    public faa(d03 d03Var, g03 g03Var, p83 p83Var, lh2 lh2Var, gd4 gd4Var, yl5 yl5Var, rx6 rx6Var) {
        this.a = d03Var;
        this.b = g03Var;
        this.c = p83Var;
        this.d = lh2Var;
        this.e = gd4Var;
        this.f = yl5Var;
        this.g = rx6Var;
    }

    public static t80 a(t80 t80Var, lh2 lh2Var, gd4 gd4Var, Map map) {
        Map unmodifiableMap;
        s80 a = t80Var.a();
        String b = ((dc4) lh2Var.c).b();
        if (b != null) {
            a.e = new g90(b);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean isEmpty = map.isEmpty();
        vh4 vh4Var = (vh4) gd4Var.d;
        if (isEmpty) {
            unmodifiableMap = ((vx5) ((AtomicMarkableReference) vh4Var.b).getReference()).a();
        } else {
            HashMap hashMap = new HashMap(((vx5) ((AtomicMarkableReference) vh4Var.b).getReference()).a());
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b2 = vx5.b(1024, (String) entry.getKey());
                if (hashMap.size() >= 64 && !hashMap.containsKey(b2)) {
                    i++;
                } else {
                    hashMap.put(b2, vx5.b(1024, (String) entry.getValue()));
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        }
        List f = f(unmodifiableMap);
        List f2 = f(((vx5) ((AtomicMarkableReference) ((vh4) gd4Var.e).b).getReference()).a());
        if (!f.isEmpty() || !f2.isEmpty()) {
            u80 a2 = t80Var.c.a();
            a2.b = f;
            a2.c = f2;
            a.c = a2.a();
        }
        return a.a();
    }

    public static yz2 b(t80 t80Var, gd4 gd4Var) {
        List g = ((qh2) gd4Var.f).g();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < g.size(); i++) {
            ym9 ym9Var = (ym9) g.get(i);
            ym9Var.getClass();
            ?? obj = new Object();
            ka0 ka0Var = (ka0) ym9Var;
            String str = ka0Var.e;
            if (str != null) {
                String str2 = ka0Var.b;
                if (str2 != null) {
                    obj.a = new j90(str2, str);
                    String str3 = ka0Var.c;
                    if (str3 != null) {
                        obj.b = str3;
                        obj.c = ka0Var.d;
                        obj.d = ka0Var.f;
                        obj.e = (byte) (obj.e | 1);
                        arrayList.add(obj.a());
                    } else {
                        p3d.h("Null parameterKey");
                        return null;
                    }
                } else {
                    p3d.h("Null rolloutId");
                    return null;
                }
            } else {
                p3d.h("Null variantId");
                return null;
            }
        }
        if (arrayList.isEmpty()) {
            return t80Var;
        }
        s80 a = t80Var.a();
        a.f = new k90(arrayList);
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

    public static faa d(Context context, yl5 yl5Var, gd4 gd4Var, er erVar, lh2 lh2Var, gd4 gd4Var2, ym4 ym4Var, oy8 oy8Var, ym4 ym4Var2, ty2 ty2Var, rx6 rx6Var) {
        d03 d03Var = new d03(context, yl5Var, erVar, ym4Var, oy8Var);
        g03 g03Var = new g03(gd4Var, oy8Var, ty2Var);
        e03 e03Var = p83.b;
        h5c.b(context);
        return new faa(d03Var, g03Var, new p83(new rb9(h5c.a().c(new q51(p83.c, p83.d)).a("FIREBASE_CRASHLYTICS_REPORT", new n34("json"), p83.e), oy8Var.c(), ym4Var2)), lh2Var, gd4Var2, yl5Var, rx6Var);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new h80(str, str2));
                } else {
                    p3d.h("Null value");
                    return null;
                }
            } else {
                p3d.h("Null key");
                return null;
            }
        }
        Collections.sort(arrayList, new qq7((byte) 24));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final ApplicationExitInfo e(String str, List list, Predicate predicate) {
        long lastModified = this.b.b.b(str, "start-time").lastModified();
        for (Object obj : list) {
            ApplicationExitInfo a = vr9.a(obj);
            if (a.getTimestamp() >= lastModified && predicate.test(a)) {
                return a;
            }
        }
        return null;
    }

    public final void g(Throwable th, Thread thread, String str, g54 g54Var, boolean z) {
        Boolean bool;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        boolean equals = str.equals("crash");
        long j = g54Var.b;
        d03 d03Var = this.a;
        Context context = d03Var.a;
        int i = context.getResources().getConfiguration().orientation;
        ym4 ym4Var = d03Var.d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        u8a u8aVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            u8aVar = new u8a(th3.getLocalizedMessage(), th3.getClass().getName(), ym4Var.p(th3.getStackTrace()), u8aVar);
        }
        ?? obj = new Object();
        obj.b = str;
        obj.a = j;
        boolean z2 = true;
        obj.g = (byte) (obj.g | 1);
        rz2 b = no8.a.b(context);
        int i2 = ((d90) b).c;
        if (i2 > 0) {
            if (i2 == 100) {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        ArrayList a = no8.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) u8aVar.c;
        String name = thread.getName();
        if (name != null) {
            List d = d03.d(stackTraceElementArr, 4);
            if (d != null) {
                arrayList.add(new a90(name, 4, d));
                if (z) {
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                        Thread key = next.getKey();
                        if (!key.equals(thread)) {
                            StackTraceElement[] p = ym4Var.p(next.getValue());
                            String name2 = key.getName();
                            if (name2 != null) {
                                it = it2;
                                List d2 = d03.d(p, 0);
                                if (d2 != null) {
                                    arrayList.add(new a90(name2, 0, d2));
                                } else {
                                    p3d.h("Null frames");
                                    return;
                                }
                            } else {
                                p3d.h("Null name");
                                return;
                            }
                        } else {
                            it = it2;
                        }
                        it2 = it;
                    }
                }
                List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                y80 c = d03.c(u8aVar, 0);
                z80 e = d03.e();
                List a2 = d03Var.a();
                if (a2 != null) {
                    obj.c = new v80(new w80(unmodifiableList, c, null, null, e, a2), null, null, bool, b, a, i);
                    obj.d = d03Var.b(i);
                    t80 a3 = obj.a();
                    Map map = g54Var.c;
                    lh2 lh2Var = this.d;
                    gd4 gd4Var = this.e;
                    yz2 b2 = b(a(a3, lh2Var, gd4Var, map), gd4Var);
                    if (!z) {
                        ((i03) this.g.c).a(new lb7(this, b2, g54Var, equals, (byte) 13));
                        return;
                    } else {
                        this.b.e(b2, g54Var.a, equals);
                        return;
                    }
                }
                p3d.h("Null binaries");
                return;
            }
            p3d.h("Null frames");
            return;
        }
        p3d.h("Null name");
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
                e03 e03Var = g03.g;
                String f = g03.f(file);
                e03Var.getClass();
                arrayList.add(new d80(e03.j(f), file.getName(), file));
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
            d80 d80Var = (d80) obj;
            if (str == null || str.equals(d80Var.b)) {
                p83 p83Var = this.c;
                c80 c80Var = d80Var.a;
                if (c80Var.f == null || c80Var.g == null) {
                    ni4 b = this.f.b(true);
                    c80 c80Var2 = d80Var.a;
                    String str2 = b.a;
                    b80 a = c80Var2.a();
                    a.e = str2;
                    c80 a2 = a.a();
                    String str3 = b.b;
                    b80 a3 = a2.a();
                    a3.f = str3;
                    d80Var = new d80(a3.a(), d80Var.b, d80Var.c);
                }
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                rb9 rb9Var = p83Var.a;
                synchronized (rb9Var.f) {
                    taskCompletionSource = new TaskCompletionSource();
                    if (z) {
                        ((AtomicInteger) rb9Var.i.b).getAndIncrement();
                        if (rb9Var.f.size() < rb9Var.e) {
                            sae saeVar = sae.b;
                            saeVar.f("Enqueueing report: " + d80Var.b);
                            saeVar.f("Queue size: " + rb9Var.f.size());
                            rb9Var.g.execute(new uy1(rb9Var, d80Var, taskCompletionSource, (byte) 1));
                            saeVar.f("Closing task for report: " + d80Var.b);
                            taskCompletionSource.trySetResult(d80Var);
                        } else {
                            rb9Var.a();
                            String str4 = "Dropping report due to queue being full: " + d80Var.b;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str4, null);
                            }
                            ((AtomicInteger) rb9Var.i.c).getAndIncrement();
                            taskCompletionSource.trySetResult(d80Var);
                        }
                    } else {
                        rb9Var.b(d80Var, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new vr9(this, (byte) 13)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
