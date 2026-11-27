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
public final class yy2 {
    public static final sy2 r = new sy2((byte) 1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final p63 b;
    public final lh2 c;
    public final gd4 d;
    public final rx6 e;
    public final yl5 f;
    public final gd4 g;
    public final er h;
    public final lh2 i;
    public final az2 j;
    public final sj k;
    public final ty2 l;
    public final faa m;
    public h03 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public yy2(Context context, yl5 yl5Var, p63 p63Var, gd4 gd4Var, lh2 lh2Var, er erVar, gd4 gd4Var2, lh2 lh2Var2, faa faaVar, az2 az2Var, sj sjVar, ty2 ty2Var, rx6 rx6Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = yl5Var;
        this.b = p63Var;
        this.g = gd4Var;
        this.c = lh2Var;
        this.h = erVar;
        this.d = gd4Var2;
        this.i = lh2Var2;
        this.j = az2Var;
        this.k = sjVar;
        this.l = ty2Var;
        this.m = faaVar;
        this.e = rx6Var;
    }

    public final void a(boolean r32, defpackage.oy8 r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy2.a(boolean, oy8, boolean):void");
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
        String i3 = c00.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i3, null);
        }
        Locale locale = Locale.US;
        yl5 yl5Var = this.f;
        er erVar = this.h;
        String str6 = yl5Var.c;
        String str7 = erVar.f;
        String str8 = erVar.g;
        String str9 = yl5Var.c().a;
        if (erVar.d != null) {
            i = 4;
        } else {
            i = 1;
        }
        pa0 pa0Var = new pa0(str6, str7, str8, str9, bs2.h(i), erVar.h);
        String str10 = Build.VERSION.RELEASE;
        String str11 = Build.VERSION.CODENAME;
        ra0 ra0Var = new ra0(jn2.i());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        hn2 hn2Var = hn2.a;
        String str12 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str12)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            hn2 hn2Var2 = (hn2) hn2.b.get(str12.toLowerCase(locale));
            if (hn2Var2 != null) {
                hn2Var = hn2Var2;
            }
        }
        int ordinal = hn2Var.ordinal();
        String str13 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a = jn2.a(context);
        boolean h = jn2.h();
        int d = jn2.d();
        String str14 = Build.MANUFACTURER;
        String str15 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new oa0(pa0Var, ra0Var, new qa0(ordinal, availableProcessors, d, a, blockCount, h)));
        if (bool.booleanValue() && str != null) {
            gd4 gd4Var = this.d;
            synchronized (((String) gd4Var.a)) {
                gd4Var.a = str;
                str4 = str15;
                str5 = str13;
                str2 = str11;
                str3 = str14;
                i2 = 4;
                ((i03) ((rx6) gd4Var.c).c).a(new kta(gd4Var, str, ((vx5) ((AtomicMarkableReference) ((vh4) gd4Var.d).b).getReference()).a(), ((qh2) gd4Var.f).g(), (byte) 21));
            }
        } else {
            str2 = str11;
            str3 = str14;
            str4 = str15;
            str5 = str13;
            i2 = 4;
        }
        lh2 lh2Var = this.i;
        ((dc4) lh2Var.c).a();
        lh2Var.c = lh2.f;
        if (str != null) {
            lh2Var.c = new q09(((gd4) lh2Var.b).b(str, "userlog"));
        }
        this.l.b(str);
        faa faaVar = this.m;
        d03 d03Var = faaVar.a;
        Charset charset = c03.a;
        ?? obj = new Object();
        obj.a = "20.1.1";
        er erVar2 = d03Var.c;
        String str16 = erVar2.a;
        if (str16 != null) {
            obj.b = str16;
            yl5 yl5Var2 = d03Var.b;
            String str17 = yl5Var2.c().a;
            if (str17 != null) {
                obj.d = str17;
                obj.e = yl5Var2.c().b;
                obj.f = yl5Var2.c().c;
                String str18 = erVar2.f;
                if (str18 != null) {
                    obj.h = str18;
                    String str19 = erVar2.g;
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
                            String str20 = d03.g;
                            if (str20 != null) {
                                obj2.a = str20;
                                String str21 = yl5Var2.c;
                                if (str21 != null) {
                                    qx6 qx6Var = erVar2.h;
                                    String str22 = yl5Var2.c().a;
                                    we3 we3Var = (we3) qx6Var.c;
                                    if (we3Var == null) {
                                        we3Var = new we3(qx6Var);
                                        qx6Var.c = we3Var;
                                    }
                                    we3 we3Var2 = we3Var;
                                    String str23 = we3Var.a;
                                    if (we3Var2 == null) {
                                        we3Var2 = new we3(qx6Var);
                                        qx6Var.c = we3Var2;
                                    }
                                    obj2.g = new o80(str21, str18, str19, str22, str23, we3Var2.b);
                                    ?? obj3 = new Object();
                                    obj3.a = 3;
                                    obj3.e = (byte) (obj3.e | 1);
                                    if (str10 != null) {
                                        obj3.b = str10;
                                        if (str2 != null) {
                                            obj3.c = str2;
                                            obj3.d = jn2.i();
                                            obj3.e = (byte) (obj3.e | 2);
                                            obj2.i = obj3.a();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i4 = 7;
                                            if (!TextUtils.isEmpty(str12) && (num = (Integer) d03.f.get(str12.toLowerCase(locale))) != null) {
                                                i4 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long a2 = jn2.a(d03Var.a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean h2 = jn2.h();
                                            int d2 = jn2.d();
                                            ?? obj4 = new Object();
                                            obj4.a = i4;
                                            byte b = (byte) (obj4.j | 1);
                                            obj4.j = b;
                                            if (str5 != null) {
                                                obj4.b = str5;
                                                obj4.c = availableProcessors2;
                                                obj4.d = a2;
                                                obj4.e = blockCount2;
                                                obj4.f = h2;
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
                                                        c80 a3 = obj.a();
                                                        gd4 gd4Var2 = faaVar.b.b;
                                                        n80 n80Var = a3.k;
                                                        if (n80Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str26 = n80Var.b;
                                                        try {
                                                            g03.g.getClass();
                                                            g03.g(gd4Var2.b(str26, "report"), e03.a.O(a3));
                                                            File b2 = gd4Var2.b(str26, "start-time");
                                                            long j = n80Var.d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b2), g03.e);
                                                            outputStreamWriter.write("");
                                                            b2.setLastModified(j * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String i5 = c00.i("Could not persist report for session ", str26);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", i5, e);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    p3d.h("Null modelClass");
                                                    return;
                                                }
                                                p3d.h("Null manufacturer");
                                                return;
                                            }
                                            p3d.h("Null model");
                                            return;
                                        }
                                        p3d.h("Null buildVersion");
                                        return;
                                    }
                                    p3d.h("Null version");
                                    return;
                                }
                                p3d.h("Null identifier");
                                return;
                            }
                            p3d.h("Null generator");
                            return;
                        }
                        p3d.h("Null identifier");
                        return;
                    }
                    p3d.h("Null displayVersion");
                    return;
                }
                p3d.h("Null buildVersion");
                return;
            }
            p3d.h("Null installationUuid");
            return;
        }
        p3d.h("Null gmpAppId");
    }

    public final void c(String str) {
        ExecutorService executorService = ((i03) this.e.c).a;
        ProfilingManager profilingManager = (ProfilingManager) this.a.getSystemService(ProfilingManager.class);
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(DesugarCollections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new vy2(this, str, (byte) 0));
    }

    public final boolean d(oy8 oy8Var) {
        boolean z;
        rx6.v();
        h03 h03Var = this.n;
        if (h03Var != null && h03Var.e.get()) {
            z = true;
        } else {
            z = false;
        }
        sae saeVar = sae.b;
        if (z) {
            saeVar.l("Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        saeVar.k("Finalizing previously open sessions.");
        try {
            a(true, oy8Var, true);
            saeVar.k("Closed all previously open sessions.");
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
        int e = jn2.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
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
        ClassLoader classLoader = yy2.class.getClassLoader();
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
        for (File file : gd4.e(((File) this.g.c).listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new xy2(this, parseLong));
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
                    ((vh4) this.d.e).H("com.crashlytics.version-control-info", f);
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
        gd4 gd4Var = this.m.b.b;
        if (gd4.e(((File) gd4Var.e).listFiles()).isEmpty() && gd4.e(((File) gd4Var.f).listFiles()).isEmpty() && gd4.e(((File) gd4Var.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        sae saeVar = sae.b;
        saeVar.k("Crash reports are available to be sent.");
        p63 p63Var = this.b;
        if (p63Var.a()) {
            saeVar.f("Automatic data collection is enabled. Allowing upload.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            c = Tasks.forResult(Boolean.TRUE);
        } else {
            saeVar.f("Automatic data collection is disabled.");
            saeVar.k("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (p63Var.c) {
                task2 = p63Var.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new sg7((byte) 16));
            saeVar.f("Waiting for send/deleteUnsentReports to be called.");
            c = ur5.c(onSuccessTask, this.p.getTask());
        }
        c.onSuccessTask((i03) this.e.b, new qx6(this, task, (byte) 16));
    }
}
