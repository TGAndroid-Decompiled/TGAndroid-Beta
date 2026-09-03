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
import m.r3;
import org.telegram.ui.yh;
public final class n {
    public static final i f7964r = new i(1);
    public final Context f7965a;
    public final s f7966b;
    public final f7.b f7967c;
    public final r3 d;
    public final sf.f f7968e;
    public final w f7969f;
    public final n9.b f7970g;
    public final a h;
    public final j9.e f7971i;
    public final f9.a f7972j;
    public final g9.a f7973k;
    public final k f7974l;
    public final a9.a f7975m;
    public r f7976n;
    public final TaskCompletionSource f7977o = new TaskCompletionSource();
    public final TaskCompletionSource f7978p = new TaskCompletionSource();
    public final TaskCompletionSource f7979q = new TaskCompletionSource();

    public n(Context context, sf.f fVar, w wVar, s sVar, n9.b bVar, f7.b bVar2, a aVar, r3 r3Var, j9.e eVar, a9.a aVar2, f9.a aVar3, g9.a aVar4, k kVar) {
        new AtomicBoolean(false);
        this.f7965a = context;
        this.f7968e = fVar;
        this.f7969f = wVar;
        this.f7966b = sVar;
        this.f7970g = bVar;
        this.f7967c = bVar2;
        this.h = aVar;
        this.d = r3Var;
        this.f7971i = eVar;
        this.f7972j = aVar3;
        this.f7973k = aVar4;
        this.f7974l = kVar;
        this.f7975m = aVar2;
    }

