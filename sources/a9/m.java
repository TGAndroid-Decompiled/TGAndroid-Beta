package a9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaRoute2Info;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b5.w;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import e7.v;
import f9.a0;
import f9.b0;
import f9.s;
import f9.t;
import f9.x;
import j4.i1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m.t3;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.bc0;

public final class m implements z8.d, a2, h3.f, y9.a, bc0, Continuation, t2.e, d3.f, e4.g {

    public final int f184a;

    public m(int i10) {
        this.f184a = i10;
    }

    public static MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public h3.g a(Bundle bundle) {
        switch (this.f184a) {
            case 9:
                Bundle bundle2 = bundle.getBundle(w.f1991c);
                bundle2.getClass();
                i1 i1Var = (i1) i1.f12582n.a(bundle2);
                int[] intArray = bundle.getIntArray(w.d);
                intArray.getClass();
                return new w(i1Var, intArray.length == 0 ? Collections.EMPTY_LIST : new r8.a(0, intArray.length, intArray));
            default:
                return new e5.b(bundle.getInt(e5.b.f5227f, -1), bundle.getInt(e5.b.h, -1), bundle.getInt(e5.b.f5228n, -1), bundle.getByteArray(e5.b.f5229r));
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f184a) {
            case 24:
                fa.e eVar = (fa.e) obj;
                eVar.getClass();
                u2.b bVar = com.google.firebase.messaging.p.f4614a;
                bVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bVar.e(eVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        u2.b bVarA = w2.i.a();
                        bVarA.h(cursorRawQuery.getString(1));
                        bVarA.d = g3.a.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        bVarA.f48263c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(bVarA.d());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
        }
    }

    @Override
    public void b(y9.b bVar) {
        switch (this.f184a) {
            case 10:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f184a) {
            case 4:
                b2Var.dismiss();
                break;
            case 5:
                b2Var.dismiss();
                break;
            case 14:
                break;
            case 17:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override
    public String g(int i10) {
        switch (this.f184a) {
            case 15:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public Object then(Task task) {
        int i10;
        switch (this.f184a) {
            case 20:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    @Override
    public Object u0(af.h hVar) {
        Throwable th;
        int i10;
        Task task;
        Task taskOnSuccessTask;
        boolean z10;
        String str;
        c3.g gVar;
        boolean z11;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        m9.a aVarC;
        switch (this.f184a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4531a.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4533c.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f4532b.get();
            case 3:
                z8.m mVar = ExecutorsRegistrar.f4531a;
                return r.f195a;
            case 11:
                int i11 = CrashlyticsRegistrar.f4534a;
                t8.h hVar2 = (t8.h) hVar.a(t8.h.class);
                z8.o oVarV = hVar.v(c9.a.class);
                z8.o oVarV2 = hVar.v(u8.a.class);
                z9.d dVar = (z9.d) hVar.a(z9.d.class);
                z8.o oVarV3 = hVar.v(ha.a.class);
                hVar2.a();
                Context context = hVar2.f48119a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.6.0 for " + packageName, null);
                k9.c cVar = new k9.c(context);
                t tVar = new t(hVar2);
                x xVar = new x(context, packageName, dVar, tVar);
                c9.a aVar = new c9.a(oVarV);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(oVarV2);
                ExecutorService executorServiceA = f9.h.a("Crashlytics Exception Handler");
                f9.k kVar = new f9.k(tVar, cVar);
                ja.c cVar2 = ja.c.f12874a;
                ja.d dVar2 = ja.d.f12876a;
                ja.c cVar3 = ja.c.f12874a;
                ja.a aVarA = ja.c.a(dVar2);
                if (aVarA.f12866b != null) {
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " already registered.");
                    th = null;
                } else {
                    aVarA.f12866b = kVar;
                    Log.d("SessionsDependencies", "Subscriber " + dVar2 + " registered.");
                    th = null;
                    aVarA.f12865a.e(null);
                }
                ga.c cVar4 = new ga.c(oVarV3, 7);
                b9.a aVar2 = new b9.a(fVar);
                b9.a aVar3 = new b9.a(fVar);
                Throwable th2 = th;
                f9.q qVar = new f9.q(hVar2, xVar, aVar, tVar, aVar2, aVar3, cVar, executorServiceA, kVar, cVar4);
                hVar2.a();
                String str2 = hVar2.f48121c.f48132b;
                int iE = f9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iE == 0) {
                    iE = f9.h.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = iE != 0 ? context.getResources().getString(iE) : th2;
                ArrayList arrayList = new ArrayList();
                int iE2 = f9.h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iE3 = f9.h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iE4 = f9.h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (iE2 == 0 || iE3 == 0 || iE4 == 0) {
                    i10 = 3;
                    String str3 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iE2), Integer.valueOf(iE3), Integer.valueOf(iE4));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", str3, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(iE2);
                    String[] stringArray2 = context.getResources().getStringArray(iE3);
                    String[] stringArray3 = context.getResources().getStringArray(iE4);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i12 = 0;
                        while (i12 < stringArray3.length) {
                            int i13 = i12;
                            arrayList.add(new f9.e(stringArray[i12], stringArray2[i12], stringArray3[i13]));
                            i12 = i13 + 1;
                            th2 = null;
                        }
                    } else {
                        String str4 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str4, null);
                        }
                        th2 = null;
                    }
                    i10 = 3;
                }
                String strE = s3.c.e("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                    Log.d("FirebaseCrashlytics", strE, th2);
                }
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    f9.e eVar = (f9.e) obj;
                    String str5 = eVar.f5929a;
                    String str6 = eVar.f5930b;
                    String str7 = eVar.f5931c;
                    int i15 = size;
                    StringBuilder sbP = i0.a.p("Build id for ", str5, " on ", str6, ": ");
                    sbP.append(str7);
                    String string2 = sbP.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", string2, null);
                    }
                    size = i15;
                }
                try {
                    f9.a aVarA2 = f9.a.a(context, xVar, str2, string, arrayList, new xe.b((Object) context, 9));
                    String str8 = "Installer package name is: " + aVarA2.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str8, null);
                    }
                    ExecutorService executorServiceA2 = f9.h.a("com.google.firebase.crashlytics.startup");
                    xa.a aVar4 = new xa.a(10);
                    String str9 = aVarA2.f5919f;
                    String str10 = aVarA2.f5920g;
                    String strC = xVar.c();
                    ab.a aVar5 = new ab.a(7);
                    ga.c cVar5 = new ga.c(aVar5, 26);
                    k5.i iVar = new k5.i(cVar);
                    Locale locale = Locale.US;
                    ec.a aVar6 = new ec.a(p.m("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str2, "/settings"), aVar4);
                    String str11 = Build.MANUFACTURER;
                    String str12 = x.h;
                    String strW = p.w(str11.replaceAll(str12, ""), "/", Build.MODEL.replaceAll(str12, ""));
                    String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str12, "");
                    String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str12, "");
                    int iE5 = f9.h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (iE5 == 0) {
                        iE5 = f9.h.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {iE5 != 0 ? context.getResources().getString(iE5) : null, str2, str10, str9};
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = 0;
                    while (i16 < 4) {
                        String str13 = strArr[i16];
                        String[] strArr2 = strArr;
                        if (str13 != null) {
                            arrayList2.add(str13.replace("-", "").toLowerCase(Locale.US));
                        }
                        i16++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb2 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj2 = arrayList2.get(i17);
                        i17++;
                        sb2.append((String) obj2);
                        arrayList2 = arrayList2;
                    }
                    String string3 = sb2.toString();
                    m9.c cVar6 = new m9.c(str2, strW, strReplaceAll, strReplaceAll2, xVar, string3.length() > 0 ? f9.h.i(string3) : null, str10, str9, com.google.android.recaptcha.internal.a.c(strC != null ? 4 : 1));
                    c3.g gVar2 = new c3.g();
                    AtomicReference atomicReference = new AtomicReference();
                    gVar2.h = atomicReference;
                    gVar2.f2439i = new AtomicReference(new TaskCompletionSource());
                    gVar2.f2433a = context;
                    gVar2.f2434b = cVar6;
                    gVar2.d = aVar5;
                    gVar2.f2435c = cVar5;
                    gVar2.f2436e = iVar;
                    gVar2.f2437f = aVar6;
                    gVar2.f2438g = tVar;
                    atomicReference.set(ab.a.C(aVar5));
                    AtomicReference atomicReference2 = (AtomicReference) gVar2.f2439i;
                    AtomicReference atomicReference3 = (AtomicReference) gVar2.h;
                    if (!((Context) gVar2.f2433a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((m9.c) gVar2.f2434b).f17890f) || (aVarC = gVar2.c(1)) == null) {
                        m9.a aVarC2 = gVar2.c(3);
                        if (aVarC2 != null) {
                            atomicReference3.set(aVarC2);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(aVarC2);
                        }
                        t tVar2 = (t) gVar2.f2438g;
                        Task task2 = tVar2.h.getTask();
                        synchronized (tVar2.f5997c) {
                            task = tVar2.d.getTask();
                            break;
                        }
                        ExecutorService executorService = b0.f5926a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        a0 a0Var = new a0(0, taskCompletionSource);
                        task2.continueWith(executorServiceA2, a0Var);
                        task.continueWith(executorServiceA2, a0Var);
                        taskOnSuccessTask = taskCompletionSource.getTask().onSuccessTask(executorServiceA2, new ae.b(gVar2, 29));
                    } else {
                        atomicReference3.set(aVarC);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(aVarC);
                        taskOnSuccessTask = Tasks.forResult(null);
                    }
                    taskOnSuccessTask.continueWith(executorServiceA2, new v(3));
                    com.google.firebase.messaging.t tVar3 = qVar.f5981l;
                    k9.c cVar7 = qVar.h;
                    Context context2 = qVar.f5972a;
                    if (context2 == null || (resources = context2.getResources()) == null) {
                        z10 = true;
                    } else {
                        int iE6 = f9.h.e(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (iE6 > 0) {
                            z10 = resources.getBoolean(iE6);
                        } else {
                            int iE7 = f9.h.e(context2, "com.crashlytics.RequireBuildId", "string");
                            if (iE7 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(iE7));
                            } else {
                                z10 = true;
                            }
                        }
                    }
                    String str14 = r37.f5916b;
                    if (z10) {
                        str = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty(str14)) {
                            Log.e(str, ".");
                            Log.e(str, ".     |  | ");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".   \\ |  | /");
                            Log.e(str, ".    \\    /");
                            Log.e(str, ".     \\  /");
                            Log.e(str, ".      \\/");
                            Log.e(str, ".");
                            Log.e(str, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str, ".");
                            Log.e(str, ".      /\\");
                            Log.e(str, ".     /  \\");
                            Log.e(str, ".    /    \\");
                            Log.e(str, ".   / |  | \\");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".");
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                    } else {
                        str = "FirebaseCrashlytics";
                        if (Log.isLoggable(str, 2)) {
                            Log.v(str, "Configured not to require a build ID.", null);
                        }
                    }
                    new f9.f(qVar.f5977g);
                    String str15 = f9.f.f5933b;
                    try {
                        int i18 = 27;
                        boolean z12 = false;
                        qVar.f5975e = new xe.b("crash_marker", cVar7, z12, i18);
                        qVar.d = new xe.b("initialization_marker", cVar7, z12, i18);
                        t3 t3Var = new t3(str15, cVar7, tVar3);
                        g9.e eVar2 = new g9.e(cVar7);
                        try {
                            n9.a[] aVarArr = new n9.a[1];
                            try {
                                aVarArr[0] = new v(16);
                                g5.b bVar = new g5.b(aVarArr);
                                ((z8.o) qVar.f5984o.f6834b).a(new m(13));
                                try {
                                    com.google.firebase.messaging.m mVarK = com.google.firebase.messaging.m.k(qVar.f5972a, qVar.f5977g, qVar.h, aVarA2, eVar2, t3Var, bVar, gVar2, qVar.f5974c, qVar.f5982m);
                                    gVar = gVar2;
                                    try {
                                        qVar.f5976f = new f9.o(qVar.f5972a, qVar.f5981l, qVar.f5977g, qVar.f5973b, qVar.h, qVar.f5975e, aVarA2, t3Var, eVar2, mVarK, qVar.f5983n, qVar.f5979j, qVar.f5982m);
                                        xe.b bVar2 = qVar.d;
                                        k9.c cVar8 = (k9.c) bVar2.f49393c;
                                        String str16 = (String) bVar2.f49392b;
                                        cVar8.getClass();
                                        boolean zExists = new File(cVar8.f15099b, str16).exists();
                                        try {
                                            Boolean.TRUE.equals((Boolean) b0.a(tVar3.Q(new f9.p(qVar, 1))));
                                        } catch (Exception unused) {
                                        }
                                        f9.o oVar = qVar.f5976f;
                                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                        z11 = true;
                                        z11 = true;
                                        oVar.f5958e.Q(new f9.m(z11 ? 1 : 0, oVar, str15));
                                        s sVar = new s(new ga.c(oVar, 13), gVar, defaultUncaughtExceptionHandler, oVar.f5962j);
                                        oVar.f5966n = sVar;
                                        Thread.setDefaultUncaughtExceptionHandler(sVar);
                                        if (zExists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                                            if (Log.isLoggable(str, 3)) {
                                                Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                            }
                                            qVar.b(gVar);
                                            z11 = false;
                                        } else if (Log.isLoggable(str, 3)) {
                                            Log.d(str, "Successfully configured exception handler.", null);
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        Log.e(str, "Crashlytics was not started due to an exception during initialization", e);
                                        qVar.f5976f = null;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    gVar = gVar2;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                gVar = gVar2;
                                Log.e(str, "Crashlytics was not started due to an exception during initialization", e);
                                qVar.f5976f = null;
                                z11 = false;
                                Tasks.call(executorServiceA2, new b9.b(z11, qVar, gVar));
                                return new b9.c(qVar);
                            }
                        } catch (Exception e12) {
                            e = e12;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        gVar = gVar2;
                    }
                    Tasks.call(executorServiceA2, new b9.b(z11, qVar, gVar));
                    return new b9.c(qVar);
                } catch (PackageManager.NameNotFoundException e14) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e14);
                    return null;
                }
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(hVar);
        }
    }

    public m(Object obj, int i10) {
        this.f184a = i10;
    }

    private final void i(b2 b2Var, int i10) {
    }
}
