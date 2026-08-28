package e9;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g9.a0;
import g9.b1;
import g9.c1;
import g9.d1;
import g9.d2;
import g9.e1;
import g9.e2;
import g9.h0;
import g9.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.t3;
public final class o {
    public static final i f5022r = new i(1);
    public final Context f5023a;
    public final t f5024b;
    public final we.b f5025c;
    public final t3 d;
    public final com.google.firebase.messaging.t f5026e;
    public final x f5027f;
    public final j9.c f5028g;
    public final a h;
    public final f9.e f5029i;
    public final b9.b f5030j;
    public final c9.a f5031k;
    public final k f5032l;
    public final com.google.firebase.messaging.m f5033m;
    public s f5034n;
    public final TaskCompletionSource f5035o = new TaskCompletionSource();
    public final TaskCompletionSource f5036p = new TaskCompletionSource();
    public final TaskCompletionSource f5037q = new TaskCompletionSource();

    public o(Context context, com.google.firebase.messaging.t tVar, x xVar, t tVar2, j9.c cVar, we.b bVar, a aVar, t3 t3Var, f9.e eVar, com.google.firebase.messaging.m mVar, b9.b bVar2, c9.a aVar2, k kVar) {
        new AtomicBoolean(false);
        this.f5023a = context;
        this.f5026e = tVar;
        this.f5027f = xVar;
        this.f5024b = tVar2;
        this.f5028g = cVar;
        this.f5025c = bVar;
        this.h = aVar;
        this.d = t3Var;
        this.f5029i = eVar;
        this.f5030j = bVar2;
        this.f5031k = aVar2;
        this.f5032l = kVar;
        this.f5033m = mVar;
    }

