package ab;

import a8.ja;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c8.sb;
import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.FirebaseMessaging;
import fi.c3;
import h9.x1;
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
import m.o3;
import org.telegram.messenger.jf;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.b5;
import org.telegram.ui.r4;
import org.telegram.ui.u4;
import org.telegram.ui.w0;
import org.telegram.ui.w4;
import org.telegram.ui.xm0;
public final class q implements f3.q, xm0 {
    public static q f987e;
    public boolean f988a;
    public Object f989b;
    public Object f990c;
    public Object d;

    public q(View view) {
        org.telegram.messenger.t[] tVarArr = {new org.telegram.messenger.t(), new org.telegram.messenger.t(), new org.telegram.messenger.t()};
        this.f989b = tVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f990c = animatorSet;
        animatorSet.playTogether(k(tVarArr[0], 0, 255, 0, 300), k(tVarArr[1], 0, 255, 150, 300), k(tVarArr[2], 0, 255, 300, 300), k(tVarArr[0], 255, 0, 1000, 400), k(tVarArr[1], 255, 0, 1000, 400), k(tVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new c3(this, view));
    }

    public static void a(ic.d[][][] dVarArr, int i7, ic.d dVar) {
        ic.d[] dVarArr2 = dVarArr[i7 + dVar.d][dVar.f15902c];
        gc.e eVar = dVar.f15900a;
        int ordinal = eVar.ordinal();
        char c10 = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        c10 = 0;
                    } else {
                        throw new IllegalStateException("Illegal mode " + eVar);
                    }
                } else {
                    c10 = 3;
                }
            } else {
                c10 = 1;
            }
        }
        ic.d dVar2 = dVarArr2[c10];
        if (dVar2 != null && dVar2.f15904f <= dVar.f15904f) {
            return;
        }
        dVarArr2[c10] = dVar;
    }

    public static boolean h(gc.e eVar, char c10) {
        int i7;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return ic.b.c(String.valueOf(c10));
                    }
                    return false;
                }
            } else {
                int[] iArr = ic.b.f15895a;
                if (c10 < '`') {
                    i7 = iArr[c10];
                } else {
                    i7 = -1;
                }
                if (i7 == -1) {
                    return false;
                }
            }
        } else if (c10 < '0' || c10 > '9') {
            return false;
        }
        return true;
    }

    public static boolean i(w4 w4Var) {
        if (w4Var.f52390a == null && w4Var.f52391b == null) {
            return false;
        }
        return true;
    }

    public static q o() {
        if (f987e == null) {
            f987e = new Object();
        }
        return f987e;
    }

    public static gc.f q(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                return gc.f.c(40);
            }
            return gc.f.c(26);
        }
        return gc.f.c(9);
    }

    public boolean B(String str, String str2) {
        synchronized (this) {
            try {
                if (!((ca.e) ((AtomicMarkableReference) this.f989b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f989b;
                atomicMarkableReference.set((ca.e) atomicMarkableReference.getReference(), true);
                a3.f fVar = new a3.f(this, 27);
                AtomicReference atomicReference = (AtomicReference) this.f990c;
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((ba.e) ((o3) this.d).f19795b).f3091b.a(fVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C(boolean z10) {
        if (!((boolean[]) this.f990c)[0]) {
            ji.e eVar = (ji.e) ((androidx.activity.n) this.d).d;
            eVar.f17475e3 = z10;
            eVar.invalidate();
        }
    }

    public void D(ViewGroup viewGroup, e6 e6Var, w4 w4Var, u4 u4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.f989b) != viewGroup) {
            if (this.f988a) {
                int i7 = b5.G;
                ((r4) this.d).b(false);
            }
            this.f989b = viewGroup;
            this.f990c = (WindowManager) context.getSystemService(WindowManager.class);
            r4 r4Var = new r4(this, context, e6Var, u4Var);
            this.d = r4Var;
            w0 w0Var = new w0(this, 3);
            WeakHashMap weakHashMap = r0.i0.f55671a;
            r0.a0.i(r4Var, w0Var);
        }
        ((r4) this.d).a(w4Var);
        if (!this.f988a) {
            if (((r4) this.d).getParent() != null) {
                ((WindowManager) this.f990c).removeView((r4) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            org.telegram.messenger.g0.m(layoutParams);
            org.telegram.messenger.g0.x3((WindowManager) this.f990c, (r4) this.d, layoutParams);
            ((WindowManager) this.f990c).addView((r4) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.f988a = true;
        }
    }

    public void E(Runnable runnable, Executor executor) {
        synchronized (this.f989b) {
            try {
                if (this.f988a) {
                    ((ArrayDeque) this.f990c).add(new pb.t(runnable, executor));
                    return;
                }
                this.f988a = true;
                H(runnable, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void F(SpannableString spannableString, int i7) {
        org.telegram.messenger.t[] tVarArr = (org.telegram.messenger.t[]) this.f989b;
        int i10 = i7 + 1;
        spannableString.setSpan(tVarArr[0], i7, i10, 0);
        int i11 = i7 + 2;
        spannableString.setSpan(tVarArr[1], i10, i11, 0);
        spannableString.setSpan(tVarArr[2], i11, i7 + 3, 0);
    }

    public void G() {
        synchronized (this.f989b) {
            try {
                if (((ArrayDeque) this.f990c).isEmpty()) {
                    this.f988a = false;
                    return;
                }
                pb.t tVar = (pb.t) ((ArrayDeque) this.f990c).remove();
                H(tVar.f54979b, tVar.f54978a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void H(Runnable runnable, Executor executor) {
        try {
            executor.execute(new pb.l(3, this, runnable));
        } catch (RejectedExecutionException unused) {
            G();
        }
    }

    public void b(gc.f r13, ic.d[][][] r14, int r15, ic.d r16) {
        throw new UnsupportedOperationException("Method not decompiled: ab.q.b(gc.f, ic.d[][][], int, ic.d):void");
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f990c).start();
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void d(rc.v vVar) {
        ArrayList arrayList = (ArrayList) p();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    rc.u uVar = (rc.u) this.f989b;
                    y0 y0Var = x0Var.f44673c;
                    int i10 = x0Var.f44671a;
                    org.telegram.messenger.g0.h3(new sp0(y0Var, uVar, i10, "websocket error: " + y0.a(vVar), 18));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                x0Var.getClass();
            }
        }
    }

    @Override
    public void d1() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((f3.q) this.f989b).d1();
        if (this.f988a) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                ((c4.o) sparseArray.valueAt(i7)).f4124i = true;
            }
        }
    }

    @Override
    public f3.i0 d2(int i7, int i10) {
        SparseArray sparseArray = (SparseArray) this.d;
        f3.q qVar = (f3.q) this.f989b;
        if (i10 != 3 && i10 != 5) {
            this.f988a = true;
        }
        if (i10 != 3) {
            return qVar.d2(i7, i10);
        }
        c4.o oVar = (c4.o) sparseArray.get(i7);
        if (oVar != null) {
            return oVar;
        }
        c4.o oVar2 = new c4.o(qVar.d2(i7, i10), (c4.k) this.f990c);
        sparseArray.put(i7, oVar2);
        return oVar2;
    }

    @Override
    public boolean e() {
        return ((m30) this.d).f37041b.e();
    }

    @Override
    public void f(f3.b0 b0Var) {
        ((f3.q) this.f989b).f(b0Var);
    }

    public void g() {
        ArrayList arrayList = (ArrayList) p();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    x0Var.getClass();
                } catch (Throwable unused) {
                    x0Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public int j(int i7, int i10, int i11) {
        boolean b10;
        cc.b bVar = (cc.b) this.f989b;
        if (this.f988a) {
            b10 = bVar.b(i10, i7);
        } else {
            b10 = bVar.b(i7, i10);
        }
        if (b10) {
            return (i11 << 1) | 1;
        }
        return i11 << 1;
    }

    public ValueAnimator k(org.telegram.messenger.t tVar, int i7, int i10, int i11, int i12) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i7, i10);
        ofInt.addUpdateListener(new ch.v(15, this, tVar));
        ofInt.setDuration(i12);
        ofInt.setStartDelay(i11);
        ofInt.setInterpolator(er.f34420f);
        return ofInt;
    }

    public h6.m l(gc.f fVar) {
        int i7;
        String str = (String) this.f989b;
        int length = str.length();
        cc.f fVar2 = (cc.f) this.f990c;
        CharsetEncoder[] charsetEncoderArr = fVar2.f4886a;
        CharsetEncoder[] charsetEncoderArr2 = fVar2.f4886a;
        ic.d[][][] dVarArr = (ic.d[][][]) Array.newInstance(ic.d.class, length + 1, charsetEncoderArr.length, 4);
        b(fVar, dVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < charsetEncoderArr2.length; i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    ic.d dVar = dVarArr[i10][i11][i12];
                    if (dVar != null && i10 < length) {
                        b(fVar, dVarArr, i10, dVar);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < charsetEncoderArr2.length; i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                ic.d dVar2 = dVarArr[length][i16][i17];
                if (dVar2 != null && (i7 = dVar2.f15904f) < i14) {
                    i13 = i16;
                    i15 = i17;
                    i14 = i7;
                }
            }
        }
        if (i13 >= 0) {
            return new h6.m(this, fVar, dVarArr[length][i13][i15]);
        }
        throw new Exception(a8.p0.p("Internal error: failed to encode \"", str, "\""));
    }

    public q2.w m(UUID uuid, q2.p pVar) {
        String str;
        String str2 = pVar.f55191b;
        if (this.f988a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f990c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = e2.l.f10178f;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (e2.l.d.equals(uuid)) {
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
            return sb.a(((j2.o) this.f989b).createDataSource(), str2, pVar.f55190a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        ja.k(uri, "The uri must be set.");
        throw new q2.x(new j2.m(uri, 1, null, map, 0L, -1L, null, 0), uri, x1.h, 0L, new IllegalStateException("No license URL"));
    }

    public q2.w n(q2.q qVar) {
        boolean z10;
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), qVar.f55192a, "\"}".getBytes(charset)};
        long j3 = 0;
        for (int i7 = 0; i7 < 3; i7++) {
            j3 += bArr[i7].length;
        }
        int i10 = (int) j3;
        if (j3 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.d(j3, "the total number of elements (%s) in the arrays must fit in an int", z10);
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            byte[] bArr3 = bArr[i12];
            System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
            i11 += bArr3.length;
        }
        j2.h createDataSource = ((j2.o) this.f989b).createDataSource();
        String str = qVar.f55193b;
        String aVar = k9.a.f17796i.toString();
        String valueOf = String.valueOf(i10);
        h9.o.f("Content-Type", aVar);
        h9.o.f("Content-Length", valueOf);
        return sb.a(createDataSource, str, bArr2, x1.g(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List p() {
        synchronized (((ArrayList) this.f990c)) {
            try {
                if (!this.f988a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.f990c).size());
                ArrayList arrayList2 = (ArrayList) this.f990c;
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    arrayList.add((x0) obj);
                }
                this.d = arrayList;
                this.f988a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void r() {
        try {
            if (this.f988a) {
                return;
            }
            Boolean t6 = t();
            this.f990c = t6;
            if (t6 == null) {
                ((u9.k) ((ra.b) this.f989b)).a(new a3.l(9));
            }
            this.f988a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean s() {
        boolean h;
        try {
            r();
            Boolean bool = (Boolean) this.f990c;
            if (bool != null) {
                h = bool.booleanValue();
            } else {
                h = ((FirebaseMessaging) this.d).f7276a.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h;
    }

    public Boolean t() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        o9.g gVar = ((FirebaseMessaging) this.d).f7276a;
        gVar.a();
        Context context = gVar.f21397a;
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

    @Override
    public void t0(int i7, boolean z10, boolean z11) {
        String str;
        ArrayList arrayList = (ArrayList) this.f990c;
        m30 m30Var = (m30) this.d;
        HashMap hashMap = (HashMap) this.f989b;
        if (!hashMap.isEmpty() && m30Var.f37041b != null && !this.f988a && !z10) {
            this.f988a = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                if (obj instanceof jf) {
                    jf jfVar = (jf) obj;
                    String str2 = jfVar.h;
                    if (str2 != null) {
                        obj2.f23189c = str2;
                    } else {
                        obj2.f23196l = jfVar;
                    }
                    obj2.f23195k = jfVar.f27723s;
                    obj2.f23190e = jfVar.f27709c;
                    CharSequence charSequence = jfVar.I;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    obj2.d = str;
                    obj2.f23193i = jfVar.f27718n;
                    obj2.f23194j = jfVar.f27722r;
                    obj2.h = jfVar.f27727x;
                }
            }
            m30.a(m30Var, false, arrayList2);
        }
    }

    public gc.d u() {
        gc.d dVar = (gc.d) this.d;
        if (dVar != null) {
            return dVar;
        }
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 = j(i11, 8, i10);
        }
        int j3 = j(8, 7, j(8, 8, j(7, 8, i10)));
        for (int i12 = 5; i12 >= 0; i12--) {
            j3 = j(8, i12, j3);
        }
        int i13 = ((cc.b) this.f989b).f4870b;
        int i14 = i13 - 7;
        for (int i15 = i13 - 1; i15 >= i14; i15--) {
            i7 = j(8, i15, i7);
        }
        for (int i16 = i13 - 8; i16 < i13; i16++) {
            i7 = j(i16, 8, i7);
        }
        gc.d a10 = gc.d.a(j3, i7);
        if (a10 == null) {
            a10 = gc.d.a(j3 ^ 21522, i7 ^ 21522);
        }
        this.d = a10;
        if (a10 != null) {
            return a10;
        }
        throw bc.c.a();
    }

    public gc.f v() {
        gc.f fVar = (gc.f) this.f990c;
        if (fVar != null) {
            return fVar;
        }
        int i7 = ((cc.b) this.f989b).f4870b;
        int i10 = (i7 - 17) / 4;
        if (i10 <= 6) {
            return gc.f.c(i10);
        }
        int i11 = i7 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i7 - 9; i15 >= i11; i15--) {
                i13 = j(i15, i14, i13);
            }
        }
        gc.f b10 = gc.f.b(i13);
        if (b10 != null && (b10.f13156a * 4) + 17 == i7) {
            this.f990c = b10;
            return b10;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = i7 - 9; i17 >= i11; i17--) {
                i12 = j(i16, i17, i12);
            }
        }
        gc.f b11 = gc.f.b(i12);
        if (b11 != null && (b11.f13156a * 4) + 17 == i7) {
            this.f990c = b11;
            return b11;
        }
        throw bc.c.a();
    }

    public void w() {
        if (((gc.d) this.d) != null) {
            int i7 = p1.g.d(8)[((gc.d) this.d).f13142b];
            cc.b bVar = (cc.b) this.f989b;
            int i10 = bVar.f4870b;
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (e2.b(i7, i11, i12)) {
                        bVar.a(i12, i11);
                    }
                }
            }
        }
    }

    public void x(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f990c).cancel();
        }
    }

    public void z() {
        h2.i0 i0Var = (h2.i0) this.d;
        if (!this.f988a) {
            return;
        }
        i0Var.d(new ch.w(this, 26));
        this.f988a = false;
    }

    public q(f3.q qVar, c4.k kVar) {
        this.f989b = qVar;
        this.f990c = kVar;
        this.d = new SparseArray();
    }

    public q(o3 o3Var, boolean z10) {
        this.d = o3Var;
        this.f990c = new AtomicReference(null);
        this.f988a = z10;
        this.f989b = new AtomicMarkableReference(new ca.e(z10 ? 8192 : 1024), false);
    }

    @Override
    public void d0() {
    }

    @Override
    public void y() {
    }

    @Override
    public void A(Editable editable) {
    }
}
