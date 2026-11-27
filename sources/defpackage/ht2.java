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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ContactsWidgetConfigActivity;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
public final class ht2 implements ncc, nu3, qd3, tq2, Continuation, s69, OnSuccessListener, l8, yma, b86, ot2, id3, xj4, t69, fd, gc7, dj8, pn3, nr7 {
    public final byte a;
    public final Object b;

    public ht2(uj ujVar, ja6 ja6Var, jt6 jt6Var, IOException iOException, boolean z) {
        this.a = (byte) 18;
        this.b = jt6Var;
    }

    @Override
    public final boolean C(View view) {
        byte b = this.a;
        return false;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        dr3 dr3Var = (dr3) this.b;
        dr3Var.e = l2dVar;
        mq5 H0 = hl.H0(l2dVar, false);
        mq5 H02 = hl.H0(l2dVar, true);
        if (!dr3Var.f.equals(H0) || !dr3Var.h.equals(H02)) {
            hl.m = H0.b;
            hl.n = H0.d;
            dr3Var.f = H0;
            dr3Var.h = H02;
            dr3Var.requestLayout();
        }
        int childCount = dr3Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = dr3Var.getChildAt(i);
            if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                ihc.b(childAt, l2dVar);
            }
        }
        dr3Var.invalidate();
        return l2d.b;
    }

    @Override
    public final void a(long j, long j2) {
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
            DictationAsr.o();
        }
    }

    @Override
    public final void accept(Object obj) {
        ((mr3) obj).a((rj2) this.b);
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        ((o30) this.b).run();
        return true;
    }

    @Override
    public final Object b0(am2 am2Var) {
        String str;
        String str2;
        String str3;
        rx6 rx6Var;
        String str4;
        int i;
        int i2;
        int i3;
        Throwable th;
        li4 li4Var;
        String str5;
        String str6;
        int i4;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        hba b;
        String replaceAll;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i5 = CrashlyticsRegistrar.d;
        long currentTimeMillis = System.currentTimeMillis();
        ji4 ji4Var = (ji4) am2Var.a(ji4.class);
        ri4 ri4Var = (ri4) am2Var.a(ri4.class);
        au7 w = am2Var.w(az2.class);
        au7 w2 = am2Var.w(rj.class);
        au7 w3 = am2Var.w(ej4.class);
        ExecutorService executorService = (ExecutorService) am2Var.h(crashlyticsRegistrar.c);
        ji4Var.a();
        Context context = ji4Var.a;
        String packageName = context.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
        rx6 rx6Var2 = new rx6((ExecutorService) am2Var.h(crashlyticsRegistrar.a), (ExecutorService) am2Var.h(crashlyticsRegistrar.b));
        ?? obj = new Object();
        String str7 = ((d90) no8.a.b(context)).a;
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
                replaceAll = jn2.k(str7);
            } else {
                replaceAll = str7.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str2 = sb.toString();
        }
        File file = new File(filesDir, str2);
        gd4.c(file);
        obj.c = file;
        File file2 = new File(file, "open-sessions");
        gd4.c(file2);
        obj.d = file2;
        File file3 = new File(file, "reports");
        gd4.c(file3);
        obj.e = file3;
        File file4 = new File(file, "priority-reports");
        gd4.c(file4);
        obj.f = file4;
        File file5 = new File(file, "native-reports");
        gd4.c(file5);
        obj.g = file5;
        p63 p63Var = new p63(ji4Var);
        yl5 yl5Var = new yl5(context, packageName, ri4Var, p63Var);
        az2 az2Var = new az2(w);
        tj tjVar = new tj(w2);
        ty2 ty2Var = new ty2(p63Var, obj);
        nj4 nj4Var = nj4.a;
        iaa iaaVar = iaa.a;
        nj4 nj4Var2 = nj4.a;
        lj4 a = nj4.a(iaaVar);
        if (a.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + iaaVar + " already registered.");
        } else {
            a.b = ty2Var;
            Log.d("FirebaseSessions", "Subscriber " + iaaVar + " registered.");
            a.a.countDown();
        }
        String str8 = str;
        zc1 zc1Var = new zc1(ji4Var, yl5Var, az2Var, p63Var, new sj(tjVar), new sj(tjVar), obj, ty2Var, new pq8(w3, (byte) 5), rx6Var2);
        rx6 rx6Var3 = (rx6) zc1Var.n;
        ji4Var.a();
        String str9 = ji4Var.c.b;
        int e = jn2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (e == 0) {
            e = jn2.e(context, "com.crashlytics.android.build_id", "string");
        }
        if (e != 0) {
            str3 = context.getResources().getString(e);
        } else {
            str3 = null;
        }
        ArrayList arrayList = new ArrayList();
        int e2 = jn2.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int e3 = jn2.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int e4 = jn2.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
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
                    arrayList.add(new d11(stringArray[i7], stringArray2[i7], stringArray3[i7]));
                    i6 = i7 + 1;
                    str9 = str9;
                    rx6Var3 = rx6Var3;
                }
                rx6Var = rx6Var3;
                str4 = str9;
            } else {
                rx6Var = rx6Var3;
                str4 = str9;
                String format = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable(str8, 3)) {
                    Log.d(str8, format, null);
                }
            }
            i3 = 3;
            th = null;
        } else {
            rx6Var = rx6Var3;
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
        String i8 = c00.i("Mapping file ID is: ", str3);
        if (Log.isLoggable(str8, i3)) {
            Log.d(str8, i8, th);
        }
        int size = arrayList.size();
        int i9 = i;
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            d11 d11Var = (d11) obj2;
            String str10 = d11Var.a;
            String str11 = d11Var.b;
            String str12 = d11Var.c;
            int i10 = size;
            StringBuilder l = xnb.l("Build id for ", str10, " on ", str11, ": ");
            l.append(str12);
            String sb2 = l.toString();
            if (Log.isLoggable(str8, 3)) {
                Log.d(str8, sb2, null);
            }
            size = i10;
        }
        String str13 = str4;
        try {
            er a2 = er.a(context, yl5Var, str13, str3, arrayList, new qx6(context, (byte) 21));
            String str14 = "Installer package name is: " + a2.d;
            if (Log.isLoggable(str8, 2)) {
                Log.v(str8, str14, null);
            }
            new uif((byte) 20);
            String str15 = a2.f;
            String str16 = a2.g;
            String d = yl5Var.d();
            z3f z3fVar = new z3f((byte) 27);
            ve9 ve9Var = new ve9(z3fVar, (byte) 8);
            ri6 ri6Var = new ri6((gd4) obj);
            Locale locale = Locale.US;
            String y = qd4.y("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str13, "/settings");
            ?? obj3 = new Object();
            obj3.a = y;
            String str17 = Build.MANUFACTURER;
            String str18 = yl5.h;
            String p = qd4.p(str17.replaceAll(str18, ""), "/", Build.MODEL.replaceAll(str18, ""));
            String replaceAll2 = Build.VERSION.INCREMENTAL.replaceAll(str18, "");
            String replaceAll3 = Build.VERSION.RELEASE.replaceAll(str18, "");
            int e5 = jn2.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (e5 == 0) {
                e5 = jn2.e(context, "com.crashlytics.android.build_id", "string");
            }
            if (e5 != 0) {
                str5 = context.getResources().getString(e5);
            } else {
                str5 = null;
            }
            String[] strArr = {str5, str13, str16, str15};
            ArrayList arrayList2 = new ArrayList();
            int i11 = 0;
            while (i11 < 4) {
                String str19 = strArr[i11];
                String[] strArr2 = strArr;
                if (str19 != null) {
                    arrayList2.add(str19.replace("-", "").toLowerCase(Locale.US));
                }
                i11++;
                strArr = strArr2;
            }
            Collections.sort(arrayList2);
            StringBuilder sb3 = new StringBuilder();
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj4 = arrayList2.get(i12);
                i12++;
                sb3.append((String) obj4);
                str15 = str15;
            }
            String str20 = str15;
            String sb4 = sb3.toString();
            if (sb4.length() > 0) {
                str6 = jn2.k(sb4);
            } else {
                str6 = null;
            }
            if (d != null) {
                i4 = 4;
            } else {
                i4 = i2;
            }
            oy8 oy8Var = new oy8(context, new bca(str13, p, replaceAll2, replaceAll3, yl5Var, str6, str16, str20, bs2.h(i4)), z3fVar, ve9Var, ri6Var, obj3, p63Var);
            AtomicReference atomicReference = (AtomicReference) oy8Var.h;
            AtomicReference atomicReference2 = oy8Var.a;
            if (((Context) oy8Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((bca) oy8Var.c).f) && (b = oy8Var.b(i2)) != null) {
                atomicReference2.set(b);
                ((TaskCompletionSource) atomicReference.get()).trySetResult(b);
                onSuccessTask = Tasks.forResult(null);
            } else {
                hba b2 = oy8Var.b(3);
                if (b2 != null) {
                    atomicReference2.set(b2);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(b2);
                }
                p63 p63Var2 = (p63) oy8Var.g;
                Task task2 = p63Var2.h.getTask();
                synchronized (p63Var2.c) {
                    task = p63Var2.d.getTask();
                }
                onSuccessTask = ur5.c(task2, task).onSuccessTask((i03) rx6Var2.b, new um4(oy8Var, rx6Var2, false, (byte) 28));
            }
            onSuccessTask.addOnFailureListener(executorService, new su3((byte) 28));
            gd4 gd4Var = (gd4) zc1Var.h;
            Context context2 = (Context) zc1Var.a;
            boolean c = jn2.c(context2, "com.google.firebase.crashlytics.RequireBuildId", jn2.c(context2, "com.crashlytics.RequireBuildId", true));
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
                grb.i("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                return null;
            }
            String str22 = new r51().a;
            try {
                zc1Var.e = new lh2("crash_marker", gd4Var, (byte) 18);
                zc1Var.d = new lh2("initialization_marker", gd4Var, (byte) 18);
                rx6 rx6Var4 = rx6Var;
                gd4 gd4Var2 = new gd4(str22, gd4Var, rx6Var4);
                lh2 lh2Var = new lh2(gd4Var);
                ym4 ym4Var = new ym4(new mqa[]{new uif((byte) 24)});
                ((au7) ((pq8) zc1Var.m).b).a(new iy8((byte) 6));
                zc1Var.f = new yy2((Context) zc1Var.a, (yl5) zc1Var.g, (p63) zc1Var.b, (gd4) zc1Var.h, (lh2) zc1Var.e, a2, gd4Var2, lh2Var, faa.d((Context) zc1Var.a, (yl5) zc1Var.g, (gd4) zc1Var.h, a2, lh2Var, gd4Var2, ym4Var, oy8Var, (ym4) zc1Var.c, (ty2) zc1Var.k, (rx6) zc1Var.n), (az2) zc1Var.l, (sj) zc1Var.j, (ty2) zc1Var.k, (rx6) zc1Var.n);
                lh2 lh2Var2 = (lh2) zc1Var.d;
                boolean exists = new File((File) ((gd4) lh2Var2.c).c, (String) lh2Var2.b).exists();
                try {
                    Boolean.TRUE.equals((Boolean) ((i03) rx6Var4.b).a.submit(new mk(zc1Var, (byte) 1)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                }
                yy2 yy2Var = (yy2) zc1Var.f;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                ((i03) yy2Var.e.b).a(new bv2(yy2Var, str22, (byte) 5));
                h03 h03Var = new h03(new zm9(yy2Var, (byte) 22), oy8Var, defaultUncaughtExceptionHandler, yy2Var.j);
                yy2Var.n = h03Var;
                Thread.setDefaultUncaughtExceptionHandler(h03Var);
                if (Build.VERSION.SDK_INT >= 37) {
                    ((yy2) zc1Var.f).c(str22);
                }
                if (exists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                    if (Log.isLoggable(str8, 3)) {
                        Log.d(str8, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                    }
                    zc1Var.b(oy8Var);
                } else {
                    if (Log.isLoggable(str8, 3)) {
                        Log.d(str8, "Successfully configured exception handler.", null);
                    }
                    ((i03) rx6Var4.b).a(new zy2(zc1Var, oy8Var, (byte) 0));
                }
            } catch (Exception e6) {
                Log.e(str8, "Crashlytics was not started due to an exception during initialization", e6);
                zc1Var.f = null;
            }
            li4Var = new li4(zc1Var);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e(str8, "Error retrieving app package info.", e7);
            li4Var = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            String n = ik8.n(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
            if (Log.isLoggable(str8, 3)) {
                Log.d(str8, n, null);
            }
        }
        return li4Var;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        b8c G;
        Object obj;
        long j;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                j13 j13Var = (j13) obj2;
                HashSet hashSet = j13Var.W1;
                if (!j13Var.X1 && (G = j13Var.Y1.G(i - 1)) != null && (obj = G.H) != null) {
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
                    if (view instanceof e3a) {
                        ((e3a) view).c(hashSet.contains(Long.valueOf(j)), true);
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
    public final boolean e(int i, final View view) {
        TLRPC.Chat chat;
        String str;
        zm2 zm2Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        fu5 fu5Var;
        boolean z9;
        byte b;
        Drawable drawable;
        final ii3 ii3Var = (ii3) this.b;
        if (ii3Var.O == 0.0f && ii3Var.o0 == 0.0f) {
            final long j = ((og3) view).F;
            uj3 uj3Var = ii3Var.P0;
            ls6.d0(uj3.j2(uj3Var)).O0(true);
            fu5 I = fu5.I(uj3Var, view);
            I.z.set(0, hl.L(8.0f), 0, 0);
            I.X(aob.c0(hl.L(12.0f), hl.L(12.0f), uj3Var.getThemedColor(aob.d6)));
            I.b0(0.0f, hl.L(8.0f));
            uj3Var.M0 = I;
            if (lbc.C(j)) {
                yw0.APP_ERROR.a();
            } else {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                if (j == yac.h(uj3.k2(uj3Var)).e()) {
                    if (!uj3Var.R3) {
                        ii3 ii3Var2 = uj3Var.F0;
                        if (ii3Var2 != null) {
                            ii3Var2.n();
                        }
                    } else {
                        fu5 fu5Var2 = uj3Var.M0;
                        String M0 = ob6.M0(2131754377, null);
                        int i3 = aob.F8;
                        int i4 = aob.E8;
                        fu5Var2.a(2131232388, null, M0, null, i3, i4, new gg3(ii3Var, (byte) 1));
                        uj3Var.M0.a(2131232389, null, ob6.M0(2131754116, null), null, i3, i4, new gg3(ii3Var, (byte) 2));
                        uj3Var.M0.a(2131232396, null, ob6.M0(2131745613, null), null, i3, i4, new gg3(ii3Var, (byte) 3));
                        b = 3;
                    }
                } else {
                    final TLRPC.User X1 = uj3Var.getMessagesController().X1(Long.valueOf(j));
                    TLRPC.Chat M02 = uj3Var.getMessagesController().M0(Long.valueOf(-j));
                    String p = ip7.p(j, 0L, false);
                    boolean c0 = NotificationsCustomSettingsActivity.c0(uj3.l2(uj3Var), j);
                    boolean M3 = uc7.s1(uj3.m2(uj3Var)).M3();
                    boolean p2 = yac.h(uj3.n2(uj3Var)).p();
                    boolean K = uc7.s1(uj3.o2(uj3Var)).O1().K(j);
                    boolean G = uc7.s1(uj3.p2(uj3Var)).O1().G(j);
                    if (!M3 && j > 0 && !p2 && (drawable = ii3Var.getContext().getDrawable(2131232174)) != null) {
                        Drawable drawable2 = ii3Var.getContext().getDrawable(2131232386);
                        if (drawable2 != null) {
                            chat = M02;
                            yob.x(ii3Var, drawable2, aob.F8, uj3Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                        } else {
                            chat = M02;
                        }
                        str = p;
                        drawable.setColorFilter(new PorterDuffColorFilter(vm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        zm2Var = new zm2(drawable2, drawable);
                    } else {
                        chat = M02;
                        str = p;
                        zm2Var = null;
                    }
                    int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i5 < 0 && uj3Var.v3().i(j)) {
                        uj3Var.M0.a(2131232388, null, ob6.M0(2131754377, null), null, aob.F8, aob.E8, new Runnable() {
                            @Override
                            public final void run() {
                                int i6;
                                byte b2 = r4;
                                long j2 = j;
                                ii3 ii3Var3 = ii3Var;
                                switch (b2) {
                                    case 0:
                                        ii3Var3.P0.presentFragment(zu1.ha(j2));
                                        return;
                                    case 1:
                                        uj3 uj3Var2 = ii3Var3.P0;
                                        hl.d3(new ih3(uj3Var2, j, !uj3Var2.F3(), (byte) 0), 200L);
                                        return;
                                    case 2:
                                        uj3 uj3Var3 = ii3Var3.P0;
                                        hl.d3(new ih3(uj3Var3, j, !uj3Var3.F3(), (byte) 0), 200L);
                                        return;
                                    case 3:
                                        uj3 uj3Var4 = ii3Var3.P0;
                                        i6 = ((e) uj3Var4).currentAccount;
                                        ls6.d0(i6).Q1(j2);
                                        uj3Var4.getMessagesController().O1().l0(j2, true, false);
                                        return;
                                    case 4:
                                        ii3Var3.P0.F0.j(j2);
                                        return;
                                    case 5:
                                        ii3Var3.P0.presentFragment(zu1.ha(j2));
                                        return;
                                    default:
                                        ii3Var3.P0.presentFragment(ProfileActivity.Q2(j2));
                                        return;
                                }
                            }
                        });
                    }
                    if (X1 != null && !X1.contact && ls6.d0(uj3.q2(uj3Var)).I(j)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fu5 fu5Var3 = uj3Var.M0;
                    if (i5 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    fu5Var3.k(2131232118, ob6.M0(2131745329, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                case 1:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var2, j, !uj3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var3, j, !uj3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    uj3 uj3Var4 = ii3Var3.P0;
                                    i6 = ((e) uj3Var4).currentAccount;
                                    ls6.d0(i6).Q1(j2);
                                    uj3Var4.getMessagesController().O1().l0(j2, true, false);
                                    return;
                                case 4:
                                    ii3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                default:
                                    ii3Var3.P0.presentFragment(ProfileActivity.Q2(j2));
                                    return;
                            }
                        }
                    }, z2);
                    if (i5 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    fu5Var3.k(2131232271, ob6.M0(2131747513, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                case 1:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var2, j, !uj3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var3, j, !uj3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    uj3 uj3Var4 = ii3Var3.P0;
                                    i6 = ((e) uj3Var4).currentAccount;
                                    ls6.d0(i6).Q1(j2);
                                    uj3Var4.getMessagesController().O1().l0(j2, true, false);
                                    return;
                                case 4:
                                    ii3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                default:
                                    ii3Var3.P0.presentFragment(ProfileActivity.Q2(j2));
                                    return;
                            }
                        }
                    }, z3);
                    if (i5 < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (xc2.V(chat)) {
                        i2 = 2131747538;
                    } else {
                        i2 = 2131747526;
                    }
                    fu5Var3.k(2131232093, ob6.M0(i2, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                case 1:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var2, j, !uj3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var3, j, !uj3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    uj3 uj3Var4 = ii3Var3.P0;
                                    i6 = ((e) uj3Var4).currentAccount;
                                    ls6.d0(i6).Q1(j2);
                                    uj3Var4.getMessagesController().O1().l0(j2, true, false);
                                    return;
                                case 4:
                                    ii3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                default:
                                    ii3Var3.P0.presentFragment(ProfileActivity.Q2(j2));
                                    return;
                            }
                        }
                    }, z4);
                    if (c0 && i5 > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    final String str2 = str;
                    fu5Var3.k(2131232261, ob6.M0(2131747590, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            int i7;
                            byte b2 = r6;
                            String str3 = "";
                            TLRPC.User user = X1;
                            String str4 = str2;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    i6 = ((e) uj3Var2).currentAccount;
                                    SharedPreferences.Editor edit = uc7.s1(i6).W3.edit();
                                    edit.putBoolean("stories_" + str4, false).apply();
                                    uj3Var2.getNotificationsController().c0(j, 0L, true);
                                    if (user != null) {
                                        str3 = user.first_name.trim();
                                    }
                                    int indexOf = str3.indexOf(" ");
                                    if (indexOf > 0) {
                                        str3 = str3.substring(0, indexOf);
                                    }
                                    d31.b0(uj3Var2).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryMutedHint", null, 2131747589, str3)), null, null).j();
                                    return;
                                default:
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    i7 = ((e) uj3Var3).currentAccount;
                                    SharedPreferences.Editor edit2 = uc7.s1(i7).W3.edit();
                                    edit2.putBoolean("stories_" + str4, true).apply();
                                    uj3Var3.getNotificationsController().c0(j, 0L, true);
                                    if (user != null) {
                                        str3 = user.first_name.trim();
                                    }
                                    int indexOf2 = str3.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        str3 = str3.substring(0, indexOf2);
                                    }
                                    d31.b0(uj3Var3).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryUnmutedHint", null, 2131747586, str3)), null, null).j();
                                    return;
                            }
                        }
                    }, z5);
                    fu5Var3.F();
                    if (!c0 && i5 > 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    fu5Var3.k(2131232417, ob6.M0(2131747587, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            int i7;
                            byte b2 = r6;
                            String str3 = "";
                            TLRPC.User user = X1;
                            String str4 = str2;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    i6 = ((e) uj3Var2).currentAccount;
                                    SharedPreferences.Editor edit = uc7.s1(i6).W3.edit();
                                    edit.putBoolean("stories_" + str4, false).apply();
                                    uj3Var2.getNotificationsController().c0(j, 0L, true);
                                    if (user != null) {
                                        str3 = user.first_name.trim();
                                    }
                                    int indexOf = str3.indexOf(" ");
                                    if (indexOf > 0) {
                                        str3 = str3.substring(0, indexOf);
                                    }
                                    d31.b0(uj3Var2).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryMutedHint", null, 2131747589, str3)), null, null).j();
                                    return;
                                default:
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    i7 = ((e) uj3Var3).currentAccount;
                                    SharedPreferences.Editor edit2 = uc7.s1(i7).W3.edit();
                                    edit2.putBoolean("stories_" + str4, true).apply();
                                    uj3Var3.getNotificationsController().c0(j, 0L, true);
                                    if (user != null) {
                                        str3 = user.first_name.trim();
                                    }
                                    int indexOf2 = str3.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        str3 = str3.substring(0, indexOf2);
                                    }
                                    d31.b0(uj3Var3).V(Arrays.asList(user), hl.S2(ob6.a0("NotificationsStoryUnmutedHint", null, 2131747586, str3)), null, null).j();
                                    return;
                            }
                        }
                    }, z6);
                    fu5Var3.F();
                    if (!M3 && i5 > 0 && p2 && K && !G) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    fu5Var3.k(2131232398, ob6.M0(2131743214, null), new Runnable() {
                        @Override
                        public final void run() {
                            vnb vnbVar;
                            int i6;
                            vnb vnbVar2;
                            byte b2 = r3;
                            View view2 = view;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = uc7.s1(yac.t0).O1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i6 = ((e) uj3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i6).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof og3) {
                                                uj3Var2.F0.i((og3) view2, false);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    Context context = ii3Var3.getContext();
                                    vnbVar = ((e) uj3Var2).resourceProvider;
                                    g2b g2bVar = new g2b(context, 0.0f, 1, vnbVar);
                                    g2bVar.o1 = new hi3(ii3Var3, view2, (byte) 1);
                                    uj3Var2.showDialog(g2bVar);
                                    return;
                                default:
                                    Context context2 = ii3Var3.getContext();
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    vnbVar2 = ((e) uj3Var3).resourceProvider;
                                    g2b g2bVar2 = new g2b(context2, 0.0f, 1, vnbVar2);
                                    g2bVar2.o1 = new hi3(ii3Var3, view2, (byte) 0);
                                    uj3Var3.showDialog(g2bVar2);
                                    return;
                            }
                        }
                    }, z7);
                    fu5Var3.F();
                    if (!M3 && i5 > 0 && !p2 && K && !G) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    String M03 = ob6.M0(2131743214, null);
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            vnb vnbVar;
                            int i6;
                            vnb vnbVar2;
                            byte b2 = r3;
                            View view2 = view;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = uc7.s1(yac.t0).O1().B;
                                    if (tL_storiesStealthMode != null) {
                                        i6 = ((e) uj3Var2).currentAccount;
                                        if (ConnectionsManager.getInstance(i6).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof og3) {
                                                uj3Var2.F0.i((og3) view2, false);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    Context context = ii3Var3.getContext();
                                    vnbVar = ((e) uj3Var2).resourceProvider;
                                    g2b g2bVar = new g2b(context, 0.0f, 1, vnbVar);
                                    g2bVar.o1 = new hi3(ii3Var3, view2, (byte) 1);
                                    uj3Var2.showDialog(g2bVar);
                                    return;
                                default:
                                    Context context2 = ii3Var3.getContext();
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    vnbVar2 = ((e) uj3Var3).resourceProvider;
                                    g2b g2bVar2 = new g2b(context2, 0.0f, 1, vnbVar2);
                                    g2bVar2.o1 = new hi3(ii3Var3, view2, (byte) 0);
                                    uj3Var3.showDialog(g2bVar2);
                                    return;
                            }
                        }
                    };
                    if (!z8) {
                        fu5Var = fu5Var3;
                    } else {
                        fu5Var3.a(2131232398, zm2Var, M03, null, aob.F8, aob.E8, runnable);
                        fu5Var = fu5Var3;
                    }
                    fu5Var.F();
                    if (!z && !uj3Var.F3()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z10 = true;
                    fu5Var.k(2131232056, ob6.M0(2131754146, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                case 1:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var2, j, !uj3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var3, j, !uj3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    uj3 uj3Var4 = ii3Var3.P0;
                                    i6 = ((e) uj3Var4).currentAccount;
                                    ls6.d0(i6).Q1(j2);
                                    uj3Var4.getMessagesController().O1().l0(j2, true, false);
                                    return;
                                case 4:
                                    ii3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                default:
                                    ii3Var3.P0.presentFragment(ProfileActivity.Q2(j2));
                                    return;
                            }
                        }
                    }, z9);
                    fu5Var.F();
                    fu5Var.k(2131232414, ob6.M0(2131743569, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                case 1:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var2, j, !uj3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var3, j, !uj3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    uj3 uj3Var4 = ii3Var3.P0;
                                    i6 = ((e) uj3Var4).currentAccount;
                                    ls6.d0(i6).Q1(j2);
                                    uj3Var4.getMessagesController().O1().l0(j2, true, false);
                                    return;
                                case 4:
                                    ii3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                default:
                                    ii3Var3.P0.presentFragment(ProfileActivity.Q2(j2));
                                    return;
                            }
                        }
                    }, (z || !uj3Var.F3()) ? false : false);
                    fu5Var.F();
                    b = 3;
                    fu5Var.k(2131232113, ob6.M0(2131744405, null), new Runnable() {
                        @Override
                        public final void run() {
                            int i6;
                            byte b2 = r4;
                            long j2 = j;
                            ii3 ii3Var3 = ii3Var;
                            switch (b2) {
                                case 0:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                case 1:
                                    uj3 uj3Var2 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var2, j, !uj3Var2.F3(), (byte) 0), 200L);
                                    return;
                                case 2:
                                    uj3 uj3Var3 = ii3Var3.P0;
                                    hl.d3(new ih3(uj3Var3, j, !uj3Var3.F3(), (byte) 0), 200L);
                                    return;
                                case 3:
                                    uj3 uj3Var4 = ii3Var3.P0;
                                    i6 = ((e) uj3Var4).currentAccount;
                                    ls6.d0(i6).Q1(j2);
                                    uj3Var4.getMessagesController().O1().l0(j2, true, false);
                                    return;
                                case 4:
                                    ii3Var3.P0.F0.j(j2);
                                    return;
                                case 5:
                                    ii3Var3.P0.presentFragment(zu1.ha(j2));
                                    return;
                                default:
                                    ii3Var3.P0.presentFragment(ProfileActivity.Q2(j2));
                                    return;
                            }
                        }
                    }, z);
                }
                fu5 fu5Var4 = uj3Var.M0;
                fu5Var4.i = b;
                fu5Var4.b0(hl.L(-8.0f), hl.L(-10.0f));
                fu5Var4.a0();
                return false;
            }
        }
        return false;
    }

    @Override
    public final void f(vw8 vw8Var) {
        az2 az2Var = (az2) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        az2Var.b.set((az2) vw8Var.get());
    }

    @Override
    public final void g(float f) {
        zec zecVar = ((uec) this.b).b;
        if (zecVar.f == f) {
            return;
        }
        zecVar.f = f;
        zecVar.c(false);
    }

    @Override
    public final void h() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 15:
                ((vj) obj).u((e64) obj2);
                return;
            case 16:
                ((vj) obj).onSeekStarted((uj) obj2);
                return;
            case 17:
                ((vj) obj).j((p93) obj2);
                return;
            default:
                ((vj) obj).i((jt6) obj2);
                return;
        }
    }

    @Override
    public final void j(int i) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((t20) this.b).e;
        kq3 kq3Var = (kq3) dataAutoDownloadActivity.c.get(i);
        if (kq3Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 0;
        } else if (kq3Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 1;
        } else if (kq3Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i2 = dataAutoDownloadActivity.f;
        if (i2 == 0) {
            lq3.q(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.e;
        } else if (i2 == 1) {
            lq3.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.e;
        } else {
            lq3.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).S = dataAutoDownloadActivity.e;
        }
        SharedPreferences.Editor edit = uc7.s1(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).X3.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        lq3.q(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).g();
        for (int i3 = 0; i3 < 4; i3++) {
            f89 L = dataAutoDownloadActivity.b.L(DataAutoDownloadActivity.a0(dataAutoDownloadActivity) + i3);
            if (L != null) {
                dataAutoDownloadActivity.a.t(L, DataAutoDownloadActivity.a0(dataAutoDownloadActivity) + i3);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        cu2 cu2Var = (cu2) this.b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        int i = ((b8c) obj).d;
        if (i == 1) {
            TLRPC.User X1 = cu2Var.getMessagesController().X1(Long.valueOf(cu2Var.I));
            if (X1 != null && cu2Var.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cu2Var.r, cu2Var.getParentActivity());
                String M0 = ob6.M0(2131751517, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131754096, null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new q72(cu2Var, X1, (byte) 10));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
            }
        } else if (i == 2) {
            boolean z = !cu2Var.Y;
            cu2Var.Y = z;
            ((wkb) view).setChecked(z);
        }
    }

    @Override
    public final j99 l(int i, t1c t1cVar, int[] iArr) {
        gd3 gd3Var = (gd3) this.b;
        mo5 p = po5.p();
        for (int i2 = 0; i2 < t1cVar.a; i2++) {
            p.c(new dd3(i, t1cVar, i2, gd3Var, iArr[i2]));
        }
        return p.f();
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        n8 n8Var = (n8) ((g9) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n8Var != null && n8Var.isShowing()) {
            n8Var.d(true);
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                ((m13) obj2).invoke(obj);
                return;
            case 8:
                ((m23) obj2).invoke(obj);
                return;
            case 9:
                ((m23) obj2).invoke(obj);
                return;
            case 10:
                ((m23) obj2).invoke(obj);
                return;
            default:
                ((c33) obj2).invoke(obj);
                return;
        }
    }

    @Override
    public final Object then(Task task) {
        return (Task) ((wy2) this.b).call();
    }

    @Override
    public final void u(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 23:
                ((ue2) obj).run();
                return;
            default:
                ((gu3) obj).a.d.p();
                return;
        }
    }

    public ht2(uj ujVar, Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ht2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void m() {
    }

    private final void c(View view, float f, float f2) {
    }

    private final void i(View view, float f, float f2) {
    }
}
