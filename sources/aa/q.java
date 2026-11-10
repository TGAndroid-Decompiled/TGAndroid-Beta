package aa;

import a8.p0;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.n0;
import da.o0;
import da.p1;
import da.q1;
import da.r1;
import da.s1;
import da.t2;
import da.u2;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.q3;
import sg.i0;
public final class q {
    public static final h f832r = new h(1);
    public static final Charset f833s = Charset.forName("UTF-8");
    public final Context f834a;
    public final x f835b;
    public final wf.b f836c;
    public final q3 d;
    public final ba.e f837e;
    public final b0 f838f;
    public final ga.d f839g;
    public final a h;
    public final ca.f f840i;
    public final x9.a f841j;
    public final y9.a f842k;
    public final j f843l;
    public final f0 f844m;
    public w f845n;
    public final TaskCompletionSource f846o = new TaskCompletionSource();
    public final TaskCompletionSource f847p = new TaskCompletionSource();
    public final TaskCompletionSource f848q = new TaskCompletionSource();

    public q(Context context, b0 b0Var, x xVar, ga.d dVar, wf.b bVar, a aVar, q3 q3Var, ca.f fVar, f0 f0Var, x9.a aVar2, y9.a aVar3, j jVar, ba.e eVar) {
        new AtomicBoolean(false);
        this.f834a = context;
        this.f838f = b0Var;
        this.f835b = xVar;
        this.f839g = dVar;
        this.f836c = bVar;
        this.h = aVar;
        this.d = q3Var;
        this.f840i = fVar;
        this.f841j = aVar2;
        this.f842k = aVar3;
        this.f843l = jVar;
        this.f844m = f0Var;
        this.f837e = eVar;
    }