    public static void a(o oVar, String str, Boolean bool) {
        int i9;
        int i10;
        long j10;
        Integer num;
        oVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String d = ta.b.d("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", d, null);
        }
        Locale locale = Locale.US;
        x xVar = oVar.f5027f;
        a aVar = oVar.h;
        String str2 = xVar.f5078c;
        String str3 = aVar.f4990f;
        String str4 = aVar.f4991g;
        String str5 = xVar.b().f4995a;
        if (aVar.d != null) {
            i9 = 4;
        } else {
            i9 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, e2.c.c(i9), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = oVar.f5023a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f5002a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i10 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i10 = 3;
            g gVar2 = (g) g.f5003b.get(str8.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        }
        int ordinal = gVar.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = h.b(context);
        boolean g10 = h.g();
        int d9 = h.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        oVar.f5030j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d9, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            t3 t3Var = oVar.d;
            synchronized (((String) t3Var.f17100c)) {
                try {
                    t3Var.f17100c = str;
                    Map a2 = ((f9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.d).f4158b).getReference()).a();
                    List f10 = ((n2.w) t3Var.f17102f).f();
                    if (((String) ((AtomicMarkableReference) t3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((f9.g) t3Var.f17098a).i(str, (String) ((AtomicMarkableReference) t3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((f9.g) t3Var.f17098a).g(str, a2, false);
                    }
                    if (!f10.isEmpty()) {
                        ((f9.g) t3Var.f17098a).h(str, f10);
                    }
                } finally {
                }
            }
        } else {
            j10 = currentTimeMillis;
        }
        f9.e eVar = oVar.f5029i;
        ((f9.c) eVar.f6006b).b();
        eVar.f6006b = f9.e.f6004c;
        if (str != null) {
            eVar.f6006b = new f9.m(((j9.c) eVar.f6005a).b(str, "userlog"));
        }
        oVar.f5032l.b(str);
        com.google.firebase.messaging.m mVar = oVar.f5033m;
        r rVar = (r) mVar.f4160a;
        Charset charset = e2.f7511a;
        ?? obj = new Object();
        obj.f5661a = "18.6.0";
        a aVar2 = rVar.f5057c;
        String str12 = aVar2.f4986a;
        if (str12 != null) {
            obj.f5662b = str12;
            x xVar2 = rVar.f5056b;
            String str13 = xVar2.b().f4995a;
            if (str13 != null) {
                obj.f5663c = str13;
                obj.d = xVar2.b().f4996b;
                String str14 = aVar2.f4990f;
                if (str14 != null) {
                    obj.f5669k = str14;
                    String str15 = aVar2.f4991g;
                    if (str15 != null) {
                        obj.f5665f = str15;
                        obj.f5667i = 4;
                        ?? obj2 = new Object();
                        obj2.f7527f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j10);
                        if (str != null) {
                            obj2.f7524b = str;
                            String str16 = r.f5054g;
                            if (str16 != null) {
                                obj2.f7523a = str16;
                                String str17 = xVar2.f5078c;
                                if (str17 != null) {
                                    String str18 = xVar2.b().f4995a;
                                    we.b bVar = aVar2.h;
                                    if (((b9.c) bVar.f48794c) == null) {
                                        bVar.f48794c = new b9.c(bVar);
                                    }
                                    b9.c cVar = (b9.c) bVar.f48794c;
                                    String str19 = cVar.f1662b;
                                    if (cVar == null) {
                                        bVar.f48794c = new b9.c(bVar);
                                    }
                                    obj2.f7528g = new i0(str17, str14, str15, str18, str19, ((b9.c) bVar.f48794c).f1663c);
                                    com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(10, false);
                                    Integer valueOf = Integer.valueOf(i10);
                                    tVar.d = valueOf;
                                    if (str6 != null) {
                                        tVar.f4177b = str6;
                                        if (str7 != null) {
                                            tVar.f4179e = str7;
                                            tVar.f4178c = Boolean.valueOf(h.h());
                                            obj2.f7529i = tVar.m();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i11 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) r.f5053f.get(str8.toLowerCase(locale))) != null) {
                                                i11 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(rVar.f5055a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g11 = h.g();
                                            int d10 = h.d();
                                            ?? obj3 = new Object();
                                            obj3.f2300a = Integer.valueOf(i11);
                                            if (str9 != null) {
                                                obj3.f2301b = str9;
                                                obj3.f2302c = Integer.valueOf(availableProcessors2);
                                                obj3.d = Long.valueOf(b11);
                                                obj3.f2303e = Long.valueOf(blockCount2);
                                                obj3.f2304f = Boolean.valueOf(g11);
                                                obj3.f2305g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj3.h = str10;
                                                    if (str11 != null) {
                                                        obj3.f2306i = str11;
                                                        obj2.f7530j = obj3.b();
                                                        obj2.f7532l = valueOf;
                                                        obj.f5666g = obj2.a();
                                                        a0 a3 = obj.a();
                                                        j9.c cVar2 = ((j9.b) mVar.f4161b).f14242b;
                                                        d2 d2Var = a3.f7455j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f7535b;
                                                        try {
                                                            j9.b.f14239g.getClass();
                                                            j9.b.f(cVar2.b(str20, "report"), h9.c.f10257a.u(a3));
                                                            File b12 = cVar2.b(str20, "start-time");
                                                            long j11 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), j9.b.f14237e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j11 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e10) {
                                                            String d11 = ta.b.d("Could not persist report for session ", str20);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", d11, e10);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    throw new NullPointerException("Null modelClass");
                                                }
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            throw new NullPointerException("Null model");
                                        }
                                        throw new NullPointerException("Null buildVersion");
                                    }
                                    throw new NullPointerException("Null version");
                                }
                                throw new NullPointerException("Null identifier");
                            }
                            throw new NullPointerException("Null generator");
                        }
                        throw new NullPointerException("Null identifier");
                    }
                    throw new NullPointerException("Null displayVersion");
                }
                throw new NullPointerException("Null buildVersion");
            }
            throw new NullPointerException("Null installationUuid");
        }
        throw new NullPointerException("Null gmpAppId");
    }

    public static Task b(o oVar) {
        Task call;
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        j9.c cVar = oVar.f5028g;
        for (File file : j9.c.e(cVar.f14245b.listFiles(f5022r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new n(oVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public static java.lang.String f() {
        throw new UnsupportedOperationException("Method not decompiled: e9.o.f():java.lang.String");
    }

    public final void c(boolean r29, c3.h r30) {
        throw new UnsupportedOperationException("Method not decompiled: e9.o.c(boolean, c3.h):void");
    }

    public final boolean d(c3.h hVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.f5026e.f4179e).get())) {
            s sVar = this.f5034n;
            if (sVar != null && sVar.f5062e.get()) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, hVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
                }
                return true;
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
                return false;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final String e() {
        NavigableSet c10 = ((j9.b) this.f5033m.f4161b).c();
        if (!c10.isEmpty()) {
            return (String) c10.first();
        }
        return null;
    }

    public final void g() {
        boolean z10;
        try {
            String f10 = f();
            if (f10 != null) {
                try {
                    ((com.google.firebase.messaging.l) this.d.f17101e).r("com.crashlytics.version-control-info", f10);
                } catch (IllegalArgumentException e10) {
                    Context context = this.f5023a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            throw e10;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e11);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.f5035o;
        j9.c cVar = ((j9.b) this.f5033m.f4161b).f14242b;
        if (j9.c.e(cVar.d.listFiles()).isEmpty() && j9.c.e(cVar.f14247e.listFiles()).isEmpty() && j9.c.e(cVar.f14248f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        b9.d dVar = b9.d.f1664a;
        dVar.c("Crash reports are available to be sent.");
        t tVar = this.f5024b;
        if (tVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            dVar.b("Automatic data collection is disabled.");
            dVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (tVar.f5065c) {
                task2 = tVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new wa.a(6));
            dVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f5036p.getTask();
            ExecutorService executorService = z.f5083a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            y yVar = new y(1, taskCompletionSource2);
            onSuccessTask.continueWith(yVar);
            task4.continueWith(yVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new we.b(23, this, task));
    }
}
