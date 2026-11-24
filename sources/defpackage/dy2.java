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
public final class dy2 {
    public static final yx2 r = new yx2((byte) 1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final w53 b;
    public final tg2 c;
    public final jb4 d;
    public final mv6 e;
    public final wj5 f;
    public final jb4 g;
    public final dr h;
    public final tg2 i;
    public final fy2 j;
    public final rj k;
    public final zx2 l;
    public final n6a m;
    public oz2 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public dy2(Context context, wj5 wj5Var, w53 w53Var, jb4 jb4Var, tg2 tg2Var, dr drVar, jb4 jb4Var2, tg2 tg2Var2, n6a n6aVar, fy2 fy2Var, rj rjVar, zx2 zx2Var, mv6 mv6Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = wj5Var;
        this.b = w53Var;
        this.g = jb4Var;
        this.c = tg2Var;
        this.h = drVar;
        this.d = jb4Var2;
        this.i = tg2Var2;
        this.j = fy2Var;
        this.k = rjVar;
        this.l = zx2Var;
        this.m = n6aVar;
        this.e = mv6Var;
    }

    public final void a(boolean r32, defpackage.dv8 r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy2.a(boolean, dv8, boolean):void");
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
        String h = b00.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        Locale locale = Locale.US;
        wj5 wj5Var = this.f;
        dr drVar = this.h;
        String str6 = wj5Var.c;
        String str7 = drVar.f;
        String str8 = drVar.g;
        String str9 = wj5Var.c().a;
        if (drVar.d != null) {
            i = 4;
        } else {
            i = 1;
        }
        na0 na0Var = new na0(str6, str7, str8, str9, ir2.h(i), drVar.h);
        String str10 = Build.VERSION.RELEASE;
        String str11 = Build.VERSION.CODENAME;
        pa0 pa0Var = new pa0(pm2.i());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        nm2 nm2Var = nm2.a;
        String str12 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str12)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            nm2 nm2Var2 = (nm2) nm2.b.get(str12.toLowerCase(locale));
            if (nm2Var2 != null) {
                nm2Var = nm2Var2;
            }
        }
        int ordinal = nm2Var.ordinal();
        String str13 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a = pm2.a(context);
        boolean h2 = pm2.h();
        int d = pm2.d();
        String str14 = Build.MANUFACTURER;
        String str15 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new ma0(na0Var, pa0Var, new oa0(ordinal, availableProcessors, d, a, blockCount, h2)));
        if (bool.booleanValue() && str != null) {
            jb4 jb4Var = this.d;
            synchronized (((String) jb4Var.a)) {
                jb4Var.a = str;
                str4 = str15;
                str5 = str13;
                str2 = str11;
                str3 = str14;
                i2 = 4;
                ((pz2) ((mv6) jb4Var.c).c).a(new exa((Object) jb4Var, str, (Object) ((qv5) ((AtomicMarkableReference) ((xf4) jb4Var.d).b).getReference()).a(), (Object) ((yg2) jb4Var.f).g(), (byte) 20));
            }
        } else {
            str2 = str11;
            str3 = str14;
            str4 = str15;
            str5 = str13;
            i2 = 4;
        }
        tg2 tg2Var = this.i;
        ((ga4) tg2Var.c).a();
        tg2Var.c = tg2.f;
        if (str != null) {
            tg2Var.c = new dx8(((jb4) tg2Var.b).b(str, "userlog"));
        }
        this.l.b(str);
        n6a n6aVar = this.m;
        iz2 iz2Var = n6aVar.a;
        Charset charset = hz2.a;
        ?? obj = new Object();
        obj.a = "20.1.1";
        dr drVar2 = iz2Var.c;
        String str16 = drVar2.a;
        if (str16 != null) {
            obj.b = str16;
            wj5 wj5Var2 = iz2Var.b;
            String str17 = wj5Var2.c().a;
            if (str17 != null) {
                obj.d = str17;
                obj.e = wj5Var2.c().b;
                obj.f = wj5Var2.c().c;
                String str18 = drVar2.f;
                if (str18 != null) {
                    obj.h = str18;
                    String str19 = drVar2.g;
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
                            String str20 = iz2.g;
                            if (str20 != null) {
                                obj2.a = str20;
                                String str21 = wj5Var2.c;
                                if (str21 != null) {
                                    lv6 lv6Var = drVar2.h;
                                    String str22 = wj5Var2.c().a;
                                    ce3 ce3Var = (ce3) lv6Var.c;
                                    if (ce3Var == null) {
                                        ce3Var = new ce3(lv6Var);
                                        lv6Var.c = ce3Var;
                                    }
                                    ce3 ce3Var2 = ce3Var;
                                    String str23 = ce3Var.b;
                                    if (ce3Var2 == null) {
                                        ce3Var2 = new ce3(lv6Var);
                                        lv6Var.c = ce3Var2;
                                    }
                                    obj2.g = new m80(str21, str18, str19, str22, str23, ce3Var2.c);
                                    ?? obj3 = new Object();
                                    obj3.a = 3;
                                    obj3.e = (byte) (obj3.e | 1);
                                    if (str10 != null) {
                                        obj3.b = str10;
                                        if (str2 != null) {
                                            obj3.c = str2;
                                            obj3.d = pm2.i();
                                            obj3.e = (byte) (obj3.e | 2);
                                            obj2.i = obj3.a();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i3 = 7;
                                            if (!TextUtils.isEmpty(str12) && (num = (Integer) iz2.f.get(str12.toLowerCase(locale))) != null) {
                                                i3 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long a2 = pm2.a(iz2Var.a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean h3 = pm2.h();
                                            int d2 = pm2.d();
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
                                                        a80 a3 = obj.a();
                                                        jb4 jb4Var2 = n6aVar.b.b;
                                                        l80 l80Var = a3.k;
                                                        if (l80Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str26 = l80Var.b;
                                                        try {
                                                            nz2.g.getClass();
                                                            nz2.g(jb4Var2.b(str26, "report"), lz2.a.q(a3));
                                                            File b2 = jb4Var2.b(str26, "start-time");
                                                            long j = l80Var.d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b2), nz2.e);
                                                            outputStreamWriter.write("");
                                                            b2.setLastModified(j * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String h4 = b00.h("Could not persist report for session ", str26);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", h4, e);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    fvc.f("Null modelClass");
                                                    return;
                                                }
                                                fvc.f("Null manufacturer");
                                                return;
                                            }
                                            fvc.f("Null model");
                                            return;
                                        }
                                        fvc.f("Null buildVersion");
                                        return;
                                    }
                                    fvc.f("Null version");
                                    return;
                                }
                                fvc.f("Null identifier");
                                return;
                            }
                            fvc.f("Null generator");
                            return;
                        }
                        fvc.f("Null identifier");
                        return;
                    }
                    fvc.f("Null displayVersion");
                    return;
                }
                fvc.f("Null buildVersion");
                return;
            }
            fvc.f("Null installationUuid");
            return;
        }
        fvc.f("Null gmpAppId");
    }

    public final void c(String str) {
        ExecutorService executorService = ((pz2) this.e.c).a;
        ProfilingManager profilingManager = (ProfilingManager) this.a.getSystemService(ProfilingManager.class);
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(DesugarCollections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new ay2(this, str, (byte) 0));
    }

    public final boolean d(dv8 dv8Var) {
        boolean z;
        mv6.s();
        oz2 oz2Var = this.n;
        if (oz2Var != null && oz2Var.e.get()) {
            z = true;
        } else {
            z = false;
        }
        c6e c6eVar = c6e.b;
        if (z) {
            c6eVar.l("Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        c6eVar.k("Finalizing previously open sessions.");
        try {
            a(true, dv8Var, true);
            c6eVar.k("Closed all previously open sessions.");
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
        int e = pm2.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
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
        ClassLoader classLoader = dy2.class.getClassLoader();
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
        for (File file : jb4.e(((File) this.g.c).listFiles(r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new cy2(this, parseLong));
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
                    ((xf4) this.d.e).H("com.crashlytics.version-control-info", f);
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
        jb4 jb4Var = this.m.b.b;
        if (jb4.e(((File) jb4Var.e).listFiles()).isEmpty() && jb4.e(((File) jb4Var.f).listFiles()).isEmpty() && jb4.e(((File) jb4Var.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        c6e c6eVar = c6e.b;
        c6eVar.k("Crash reports are available to be sent.");
        w53 w53Var = this.b;
        if (w53Var.a()) {
            c6eVar.g("Automatic data collection is enabled. Allowing upload.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            c = Tasks.forResult(Boolean.TRUE);
        } else {
            c6eVar.g("Automatic data collection is disabled.");
            c6eVar.k("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (w53Var.c) {
                task2 = w53Var.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new ie7((byte) 16));
            c6eVar.g("Waiting for send/deleteUnsentReports to be called.");
            c = rp5.c(onSuccessTask, this.p.getTask());
        }
        c.onSuccessTask((pz2) this.e.b, new lv6(this, task, (byte) 16));
    }
}
