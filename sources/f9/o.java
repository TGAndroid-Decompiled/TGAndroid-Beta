package f9;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g7.e8;
import h9.a1;
import h9.b1;
import h9.c0;
import h9.c1;
import h9.d1;
import h9.d2;
import h9.e1;
import h9.e2;
import h9.g0;
import h9.h0;
import h9.i0;
import h9.l0;
import h9.m0;
import h9.n0;
import h9.q0;
import h9.t0;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

    public static final i f5954r = new i(1);

    public final Context f5955a;

    public final t f5956b;

    public final xe.b f5957c;
    public final t3 d;

    public final com.google.firebase.messaging.t f5958e;

    public final x f5959f;

    public final k9.c f5960g;
    public final a h;

    public final g9.e f5961i;

    public final c9.a f5962j;

    public final d9.a f5963k;

    public final k f5964l;

    public final com.google.firebase.messaging.m f5965m;

    public s f5966n;

    public final TaskCompletionSource f5967o = new TaskCompletionSource();

    public final TaskCompletionSource f5968p = new TaskCompletionSource();

    public final TaskCompletionSource f5969q = new TaskCompletionSource();

    public o(Context context, com.google.firebase.messaging.t tVar, x xVar, t tVar2, k9.c cVar, xe.b bVar, a aVar, t3 t3Var, g9.e eVar, com.google.firebase.messaging.m mVar, c9.a aVar2, d9.a aVar3, k kVar) {
        new AtomicBoolean(false);
        this.f5955a = context;
        this.f5958e = tVar;
        this.f5959f = xVar;
        this.f5956b = tVar2;
        this.f5960g = cVar;
        this.f5957c = bVar;
        this.h = aVar;
        this.d = t3Var;
        this.f5961i = eVar;
        this.f5962j = aVar2;
        this.f5963k = aVar3;
        this.f5964l = kVar;
        this.f5965m = mVar;
    }

    public static void a(o oVar, String str, Boolean bool) {
        int i10;
        Integer num;
        oVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strE = s3.c.e("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strE, null);
        }
        Locale locale = Locale.US;
        x xVar = oVar.f5959f;
        a aVar = oVar.h;
        c1 c1Var = new c1(xVar.f6010c, aVar.f5919f, aVar.f5920g, xVar.b().f5927a, com.google.android.recaptcha.internal.a.c(aVar.d != null ? 4 : 1), aVar.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = oVar.f5955a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        g gVar = g.f5934a;
        String str4 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str4)) {
            i10 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i10 = 3;
            g gVar2 = (g) g.f5935b.get(str4.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        }
        int iOrdinal = gVar.ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = h.b(context);
        boolean zG = h.g();
        int iD = h.d();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        oVar.f5962j.d(str, jCurrentTimeMillis, new b1(c1Var, e1Var, new d1(iOrdinal, iAvailableProcessors, iD, jB, blockCount, zG)));
        if (!bool.booleanValue() || str == null) {
            jCurrentTimeMillis = jCurrentTimeMillis;
        } else {
            t3 t3Var = oVar.d;
            synchronized (((String) t3Var.f17475c)) {
                try {
                    t3Var.f17475c = str;
                    Map mapA = ((g9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.d).f4600b).getReference()).a();
                    List listG = ((n2.v) t3Var.f17477f).g();
                    if (((String) ((AtomicMarkableReference) t3Var.h).getReference()) != null) {
                        ((g9.g) t3Var.f17473a).i(str, (String) ((AtomicMarkableReference) t3Var.h).getReference());
                    }
                    if (!mapA.isEmpty()) {
                        ((g9.g) t3Var.f17473a).g(str, mapA, false);
                    }
                    if (!listG.isEmpty()) {
                        ((g9.g) t3Var.f17473a).h(str, listG);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        g9.e eVar = oVar.f5961i;
        ((g9.c) eVar.f6806b).a();
        eVar.f6806b = g9.e.f6804c;
        if (str != null) {
            eVar.f6806b = new g9.m(((k9.c) eVar.f6805a).b(str, "userlog"));
        }
        oVar.f5964l.b(str);
        com.google.firebase.messaging.m mVar = oVar.f5965m;
        r rVar = (r) mVar.f4602a;
        Charset charset = e2.f8682a;
        e8 e8Var = new e8();
        e8Var.f6455a = "18.6.0";
        a aVar2 = rVar.f5989c;
        String str8 = aVar2.f5915a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        e8Var.f6456b = str8;
        x xVar2 = rVar.f5988b;
        String str9 = xVar2.b().f5927a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        e8Var.f6457c = str9;
        e8Var.d = xVar2.b().f5928b;
        String str10 = aVar2.f5919f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        e8Var.f6463k = str10;
        String str11 = aVar2.f5920g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        e8Var.f6459f = str11;
        e8Var.f6461i = 4;
        g0 g0Var = new g0();
        g0Var.f8698f = Boolean.FALSE;
        g0Var.d = Long.valueOf(jCurrentTimeMillis);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        g0Var.f8695b = str;
        String str12 = r.f5986g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        g0Var.f8694a = str12;
        String str13 = xVar2.f6010c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = xVar2.b().f5927a;
        xe.b bVar = aVar2.h;
        if (((c9.b) bVar.f49393c) == null) {
            bVar.f49393c = new c9.b(bVar);
        }
        c9.b bVar2 = (c9.b) bVar.f49393c;
        String str15 = bVar2.f2566b;
        if (bVar2 == null) {
            bVar.f49393c = new c9.b(bVar);
        }
        g0Var.f8699g = new i0(str13, str10, str11, str14, str15, ((c9.b) bVar.f49393c).f2567c);
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(11, false);
        Integer numValueOf = Integer.valueOf(i10);
        tVar.d = numValueOf;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        tVar.f4619b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        tVar.f4621e = str3;
        tVar.f4620c = Boolean.valueOf(h.h());
        g0Var.f8700i = tVar.m();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) r.f5985f.get(str4.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jB2 = h.b(rVar.f5987a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zG2 = h.g();
        int iD2 = h.d();
        c3.g gVar3 = new c3.g();
        gVar3.f2433a = Integer.valueOf(iIntValue);
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        gVar3.f2434b = str5;
        gVar3.f2435c = Integer.valueOf(iAvailableProcessors2);
        gVar3.d = Long.valueOf(jB2);
        gVar3.f2436e = Long.valueOf(blockCount2);
        gVar3.f2437f = Boolean.valueOf(zG2);
        gVar3.f2438g = Integer.valueOf(iD2);
        if (str6 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        gVar3.h = str6;
        if (str7 == null) {
            throw new NullPointerException("Null modelClass");
        }
        gVar3.f2439i = str7;
        g0Var.f8701j = gVar3.b();
        g0Var.f8703l = numValueOf;
        e8Var.f6460g = g0Var.a();
        h9.a0 a0VarA = e8Var.a();
        k9.c cVar = ((k9.b) mVar.f4603b).f15096b;
        d2 d2Var = a0VarA.f8626j;
        if (d2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((h0) d2Var).f8706b;
        try {
            k9.b.f15093g.getClass();
            k9.b.f(cVar.b(str16, "report"), i9.a.f10965a.h(a0VarA));
            File fileB = cVar.b(str16, "start-time");
            long j10 = ((h0) d2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), k9.b.f15091e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException e9) {
            String strE2 = s3.c.e("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strE2, e9);
            }
        }
    }

    public static Task b(o oVar) {
        Task taskCall;
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : k9.c.e(oVar.f5960g.f15099b.listFiles(f5954r))) {
            try {
                long j10 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new n(oVar, j10));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public static String f() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i10;
        ClassLoader classLoader = o.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
            if (resourceAsStream == null) {
                Log.i("FirebaseCrashlytics", "No version control information found", null);
            }
            if (resourceAsStream == null) {
                return null;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info", null);
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            bArr = new byte[1024];
            while (true) {
                i10 = resourceAsStream.read(bArr);
                if (i10 != -1) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        }
        resourceAsStream = null;
        if (resourceAsStream == null) {
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Read version control info", null);
        }
        byteArrayOutputStream = new ByteArrayOutputStream();
        bArr = new byte[1024];
        while (true) {
            i10 = resourceAsStream.read(bArr);
            if (i10 != -1) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public final void c(boolean z10, c3.g gVar) {
        String str;
        String str2;
        boolean z11;
        Throwable th;
        List listB;
        ApplicationExitInfo next;
        String string;
        long j10;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        ArrayList arrayList = new ArrayList(((k9.b) this.f5965m.f4603b).c());
        FileInputStream fileInputStream2 = null;
        if (arrayList.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str3 = (String) arrayList.get(z10 ? 1 : 0);
        if (gVar.d().f17882b.f12886b) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f5955a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    k9.c cVar = this.f5960g;
                    g9.e eVar = new g9.e(cVar);
                    eVar.f6806b = g9.e.f6804c;
                    if (str3 != null) {
                        eVar.f6806b = new g9.m(cVar.b(str3, "userlog"));
                    }
                    k9.c cVar2 = this.f5960g;
                    com.google.firebase.messaging.t tVar = this.f5958e;
                    g9.g gVar2 = new g9.g(cVar2);
                    t3 t3Var = new t3(str3, cVar2, tVar);
                    ((g9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.d).f4600b).getReference()).d(gVar2.c(str3, false));
                    ((g9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.l) t3Var.f17476e).f4600b).getReference()).d(gVar2.c(str3, true));
                    ((AtomicMarkableReference) t3Var.h).set(gVar2.d(str3), false);
                    n2.v vVar = (n2.v) t3Var.f17477f;
                    File fileB = cVar2.b(str3, "rollouts-state");
                    if (!fileB.exists() || fileB.length() == 0) {
                        g9.g.f(fileB);
                        listB = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream = new FileInputStream(fileB);
                            try {
                                try {
                                    listB = g9.g.b(h.j(fileInputStream));
                                    String str4 = "Loaded rollouts state:\n" + listB + "\nfor session " + str3;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str4, null);
                                    }
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                } catch (Exception e9) {
                                    e = e9;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    g9.g.f(fileB);
                                    h.c(fileInputStream, "Failed to close rollouts state file.");
                                    listB = Collections.EMPTY_LIST;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream2 = fileInputStream;
                                h.c(fileInputStream2, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            h.c(fileInputStream2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (vVar) {
                        ((ArrayList) vVar.f18187c).clear();
                        if (listB.size() > vVar.f18186b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + vVar.f18186b, null);
                            ((ArrayList) vVar.f18187c).addAll(listB.subList(0, vVar.f18186b));
                        } else {
                            ((ArrayList) vVar.f18187c).addAll(listB);
                        }
                    }
                    com.google.firebase.messaging.m mVar = this.f5965m;
                    k9.b bVar = (k9.b) mVar.f4603b;
                    long jLastModified = bVar.f15096b.b(str3, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next.getTimestamp() < jLastModified) {
                            }
                        }
                        next = null;
                        break;
                    } while (next.getReason() != 6);
                    if (next == null) {
                        String strE = s3.c.e("No relevant ApplicationExitInfo occurred during session: ", str3);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strE, null);
                        }
                    } else {
                        r rVar = (r) mVar.f4602a;
                        try {
                            InputStream traceInputStream = next.getTraceInputStream();
                            if (traceInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i11 = traceInputStream.read(bArr);
                                    if (i11 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i11);
                                    }
                                    string = null;
                                }
                                string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            } else {
                                string = null;
                            }
                        } catch (IOException e11) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e11, null);
                        }
                        c3.g gVar3 = new c3.g();
                        gVar3.d = Integer.valueOf(next.getImportance());
                        String processName = next.getProcessName();
                        if (processName == null) {
                            throw new NullPointerException("Null processName");
                        }
                        gVar3.f2434b = processName;
                        gVar3.f2435c = Integer.valueOf(next.getReason());
                        gVar3.f2438g = Long.valueOf(next.getTimestamp());
                        gVar3.f2433a = Integer.valueOf(next.getPid());
                        gVar3.f2436e = Long.valueOf(next.getPss());
                        gVar3.f2437f = Long.valueOf(next.getRss());
                        gVar3.h = string;
                        h9.b0 b0VarA = gVar3.a();
                        int i12 = rVar.f5987a.getResources().getConfiguration().orientation;
                        com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
                        mVar2.f4603b = "anr";
                        long j11 = b0VarA.f8643g;
                        mVar2.f4602a = Long.valueOf(j11);
                        a aVar = rVar.f5989c;
                        if (!rVar.f5990e.d().f17882b.f12887c || aVar.f5917c.size() <= 0) {
                            j10 = j11;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = aVar.f5917c;
                            int size = arrayList3.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList3.get(i13);
                                int i14 = i13 + 1;
                                int i15 = size;
                                e eVar2 = (e) obj;
                                String str5 = eVar2.f5929a;
                                if (str5 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                ArrayList arrayList4 = arrayList3;
                                String str6 = eVar2.f5930b;
                                if (str6 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                String str7 = eVar2.f5931c;
                                if (str7 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                arrayList2.add(new c0(str6, str5, str7));
                                i13 = i14;
                                size = i15;
                                arrayList3 = arrayList4;
                                j11 = j11;
                            }
                            j10 = j11;
                            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                        }
                        c3.g gVar4 = new c3.g();
                        gVar4.d = Integer.valueOf(b0VarA.d);
                        String str8 = b0VarA.f8639b;
                        if (str8 == null) {
                            throw new NullPointerException("Null processName");
                        }
                        gVar4.f2434b = str8;
                        gVar4.f2435c = Integer.valueOf(b0VarA.f8640c);
                        gVar4.f2438g = Long.valueOf(j10);
                        gVar4.f2433a = Integer.valueOf(b0VarA.f8638a);
                        gVar4.f2436e = Long.valueOf(b0VarA.f8641e);
                        gVar4.f2437f = Long.valueOf(b0VarA.f8642f);
                        gVar4.h = b0VarA.h;
                        gVar4.f2439i = listUnmodifiableList;
                        h9.b0 b0VarA2 = gVar4.a();
                        Boolean boolValueOf = Boolean.valueOf(b0VarA2.d != 100);
                        String processName2 = b0VarA2.f8639b;
                        int i16 = b0VarA2.f8638a;
                        int i17 = b0VarA2.d;
                        kotlin.jvm.internal.j.e(processName2, "processName");
                        if ((8 & 4) != 0) {
                            i17 = 0;
                        }
                        com.google.firebase.messaging.t tVar2 = new com.google.firebase.messaging.t(9, false);
                        tVar2.f4619b = processName2;
                        tVar2.d = Integer.valueOf(i16);
                        tVar2.f4621e = Integer.valueOf(i17);
                        tVar2.f4620c = Boolean.FALSE;
                        t0 t0VarK = tVar2.k();
                        q0 q0Var = new q0(0L, "0", "0");
                        List listA = rVar.a();
                        if (listA == null) {
                            throw new NullPointerException("Null binaries");
                        }
                        mVar2.f4604c = new m0(new n0(null, null, b0VarA2, q0Var, listA), null, null, boolValueOf, t0VarK, null, i12);
                        mVar2.d = rVar.b(i12);
                        l0 l0VarG = mVar2.g();
                        String strE2 = s3.c.e("Persisting anr for session ", str3);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strE2, null);
                        }
                        bVar.d(com.google.firebase.messaging.m.d(com.google.firebase.messaging.m.b(l0VarG, eVar, t3Var), t3Var), str3, true);
                    }
                } else {
                    String strE3 = s3.c.e("No ApplicationExitInfo available. Session: ", str3);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strE3, null);
                    }
                }
            } else {
                String strK = i0.a.k(i10, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strK, null);
                }
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
        }
        if (this.f5962j.c(str3)) {
            String strE4 = s3.c.e("Finalizing native report for session ", str3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                th = null;
                Log.v("FirebaseCrashlytics", strE4, null);
            } else {
                th = null;
            }
            this.f5962j.a(str3).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str3, th);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str3, th);
            Log.w("FirebaseCrashlytics", "No native core present", th);
            str = th;
        } else {
            str = 0;
        }
        if (z10 != 0) {
            str2 = (String) arrayList.get(0);
        } else {
            this.f5964l.b(str);
            str2 = null;
        }
        com.google.firebase.messaging.m mVar3 = this.f5965m;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        k9.b bVar2 = (k9.b) mVar3.f4603b;
        k9.c cVar3 = bVar2.f15096b;
        cVar3.getClass();
        File file = cVar3.f15098a;
        k9.c.a(new File(file, ".com.google.firebase.crashlytics"));
        k9.c.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            k9.c.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet<String> navigableSetC = bVar2.c();
        if (str2 != null) {
            navigableSetC.remove(str2);
        }
        if (navigableSetC.size() > 8) {
            while (navigableSetC.size() > 8) {
                String str9 = (String) navigableSetC.last();
                String strE5 = s3.c.e("Removing session over cap: ", str9);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strE5, null);
                }
                k9.c.d(new File(cVar3.f15100c, str9));
                navigableSetC.remove(str9);
            }
        }
        for (String str10 : navigableSetC) {
            String strE6 = s3.c.e("Finalizing report for session ", str10);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strE6, null);
            }
            i9.a aVar2 = k9.b.f15093g;
            i iVar = k9.b.f15094i;
            File file2 = new File(cVar3.f15100c, str10);
            file2.mkdirs();
            List<File> listE = k9.c.e(file2.listFiles(iVar));
            if (listE.isEmpty()) {
                String strM = a9.p.m("Session ", str10, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM, null);
                }
            } else {
                Collections.sort(listE);
                ArrayList arrayList5 = new ArrayList();
                boolean z12 = false;
                for (File file3 : listE) {
                    try {
                        String strE7 = k9.b.e(file3);
                        aVar2.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE7));
                            try {
                                l0 l0VarE = i9.a.e(jsonReader);
                                jsonReader.close();
                                arrayList5.add(l0VarE);
                                if (z12) {
                                    z11 = true;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                }
                                z12 = z11;
                            } catch (Throwable th4) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (IllegalStateException e12) {
                            throw new IOException(e12);
                        }
                    } catch (IOException e13) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e13);
                    }
                }
                if (arrayList5.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str10, null);
                } else {
                    String strD = new g9.g(cVar3).d(str10);
                    String strA = bVar2.d.a(str10);
                    File fileB2 = cVar3.b(str10, "report");
                    try {
                        String strE8 = k9.b.e(fileB2);
                        aVar2.getClass();
                        h9.a0 a0VarI = i9.a.i(strE8);
                        e8 e8VarA = a0VarI.a();
                        d2 d2Var = a0VarI.f8626j;
                        if (d2Var != null) {
                            g0 g0VarA = d2Var.a();
                            g0VarA.f8697e = Long.valueOf(jCurrentTimeMillis);
                            g0VarA.f8698f = Boolean.valueOf(z12);
                            if (strD != null) {
                                g0VarA.h = new a1(strD);
                            }
                            e8VarA.f6460g = g0VarA.a();
                        }
                        h9.a0 a0VarA = e8VarA.a();
                        e8 e8VarA2 = a0VarA.a();
                        e8VarA2.f6458e = strA;
                        d2 d2Var2 = a0VarA.f8626j;
                        if (d2Var2 != null) {
                            g0 g0VarA2 = d2Var2.a();
                            g0VarA2.f8696c = strA;
                            e8VarA2.f6460g = g0VarA2.a();
                        }
                        h9.a0 a0VarA2 = e8VarA2.a();
                        d2 d2Var3 = a0VarA2.f8626j;
                        if (d2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        e8 e8VarA3 = a0VarA2.a();
                        g0 g0VarA3 = d2Var3.a();
                        g0VarA3.f8702k = arrayList5;
                        e8VarA3.f6460g = g0VarA3.a();
                        h9.a0 a0VarA3 = e8VarA3.a();
                        d2 d2Var4 = a0VarA3.f8626j;
                        if (d2Var4 != null) {
                            String str11 = "appQualitySessionId: " + strA;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str11, null);
                                    } catch (IOException e14) {
                                        e = e14;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                                    }
                                }
                                k9.b.f(z12 ? new File(cVar3.f15101e, ((h0) d2Var4).f8706b) : new File(cVar3.d, ((h0) d2Var4).f8706b), i9.a.f10965a.h(a0VarA3));
                            } catch (IOException e15) {
                                e = e15;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                            }
                        }
                        e = e14;
                    } catch (IOException e16) {
                        e = e16;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                }
                k9.c.d(new File(cVar3.f15100c, str10));
            }
            k9.c.d(new File(cVar3.f15100c, str10));
        }
        com.google.android.gms.internal.cast.a aVar3 = bVar2.f15097c.d().f17881a;
        ArrayList arrayListB = bVar2.b();
        int size2 = arrayListB.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = arrayListB.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final boolean d(c3.g gVar) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.f5958e.f4621e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        s sVar = this.f5966n;
        if (sVar != null && sVar.f5994e.get()) {
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
        } catch (Exception e9) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e9);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((k9.b) this.f5965m.f4603b).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    ((com.google.firebase.messaging.l) this.d.f17476e).r("com.crashlytics.version-control-info", strF);
                } catch (IllegalArgumentException e9) {
                    Context context = this.f5955a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e9;
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
        TaskCompletionSource taskCompletionSource = this.f5967o;
        k9.c cVar = ((k9.b) this.f5965m.f4603b).f15096b;
        if (k9.c.e(cVar.d.listFiles()).isEmpty() && k9.c.e(cVar.f15101e.listFiles()).isEmpty() && k9.c.e(cVar.f15102f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        c9.c cVar2 = c9.c.f2568a;
        cVar2.c("Crash reports are available to be sent.");
        t tVar = this.f5956b;
        if (tVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            cVar2.b("Automatic data collection is disabled.");
            cVar2.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (tVar.f5997c) {
                task2 = tVar.d.getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new za.b(6));
            cVar2.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f5968p.getTask();
            ExecutorService executorService = b0.f5926a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            a0 a0Var = new a0(1, taskCompletionSource2);
            taskOnSuccessTask.continueWith(a0Var);
            task4.continueWith(a0Var);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new xe.b(26, this, task));
    }
}
