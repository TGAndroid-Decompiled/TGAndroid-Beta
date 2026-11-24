package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ContactsWidgetConfigActivity;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class vu2 implements vt3, yc3, aq2, Continuation, d39, OnSuccessListener, k8, eja, x56, us2, pc3, th4, e39, pf8, ed, z97, ym3, no7, s29 {
    public final byte a;
    public final Object b;

    public vu2(tj tjVar, f86 f86Var, fr6 fr6Var, IOException iOException, boolean z) {
        this.a = (byte) 16;
        this.b = fr6Var;
    }

    @Override
    public final Object L(gl2 gl2Var) {
        String str;
        String str2;
        String str3;
        mv6 mv6Var;
        String str4;
        int i;
        int i2;
        int i3;
        Throwable th;
        lg4 lg4Var;
        String str5;
        String str6;
        int i4;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        q7a b;
        String replaceAll;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i5 = CrashlyticsRegistrar.d;
        long currentTimeMillis = System.currentTimeMillis();
        jg4 jg4Var = (jg4) gl2Var.a(jg4.class);
        rg4 rg4Var = (rg4) gl2Var.a(rg4.class);
        vq7 o = gl2Var.o(fy2.class);
        vq7 o2 = gl2Var.o(qj.class);
        vq7 o3 = gl2Var.o(dh4.class);
        ExecutorService executorService = (ExecutorService) gl2Var.i(crashlyticsRegistrar.c);
        jg4Var.a();
        Context context = jg4Var.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
        mv6 mv6Var2 = new mv6((ExecutorService) gl2Var.i(crashlyticsRegistrar.a), (ExecutorService) gl2Var.i(crashlyticsRegistrar.b));
        ?? obj = new Object();
        String str7 = ((b90) al8.a.b(context)).a;
        obj.a = str7;
        File filesDir = context.getFilesDir();
        obj.b = filesDir;
        if (str7.isEmpty()) {
            str = "FirebaseCrashlytics";
            str2 = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            str = "FirebaseCrashlytics";
            if (str7.length() > 40) {
                replaceAll = pm2.k(str7);
            } else {
                replaceAll = str7.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str2 = sb.toString();
        }
        File file = new File(filesDir, str2);
        jb4.c(file);
        obj.c = file;
        File file2 = new File(file, "open-sessions");
        jb4.c(file2);
        obj.d = file2;
        File file3 = new File(file, "reports");
        jb4.c(file3);
        obj.e = file3;
        File file4 = new File(file, "priority-reports");
        jb4.c(file4);
        obj.f = file4;
        File file5 = new File(file, "native-reports");
        jb4.c(file5);
        obj.g = file5;
        w53 w53Var = new w53(jg4Var);
        wj5 wj5Var = new wj5(context, packageName, rg4Var, w53Var);
        fy2 fy2Var = new fy2(o);
        sj sjVar = new sj(o2);
        zx2 zx2Var = new zx2(w53Var, obj);
        lh4 lh4Var = lh4.a;
        q6a q6aVar = q6a.a;
        lh4 lh4Var2 = lh4.a;
        jh4 a = lh4.a(q6aVar);
        if (a.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + q6aVar + " already registered.");
        } else {
            a.b = zx2Var;
            Log.d("FirebaseSessions", "Subscriber " + q6aVar + " registered.");
            a.a.countDown();
        }
        String str8 = str;
        rc1 rc1Var = new rc1(jg4Var, wj5Var, fy2Var, w53Var, new rj(sjVar), new rj(sjVar), obj, zx2Var, new g29(o3, (byte) 2), mv6Var2);
        mv6 mv6Var3 = (mv6) rc1Var.n;
        jg4Var.a();
        String str9 = jg4Var.c.b;
        int e = pm2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e == 0) {
            e = pm2.e(context, "com.crashlytics.android.build_id", "string");
        }
        if (e != 0) {
            str3 = context.getResources().getString(e);
        } else {
            str3 = null;
        }
        ArrayList arrayList = new ArrayList();
        int e2 = pm2.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e3 = pm2.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e4 = pm2.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (e2 != 0 && e3 != 0 && e4 != 0) {
            i = 0;
            String[] stringArray = context.getResources().getStringArray(e2);
            String[] stringArray2 = context.getResources().getStringArray(e3);
            String[] stringArray3 = context.getResources().getStringArray(e4);
            i2 = 1;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i6 = 0;
                while (i6 < stringArray3.length) {
                    int i7 = i6;
                    arrayList.add(new u01(stringArray[i7], stringArray2[i7], stringArray3[i7]));
                    i6 = i7 + 1;
                    str9 = str9;
                    mv6Var3 = mv6Var3;
                }
                mv6Var = mv6Var3;
                str4 = str9;
            } else {
                mv6Var = mv6Var3;
                str4 = str9;
                String format = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable(str8, 3)) {
                    Log.d(str8, format, null);
                }
            }
            i3 = 3;
            th = null;
        } else {
            mv6Var = mv6Var3;
            str4 = str9;
            i = 0;
            i2 = 1;
            i3 = 3;
            String format2 = String.format("Could not find resources: %d %d %d", Integer.valueOf(e2), Integer.valueOf(e3), Integer.valueOf(e4));
            th = null;
            if (Log.isLoggable(str8, 3)) {
                Log.d(str8, format2, null);
            }
        }
        String h = b00.h("Mapping file ID is: ", str3);
        if (Log.isLoggable(str8, i3)) {
            Log.d(str8, h, th);
        }
        int size = arrayList.size();
        int i8 = i;
        while (i8 < size) {
            Object obj2 = arrayList.get(i8);
            i8++;
            u01 u01Var = (u01) obj2;
            String str10 = u01Var.a;
            String str11 = u01Var.b;
            String str12 = u01Var.c;
            int i9 = size;
            StringBuilder l = yjb.l("Build id for ", str10, " on ", str11, ": ");
            l.append(str12);
            String sb2 = l.toString();
            if (Log.isLoggable(str8, 3)) {
                Log.d(str8, sb2, null);
            }
            size = i9;
        }
        String str13 = str4;
        try {
            dr a2 = dr.a(context, wj5Var, str13, str3, arrayList, new lv6(context, (byte) 21));
            String str14 = "Installer package name is: " + a2.d;
            if (Log.isLoggable(str8, 2)) {
                Log.v(str8, str14, null);
            }
            new eef((byte) 20);
            String str15 = a2.f;
            String str16 = a2.g;
            String d = wj5Var.d();
            ize izeVar = new ize((byte) 27);
            u39 u39Var = new u39(izeVar, (byte) 11);
            l69 l69Var = new l69((jb4) obj);
            Locale locale = Locale.US;
            String y = tb4.y("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str13, "/settings");
            ?? obj3 = new Object();
            obj3.a = y;
            String str17 = Build.MANUFACTURER;
            String str18 = wj5.h;
            String p = tb4.p(str17.replaceAll(str18, ""), "/", Build.MODEL.replaceAll(str18, ""));
            String replaceAll2 = Build.VERSION.INCREMENTAL.replaceAll(str18, "");
            String replaceAll3 = Build.VERSION.RELEASE.replaceAll(str18, "");
            int e5 = pm2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e5 == 0) {
                e5 = pm2.e(context, "com.crashlytics.android.build_id", "string");
            }
            if (e5 != 0) {
                str5 = context.getResources().getString(e5);
            } else {
                str5 = null;
            }
            String[] strArr = {str5, str13, str16, str15};
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (i10 < 4) {
                String str19 = strArr[i10];
                String[] strArr2 = strArr;
                if (str19 != null) {
                    arrayList2.add(str19.replace("-", "").toLowerCase(Locale.US));
                }
                i10++;
                strArr = strArr2;
            }
            Collections.sort(arrayList2);
            StringBuilder sb3 = new StringBuilder();
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj4 = arrayList2.get(i11);
                i11++;
                sb3.append((String) obj4);
                str15 = str15;
            }
            String str20 = str15;
            String sb4 = sb3.toString();
            if (sb4.length() > 0) {
                str6 = pm2.k(sb4);
            } else {
                str6 = null;
            }
            if (d != null) {
                i4 = 4;
            } else {
                i4 = i2;
            }
            dv8 dv8Var = new dv8(context, new l8a(str13, p, replaceAll2, replaceAll3, wj5Var, str6, str16, str20, ir2.h(i4)), izeVar, u39Var, l69Var, obj3, w53Var);
            AtomicReference atomicReference = (AtomicReference) dv8Var.h;
            AtomicReference atomicReference2 = dv8Var.a;
            if (((Context) dv8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((l8a) dv8Var.c).f) && (b = dv8Var.b(i2)) != null) {
                atomicReference2.set(b);
                ((TaskCompletionSource) atomicReference.get()).trySetResult(b);
                onSuccessTask = Tasks.forResult(null);
            } else {
                q7a b2 = dv8Var.b(3);
                if (b2 != null) {
                    atomicReference2.set(b2);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(b2);
                }
                w53 w53Var2 = (w53) dv8Var.g;
                Task task2 = w53Var2.h.getTask();
                synchronized (w53Var2.c) {
                    task = w53Var2.d.getTask();
                }
                onSuccessTask = rp5.c(task2, task).onSuccessTask((pz2) mv6Var2.b, new wk4(dv8Var, mv6Var2, false, (byte) 27));
            }
            onSuccessTask.addOnFailureListener(executorService, new w44((byte) 16));
            jb4 jb4Var = (jb4) rc1Var.h;
            Context context2 = (Context) rc1Var.a;
            boolean c = pm2.c(context2, "com.google.firebase.crashlytics.RequireBuildId", pm2.c(context2, "com.crashlytics.RequireBuildId", true));
            String str21 = a2.b;
            if (!c) {
                if (Log.isLoggable(str8, 2)) {
                    Log.v(str8, "Configured not to require a build ID.", null);
                }
            } else if (TextUtils.isEmpty(str21)) {
                Log.e(str8, ".");
                Log.e(str8, ".     |  | ");
                Log.e(str8, ".     |  |");
                Log.e(str8, ".     |  |");
                Log.e(str8, ".   \\ |  | /");
                Log.e(str8, ".    \\    /");
                Log.e(str8, ".     \\  /");
                Log.e(str8, ".      \\/");
                Log.e(str8, ".");
                Log.e(str8, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                Log.e(str8, ".");
                Log.e(str8, ".      /\\");
                Log.e(str8, ".     /  \\");
                Log.e(str8, ".    /    \\");
                Log.e(str8, ".   / |  | \\");
                Log.e(str8, ".     |  |");
                Log.e(str8, ".     |  |");
                Log.e(str8, ".     |  |");
                Log.e(str8, ".");
                sc8.j("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                return null;
            }
            String str22 = new j51().a;
            try {
                rc1Var.e = new tg2("crash_marker", jb4Var, (byte) 18);
                rc1Var.d = new tg2("initialization_marker", jb4Var, (byte) 18);
                mv6 mv6Var4 = mv6Var;
                jb4 jb4Var2 = new jb4(str22, jb4Var, mv6Var4);
                tg2 tg2Var = new tg2(jb4Var);
                sk4 sk4Var = new sk4(new pma[]{new eef((byte) 24)});
                ((vq7) ((g29) rc1Var.m).b).a(new sc8((byte) 15));
                rc1Var.f = new dy2((Context) rc1Var.a, (wj5) rc1Var.g, (w53) rc1Var.b, (jb4) rc1Var.h, (tg2) rc1Var.e, a2, jb4Var2, tg2Var, n6a.d((Context) rc1Var.a, (wj5) rc1Var.g, (jb4) rc1Var.h, a2, tg2Var, jb4Var2, sk4Var, dv8Var, (sk4) rc1Var.c, (zx2) rc1Var.k, (mv6) rc1Var.n), (fy2) rc1Var.l, (rj) rc1Var.j, (zx2) rc1Var.k, (mv6) rc1Var.n);
                tg2 tg2Var2 = (tg2) rc1Var.d;
                boolean exists = new File((File) ((jb4) tg2Var2.c).c, (String) tg2Var2.b).exists();
                try {
                    Boolean.TRUE.equals((Boolean) ((pz2) mv6Var4.b).a.submit(new mk(rc1Var, (byte) 1)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                }
                dy2 dy2Var = (dy2) rc1Var.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                ((pz2) dy2Var.e.b).a(new gu2(dy2Var, str22, (byte) 6));
                oz2 oz2Var = new oz2(new i4d(dy2Var), dv8Var, defaultUncaughtExceptionHandler, dy2Var.j);
                dy2Var.n = oz2Var;
                Thread.setDefaultUncaughtExceptionHandler(oz2Var);
                if (Build.VERSION.SDK_INT >= 37) {
                    ((dy2) rc1Var.f).c(str22);
                }
                if (exists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str8, 3)) {
                        Log.d(str8, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                    }
                    rc1Var.b(dv8Var);
                } else {
                    if (Log.isLoggable(str8, 3)) {
                        Log.d(str8, "Successfully configured exception handler.", null);
                    }
                    ((pz2) mv6Var4.b).a(new ey2(rc1Var, dv8Var, (byte) 0));
                }
            } catch (Exception e6) {
                Log.e(str8, "Crashlytics was not started due to an exception during initialization", e6);
                rc1Var.f = null;
            }
            lg4Var = new lg4(rc1Var);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e(str8, "Error retrieving app package info.", e7);
            lg4Var = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            String n = ug8.n(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
            if (Log.isLoggable(str8, 3)) {
                Log.d(str8, n, null);
            }
        }
        return lg4Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        mq3 mq3Var = (mq3) this.b;
        mq3Var.e = vxcVar;
        io5 H0 = gl.H0(vxcVar, false);
        io5 H02 = gl.H0(vxcVar, true);
        if (!mq3Var.f.equals(H0) || !mq3Var.h.equals(H02)) {
            gl.m = H0.b;
            gl.n = H0.d;
            mq3Var.f = H0;
            mq3Var.h = H02;
            mq3Var.requestLayout();
        }
        int childCount = mq3Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mq3Var.getChildAt(i);
            if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                jdc.b(childAt, vxcVar);
            }
        }
        mq3Var.invalidate();
        return vxc.b;
    }

    @Override
    public final void accept(Object obj) {
        ((vq3) obj).a((vi2) this.b);
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        ((n30) this.b).run();
        return true;
    }

    @Override
    public final void c(long j, long j2) {
        long[] jArr = (long[]) this.b;
        ExecutorService executorService = DictationLid.a;
        long[] jArr2 = (long[]) DictationAsr.h.get("tinylid.bin");
        if (jArr2 != null) {
            jArr2[0] = j;
            if (j2 > 0) {
                jArr2[1] = j2;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - jArr[0] > 100) {
            jArr[0] = elapsedRealtime;
            DictationAsr.n();
        }
    }

    @Override
    public final boolean d(int r36, final android.view.View r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu2.d(int, android.view.View):boolean");
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        c4c G;
        Object obj;
        long j;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                q03 q03Var = (q03) obj2;
                HashSet hashSet = q03Var.W1;
                if (!q03Var.X1 && (G = q03Var.Y1.G(i - 1)) != null && (obj = G.H) != null) {
                    if (obj instanceof TLRPC.User) {
                        j = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j = ((TLRPC.Chat) obj).id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j))) {
                        hashSet.remove(Long.valueOf(j));
                    } else {
                        hashSet.add(Long.valueOf(j));
                    }
                    if (view instanceof kz9) {
                        ((kz9) view).c(hashSet.contains(Long.valueOf(j)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((DataAutoDownloadActivity) obj2).p0(f, i, view);
                return;
        }
    }

    @Override
    public final void f() {
        ((jv3) this.b).invalidate();
    }

    @Override
    public final void g(float f) {
        zac zacVar = ((uac) this.b).b;
        if (zacVar.f == f) {
            return;
        }
        zacVar.f = f;
        zacVar.c(false);
    }

    @Override
    public final void h(mt8 mt8Var) {
        fy2 fy2Var = (fy2) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        fy2Var.b.set((fy2) mt8Var.get());
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 13:
                ((uj) obj).u((j54) obj2);
                return;
            case 14:
                ((uj) obj).onSeekStarted((tj) obj2);
                return;
            case 15:
                ((uj) obj).j((w83) obj2);
                return;
            default:
                ((uj) obj).i((fr6) obj2);
                return;
        }
    }

    @Override
    public final w59 j(int i, sxb sxbVar, int[] iArr) {
        nc3 nc3Var = (nc3) this.b;
        jm5 p = mm5.p();
        for (int i2 = 0; i2 < sxbVar.a; i2++) {
            p.c(new kc3(i, sxbVar, i2, nc3Var, iArr[i2]));
        }
        return p.f();
    }

    @Override
    public final void k(int i) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((s20) this.b).e;
        tp3 tp3Var = (tp3) dataAutoDownloadActivity.c.get(i);
        if (tp3Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 0;
        } else if (tp3Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 1;
        } else if (tp3Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i2 = dataAutoDownloadActivity.f;
        if (i2 == 0) {
            up3.q(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.e;
        } else if (i2 == 1) {
            up3.q(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.e;
        } else {
            up3.q(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).S = dataAutoDownloadActivity.e;
        }
        SharedPreferences.Editor edit = na7.q1(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).X3.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        up3.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).g();
        for (int i3 = 0; i3 < 4; i3++) {
            s49 K = dataAutoDownloadActivity.b.K(DataAutoDownloadActivity.j0(dataAutoDownloadActivity) + i3);
            if (K != null) {
                dataAutoDownloadActivity.a.t(K, DataAutoDownloadActivity.j0(dataAutoDownloadActivity) + i3);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override
    public final void l(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void m() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                ((t03) obj2).invoke(obj);
                return;
            case 6:
                ((u13) obj2).invoke(obj);
                return;
            case 7:
                ((u13) obj2).invoke(obj);
                return;
            case 8:
                ((u13) obj2).invoke(obj);
                return;
            default:
                ((k23) obj2).invoke(obj);
                return;
        }
    }

    @Override
    public final boolean q(View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        m8 m8Var = (m8) ((f9) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m8Var != null && m8Var.isShowing()) {
            m8Var.d(true);
        }
    }

    @Override
    public final Object then(Task task) {
        return (Task) ((by2) this.b).call();
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 22:
                ((de2) obj).run();
                return;
            default:
                ((pt3) obj).a.d.q();
                return;
        }
    }

    public vu2(tj tjVar, Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public vu2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void n() {
    }

    private final void a(View view, float f, float f2) {
    }

    private final void i(View view, float f, float f2) {
    }
}
