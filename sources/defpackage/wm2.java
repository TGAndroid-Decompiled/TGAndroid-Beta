package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.p;
import org.telegram.ui.ContactsWidgetConfigActivity;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
public final class wm2 implements m7, oac, gv3, ke3, lr2, Continuation, g59, OnSuccessListener, k8, gla, x76, fu2, ce3, xj4, h59, rh8, ee, ac7, io3, qq7 {
    public final byte a;
    public final Object b;

    public wm2(tk tkVar, ea6 ea6Var, ft6 ft6Var, IOException iOException, boolean z) {
        this.a = (byte) 19;
        this.b = ft6Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        wr3 wr3Var = (wr3) this.b;
        wr3Var.e = wzcVar;
        iq5 H0 = gm.H0(wzcVar, false);
        iq5 H02 = gm.H0(wzcVar, true);
        if (!wr3Var.f.equals(H0) || !wr3Var.h.equals(H02)) {
            gm.m = H0.b;
            gm.n = H0.d;
            wr3Var.f = H0;
            wr3Var.h = H02;
            wr3Var.requestLayout();
        }
        int childCount = wr3Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = wr3Var.getChildAt(i);
            if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                kfc.b(childAt, wzcVar);
            }
        }
        wr3Var.invalidate();
        return wzc.b;
    }

    @Override
    public final Object X(sm2 sm2Var) {
        String str;
        String str2;
        String str3;
        mx6 mx6Var;
        String str4;
        int i;
        int i2;
        int i3;
        Throwable th;
        ni4 ni4Var;
        String str5;
        String str6;
        int i4;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        r9a b;
        String replaceAll;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i5 = CrashlyticsRegistrar.d;
        long currentTimeMillis = System.currentTimeMillis();
        li4 li4Var = (li4) sm2Var.a(li4.class);
        ti4 ti4Var = (ti4) sm2Var.a(ti4.class);
        xs7 v = sm2Var.v(qz2.class);
        xs7 v2 = sm2Var.v(qk.class);
        xs7 v3 = sm2Var.v(fj4.class);
        ExecutorService executorService = (ExecutorService) sm2Var.i(crashlyticsRegistrar.c);
        li4Var.a();
        Context context = li4Var.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
        mx6 mx6Var2 = new mx6((ExecutorService) sm2Var.i(crashlyticsRegistrar.a), (ExecutorService) sm2Var.i(crashlyticsRegistrar.b));
        ?? obj = new Object();
        String str7 = ((ba0) cn8.a.b(context)).a;
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
                replaceAll = bo2.k(str7);
            } else {
                replaceAll = str7.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str2 = sb.toString();
        }
        File file = new File(filesDir, str2);
        jd4.c(file);
        obj.c = file;
        File file2 = new File(file, "open-sessions");
        jd4.c(file2);
        obj.d = file2;
        File file3 = new File(file, "reports");
        jd4.c(file3);
        obj.e = file3;
        File file4 = new File(file, "priority-reports");
        jd4.c(file4);
        obj.f = file4;
        File file5 = new File(file, "native-reports");
        jd4.c(file5);
        obj.g = file5;
        i73 i73Var = new i73(li4Var);
        vl5 vl5Var = new vl5(context, packageName, ti4Var, i73Var);
        qz2 qz2Var = new qz2(v);
        sk skVar = new sk(v2);
        jz2 jz2Var = new jz2(i73Var, obj);
        pj4 pj4Var = pj4.a;
        s8a s8aVar = s8a.a;
        pj4 pj4Var2 = pj4.a;
        nj4 a = pj4.a(s8aVar);
        if (a.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + s8aVar + " already registered.");
        } else {
            a.b = jz2Var;
            Log.d("FirebaseSessions", "Subscriber " + s8aVar + " registered.");
            a.a.countDown();
        }
        String str8 = str;
        zd1 zd1Var = new zd1(li4Var, vl5Var, qz2Var, i73Var, new rk(skVar), new rk(skVar), obj, jz2Var, new et8(v3, (byte) 4), mx6Var2);
        mx6 mx6Var3 = (mx6) zd1Var.n;
        li4Var.a();
        String str9 = li4Var.c.b;
        int e = bo2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e == 0) {
            e = bo2.e(context, "com.crashlytics.android.build_id", "string");
        }
        if (e != 0) {
            str3 = context.getResources().getString(e);
        } else {
            str3 = null;
        }
        ArrayList arrayList = new ArrayList();
        int e2 = bo2.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e3 = bo2.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e4 = bo2.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
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
                    arrayList.add(new c21(stringArray[i7], stringArray2[i7], stringArray3[i7]));
                    i6 = i7 + 1;
                    str9 = str9;
                    mx6Var3 = mx6Var3;
                }
                mx6Var = mx6Var3;
                str4 = str9;
            } else {
                mx6Var = mx6Var3;
                str4 = str9;
                String format = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable(str8, 3)) {
                    Log.d(str8, format, null);
                }
            }
            i3 = 3;
            th = null;
        } else {
            mx6Var = mx6Var3;
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
        String h = b10.h("Mapping file ID is: ", str3);
        if (Log.isLoggable(str8, i3)) {
            Log.d(str8, h, th);
        }
        int size = arrayList.size();
        int i8 = i;
        while (i8 < size) {
            Object obj2 = arrayList.get(i8);
            i8++;
            c21 c21Var = (c21) obj2;
            String str10 = c21Var.a;
            String str11 = c21Var.b;
            String str12 = c21Var.c;
            int i9 = size;
            StringBuilder m = mlb.m("Build id for ", str10, " on ", str11, ": ");
            m.append(str12);
            String sb2 = m.toString();
            if (Log.isLoggable(str8, 3)) {
                Log.d(str8, sb2, null);
            }
            size = i9;
        }
        String str13 = str4;
        try {
            ds a2 = ds.a(context, vl5Var, str13, str3, arrayList, new hi2(context));
            String str14 = "Installer package name is: " + a2.d;
            if (Log.isLoggable(str8, 2)) {
                Log.v(str8, str14, null);
            }
            fgf fgfVar = new fgf((byte) 20);
            String str15 = a2.f;
            String str16 = a2.g;
            String d = vl5Var.d();
            k1f k1fVar = new k1f((byte) 27);
            x59 x59Var = new x59(k1fVar, (byte) 11);
            ni6 ni6Var = new ni6((jd4) obj);
            Locale locale = Locale.US;
            ld3 ld3Var = new ld3(kt6.o("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str13, "/settings"), fgfVar);
            String str17 = Build.MANUFACTURER;
            String str18 = vl5.h;
            String q = td4.q(str17.replaceAll(str18, ""), "/", Build.MODEL.replaceAll(str18, ""));
            String replaceAll2 = Build.VERSION.INCREMENTAL.replaceAll(str18, "");
            String replaceAll3 = Build.VERSION.RELEASE.replaceAll(str18, "");
            int e5 = bo2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e5 == 0) {
                e5 = bo2.e(context, "com.crashlytics.android.build_id", "string");
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
                Object obj3 = arrayList2.get(i11);
                i11++;
                sb3.append((String) obj3);
                arrayList2 = arrayList2;
            }
            String sb4 = sb3.toString();
            if (sb4.length() > 0) {
                str6 = bo2.k(sb4);
            } else {
                str6 = null;
            }
            if (d != null) {
                i4 = 4;
            } else {
                i4 = i2;
            }
            ex8 ex8Var = new ex8(context, new laa(str13, q, replaceAll2, replaceAll3, vl5Var, str6, str16, str15, ts2.h(i4)), k1fVar, x59Var, ni6Var, ld3Var, i73Var);
            AtomicReference atomicReference = (AtomicReference) ex8Var.h;
            AtomicReference atomicReference2 = ex8Var.a;
            if (((Context) ex8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((laa) ex8Var.c).f) && (b = ex8Var.b(i2)) != null) {
                atomicReference2.set(b);
                ((TaskCompletionSource) atomicReference.get()).trySetResult(b);
                onSuccessTask = Tasks.forResult(null);
            } else {
                r9a b2 = ex8Var.b(3);
                if (b2 != null) {
                    atomicReference2.set(b2);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(b2);
                }
                i73 i73Var2 = (i73) ex8Var.g;
                Task task2 = i73Var2.h.getTask();
                synchronized (i73Var2.c) {
                    task = i73Var2.d.getTask();
                }
                onSuccessTask = rr5.c(task2, task).onSuccessTask((a13) mx6Var2.b, new wm4(ex8Var, mx6Var2, false, (byte) 27));
            }
            onSuccessTask.addOnFailureListener(executorService, new h64((byte) 18));
            jd4 jd4Var = (jd4) zd1Var.h;
            Context context2 = (Context) zd1Var.a;
            boolean c = bo2.c(context2, "com.google.firebase.crashlytics.RequireBuildId", bo2.c(context2, "com.crashlytics.RequireBuildId", true));
            String str20 = a2.b;
            if (!c) {
                if (Log.isLoggable(str8, 2)) {
                    Log.v(str8, "Configured not to require a build ID.", null);
                }
            } else if (TextUtils.isEmpty(str20)) {
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
                dq9.m("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                return null;
            }
            String str21 = new q61().a;
            try {
                zd1Var.e = new lx6("crash_marker", jd4Var, (byte) 17);
                zd1Var.d = new lx6("initialization_marker", jd4Var, (byte) 17);
                mx6 mx6Var4 = mx6Var;
                jd4 jd4Var2 = new jd4(str21, jd4Var, mx6Var4);
                hi2 hi2Var = new hi2(jd4Var);
                mj4 mj4Var = new mj4(new qoa[]{new fgf((byte) 24)});
                ((xs7) ((et8) zd1Var.m).b).a(new i98((byte) 16));
                zd1Var.f = new nz2((Context) zd1Var.a, (vl5) zd1Var.g, (i73) zd1Var.b, (jd4) zd1Var.h, (lx6) zd1Var.e, a2, jd4Var2, hi2Var, p8a.d((Context) zd1Var.a, (vl5) zd1Var.g, (jd4) zd1Var.h, a2, hi2Var, jd4Var2, mj4Var, ex8Var, (mj4) zd1Var.c, (jz2) zd1Var.k, (mx6) zd1Var.n), (qz2) zd1Var.l, (rk) zd1Var.j, (jz2) zd1Var.k, (mx6) zd1Var.n);
                lx6 lx6Var = (lx6) zd1Var.d;
                boolean exists = new File((File) ((jd4) lx6Var.c).c, (String) lx6Var.b).exists();
                try {
                    Boolean.TRUE.equals((Boolean) ((a13) mx6Var4.b).a.submit(new ml(zd1Var, (byte) 1)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                }
                nz2 nz2Var = (nz2) zd1Var.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                ((a13) nz2Var.e.b).a(new mv2(nz2Var, str21, (byte) 7));
                z03 z03Var = new z03(new nl9(nz2Var, (byte) 22), ex8Var, defaultUncaughtExceptionHandler, nz2Var.j);
                nz2Var.n = z03Var;
                Thread.setDefaultUncaughtExceptionHandler(z03Var);
                if (Build.VERSION.SDK_INT >= 37) {
                    ((nz2) zd1Var.f).c(str21);
                }
                if (exists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str8, 3)) {
                        Log.d(str8, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                    }
                    zd1Var.b(ex8Var);
                } else {
                    if (Log.isLoggable(str8, 3)) {
                        Log.d(str8, "Successfully configured exception handler.", null);
                    }
                    ((a13) mx6Var4.b).a(new oz2(zd1Var, ex8Var, (byte) 0));
                }
            } catch (Exception e6) {
                Log.e(str8, "Crashlytics was not started due to an exception during initialization", e6);
                zd1Var.f = null;
            }
            ni4Var = new ni4(zd1Var);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e(str8, "Error retrieving app package info.", e7);
            ni4Var = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            String n = wi8.n(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
            if (Log.isLoggable(str8, 3)) {
                Log.d(str8, n, null);
            }
        }
        return ni4Var;
    }

    @Override
    public final void accept(Object obj) {
        ((fs3) obj).a((jk2) this.b);
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        ((n40) this.b).run();
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
    public final void d(float f, float f2, int i, View view) {
        c6c G;
        Object obj;
        long j;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                c23 c23Var = (c23) obj2;
                HashSet hashSet = c23Var.W1;
                if (!c23Var.X1 && (G = c23Var.Y1.G(i - 1)) != null && (obj = G.H) != null) {
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
                    if (view instanceof m1a) {
                        ((m1a) view).c(hashSet.contains(Long.valueOf(j)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((DataAutoDownloadActivity) obj2).q0(f, i, view);
                return;
        }
    }

    @Override
    public final void f(nv8 nv8Var) {
        qz2 qz2Var = (qz2) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        qz2Var.b.set((qz2) nv8Var.get());
    }

    @Override
    public final boolean g(int i, final View view) {
        TLRPC.Chat chat;
        String str;
        sn2 sn2Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        bu5 bu5Var;
        boolean z9;
        byte b;
        Drawable drawable;
        final aj3 aj3Var = (aj3) this.b;
        if (aj3Var.O == 0.0f && aj3Var.o0 == 0.0f) {
            final long j = ((hh3) view).F;
            nk3 nk3Var = aj3Var.P0;
            hs6.d0(nk3.V0(nk3Var)).O0(true);
            bu5 I = bu5.I(nk3Var, view);
            I.z.set(0, gm.L(8.0f), 0, 0);
            I.X(cmb.c0(gm.L(12.0f), gm.L(12.0f), nk3Var.getThemedColor(cmb.c6)));
            I.b0(0.0f, gm.L(8.0f));
            nk3Var.M0 = I;
            if (m9c.C(j)) {
                xx0.APP_ERROR.a();
            } else {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                if (j == z8c.h(nk3.W0(nk3Var)).e()) {
                    if (!nk3Var.R3) {
                        aj3 aj3Var2 = nk3Var.F0;
                        if (aj3Var2 != null) {
                            aj3Var2.n();
                        }
                    } else {
                        bu5 bu5Var2 = nk3Var.M0;
                        String M0 = jb6.M0(2131754381, null);
                        int i3 = cmb.E8;
                        int i4 = cmb.D8;
                        bu5Var2.a(2131232389, null, M0, i3, i4, new zg3(aj3Var, (byte) 1));
                        nk3Var.M0.a(2131232390, null, jb6.M0(2131754088, null), i3, i4, new zg3(aj3Var, (byte) 2));
                        nk3Var.M0.a(2131232397, null, jb6.M0(2131745619, null), i3, i4, new zg3(aj3Var, (byte) 3));
                        b = 3;
                    }
                } else {
                    final TLRPC.User W1 = nk3Var.getMessagesController().W1(Long.valueOf(j));
                    TLRPC.Chat L0 = nk3Var.getMessagesController().L0(Long.valueOf(-j));
                    String p = lo7.p(j, 0L, false);
                    boolean d0 = NotificationsCustomSettingsActivity.d0(nk3.X0(nk3Var), j);
                    boolean H3 = oc7.r1(nk3.Y0(nk3Var)).H3();
                    boolean p2 = z8c.h(nk3.Z0(nk3Var)).p();
                    boolean K = oc7.r1(nk3.a1(nk3Var)).N1().K(j);
                    boolean G = oc7.r1(nk3.b1(nk3Var)).N1().G(j);
                    if (!H3 && j > 0 && !p2 && (drawable = aj3Var.getContext().getDrawable(2131232175)) != null) {
                        Drawable drawable2 = aj3Var.getContext().getDrawable(2131232387);
                        if (drawable2 != null) {
                            chat = L0;
                            anb.x(aj3Var, drawable2, cmb.E8, nk3Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                        } else {
                            chat = L0;
                        }
                        str = p;
                        drawable.setColorFilter(new PorterDuffColorFilter(on2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        sn2Var = new sn2(drawable2, drawable);
                    } else {
                        chat = L0;
                        str = p;
                        sn2Var = null;
                    }
                    int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i5 < 0 && nk3Var.v3().i(j)) {
                        nk3Var.M0.a(2131232389, null, jb6.M0(2131754381, null), cmb.E8, cmb.D8, new Runnable() {
                            @Override
                            public final void run() {
                                int i6;
                                byte b2 = r4;
                                long j2 = j;
                                aj3 aj3Var3 = aj3Var;
                                switch (b2) {
                                    case 0:
                                        aj3Var3.P0.presentFragment(yv1.ga(j2));
                                        return;
                                    case 1:
                                        nk3 nk3Var2 = aj3Var3.P0;
                                        gm.d3(new yh3(nk3Var2, j, !nk3Var2.F3(), (byte) 0), 200L);
                                        return;
                                    case 2:
                                        nk3 nk3Var3 = aj3Var3.P0;
                                        gm.d3(new yh3(nk3Var3, j, !nk3Var3.F3(), (byte) 0), 200L);
                                        return;
                                    case 3:
                                        nk3 nk3Var4 = aj3Var3.P0;
                                        i6 = ((d) nk3Var4).currentAccount;
                                        hs6.d0(i6).Q1(j2);
                                        nk3Var4.getMessagesController().N1().l0(j2, true, false);
                                        return;
                                    case 4:
                                        aj3Var3.P0.F0.j(j2);
                                        return;
                                    case 5:
                                        aj3Var3.P0.presentFragment(yv1.ga(j2));
                                        return;
                                    default:
                                        aj3Var3.P0.presentFragment(ProfileActivity.S2(j2));
                                        return;
                                }
                            }
                        });
                    }
                    if (W1 != null && !W1.contact && hs6.d0(nk3.c1(nk3Var)).I(j)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bu5 bu5Var3 = nk3Var.M0;
                    if (i5 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bu5Var3.k(2131232119, jb6.M0(2131745335, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                case 1:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var2, j, !nk3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var3, j, !nk3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    nk3 nk3Var4 = aj3Var3.P0;
                                    i6 = ((d) nk3Var4).currentAccount;
                                    hs6.d0(i6).Q1(j2);
                                    nk3Var4.getMessagesController().N1().l0(j2, true, false);
                                    return;
                                case 4:
                                    aj3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                default:
                                    aj3Var3.P0.presentFragment(ProfileActivity.S2(j2));
                                    return;
                            }
                        }
                    }, z2);
                    if (i5 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bu5Var3.k(2131232272, jb6.M0(2131747519, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                case 1:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var2, j, !nk3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var3, j, !nk3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    nk3 nk3Var4 = aj3Var3.P0;
                                    i6 = ((d) nk3Var4).currentAccount;
                                    hs6.d0(i6).Q1(j2);
                                    nk3Var4.getMessagesController().N1().l0(j2, true, false);
                                    return;
                                case 4:
                                    aj3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                default:
                                    aj3Var3.P0.presentFragment(ProfileActivity.S2(j2));
                                    return;
                            }
                        }
                    }, z3);
                    if (i5 < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (sd2.V(chat)) {
                        i2 = 2131747544;
                    } else {
                        i2 = 2131747532;
                    }
                    bu5Var3.k(2131232094, jb6.M0(i2, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                case 1:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var2, j, !nk3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var3, j, !nk3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    nk3 nk3Var4 = aj3Var3.P0;
                                    i6 = ((d) nk3Var4).currentAccount;
                                    hs6.d0(i6).Q1(j2);
                                    nk3Var4.getMessagesController().N1().l0(j2, true, false);
                                    return;
                                case 4:
                                    aj3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                default:
                                    aj3Var3.P0.presentFragment(ProfileActivity.S2(j2));
                                    return;
                            }
                        }
                    }, z4);
                    if (d0 && i5 > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    final String str2 = str;
                    bu5Var3.k(2131232262, jb6.M0(2131747596, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            int i7;
                            byte b2 = r6;
                            String str3 = "";
                            TLRPC.User user = W1;
                            String str4 = str2;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    i6 = ((d) nk3Var2).currentAccount;
                                    SharedPreferences.Editor edit = oc7.r1(i6).W3.edit();
                                    edit.putBoolean("stories_" + str4, false).apply();
                                    nk3Var2.getNotificationsController().c0(j, 0L, true);
                                    if (user != null) {
                                        str3 = user.first_name.trim();
                                    }
                                    int indexOf = str3.indexOf(" ");
                                    if (indexOf > 0) {
                                        str3 = str3.substring(0, indexOf);
                                    }
                                    c41.b0(nk3Var2).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryMutedHint", null, 2131747595, str3)), null, null).j();
                                    return;
                                default:
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    i7 = ((d) nk3Var3).currentAccount;
                                    SharedPreferences.Editor edit2 = oc7.r1(i7).W3.edit();
                                    edit2.putBoolean("stories_" + str4, true).apply();
                                    nk3Var3.getNotificationsController().c0(j, 0L, true);
                                    if (user != null) {
                                        str3 = user.first_name.trim();
                                    }
                                    int indexOf2 = str3.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        str3 = str3.substring(0, indexOf2);
                                    }
                                    c41.b0(nk3Var3).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryUnmutedHint", null, 2131747592, str3)), null, null).j();
                                    return;
                            }
                        }
                    }, z5);
                    bu5Var3.F();
                    if (!d0 && i5 > 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bu5Var3.k(2131232418, jb6.M0(2131747593, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            int i7;
                            byte b2 = r6;
                            String str3 = "";
                            TLRPC.User user = W1;
                            String str4 = str2;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    i6 = ((d) nk3Var2).currentAccount;
                                    SharedPreferences.Editor edit = oc7.r1(i6).W3.edit();
                                    edit.putBoolean("stories_" + str4, false).apply();
                                    nk3Var2.getNotificationsController().c0(j, 0L, true);
                                    if (user != null) {
                                        str3 = user.first_name.trim();
                                    }
                                    int indexOf = str3.indexOf(" ");
                                    if (indexOf > 0) {
                                        str3 = str3.substring(0, indexOf);
                                    }
                                    c41.b0(nk3Var2).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryMutedHint", null, 2131747595, str3)), null, null).j();
                                    return;
                                default:
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    i7 = ((d) nk3Var3).currentAccount;
                                    SharedPreferences.Editor edit2 = oc7.r1(i7).W3.edit();
                                    edit2.putBoolean("stories_" + str4, true).apply();
                                    nk3Var3.getNotificationsController().c0(j, 0L, true);
                                    if (user != null) {
                                        str3 = user.first_name.trim();
                                    }
                                    int indexOf2 = str3.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        str3 = str3.substring(0, indexOf2);
                                    }
                                    c41.b0(nk3Var3).V(Arrays.asList(user), gm.S2(jb6.a0("NotificationsStoryUnmutedHint", null, 2131747592, str3)), null, null).j();
                                    return;
                            }
                        }
                    }, z6);
                    bu5Var3.F();
                    if (!H3 && i5 > 0 && p2 && K && !G) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    bu5Var3.k(2131232399, jb6.M0(2131743246, null), new Runnable() {
                        @Override
                        public final void run() {
                            ylb ylbVar;
                            int i6;
                            ylb ylbVar2;
                            byte b2 = r3;
                            View view2 = view;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = oc7.r1(z8c.t0).N1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i6 = ((d) nk3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i6).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof hh3) {
                                                nk3Var2.F0.i((hh3) view2, false);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    Context context = aj3Var3.getContext();
                                    ylbVar = ((d) nk3Var2).resourceProvider;
                                    h0b h0bVar = new h0b(context, 0.0f, 1, ylbVar);
                                    h0bVar.o1 = new zi3(aj3Var3, view2, (byte) 1);
                                    nk3Var2.showDialog(h0bVar);
                                    return;
                                default:
                                    Context context2 = aj3Var3.getContext();
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    ylbVar2 = ((d) nk3Var3).resourceProvider;
                                    h0b h0bVar2 = new h0b(context2, 0.0f, 1, ylbVar2);
                                    h0bVar2.o1 = new zi3(aj3Var3, view2, (byte) 0);
                                    nk3Var3.showDialog(h0bVar2);
                                    return;
                            }
                        }
                    }, z7);
                    bu5Var3.F();
                    if (!H3 && i5 > 0 && !p2 && K && !G) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    String M02 = jb6.M0(2131743246, null);
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            ylb ylbVar;
                            int i6;
                            ylb ylbVar2;
                            byte b2 = r3;
                            View view2 = view;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = oc7.r1(z8c.t0).N1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i6 = ((d) nk3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i6).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof hh3) {
                                                nk3Var2.F0.i((hh3) view2, false);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    Context context = aj3Var3.getContext();
                                    ylbVar = ((d) nk3Var2).resourceProvider;
                                    h0b h0bVar = new h0b(context, 0.0f, 1, ylbVar);
                                    h0bVar.o1 = new zi3(aj3Var3, view2, (byte) 1);
                                    nk3Var2.showDialog(h0bVar);
                                    return;
                                default:
                                    Context context2 = aj3Var3.getContext();
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    ylbVar2 = ((d) nk3Var3).resourceProvider;
                                    h0b h0bVar2 = new h0b(context2, 0.0f, 1, ylbVar2);
                                    h0bVar2.o1 = new zi3(aj3Var3, view2, (byte) 0);
                                    nk3Var3.showDialog(h0bVar2);
                                    return;
                            }
                        }
                    };
                    if (!z8) {
                        bu5Var = bu5Var3;
                    } else {
                        bu5Var3.a(2131232399, sn2Var, M02, cmb.E8, cmb.D8, runnable);
                        bu5Var = bu5Var3;
                    }
                    bu5Var.F();
                    if (!z && !nk3Var.F3()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z10 = true;
                    bu5Var.k(2131232057, jb6.M0(2131754118, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                case 1:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var2, j, !nk3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var3, j, !nk3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    nk3 nk3Var4 = aj3Var3.P0;
                                    i6 = ((d) nk3Var4).currentAccount;
                                    hs6.d0(i6).Q1(j2);
                                    nk3Var4.getMessagesController().N1().l0(j2, true, false);
                                    return;
                                case 4:
                                    aj3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                default:
                                    aj3Var3.P0.presentFragment(ProfileActivity.S2(j2));
                                    return;
                            }
                        }
                    }, z9);
                    bu5Var.F();
                    bu5Var.k(2131232415, jb6.M0(2131743601, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                case 1:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var2, j, !nk3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var3, j, !nk3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    nk3 nk3Var4 = aj3Var3.P0;
                                    i6 = ((d) nk3Var4).currentAccount;
                                    hs6.d0(i6).Q1(j2);
                                    nk3Var4.getMessagesController().N1().l0(j2, true, false);
                                    return;
                                case 4:
                                    aj3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                default:
                                    aj3Var3.P0.presentFragment(ProfileActivity.S2(j2));
                                    return;
                            }
                        }
                    }, (z || !nk3Var.F3()) ? false : false);
                    bu5Var.F();
                    b = 3;
                    bu5Var.k(2131232114, jb6.M0(2131744437, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            aj3 aj3Var3 = aj3Var;
                            switch (b2) {
                                case 0:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                case 1:
                                    nk3 nk3Var2 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var2, j, !nk3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    nk3 nk3Var3 = aj3Var3.P0;
                                    gm.d3(new yh3(nk3Var3, j, !nk3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    nk3 nk3Var4 = aj3Var3.P0;
                                    i6 = ((d) nk3Var4).currentAccount;
                                    hs6.d0(i6).Q1(j2);
                                    nk3Var4.getMessagesController().N1().l0(j2, true, false);
                                    return;
                                case 4:
                                    aj3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    aj3Var3.P0.presentFragment(yv1.ga(j2));
                                    return;
                                default:
                                    aj3Var3.P0.presentFragment(ProfileActivity.S2(j2));
                                    return;
                            }
                        }
                    }, z);
                }
                bu5 bu5Var4 = nk3Var.M0;
                bu5Var4.i = b;
                bu5Var4.b0(gm.L(-8.0f), gm.L(-10.0f));
                bu5Var4.a0();
                return false;
            }
        }
        return false;
    }

    @Override
    public final void h(int i) {
        an2 an2Var = ((p) this.b).a;
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i == 3) {
                an2Var.b();
                return;
            }
            return;
        }
        if (i != 2) {
            z = false;
        }
        an2Var.a(z);
    }

    @Override
    public final void i(int i) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((s30) this.b).e;
        dr3 dr3Var = (dr3) dataAutoDownloadActivity.c.get(i);
        if (dr3Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 0;
        } else if (dr3Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 1;
        } else if (dr3Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i2 = dataAutoDownloadActivity.f;
        if (i2 == 0) {
            er3.q(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.e;
        } else if (i2 == 1) {
            er3.q(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.e;
        } else {
            er3.q(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).S = dataAutoDownloadActivity.e;
        }
        SharedPreferences.Editor edit = oc7.r1(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).X3.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        er3.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).g();
        for (int i3 = 0; i3 < 4; i3++) {
            u69 K = dataAutoDownloadActivity.b.K(DataAutoDownloadActivity.k0(dataAutoDownloadActivity) + i3);
            if (K != null) {
                dataAutoDownloadActivity.a.t(K, DataAutoDownloadActivity.k0(dataAutoDownloadActivity) + i3);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 16:
                ((uk) obj).s((u64) obj2);
                return;
            case 17:
                ((uk) obj).onSeekStarted((tk) obj2);
                return;
            case 18:
                ((uk) obj).j((ia3) obj2);
                return;
            default:
                ((uk) obj).i((ft6) obj2);
                return;
        }
    }

    @Override
    public final void j(float f) {
        cdc cdcVar = ((xcc) this.b).b;
        if (cdcVar.f == f) {
            return;
        }
        cdcVar.f = f;
        cdcVar.c(false);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        tu2 tu2Var = (tu2) this.b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        int i = ((c6c) obj).d;
        if (i == 1) {
            TLRPC.User W1 = tu2Var.getMessagesController().W1(Long.valueOf(tu2Var.I));
            if (W1 != null && tu2Var.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tu2Var.r, tu2Var.getParentActivity());
                String M0 = jb6.M0(2131751489, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131754068, null);
                alertDialog$Builder.j(jb6.M0(2131751535, null), new x92(tu2Var, W1, (byte) 9));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
            }
        } else if (i == 2) {
            boolean z = !tu2Var.Y;
            tu2Var.Y = z;
            ((bjb) view).setChecked(z);
        }
    }

    @Override
    public final void l() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public final y79 n(int i, uzb uzbVar, int[] iArr) {
        ae3 ae3Var = (ae3) this.b;
        jo5 p = mo5.p();
        for (int i2 = 0; i2 < uzbVar.a; i2++) {
            p.c(new xd3(i, uzbVar, i2, ae3Var, iArr[i2]));
        }
        return p.f();
    }

    @Override
    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                ((f23) obj2).invoke(obj);
                return;
            case 9:
                ((f33) obj2).invoke(obj);
                return;
            case 10:
                ((f33) obj2).invoke(obj);
                return;
            case 11:
                ((f33) obj2).invoke(obj);
                return;
            default:
                ((v33) obj2).invoke(obj);
                return;
        }
    }

    @Override
    public final void p(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        m8 m8Var = (m8) ((f9) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m8Var != null && m8Var.isShowing()) {
            m8Var.d(true);
        }
    }

    @Override
    public final void r(he heVar, int i) {
        ((of2) this.b).run();
    }

    @Override
    public final Object then(Task task) {
        return (Task) ((lz2) this.b).call();
    }

    @Override
    public final boolean u(View view) {
        byte b = this.a;
        return false;
    }

    public wm2(tk tkVar, Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public wm2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void m() {
    }

    private final void a(View view, float f, float f2) {
    }

    private final void e(View view, float f, float f2) {
    }
}