    public static void a(n nVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j10;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String k10 = yh.k("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", k10, null);
        }
        Locale locale = Locale.US;
        w wVar = nVar.f7969f;
        a aVar = nVar.h;
        String str2 = wVar.f8020c;
        String str3 = aVar.f7935f;
        String str4 = aVar.f7936g;
        String str5 = wVar.b().f7940a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, e2.c.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = nVar.f7965a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f7947a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f7948b.get(str8.toLowerCase(locale));
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
        nVar.f7972j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            r3 r3Var = nVar.d;
            synchronized (((String) r3Var.f13331c)) {
                try {
                    r3Var.f13331c = str;
                    Map a2 = ((j9.d) ((AtomicMarkableReference) ((cb.m) r3Var.d).f2425b).getReference()).a();
                    List f10 = ((p2.v) r3Var.f13333f).f();
                    if (((String) ((AtomicMarkableReference) r3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((j9.g) r3Var.f13329a).i(str, (String) ((AtomicMarkableReference) r3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((j9.g) r3Var.f13329a).g(str, a2, false);
                    }
                    if (!f10.isEmpty()) {
                        ((j9.g) r3Var.f13329a).h(str, f10);
                    }
                } finally {
                }
            }
        } else {
            j10 = currentTimeMillis;
        }
        j9.e eVar = nVar.f7971i;
        ((j9.c) eVar.f9961b).a();
        eVar.f9961b = j9.e.f9959c;
        if (str != null) {
            eVar.f9961b = new j9.m(((n9.b) eVar.f9960a).b(str, "userlog"));
        }
        nVar.f7974l.b(str);
        a9.a aVar2 = nVar.f7975m;
        q qVar = (q) aVar2.f155a;
        Charset charset = e2.f10866a;
        ?? obj = new Object();
        obj.f9615a = "18.6.0";
        a aVar3 = qVar.f7999c;
        String str12 = aVar3.f7931a;
        if (str12 != null) {
            obj.f9616b = str12;
            w wVar2 = qVar.f7998b;
            String str13 = wVar2.b().f7940a;
            if (str13 != null) {
                obj.f9617c = str13;
                obj.d = wVar2.b().f7941b;
                String str14 = aVar3.f7935f;
                if (str14 != null) {
                    obj.f9623k = str14;
                    String str15 = aVar3.f7936g;
                    if (str15 != null) {
                        obj.f9619f = str15;
                        obj.f9621i = 4;
                        ?? obj2 = new Object();
                        obj2.f10882f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j10);
                        if (str != null) {
                            obj2.f10879b = str;
                            String str16 = q.f7996g;
                            if (str16 != null) {
                                obj2.f10878a = str16;
                                String str17 = wVar2.f8020c;
                                if (str17 != null) {
                                    String str18 = wVar2.b().f7940a;
                                    f7.b bVar = aVar3.h;
                                    if (((b6.h) bVar.f6121c) == null) {
                                        bVar.f6121c = new b6.h(bVar);
                                    }
                                    b6.h hVar = (b6.h) bVar.f6121c;
                                    String str19 = hVar.f1728b;
                                    if (hVar == null) {
                                        bVar.f6121c = new b6.h(bVar);
                                    }
                                    obj2.f10883g = new i0(str17, str14, str15, str18, str19, ((b6.h) bVar.f6121c).f1729c);
                                    int i12 = 7;
                                    sf.f fVar = new sf.f(7, false);
                                    Integer valueOf = Integer.valueOf(i11);
                                    fVar.f47351b = valueOf;
                                    if (str6 != null) {
                                        fVar.f47352c = str6;
                                        if (str7 != null) {
                                            fVar.d = str7;
                                            fVar.f47353e = Boolean.valueOf(h.h());
                                            obj2.f10884i = fVar.o();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) q.f7995f.get(str8.toLowerCase(locale))) != null) {
                                                i12 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(qVar.f7997a);
                                            long blockSize = statFs2.getBlockSize() * statFs2.getBlockCount();
                                            boolean g11 = h.g();
                                            int d10 = h.d();
                                            ?? obj3 = new Object();
                                            obj3.f4931a = Integer.valueOf(i12);
                                            if (str9 != null) {
                                                obj3.f4932b = str9;
                                                obj3.f4933c = Integer.valueOf(availableProcessors2);
                                                obj3.d = Long.valueOf(b11);
                                                obj3.f4934e = Long.valueOf(blockSize);
                                                obj3.f4935f = Boolean.valueOf(g11);
                                                obj3.f4936g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj3.h = str10;
                                                    if (str11 != null) {
                                                        obj3.f4937i = str11;
                                                        obj2.f10885j = obj3.b();
                                                        obj2.f10887l = valueOf;
                                                        obj.f9620g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        n9.b bVar2 = ((n9.a) aVar2.f156b).f15871b;
                                                        d2 d2Var = a10.f10810j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f10890b;
                                                        try {
                                                            n9.a.f15868g.getClass();
                                                            n9.a.f(bVar2.b(str20, "report"), l9.a.f12136a.d(a10));
                                                            File b12 = bVar2.b(str20, "start-time");
                                                            long j11 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), n9.a.f15866e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j11 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e6) {
                                                            String k11 = yh.k("Could not persist report for session ", str20);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", k11, e6);
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
        n9.b bVar = nVar.f7970g;
        for (File file : n9.b.e(bVar.f15874b.listFiles(f7964r))) {
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
        if (Boolean.TRUE.equals(((ThreadLocal) this.f7968e.f47353e).get())) {
            r rVar = this.f7976n;
            if (rVar != null && rVar.f8004e.get()) {
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
            } catch (Exception e6) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e6);
                return false;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final String e() {
        NavigableSet c3 = ((n9.a) this.f7975m.f156b).c();
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
                    ((cb.m) this.d.f13332e).u("com.crashlytics.version-control-info", f10);
                } catch (IllegalArgumentException e6) {
                    Context context = this.f7965a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            throw e6;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.f7977o;
        n9.b bVar = ((n9.a) this.f7975m.f156b).f15871b;
        if (n9.b.e(bVar.d.listFiles()).isEmpty() && n9.b.e(bVar.f15876e.listFiles()).isEmpty() && n9.b.e(bVar.f15877f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        f9.b bVar2 = f9.b.f6225a;
        bVar2.c("Crash reports are available to be sent.");
        s sVar = this.f7966b;
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
            synchronized (sVar.f8007c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new cb.b(9));
            bVar2.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f7978p.getTask();
            ExecutorService executorService = y.f8025a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            x xVar = new x(1, taskCompletionSource2);
            onSuccessTask.continueWith(xVar);
            task4.continueWith(xVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new f7.b(this, task, false, 13));
    }
}
