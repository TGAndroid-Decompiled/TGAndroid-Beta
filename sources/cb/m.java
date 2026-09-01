package cb;

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
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.emoji2.text.w;
import com.google.firebase.messaging.FirebaseMessaging;
import g5.e0;
import g5.u0;
import h5.d0;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.CharsetEncoder;
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
import o3.b0;
import oh.h3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.pr;
import org.telegram.ui.a1;
import org.telegram.ui.e5;
import org.telegram.ui.u4;
import org.telegram.ui.x4;
import org.telegram.ui.yh;
import org.telegram.ui.z4;
import r0.j0;
import s8.n0;
public final class m {
    public static m f2423e;
    public boolean f2424a;
    public Object f2425b;
    public Object f2426c;
    public Object d;

    public m(View view) {
        hu[] huVarArr = {new hu(), new hu(), new hu()};
        this.f2425b = huVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2426c = animatorSet;
        animatorSet.playTogether(g(huVarArr[0], 0, 255, 0, 300), g(huVarArr[1], 0, 255, 150, 300), g(huVarArr[2], 0, 255, 300, 300), g(huVarArr[0], 255, 0, 1000, 400), g(huVarArr[1], 255, 0, 1000, 400), g(huVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new h3(this, view));
    }

    public static void a(vb.e[][][] eVarArr, int i10, vb.e eVar) {
        vb.e[] eVarArr2 = eVarArr[i10 + eVar.d][eVar.f48955c];
        tb.d dVar = eVar.f48953a;
        int ordinal = dVar.ordinal();
        char c3 = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        c3 = 0;
                    } else {
                        throw new IllegalStateException("Illegal mode " + dVar);
                    }
                } else {
                    c3 = 3;
                }
            } else {
                c3 = 1;
            }
        }
        vb.e eVar2 = eVarArr2[c3];
        if (eVar2 != null && eVar2.f48957f <= eVar.f48957f) {
            return;
        }
        eVarArr2[c3] = eVar;
    }

    public static boolean d(tb.d dVar, char c3) {
        int i10;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return vb.c.b(String.valueOf(c3));
                    }
                    return false;
                }
            } else {
                int[] iArr = vb.c.f48948a;
                if (c3 < '`') {
                    i10 = iArr[c3];
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    return false;
                }
            }
        } else if (c3 < '0' || c3 > '9') {
            return false;
        }
        return true;
    }

    public static boolean e(z4 z4Var) {
        if (z4Var.f43806a == null && z4Var.f43807b == null) {
            return false;
        }
        return true;
    }

    public static byte[] j(g5.u uVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        u0 u0Var = new u0(uVar.createDataSource());
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        h5.a.k(parse, "The uri must be set.");
        g5.p pVar = new g5.p(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        g5.p pVar2 = pVar;
        int i11 = 0;
        while (true) {
            try {
                g5.o oVar = new g5.o(u0Var, pVar2);
                try {
                    byte[] Q = d0.Q(oVar);
                    try {
                        oVar.close();
                    } catch (IOException unused) {
                    }
                    return Q;
                } catch (e0 e6) {
                    int i12 = e6.d;
                    String str2 = null;
                    if ((i12 == 307 || i12 == 308) && i11 < 5 && (map2 = e6.f6851e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(i10);
                    }
                    if (str2 != null) {
                        i11++;
                        c4.c a2 = pVar2.a();
                        a2.f2244e = Uri.parse(str2);
                        pVar2 = a2.d();
                        int i13 = d0.f7237a;
                        try {
                            oVar.close();
                        } catch (IOException unused2) {
                        }
                    } else {
                        throw e6;
                    }
                }
            } catch (Exception e10) {
                Uri uri = u0Var.f6950c;
                uri.getClass();
                throw new b0(pVar, uri, u0Var.f6948a.getResponseHeaders(), u0Var.f6949b, e10);
            }
        }
    }

    public static m l() {
        if (f2423e == null) {
            f2423e = new Object();
        }
        return f2423e;
    }

    public static tb.e m(int i10) {
        int c3 = m1.j.c(i10);
        if (c3 != 0) {
            if (c3 != 1) {
                return tb.e.c(40);
            }
            return tb.e.c(26);
        }
        return tb.e.c(9);
    }

    public void b(tb.e r13, vb.e[][][] r14, int r15, vb.e r16) {
        throw new UnsupportedOperationException("Method not decompiled: cb.m.b(tb.e, vb.e[][][], int, vb.e):void");
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f2426c).start();
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public int f(int i10, int i11, int i12) {
        boolean b10;
        pb.b bVar = (pb.b) this.f2425b;
        if (this.f2424a) {
            b10 = bVar.b(i11, i10);
        } else {
            b10 = bVar.b(i10, i11);
        }
        if (b10) {
            return (i12 << 1) | 1;
        }
        return i12 << 1;
    }

    public ValueAnimator g(hu huVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new bg.a(14, this, huVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(pr.f30183f);
        return ofInt;
    }

    public s5.m h(tb.e eVar) {
        int i10;
        String str = (String) this.f2425b;
        int length = str.length();
        pb.e eVar2 = (pb.e) this.f2426c;
        CharsetEncoder[] charsetEncoderArr = eVar2.f44269a;
        CharsetEncoder[] charsetEncoderArr2 = eVar2.f44269a;
        vb.e[][][] eVarArr = (vb.e[][][]) Array.newInstance(vb.e.class, length + 1, charsetEncoderArr.length, 4);
        b(eVar, eVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    vb.e eVar3 = eVarArr[i11][i12][i13];
                    if (eVar3 != null && i11 < length) {
                        b(eVar, eVarArr, i11, eVar3);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = -1;
        int i16 = Integer.MAX_VALUE;
        for (int i17 = 0; i17 < charsetEncoderArr2.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                vb.e eVar4 = eVarArr[length][i17][i18];
                if (eVar4 != null && (i10 = eVar4.f48957f) < i16) {
                    i14 = i17;
                    i15 = i18;
                    i16 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new s5.m(this, eVar, eVarArr[length][i14][i15]);
        }
        throw new Exception(android.support.v4.media.a.o("Internal error: failed to encode \"", str, "\""));
    }

    public byte[] i(UUID uuid, o3.t tVar) {
        String str;
        String str2 = tVar.f16417b;
        if (this.f2424a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f2426c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = j3.h.f9165e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (j3.h.f9164c.equals(uuid)) {
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
            return j((g5.u) this.f2425b, str2, tVar.f16416a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        h5.a.k(uri, "The uri must be set.");
        throw new b0(new g5.p(uri, 1, null, map, 0L, -1L, null, 0), uri, n0.h, 0L, new IllegalStateException("No license URL"));
    }

    public byte[] k(o3.u uVar) {
        return j((g5.u) this.f2425b, uVar.f16419b + "&signedRequest=" + d0.m(uVar.f16418a), null, Collections.EMPTY_MAP);
    }

    public synchronized void n() {
        try {
            if (this.f2424a) {
                return;
            }
            Boolean p10 = p();
            this.f2426c = p10;
            if (p10 == null) {
                ((c9.n) ((y9.b) this.f2425b)).a(new w(12));
            }
            this.f2424a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean o() {
        boolean h;
        try {
            n();
            Boolean bool = (Boolean) this.f2426c;
            if (bool != null) {
                h = bool.booleanValue();
            } else {
                h = ((FirebaseMessaging) this.d).f4009a.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h;
    }

    public Boolean p() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        w8.g gVar = ((FirebaseMessaging) this.d).f4009a;
        gVar.a();
        Context context = gVar.f49452a;
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

    public tb.c q() {
        tb.c cVar = (tb.c) this.d;
        if (cVar != null) {
            return cVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = f(i12, 8, i11);
        }
        int f10 = f(8, 7, f(8, 8, f(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            f10 = f(8, i13, f10);
        }
        int i14 = ((pb.b) this.f2425b).f44256b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = f(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = f(i17, 8, i10);
        }
        tb.c a2 = tb.c.a(f10, i10);
        if (a2 == null) {
            a2 = tb.c.a(f10 ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw ob.c.a();
    }

    public tb.e r() {
        tb.e eVar = (tb.e) this.f2426c;
        if (eVar != null) {
            return eVar;
        }
        int i10 = ((pb.b) this.f2425b).f44256b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return tb.e.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = f(i16, i15, i14);
            }
        }
        tb.e b10 = tb.e.b(i14);
        if (b10 != null && (b10.f48052a * 4) + 17 == i10) {
            this.f2426c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = f(i17, i18, i13);
            }
        }
        tb.e b11 = tb.e.b(i13);
        if (b11 != null && (b11.f48052a * 4) + 17 == i10) {
            this.f2426c = b11;
            return b11;
        }
        throw ob.c.a();
    }

    public void s() {
        if (((tb.c) this.d) != null) {
            int i10 = m1.j.d(8)[((tb.c) this.d).f48039b];
            pb.b bVar = (pb.b) this.f2425b;
            int i11 = bVar.f44256b;
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (yh.b(i10, i12, i13)) {
                        bVar.a(i13, i12);
                    }
                }
            }
        }
    }

    public void t(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f2426c).cancel();
        }
    }

    public boolean u(String str, String str2) {
        synchronized (this) {
            try {
                if (!((j9.d) ((AtomicMarkableReference) this.f2425b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f2425b;
                atomicMarkableReference.set((j9.d) atomicMarkableReference.getReference(), true);
                j9.o oVar = new j9.o(this, 1);
                AtomicReference atomicReference = (AtomicReference) this.d;
                while (!atomicReference.compareAndSet(null, oVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((sf.e) ((r3) this.f2426c).f13328b).H(oVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void v(ViewGroup viewGroup, g6 g6Var, z4 z4Var, x4 x4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.f2425b) != viewGroup) {
            if (this.f2424a) {
                int i10 = e5.C;
                ((u4) this.d).b(false);
            }
            this.f2425b = viewGroup;
            this.f2426c = (WindowManager) f0.e.f(context, WindowManager.class);
            u4 u4Var = new u4(this, context, g6Var, x4Var);
            this.d = u4Var;
            a1 a1Var = new a1(this, 3);
            WeakHashMap weakHashMap = j0.f46438a;
            r0.b0.j(u4Var, a1Var);
        }
        ((u4) this.d).a(z4Var);
        if (!this.f2424a) {
            if (((u4) this.d).getParent() != null) {
                ((WindowManager) this.f2426c).removeView((u4) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.f2426c, (u4) this.d, layoutParams);
            ((WindowManager) this.f2426c).addView((u4) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.f2424a = true;
        }
    }

    public void w(Runnable runnable, Executor executor) {
        synchronized (this.f2425b) {
            try {
                if (this.f2424a) {
                    ((ArrayDeque) this.f2426c).add(new u(runnable, executor));
                    return;
                }
                this.f2424a = true;
                z(runnable, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x(SpannableString spannableString, int i10) {
        hu[] huVarArr = (hu[]) this.f2425b;
        int i11 = i10 + 1;
        spannableString.setSpan(huVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(huVarArr[1], i11, i12, 0);
        spannableString.setSpan(huVarArr[2], i12, i10 + 3, 0);
    }

    public void y() {
        synchronized (this.f2425b) {
            try {
                if (((ArrayDeque) this.f2426c).isEmpty()) {
                    this.f2424a = false;
                    return;
                }
                u uVar = (u) ((ArrayDeque) this.f2426c).remove();
                z(uVar.f2444b, uVar.f2443a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(Runnable runnable, Executor executor) {
        try {
            executor.execute(new androidx.biometric.k(this, runnable, false, 4));
        } catch (RejectedExecutionException unused) {
            y();
        }
    }

    public m(r3 r3Var, boolean z4) {
        this.f2426c = r3Var;
        this.d = new AtomicReference(null);
        this.f2424a = z4;
        this.f2425b = new AtomicMarkableReference(new j9.d(z4 ? 8192 : 1024), false);
    }
}