    public static void a(q qVar, String str, ProfilingResult profilingResult) {
        String str2;
        int triggerType = profilingResult.getTriggerType();
        if (triggerType == 8) {
            str2 = "trigger-type-anomaly";
        } else if (triggerType == 7) {
            str2 = "trigger-type-oom";
        } else {
            str2 = "trigger-type-unknown";
        }
        try {
            if (!qVar.f839g.b(str, str2).createNewFile()) {
                String str3 = "Trigger file " + str2 + " exists for session: " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str3, null);
                }
            }
        } catch (IOException unused) {
            Log.e("FirebaseCrashlytics", "Unable to touch trigger file ".concat(str2), null);
        }
    }

    public static Task b(q qVar) {
        Task call;
        qVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ga.d.i(((File) qVar.f839g.d).listFiles(f832r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new p(qVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void c(boolean r32, ia.c r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: aa.q.c(boolean, ia.c, boolean):void");
    }

    public final void d(String str, Boolean bool) {
        int i7;
        String str2;
        String str3;
        String str4;
        String str5;
        int i10;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String i11 = rf.b.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i11, null);
        }
        Locale locale = Locale.US;
        b0 b0Var = this.f838f;
        a aVar = this.h;
        String str6 = b0Var.f781c;
        String str7 = aVar.f771f;
        String str8 = aVar.f772g;
        String str9 = b0Var.c().f784a;
        if (aVar.d != null) {
            i7 = 4;
        } else {
            i7 = 1;
        }
        q1 q1Var = new q1(str6, str7, str8, str9, p0.d(i7), aVar.h);
        String str10 = Build.VERSION.RELEASE;
        String str11 = Build.VERSION.CODENAME;
        s1 s1Var = new s1(g.h());
        Context context = this.f834a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.f801a;
        String str12 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str12)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            f fVar2 = (f) f.f802b.get(str12.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        }
        int ordinal = fVar.ordinal();
        String str13 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a10 = g.a(context);
        boolean g10 = g.g();
        int d = g.d();
        String str14 = Build.MANUFACTURER;
        String str15 = Build.PRODUCT;
        this.f841j.d(str, currentTimeMillis, new p1(q1Var, s1Var, new r1(ordinal, availableProcessors, d, a10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            q3 q3Var = this.d;
            synchronized (((String) q3Var.f19235c)) {
                q3Var.f19235c = str;
                str4 = str15;
                str5 = str13;
                str2 = str11;
                str3 = str14;
                i10 = 4;
                ((ba.e) q3Var.f19234b).f3136b.a(new ai.d0(q3Var, str, ((ca.e) ((AtomicMarkableReference) ((ab.q) q3Var.d).f990b).getReference()).a(), ((f5.u) q3Var.f19237f).o(), 10));
            }
        } else {
            str2 = str11;
            str3 = str14;
            str4 = str15;
            str5 = str13;
            i10 = 4;
        }
        ca.f fVar3 = this.f840i;
        ((ca.d) fVar3.f6014b).b();
        fVar3.f6014b = ca.f.f6012c;
        if (str != null) {
            fVar3.f6014b = new ca.o(((ga.d) fVar3.f6013a).b(str, "userlog"));
        }
        this.f843l.b(str);
        f0 f0Var = this.f844m;
        v vVar = f0Var.f804a;
        Charset charset = u2.f8538a;
        ?? obj = new Object();
        obj.f8289a = "20.1.1";
        a aVar2 = vVar.f873c;
        String str16 = aVar2.f767a;
        if (str16 != null) {
            obj.f8290b = str16;
            b0 b0Var2 = vVar.f872b;
            String str17 = b0Var2.c().f784a;
            if (str17 != null) {
                obj.d = str17;
                obj.f8292e = b0Var2.c().f785b;
                obj.f8293f = b0Var2.c().f786c;
                String str18 = aVar2.f771f;
                if (str18 != null) {
                    obj.h = str18;
                    String str19 = aVar2.f772g;
                    if (str19 != null) {
                        obj.f8295i = str19;
                        obj.f8291c = i10;
                        obj.f8299m = (byte) (obj.f8299m | 1);
                        ?? obj2 = new Object();
                        obj2.f8426f = false;
                        obj2.d = currentTimeMillis;
                        obj2.f8432m = (byte) (((byte) (obj2.f8432m | 2)) | 1);
                        if (str != null) {
                            obj2.f8423b = str;
                            String str20 = v.f870g;
                            if (str20 != null) {
                                obj2.f8422a = str20;
                                String str21 = b0Var2.f781c;
                                if (str21 != null) {
                                    String str22 = b0Var2.c().f784a;
                                    i0 i0Var = aVar2.h;
                                    if (((f5.a) i0Var.f55092c) == null) {
                                        i0Var.f55092c = new f5.a(i0Var);
                                    }
                                    f5.a aVar3 = (f5.a) i0Var.f55092c;
                                    String str23 = aVar3.f11117a;
                                    if (aVar3 == null) {
                                        i0Var.f55092c = new f5.a(i0Var);
                                    }
                                    obj2.f8427g = new o0(str21, str18, str19, str22, str23, ((f5.a) i0Var.f55092c).f11118b);
                                    ?? obj3 = new Object();
                                    obj3.f8433a = 3;
                                    obj3.f8436e = (byte) (obj3.f8436e | 1);
                                    if (str10 != null) {
                                        obj3.f8434b = str10;
                                        if (str2 != null) {
                                            obj3.f8435c = str2;
                                            obj3.d = g.h();
                                            obj3.f8436e = (byte) (obj3.f8436e | 2);
                                            obj2.f8428i = obj3.a();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i12 = 7;
                                            if (!TextUtils.isEmpty(str12) && (num = (Integer) v.f869f.get(str12.toLowerCase(locale))) != null) {
                                                i12 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long a11 = g.a(vVar.f871a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g11 = g.g();
                                            int d2 = g.d();
                                            ?? obj4 = new Object();
                                            obj4.f8477a = i12;
                                            byte b10 = (byte) (obj4.f8484j | 1);
                                            obj4.f8484j = b10;
                                            if (str5 != null) {
                                                obj4.f8478b = str5;
                                                obj4.f8479c = availableProcessors2;
                                                obj4.d = a11;
                                                obj4.f8480e = blockCount2;
                                                obj4.f8481f = g11;
                                                obj4.f8482g = d2;
                                                obj4.f8484j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
                                                String str24 = str3;
                                                if (str24 != null) {
                                                    obj4.h = str24;
                                                    String str25 = str4;
                                                    if (str25 != null) {
                                                        obj4.f8483i = str25;
                                                        obj2.f8429j = obj4.a();
                                                        obj2.f8431l = 3;
                                                        obj2.f8432m = (byte) (obj2.f8432m | 4);
                                                        obj.f8296j = obj2.a();
                                                        da.d0 a12 = obj.a();
                                                        ga.d dVar = f0Var.f805b.f13614b;
                                                        t2 t2Var = a12.f8322k;
                                                        if (t2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str26 = ((n0) t2Var).f8442b;
                                                        try {
                                                            ga.b.f13611g.getClass();
                                                            ga.b.g(dVar.b(str26, "report"), ea.a.f10731a.u(a12));
                                                            File b11 = dVar.b(str26, "start-time");
                                                            long j3 = ((n0) t2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b11), ga.b.f13609e);
                                                            outputStreamWriter.write("");
                                                            b11.setLastModified(j3 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e10) {
                                                            String i13 = rf.b.i("Could not persist report for session ", str26);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", i13, e10);
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

    public final void e(String str) {
        ExecutorService executorService = this.f837e.f3136b.f3132a;
        ProfilingManager profilingManager = (ProfilingManager) this.f834a.getSystemService(ProfilingManager.class);
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i7 = 0; i7 < 2; i7++) {
            Object obj = objArr[i7];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(DesugarCollections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new k(0, this, str));
    }

    public final boolean f(ia.c cVar) {
        ba.e.a();
        w wVar = this.f845n;
        if (wVar != null && wVar.f878e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, cVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String g() {
        NavigableSet d = this.f844m.f805b.d();
        if (!d.isEmpty()) {
            return (String) d.first();
        }
        return null;
    }

    public final String h() {
        String string;
        InputStream resourceAsStream;
        Context context = this.f834a;
        int e10 = g.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        if (e10 == 0) {
            string = null;
        } else {
            string = context.getResources().getString(e10);
        }
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f833s), 0);
        }
        ClassLoader classLoader = q.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream != null) {
            try {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Read version control info from file", null);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                }
            } catch (Throwable th2) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
    }

    public final void i() {
        boolean z9;
        try {
            String h = h();
            if (h != null) {
                try {
                    ((ab.q) this.d.f19236e).z("com.crashlytics.version-control-info", h);
                } catch (IllegalArgumentException e10) {
                    Context context = this.f834a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
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

    public final void j(Task task) {
        Task task2;
        Task a10;
        TaskCompletionSource taskCompletionSource = this.f846o;
        ga.d dVar = this.f844m.f805b.f13614b;
        if (ga.d.i(((File) dVar.f13621f).listFiles()).isEmpty() && ga.d.i(((File) dVar.h).listFiles()).isEmpty() && ga.d.i(((File) dVar.f13622n).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        x9.b bVar = x9.b.f58673a;
        bVar.c("Crash reports are available to be sent.");
        x xVar = this.f835b;
        if (xVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            a10 = Tasks.forResult(Boolean.TRUE);
        } else {
            bVar.b("Automatic data collection is disabled.");
            bVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (xVar.f881c) {
                task2 = xVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new sa.d(1));
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            a10 = ba.a.a(onSuccessTask, this.f847p.getTask());
        }
        a10.onSuccessTask(this.f837e.f3135a, new q4.q(3, this, task));
    }
}
