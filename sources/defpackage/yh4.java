package defpackage;

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
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
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
public final class yh4 implements y73, u78, u84 {
    public static final xh4 e = new Object();
    public static yh4 f;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public yh4(View view) {
        rl[] rlVarArr = {new rl(), new rl(), new rl()};
        this.b = rlVarArr;
        this.c = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.d = animatorSet;
        animatorSet.playTogether(o(rlVarArr[0], 0, 255, 0, 300), o(rlVarArr[1], 0, 255, 150, 300), o(rlVarArr[2], 0, 255, 300, 300), o(rlVarArr[0], 255, 0, 1000, 400), o(rlVarArr[1], 255, 0, 1000, 400), o(rlVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new i8(this, view));
    }

    public static double K(wh4 wh4Var, wh4 wh4Var2) {
        double d = wh4Var.a - wh4Var2.a;
        double d2 = wh4Var.b - wh4Var2.b;
        return (d2 * d2) + (d * d);
    }

    public static void a(yf7[][][] yf7VarArr, int i, yf7 yf7Var) {
        yf7[] yf7VarArr2 = yf7VarArr[i + yf7Var.d][yf7Var.c];
        ig7 ig7Var = yf7Var.a;
        int ordinal = ig7Var.ordinal();
        char c = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        c = 0;
                    } else {
                        zo4.j(ig7Var, "Illegal mode ");
                        return;
                    }
                } else {
                    c = 3;
                }
            } else {
                c = 1;
            }
        }
        yf7 yf7Var2 = yf7VarArr2[c];
        if (yf7Var2 != null && yf7Var2.f <= yf7Var.f) {
            return;
        }
        yf7VarArr2[c] = yf7Var;
    }

    public static boolean h(ig7 ig7Var, char c) {
        int i;
        int ordinal = ig7Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return a44.c(String.valueOf(c));
                    }
                    return false;
                }
            } else {
                int[] iArr = a44.a;
                if (c < '`') {
                    i = iArr[c];
                } else {
                    i = -1;
                }
                if (i == -1) {
                    return false;
                }
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static boolean l(wc0 wc0Var) {
        if (wc0Var.a == null && wc0Var.b == null) {
            return false;
        }
        return true;
    }

    public static float m(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean s(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < 5) {
                int i3 = iArr[i];
                if (i3 == 0) {
                    break;
                }
                i2 += i3;
                i++;
            } else if (i2 >= 7) {
                float f2 = i2 / 7.0f;
                float f3 = f2 / 2.0f;
                if (Math.abs(f2 - iArr[0]) >= f3 || Math.abs(f2 - iArr[1]) >= f3 || Math.abs((f2 * 3.0f) - iArr[2]) >= 3.0f * f3 || Math.abs(f2 - iArr[3]) >= f3 || Math.abs(f2 - iArr[4]) >= f3) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static yh4 t() {
        yh4 yh4Var = f;
        if (yh4Var == null) {
            ?? obj = new Object();
            f = obj;
            return obj;
        }
        return yh4Var;
    }

    public static ybc v(int i) {
        int F = wi8.F(i);
        if (F != 0) {
            if (F != 1) {
                return ybc.c(40);
            }
            return ybc.c(26);
        }
        return ybc.c(9);
    }

    public final Boolean A() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        li4 li4Var = ((FirebaseMessaging) this.d).a;
        li4Var.a();
        Context context = li4Var.a;
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
    public final void B() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((u84) this.b).B();
        if (this.a) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((wcb) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public final io4 C() {
        io4 io4Var = (io4) this.d;
        if (io4Var != null) {
            return io4Var;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = n(i3, 8, i2);
        }
        int n = n(8, 7, n(8, 8, n(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            n = n(8, i4, n);
        }
        int i5 = ((qk0) this.b).b;
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = n(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = n(i8, 8, i);
        }
        io4 a = io4.a(n, i);
        if (a == null) {
            a = io4.a(n ^ 21522, i ^ 21522);
        }
        this.d = a;
        if (a != null) {
            return a;
        }
        throw ho4.a();
    }

    public final ybc D() {
        ybc ybcVar = (ybc) this.c;
        if (ybcVar != null) {
            return ybcVar;
        }
        int i = ((qk0) this.b).b;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return ybc.c(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = n(i7, i6, i5);
            }
        }
        ybc b = ybc.b(i5);
        if (b != null && (b.a << 2) + 17 == i) {
            this.c = b;
            return b;
        }
        for (int i8 = 5; i8 >= 0; i8--) {
            for (int i9 = i - 9; i9 >= i3; i9--) {
                i4 = n(i8, i9, i4);
            }
        }
        ybc b2 = ybc.b(i4);
        if (b2 != null && (b2.a << 2) + 17 == i) {
            this.c = b2;
            return b2;
        }
        throw ho4.a();
    }

    public final void E() {
        if (((io4) this.d) != null) {
            int i = wi8.G(8)[((io4) this.d).b];
            qk0 qk0Var = (qk0) this.b;
            int i2 = qk0Var.b;
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (ts2.a(i, i3, i4)) {
                        qk0Var.a(i4, i3);
                    }
                }
            }
        }
    }

    public final void F(View view) {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.d).cancel();
        }
    }

    public final void G() {
        if (!this.a) {
            return;
        }
        ((dfb) this.d).e(new f00(this, (byte) 1));
        this.a = false;
    }

    public final boolean H(String str, String str2) {
        synchronized (this) {
            if (!((qx5) ((AtomicMarkableReference) this.b).getReference()).c(str, str2)) {
                return false;
            }
            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
            atomicMarkableReference.set((qx5) atomicMarkableReference.getReference(), true);
            f8c f8cVar = new f8c(this, (byte) 2);
            AtomicReference atomicReference = (AtomicReference) this.c;
            while (!atomicReference.compareAndSet(null, f8cVar)) {
                if (atomicReference.get() != null) {
                    return true;
                }
            }
            ((a13) ((mx6) ((jd4) this.d).c).c).a(f8cVar);
            return true;
        }
    }

    public final void I(boolean z) {
        if (!((boolean[]) this.c)[0]) {
            ykc ykcVar = (ykc) ((ry) this.d).d;
            ykcVar.p3 = z;
            ykcVar.invalidate();
        }
    }

    public final void J(ViewGroup viewGroup, ylb ylbVar, wc0 wc0Var, uc0 uc0Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                int i = bd0.G;
                ((rc0) this.d).b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) context.getSystemService(WindowManager.class);
            rc0 rc0Var = new rc0(this, context, ylbVar, uc0Var);
            this.d = rc0Var;
            l0 l0Var = new l0(this, (byte) 28);
            WeakHashMap weakHashMap = kfc.a;
            cfc.i(rc0Var, l0Var);
        }
        ((rc0) this.d).a(wc0Var);
        if (!this.a) {
            if (((rc0) this.d).getParent() != null) {
                ((WindowManager) this.c).removeView((rc0) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            gm.m(layoutParams);
            gm.s3((WindowManager) this.c, (rc0) this.d, layoutParams);
            ((WindowManager) this.c).addView((rc0) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.a = true;
        }
    }

    public final void L(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            if (this.a) {
                ((ArrayDeque) this.c).add(new hif(runnable, executor));
                return;
            }
            this.a = true;
            O(runnable, executor);
        }
    }

    public final void M(SpannableString spannableString, int i) {
        rl[] rlVarArr = (rl[]) this.b;
        int i2 = i + 1;
        spannableString.setSpan(rlVarArr[0], i, i2, 0);
        int i3 = i + 2;
        spannableString.setSpan(rlVarArr[1], i2, i3, 0);
        spannableString.setSpan(rlVarArr[2], i3, i + 3, 0);
    }

    public final void N() {
        synchronized (this.b) {
            if (((ArrayDeque) this.c).isEmpty()) {
                this.a = false;
                return;
            }
            hif hifVar = (hif) ((ArrayDeque) this.c).remove();
            O(hifVar.b, hifVar.a);
        }
    }

    public final void O(Runnable runnable, Executor executor) {
        try {
            executor.execute(new us4(this, runnable, (byte) 24));
        } catch (RejectedExecutionException unused) {
            N();
        }
    }

    public final void b(defpackage.ybc r13, defpackage.yf7[][][] r14, int r15, defpackage.yf7 r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh4.b(ybc, yf7[][][], int, yf7):void");
    }

    @Override
    public final boolean c() {
        return ((wn5) this.d).b.c();
    }

    @Override
    public final yzb c0(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.d;
        u84 u84Var = (u84) this.b;
        if (i2 != 3 && i2 != 5) {
            this.a = true;
        }
        if (i2 != 3) {
            return u84Var.c0(i, i2);
        }
        wcb wcbVar = (wcb) sparseArray.get(i);
        if (wcbVar != null) {
            return wcbVar;
        }
        wcb wcbVar2 = new wcb(u84Var.c0(i, i2), (tcb) this.c);
        sparseArray.put(i, wcbVar2);
        return wcbVar2;
    }

    @Override
    public final a83 createDataSource() {
        ic3 ic3Var = new ic3((String) this.d, 8000, 8000, this.a, (wm4) this.b);
        w0c w0cVar = (w0c) this.c;
        if (w0cVar != null) {
            ic3Var.addTransferListener(w0cVar);
        }
        return ic3Var;
    }

    public final void d(View view) {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.d).start();
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public final void f(dwc dwcVar) {
        ArrayList arrayList = (ArrayList) u();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o35 o35Var = (o35) obj;
            try {
                try {
                    gm.c3(new up6(o35Var.c, (cwc) this.b, o35Var.a, "websocket error: ".concat(p35.b(dwcVar)), (byte) 25));
                } catch (Throwable unused) {
                    o35Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override
    public final void f0(ix9 ix9Var) {
        ((u84) this.b).f0(ix9Var);
    }

    public final void g() {
        ArrayList arrayList = (ArrayList) u();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o35 o35Var = (o35) obj;
            try {
                try {
                    o35Var.getClass();
                } catch (Throwable unused) {
                    o35Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override
    public final void k(int i, boolean z, boolean z2) {
        String str;
        ArrayList arrayList = (ArrayList) this.c;
        wn5 wn5Var = (wn5) this.d;
        HashMap hashMap = (HashMap) this.b;
        if (!hashMap.isEmpty() && wn5Var.b != null && !this.a && !z) {
            this.a = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = hashMap.get(arrayList.get(i2));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    String str2 = no6Var.h;
                    if (str2 != null) {
                        obj2.c = str2;
                    } else {
                        obj2.l = no6Var;
                    }
                    obj2.k = no6Var.s;
                    obj2.e = no6Var.c;
                    CharSequence charSequence = no6Var.I;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    obj2.d = str;
                    obj2.i = no6Var.n;
                    obj2.j = no6Var.r;
                    obj2.h = no6Var.x;
                }
            }
            wn5Var.e(arrayList2, false);
        }
    }

    public final int n(int i, int i2, int i3) {
        boolean b;
        boolean z = this.a;
        qk0 qk0Var = (qk0) this.b;
        if (z) {
            b = qk0Var.b(i2, i);
        } else {
            b = qk0Var.b(i, i2);
        }
        int i4 = i3 << 1;
        if (b) {
            return i4 | 1;
        }
        return i4;
    }

    public final ValueAnimator o(rl rlVar, int i, int i2, int i3, int i4) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new pl(this, rlVar, (byte) 14));
        ofInt.setDuration(i4);
        ofInt.setStartDelay(i3);
        ofInt.setInterpolator(d53.f);
        return ofInt;
    }

    public final in3 p(ybc ybcVar) {
        int i;
        String str = (String) this.b;
        int length = str.length();
        CharsetEncoder[] charsetEncoderArr = ((pt3) this.c).a;
        yf7[][][] yf7VarArr = (yf7[][][]) Array.newInstance(yf7.class, length + 1, charsetEncoderArr.length, 4);
        b(ybcVar, yf7VarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    yf7 yf7Var = yf7VarArr[i2][i3][i4];
                    if (yf7Var != null && i2 < length) {
                        b(ybcVar, yf7VarArr, i2, yf7Var);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                yf7 yf7Var2 = yf7VarArr[length][i8][i9];
                if (yf7Var2 != null && (i = yf7Var2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new in3(this, ybcVar, yf7VarArr[length][i5][i7]);
        }
        throw new Exception(kt6.o("Internal error: failed to encode \"", str, "\""));
    }

    public final ls6 q(UUID uuid, r64 r64Var) {
        String str;
        String str2 = r64Var.b;
        if (this.a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = n61.f;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (n61.d.equals(uuid)) {
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
            return sge.a(((yh4) this.b).createDataSource(), str2, r64Var.a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        jte.l(uri, "The uri must be set.");
        throw new ms6(new g83(uri, 1, null, map, 0L, -1L, null, 0), uri, d89.h, 0L, new IllegalStateException("No license URL"));
    }

    public final ls6 r(s64 s64Var) {
        boolean z;
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), s64Var.a, "\"}".getBytes(charset)};
        long j = 0;
        for (int i = 0; i < 3; i++) {
            j += bArr[i].length;
        }
        int i2 = (int) j;
        if (j == i2) {
            z = true;
        } else {
            z = false;
        }
        jte.d(j, "the total number of elements (%s) in the arrays must fit in an int", z);
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        a83 createDataSource = ((yh4) this.b).createDataSource();
        String str = s64Var.b;
        String h07Var = h07.i.toString();
        String valueOf = String.valueOf(i2);
        ntd.a("Content-Length", valueOf);
        return sge.a(createDataSource, str, bArr2, d89.g(2, new Object[]{"Content-Type", h07Var, "Content-Length", valueOf}, null));
    }

    public final List u() {
        synchronized (((ArrayList) this.c)) {
            if (!this.a) {
                return (ArrayList) this.d;
            }
            ArrayList arrayList = new ArrayList(((ArrayList) this.c).size());
            ArrayList arrayList2 = (ArrayList) this.c;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList.add((o35) obj);
            }
            this.d = arrayList;
            this.a = false;
            return arrayList;
        }
    }

    public final boolean w(int i, int i2, int[] iArr) {
        float f2;
        char c;
        float f3;
        ?? r16;
        char c2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = (ArrayList) this.c;
        boolean z = false;
        char c3 = 2;
        char c4 = 3;
        int i6 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int m = (int) m(iArr, i2);
        int i7 = iArr[2];
        qk0 qk0Var = (qk0) this.b;
        int i8 = qk0Var.b;
        int i9 = qk0Var.a;
        int[] iArr2 = (int[]) this.d;
        Arrays.fill(iArr2, 0);
        int i10 = i;
        while (true) {
            f2 = Float.NaN;
            if (i10 >= 0) {
                if (qk0Var.b(m, i10)) {
                    iArr2[2] = iArr2[2] + 1;
                    i10--;
                } else {
                    while (i10 >= 0 && !qk0Var.b(m, i10)) {
                        c = c3;
                        int i11 = iArr2[1];
                        if (i11 > i7) {
                            break;
                        }
                        iArr2[1] = i11 + 1;
                        i10--;
                        c3 = c;
                    }
                    c = c3;
                    if (i10 >= 0 && iArr2[1] <= i7) {
                        while (i10 >= 0 && qk0Var.b(m, i10)) {
                            int i12 = iArr2[0];
                            if (i12 > i7) {
                                break;
                            }
                            iArr2[0] = i12 + 1;
                            i10--;
                        }
                        if (iArr2[0] <= i7) {
                            int i13 = i + 1;
                            while (i13 < i8 && qk0Var.b(m, i13)) {
                                iArr2[c] = iArr2[c] + 1;
                                i13++;
                            }
                            if (i13 != i8) {
                                while (i13 < i8 && !qk0Var.b(m, i13)) {
                                    int i14 = iArr2[3];
                                    if (i14 >= i7) {
                                        break;
                                    }
                                    iArr2[3] = i14 + 1;
                                    i13++;
                                }
                                if (i13 != i8 && iArr2[3] < i7) {
                                    while (i13 < i8 && qk0Var.b(m, i13)) {
                                        int i15 = iArr2[4];
                                        if (i15 >= i7) {
                                            break;
                                        }
                                        iArr2[4] = i15 + 1;
                                        i13++;
                                    }
                                    int i16 = iArr2[4];
                                    if (i16 < i7 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c]) + iArr2[3]) + i16) - i6) * 5 < (i6 << 1) && s(iArr2)) {
                                        f3 = m(iArr2, i13);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                c = 2;
                break;
            }
        }
        f3 = Float.NaN;
        if (!Float.isNaN(f3)) {
            int i17 = (int) f3;
            int i18 = iArr[c];
            Arrays.fill(iArr2, 0);
            int i19 = m;
            while (true) {
                if (i19 < 0) {
                    break;
                } else if (qk0Var.b(i19, i17)) {
                    iArr2[c] = iArr2[c] + 1;
                    i19--;
                } else {
                    while (i19 >= 0 && !qk0Var.b(i19, i17)) {
                        int i20 = iArr2[1];
                        if (i20 > i18) {
                            break;
                        }
                        iArr2[1] = i20 + 1;
                        i19--;
                    }
                    if (i19 >= 0 && iArr2[1] <= i18) {
                        while (i19 >= 0 && qk0Var.b(i19, i17)) {
                            int i21 = iArr2[0];
                            if (i21 > i18) {
                                break;
                            }
                            iArr2[0] = i21 + 1;
                            i19--;
                        }
                        if (iArr2[0] <= i18) {
                            int i22 = m + 1;
                            while (i22 < i9 && qk0Var.b(i22, i17)) {
                                iArr2[c] = iArr2[c] + 1;
                                i22++;
                            }
                            if (i22 != i9) {
                                while (i22 < i9 && !qk0Var.b(i22, i17)) {
                                    int i23 = iArr2[3];
                                    if (i23 >= i18) {
                                        break;
                                    }
                                    iArr2[3] = i23 + 1;
                                    i22++;
                                }
                                if (i22 != i9 && iArr2[3] < i18) {
                                    while (i22 < i9 && qk0Var.b(i22, i17)) {
                                        int i24 = iArr2[4];
                                        if (i24 >= i18) {
                                            break;
                                        }
                                        iArr2[4] = i24 + 1;
                                        i22++;
                                    }
                                    int i25 = iArr2[4];
                                    if (i25 < i18 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c]) + iArr2[3]) + i25) - i6) * 5 < i6 && s(iArr2)) {
                                        f2 = m(iArr2, i22);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f4 = f2;
            if (!Float.isNaN(f4)) {
                int i26 = (int) f4;
                Arrays.fill(iArr2, 0);
                int i27 = 0;
                while (i17 >= i27 && i26 >= i27) {
                    r16 = z;
                    if (!qk0Var.b(i26 - i27, i17 - i27)) {
                        break;
                    }
                    iArr2[c] = iArr2[c] + 1;
                    i27++;
                    z = r16 == true ? 1 : 0;
                }
                r16 = z;
                if (iArr2[c] != 0) {
                    while (i17 >= i27 && i26 >= i27 && !qk0Var.b(i26 - i27, i17 - i27)) {
                        iArr2[1] = iArr2[1] + 1;
                        i27++;
                    }
                    if (iArr2[1] != 0) {
                        while (i17 >= i27 && i26 >= i27 && qk0Var.b(i26 - i27, i17 - i27)) {
                            iArr2[r16] = iArr2[r16] + 1;
                            i27++;
                        }
                        if (iArr2[r16] != 0) {
                            int i28 = qk0Var.b;
                            int i29 = 1;
                            while (true) {
                                int i30 = i17 + i29;
                                c2 = c4;
                                if (i30 >= i28 || (i5 = i26 + i29) >= i9 || !qk0Var.b(i5, i30)) {
                                    break;
                                }
                                iArr2[c] = iArr2[c] + 1;
                                i29++;
                                c4 = c2;
                            }
                            while (true) {
                                int i31 = i17 + i29;
                                if (i31 >= i28 || (i4 = i26 + i29) >= i9 || qk0Var.b(i4, i31)) {
                                    break;
                                }
                                iArr2[c2] = iArr2[c2] + 1;
                                i29++;
                            }
                            if (iArr2[c2] != 0) {
                                while (true) {
                                    int i32 = i17 + i29;
                                    if (i32 >= i28 || (i3 = i26 + i29) >= i9 || !qk0Var.b(i3, i32)) {
                                        break;
                                    }
                                    iArr2[4] = iArr2[4] + 1;
                                    i29++;
                                }
                                if (iArr2[4] != 0) {
                                    int i33 = r16;
                                    int i34 = i33;
                                    while (i33 < 5) {
                                        int i35 = iArr2[i33];
                                        if (i35 != 0) {
                                            i34 += i35;
                                            i33++;
                                        } else {
                                            return r16;
                                        }
                                    }
                                    if (i34 >= 7) {
                                        float f5 = i34 / 7.0f;
                                        float f6 = f5 / 1.333f;
                                        if (Math.abs(f5 - iArr2[r16]) < f6 && Math.abs(f5 - iArr2[1]) < f6 && Math.abs((f5 * 3.0f) - iArr2[c]) < 3.0f * f6 && Math.abs(f5 - iArr2[c2]) < f6 && Math.abs(f5 - iArr2[4]) < f6) {
                                            float f7 = i6 / 7.0f;
                                            for (int i36 = r16; i36 < arrayList.size(); i36++) {
                                                wh4 wh4Var = (wh4) arrayList.get(i36);
                                                float f8 = wh4Var.c;
                                                float f9 = wh4Var.a;
                                                float f10 = wh4Var.b;
                                                if (Math.abs(f3 - f10) <= f7 && Math.abs(f4 - f9) <= f7) {
                                                    float abs = Math.abs(f7 - f8);
                                                    if (abs <= 1.0f || abs <= f8) {
                                                        int i37 = wh4Var.d;
                                                        int i38 = i37 + 1;
                                                        float f11 = i37;
                                                        float f12 = (f9 * f11) + f4;
                                                        float f13 = i38;
                                                        arrayList.set(i36, new wh4(f12 / f13, b10.y(f11, f10, f3, f13), b10.y(f11, wh4Var.c, f7, f13), i38));
                                                        return true;
                                                    }
                                                }
                                            }
                                            arrayList.add(new wh4(f4, f3, f7, 1));
                                            return true;
                                        }
                                        return r16;
                                    }
                                    return r16;
                                }
                                return r16;
                            }
                            return r16;
                        }
                        return r16;
                    }
                    return r16;
                }
                return r16;
            }
        }
        return false;
    }

    public final boolean x() {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        float f3 = 0.0f;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            wh4 wh4Var = (wh4) obj;
            if (wh4Var.d >= 2) {
                i++;
                f3 += wh4Var.c;
            }
        }
        if (i >= 3) {
            float f4 = f3 / size;
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList.get(i3);
                i3++;
                f2 += Math.abs(((wh4) obj2).c - f4);
            }
            if (f2 <= f3 * 0.05f) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void y() {
        if (this.a) {
            return;
        }
        Boolean A = A();
        this.c = A;
        if (A == null) {
            ((l54) ((jcb) this.b)).a(new h64((byte) 20));
        }
        this.a = true;
    }

    public final synchronized boolean z() {
        boolean h;
        y();
        Boolean bool = (Boolean) this.c;
        if (bool != null) {
            h = bool.booleanValue();
        } else {
            h = ((FirebaseMessaging) this.d).a.h();
        }
        return h;
    }

    @Override
    public final void e() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void i(Editable editable) {
    }

    public yh4(u84 u84Var, tcb tcbVar) {
        this.b = u84Var;
        this.c = tcbVar;
        this.d = new SparseArray();
    }

    public yh4(qk0 qk0Var, byte b) {
        switch (b) {
            case 3:
                int i = qk0Var.b;
                if (i >= 21 && (i & 3) == 1) {
                    this.b = qk0Var;
                    return;
                }
                throw ho4.a();
            default:
                this.b = qk0Var;
                this.c = new ArrayList();
                this.d = new int[5];
                return;
        }
    }

    public yh4(byte b) {
        switch (b) {
            case 13:
                this.b = new Object();
                this.c = new ArrayDeque();
                this.d = new AtomicReference();
                return;
            default:
                this.b = new wm4();
                return;
        }
    }

    public yh4(jd4 jd4Var, boolean z) {
        this.d = jd4Var;
        this.c = new AtomicReference(null);
        this.a = z;
        this.b = new AtomicMarkableReference(new qx5(z ? 8192 : 1024), false);
    }
}
