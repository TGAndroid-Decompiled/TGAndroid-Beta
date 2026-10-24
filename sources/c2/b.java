package c2;

import ah.l0;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c3.e0;
import ci.o3;
import com.google.firebase.messaging.FirebaseMessaging;
import e2.i0;
import e9.c2;
import i2.o1;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import n2.w;
import n2.x;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.Wallet.z0;
import org.telegram.ui.a1;
import org.telegram.ui.b5;
import org.telegram.ui.g5;
import org.telegram.ui.w4;
import org.telegram.ui.z4;
import tc.v;
import v7.u6;
import w7.a0;
public final class b implements c3.s {
    public static b e;
    public boolean f4493a;
    public Object f4494b;
    public Object f4495c;
    public Object d;

    public b(View view) {
        qu[] quVarArr = {new qu(), new qu(), new qu()};
        this.f4494b = quVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4495c = animatorSet;
        animatorSet.playTogether(i(quVarArr[0], 0, 255, 0, 300), i(quVarArr[1], 0, 255, 150, 300), i(quVarArr[2], 0, 255, 300, 300), i(quVarArr[0], 255, 0, 1000, 400), i(quVarArr[1], 255, 0, 1000, 400), i(quVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new o3(this, view));
    }

    public static void a(kc.e[][][] eVarArr, int i10, kc.e eVar) {
        kc.e[] eVarArr2 = eVarArr[i10 + eVar.d][eVar.f15066c];
        ic.e eVar2 = eVar.f15064a;
        int ordinal = eVar2.ordinal();
        char c10 = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        c10 = 0;
                    } else {
                        throw new IllegalStateException("Illegal mode " + eVar2);
                    }
                } else {
                    c10 = 3;
                }
            } else {
                c10 = 1;
            }
        }
        kc.e eVar3 = eVarArr2[c10];
        if (eVar3 != null && eVar3.f15067f <= eVar.f15067f) {
            return;
        }
        eVarArr2[c10] = eVar;
    }

    public static boolean f(ic.e eVar, char c10) {
        int i10;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return kc.c.c(String.valueOf(c10));
                    }
                    return false;
                }
            } else {
                int[] iArr = kc.c.f15059a;
                if (c10 < '`') {
                    i10 = iArr[c10];
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    return false;
                }
            }
        } else if (c10 < '0' || c10 > '9') {
            return false;
        }
        return true;
    }

    public static boolean g(b5 b5Var) {
        if (b5Var.f35920a == null && b5Var.f35921b == null) {
            return false;
        }
        return true;
    }

    public static b m() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public static ic.f o(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                return ic.f.c(40);
            }
            return ic.f.c(26);
        }
        return ic.f.c(9);
    }

    public void A(SpannableString spannableString, int i10) {
        qu[] quVarArr = (qu[]) this.f4494b;
        int i11 = i10 + 1;
        spannableString.setSpan(quVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(quVarArr[1], i11, i12, 0);
        spannableString.setSpan(quVarArr[2], i12, i10 + 3, 0);
    }

    public void B() {
        synchronized (this.f4494b) {
            try {
                if (((ArrayDeque) this.f4495c).isEmpty()) {
                    this.f4493a = false;
                    return;
                }
                rb.s sVar = (rb.s) ((ArrayDeque) this.f4495c).remove();
                D(sVar.f45636b, sVar.f45635a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void C() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((c3.s) this.f4494b).C();
        if (this.f4493a) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((z3.n) sparseArray.valueAt(i10)).f51130i = true;
            }
        }
    }

    public void D(Runnable runnable, Executor executor) {
        try {
            executor.execute(new j9.u(28, this, runnable));
        } catch (RejectedExecutionException unused) {
            B();
        }
    }

    public void b(ic.f r13, kc.e[][][] r14, int r15, kc.e r16) {
        throw new UnsupportedOperationException("Method not decompiled: c2.b.b(ic.f, kc.e[][][], int, kc.e):void");
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f4495c).start();
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void d(v vVar) {
        ArrayList arrayList = (ArrayList) n();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    tc.u uVar = (tc.u) this.f4494b;
                    z0 z0Var = y0Var.f35429c;
                    int i11 = y0Var.f35427a;
                    AndroidUtilities.runOnUIThread(new ez0(z0Var, uVar, i11, "websocket error: " + z0.a(vVar), 16));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                y0Var.getClass();
            }
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) n();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.getClass();
                } catch (Throwable unused) {
                    y0Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override
    public void g0(e0 e0Var) {
        ((c3.s) this.f4494b).g0(e0Var);
    }

    public int h(int i10, int i11, int i12) {
        boolean b10;
        ec.b bVar = (ec.b) this.f4494b;
        if (this.f4493a) {
            b10 = bVar.b(i11, i10);
        } else {
            b10 = bVar.b(i10, i11);
        }
        if (b10) {
            return (i12 << 1) | 1;
        }
        return i12 << 1;
    }

    public ValueAnimator i(qu quVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new l0(17, this, quVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(zr.f33337f);
        return ofInt;
    }

    public androidx.biometric.e j(ic.f fVar) {
        int i10;
        String str = (String) this.f4494b;
        int length = str.length();
        ec.d dVar = (ec.d) this.f4495c;
        CharsetEncoder[] charsetEncoderArr = dVar.f8596a;
        CharsetEncoder[] charsetEncoderArr2 = dVar.f8596a;
        kc.e[][][] eVarArr = (kc.e[][][]) Array.newInstance(kc.e.class, length + 1, charsetEncoderArr.length, 4);
        b(fVar, eVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    kc.e eVar = eVarArr[i11][i12][i13];
                    if (eVar != null && i11 < length) {
                        b(fVar, eVarArr, i11, eVar);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        for (int i17 = 0; i17 < charsetEncoderArr2.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                kc.e eVar2 = eVarArr[length][i17][i18];
                if (eVar2 != null && (i10 = eVar2.f15067f) < i15) {
                    i14 = i17;
                    i16 = i18;
                    i15 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new androidx.biometric.e(this, fVar, eVarArr[length][i14][i16]);
        }
        throw new Exception(a1.g.p("Internal error: failed to encode \"", str, "\""));
    }

    @Override
    public c3.l0 j0(int i10, int i11) {
        SparseArray sparseArray = (SparseArray) this.d;
        c3.s sVar = (c3.s) this.f4494b;
        if (i11 != 3 && i11 != 5) {
            this.f4493a = true;
        }
        if (i11 != 3) {
            return sVar.j0(i10, i11);
        }
        z3.n nVar = (z3.n) sparseArray.get(i10);
        if (nVar != null) {
            return nVar;
        }
        z3.n nVar2 = new z3.n(sVar.j0(i10, i11), (z3.k) this.f4495c);
        sparseArray.put(i10, nVar2);
        return nVar2;
    }

    public w k(UUID uuid, n2.p pVar) {
        String str;
        String str2 = pVar.f17127b;
        if (this.f4493a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f4495c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = b2.m.f3835f;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (b2.m.d.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.d)) {
                hashMap.putAll((HashMap) this.d);
            }
            return a0.a(((g2.o) this.f4494b).createDataSource(), str2, pVar.f17126a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        u6.l(uri, "The uri must be set.");
        throw new x(new g2.m(uri, 1, null, map, 0L, -1L, null, 0), uri, c2.h, 0L, new IllegalStateException("No license URL"));
    }

    public w l(n2.q qVar) {
        boolean z10;
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), qVar.f17128a, "\"}".getBytes(charset)};
        long j10 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            j10 += bArr[i10].length;
        }
        int i11 = (int) j10;
        if (j10 == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.c(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            byte[] bArr3 = bArr[i13];
            System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
            i12 += bArr3.length;
        }
        g2.h createDataSource = ((g2.o) this.f4494b).createDataSource();
        String str = qVar.f17129b;
        String aVar = h9.a.f11726i.toString();
        String valueOf = String.valueOf(i11);
        e9.s.e("Content-Type", aVar);
        e9.s.e("Content-Length", valueOf);
        return a0.a(createDataSource, str, bArr2, c2.f(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List n() {
        synchronized (((ArrayList) this.f4495c)) {
            try {
                if (!this.f4493a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.f4495c).size());
                ArrayList arrayList2 = (ArrayList) this.f4495c;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    arrayList.add((y0) obj);
                }
                this.d = arrayList;
                this.f4493a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void p() {
        try {
            if (this.f4493a) {
                return;
            }
            Boolean r10 = r();
            this.f4495c = r10;
            if (r10 == null) {
                ((r9.l) ((na.b) this.f4494b)).a(new c3.m(11));
            }
            this.f4493a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean q() {
        boolean h;
        try {
            p();
            Boolean bool = (Boolean) this.f4495c;
            if (bool != null) {
                h = bool.booleanValue();
            } else {
                h = ((FirebaseMessaging) this.d).f7605a.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h;
    }

    public Boolean r() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        l9.h hVar = ((FirebaseMessaging) this.d).f7605a;
        hVar.a();
        Context context = hVar.f16030a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public ic.d s() {
        ic.d dVar = (ic.d) this.d;
        if (dVar != null) {
            return dVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = h(i12, 8, i11);
        }
        int h = h(8, 7, h(8, 8, h(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            h = h(8, i13, h);
        }
        int i14 = ((ec.b) this.f4494b).f8590b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = h(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = h(i17, 8, i10);
        }
        ic.d a2 = ic.d.a(h, i10);
        if (a2 == null) {
            a2 = ic.d.a(h ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw dc.c.a();
    }

    public ic.f t() {
        ic.f fVar = (ic.f) this.f4495c;
        if (fVar != null) {
            return fVar;
        }
        int i10 = ((ec.b) this.f4494b).f8590b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return ic.f.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = h(i16, i15, i14);
            }
        }
        ic.f b10 = ic.f.b(i14);
        if (b10 != null && (b10.f12794a * 4) + 17 == i10) {
            this.f4495c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = h(i17, i18, i13);
            }
        }
        ic.f b11 = ic.f.b(i13);
        if (b11 != null && (b11.f12794a * 4) + 17 == i10) {
            this.f4495c = b11;
            return b11;
        }
        throw dc.c.a();
    }

    public void u() {
        if (((ic.d) this.d) != null) {
            int i10 = m1.j.d(8)[((ic.d) this.d).f12783b];
            ec.b bVar = (ec.b) this.f4494b;
            int i11 = bVar.f8590b;
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (o1.a(i10, i12, i13)) {
                        bVar.a(i13, i12);
                    }
                }
            }
        }
    }

    public void v(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f4495c).cancel();
        }
    }

    public void w() {
        i0 i0Var = (i0) this.d;
        if (!this.f4493a) {
            return;
        }
        i0Var.d(new androidx.fragment.app.d(this, 4));
        this.f4493a = false;
    }

    public boolean x(String str, String str2) {
        synchronized (this) {
            try {
                if (!((y9.d) ((AtomicMarkableReference) this.f4494b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f4494b;
                atomicMarkableReference.set((y9.d) atomicMarkableReference.getReference(), true);
                b5.g gVar = new b5.g(this, 2);
                AtomicReference atomicReference = (AtomicReference) this.f4495c;
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((com.google.firebase.messaging.r) ((s3) this.d).f16398b).v(gVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(ViewGroup viewGroup, g6 g6Var, b5 b5Var, z4 z4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.f4494b) != viewGroup) {
            if (this.f4493a) {
                int i10 = g5.F;
                ((w4) this.d).b(false);
            }
            this.f4494b = viewGroup;
            this.f4495c = (WindowManager) context.getSystemService(WindowManager.class);
            w4 w4Var = new w4(this, context, g6Var, z4Var);
            this.d = w4Var;
            a1 a1Var = new a1(this, 3);
            WeakHashMap weakHashMap = r0.i0.f45241a;
            r0.a0.i(w4Var, a1Var);
        }
        ((w4) this.d).a(b5Var);
        if (!this.f4493a) {
            if (((w4) this.d).getParent() != null) {
                ((WindowManager) this.f4495c).removeView((w4) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.f4495c, (w4) this.d, layoutParams);
            ((WindowManager) this.f4495c).addView((w4) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.f4493a = true;
        }
    }

    public void z(Runnable runnable, Executor executor) {
        synchronized (this.f4494b) {
            try {
                if (this.f4493a) {
                    ((ArrayDeque) this.f4495c).add(new rb.s(runnable, executor));
                    return;
                }
                this.f4493a = true;
                D(runnable, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(c3.s sVar, z3.k kVar) {
        this.f4494b = sVar;
        this.f4495c = kVar;
        this.d = new SparseArray();
    }

    public b(s3 s3Var, boolean z10) {
        this.d = s3Var;
        this.f4495c = new AtomicReference(null);
        this.f4493a = z10;
        this.f4494b = new AtomicMarkableReference(new y9.d(z10 ? 8192 : 1024), false);
    }
}
