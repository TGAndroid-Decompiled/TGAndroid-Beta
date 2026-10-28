package c2;

import a8.te;
import a8.yb;
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
import bi.u6;
import c3.b0;
import c3.j0;
import com.google.firebase.messaging.FirebaseMessaging;
import di.o3;
import e2.i0;
import f9.x1;
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
import m.r3;
import n2.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.Wallet.z0;
import org.telegram.ui.a5;
import org.telegram.ui.f5;
import org.telegram.ui.v4;
import org.telegram.ui.y4;
import r0.a0;
public final class b implements c3.q {
    public static b e;
    public boolean f5929a;
    public Object f5930b;
    public Object f5931c;
    public Object d;

    public b(View view) {
        tu[] tuVarArr = {new tu(), new tu(), new tu()};
        this.f5930b = tuVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5931c = animatorSet;
        animatorSet.playTogether(i(tuVarArr[0], 0, 255, 0, 300), i(tuVarArr[1], 0, 255, 150, 300), i(tuVarArr[2], 0, 255, 300, 300), i(tuVarArr[0], 255, 0, 1000, 400), i(tuVarArr[1], 255, 0, 1000, 400), i(tuVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new o3(this, view));
    }

    public static void a(lc.e[][][] eVarArr, int i10, lc.e eVar) {
        lc.e[] eVarArr2 = eVarArr[i10 + eVar.d][eVar.f16978c];
        jc.e eVar2 = eVar.f16976a;
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
        lc.e eVar3 = eVarArr2[c10];
        if (eVar3 != null && eVar3.f16979f <= eVar.f16979f) {
            return;
        }
        eVarArr2[c10] = eVar;
    }

    public static boolean f(jc.e eVar, char c10) {
        int i10;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return lc.c.c(String.valueOf(c10));
                    }
                    return false;
                }
            } else {
                int[] iArr = lc.c.f16971a;
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

    public static boolean g(a5 a5Var) {
        if (a5Var.f37687a == null && a5Var.f37688b == null) {
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

    public static jc.f o(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                return jc.f.c(40);
            }
            return jc.f.c(26);
        }
        return jc.f.c(9);
    }

    public void A(SpannableString spannableString, int i10) {
        tu[] tuVarArr = (tu[]) this.f5930b;
        int i11 = i10 + 1;
        spannableString.setSpan(tuVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(tuVarArr[1], i11, i12, 0);
        spannableString.setSpan(tuVarArr[2], i12, i10 + 3, 0);
    }

    public void B() {
        synchronized (this.f5930b) {
            try {
                if (((ArrayDeque) this.f5931c).isEmpty()) {
                    this.f5929a = false;
                    return;
                }
                sb.s sVar = (sb.s) ((ArrayDeque) this.f5931c).remove();
                C(sVar.f48116b, sVar.f48115a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C(Runnable runnable, Executor executor) {
        try {
            executor.execute(new k9.u(29, this, runnable));
        } catch (RejectedExecutionException unused) {
            B();
        }
    }

    @Override
    public void D1(b0 b0Var) {
        ((c3.q) this.f5930b).D1(b0Var);
    }

    @Override
    public j0 F1(int i10, int i11) {
        SparseArray sparseArray = (SparseArray) this.d;
        c3.q qVar = (c3.q) this.f5930b;
        if (i11 != 3 && i11 != 5) {
            this.f5929a = true;
        }
        if (i11 != 3) {
            return qVar.F1(i10, i11);
        }
        z3.n nVar = (z3.n) sparseArray.get(i10);
        if (nVar != null) {
            return nVar;
        }
        z3.n nVar2 = new z3.n(qVar.F1(i10, i11), (z3.k) this.f5931c);
        sparseArray.put(i10, nVar2);
        return nVar2;
    }

    @Override
    public void Q0() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((c3.q) this.f5930b).Q0();
        if (this.f5929a) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((z3.n) sparseArray.valueAt(i10)).f52727i = true;
            }
        }
    }

    public void b(jc.f r13, lc.e[][][] r14, int r15, lc.e r16) {
        throw new UnsupportedOperationException("Method not decompiled: c2.b.b(jc.f, lc.e[][][], int, lc.e):void");
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f5931c).start();
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void d(uc.v vVar) {
        ArrayList arrayList = (ArrayList) n();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    uc.u uVar = (uc.u) this.f5930b;
                    z0 z0Var = y0Var.f37516c;
                    int i11 = y0Var.f37514a;
                    AndroidUtilities.runOnUIThread(new as0(z0Var, uVar, i11, "websocket error: " + z0.a(vVar), 18));
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

    public int h(int i10, int i11, int i12) {
        boolean b10;
        fc.b bVar = (fc.b) this.f5930b;
        if (this.f5929a) {
            b10 = bVar.b(i11, i10);
        } else {
            b10 = bVar.b(i10, i11);
        }
        if (b10) {
            return (i12 << 1) | 1;
        }
        return i12 << 1;
    }

    public ValueAnimator i(tu tuVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new bh.b0(16, this, tuVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(ds.f27530f);
        return ofInt;
    }

    public k6.c j(jc.f fVar) {
        int i10;
        String str = (String) this.f5930b;
        int length = str.length();
        fc.d dVar = (fc.d) this.f5931c;
        CharsetEncoder[] charsetEncoderArr = dVar.f10411a;
        CharsetEncoder[] charsetEncoderArr2 = dVar.f10411a;
        lc.e[][][] eVarArr = (lc.e[][][]) Array.newInstance(lc.e.class, length + 1, charsetEncoderArr.length, 4);
        b(fVar, eVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    lc.e eVar = eVarArr[i11][i12][i13];
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
                lc.e eVar2 = eVarArr[length][i17][i18];
                if (eVar2 != null && (i10 = eVar2.f16979f) < i15) {
                    i14 = i17;
                    i16 = i18;
                    i15 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new k6.c(this, fVar, eVarArr[length][i14][i16]);
        }
        throw new Exception(a1.g.p("Internal error: failed to encode \"", str, "\""));
    }

    public n2.v k(UUID uuid, n2.o oVar) {
        String str;
        String str2 = oVar.f18631b;
        if (this.f5929a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f5931c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = b2.n.f3286f;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (b2.n.d.equals(uuid)) {
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
            return te.a(((g2.o) this.f5930b).createDataSource(), str2, oVar.f18630a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        yb.l(uri, "The uri must be set.");
        throw new w(new g2.m(uri, 1, null, map, 0L, -1L, null, 0), uri, x1.h, 0L, new IllegalStateException("No license URL"));
    }

    public n2.v l(n2.p pVar) {
        boolean z10;
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), pVar.f18632a, "\"}".getBytes(charset)};
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
        yb.c(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            byte[] bArr3 = bArr[i13];
            System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
            i12 += bArr3.length;
        }
        g2.h createDataSource = ((g2.o) this.f5930b).createDataSource();
        String str = pVar.f18633b;
        String aVar = i9.a.f13899i.toString();
        String valueOf = String.valueOf(i11);
        f9.o.e("Content-Type", aVar);
        f9.o.e("Content-Length", valueOf);
        return te.a(createDataSource, str, bArr2, x1.f(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List n() {
        synchronized (((ArrayList) this.f5931c)) {
            try {
                if (!this.f5929a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.f5931c).size());
                ArrayList arrayList2 = (ArrayList) this.f5931c;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    arrayList.add((y0) obj);
                }
                this.d = arrayList;
                this.f5929a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void p() {
        try {
            if (this.f5929a) {
                return;
            }
            Boolean r6 = r();
            this.f5931c = r6;
            if (r6 == null) {
                ((s9.m) ((oa.b) this.f5930b)).a(new i(6));
            }
            this.f5929a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean q() {
        boolean h;
        try {
            p();
            Boolean bool = (Boolean) this.f5931c;
            if (bool != null) {
                h = bool.booleanValue();
            } else {
                h = ((FirebaseMessaging) this.d).f7704a.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h;
    }

    public Boolean r() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        m9.h hVar = ((FirebaseMessaging) this.d).f7704a;
        hVar.a();
        Context context = hVar.f18379a;
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

    public jc.d s() {
        jc.d dVar = (jc.d) this.d;
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
        int i14 = ((fc.b) this.f5930b).f10405b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = h(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = h(i17, 8, i10);
        }
        jc.d a2 = jc.d.a(h, i10);
        if (a2 == null) {
            a2 = jc.d.a(h ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw ec.c.a();
    }

    public jc.f t() {
        jc.f fVar = (jc.f) this.f5931c;
        if (fVar != null) {
            return fVar;
        }
        int i10 = ((fc.b) this.f5930b).f10405b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return jc.f.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = h(i16, i15, i14);
            }
        }
        jc.f b10 = jc.f.b(i14);
        if (b10 != null && (b10.f15566a * 4) + 17 == i10) {
            this.f5931c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = h(i17, i18, i13);
            }
        }
        jc.f b11 = jc.f.b(i13);
        if (b11 != null && (b11.f15566a * 4) + 17 == i10) {
            this.f5931c = b11;
            return b11;
        }
        throw ec.c.a();
    }

    public void u() {
        if (((jc.d) this.d) != null) {
            int i10 = m1.j.d(8)[((jc.d) this.d).f15555b];
            fc.b bVar = (fc.b) this.f5930b;
            int i11 = bVar.f10405b;
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (ic.a.a(i10, i12, i13)) {
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
            ((AnimatorSet) this.f5931c).cancel();
        }
    }

    public void w() {
        i0 i0Var = (i0) this.d;
        if (!this.f5929a) {
            return;
        }
        i0Var.d(new u6(this, 8));
        this.f5929a = false;
    }

    public boolean x(String str, String str2) {
        synchronized (this) {
            try {
                if (!((z9.d) ((AtomicMarkableReference) this.f5930b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f5930b;
                atomicMarkableReference.set((z9.d) atomicMarkableReference.getReference(), true);
                c5.g gVar = new c5.g(this, 2);
                AtomicReference atomicReference = (AtomicReference) this.f5931c;
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((com.google.firebase.messaging.q) ((r3) this.d).f17844b).F(gVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var, a5 a5Var, y4 y4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.f5930b) != viewGroup) {
            if (this.f5929a) {
                int i10 = f5.F;
                ((v4) this.d).b(false);
            }
            this.f5930b = viewGroup;
            this.f5931c = (WindowManager) context.getSystemService(WindowManager.class);
            v4 v4Var = new v4(this, context, u6Var, y4Var);
            this.d = v4Var;
            org.telegram.ui.y0 y0Var = new org.telegram.ui.y0(this, 3);
            WeakHashMap weakHashMap = r0.i0.f47143a;
            a0.i(v4Var, y0Var);
        }
        ((v4) this.d).a(a5Var);
        if (!this.f5929a) {
            if (((v4) this.d).getParent() != null) {
                ((WindowManager) this.f5931c).removeView((v4) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.f5931c, (v4) this.d, layoutParams);
            ((WindowManager) this.f5931c).addView((v4) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.f5929a = true;
        }
    }

    public void z(Runnable runnable, Executor executor) {
        synchronized (this.f5930b) {
            try {
                if (this.f5929a) {
                    ((ArrayDeque) this.f5931c).add(new sb.s(runnable, executor));
                    return;
                }
                this.f5929a = true;
                C(runnable, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(c3.q qVar, z3.k kVar) {
        this.f5930b = qVar;
        this.f5931c = kVar;
        this.d = new SparseArray();
    }

    public b(r3 r3Var, boolean z10) {
        this.d = r3Var;
        this.f5931c = new AtomicReference(null);
        this.f5929a = z10;
        this.f5930b = new AtomicMarkableReference(new z9.d(z10 ? 8192 : 1024), false);
    }
}
