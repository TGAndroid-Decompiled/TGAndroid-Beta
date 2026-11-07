package aa;

import a8.p0;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.a1;
import da.e1;
import da.h0;
import da.h1;
import da.j2;
import da.k1;
import da.l1;
import da.q2;
import da.s0;
import da.t0;
import da.u0;
import da.v0;
import da.w0;
import da.y0;
import da.z0;
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
import m.q3;
public final class f0 {
    public final v f804a;
    public final ga.b f805b;
    public final ha.a f806c;
    public final ca.f d;
    public final q3 f807e;
    public final b0 f808f;
    public final ba.e f809g;

    public f0(v vVar, ga.b bVar, ha.a aVar, ca.f fVar, q3 q3Var, b0 b0Var, ba.e eVar) {
        this.f804a = vVar;
        this.f805b = bVar;
        this.f806c = aVar;
        this.d = fVar;
        this.f807e = q3Var;
        this.f808f = b0Var;
        this.f809g = eVar;
    }

    public static t0 a(t0 t0Var, ca.f fVar, q3 q3Var, Map map) {
        Map unmodifiableMap;
        s0 a10 = t0Var.a();
        String m10 = ((ca.d) fVar.f6011b).m();
        if (m10 != null) {
            a10.f8510e = new h1(m10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        ab.q qVar = (ab.q) q3Var.d;
        if (map.isEmpty()) {
            unmodifiableMap = ((ca.e) ((AtomicMarkableReference) qVar.f990b).getReference()).a();
        } else {
            HashMap hashMap = new HashMap(((ca.e) ((AtomicMarkableReference) qVar.f990b).getReference()).a());
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b10 = ca.e.b(1024, (String) entry.getKey());
                if (hashMap.size() >= 64 && !hashMap.containsKey(b10)) {
                    i7++;
                } else {
                    hashMap.put(b10, ca.e.b(1024, (String) entry.getValue()));
                }
            }
            if (i7 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i7 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        }
        List f10 = f(unmodifiableMap);
        List f11 = f(((ca.e) ((AtomicMarkableReference) ((ab.q) q3Var.f19228e).f990b).getReference()).a());
        if (!f10.isEmpty() || !f11.isEmpty()) {
            u0 a11 = t0Var.f8520c.a();
            a11.f8530b = f10;
            a11.f8531c = f11;
            a10.f8509c = a11.a();
        }
        return a10.a();
    }

    public static q2 b(t0 t0Var, q3 q3Var) {
        List l10 = ((f5.u) q3Var.f19229f).l();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < l10.size(); i7++) {
            ca.p pVar = (ca.p) l10.get(i7);
            pVar.getClass();
            ?? obj = new Object();
            ca.b bVar = (ca.b) pVar;
            String str = bVar.f6001e;
            if (str != null) {
                String str2 = bVar.f5999b;
                if (str2 != null) {
                    obj.f8379a = new k1(str2, str);
                    String str3 = bVar.f6000c;
                    if (str3 != null) {
                        obj.f8380b = str3;
                        String str4 = bVar.d;
                        if (str4 != null) {
                            obj.f8381c = str4;
                            obj.d = bVar.f6002f;
                            obj.f8382e = (byte) (obj.f8382e | 1);
                            arrayList.add(obj.a());
                        } else {
                            throw new NullPointerException("Null parameterValue");
                        }
                    } else {
                        throw new NullPointerException("Null parameterKey");
                    }
                } else {
                    throw new NullPointerException("Null rolloutId");
                }
            } else {
                throw new NullPointerException("Null variantId");
            }
        }
        if (arrayList.isEmpty()) {
            return t0Var;
        }
        s0 a10 = t0Var.a();
        a10.f8511f = new l1(arrayList);
        return a10.a();
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
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static f0 d(Context context, b0 b0Var, ga.d dVar, a aVar, ca.f fVar, q3 q3Var, j2.n nVar, ia.c cVar, q4.q qVar, j jVar, ba.e eVar) {
        v vVar = new v(context, b0Var, aVar, nVar, cVar);
        ga.b bVar = new ga.b(dVar, cVar, jVar);
        ea.a aVar2 = ha.a.f14425b;
        o5.s.b(context);
        return new f0(vVar, bVar, new ha.a(new ha.c(o5.s.a().c(new m5.a(ha.a.f14426c, ha.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new l5.c("json"), ha.a.f14427e), cVar.b(), qVar)), fVar, q3Var, b0Var, eVar);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new h0(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new a3.c(9));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final ApplicationExitInfo e(String str, List list, Predicate predicate) {
        long lastModified = this.f805b.f13612b.b(str, "start-time").lastModified();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) it.next();
            if (applicationExitInfo.getTimestamp() >= lastModified && predicate.test(applicationExitInfo)) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    public final void g(Throwable th2, Thread thread, String str, ca.c cVar, boolean z9) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b10;
        boolean z10;
        boolean equals = str.equals("crash");
        long j3 = cVar.f6004b;
        v vVar = this.f804a;
        Context context = vVar.f871a;
        int i7 = context.getResources().getConfiguration().orientation;
        j2.n nVar = vVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        Boolean bool = null;
        ab.b0 b0Var = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            b0Var = new ab.b0(th4.getLocalizedMessage(), th4.getClass().getName(), nVar.B(th4.getStackTrace()), b0Var, 4);
        }
        ab.b0 b0Var2 = b0Var;
        ?? obj = new Object();
        obj.f8508b = str;
        obj.f8507a = j3;
        obj.f8512g = (byte) (obj.f8512g | 1);
        j2 b11 = x9.c.f58577a.b(context);
        int i10 = ((e1) b11).f8339c;
        if (i10 > 0) {
            if (i10 != 100) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = Boolean.valueOf(z10);
        }
        Boolean bool2 = bool;
        ArrayList a10 = x9.c.a(context);
        byte b12 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b0Var2.d;
        String name = thread.getName();
        if (name != null) {
            byte b13 = (byte) 1;
            List d = v.d(stackTraceElementArr, 4);
            if (d != null) {
                if (b13 == 1) {
                    arrayList.add(new a1(name, 4, d));
                    if (z9) {
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                            Thread key = next.getKey();
                            if (!key.equals(thread)) {
                                StackTraceElement[] B = nVar.B(next.getValue());
                                String name2 = key.getName();
                                if (name2 != null) {
                                    it = it2;
                                    List d2 = v.d(B, 0);
                                    if (d2 != null) {
                                        if (b13 == 1) {
                                            b10 = b13;
                                            arrayList.add(new a1(name2, 0, d2));
                                        } else {
                                            byte b14 = b13;
                                            StringBuilder sb2 = new StringBuilder();
                                            if (b14 == 0) {
                                                sb2.append(" importance");
                                            }
                                            throw new IllegalStateException(p0.q("Missing required properties:", sb2));
                                        }
                                    } else {
                                        throw new NullPointerException("Null frames");
                                    }
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            } else {
                                it = it2;
                                b10 = b13;
                            }
                            it2 = it;
                            b13 = b10;
                        }
                    }
                    List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                    y0 c10 = v.c(b0Var2, 0);
                    z0 e10 = v.e();
                    List a11 = vVar.a();
                    if (a11 != null) {
                        w0 w0Var = new w0(unmodifiableList, c10, null, null, e10, a11);
                        if (b12 == 1) {
                            obj.f8509c = new v0(w0Var, null, null, bool2, b11, a10, i7);
                            obj.d = vVar.b(i7);
                            t0 a12 = obj.a();
                            Map map = cVar.f6005c;
                            ca.f fVar = this.d;
                            q3 q3Var = this.f807e;
                            q2 b15 = b(a(a12, fVar, q3Var, map), q3Var);
                            if (!z9) {
                                this.f809g.f3136b.a(new d0(this, b15, cVar, equals, 0));
                                return;
                            } else {
                                this.f805b.e(b15, cVar.f6003a, equals);
                                return;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        if (b12 == 0) {
                            sb3.append(" uiOrientation");
                        }
                        throw new IllegalStateException(p0.q("Missing required properties:", sb3));
                    }
                    throw new NullPointerException("Null binaries");
                }
                StringBuilder sb4 = new StringBuilder();
                if (b13 == 0) {
                    sb4.append(" importance");
                }
                throw new IllegalStateException(p0.q("Missing required properties:", sb4));
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }

    public final Task h(String str, Executor executor) {
        b bVar;
        TaskCompletionSource taskCompletionSource;
        ArrayList c10 = this.f805b.c();
        ArrayList arrayList = new ArrayList();
        int size = c10.size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            File file = (File) c10.get(i7);
            try {
                ea.a aVar = ga.b.f13609g;
                String f10 = ga.b.f(file);
                aVar.getClass();
                arrayList.add(new b(ea.a.j(f10), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
            i7 = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar2 = (b) obj;
            if (str == null || str.equals(bVar2.f776b)) {
                ha.a aVar2 = this.f806c;
                da.d0 d0Var = bVar2.f775a;
                boolean z9 = true;
                if (d0Var.f8315f != null && d0Var.f8316g != null) {
                    bVar = bVar2;
                } else {
                    a0 b10 = this.f808f.b(true);
                    da.d0 d0Var2 = bVar2.f775a;
                    String str2 = b10.f773a;
                    da.c0 a10 = d0Var2.a();
                    a10.f8289e = str2;
                    da.d0 a11 = a10.a();
                    String str3 = b10.f774b;
                    da.c0 a12 = a11.a();
                    a12.f8290f = str3;
                    bVar = new b(a12.a(), bVar2.f776b, bVar2.f777c);
                }
                if (str == null) {
                    z9 = false;
                }
                ha.c cVar = aVar2.f14428a;
                synchronized (cVar.f14436f) {
                    try {
                        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                        if (z9) {
                            ((AtomicInteger) cVar.f14438i.f53710b).getAndIncrement();
                            if (cVar.f14436f.size() < cVar.f14435e) {
                                x9.b bVar3 = x9.b.f58576a;
                                bVar3.b("Enqueueing report: " + bVar.f776b);
                                bVar3.b("Queue size: " + cVar.f14436f.size());
                                taskCompletionSource = taskCompletionSource2;
                                cVar.f14437g.execute(new a9.h(cVar, bVar, taskCompletionSource2, false, 5));
                                bVar3.b("Closing task for report: " + bVar.f776b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                taskCompletionSource = taskCompletionSource2;
                                cVar.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.f776b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar.f14438i.f53711c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            taskCompletionSource = taskCompletionSource2;
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new a3.l(this, 5)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
