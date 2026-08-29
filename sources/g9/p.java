package g9;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import bg.c2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import i9.b1;
import i9.c1;
import i9.d1;
import i9.d2;
import i9.e1;
import i9.e2;
import i9.h0;
import i9.i0;
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
import m.s3;
public final class p {
    public static final i f7179r = new i(1);
    public final Context f7180a;
    public final u f7181b;
    public final l f7182c;
    public final s3 d;
    public final com.google.firebase.messaging.s f7183e;
    public final y f7184f;
    public final l9.b f7185g;
    public final a h;
    public final h9.e f7186i;
    public final d9.b f7187j;
    public final e9.a f7188k;
    public final k f7189l;
    public final c2 f7190m;
    public t f7191n;
    public final TaskCompletionSource f7192o = new TaskCompletionSource();
    public final TaskCompletionSource f7193p = new TaskCompletionSource();
    public final TaskCompletionSource f7194q = new TaskCompletionSource();

    public p(Context context, com.google.firebase.messaging.s sVar, y yVar, u uVar, l9.b bVar, l lVar, a aVar, s3 s3Var, h9.e eVar, c2 c2Var, d9.b bVar2, e9.a aVar2, k kVar) {
        new AtomicBoolean(false);
        this.f7180a = context;
        this.f7183e = sVar;
        this.f7184f = yVar;
        this.f7181b = uVar;
        this.f7185g = bVar;
        this.f7182c = lVar;
        this.h = aVar;
        this.d = s3Var;
        this.f7186i = eVar;
        this.f7187j = bVar2;
        this.f7188k = aVar2;
        this.f7189l = kVar;
        this.f7190m = c2Var;
    }

