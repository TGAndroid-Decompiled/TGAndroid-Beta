package ab;

import a8.ia;
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
import bi.ab;
import bi.de;
import c8.rb;
import com.google.firebase.messaging.FirebaseMessaging;
import di.h3;
import di.s7;
import h9.y1;
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
import m.q3;
import org.telegram.messenger.kf;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.Wallet.z0;
import org.telegram.ui.b5;
import org.telegram.ui.fx;
import org.telegram.ui.r4;
import org.telegram.ui.u4;
import org.telegram.ui.w0;
import org.telegram.ui.w4;
import org.telegram.ui.wm0;
public final class q implements f3.q, wm0 {
    public static q f988e;
    public boolean f989a;
    public Object f990b;
    public Object f991c;
    public Object d;

    public q(View view) {
        org.telegram.messenger.t[] tVarArr = {new org.telegram.messenger.t(), new org.telegram.messenger.t(), new org.telegram.messenger.t()};
        this.f990b = tVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f991c = animatorSet;
        animatorSet.playTogether(k(tVarArr[0], 0, 255, 0, 300), k(tVarArr[1], 0, 255, 150, 300), k(tVarArr[2], 0, 255, 300, 300), k(tVarArr[0], 255, 0, 1000, 400), k(tVarArr[1], 255, 0, 1000, 400), k(tVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new h3(this, view));
    }

    public static void a(ic.d[][][] dVarArr, int i7, ic.d dVar) {
        ic.d[] dVarArr2 = dVarArr[i7 + dVar.d][dVar.f15445c];
        gc.d dVar2 = dVar.f15443a;
        int ordinal = dVar2.ordinal();
        char c10 = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        c10 = 0;
                    } else {
                        throw new IllegalStateException("Illegal mode " + dVar2);
                    }
                } else {
                    c10 = 3;
                }
            } else {
                c10 = 1;
            }
        }
        ic.d dVar3 = dVarArr2[c10];
        if (dVar3 != null && dVar3.f15447f <= dVar.f15447f) {
            return;
        }
        dVarArr2[c10] = dVar;
    }

    public static boolean h(gc.d dVar, char c10) {
        int i7;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return ic.b.c(String.valueOf(c10));
                    }
                    return false;
                }
            } else {
                int[] iArr = ic.b.f15438a;
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
        if (w4Var.f50859a == null && w4Var.f50860b == null) {
            return false;
        }
        return true;
    }

    public static q o() {
        if (f988e == null) {
            f988e = new Object();
        }
        return f988e;
    }

    public static gc.e q(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                return gc.e.c(40);
            }
            return gc.e.c(26);
        }
        return gc.e.c(9);
    }

    public void C(ViewGroup viewGroup, f6 f6Var, w4 w4Var, u4 u4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.f990b) != viewGroup) {
            if (this.f989a) {
                int i7 = b5.F;
                ((r4) this.d).b(false);
            }
            this.f990b = viewGroup;
            this.f991c = (WindowManager) context.getSystemService(WindowManager.class);
            r4 r4Var = new r4(this, context, f6Var, u4Var);
            this.d = r4Var;
            w0 w0Var = new w0(this, 3);
            WeakHashMap weakHashMap = r0.i0.f54191a;
            r0.a0.i(r4Var, w0Var);
        }
        ((r4) this.d).a(w4Var);
        if (!this.f989a) {
            if (((r4) this.d).getParent() != null) {
                ((WindowManager) this.f991c).removeView((r4) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            org.telegram.messenger.g0.m(layoutParams);
            org.telegram.messenger.g0.y3((WindowManager) this.f991c, (r4) this.d, layoutParams);
            ((WindowManager) this.f991c).addView((r4) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.f989a = true;
        }
    }

    public void D(Runnable runnable, Executor executor) {
        synchronized (this.f990b) {
            try {
                if (this.f989a) {
                    ((ArrayDeque) this.f991c).add(new pb.s(runnable, executor));
                    return;
                }
                this.f989a = true;
                G(runnable, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(SpannableString spannableString, int i7) {
        org.telegram.messenger.t[] tVarArr = (org.telegram.messenger.t[]) this.f990b;
        int i10 = i7 + 1;
        spannableString.setSpan(tVarArr[0], i7, i10, 0);
        int i11 = i7 + 2;
        spannableString.setSpan(tVarArr[1], i10, i11, 0);
        spannableString.setSpan(tVarArr[2], i11, i7 + 3, 0);
    }

    public void F() {
        synchronized (this.f990b) {
            try {
                if (((ArrayDeque) this.f991c).isEmpty()) {
                    this.f989a = false;
                    return;
                }
                pb.s sVar = (pb.s) ((ArrayDeque) this.f991c).remove();
                G(sVar.f53560b, sVar.f53559a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void G(Runnable runnable, Executor executor) {
        try {
            executor.execute(new fx(this, runnable, false, 4));
        } catch (RejectedExecutionException unused) {
            F();
        }
    }

    @Override
    public f3.j0 O1(int i7, int i10) {
        SparseArray sparseArray = (SparseArray) this.d;
        f3.q qVar = (f3.q) this.f990b;
        if (i10 != 3 && i10 != 5) {
            this.f989a = true;
        }
        if (i10 != 3) {
            return qVar.O1(i7, i10);
        }
        c4.o oVar = (c4.o) sparseArray.get(i7);
        if (oVar != null) {
            return oVar;
        }
        c4.o oVar2 = new c4.o(qVar.O1(i7, i10), (c4.k) this.f991c);
        sparseArray.put(i7, oVar2);
        return oVar2;
    }

    @Override
    public void U0() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((f3.q) this.f990b).U0();
        if (this.f989a) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                ((c4.o) sparseArray.valueAt(i7)).f5302i = true;
            }
        }
    }

    public void b(gc.e r13, ic.d[][][] r14, int r15, ic.d r16) {
        throw new UnsupportedOperationException("Method not decompiled: ab.q.b(gc.e, ic.d[][][], int, ic.d):void");
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f991c).start();
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
            y0 y0Var = (y0) obj;
            try {
                try {
                    rc.u uVar = (rc.u) this.f990b;
                    z0 z0Var = y0Var.f43381c;
                    int i10 = y0Var.f43379a;
                    org.telegram.messenger.g0.h3(new pp0(z0Var, uVar, i10, "websocket error: " + z0.a(vVar), 18));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                y0Var.getClass();
            }
        }
    }

    @Override
    public boolean e() {
        return ((j30) this.d).f34880b.e();
    }

    @Override
    public void f(f3.c0 c0Var) {
        ((f3.q) this.f990b).f(c0Var);
    }

    public void g() {
        ArrayList arrayList = (ArrayList) p();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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

    public int j(int i7, int i10, int i11) {
        boolean b10;
        cc.b bVar = (cc.b) this.f990b;
        if (this.f989a) {
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
        ofInt.addUpdateListener(new de(16, this, tVar));
        ofInt.setDuration(i12);
        ofInt.setStartDelay(i11);
        ofInt.setInterpolator(xq.f40366f);
        return ofInt;
    }

    public h6.m l(gc.e eVar) {
        int i7;
        String str = (String) this.f990b;
        int length = str.length();
        cc.f fVar = (cc.f) this.f991c;
        CharsetEncoder[] charsetEncoderArr = fVar.f6061a;
        CharsetEncoder[] charsetEncoderArr2 = fVar.f6061a;
        ic.d[][][] dVarArr = (ic.d[][][]) Array.newInstance(ic.d.class, length + 1, charsetEncoderArr.length, 4);
        b(eVar, dVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < charsetEncoderArr2.length; i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    ic.d dVar = dVarArr[i10][i11][i12];
                    if (dVar != null && i10 < length) {
                        b(eVar, dVarArr, i10, dVar);
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
                if (dVar2 != null && (i7 = dVar2.f15447f) < i14) {
                    i13 = i16;
                    i15 = i17;
                    i14 = i7;
                }
            }
        }
        if (i13 >= 0) {
            return new h6.m(this, eVar, dVarArr[length][i13][i15]);
        }
        throw new Exception(a8.p0.p("Internal error: failed to encode \"", str, "\""));
    }

    public q2.v m(UUID uuid, q2.o oVar) {
        String str;
        String str2 = oVar.f53743b;
        if (this.f989a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f991c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = e2.l.f10342f;
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
            return rb.a(((j2.p) this.f990b).createDataSource(), str2, oVar.f53742a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        ia.k(uri, "The uri must be set.");
        throw new q2.w(new j2.m(uri, 1, null, map, 0L, -1L, null, 0), uri, y1.h, 0L, new IllegalStateException("No license URL"));
    }

    public q2.v n(q2.p pVar) {
        boolean z9;
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), pVar.f53744a, "\"}".getBytes(charset)};
        long j3 = 0;
        for (int i7 = 0; i7 < 3; i7++) {
            j3 += bArr[i7].length;
        }
        int i10 = (int) j3;
        if (j3 == i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.d(j3, "the total number of elements (%s) in the arrays must fit in an int", z9);
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            byte[] bArr3 = bArr[i12];
            System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
            i11 += bArr3.length;
        }
        j2.h createDataSource = ((j2.p) this.f990b).createDataSource();
        String str = pVar.f53745b;
        String aVar = k9.a.f17237i.toString();
        String valueOf = String.valueOf(i10);
        h9.o.f("Content-Type", aVar);
        h9.o.f("Content-Length", valueOf);
        return rb.a(createDataSource, str, bArr2, y1.g(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List p() {
        synchronized (((ArrayList) this.f991c)) {
            try {
                if (!this.f989a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.f991c).size());
                ArrayList arrayList2 = (ArrayList) this.f991c;
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    arrayList.add((y0) obj);
                }
                this.d = arrayList;
                this.f989a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void r() {
        try {
            if (this.f989a) {
                return;
            }
            Boolean t6 = t();
            this.f991c = t6;
            if (t6 == null) {
                ((u9.l) ((ra.b) this.f990b)).a(new a3.l(9));
            }
            this.f989a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean s() {
        boolean h;
        try {
            r();
            Boolean bool = (Boolean) this.f991c;
            if (bool != null) {
                h = bool.booleanValue();
            } else {
                h = ((FirebaseMessaging) this.d).f7889a.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h;
    }

    public Boolean t() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        o9.g gVar = ((FirebaseMessaging) this.d).f7889a;
        gVar.a();
        Context context = gVar.f20875a;
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

    public gc.c u() {
        gc.c cVar = (gc.c) this.d;
        if (cVar != null) {
            return cVar;
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
        int i13 = ((cc.b) this.f990b).f6045b;
        int i14 = i13 - 7;
        for (int i15 = i13 - 1; i15 >= i14; i15--) {
            i7 = j(8, i15, i7);
        }
        for (int i16 = i13 - 8; i16 < i13; i16++) {
            i7 = j(i16, 8, i7);
        }
        gc.c a10 = gc.c.a(j3, i7);
        if (a10 == null) {
            a10 = gc.c.a(j3 ^ 21522, i7 ^ 21522);
        }
        this.d = a10;
        if (a10 != null) {
            return a10;
        }
        throw bc.c.a();
    }

    public gc.e v() {
        gc.e eVar = (gc.e) this.f991c;
        if (eVar != null) {
            return eVar;
        }
        int i7 = ((cc.b) this.f990b).f6045b;
        int i10 = (i7 - 17) / 4;
        if (i10 <= 6) {
            return gc.e.c(i10);
        }
        int i11 = i7 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i7 - 9; i15 >= i11; i15--) {
                i13 = j(i15, i14, i13);
            }
        }
        gc.e b10 = gc.e.b(i13);
        if (b10 != null && (b10.f13812a * 4) + 17 == i7) {
            this.f991c = b10;
            return b10;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = i7 - 9; i17 >= i11; i17--) {
                i12 = j(i16, i17, i12);
            }
        }
        gc.e b11 = gc.e.b(i12);
        if (b11 != null && (b11.f13812a * 4) + 17 == i7) {
            this.f991c = b11;
            return b11;
        }
        throw bc.c.a();
    }

    @Override
    public void v0(int i7, boolean z9, boolean z10) {
        String str;
        ArrayList arrayList = (ArrayList) this.f991c;
        j30 j30Var = (j30) this.d;
        HashMap hashMap = (HashMap) this.f990b;
        if (!hashMap.isEmpty() && j30Var.f34880b != null && !this.f989a && !z9) {
            this.f989a = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                if (obj instanceof kf) {
                    kf kfVar = (kf) obj;
                    String str2 = kfVar.h;
                    if (str2 != null) {
                        obj2.f22512c = str2;
                    } else {
                        obj2.f22519l = kfVar;
                    }
                    obj2.f22518k = kfVar.f26860s;
                    obj2.f22513e = kfVar.f26846c;
                    CharSequence charSequence = kfVar.I;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    obj2.d = str;
                    obj2.f22516i = kfVar.f26855n;
                    obj2.f22517j = kfVar.f26859r;
                    obj2.h = kfVar.f26864x;
                }
            }
            j30.a(j30Var, false, arrayList2);
        }
    }

    public void w() {
        if (((gc.c) this.d) != null) {
            int i7 = p1.g.d(8)[((gc.c) this.d).f13798b];
            cc.b bVar = (cc.b) this.f990b;
            int i10 = bVar.f6045b;
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (com.google.android.recaptcha.internal.a.b(i7, i11, i12)) {
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
            ((AnimatorSet) this.f991c).cancel();
        }
    }

    public void y() {
        h2.i0 i0Var = (h2.i0) this.d;
        if (!this.f989a) {
            return;
        }
        i0Var.d(new s7(this, 10));
        this.f989a = false;
    }

    public boolean z(String str, String str2) {
        synchronized (this) {
            try {
                if (!((ca.e) ((AtomicMarkableReference) this.f990b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f990b;
                atomicMarkableReference.set((ca.e) atomicMarkableReference.getReference(), true);
                ab abVar = new ab(this, 7);
                AtomicReference atomicReference = (AtomicReference) this.f991c;
                while (!atomicReference.compareAndSet(null, abVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((ba.e) ((q3) this.d).f19229b).f3136b.a(abVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public q(f3.q qVar, c4.k kVar) {
        this.f990b = qVar;
        this.f991c = kVar;
        this.d = new SparseArray();
    }

    public q(q3 q3Var, boolean z9) {
        this.d = q3Var;
        this.f991c = new AtomicReference(null);
        this.f989a = z9;
        this.f990b = new AtomicMarkableReference(new ca.e(z9 ? 8192 : 1024), false);
    }

    @Override
    public void A() {
    }

    @Override
    public void f0() {
    }

    @Override
    public void B(Editable editable) {
    }
}
