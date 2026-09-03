package i9;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
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
import k9.a0;
import k9.b1;
import k9.c1;
import k9.d1;
import k9.d2;
import k9.e1;
import k9.e2;
import k9.h0;
import k9.i0;
import m.s3;
import vh.w2;
public final class n {
    public static final i f7381r = new i(1);
    public final Context f7382a;
    public final s f7383b;
    public final f7.b f7384c;
    public final s3 d;
    public final rf.f e;
    public final w f7385f;
    public final n9.b f7386g;
    public final a h;
    public final j9.e f7387i;
    public final f9.a f7388j;
    public final g9.a f7389k;
    public final k f7390l;
    public final a9.a f7391m;
    public r f7392n;
    public final TaskCompletionSource f7393o = new TaskCompletionSource();
    public final TaskCompletionSource f7394p = new TaskCompletionSource();
    public final TaskCompletionSource f7395q = new TaskCompletionSource();

    public n(Context context, rf.f fVar, w wVar, s sVar, n9.b bVar, f7.b bVar2, a aVar, s3 s3Var, j9.e eVar, a9.a aVar2, f9.a aVar3, g9.a aVar4, k kVar) {
        new AtomicBoolean(false);
        this.f7382a = context;
        this.e = fVar;
        this.f7385f = wVar;
        this.f7383b = sVar;
        this.f7386g = bVar;
        this.f7384c = bVar2;
        this.h = aVar;
        this.d = s3Var;
        this.f7387i = eVar;
        this.f7388j = aVar3;
        this.f7389k = aVar4;
        this.f7390l = kVar;
        this.f7391m = aVar2;
    }

