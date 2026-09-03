package af;

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
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.r;
import androidx.biometric.t;
import androidx.biometric.x;
import androidx.lifecycle.o;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.RecyclerView;
import b4.b0;
import b4.h0;
import b6.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.play_billing.k;
import com.google.firebase.messaging.FirebaseMessagingService;
import f2.e0;
import f2.l1;
import f2.o0;
import h5.c0;
import h5.d0;
import h5.w;
import j$.util.DesugarCollections;
import j3.m0;
import j3.n0;
import j7.i0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.zip.Adler32;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import l3.l;
import l3.n;
import r0.j0;
import r3.v;
public class d implements b0, a3.b, v4.f, v9.a {
    public static d e;
    public final int f158a;
    public Object f159b;
    public Object f160c;
    public Object d;

    public d(int i10, boolean z4) {
        this.f158a = i10;
    }

    public void A(y2.i iVar, int i10, boolean z4) {
        Long l10;
        char c3;
        e3.a aVar = (e3.a) this.d;
        Context context = (Context) this.f159b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f47108a;
        String str2 = iVar.f47108a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        v2.d dVar = iVar.f47110c;
        adler32.update(allocate.putInt(i3.a.a(dVar)).array());
        byte[] bArr = iVar.f47109b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z4) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        i0.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((f3.h) ((f3.d) this.f160c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(i3.a.a(dVar))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            long longValue = l10.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i10));
            Set set = ((e3.b) aVar.f5085b.get(dVar)).f5088c;
            if (set.contains(e3.c.f5089a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e3.c.f5091c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e3.c.f5090b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", i3.a.a(dVar));
            if (bArr != null) {
                c3 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c3 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(aVar.a(dVar, longValue, i10));
            Integer valueOf3 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c3] = iVar;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l10;
            objArr[4] = valueOf3;
            String c10 = i0.c("JobInfoScheduler");
            if (Log.isLoggable(c10, 3)) {
                Log.d(c10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void B(b bVar) {
        j jVar;
        j jVar2 = (j) this.f160c;
        if (jVar2 != null && ((b) this.d) == null && bVar != null) {
            d(jVar2);
        }
        if (((b) this.d) != null && (jVar = (j) this.f160c) != null && bVar == null) {
            z(jVar);
        }
        b bVar2 = (b) this.d;
        if (bVar2 != null) {
            s5.h hVar = bVar2.f150a;
            m.e("Must be called from the main thread.");
            hVar.f44142i.remove(bVar2);
        }
        if (bVar != null) {
            bVar.f150a.p(bVar);
            j jVar3 = (j) this.f160c;
            if (jVar3 != null) {
                bVar.d = jVar3;
                bVar.f154g = 0;
                bVar.h = 0;
                bVar.p();
            }
        }
        this.d = bVar;
    }

    public void C(View view) {
        if (((ArrayList) this.d).remove(view)) {
            bb.b bVar = (bb.b) this.f159b;
            l1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) bVar.f1772b;
                int i10 = U.f5788r;
                if (recyclerView.b0()) {
                    U.f5789s = i10;
                    recyclerView.G0.add(U);
                } else {
                    View view2 = U.f5774a;
                    WeakHashMap weakHashMap = j0.f43142a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f5788r = 0;
            }
        }
    }

    public void D(Object obj, String str) {
        d dVar = new d(7, false);
        ((d) this.d).d = dVar;
        this.d = dVar;
        dVar.f160c = obj;
        dVar.f159b = str;
    }

    @Override
    public void a(w wVar) {
        long c3;
        long j10;
        h5.a.j((c0) this.f160c);
        int i10 = d0.f6924a;
        c0 c0Var = (c0) this.f160c;
        synchronized (c0Var) {
            try {
                long j11 = c0Var.f6923c;
                if (j11 != -9223372036854775807L) {
                    c3 = j11 + c0Var.f6922b;
                } else {
                    c3 = c0Var.c();
                }
                j10 = c3;
            } finally {
            }
        }
        long d = ((c0) this.f160c).d();
        if (j10 != -9223372036854775807L && d != -9223372036854775807L) {
            n0 n0Var = (n0) this.f159b;
            if (d != n0Var.G) {
                m0 a2 = n0Var.a();
                a2.f8670s = d;
                n0 n0Var2 = new n0(a2);
                this.f159b = n0Var2;
                ((v) this.d).b(n0Var2);
            }
            int a10 = wVar.a();
            ((v) this.d).d(a10, wVar);
            ((v) this.d).c(j10, 1, a10, 0, null);
        }
    }

    @Override
    public v9.a b(Class cls, u9.d dVar) {
        switch (this.f158a) {
            case 20:
                ((HashMap) this.f159b).put(cls, dVar);
                ((HashMap) this.f160c).remove(cls);
                return this;
            case 26:
                ((HashMap) this.f159b).put(cls, dVar);
                ((HashMap) this.f160c).remove(cls);
                return this;
            default:
                ((HashMap) this.f159b).put(cls, dVar);
                ((HashMap) this.f160c).remove(cls);
                return this;
        }
    }

    @Override
    public void c(c0 c0Var, r3.m mVar, h0 h0Var) {
        this.f160c = c0Var;
        h0Var.a();
        h0Var.b();
        v d22 = mVar.d2(h0Var.d, 5);
        this.d = d22;
        d22.b((n0) this.f159b);
    }

    public void d(j jVar) {
        if (((g) this.f159b) == null) {
            this.f159b = new g();
        }
        for (int i10 = 0; i10 < jVar.f182a.size(); i10++) {
            g gVar = (g) this.f159b;
            i a2 = jVar.a(i10);
            gVar.h.put(a2.d, a2);
            gVar.h();
        }
    }

    @Override
    public int e(long j10) {
        long[] jArr = (long[]) this.d;
        int b10 = d0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    public void f(View view, int i10, boolean z4) {
        int t6;
        RecyclerView recyclerView = (RecyclerView) ((bb.b) this.f159b).f1772b;
        if (i10 < 0) {
            t6 = recyclerView.getChildCount();
        } else {
            t6 = t(i10);
        }
        ((f2.c) this.f160c).y(t6, z4);
        if (z4) {
            x(view);
        }
        recyclerView.addView(view, t6);
        l1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        o0 o0Var = recyclerView.f1259w;
        if (o0Var != null && U != null) {
            o0Var.y(U);
        }
        ArrayList arrayList = recyclerView.M;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((e0) recyclerView.M.get(size)).getClass();
            }
        }
    }

    public void g(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z4) {
        int t6;
        RecyclerView recyclerView = (RecyclerView) ((bb.b) this.f159b).f1772b;
        if (i10 < 0) {
            t6 = recyclerView.getChildCount();
        } else {
            t6 = t(i10);
        }
        ((f2.c) this.f160c).y(t6, z4);
        if (z4) {
            x(view);
        }
        l1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f5782l &= -257;
        }
        recyclerView.attachViewToParent(view, t6, layoutParams);
    }

    @Override
    public Object mo28get() {
        return new d((Context) ((rc.a) this.f159b).mo28get(), (f3.d) ((rc.a) this.f160c).mo28get(), (e3.a) ((cb.b) this.d).mo28get(), 13);
    }

    @Override
    public long h(int i10) {
        boolean z4;
        long[] jArr = (long[]) this.d;
        boolean z10 = false;
        if (i10 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        if (i10 < jArr.length) {
            z10 = true;
        }
        h5.a.f(z10);
        return jArr[i10];
    }

    public int i(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: af.d.i(int):int");
    }

    public int j() {
        FingerprintManager f10;
        FingerprintManager f11;
        y5.h hVar = (y5.h) this.d;
        if (hVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = hVar.f47182a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (f10 = e0.b.f(context)) != null && e0.b.n(f10)) {
            if (i10 >= 23 && (f11 = e0.b.f(context)) != null && e0.b.k(f11)) {
                return 0;
            }
            return 11;
        }
        return 12;
    }

    public void k() {
        android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) this.f159b;
        if (c0Var != null) {
            int i10 = ((c2.e) this.d).f1948n.d;
            android.support.v4.media.session.v vVar = c0Var.f261a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f283a.setPlaybackToLocal(builder.build());
            this.f160c = null;
        }
    }

    public void l(int i10) {
        l1 U;
        int t6 = t(i10);
        ((f2.c) this.f160c).z(t6);
        RecyclerView recyclerView = (RecyclerView) ((bb.b) this.f159b).f1772b;
        View childAt = recyclerView.getChildAt(t6);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(t6);
    }

    public p0 m(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return n(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public p0 n(Class cls, String key) {
        p0 viewModel;
        androidx.lifecycle.n0 n0Var;
        s0 s0Var = (s0) this.f160c;
        kotlin.jvm.internal.j.e(key, "key");
        t0 t0Var = (t0) this.f159b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f1041a;
        p0 p0Var = (p0) linkedHashMap.get(key);
        if (cls.isInstance(p0Var)) {
            if (s0Var instanceof androidx.lifecycle.n0) {
                n0Var = (androidx.lifecycle.n0) s0Var;
            } else {
                n0Var = null;
            }
            if (n0Var != null) {
                kotlin.jvm.internal.j.b(p0Var);
                o oVar = n0Var.d;
                if (oVar != null) {
                    g2.e eVar = n0Var.e;
                    kotlin.jvm.internal.j.b(eVar);
                    androidx.lifecycle.j0.a(p0Var, eVar, oVar);
                }
            }
            kotlin.jvm.internal.j.c(p0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return p0Var;
        }
        v1.b bVar = new v1.b((cb.e) this.d);
        ((LinkedHashMap) bVar.f2238a).put(q0.f1039b, key);
        try {
            viewModel = s0Var.p(cls, bVar);
        } catch (AbstractMethodError unused) {
            viewModel = s0Var.b(cls);
        }
        kotlin.jvm.internal.j.e(viewModel, "viewModel");
        p0 p0Var2 = (p0) linkedHashMap.put(key, viewModel);
        if (p0Var2 != null) {
            p0Var2.b();
        }
        return viewModel;
    }

    public View o(int i10) {
        return ((RecyclerView) ((bb.b) this.f159b).f1772b).getChildAt(t(i10));
    }

    public int p() {
        return ((RecyclerView) ((bb.b) this.f159b).f1772b).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override
    public List q(long j10) {
        List list = (List) this.f159b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f160c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e5.d dVar = (e5.d) list.get(i10);
                v4.b bVar = dVar.f5132a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new e5.e(1));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            v4.b bVar2 = ((e5.d) arrayList2.get(i12)).f5132a;
            arrayList.add(new v4.b(bVar2.f45662a, bVar2.f45663b, bVar2.f45664c, bVar2.d, (-1) - i12, 1, bVar2.h, bVar2.f45666n, bVar2.f45667r, bVar2.f45671y, bVar2.B, bVar2.f45668s, bVar2.v, bVar2.f45669w, bVar2.f45670x, bVar2.C, bVar2.D));
        }
        return arrayList;
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
            int i10 = width * height;
            int[] iArr = new int[i10];
            ((Bitmap) this.d).getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i11] = (byte) ((Color.blue(iArr[i11]) * 0.114f) + (Color.green(iArr[i11]) * 0.587f) + (Color.red(iArr[i11]) * 0.299f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return (ByteBuffer) this.f160c;
    }

    public int t(int i10) {
        f2.c cVar = (f2.c) this.f160c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((bb.b) this.f159b).f1772b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int u10 = i10 - (i11 - cVar.u(i11));
            if (u10 == 0) {
                while (cVar.x(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += u10;
        }
        return -1;
    }

    public String toString() {
        String str = "";
        switch (this.f158a) {
            case 8:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f159b);
                sb.append('{');
                d dVar = (d) ((d) this.f160c).d;
                while (dVar != null) {
                    Object obj = dVar.f160c;
                    sb.append(str);
                    String str2 = (String) dVar.f159b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    dVar = (d) dVar.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f159b);
                sb2.append('{');
                k kVar = ((k) this.f160c).f3503b;
                while (kVar != null) {
                    Object obj2 = kVar.f3502a;
                    sb2.append(str);
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb2.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb2.append(obj2);
                    }
                    kVar = kVar.f3503b;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 16:
                return ((f2.c) this.f160c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 22:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f159b);
                sb3.append('{');
                d dVar2 = (d) ((d) this.f160c).d;
                while (dVar2 != null) {
                    Object obj3 = dVar2.f160c;
                    sb3.append(str);
                    String str3 = (String) dVar2.f159b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj3 != null && obj3.getClass().isArray()) {
                        String deepToString3 = Arrays.deepToString(new Object[]{obj3});
                        sb3.append((CharSequence) deepToString3, 1, deepToString3.length() - 1);
                    } else {
                        sb3.append(obj3);
                    }
                    dVar2 = (d) dVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i10) {
        return ((RecyclerView) ((bb.b) this.f159b).f1772b).getChildAt(i10);
    }

    public int v() {
        return ((RecyclerView) ((bb.b) this.f159b).f1772b).getChildCount();
    }

    public boolean w() {
        throw new UnsupportedOperationException("Method not decompiled: af.d.w():boolean");
    }

    public void x(View view) {
        ((ArrayList) this.d).add(view);
        bb.b bVar = (bb.b) this.f159b;
        l1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f5774a;
            RecyclerView recyclerView = (RecyclerView) bVar.f1772b;
            int i10 = U.f5789s;
            if (i10 != -1) {
                U.f5788r = i10;
            } else {
                WeakHashMap weakHashMap = j0.f43142a;
                U.f5788r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.f5789s = 4;
                recyclerView.G0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = j0.f43142a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void y() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((bb.b) this.f159b).f1772b;
        ((f2.c) this.f160c).A();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            l1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f5788r;
                if (recyclerView.b0()) {
                    U.f5789s = i11;
                    recyclerView.G0.add(U);
                } else {
                    View view = U.f5774a;
                    WeakHashMap weakHashMap = j0.f43142a;
                    view.setImportantForAccessibility(i11);
                }
                U.f5788r = 0;
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

    public void z(j jVar) {
        if (((g) this.f159b) != null) {
            for (int i10 = 0; i10 < jVar.f182a.size(); i10++) {
                g gVar = (g) this.f159b;
                gVar.h.remove(jVar.a(i10).d);
                gVar.h();
            }
        }
    }

    public d(Object obj, Object obj2, Object obj3, int i10) {
        this.f158a = i10;
        this.f159b = obj;
        this.f160c = obj2;
        this.d = obj3;
    }

    public d(int i10) {
        this.f158a = i10;
        switch (i10) {
            case 20:
                this.f159b = new HashMap();
                this.f160c = new HashMap();
                this.d = j7.j.f9022c;
                return;
            case 26:
                this.f159b = new HashMap();
                this.f160c = new HashMap();
                this.d = k7.e.f9768c;
                return;
            case 29:
                this.f159b = new HashMap();
                this.f160c = new HashMap();
                this.d = l7.i0.f11597c;
                return;
            default:
                this.f159b = new Object();
                this.f160c = null;
                this.d = null;
                return;
        }
    }

    public d(String str, Boolean bool, gc.a aVar, String str2) {
        this.f158a = 18;
        this.f159b = str;
        this.f160c = str2;
        this.d = aVar;
    }

    public d(t0 store, s0 factory, cb.e defaultCreationExtras) {
        this.f158a = 3;
        kotlin.jvm.internal.j.e(store, "store");
        kotlin.jvm.internal.j.e(factory, "factory");
        kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
        this.f159b = store;
        this.f160c = factory;
        this.d = defaultCreationExtras;
    }

    public d(ArrayList arrayList) {
        this.f158a = 14;
        this.f159b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f160c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e5.d dVar = (e5.d) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f160c;
            jArr[i11] = dVar.f5133b;
            jArr[i11 + 1] = dVar.f5134c;
        }
        long[] jArr2 = (long[]) this.f160c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public d(bb.b bVar) {
        this.f158a = 16;
        this.f159b = bVar;
        this.f160c = new f2.c(0);
        this.d = new ArrayList();
    }

    public d(String str, int i10) {
        this.f158a = i10;
        switch (i10) {
            case 8:
                d dVar = new d(7, false);
                this.f160c = dVar;
                this.d = dVar;
                this.f159b = str;
                return;
            case 10:
                Object obj = new Object();
                this.f160c = obj;
                this.d = obj;
                this.f159b = str;
                return;
            case 22:
                d dVar2 = new d(21, false);
                this.f160c = dVar2;
                this.d = dVar2;
                this.f159b = str;
                return;
            default:
                m0 m0Var = new m0();
                m0Var.f8666o = str;
                this.f159b = new n0(m0Var);
                return;
        }
    }

    public d(t0 store, s0 s0Var) {
        this(store, s0Var, v1.a.f45617b);
        this.f158a = 3;
        kotlin.jvm.internal.j.e(store, "store");
    }

    public d(FirebaseMessagingService firebaseMessagingService, bb.b bVar, ExecutorService executorService) {
        this.f158a = 11;
        this.f159b = executorService;
        this.f160c = firebaseMessagingService;
        this.d = bVar;
    }

    public d(Context context, LocationManager locationManager) {
        this.f158a = 17;
        this.d = new Object();
        this.f159b = context;
        this.f160c = locationManager;
    }

    public d(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f158a = 5;
        this.f159b = str;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f160c = unmodifiableList;
        this.d = bArr;
    }

    public d(x xVar) {
        this.f158a = 1;
        this.d = xVar;
    }

    public d(androidx.fragment.app.v owner) {
        this(owner.f(), owner.c(), owner.d());
        this.f158a = 3;
        kotlin.jvm.internal.j.e(owner, "owner");
    }

    public d(n[] nVarArr) {
        this.f158a = 28;
        l3.q0 q0Var = new l3.q0();
        ?? obj = new Object();
        obj.f11361c = 1.0f;
        obj.d = 1.0f;
        l lVar = l.e;
        obj.e = lVar;
        obj.f11362f = lVar;
        obj.f11363g = lVar;
        obj.h = lVar;
        ByteBuffer byteBuffer = n.f11308a;
        obj.f11366k = byteBuffer;
        obj.f11367l = byteBuffer.asShortBuffer();
        obj.f11368m = byteBuffer;
        obj.f11360b = -1;
        n[] nVarArr2 = new n[nVarArr.length + 2];
        this.f159b = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        this.f160c = q0Var;
        this.d = obj;
        nVarArr2[nVarArr.length] = q0Var;
        nVarArr2[nVarArr.length + 1] = obj;
    }

    public d(Signature signature) {
        this.f158a = 25;
        this.f159b = signature;
        this.f160c = null;
        this.d = null;
    }

    public d(Cipher cipher) {
        this.f158a = 25;
        this.f160c = cipher;
        this.f159b = null;
        this.d = null;
    }

    public d(Mac mac) {
        this.f158a = 25;
        this.d = mac;
        this.f160c = null;
        this.f159b = null;
    }

    public d(t tVar) {
        this.f158a = 2;
        Context context = tVar.f498a;
        this.f159b = tVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f160c = i10 >= 29 ? r.b(context) : null;
        this.d = i10 <= 29 ? new y5.h(context, 1) : null;
    }

    public d(c2.e eVar, android.support.v4.media.session.c0 c0Var) {
        this.f158a = 9;
        this.d = eVar;
        this.f159b = c0Var;
    }
}
