package ab;

import a8.la;
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
import c8.vb;
import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.FirebaseMessaging;
import fi.a3;
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
import m.o3;
import org.telegram.messenger.jf;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Wallet.h1;
import org.telegram.ui.Wallet.i1;
import org.telegram.ui.b5;
import org.telegram.ui.bn0;
import org.telegram.ui.r4;
import org.telegram.ui.u4;
import org.telegram.ui.w0;
import org.telegram.ui.w4;
public final class q implements f3.q, bn0 {
    public static q f986e;
    public boolean f987a;
    public Object f988b;
    public Object f989c;
    public Object d;

    public q(View view) {
        org.telegram.messenger.t[] tVarArr = {new org.telegram.messenger.t(), new org.telegram.messenger.t(), new org.telegram.messenger.t()};
        this.f988b = tVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f989c = animatorSet;
        animatorSet.playTogether(k(tVarArr[0], 0, 255, 0, 300), k(tVarArr[1], 0, 255, 150, 300), k(tVarArr[2], 0, 255, 300, 300), k(tVarArr[0], 255, 0, 1000, 400), k(tVarArr[1], 255, 0, 1000, 400), k(tVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new a3(this, view));
    }

    public static void a(ic.d[][][] dVarArr, int i7, ic.d dVar) {
        ic.d[] dVarArr2 = dVarArr[i7 + dVar.d][dVar.f16243c];
        gc.d dVar2 = dVar.f16241a;
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
        if (dVar3 != null && dVar3.f16245f <= dVar.f16245f) {
            return;
        }
        dVarArr2[c10] = dVar;
    }

    public static boolean g(gc.d dVar, char c10) {
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
                int[] iArr = ic.b.f16236a;
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

    public static boolean h(w4 w4Var) {
        if (w4Var.f52964a == null && w4Var.f52965b == null) {
            return false;
        }
        return true;
    }

    public static q o() {
        if (f986e == null) {
            f986e = new Object();
        }
        return f986e;
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

    public boolean B(String str, String str2) {
        synchronized (this) {
            try {
                if (!((ca.e) ((AtomicMarkableReference) this.f988b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f988b;
                atomicMarkableReference.set((ca.e) atomicMarkableReference.getReference(), true);
                ca.r rVar = new ca.r(this, 1);
                AtomicReference atomicReference = (AtomicReference) this.f989c;
                while (!atomicReference.compareAndSet(null, rVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((ba.e) ((o3) this.d).f20190b).f3108b.a(rVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C(boolean z10) {
        if (!((boolean[]) this.f989c)[0]) {
            ji.e eVar = (ji.e) ((androidx.activity.n) this.d).d;
            eVar.f17925p3 = z10;
            eVar.invalidate();
        }
    }

    public void D(ViewGroup viewGroup, h6 h6Var, w4 w4Var, u4 u4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.f988b) != viewGroup) {
            if (this.f987a) {
                int i7 = b5.G;
                ((r4) this.d).b(false);
            }
            this.f988b = viewGroup;
            this.f989c = (WindowManager) context.getSystemService(WindowManager.class);
            r4 r4Var = new r4(this, context, h6Var, u4Var);
            this.d = r4Var;
            w0 w0Var = new w0(this, 3);
            WeakHashMap weakHashMap = r0.i0.f56289a;
            r0.a0.i(r4Var, w0Var);
        }
        ((r4) this.d).a(w4Var);
        if (!this.f987a) {
            if (((r4) this.d).getParent() != null) {
                ((WindowManager) this.f989c).removeView((r4) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            org.telegram.messenger.g0.m(layoutParams);
            org.telegram.messenger.g0.w3((WindowManager) this.f989c, (r4) this.d, layoutParams);
            ((WindowManager) this.f989c).addView((r4) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.f987a = true;
        }
    }

    public void E(Runnable runnable, Executor executor) {
        synchronized (this.f988b) {
            try {
                if (this.f987a) {
                    ((ArrayDeque) this.f989c).add(new pb.t(runnable, executor));
                    return;
                }
                this.f987a = true;
                H(runnable, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void F(SpannableString spannableString, int i7) {
        org.telegram.messenger.t[] tVarArr = (org.telegram.messenger.t[]) this.f988b;
        int i10 = i7 + 1;
        spannableString.setSpan(tVarArr[0], i7, i10, 0);
        int i11 = i7 + 2;
        spannableString.setSpan(tVarArr[1], i10, i11, 0);
        spannableString.setSpan(tVarArr[2], i11, i7 + 3, 0);
    }

    public void G() {
        synchronized (this.f988b) {
            try {
                if (((ArrayDeque) this.f989c).isEmpty()) {
                    this.f987a = false;
                    return;
                }
                pb.t tVar = (pb.t) ((ArrayDeque) this.f989c).remove();
                H(tVar.f55600b, tVar.f55599a);
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

    public void b(gc.e r13, ic.d[][][] r14, int r15, ic.d r16) {
        throw new UnsupportedOperationException("Method not decompiled: ab.q.b(gc.e, ic.d[][][], int, ic.d):void");
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f989c).start();
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
            h1 h1Var = (h1) obj;
            try {
                try {
                    rc.u uVar = (rc.u) this.f988b;
                    i1 i1Var = h1Var.f44332c;
                    int i10 = h1Var.f44330a;
                    org.telegram.messenger.g0.g3(new lp0(i1Var, uVar, i10, "websocket error: " + i1.a(vVar), 20));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                h1Var.getClass();
            }
        }
    }

    @Override
    public void d1() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((f3.q) this.f988b).d1();
        if (this.f987a) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                ((c4.o) sparseArray.valueAt(i7)).f4437i = true;
            }
        }
    }

    @Override
    public f3.i0 d2(int i7, int i10) {
        SparseArray sparseArray = (SparseArray) this.d;
        f3.q qVar = (f3.q) this.f988b;
        if (i10 != 3 && i10 != 5) {
            this.f987a = true;
        }
        if (i10 != 3) {
            return qVar.d2(i7, i10);
        }
        c4.o oVar = (c4.o) sparseArray.get(i7);
        if (oVar != null) {
            return oVar;
        }
        c4.o oVar2 = new c4.o(qVar.d2(i7, i10), (c4.k) this.f989c);
        sparseArray.put(i7, oVar2);
        return oVar2;
    }

    @Override
    public boolean e() {
        return ((x30) this.d).f41960b.e();
    }

    public void f() {
        ArrayList arrayList = (ArrayList) p();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h1 h1Var = (h1) obj;
            try {
                try {
                    h1Var.getClass();
                } catch (Throwable unused) {
                    h1Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public int i(int i7, int i10, int i11) {
        boolean b10;
        cc.b bVar = (cc.b) this.f988b;
        if (this.f987a) {
            b10 = bVar.b(i10, i7);
        } else {
            b10 = bVar.b(i7, i10);
        }
        if (b10) {
            return (i11 << 1) | 1;
        }
        return i11 << 1;
    }

    @Override
    public void j(f3.b0 b0Var) {
        ((f3.q) this.f988b).j(b0Var);
    }

    public ValueAnimator k(org.telegram.messenger.t tVar, int i7, int i10, int i11, int i12) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i7, i10);
        ofInt.addUpdateListener(new ch.w(15, this, tVar));
        ofInt.setDuration(i12);
        ofInt.setStartDelay(i11);
        ofInt.setInterpolator(nr.f37961f);
        return ofInt;
    }

    public h6.m l(gc.e eVar) {
        int i7;
        String str = (String) this.f988b;
        int length = str.length();
        cc.f fVar = (cc.f) this.f989c;
        CharsetEncoder[] charsetEncoderArr = fVar.f5204a;
        CharsetEncoder[] charsetEncoderArr2 = fVar.f5204a;
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
                if (dVar2 != null && (i7 = dVar2.f16245f) < i14) {
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
        String str2 = oVar.f55810b;
        if (this.f987a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f989c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = e2.l.f10525f;
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
            return vb.a(((j2.o) this.f988b).createDataSource(), str2, oVar.f55809a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        la.k(uri, "The uri must be set.");
        throw new q2.w(new j2.m(uri, 1, null, map, 0L, -1L, null, 0), uri, y1.h, 0L, new IllegalStateException("No license URL"));
    }

    public q2.v n(q2.p pVar) {
        boolean z10;
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), pVar.f55811a, "\"}".getBytes(charset)};
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
        la.d(j3, "the total number of elements (%s) in the arrays must fit in an int", z10);
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            byte[] bArr3 = bArr[i12];
            System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
            i11 += bArr3.length;
        }
        j2.h createDataSource = ((j2.o) this.f988b).createDataSource();
        String str = pVar.f55812b;
        String aVar = k9.a.f18222i.toString();
        String valueOf = String.valueOf(i10);
        h9.o.f("Content-Type", aVar);
        h9.o.f("Content-Length", valueOf);
        return vb.a(createDataSource, str, bArr2, y1.g(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List p() {
        synchronized (((ArrayList) this.f989c)) {
            try {
                if (!this.f987a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.f989c).size());
                ArrayList arrayList2 = (ArrayList) this.f989c;
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    arrayList.add((h1) obj);
                }
                this.d = arrayList;
                this.f987a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void r() {
        try {
            if (this.f987a) {
                return;
            }
            Boolean t6 = t();
            this.f989c = t6;
            if (t6 == null) {
                ((u9.k) ((ra.b) this.f988b)).a(new a3.l(9));
            }
            this.f987a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean s() {
        boolean h;
        try {
            r();
            Boolean bool = (Boolean) this.f989c;
            if (bool != null) {
                h = bool.booleanValue();
            } else {
                h = ((FirebaseMessaging) this.d).f7591a.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h;
    }

    public Boolean t() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        o9.g gVar = ((FirebaseMessaging) this.d).f7591a;
        gVar.a();
        Context context = gVar.f21788a;
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

    public gc.c v() {
        gc.c cVar = (gc.c) this.d;
        if (cVar != null) {
            return cVar;
        }
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 = i(i11, 8, i10);
        }
        int i12 = i(8, 7, i(8, 8, i(7, 8, i10)));
        for (int i13 = 5; i13 >= 0; i13--) {
            i12 = i(8, i13, i12);
        }
        int i14 = ((cc.b) this.f988b).f5188b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i7 = i(8, i16, i7);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i7 = i(i17, 8, i7);
        }
        gc.c a10 = gc.c.a(i12, i7);
        if (a10 == null) {
            a10 = gc.c.a(i12 ^ 21522, i7 ^ 21522);
        }
        this.d = a10;
        if (a10 != null) {
            return a10;
        }
        throw bc.c.a();
    }

    @Override
    public void v0(int i7, boolean z10, boolean z11) {
        String str;
        ArrayList arrayList = (ArrayList) this.f989c;
        x30 x30Var = (x30) this.d;
        HashMap hashMap = (HashMap) this.f988b;
        if (!hashMap.isEmpty() && x30Var.f41960b != null && !this.f987a && !z10) {
            this.f987a = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                if (obj instanceof jf) {
                    jf jfVar = (jf) obj;
                    String str2 = jfVar.h;
                    if (str2 != null) {
                        obj2.f28407c = str2;
                    } else {
                        obj2.f28414l = jfVar;
                    }
                    obj2.f28413k = jfVar.f28074s;
                    obj2.f28408e = jfVar.f28060c;
                    CharSequence charSequence = jfVar.I;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    obj2.d = str;
                    obj2.f28411i = jfVar.f28069n;
                    obj2.f28412j = jfVar.f28073r;
                    obj2.h = jfVar.f28078x;
                }
            }
            x30.a(x30Var, false, arrayList2);
        }
    }

    public gc.e w() {
        gc.e eVar = (gc.e) this.f989c;
        if (eVar != null) {
            return eVar;
        }
        int i7 = ((cc.b) this.f988b).f5188b;
        int i10 = (i7 - 17) / 4;
        if (i10 <= 6) {
            return gc.e.c(i10);
        }
        int i11 = i7 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i7 - 9; i15 >= i11; i15--) {
                i13 = i(i15, i14, i13);
            }
        }
        gc.e b10 = gc.e.b(i13);
        if (b10 != null && (b10.f13500a * 4) + 17 == i7) {
            this.f989c = b10;
            return b10;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = i7 - 9; i17 >= i11; i17--) {
                i12 = i(i16, i17, i12);
            }
        }
        gc.e b11 = gc.e.b(i12);
        if (b11 != null && (b11.f13500a * 4) + 17 == i7) {
            this.f989c = b11;
            return b11;
        }
        throw bc.c.a();
    }

    public void x() {
        if (((gc.c) this.d) != null) {
            int i7 = p1.g.d(8)[((gc.c) this.d).f13486b];
            cc.b bVar = (cc.b) this.f988b;
            int i10 = bVar.f5188b;
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (e2.b(i7, i11, i12)) {
                        bVar.a(i12, i11);
                    }
                }
            }
        }
    }

    public void y(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f989c).cancel();
        }
    }

    public void z() {
        h2.i0 i0Var = (h2.i0) this.d;
        if (!this.f987a) {
            return;
        }
        i0Var.d(new f2.a(this, 0));
        this.f987a = false;
    }

    public q(f3.q qVar, c4.k kVar) {
        this.f988b = qVar;
        this.f989c = kVar;
        this.d = new SparseArray();
    }

    public q(o3 o3Var, boolean z10) {
        this.d = o3Var;
        this.f989c = new AtomicReference(null);
        this.f987a = z10;
        this.f988b = new AtomicMarkableReference(new ca.e(z10 ? 8192 : 1024), false);
    }

    @Override
    public void b0() {
    }

    @Override
    public void u() {
    }

    @Override
    public void A(Editable editable) {
    }
}