    public static void a(n nVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j10;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String e = w2.e("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", e, null);
        }
        Locale locale = Locale.US;
        w wVar = nVar.f7385f;
        a aVar = nVar.h;
        String str2 = wVar.f7432c;
        String str3 = aVar.f7354f;
        String str4 = aVar.f7355g;
        String str5 = wVar.b().f7359a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, e2.c.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = nVar.f7382a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f7366a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f7367b.get(str8.toLowerCase(locale));
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
        nVar.f7388j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            s3 s3Var = nVar.d;
            synchronized (((String) s3Var.f13627c)) {
                try {
                    s3Var.f13627c = str;
                    Map a2 = ((j9.d) ((AtomicMarkableReference) ((cb.m) s3Var.d).f2256b).getReference()).a();
                    List h = ((p2.w) s3Var.f13628f).h();
                    if (((String) ((AtomicMarkableReference) s3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((j9.g) s3Var.f13625a).i(str, (String) ((AtomicMarkableReference) s3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((j9.g) s3Var.f13625a).g(str, a2, false);
                    }
                    if (!h.isEmpty()) {
                        ((j9.g) s3Var.f13625a).h(str, h);
                    }
                } finally {
                }
            }
        } else {
            j10 = currentTimeMillis;
        }
        j9.e eVar = nVar.f7387i;
        ((j9.c) eVar.f9309b).a();
        eVar.f9309b = j9.e.f9307c;
        if (str != null) {
            eVar.f9309b = new j9.m(((n9.b) eVar.f9308a).b(str, "userlog"));
        }
        nVar.f7390l.b(str);
        a9.a aVar2 = nVar.f7391m;
        q qVar = (q) aVar2.f142a;
        Charset charset = e2.f10104a;
        ?? obj = new Object();
        obj.f8985a = "18.6.0";
        a aVar3 = qVar.f7414c;
        String str12 = aVar3.f7351a;
        if (str12 != null) {
            obj.f8986b = str12;
            w wVar2 = qVar.f7413b;
            String str13 = wVar2.b().f7359a;
            if (str13 != null) {
                obj.f8987c = str13;
                obj.d = wVar2.b().f7360b;
                String str14 = aVar3.f7354f;
                if (str14 != null) {
                    obj.f8992k = str14;
                    String str15 = aVar3.f7355g;
                    if (str15 != null) {
                        obj.f8988f = str15;
                        obj.f8990i = 4;
                        ?? obj2 = new Object();
                        obj2.f10118f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j10);
                        if (str != null) {
                            obj2.f10116b = str;
                            String str16 = q.f7411g;
                            if (str16 != null) {
                                obj2.f10115a = str16;
                                String str17 = wVar2.f7432c;
                                if (str17 != null) {
                                    String str18 = wVar2.b().f7359a;
                                    f7.b bVar = aVar3.h;
                                    if (((b6.h) bVar.f6002c) == null) {
                                        bVar.f6002c = new b6.h(bVar);
                                    }
                                    b6.h hVar = (b6.h) bVar.f6002c;
                                    String str19 = hVar.f1609b;
                                    if (hVar == null) {
                                        bVar.f6002c = new b6.h(bVar);
                                    }
                                    obj2.f10119g = new i0(str17, str14, str15, str18, str19, ((b6.h) bVar.f6002c).f1610c);
                                    int i12 = 7;
                                    rf.f fVar = new rf.f(7, false);
                                    Integer valueOf = Integer.valueOf(i11);
                                    fVar.f43490b = valueOf;
                                    if (str6 != null) {
                                        fVar.f43491c = str6;
                                        if (str7 != null) {
                                            fVar.d = str7;
                                            fVar.e = Boolean.valueOf(h.h());
                                            obj2.f10120i = fVar.o();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) q.f7410f.get(str8.toLowerCase(locale))) != null) {
                                                i12 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(qVar.f7412a);
                                            long blockSize = statFs2.getBlockSize() * statFs2.getBlockCount();
                                            boolean g11 = h.g();
                                            int d10 = h.d();
                                            ?? obj3 = new Object();
                                            obj3.f5101a = Integer.valueOf(i12);
                                            if (str9 != null) {
                                                obj3.f5102b = str9;
                                                obj3.f5103c = Integer.valueOf(availableProcessors2);
                                                obj3.d = Long.valueOf(b11);
                                                obj3.e = Long.valueOf(blockSize);
                                                obj3.f5104f = Boolean.valueOf(g11);
                                                obj3.f5105g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj3.h = str10;
                                                    if (str11 != null) {
                                                        obj3.f5106i = str11;
                                                        obj2.f10121j = obj3.b();
                                                        obj2.f10123l = valueOf;
                                                        obj.f8989g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        n9.b bVar2 = ((n9.a) aVar2.f143b).f14844b;
                                                        d2 d2Var = a10.f10053j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f10126b;
                                                        try {
                                                            n9.a.f14841g.getClass();
                                                            n9.a.f(bVar2.b(str20, "report"), l9.a.f11839a.l(a10));
                                                            File b12 = bVar2.b(str20, "start-time");
                                                            long j11 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), n9.a.e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j11 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e6) {
                                                            String e10 = w2.e("Could not persist report for session ", str20);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", e10, e6);
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

    public static Task b(n nVar) {
        Task call;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        n9.b bVar = nVar.f7386g;
        for (File file : n9.b.e(bVar.f14847b.listFiles(f7381r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new m(nVar, parseLong));
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
        throw new UnsupportedOperationException("Method not decompiled: i9.n.f():java.lang.String");
    }

    public final void c(boolean r29, e3.g r30) {
        throw new UnsupportedOperationException("Method not decompiled: i9.n.c(boolean, e3.g):void");
    }

    public final boolean d(e3.g gVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.e.e).get())) {
            r rVar = this.f7392n;
            if (rVar != null && rVar.e.get()) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, gVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
                }
                return true;
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
                return false;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final String e() {
        NavigableSet c3 = ((n9.a) this.f7391m.f143b).c();
        if (!c3.isEmpty()) {
            return (String) c3.first();
        }
        return null;
    }

    public final void g() {
        boolean z4;
        try {
            String f10 = f();
            if (f10 != null) {
                try {
                    ((cb.m) this.d.e).u("com.crashlytics.version-control-info", f10);
                } catch (IllegalArgumentException e) {
                    Context context = this.f7382a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e6) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e6);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.f7393o;
        n9.b bVar = ((n9.a) this.f7391m.f143b).f14844b;
        if (n9.b.e(bVar.d.listFiles()).isEmpty() && n9.b.e(bVar.e.listFiles()).isEmpty() && n9.b.e(bVar.f14849f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        f9.b bVar2 = f9.b.f6095a;
        bVar2.c("Crash reports are available to be sent.");
        s sVar = this.f7383b;
        if (sVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            bVar2.b("Automatic data collection is disabled.");
            bVar2.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (sVar.f7420c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new ab.a(9));
            bVar2.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f7394p.getTask();
            ExecutorService executorService = y.f7436a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            x xVar = new x(1, taskCompletionSource2);
            onSuccessTask.continueWith(xVar);
            task4.continueWith(xVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new f7.b(this, task, false, 13));
    }
}
