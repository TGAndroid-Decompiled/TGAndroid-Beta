package a5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v4.media.session.d0;
import android.support.v4.media.session.w;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.r;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.o;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import d5.f0;
import f2.h0;
import f2.q1;
import f2.r0;
import j$.util.DesugarCollections;
import j3.i0;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.zip.Adler32;
import r0.j0;
public class m implements r4.f, y2.b, r9.a {
    public static m f96e;
    public final int f97a;
    public Object f98b;
    public Object f99c;
    public Object d;

    public m(int i9, boolean z10) {
        this.f97a = i9;
    }

    public static String i(String str, HashMap hashMap) {
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb2.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb2.append(str3);
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb3 = "&".concat(sb3);
            }
            return ta.b.j(str, sb3);
        }
        return aa.d.z(str, "?", sb3);
    }

    public void A(w2.i iVar, int i9, boolean z10) {
        Long l10;
        char c10;
        c3.a aVar = (c3.a) this.d;
        Context context = (Context) this.f98b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f48454a;
        String str2 = iVar.f48454a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        t2.d dVar = iVar.f48456c;
        adler32.update(allocate.putInt(g3.a.a(dVar)).array());
        byte[] bArr = iVar.f48455b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i9) {
                        a.a.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((d3.h) ((d3.d) this.f99c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(g3.a.a(dVar))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            long longValue = l10.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i9));
            Set set = ((c3.b) aVar.f2279b.get(dVar)).f2282c;
            if (set.contains(c3.c.f2283a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(c3.c.f2285c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(c3.c.f2284b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i9);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", g3.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(aVar.a(dVar, longValue, i9));
            Integer valueOf3 = Integer.valueOf(i9);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l10;
            objArr[4] = valueOf3;
            String c11 = a.a.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void B(View view) {
        if (((ArrayList) this.d).remove(view)) {
            k5.i iVar = (k5.i) this.f98b;
            q1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) iVar.f14659b;
                int i9 = U.f5516r;
                if (recyclerView.b0()) {
                    U.f5517s = i9;
                    recyclerView.F0.add(U);
                } else {
                    View view2 = U.f5501a;
                    WeakHashMap weakHashMap = j0.f46915a;
                    view2.setImportantForAccessibility(i9);
                }
                U.f5516r = 0;
            }
        }
    }

    public void a(View view, int i9, boolean z10) {
        int t10;
        RecyclerView recyclerView = (RecyclerView) ((k5.i) this.f98b).f14659b;
        if (i9 < 0) {
            t10 = recyclerView.getChildCount();
        } else {
            t10 = t(i9);
        }
        ((f2.d) this.f99c).J(t10, z10);
        if (z10) {
            y(view);
        }
        recyclerView.addView(view, t10);
        q1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        r0 r0Var = recyclerView.f1366w;
        if (r0Var != null && U != null) {
            r0Var.y(U);
        }
        ArrayList arrayList = recyclerView.L;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h0) recyclerView.L.get(size)).getClass();
            }
        }
    }

    @Override
    public int b(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = f0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    public void c(View view, int i9, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int t10;
        RecyclerView recyclerView = (RecyclerView) ((k5.i) this.f98b).f14659b;
        if (i9 < 0) {
            t10 = recyclerView.getChildCount();
        } else {
            t10 = t(i9);
        }
        ((f2.d) this.f99c).J(t10, z10);
        if (z10) {
            y(view);
        }
        q1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f5510l &= -257;
        }
        recyclerView.attachViewToParent(view, t10, layoutParams);
    }

    public i0 d() {
        if (((m) this.f99c) == null) {
            this.f99c = new m(new j3.j[0]);
        }
        return new i0(this);
    }

    public int e(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: a5.m.e(int):int");
    }

    public int f() {
        FingerprintManager f10;
        FingerprintManager f11;
        k0.b bVar = (k0.b) this.d;
        if (bVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = bVar.f14435a;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23 && (f10 = e0.b.f(context)) != null && e0.b.n(f10)) {
            if (i9 >= 23 && (f11 = e0.b.f(context)) != null && e0.b.k(f11)) {
                return 0;
            }
            return 11;
        }
        return 12;
    }

    public void g() {
        d0 d0Var = (d0) this.f98b;
        if (d0Var != null) {
            int i9 = ((c2.e) this.d).f2145n.d;
            w wVar = d0Var.f310a;
            wVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i9);
            wVar.f335a.setPlaybackToLocal(builder.build());
            this.f99c = null;
        }
    }

    @Override
    public Object mo28get() {
        return new m((Context) ((nc.a) this.f98b).mo28get(), (d3.d) ((nc.a) this.f99c).mo28get(), (c3.a) ((v9.d) this.d).mo28get(), 7);
    }

    @Override
    public long h(int i9) {
        boolean z10;
        long[] jArr = (long[]) this.d;
        boolean z11 = false;
        if (i9 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        if (i9 < jArr.length) {
            z11 = true;
        }
        d5.a.f(z11);
        return jArr[i9];
    }

    public void j(int i9) {
        q1 U;
        int t10 = t(i9);
        ((f2.d) this.f99c).K(t10);
        RecyclerView recyclerView = (RecyclerView) ((k5.i) this.f98b).f14659b;
        View childAt = recyclerView.getChildAt(t10);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(t10);
    }

    public com.google.android.gms.internal.clearcut.a1 k() {
        throw new UnsupportedOperationException("Method not decompiled: a5.m.k():com.google.android.gms.internal.clearcut.a1");
    }

    @Override
    public r9.a l(Class cls, q9.d dVar) {
        switch (this.f97a) {
            case 12:
                ((HashMap) this.f98b).put(cls, dVar);
                ((HashMap) this.f99c).remove(cls);
                return this;
            case 18:
                ((HashMap) this.f98b).put(cls, dVar);
                ((HashMap) this.f99c).remove(cls);
                return this;
            default:
                ((HashMap) this.f98b).put(cls, dVar);
                ((HashMap) this.f99c).remove(cls);
                return this;
        }
    }

    @Override
    public List m(long j10) {
        List list = (List) this.f98b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            long[] jArr = (long[]) this.f99c;
            int i10 = i9 * 2;
            if (jArr[i10] <= j10 && j10 < jArr[i10 + 1]) {
                d dVar = (d) list.get(i9);
                r4.b bVar = dVar.f69a;
                if (bVar.f47048e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new e(1));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            r4.b bVar2 = ((d) arrayList2.get(i11)).f69a;
            arrayList.add(new r4.b(bVar2.f47045a, bVar2.f47046b, bVar2.f47047c, bVar2.d, (-1) - i11, 1, bVar2.h, bVar2.f47050n, bVar2.f47051r, bVar2.f47055y, bVar2.A, bVar2.f47052s, bVar2.v, bVar2.f47053w, bVar2.f47054x, bVar2.B, bVar2.C));
        }
        return arrayList;
    }

    public p0 n(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return o(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 o(Class cls, String key) {
        p0 viewModel;
        n0 n0Var;
        s0 s0Var = (s0) this.f99c;
        kotlin.jvm.internal.i.e(key, "key");
        t0 t0Var = (t0) this.f98b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f1138a;
        p0 p0Var = (p0) linkedHashMap.get(key);
        if (cls.isInstance(p0Var)) {
            if (s0Var instanceof n0) {
                n0Var = (n0) s0Var;
            } else {
                n0Var = null;
            }
            if (n0Var != null) {
                kotlin.jvm.internal.i.b(p0Var);
                o oVar = n0Var.d;
                if (oVar != null) {
                    g2.e eVar = n0Var.f1127e;
                    kotlin.jvm.internal.i.b(eVar);
                    androidx.lifecycle.j0.a(p0Var, eVar, oVar);
                }
            }
            kotlin.jvm.internal.i.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return p0Var;
        }
        v1.b bVar = new v1.b((a8.a) this.d);
        ((LinkedHashMap) bVar.f108a).put(q0.f1135b, key);
        try {
            viewModel = s0Var.o(cls, bVar);
        } catch (AbstractMethodError unused) {
            viewModel = s0Var.a(cls);
        }
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        p0 p0Var2 = (p0) linkedHashMap.put(key, viewModel);
        if (p0Var2 != null) {
            p0Var2.b();
        }
        return viewModel;
    }

    public View p(int i9) {
        return ((RecyclerView) ((k5.i) this.f98b).f14659b).getChildAt(t(i9));
    }

    public int q() {
        return ((RecyclerView) ((k5.i) this.f98b).f14659b).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override
    public int r() {
        return ((long[]) this.d).length;
    }

    public ByteBuffer s() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap != null) {
            if (bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = ((Bitmap) this.d).getHeight();
            int i9 = width * height;
            int[] iArr = new int[i9];
            ((Bitmap) this.d).getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                bArr[i10] = (byte) ((Color.blue(iArr[i10]) * 0.114f) + (Color.green(iArr[i10]) * 0.587f) + (Color.red(iArr[i10]) * 0.299f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return (ByteBuffer) this.f99c;
    }

    public int t(int i9) {
        f2.d dVar = (f2.d) this.f99c;
        if (i9 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((k5.i) this.f98b).f14659b).getChildCount();
        int i10 = i9;
        while (i10 < childCount) {
            int E = i9 - (i10 - dVar.E(i10));
            if (E == 0) {
                while (dVar.H(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += E;
        }
        return -1;
    }

    public String toString() {
        String str = "";
        switch (this.f97a) {
            case 9:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f98b);
                sb2.append('{');
                com.google.android.gms.internal.play_billing.k kVar = ((com.google.android.gms.internal.play_billing.k) this.f99c).f3608b;
                while (kVar != null) {
                    Object obj = kVar.f3607a;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = kVar.f3608b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
                return ((f2.d) this.f99c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 14:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f98b);
                sb3.append('{');
                m mVar = (m) ((m) this.f99c).d;
                while (mVar != null) {
                    Object obj2 = mVar.f99c;
                    sb3.append(str);
                    String str2 = (String) mVar.f98b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    mVar = (m) mVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 26:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.f98b);
                sb4.append('{');
                m mVar2 = (m) ((m) this.f99c).d;
                while (mVar2 != null) {
                    Object obj3 = mVar2.f99c;
                    sb4.append(str);
                    String str3 = (String) mVar2.f98b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj3 != null && obj3.getClass().isArray()) {
                        String deepToString3 = Arrays.deepToString(new Object[]{obj3});
                        sb4.append((CharSequence) deepToString3, 1, deepToString3.length() - 1);
                    } else {
                        sb4.append(obj3);
                    }
                    mVar2 = (m) mVar2.d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i9) {
        return ((RecyclerView) ((k5.i) this.f98b).f14659b).getChildAt(i9);
    }

    public int v() {
        return ((RecyclerView) ((k5.i) this.f98b).f14659b).getChildCount();
    }

    public boolean w() {
        throw new UnsupportedOperationException("Method not decompiled: a5.m.w():boolean");
    }

    public void x(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void y(View view) {
        ((ArrayList) this.d).add(view);
        k5.i iVar = (k5.i) this.f98b;
        q1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f5501a;
            RecyclerView recyclerView = (RecyclerView) iVar.f14659b;
            int i9 = U.f5517s;
            if (i9 != -1) {
                U.f5516r = i9;
            } else {
                WeakHashMap weakHashMap = j0.f46915a;
                U.f5516r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.f5517s = 4;
                recyclerView.F0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = j0.f46915a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void z() {
        int i9;
        RecyclerView recyclerView = (RecyclerView) ((k5.i) this.f98b).f14659b;
        ((f2.d) this.f99c).L();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            q1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.f5516r;
                if (recyclerView.b0()) {
                    U.f5517s = i10;
                    recyclerView.F0.add(U);
                } else {
                    View view = U.f5501a;
                    WeakHashMap weakHashMap = j0.f46915a;
                    view.setImportantForAccessibility(i10);
                }
                U.f5516r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i9 = 0; i9 < childCount; i9++) {
            View childAt = recyclerView.getChildAt(i9);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public m(Object obj, Object obj2, Object obj3, int i9) {
        this.f97a = i9;
        this.f98b = obj;
        this.f99c = obj2;
        this.d = obj3;
    }

    public m(String str, int i9) {
        this.f97a = i9;
        switch (i9) {
            case 14:
                m mVar = new m(13, false);
                this.f99c = mVar;
                this.d = mVar;
                this.f98b = str;
                return;
            case 26:
                m mVar2 = new m(25, false);
                this.f99c = mVar2;
                this.d = mVar2;
                this.f98b = str;
                return;
            default:
                Object obj = new Object();
                this.f99c = obj;
                this.d = obj;
                this.f98b = str;
                return;
        }
    }

    public m(int i9) {
        this.f97a = i9;
        switch (i9) {
            case 12:
                this.f98b = new HashMap();
                this.f99c = new HashMap();
                this.d = f7.j.f5707c;
                return;
            case 18:
                this.f98b = new HashMap();
                this.f99c = new HashMap();
                this.d = g7.e.f7160c;
                return;
            case 21:
                this.f98b = new HashMap();
                this.f99c = new HashMap();
                this.d = h7.i0.f9951c;
                return;
            case 28:
                this.f98b = j3.g.f13241c;
                this.d = j3.j0.f13283a;
                return;
            default:
                this.f98b = new Object();
                this.f99c = null;
                this.d = null;
                return;
        }
    }

    public m(String str, Boolean bool, cc.a aVar, String str2) {
        this.f97a = 8;
        this.f98b = str;
        this.f99c = str2;
        this.d = aVar;
    }

    public m(ArrayList arrayList) {
        this.f97a = 0;
        this.f98b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f99c = new long[arrayList.size() * 2];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            d dVar = (d) arrayList.get(i9);
            int i10 = i9 * 2;
            long[] jArr = (long[]) this.f99c;
            jArr[i10] = dVar.f70b;
            jArr[i10 + 1] = dVar.f71c;
        }
        long[] jArr2 = (long[]) this.f99c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public m(String str, HashMap hashMap) {
        this.f97a = 27;
        this.f98b = str;
        this.f99c = hashMap;
        this.d = new HashMap();
    }

    public m(t0 store, s0 factory, a8.a defaultCreationExtras) {
        this.f97a = 4;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(factory, "factory");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f98b = store;
        this.f99c = factory;
        this.d = defaultCreationExtras;
    }

    public m(k5.i iVar) {
        this.f97a = 11;
        this.f98b = iVar;
        this.f99c = new f2.d(0);
        this.d = new ArrayList();
    }

    public m(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.f48245b);
        this.f97a = 4;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public m(FirebaseMessagingService firebaseMessagingService, k5.i iVar, ExecutorService executorService) {
        this.f97a = 10;
        this.f98b = executorService;
        this.f99c = firebaseMessagingService;
        this.d = iVar;
    }

    public m(Context context, LocationManager locationManager) {
        this.f97a = 17;
        this.d = new Object();
        this.f98b = context;
        this.f99c = locationManager;
    }

    public m(androidx.biometric.w wVar) {
        this.f97a = 2;
        this.d = wVar;
    }

    public m(v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f97a = 4;
        kotlin.jvm.internal.i.e(owner, "owner");
    }

    public m(j3.j[] jVarArr) {
        this.f97a = 29;
        j3.p0 p0Var = new j3.p0();
        ?? obj = new Object();
        obj.f13338c = 1.0f;
        obj.d = 1.0f;
        j3.h hVar = j3.h.f13246e;
        obj.f13339e = hVar;
        obj.f13340f = hVar;
        obj.f13341g = hVar;
        obj.h = hVar;
        ByteBuffer byteBuffer = j3.j.f13282a;
        obj.f13344k = byteBuffer;
        obj.f13345l = byteBuffer.asShortBuffer();
        obj.f13346m = byteBuffer;
        obj.f13337b = -1;
        j3.j[] jVarArr2 = new j3.j[jVarArr.length + 2];
        this.f98b = jVarArr2;
        System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
        this.f99c = p0Var;
        this.d = obj;
        jVarArr2[jVarArr.length] = p0Var;
        jVarArr2[jVarArr.length + 1] = obj;
    }

    public m(u5.h hVar) {
        this.f97a = 3;
        Context context = hVar.f48117a;
        this.f98b = hVar;
        int i9 = Build.VERSION.SDK_INT;
        this.f99c = i9 >= 29 ? r.b(context) : null;
        this.d = i9 <= 29 ? new k0.b(context) : null;
    }

    public m(c2.e eVar, d0 d0Var) {
        this.f97a = 6;
        this.d = eVar;
        this.f98b = d0Var;
    }
}