    public static void a(p pVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j10;
        Integer num;
        pVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String e10 = u3.c.e("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", e10, null);
        }
        Locale locale = Locale.US;
        y yVar = pVar.f7184f;
        a aVar = pVar.h;
        String str2 = yVar.f7235c;
        String str3 = aVar.f7143f;
        String str4 = aVar.f7144g;
        String str5 = yVar.b().f7149a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, com.google.android.recaptcha.internal.a.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = pVar.f7180a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f7156a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f7157b.get(str8.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        }
        int ordinal = gVar.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = h.b(context);
        boolean g10 = h.g();
        int d = h.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        pVar.f7187j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            s3 s3Var = pVar.d;
            synchronized (((String) s3Var.f16690c)) {
                try {
                    s3Var.f16690c = str;
                    Map a2 = ((h9.d) ((AtomicMarkableReference) ((ab.m) s3Var.d).f325b).getReference()).a();
                    List f9 = ((p2.u) s3Var.f16692f).f();
                    if (((String) ((AtomicMarkableReference) s3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((h9.g) s3Var.f16688a).i(str, (String) ((AtomicMarkableReference) s3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((h9.g) s3Var.f16688a).g(str, a2, false);
                    }
                    if (!f9.isEmpty()) {
                        ((h9.g) s3Var.f16688a).h(str, f9);
                    }
                } finally {
                }
            }
        } else {
            j10 = currentTimeMillis;
        }
        h9.e eVar = pVar.f7186i;
        ((h9.c) eVar.f7953b).b();
        eVar.f7953b = h9.e.f7951c;
        if (str != null) {
            eVar.f7953b = new h9.m(((l9.b) eVar.f7952a).b(str, "userlog"));
        }
        pVar.f7189l.b(str);
        c2 c2Var = pVar.f7190m;
        s sVar = (s) c2Var.f2118a;
        Charset charset = e2.f8646a;
        ?? obj = new Object();
        obj.f7588a = "18.6.0";
        a aVar2 = sVar.f7214c;
        String str12 = aVar2.f7139a;
        if (str12 != null) {
            obj.f7589b = str12;
            y yVar2 = sVar.f7213b;
            String str13 = yVar2.b().f7149a;
            if (str13 != null) {
                obj.f7590c = str13;
                obj.d = yVar2.b().f7150b;
                String str14 = aVar2.f7143f;
                if (str14 != null) {
                    obj.f7596k = str14;
                    String str15 = aVar2.f7144g;
                    if (str15 != null) {
                        obj.f7592f = str15;
                        obj.f7594i = 4;
                        ?? obj2 = new Object();
                        obj2.f8662f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j10);
                        if (str != null) {
                            obj2.f8659b = str;
                            String str16 = s.f7211g;
                            if (str16 != null) {
                                obj2.f8658a = str16;
                                String str17 = yVar2.f7235c;
                                if (str17 != null) {
                                    String str18 = yVar2.b().f7149a;
                                    ze.b bVar = aVar2.h;
                                    if (((d9.c) bVar.f50825b) == null) {
                                        bVar.f50825b = new d9.c(bVar);
                                    }
                                    d9.c cVar = (d9.c) bVar.f50825b;
                                    String str19 = cVar.f5536b;
                                    if (cVar == null) {
                                        bVar.f50825b = new d9.c(bVar);
                                    }
                                    obj2.f8663g = new i0(str17, str14, str15, str18, str19, ((d9.c) bVar.f50825b).f5537c);
                                    com.google.firebase.messaging.s sVar2 = new com.google.firebase.messaging.s(12, false);
                                    Integer valueOf = Integer.valueOf(i11);
                                    sVar2.d = valueOf;
                                    if (str6 != null) {
                                        sVar2.f5185b = str6;
                                        if (str7 != null) {
                                            sVar2.f5187e = str7;
                                            sVar2.f5186c = Boolean.valueOf(h.h());
                                            obj2.f8664i = sVar2.m();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i12 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) s.f7210f.get(str8.toLowerCase(locale))) != null) {
                                                i12 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(sVar.f7212a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g11 = h.g();
                                            int d10 = h.d();
                                            ?? obj3 = new Object();
                                            obj3.f5812a = Integer.valueOf(i12);
                                            if (str9 != null) {
                                                obj3.f5813b = str9;
                                                obj3.f5814c = Integer.valueOf(availableProcessors2);
                                                obj3.d = Long.valueOf(b11);
                                                obj3.f5815e = Long.valueOf(blockCount2);
                                                obj3.f5816f = Boolean.valueOf(g11);
                                                obj3.f5817g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj3.h = str10;
                                                    if (str11 != null) {
                                                        obj3.f5818i = str11;
                                                        obj2.f8665j = obj3.b();
                                                        obj2.f8667l = valueOf;
                                                        obj.f7593g = obj2.a();
                                                        i9.a0 a10 = obj.a();
                                                        l9.b bVar2 = ((l9.a) c2Var.f2119b).f15100b;
                                                        d2 d2Var = a10.f8590j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f8670b;
                                                        try {
                                                            l9.a.f15097g.getClass();
                                                            l9.a.f(bVar2.b(str20, "report"), j9.a.f11292a.y(a10));
                                                            File b12 = bVar2.b(str20, "start-time");
                                                            long j11 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), l9.a.f15095e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j11 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e11) {
                                                            String e12 = u3.c.e("Could not persist report for session ", str20);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", e12, e11);
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

    public static Task b(p pVar) {
        Task call;
        pVar.getClass();
        ArrayList arrayList = new ArrayList();
        l9.b bVar = pVar.f7185g;
        for (File file : l9.b.e(bVar.f15103b.listFiles(f7179r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new o(pVar, parseLong));
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
        throw new UnsupportedOperationException("Method not decompiled: g9.p.f():java.lang.String");
    }

    public final void c(boolean r29, e3.f r30) {
        throw new UnsupportedOperationException("Method not decompiled: g9.p.c(boolean, e3.f):void");
    }

    public final boolean d(e3.f fVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.f7183e.f5187e).get())) {
            t tVar = this.f7191n;
            if (tVar != null && tVar.f7219e.get()) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, fVar);
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
        NavigableSet c3 = ((l9.a) this.f7190m.f2119b).c();
        if (!c3.isEmpty()) {
            return (String) c3.first();
        }
        return null;
    }

    public final void g() {
        boolean z10;
        try {
            String f9 = f();
            if (f9 != null) {
                try {
                    ((ab.m) this.d.f16691e).r("com.crashlytics.version-control-info", f9);
                } catch (IllegalArgumentException e10) {
                    Context context = this.f7180a;
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
        TaskCompletionSource taskCompletionSource = this.f7192o;
        l9.b bVar = ((l9.a) this.f7190m.f2119b).f15100b;
        if (l9.b.e(bVar.d.listFiles()).isEmpty() && l9.b.e(bVar.f15105e.listFiles()).isEmpty() && l9.b.e(bVar.f15106f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        d9.d dVar = d9.d.f5538a;
        dVar.c("Crash reports are available to be sent.");
        u uVar = this.f7181b;
        if (uVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            dVar.b("Automatic data collection is disabled.");
            dVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (uVar.f7222c) {
                task2 = uVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new x9.d(7));
            dVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f7193p.getTask();
            ExecutorService executorService = a0.f7145a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            z zVar = new z(1, taskCompletionSource2);
            onSuccessTask.continueWith(zVar);
            task4.continueWith(zVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new l(2, this, task));
    }
}
