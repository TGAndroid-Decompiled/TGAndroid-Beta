package a5;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.Process;
import android.support.v4.media.session.d0;
import android.support.v4.media.session.w;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.i0;
import androidx.biometric.q;
import androidx.biometric.r;
import androidx.biometric.s;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.play_billing.r1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import d5.g0;
import e0.t;
import f2.f0;
import f2.o1;
import f2.q0;
import g.y;
import g7.o;
import j$.util.DesugarCollections;
import j3.j0;
import j3.k0;
import j4.k1;
import j4.r0;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.Adler32;

public class n implements r4.g, y2.b, s9.a {

    public static n f98e;

    public final int f99a;

    public Object f100b;

    public Object f101c;
    public Object d;

    public n(int i10, boolean z10) {
        this.f99a = i10;
    }

    public void a(View view, int i10, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((a9.i) this.f100b).f181b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : r(i10);
        ((f2.c) this.f101c).J(childCount, z10);
        if (z10) {
            v(view);
        }
        recyclerView.addView(view, childCount);
        o1 o1VarU = RecyclerView.U(view);
        recyclerView.f0(view);
        q0 q0Var = recyclerView.f1862w;
        if (q0Var != null && o1VarU != null) {
            q0Var.y(o1VarU);
        }
        ArrayList arrayList = recyclerView.L;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f0) recyclerView.L.get(size)).getClass();
            }
        }
    }

    public void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((a9.i) this.f100b).f181b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : r(i10);
        ((f2.c) this.f101c).J(childCount, z10);
        if (z10) {
            v(view);
        }
        o1 o1VarU = RecyclerView.U(view);
        if (o1VarU != null) {
            if (!o1VarU.l() && !o1VarU.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + o1VarU + recyclerView.C());
            }
            o1VarU.f5798l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override
    public int c(long j10) {
        long[] jArr = (long[]) this.d;
        int iB = g0.b(jArr, j10, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override
    public s9.a d(Class cls, r9.d dVar) {
        switch (this.f99a) {
            case 13:
                ((HashMap) this.f100b).put(cls, dVar);
                ((HashMap) this.f101c).remove(cls);
                break;
            case 19:
                ((HashMap) this.f100b).put(cls, dVar);
                ((HashMap) this.f101c).remove(cls);
                break;
            default:
                ((HashMap) this.f100b).put(cls, dVar);
                ((HashMap) this.f101c).remove(cls);
                break;
        }
        return this;
    }

    public j0 e() {
        if (((n) this.f101c) == null) {
            this.f101c = new n(new j3.j[0]);
        }
        return new j0(this);
    }

    @Override
    public long f(int i10) {
        long[] jArr = (long[]) this.d;
        d5.a.f(i10 >= 0);
        d5.a.f(i10 < jArr.length);
        return jArr[i10];
    }

    public int g(int i10) {
        BiometricPrompt.CryptoObject cryptoObjectB;
        s sVar = (s) this.f100b;
        int i11 = Build.VERSION.SDK_INT;
        int iA = 1;
        if (i11 >= 30) {
            BiometricManager biometricManager = (BiometricManager) this.f101c;
            if (biometricManager != null) {
                return r.a(biometricManager, i10);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!r1.b(i10)) {
            return -2;
        }
        if (i10 != 0) {
            Context context = sVar.f1063a;
            if (o.a(context) != null) {
                int i12 = 0;
                if (r1.a(i10)) {
                    return o.b(context) ? 0 : 11;
                }
                if (i11 != 29) {
                    if (i11 != 28) {
                        return i();
                    }
                    if (i11 < 23 || context == null || context.getPackageManager() == null || !i0.a(context.getPackageManager())) {
                        return 12;
                    }
                    if (o.b(sVar.f1063a)) {
                        return i() == 0 ? 0 : -1;
                    }
                    return i();
                }
                if ((i10 & 255) == 255) {
                    BiometricManager biometricManager2 = (BiometricManager) this.f101c;
                    if (biometricManager2 != null) {
                        return q.a(biometricManager2);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method methodC = q.c();
                if (methodC != null && (cryptoObjectB = g7.m.b(g7.m.a())) != null) {
                    try {
                        Object objInvoke = methodC.invoke((BiometricManager) this.f101c, cryptoObjectB);
                        if (objInvoke instanceof Integer) {
                            return ((Integer) objInvoke).intValue();
                        }
                        Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                    } catch (IllegalAccessException e9) {
                        e = e9;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    }
                }
                BiometricManager biometricManager3 = (BiometricManager) this.f101c;
                if (biometricManager3 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                } else {
                    iA = q.a(biometricManager3);
                }
                String str = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30 && str != null) {
                    for (String str2 : context.getResources().getStringArray(2130903041)) {
                        if (str.equals(str2)) {
                            return iA;
                        }
                    }
                }
                if (iA != 0) {
                    return iA;
                }
                if (!o.b(sVar.f1063a)) {
                    i12 = i();
                } else if (i() != 0) {
                    i12 = -1;
                }
                return i12;
            }
        }
        return 12;
    }

    @Override
    public Object mo28get() {
        return new n((Context) ((oc.a) this.f100b).mo28get(), (d3.d) ((oc.a) this.f101c).mo28get(), (c3.a) ((za.b) this.d).mo28get(), 7);
    }

    @Override
    public List h(long j10) {
        List list = (List) this.f100b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f101c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = (e) list.get(i10);
                r4.c cVar = eVar.f71a;
                if (cVar.f46739e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        Collections.sort(arrayList2, new f(1));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            r4.c cVar2 = ((e) arrayList2.get(i12)).f71a;
            arrayList.add(new r4.c(cVar2.f46736a, cVar2.f46737b, cVar2.f46738c, cVar2.d, (-1) - i12, 1, cVar2.h, cVar2.f46741n, cVar2.f46742r, cVar2.f46746y, cVar2.A, cVar2.f46743s, cVar2.v, cVar2.f46744w, cVar2.f46745x, cVar2.B, cVar2.C));
        }
        return arrayList;
    }

    public int i() {
        FingerprintManager fingerprintManagerF;
        FingerprintManager fingerprintManagerF2;
        ae.b bVar = (ae.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = (Context) bVar.f245b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (fingerprintManagerF = e0.b.f(context)) == null || !e0.b.n(fingerprintManagerF)) {
            return 12;
        }
        return (i10 < 23 || (fingerprintManagerF2 = e0.b.f(context)) == null || !e0.b.k(fingerprintManagerF2)) ? 11 : 0;
    }

    public void j() {
        d0 d0Var = (d0) this.f100b;
        if (d0Var != null) {
            int i10 = ((c2.e) this.d).f2262n.d;
            w wVar = d0Var.f818a;
            wVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            wVar.f843a.setPlaybackToLocal(builder.build());
            this.f101c = null;
        }
    }

    public void k(int i10) {
        o1 o1VarU;
        int iR = r(i10);
        ((f2.c) this.f101c).K(iR);
        RecyclerView recyclerView = (RecyclerView) ((a9.i) this.f100b).f181b;
        View childAt = recyclerView.getChildAt(iR);
        if (childAt != null && (o1VarU = RecyclerView.U(childAt)) != null) {
            if (o1VarU.l() && !o1VarU.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + o1VarU + recyclerView.C());
            }
            o1VarU.a(256);
        }
        recyclerView.detachViewFromParent(iR);
    }

    public p0 l(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 m(Class cls, String key) {
        p0 viewModel;
        s0 s0Var = (s0) this.f101c;
        kotlin.jvm.internal.j.e(key, "key");
        t0 t0Var = (t0) this.f100b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f1635a;
        p0 p0Var = (p0) linkedHashMap.get(key);
        if (!cls.isInstance(p0Var)) {
            v1.b bVar = new v1.b((b8.a) this.d);
            ((LinkedHashMap) bVar.f2040a).put(androidx.lifecycle.q0.f1632b, key);
            try {
                viewModel = s0Var.r(cls, bVar);
            } catch (AbstractMethodError unused) {
                viewModel = s0Var.e(cls);
            }
            kotlin.jvm.internal.j.e(viewModel, "viewModel");
            p0 p0Var2 = (p0) linkedHashMap.put(key, viewModel);
            if (p0Var2 != null) {
                p0Var2.b();
            }
            return viewModel;
        }
        n0 n0Var = s0Var instanceof n0 ? (n0) s0Var : null;
        if (n0Var != null) {
            kotlin.jvm.internal.j.b(p0Var);
            androidx.lifecycle.o oVar = n0Var.d;
            if (oVar != null) {
                g2.e eVar = n0Var.f1624e;
                kotlin.jvm.internal.j.b(eVar);
                androidx.lifecycle.j0.a(p0Var, eVar, oVar);
            }
        }
        kotlin.jvm.internal.j.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return p0Var;
    }

    public View n(int i10) {
        return ((RecyclerView) ((a9.i) this.f100b).f181b).getChildAt(r(i10));
    }

    public int o() {
        return ((RecyclerView) ((a9.i) this.f100b).f181b).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override
    public int p() {
        return ((long[]) this.d).length;
    }

    public ByteBuffer q() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            return (ByteBuffer) this.f101c;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = ((Bitmap) this.d).getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        ((Bitmap) this.d).getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((Color.blue(iArr[i11]) * 0.114f) + (Color.green(iArr[i11]) * 0.587f) + (Color.red(iArr[i11]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    public int r(int i10) {
        f2.c cVar = (f2.c) this.f101c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((a9.i) this.f100b).f181b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int iZ = i10 - (i11 - cVar.z(i11));
            if (iZ == 0) {
                while (cVar.I(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iZ;
        }
        return -1;
    }

    public View s(int i10) {
        return ((RecyclerView) ((a9.i) this.f100b).f181b).getChildAt(i10);
    }

    public int t() {
        return ((RecyclerView) ((a9.i) this.f100b).f181b).getChildCount();
    }

    public String toString() {
        String str = "";
        switch (this.f99a) {
            case 8:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f100b);
                sb2.append('{');
                com.google.android.gms.internal.play_billing.k kVar = ((com.google.android.gms.internal.play_billing.k) this.f101c).f4049b;
                while (kVar != null) {
                    Object obj = kVar.f4048a;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    kVar = kVar.f4049b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                return ((f2.c) this.f101c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 15:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f100b);
                sb3.append('{');
                n nVar = (n) ((n) this.f101c).d;
                while (nVar != null) {
                    Object obj2 = nVar.f101c;
                    sb3.append(str);
                    String str2 = (String) nVar.f100b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    nVar = (n) nVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 29:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.f100b);
                sb4.append('{');
                n nVar2 = (n) ((n) this.f101c).d;
                while (nVar2 != null) {
                    Object obj3 = nVar2.f101c;
                    sb4.append(str);
                    String str3 = (String) nVar2.f100b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb4.append(obj3);
                    } else {
                        String strDeepToString3 = Arrays.deepToString(new Object[]{obj3});
                        sb4.append((CharSequence) strDeepToString3, 1, strDeepToString3.length() - 1);
                    }
                    nVar2 = (n) nVar2.d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public boolean u() {
        com.google.firebase.messaging.n nVar;
        if (((ae.b) this.d).K("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f101c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strO = ((ae.b) this.d).O("gcm.n.image");
        if (TextUtils.isEmpty(strO)) {
            nVar = null;
        } else {
            try {
                nVar = new com.google.firebase.messaging.n(new URL(strO));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strO);
                nVar = null;
            }
        }
        if (nVar != null) {
            ExecutorService executorService = (ExecutorService) this.f100b;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            nVar.f4608b = executorService.submit(new a1.e(28, nVar, taskCompletionSource));
            nVar.f4609c = taskCompletionSource.getTask();
        }
        com.google.firebase.messaging.i iVarA = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.f101c, (ae.b) this.d);
        t tVar = (t) iVarA.f4593a;
        if (nVar != null) {
            try {
                Task task = nVar.f4609c;
                y5.l.h(task);
                Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                tVar.j(bitmap);
                e0.n nVar2 = new e0.n();
                nVar2.f5093e = bitmap == null ? null : IconCompat.c(bitmap);
                nVar2.f5094f = null;
                nVar2.f5095g = true;
                tVar.n(nVar2);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                nVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e9) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e9.getCause());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                nVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f101c).getSystemService("notification")).notify((String) iVarA.f4594b, 0, ((t) iVarA.f4593a).b());
        return true;
    }

    public void v(View view) {
        ((ArrayList) this.d).add(view);
        a9.i iVar = (a9.i) this.f100b;
        o1 o1VarU = RecyclerView.U(view);
        if (o1VarU != null) {
            View view2 = o1VarU.f5789a;
            RecyclerView recyclerView = (RecyclerView) iVar.f181b;
            int i10 = o1VarU.f5805s;
            if (i10 != -1) {
                o1VarU.f5804r = i10;
            } else {
                WeakHashMap weakHashMap = r0.j0.f46605a;
                o1VarU.f5804r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                o1VarU.f5805s = 4;
                recyclerView.F0.add(o1VarU);
            } else {
                WeakHashMap weakHashMap2 = r0.j0.f46605a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void w(com.google.android.exoplayer2.upstream.m mVar, Uri uri, Map map, long j10, long j11, r0 r0Var) throws k1 {
        m3.k[] kVarArr;
        m3.h hVar = new m3.h(mVar, j10, j11);
        this.d = hVar;
        if (((m3.k) this.f101c) != null) {
            return;
        }
        m3.i iVar = (m3.i) this.f100b;
        synchronized (iVar) {
            try {
                int[] iArr = m3.i.f17615b;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                int iW = d5.a.w((list == null || list.isEmpty()) ? null : (String) list.get(0));
                if (iW != -1) {
                    iVar.a(iW, arrayList);
                }
                int iX = d5.a.x(uri);
                if (iX != -1 && iX != iW) {
                    iVar.a(iX, arrayList);
                }
                for (int i10 = 0; i10 < 16; i10++) {
                    int i11 = iArr[i10];
                    if (i11 != iW && i11 != iX) {
                        iVar.a(i11, arrayList);
                    }
                }
                kVarArr = (m3.k[]) arrayList.toArray(new m3.k[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z10 = true;
        if (kVarArr.length == 1) {
            this.f101c = kVarArr[0];
        } else {
            for (m3.k kVar : kVarArr) {
                try {
                    if (kVar.f(hVar)) {
                        this.f101c = kVar;
                        hVar.f17614f = 0;
                        break;
                    } else {
                        boolean z11 = ((m3.k) this.f101c) != null || hVar.d == j10;
                        d5.a.i(z11);
                        hVar.f17614f = 0;
                    }
                } catch (EOFException unused) {
                    if (((m3.k) this.f101c) != null || hVar.d == j10) {
                    }
                } catch (Throwable th2) {
                    if (((m3.k) this.f101c) == null && hVar.d != j10) {
                        z10 = false;
                    }
                    d5.a.i(z10);
                    hVar.f17614f = 0;
                    throw th2;
                }
                d5.a.i(z11);
                hVar.f17614f = 0;
            }
            if (((m3.k) this.f101c) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i12 = g0.f4795a;
                StringBuilder sb3 = new StringBuilder();
                for (int i13 = 0; i13 < kVarArr.length; i13++) {
                    sb3.append(kVarArr[i13].getClass().getSimpleName());
                    if (i13 < kVarArr.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                throw new k1(sb2.toString(), null, false, 1);
            }
        }
        ((m3.k) this.f101c).c(r0Var);
    }

    public void x() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((a9.i) this.f100b).f181b;
        ((f2.c) this.f101c).L();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            o1 o1VarU = RecyclerView.U((View) arrayList.get(size));
            if (o1VarU != null) {
                int i11 = o1VarU.f5804r;
                if (recyclerView.b0()) {
                    o1VarU.f5805s = i11;
                    recyclerView.F0.add(o1VarU);
                } else {
                    View view = o1VarU.f5789a;
                    WeakHashMap weakHashMap = r0.j0.f46605a;
                    view.setImportantForAccessibility(i11);
                }
                o1VarU.f5804r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void y(w2.i iVar, int i10, boolean z10) {
        char c10;
        c3.a aVar = (c3.a) this.d;
        Context context = (Context) this.f100b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f48957a;
        String str2 = iVar.f48957a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        t2.d dVar = iVar.f48959c;
        adler32.update(byteBufferAllocate.putInt(g3.a.a(dVar)).array());
        byte[] bArr = iVar.f48958b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i11 < i10) {
                        break;
                    }
                    a.a.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((d3.h) ((d3.d) this.f101c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(g3.a.a(dVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i10));
            Set set = ((c3.b) aVar.f2417b.get(dVar)).f2420c;
            if (set.contains(c3.c.f2421a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(c3.c.f2423c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(c3.c.f2422b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", g3.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf2 = Long.valueOf(aVar.a(dVar, jLongValue, i10));
            Integer numValueOf2 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf2;
            objArr[3] = lValueOf;
            objArr[4] = numValueOf2;
            String strC = a.a.c("JobInfoScheduler");
            if (Log.isLoggable(strC, 3)) {
                Log.d(strC, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void z(View view) {
        if (((ArrayList) this.d).remove(view)) {
            a9.i iVar = (a9.i) this.f100b;
            o1 o1VarU = RecyclerView.U(view);
            if (o1VarU != null) {
                RecyclerView recyclerView = (RecyclerView) iVar.f181b;
                int i10 = o1VarU.f5804r;
                if (recyclerView.b0()) {
                    o1VarU.f5805s = i10;
                    recyclerView.F0.add(o1VarU);
                } else {
                    View view2 = o1VarU.f5789a;
                    WeakHashMap weakHashMap = r0.j0.f46605a;
                    view2.setImportantForAccessibility(i10);
                }
                o1VarU.f5804r = 0;
            }
        }
    }

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.f99a = i10;
        this.f100b = obj;
        this.f101c = obj2;
        this.d = obj3;
    }

    public n(String str, int i10) {
        this.f99a = i10;
        switch (i10) {
            case 15:
                n nVar = new n(14, false);
                this.f101c = nVar;
                this.d = nVar;
                this.f100b = str;
                break;
            case 29:
                n nVar2 = new n(28, false);
                this.f101c = nVar2;
                this.d = nVar2;
                this.f100b = str;
                break;
            default:
                com.google.android.gms.internal.play_billing.k kVar = new com.google.android.gms.internal.play_billing.k();
                this.f101c = kVar;
                this.d = kVar;
                this.f100b = str;
                break;
        }
    }

    public n(int i10) {
        this.f99a = i10;
        switch (i10) {
            case 13:
                this.f100b = new HashMap();
                this.f101c = new HashMap();
                this.d = g7.j.f6509c;
                break;
            case 19:
                this.f100b = new HashMap();
                this.f101c = new HashMap();
                this.d = h7.e.f8331c;
                break;
            case 21:
                this.f100b = new HashMap();
                this.f101c = new HashMap();
                this.d = i7.i0.f10660c;
                break;
            case 25:
                this.f100b = j3.g.f12335c;
                this.d = k0.f12383a;
                break;
            default:
                this.f100b = new b8.b();
                this.f101c = null;
                this.d = null;
                break;
        }
    }

    public n(String str, Boolean bool, dc.a aVar, String str2) {
        this.f99a = 10;
        this.f100b = str;
        this.f101c = str2;
        this.d = aVar;
    }

    public n(ArrayList arrayList) {
        this.f99a = 0;
        this.f100b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f101c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e eVar = (e) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f101c;
            jArr[i11] = eVar.f72b;
            jArr[i11 + 1] = eVar.f73c;
        }
        long[] jArr2 = (long[]) this.f101c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public n(t0 store, s0 factory, b8.a defaultCreationExtras) {
        this.f99a = 3;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(factory, "factory");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        this.f100b = store;
        this.f101c = factory;
        this.d = defaultCreationExtras;
    }

    public n(a9.i iVar) {
        this.f99a = 11;
        this.f100b = iVar;
        this.f101c = new f2.c(0);
        this.d = new ArrayList();
    }

    public n(m3.i iVar) {
        this.f99a = 27;
        this.f100b = iVar;
    }

    public n(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.f48672b);
        this.f99a = 3;
        kotlin.jvm.internal.j.e(store, "store");
    }

    public n(FirebaseMessagingService firebaseMessagingService, ae.b bVar, ExecutorService executorService) {
        this.f99a = 9;
        this.f100b = executorService;
        this.f101c = firebaseMessagingService;
        this.d = bVar;
    }

    public n(Context context, LocationManager locationManager) {
        this.f99a = 12;
        this.d = new y();
        this.f100b = context;
        this.f101c = locationManager;
    }

    public n(androidx.biometric.w wVar) {
        this.f99a = 1;
        this.d = wVar;
    }

    public n(v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f99a = 3;
        kotlin.jvm.internal.j.e(owner, "owner");
    }

    public n(j3.j[] jVarArr) {
        this.f99a = 26;
        j3.q0 q0Var = new j3.q0();
        j3.s0 s0Var = new j3.s0();
        s0Var.f12438c = 1.0f;
        s0Var.d = 1.0f;
        j3.h hVar = j3.h.f12342e;
        s0Var.f12439e = hVar;
        s0Var.f12440f = hVar;
        s0Var.f12441g = hVar;
        s0Var.h = hVar;
        ByteBuffer byteBuffer = j3.j.f12350a;
        s0Var.f12444k = byteBuffer;
        s0Var.f12445l = byteBuffer.asShortBuffer();
        s0Var.f12446m = byteBuffer;
        s0Var.f12437b = -1;
        j3.j[] jVarArr2 = new j3.j[jVarArr.length + 2];
        this.f100b = jVarArr2;
        System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
        this.f101c = q0Var;
        this.d = s0Var;
        jVarArr2[jVarArr.length] = q0Var;
        jVarArr2[jVarArr.length + 1] = s0Var;
    }

    public n(s sVar) {
        this.f99a = 2;
        Context context = sVar.f1063a;
        this.f100b = sVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f101c = i10 >= 29 ? q.b(context) : null;
        this.d = i10 <= 29 ? new ae.b(context, 21) : null;
    }

    public n(c2.e eVar, d0 d0Var) {
        this.f99a = 6;
        this.d = eVar;
        this.f100b = d0Var;
    }
}
