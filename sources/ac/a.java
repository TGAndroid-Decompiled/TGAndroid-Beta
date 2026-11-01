package ac;

import ag.p2;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.a0;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c3.b0;
import c3.k0;
import c3.q;
import com.google.firebase.messaging.FirebaseMessaging;
import e9.c2;
import g2.p;
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
import jb.s;
import lc.v;
import lc.w;
import m.p3;
import m1.j;
import n2.o;
import n2.x;
import org.telegram.messenger.i0;
import org.telegram.messenger.jf;
import org.telegram.messenger.u;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Wallet.z0;
import org.telegram.ui.a5;
import org.telegram.ui.io0;
import org.telegram.ui.r4;
import org.telegram.ui.t4;
import org.telegram.ui.v4;
import org.telegram.ui.y0;
import r0.h0;
import r0.z;
import r9.l;
import th.m1;
import v7.t6;
import w7.d0;
import z3.k;
import z3.n;
public final class a implements io0, q {
    public static a e;
    public boolean f362a;
    public Object f363b;
    public Object f364c;
    public Object d;

    public a(View view) {
        u[] uVarArr = {new u(), new u(), new u()};
        this.f363b = uVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f364c = animatorSet;
        animatorSet.playTogether(j(uVarArr[0], 0, 255, 0, 300), j(uVarArr[1], 0, 255, 150, 300), j(uVarArr[2], 0, 255, 300, 300), j(uVarArr[0], 255, 0, 1000, 400), j(uVarArr[1], 255, 0, 1000, 400), j(uVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new g1(this, view));
    }

    public static void a(cc.d[][][] dVarArr, int i10, cc.d dVar) {
        cc.d[] dVarArr2 = dVarArr[i10 + dVar.d][dVar.f4110c];
        f fVar = dVar.f4108a;
        int ordinal = fVar.ordinal();
        char c10 = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        c10 = 0;
                    } else {
                        throw new IllegalStateException("Illegal mode " + fVar);
                    }
                } else {
                    c10 = 3;
                }
            } else {
                c10 = 1;
            }
        }
        cc.d dVar2 = dVarArr2[c10];
        if (dVar2 != null && dVar2.f4111f <= dVar.f4111f) {
            return;
        }
        dVarArr2[c10] = dVar;
    }

    public static boolean g(f fVar, char c10) {
        int i10;
        int ordinal = fVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return cc.b.c(String.valueOf(c10));
                    }
                    return false;
                }
            } else {
                int[] iArr = cc.b.f4103a;
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

    public static boolean h(v4 v4Var) {
        if (v4Var.f42404a == null && v4Var.f42405b == null) {
            return false;
        }
        return true;
    }

    public static a n() {
        if (e == null) {
            e = new Object();
        }
        return e;
    }

    public static h p(int i10) {
        int c10 = j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                return h.c(40);
            }
            return h.c(26);
        }
        return h.c(9);
    }

    public void A(ViewGroup viewGroup, p6 p6Var, v4 v4Var, t4 t4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.f363b) != viewGroup) {
            if (this.f362a) {
                int i10 = a5.F;
                ((r4) this.d).b(false);
            }
            this.f363b = viewGroup;
            this.f364c = (WindowManager) context.getSystemService(WindowManager.class);
            r4 r4Var = new r4(this, context, p6Var, t4Var);
            this.d = r4Var;
            y0 y0Var = new y0(this, 3);
            WeakHashMap weakHashMap = h0.f46134a;
            z.i(r4Var, y0Var);
        }
        ((r4) this.d).a(v4Var);
        if (!this.f362a) {
            if (((r4) this.d).getParent() != null) {
                ((WindowManager) this.f364c).removeView((r4) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            i0.m(layoutParams);
            i0.x3((WindowManager) this.f364c, (r4) this.d, layoutParams);
            ((WindowManager) this.f364c).addView((r4) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.f362a = true;
        }
    }

    public void C(Runnable runnable, Executor executor) {
        synchronized (this.f363b) {
            try {
                if (this.f362a) {
                    ((ArrayDeque) this.f364c).add(new s(runnable, executor));
                    return;
                }
                this.f362a = true;
                F(runnable, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void D(SpannableString spannableString, int i10) {
        u[] uVarArr = (u[]) this.f363b;
        int i11 = i10 + 1;
        spannableString.setSpan(uVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(uVarArr[1], i11, i12, 0);
        spannableString.setSpan(uVarArr[2], i12, i10 + 3, 0);
    }

    public void E() {
        synchronized (this.f363b) {
            try {
                if (((ArrayDeque) this.f364c).isEmpty()) {
                    this.f362a = false;
                    return;
                }
                s sVar = (s) ((ArrayDeque) this.f364c).remove();
                F(sVar.f9812b, sVar.f9811a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void F(Runnable runnable, Executor executor) {
        try {
            executor.execute(new j9.u(21, this, runnable));
        } catch (RejectedExecutionException unused) {
            E();
        }
    }

    @Override
    public void G1(b0 b0Var) {
        ((q) this.f363b).G1(b0Var);
    }

    @Override
    public k0 I1(int i10, int i11) {
        SparseArray sparseArray = (SparseArray) this.d;
        q qVar = (q) this.f363b;
        if (i11 != 3 && i11 != 5) {
            this.f362a = true;
        }
        if (i11 != 3) {
            return qVar.I1(i10, i11);
        }
        n nVar = (n) sparseArray.get(i10);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(qVar.I1(i10, i11), (k) this.f364c);
        sparseArray.put(i10, nVar2);
        return nVar2;
    }

    @Override
    public void Q0() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((q) this.f363b).Q0();
        if (this.f362a) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((n) sparseArray.valueAt(i10)).f54597i = true;
            }
        }
    }

    public void b(ac.h r13, cc.d[][][] r14, int r15, cc.d r16) {
        throw new UnsupportedOperationException("Method not decompiled: ac.a.b(ac.h, cc.d[][][], int, cc.d):void");
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f364c).start();
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void d(w wVar) {
        ArrayList arrayList = (ArrayList) o();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) obj;
            try {
                try {
                    v vVar = (v) this.f363b;
                    z0 z0Var = y0Var.f35409c;
                    int i11 = y0Var.f35407a;
                    i0.g3(new d11(z0Var, vVar, i11, "websocket error: " + z0.a(wVar), 13));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                y0Var.getClass();
            }
        }
    }

    @Override
    public boolean e() {
        return ((b40) this.d).f24619b.e();
    }

    public void f() {
        ArrayList arrayList = (ArrayList) o();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) obj;
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

    public int i(int i10, int i11, int i12) {
        boolean b10;
        wb.b bVar = (wb.b) this.f363b;
        if (this.f362a) {
            b10 = bVar.b(i11, i10);
        } else {
            b10 = bVar.b(i10, i11);
        }
        if (b10) {
            return (i12 << 1) | 1;
        }
        return i12 << 1;
    }

    public ValueAnimator j(u uVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new p2(15, this, uVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(gr.f26523f);
        return ofInt;
    }

    public a0 k(h hVar) {
        int i10;
        String str = (String) this.f363b;
        int length = str.length();
        wb.d dVar = (wb.d) this.f364c;
        CharsetEncoder[] charsetEncoderArr = dVar.f52800a;
        CharsetEncoder[] charsetEncoderArr2 = dVar.f52800a;
        cc.d[][][] dVarArr = (cc.d[][][]) Array.newInstance(cc.d.class, length + 1, charsetEncoderArr.length, 4);
        b(hVar, dVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    cc.d dVar2 = dVarArr[i11][i12][i13];
                    if (dVar2 != null && i11 < length) {
                        b(hVar, dVarArr, i11, dVar2);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        for (int i17 = 0; i17 < charsetEncoderArr2.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                cc.d dVar3 = dVarArr[length][i17][i18];
                if (dVar3 != null && (i10 = dVar3.f4111f) < i15) {
                    i14 = i17;
                    i16 = i18;
                    i15 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new a0(this, hVar, dVarArr[length][i14][i16]);
        }
        throw new Exception(a1.g.n("Internal error: failed to encode \"", str, "\""));
    }

    public n2.w l(UUID uuid, o oVar) {
        String str;
        String str2 = oVar.f13469b;
        if (this.f362a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f364c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = b2.n.f2122f;
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
            return d0.a(((p) this.f363b).createDataSource(), str2, oVar.f13468a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        t6.l(uri, "The uri must be set.");
        throw new x(new g2.n(uri, 1, null, map, 0L, -1L, null, 0), uri, c2.h, 0L, new IllegalStateException("No license URL"));
    }

    public n2.w m(n2.p pVar) {
        boolean z10;
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), pVar.f13470a, "\"}".getBytes(charset)};
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
        t6.d(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            byte[] bArr3 = bArr[i13];
            System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
            i12 += bArr3.length;
        }
        g2.h createDataSource = ((p) this.f363b).createDataSource();
        String str = pVar.f13471b;
        String aVar = h9.a.f7643i.toString();
        String valueOf = String.valueOf(i11);
        e9.s.e("Content-Type", aVar);
        e9.s.e("Content-Length", valueOf);
        return d0.a(createDataSource, str, bArr2, c2.f(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List o() {
        synchronized (((ArrayList) this.f364c)) {
            try {
                if (!this.f362a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.f364c).size());
                ArrayList arrayList2 = (ArrayList) this.f364c;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    arrayList.add((org.telegram.ui.Wallet.y0) obj);
                }
                this.d = arrayList;
                this.f362a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void q() {
        try {
            if (this.f362a) {
                return;
            }
            Boolean s10 = s();
            this.f364c = s10;
            if (s10 == null) {
                ((l) ((na.b) this.f363b)).a(new m1(25));
            }
            this.f362a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean r() {
        boolean h;
        try {
            q();
            Boolean bool = (Boolean) this.f364c;
            if (bool != null) {
                h = bool.booleanValue();
            } else {
                h = ((FirebaseMessaging) this.d).f5590a.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h;
    }

    public Boolean s() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        l9.h hVar = ((FirebaseMessaging) this.d).f5590a;
        hVar.a();
        Context context = hVar.f11708a;
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

    public e t() {
        e eVar = (e) this.d;
        if (eVar != null) {
            return eVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = i(i12, 8, i11);
        }
        int i13 = i(8, 7, i(8, 8, i(7, 8, i11)));
        for (int i14 = 5; i14 >= 0; i14--) {
            i13 = i(8, i14, i13);
        }
        int i15 = ((wb.b) this.f363b).f52794b;
        int i16 = i15 - 7;
        for (int i17 = i15 - 1; i17 >= i16; i17--) {
            i10 = i(8, i17, i10);
        }
        for (int i18 = i15 - 8; i18 < i15; i18++) {
            i10 = i(i18, 8, i10);
        }
        e a2 = e.a(i13, i10);
        if (a2 == null) {
            a2 = e.a(i13 ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw vb.c.a();
    }

    public h u() {
        h hVar = (h) this.f364c;
        if (hVar != null) {
            return hVar;
        }
        int i10 = ((wb.b) this.f363b).f52794b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return h.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = i(i16, i15, i14);
            }
        }
        h b10 = h.b(i14);
        if (b10 != null && (b10.f388a * 4) + 17 == i10) {
            this.f364c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = i(i17, i18, i13);
            }
        }
        h b11 = h.b(i13);
        if (b11 != null && (b11.f388a * 4) + 17 == i10) {
            this.f364c = b11;
            return b11;
        }
        throw vb.c.a();
    }

    @Override
    public void u0(int i10, boolean z10, boolean z11) {
        String str;
        ArrayList arrayList = (ArrayList) this.f364c;
        b40 b40Var = (b40) this.d;
        HashMap hashMap = (HashMap) this.f363b;
        if (!hashMap.isEmpty() && b40Var.f24619b != null && !this.f362a && !z10) {
            this.f362a = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                if (obj instanceof jf) {
                    jf jfVar = (jf) obj;
                    String str2 = jfVar.h;
                    if (str2 != null) {
                        obj2.f17850c = str2;
                    } else {
                        obj2.f17856l = jfVar;
                    }
                    obj2.f17855k = jfVar.f14617s;
                    obj2.e = jfVar.f14604c;
                    CharSequence charSequence = jfVar.I;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    obj2.d = str;
                    obj2.f17853i = jfVar.f14612n;
                    obj2.f17854j = jfVar.f14616r;
                    obj2.h = jfVar.f14621x;
                }
            }
            b40.a(b40Var, false, arrayList2);
        }
    }

    public void v() {
        if (((e) this.d) != null) {
            int i10 = j.d(8)[((e) this.d).f374b];
            wb.b bVar = (wb.b) this.f363b;
            int i11 = bVar.f52794b;
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (a1.g.b(i10, i12, i13)) {
                        bVar.a(i13, i12);
                    }
                }
            }
        }
    }

    public void w(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f364c).cancel();
        }
    }

    public void x() {
        e2.i0 i0Var = (e2.i0) this.d;
        if (!this.f362a) {
            return;
        }
        i0Var.d(new a3.d(this, 25));
        this.f362a = false;
    }

    public boolean z(String str, String str2) {
        synchronized (this) {
            try {
                if (!((y9.d) ((AtomicMarkableReference) this.f363b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f363b;
                atomicMarkableReference.set((y9.d) atomicMarkableReference.getReference(), true);
                b5.g gVar = new b5.g(this, 2);
                AtomicReference atomicReference = (AtomicReference) this.f364c;
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((xa.n) ((p3) this.d).f12520b).Y(gVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a(q qVar, k kVar) {
        this.f363b = qVar;
        this.f364c = kVar;
        this.d = new SparseArray();
    }

    public a(p3 p3Var, boolean z10) {
        this.d = p3Var;
        this.f364c = new AtomicReference(null);
        this.f362a = z10;
        this.f363b = new AtomicMarkableReference(new y9.d(z10 ? 8192 : 1024), false);
    }

    @Override
    public void h0() {
    }

    @Override
    public void y() {
    }

    @Override
    public void B(Editable editable) {
    }
}
