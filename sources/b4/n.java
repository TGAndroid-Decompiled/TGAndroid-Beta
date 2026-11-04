package b4;

import ai.s;
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
import b8.og;
import b8.zb;
import ci.d1;
import ci.uc;
import com.google.firebase.messaging.FirebaseMessaging;
import e3.b0;
import e3.q;
import ei.k3;
import g2.j0;
import g9.x1;
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
import l9.u;
import m.o3;
import oc.v;
import org.telegram.messenger.bf;
import org.telegram.messenger.g0;
import org.telegram.messenger.t;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.Wallet.w0;
import org.telegram.ui.d5;
import org.telegram.ui.rm0;
import org.telegram.ui.t4;
import org.telegram.ui.w4;
import org.telegram.ui.x0;
import org.telegram.ui.y4;
import p2.w;
import r0.a0;
import r0.i0;
public final class n implements q, rm0 {
    public static n f2376e;
    public boolean f2377a;
    public Object f2378b;
    public Object f2379c;
    public Object d;

    public n(View view) {
        t[] tVarArr = {new t(), new t(), new t()};
        this.f2378b = tVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2379c = animatorSet;
        animatorSet.playTogether(k(tVarArr[0], 0, 255, 0, 300), k(tVarArr[1], 0, 255, 150, 300), k(tVarArr[2], 0, 255, 300, 300), k(tVarArr[0], 255, 0, 1000, 400), k(tVarArr[1], 255, 0, 1000, 400), k(tVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new k3(this, view));
    }

    public static void a(fc.d[][][] dVarArr, int i3, fc.d dVar) {
        fc.d[] dVarArr2 = dVarArr[i3 + dVar.d][dVar.f11556c];
        dc.d dVar2 = dVar.f11554a;
        int ordinal = dVar2.ordinal();
        char c2 = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        c2 = 0;
                    } else {
                        throw new IllegalStateException("Illegal mode " + dVar2);
                    }
                } else {
                    c2 = 3;
                }
            } else {
                c2 = 1;
            }
        }
        fc.d dVar3 = dVarArr2[c2];
        if (dVar3 != null && dVar3.f11558f <= dVar.f11558f) {
            return;
        }
        dVarArr2[c2] = dVar;
    }

    public static boolean h(dc.d dVar, char c2) {
        int i3;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return fc.b.c(String.valueOf(c2));
                    }
                    return false;
                }
            } else {
                int[] iArr = fc.b.f11549a;
                if (c2 < '`') {
                    i3 = iArr[c2];
                } else {
                    i3 = -1;
                }
                if (i3 == -1) {
                    return false;
                }
            }
        } else if (c2 < '0' || c2 > '9') {
            return false;
        }
        return true;
    }

    public static boolean i(y4 y4Var) {
        if (y4Var.f52172a == null && y4Var.f52173b == null) {
            return false;
        }
        return true;
    }

    public static n p() {
        if (f2376e == null) {
            f2376e = new Object();
        }
        return f2376e;
    }

    public static dc.e r(int i3) {
        int c2 = o1.g.c(i3);
        if (c2 != 0) {
            if (c2 != 1) {
                return dc.e.c(40);
            }
            return dc.e.c(26);
        }
        return dc.e.c(9);
    }

    public void A() {
        j0 j0Var = (j0) this.d;
        if (!this.f2377a) {
            return;
        }
        j0Var.d(new d1(this, 18));
        this.f2377a = false;
    }

    public boolean B(String str, String str2) {
        synchronized (this) {
            try {
                if (!((ba.e) ((AtomicMarkableReference) this.f2378b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f2378b;
                atomicMarkableReference.set((ba.e) atomicMarkableReference.getReference(), true);
                s sVar = new s(this, 15);
                AtomicReference atomicReference = (AtomicReference) this.f2379c;
                while (!atomicReference.compareAndSet(null, sVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((aa.g) ((o3) this.d).f18683b).f287b.a(sVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C(ViewGroup viewGroup, e6 e6Var, y4 y4Var, w4 w4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.f2378b) != viewGroup) {
            if (this.f2377a) {
                int i3 = d5.G;
                ((t4) this.d).b(false);
            }
            this.f2378b = viewGroup;
            this.f2379c = (WindowManager) context.getSystemService(WindowManager.class);
            t4 t4Var = new t4(this, context, e6Var, w4Var);
            this.d = t4Var;
            x0 x0Var = new x0(this, 3);
            WeakHashMap weakHashMap = i0.f54015a;
            a0.i(t4Var, x0Var);
        }
        ((t4) this.d).a(y4Var);
        if (!this.f2377a) {
            if (((t4) this.d).getParent() != null) {
                ((WindowManager) this.f2379c).removeView((t4) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            g0.m(layoutParams);
            g0.y3((WindowManager) this.f2379c, (t4) this.d, layoutParams);
            ((WindowManager) this.f2379c).addView((t4) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.f2377a = true;
        }
    }

    public void D(Runnable runnable, Executor executor) {
        synchronized (this.f2378b) {
            try {
                if (this.f2377a) {
                    ((ArrayDeque) this.f2379c).add(new mb.s(runnable, executor));
                    return;
                }
                this.f2377a = true;
                G(runnable, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(SpannableString spannableString, int i3) {
        t[] tVarArr = (t[]) this.f2378b;
        int i10 = i3 + 1;
        spannableString.setSpan(tVarArr[0], i3, i10, 0);
        int i11 = i3 + 2;
        spannableString.setSpan(tVarArr[1], i10, i11, 0);
        spannableString.setSpan(tVarArr[2], i11, i3 + 3, 0);
    }

    public void F() {
        synchronized (this.f2378b) {
            try {
                if (((ArrayDeque) this.f2379c).isEmpty()) {
                    this.f2377a = false;
                    return;
                }
                mb.s sVar = (mb.s) ((ArrayDeque) this.f2379c).remove();
                G(sVar.f19260b, sVar.f19259a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void G(Runnable runnable, Executor executor) {
        try {
            executor.execute(new u(21, this, runnable));
        } catch (RejectedExecutionException unused) {
            F();
        }
    }

    @Override
    public void L() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((q) this.f2378b).L();
        if (this.f2377a) {
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                ((p) sparseArray.valueAt(i3)).f2389i = true;
            }
        }
    }

    public void b(dc.e r13, fc.d[][][] r14, int r15, fc.d r16) {
        throw new UnsupportedOperationException("Method not decompiled: b4.n.b(dc.e, fc.d[][][], int, fc.d):void");
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f2379c).start();
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void d(v vVar) {
        ArrayList arrayList = (ArrayList) q();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w0 w0Var = (w0) obj;
            try {
                try {
                    oc.u uVar = (oc.u) this.f2378b;
                    org.telegram.ui.Wallet.x0 x0Var = w0Var.f43308c;
                    int i10 = w0Var.f43306a;
                    g0.h3(new zo0(x0Var, uVar, i10, "websocket error: " + org.telegram.ui.Wallet.x0.a(vVar), 19));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                w0Var.getClass();
            }
        }
    }

    @Override
    public boolean e() {
        return ((f30) this.d).f33682b.e();
    }

    @Override
    public void f(b0 b0Var) {
        ((q) this.f2378b).f(b0Var);
    }

    public void g() {
        ArrayList arrayList = (ArrayList) q();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w0 w0Var = (w0) obj;
            try {
                try {
                    w0Var.getClass();
                } catch (Throwable unused) {
                    w0Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override
    public e3.i0 i0(int i3, int i10) {
        SparseArray sparseArray = (SparseArray) this.d;
        q qVar = (q) this.f2378b;
        if (i10 != 3 && i10 != 5) {
            this.f2377a = true;
        }
        if (i10 != 3) {
            return qVar.i0(i3, i10);
        }
        p pVar = (p) sparseArray.get(i3);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(qVar.i0(i3, i10), (k) this.f2379c);
        sparseArray.put(i3, pVar2);
        return pVar2;
    }

    public int j(int i3, int i10, int i11) {
        boolean b10;
        zb.b bVar = (zb.b) this.f2378b;
        if (this.f2377a) {
            b10 = bVar.b(i10, i3);
        } else {
            b10 = bVar.b(i3, i10);
        }
        if (b10) {
            return (i11 << 1) | 1;
        }
        return i11 << 1;
    }

    public ValueAnimator k(t tVar, int i3, int i10, int i11, int i12) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i3, i10);
        ofInt.addUpdateListener(new uc(16, this, tVar));
        ofInt.setDuration(i12);
        ofInt.setStartDelay(i11);
        ofInt.setInterpolator(xq.f40452f);
        return ofInt;
    }

    public android.support.v4.media.session.a0 l(dc.e eVar) {
        int i3;
        String str = (String) this.f2378b;
        int length = str.length();
        zb.d dVar = (zb.d) this.f2379c;
        CharsetEncoder[] charsetEncoderArr = dVar.f60358a;
        CharsetEncoder[] charsetEncoderArr2 = dVar.f60358a;
        fc.d[][][] dVarArr = (fc.d[][][]) Array.newInstance(fc.d.class, length + 1, charsetEncoderArr.length, 4);
        b(eVar, dVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < charsetEncoderArr2.length; i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    fc.d dVar2 = dVarArr[i10][i11][i12];
                    if (dVar2 != null && i10 < length) {
                        b(eVar, dVarArr, i10, dVar2);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < charsetEncoderArr2.length; i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                fc.d dVar3 = dVarArr[length][i16][i17];
                if (dVar3 != null && (i3 = dVar3.f11558f) < i14) {
                    i13 = i16;
                    i15 = i17;
                    i14 = i3;
                }
            }
        }
        if (i13 >= 0) {
            return new android.support.v4.media.session.a0(this, eVar, dVarArr[length][i13][i15]);
        }
        throw new Exception(a1.g.q("Internal error: failed to encode \"", str, "\""));
    }

    public p2.v n(UUID uuid, p2.o oVar) {
        String str;
        String str2 = oVar.f53121b;
        if (this.f2377a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f2379c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = d2.m.f8186f;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (d2.m.d.equals(uuid)) {
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
            return og.a(((i2.p) this.f2378b).createDataSource(), str2, oVar.f53120a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        zb.k(uri, "The uri must be set.");
        throw new w(new i2.n(uri, 1, null, map, 0L, -1L, null, 0), uri, x1.h, 0L, new IllegalStateException("No license URL"));
    }

    public p2.v o(p2.p pVar) {
        boolean z10;
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), pVar.f53122a, "\"}".getBytes(charset)};
        long j10 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            j10 += bArr[i3].length;
        }
        int i10 = (int) j10;
        if (j10 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.d(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            byte[] bArr3 = bArr[i12];
            System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
            i11 += bArr3.length;
        }
        i2.h createDataSource = ((i2.p) this.f2378b).createDataSource();
        String str = pVar.f53123b;
        String aVar = j9.a.f16218i.toString();
        String valueOf = String.valueOf(i10);
        g9.o.f("Content-Type", aVar);
        g9.o.f("Content-Length", valueOf);
        return og.a(createDataSource, str, bArr2, x1.g(2, new Object[]{"Content-Type", aVar, "Content-Length", valueOf}, null));
    }

    public List q() {
        synchronized (((ArrayList) this.f2379c)) {
            try {
                if (!this.f2377a) {
                    return (ArrayList) this.d;
                }
                ArrayList arrayList = new ArrayList(((ArrayList) this.f2379c).size());
                ArrayList arrayList2 = (ArrayList) this.f2379c;
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    arrayList.add((w0) obj);
                }
                this.d = arrayList;
                this.f2377a = false;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void s() {
        try {
            if (this.f2377a) {
                return;
            }
            Boolean v = v();
            this.f2379c = v;
            if (v == null) {
                ((t9.l) ((qa.b) this.f2378b)).a(new z9.j(7));
            }
            this.f2377a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean t() {
        boolean h;
        try {
            s();
            Boolean bool = (Boolean) this.f2379c;
            if (bool != null) {
                h = bool.booleanValue();
            } else {
                h = ((FirebaseMessaging) this.d).f7944a.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h;
    }

    public Boolean v() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        n9.h hVar = ((FirebaseMessaging) this.d).f7944a;
        hVar.a();
        Context context = hVar.f20296a;
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
    public void v0(int i3, boolean z10, boolean z11) {
        String str;
        ArrayList arrayList = (ArrayList) this.f2379c;
        f30 f30Var = (f30) this.d;
        HashMap hashMap = (HashMap) this.f2378b;
        if (!hashMap.isEmpty() && f30Var.f33682b != null && !this.f2377a && !z10) {
            this.f2377a = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                if (obj instanceof bf) {
                    bf bfVar = (bf) obj;
                    String str2 = bfVar.h;
                    if (str2 != null) {
                        obj2.f26477c = str2;
                    } else {
                        obj2.f26484l = bfVar;
                    }
                    obj2.f26483k = bfVar.f25325s;
                    obj2.f26478e = bfVar.f25311c;
                    CharSequence charSequence = bfVar.I;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    obj2.d = str;
                    obj2.f26481i = bfVar.f25320n;
                    obj2.f26482j = bfVar.f25324r;
                    obj2.h = bfVar.f25329x;
                }
            }
            f30.a(f30Var, false, arrayList2);
        }
    }

    public dc.c w() {
        dc.c cVar = (dc.c) this.d;
        if (cVar != null) {
            return cVar;
        }
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 = j(i11, 8, i10);
        }
        int j10 = j(8, 7, j(8, 8, j(7, 8, i10)));
        for (int i12 = 5; i12 >= 0; i12--) {
            j10 = j(8, i12, j10);
        }
        int i13 = ((zb.b) this.f2378b).f60351b;
        int i14 = i13 - 7;
        for (int i15 = i13 - 1; i15 >= i14; i15--) {
            i3 = j(8, i15, i3);
        }
        for (int i16 = i13 - 8; i16 < i13; i16++) {
            i3 = j(i16, 8, i3);
        }
        dc.c a10 = dc.c.a(j10, i3);
        if (a10 == null) {
            a10 = dc.c.a(j10 ^ 21522, i3 ^ 21522);
        }
        this.d = a10;
        if (a10 != null) {
            return a10;
        }
        throw yb.c.a();
    }

    public dc.e x() {
        dc.e eVar = (dc.e) this.f2379c;
        if (eVar != null) {
            return eVar;
        }
        int i3 = ((zb.b) this.f2378b).f60351b;
        int i10 = (i3 - 17) / 4;
        if (i10 <= 6) {
            return dc.e.c(i10);
        }
        int i11 = i3 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i3 - 9; i15 >= i11; i15--) {
                i13 = j(i15, i14, i13);
            }
        }
        dc.e b10 = dc.e.b(i13);
        if (b10 != null && (b10.f8784a * 4) + 17 == i3) {
            this.f2379c = b10;
            return b10;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = i3 - 9; i17 >= i11; i17--) {
                i12 = j(i16, i17, i12);
            }
        }
        dc.e b11 = dc.e.b(i12);
        if (b11 != null && (b11.f8784a * 4) + 17 == i3) {
            this.f2379c = b11;
            return b11;
        }
        throw yb.c.a();
    }

    public void y() {
        if (((dc.c) this.d) != null) {
            int i3 = o1.g.d(8)[((dc.c) this.d).f8770b];
            zb.b bVar = (zb.b) this.f2378b;
            int i10 = bVar.f60351b;
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (com.google.android.recaptcha.internal.a.b(i3, i11, i12)) {
                        bVar.a(i12, i11);
                    }
                }
            }
        }
    }

    public void z(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f2379c).cancel();
        }
    }

    public n(q qVar, k kVar) {
        this.f2378b = qVar;
        this.f2379c = kVar;
        this.d = new SparseArray();
    }

    public n(o3 o3Var, boolean z10) {
        this.d = o3Var;
        this.f2379c = new AtomicReference(null);
        this.f2377a = z10;
        this.f2378b = new AtomicMarkableReference(new ba.e(z10 ? 8192 : 1024), false);
    }

    @Override
    public void c0() {
    }

    @Override
    public void m() {
    }

    @Override
    public void u(Editable editable) {
    }
}
