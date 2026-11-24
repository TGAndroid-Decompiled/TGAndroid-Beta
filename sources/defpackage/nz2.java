package defpackage;

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
public final class nz2 {
    public static final iz2 r = new iz2((byte) 1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final i73 b;
    public final lx6 c;
    public final jd4 d;
    public final mx6 e;
    public final vl5 f;
    public final jd4 g;
    public final ds h;
    public final hi2 i;
    public final qz2 j;
    public final rk k;
    public final jz2 l;
    public final p8a m;
    public z03 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public nz2(Context context, vl5 vl5Var, i73 i73Var, jd4 jd4Var, lx6 lx6Var, ds dsVar, jd4 jd4Var2, hi2 hi2Var, p8a p8aVar, qz2 qz2Var, rk rkVar, jz2 jz2Var, mx6 mx6Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = vl5Var;
        this.b = i73Var;
        this.g = jd4Var;
        this.c = lx6Var;
        this.h = dsVar;
        this.d = jd4Var2;
        this.i = hi2Var;
        this.j = qz2Var;
        this.k = rkVar;
        this.l = jz2Var;
        this.m = p8aVar;
        this.e = mx6Var;
    }

    public final void a(boolean r32, defpackage.ex8 r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz2.a(boolean, ex8, boolean):void");
    }

    public final void b(String str, Boolean bool) {
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String h = b10.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        Locale locale = Locale.US;
        vl5 vl5Var = this.f;
        ds dsVar = this.h;
        String str6 = vl5Var.c;
        String str7 = dsVar.f;
        String str8 = dsVar.g;
        String str9 = vl5Var.c().a;
        if (dsVar.d != null) {
            i = 4;
        } else {
            i = 1;
        }
        nb0 nb0Var = new nb0(str6, str7, str8, str9, ts2.h(i), dsVar.h);
        String str10 = Build.VERSION.RELEASE;
        String str11 = Build.VERSION.CODENAME;
        pb0 pb0Var = new pb0(bo2.i());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        zn2 zn2Var = zn2.a;
        String str12 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str12)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            zn2 zn2Var2 = (zn2) zn2.b.get(str12.toLowerCase(locale));
            if (zn2Var2 != null) {
                zn2Var = zn2Var2;
            }
        }
        int ordinal = zn2Var.ordinal();
        String str13 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a = bo2.a(context);
        boolean h2 = bo2.h();
        int d = bo2.d();
        String str14 = Build.MANUFACTURER;
        String str15 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new mb0(nb0Var, pb0Var, new ob0(ordinal, availableProcessors, d, a, blockCount, h2)));
        if (bool.booleanValue() && str != null) {
            jd4 jd4Var = this.d;
            synchronized (((String) jd4Var.a)) {
                jd4Var.a = str;
                str4 = str15;
                str5 = str13;
                str2 = str11;
                str3 = str14;
                i2 = 4;
                ((a13) ((mx6) jd4Var.c).c).a(new hza((Object) jd4Var, str, (Object) ((qx5) ((AtomicMarkableReference) ((yh4) jd4Var.d).b).getReference()).a(), (Object) ((xv6) jd4Var.f).i(), (byte) 20));
            }
        } else {
            str2 = str11;
            str3 = str14;
            str4 = str15;
            str5 = str13;
            i2 = 4;
        }
        hi2 hi2Var = this.i;
        ((gc4) hi2Var.c).a();
        hi2Var.c = hi2.f;
        if (str != null) {
            hi2Var.c = new ez8(((jd4) hi2Var.b).b(str, "userlog"));
        }
        this.l.b(str);
        p8a p8aVar = this.m;
        t03 t03Var = p8aVar.a;
        Charset charset = s03.a;
        ?? obj = new Object();
        obj.a = "20.1.1";
        ds dsVar2 = t03Var.c;
        String str16 = dsVar2.a;
        if (str16 != null) {
            obj.b = str16;
            vl5 vl5Var2 = t03Var.b;
            String str17 = vl5Var2.c().a;
            if (str17 != null) {
                obj.d = str17;
                obj.e = vl5Var2.c().b;
                obj.f = vl5Var2.c().c;
                String str18 = dsVar2.f;
                if (str18 != null) {
                    obj.h = str18;
                    String str19 = dsVar2.g;
                    if (str19 != null) {
                        obj.i = str19;
                        obj.c = i2;
                        obj.m = (byte) (obj.m | 1);
                        ?? obj2 = new Object();
                        obj2.f = false;
                        obj2.d = currentTimeMillis;
                        obj2.m = (byte) (((byte) (obj2.m | 2)) | 1);
                        if (str != null) {
                            obj2.b = str;
                            String str20 = t03.g;
                            if (str20 != null) {
                                obj2.a = str20;
                                String str21 = vl5Var2.c;
                                if (str21 != null) {
                                    hi2 hi2Var2 = dsVar2.h;
                                    String str22 = vl5Var2.c().a;
                                    i5 i5Var = (i5) hi2Var2.c;
                                    if (i5Var == null) {
                                        i5Var = new i5(hi2Var2);
                                        hi2Var2.c = i5Var;
                                    }
                                    i5 i5Var2 = i5Var;
                                    String str23 = i5Var.a;
                                    if (i5Var2 == null) {
                                        i5Var2 = new i5(hi2Var2);
                                        hi2Var2.c = i5Var2;
                                    }
                                    obj2.g = new m90(str21, str18, str19, str22, str23, i5Var2.b);
                                    ?? obj3 = new Object();
                                    obj3.a = 3;
                                    obj3.e = (byte) (obj3.e | 1);
                                    if (str10 != null) {
                                        obj3.b = str10;
                                        if (str2 != null) {
                                            obj3.c = str2;
                                            obj3.d = bo2.i();
                                            obj3.e = (byte) (obj3.e | 2);
                                            obj2.i = obj3.a();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i3 = 7;
                                            if (!TextUtils.isEmpty(str12) && (num = (Integer) t03.f.get(str12.toLowerCase(locale))) != null) {
                                                i3 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long a2 = bo2.a(t03Var.a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean h3 = bo2.h();
                                            int d2 = bo2.d();
                                            ?? obj4 = new Object();
                                            obj4.a = i3;
                                            byte b = (byte) (obj4.j | 1);
                                            obj4.j = b;
                                            if (str5 != null) {
                                                obj4.b = str5;
                                                obj4.c = availableProcessors2;
                                                obj4.d = a2;
                                                obj4.e = blockCount2;
                                                obj4.f = h3;
                                                obj4.g = d2;
                                                obj4.j = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16)) | 32);
                                                String str24 = str3;
                                                if (str24 != null) {
                                                    obj4.h = str24;
                                                    String str25 = str4;
                                                    if (str25 != null) {
                                                        obj4.i = str25;
                                                        obj2.j = obj4.a();
                                                        obj2.l = 3;
                                                        obj2.m = (byte) (obj2.m | 4);
                                                        obj.j = obj2.a();
                                                        a90 a3 = obj.a();
                                                        jd4 jd4Var2 = p8aVar.b.b;
                                                        l90 l90Var = a3.k;
                                                        if (l90Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str26 = l90Var.b;
                                                        try {
                                                            y03.g.getClass();
                                                            y03.g(jd4Var2.b(str26, "report"), w03.a.s(a3));
                                                            File b2 = jd4Var2.b(str26, "start-time");
                                                            long j = l90Var.d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b2), y03.e);
                                                            outputStreamWriter.write("");
                                                            b2.setLastModified(j * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String h4 = b10.h("Could not persist report for session ", str26);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", h4, e);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    gxc.d("Null modelClass");
                                                    return;
                                                }
                                                gxc.d("Null manufacturer");
                                                return;
                                            }
                                            gxc.d("Null model");
                                            return;
                                        }
                                        gxc.d("Null buildVersion");
                                        return;
                                    }
                                    gxc.d("Null version");
                                    return;
                                }
                                gxc.d("Null identifier");
                                return;
                            }
                            gxc.d("Null generator");
                            return;
                        }
                        gxc.d("Null identifier");
                        return;
                    }
                    gxc.d("Null displayVersion");
                    return;
                }
                gxc.d("Null buildVersion");
                return;
            }
            gxc.d("Null installationUuid");
            return;
        }
        gxc.d("Null gmpAppId");
    }

    public final void c(String str) {
        ExecutorService executorService = ((a13) this.e.c).a;
        ProfilingManager profilingManager = (ProfilingManager) this.a.getSystemService(ProfilingManager.class);
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(DesugarCollections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new kz2(this, str, (byte) 0));
    }

    public final boolean d(ex8 ex8Var) {
        boolean z;
        mx6.w();
        z03 z03Var = this.n;
        if (z03Var != null && z03Var.e.get()) {
            z = true;
        } else {
            z = false;
        }
        f8e f8eVar = f8e.b;
        if (z) {
            f8eVar.l("Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        f8eVar.k("Finalizing previously open sessions.");
        try {
            a(true, ex8Var, true);
            f8eVar.k("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet d = this.m.b.d();
        if (!d.isEmpty()) {
            return (String) d.first();
        }
        return null;
    }

    public final String f() {
        String string;
        InputStream resourceAsStream;
        Context context = this.a;
        int e = bo2.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        if (e == 0) {
            string = null;
        } else {
            string = context.getResources().getString(e);
        }
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = nz2.class.getClassLoader();
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
            } catch (Throwable th) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
    }

    public final void g(String str, ProfilingResult profilingResult) {
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
            if (!this.g.b(str, str2).createNewFile()) {
                String str3 = "Trigger file " + str2 + " exists for session: " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str3, null);
                }
            }
        } catch (IOException unused) {
            Log.e("FirebaseCrashlytics", "Unable to touch trigger file ".concat(str2), null);
        }
    }

    public final Task h() {
        Task call;
        ArrayList arrayList = new ArrayList();
        for (File file : jd4.e(((File) this.g.c).listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new mz2(this, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void i() {
        boolean z;
        try {
            String f = f();
            if (f != null) {
                try {
                    ((yh4) this.d.e).H("com.crashlytics.version-control-info", f);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void j(Task task) {
        Task task2;
        Task c;
        TaskCompletionSource taskCompletionSource = this.o;
        jd4 jd4Var = this.m.b.b;
        if (jd4.e(((File) jd4Var.e).listFiles()).isEmpty() && jd4.e(((File) jd4Var.f).listFiles()).isEmpty() && jd4.e(((File) jd4Var.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        f8e f8eVar = f8e.b;
        f8eVar.k("Crash reports are available to be sent.");
        i73 i73Var = this.b;
        if (i73Var.a()) {
            f8eVar.f("Automatic data collection is enabled. Allowing upload.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            c = Tasks.forResult(Boolean.TRUE);
        } else {
            f8eVar.f("Automatic data collection is disabled.");
            f8eVar.k("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (i73Var.c) {
                task2 = i73Var.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new kg7((byte) 16));
            f8eVar.f("Waiting for send/deleteUnsentReports to be called.");
            c = rr5.c(onSuccessTask, this.p.getTask());
        }
        c.onSuccessTask((a13) this.e.b, new hi2(this, task, false, (byte) 18));
    }
}
