package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.Window;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.d;
public final class lj9 implements gj, r07, gv0, zu9, aha, sc7, b07, ir9, ws1, f48, ia8, qac, ze4, SuccessContinuation, hk4, lm3 {
    public static lj9 c;
    public static final mj9 d = new mj9(0, 0, 0, false, false);
    public static final Object e = new Object();
    public static volatile lj9 f;
    public final byte a;
    public Object b;

    public lj9(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.b = new LongSparseArray();
                return;
            case 21:
                this.b = new LinkedHashMap();
                return;
            default:
                this.b = new tg2[oj.values().length];
                return;
        }
    }

    public static lj9 A(Context context) {
        lj9 lj9Var;
        synchronized (e) {
            if (f == null) {
                Context applicationContext = context.getApplicationContext();
                lj9 lj9Var2 = new lj9((byte) 1, false);
                sk4 sk4Var = new sk4((byte) 8, false);
                sk4Var.b = applicationContext;
                sk4Var.c = applicationContext.getContentResolver();
                lj9Var2.b = sk4Var;
                f = lj9Var2;
            }
            lj9Var = f;
        }
        return lj9Var;
    }

    public static synchronized lj9 z() {
        lj9 lj9Var;
        synchronized (lj9.class) {
            lj9Var = c;
            if (lj9Var == null) {
                lj9Var = new lj9((byte) 0, false);
                c = lj9Var;
            }
        }
        return lj9Var;
    }

    @Override
    public final boolean D(yz6 yz6Var) {
        switch (this.a) {
            case 3:
                b9 b9Var = (b9) this.b;
                if (yz6Var != b9Var.c) {
                    c07 c07Var = ((bab) yz6Var).A;
                    r07 r07Var = b9Var.e;
                    if (r07Var != null) {
                        return r07Var.D(yz6Var);
                    }
                }
                return false;
            default:
                Window.Callback callback = ((bp) this.b).f.getCallback();
                if (callback != null) {
                    callback.onMenuOpened(108, yz6Var);
                    return true;
                }
                return true;
        }
    }

    public final boolean E(mw6 mw6Var) {
        sk4 sk4Var = (sk4) this.b;
        pw6 pw6Var = mw6Var.a;
        sk4Var.getClass();
        int i = pw6Var.c;
        String str = pw6Var.a;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = ((Context) sk4Var.b).getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i2 < 28) {
                        i = applicationInfo.uid;
                    }
                    if (i != 1000 && i != Process.myUid() && !sk4Var.B(pw6Var, "android.permission.STATUS_BAR_SERVICE") && !sk4Var.B(pw6Var, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) sk4Var.c, "enabled_notification_listeners");
                        if (string != null) {
                            for (String str2 : string.split(":")) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            lad.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public final ah2 F() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ah2 ah2Var : ((LinkedHashMap) this.b).values()) {
            arrayList.add(ah2Var.b);
            arrayList2.add(ah2Var.c);
            arrayList3.add(ah2Var.d);
            arrayList4.add(ah2Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        if (j == i) {
            z = true;
        } else {
            z = false;
        }
        gre.d(j, "the total number of elements (%s) in the arrays must fit in an int", z);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new ah2(iArr3, zne.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), zne.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), zne.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    public final void G(long j, long j2, long j3, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j2);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j2, longSparseArray3);
        }
        longSparseArray3.get(j3);
        longSparseArray3.put(j3, obj);
    }

    public final Object H(long j, long j2, long j3) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j2)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j3);
        longSparseArray.remove(j3);
        return obj;
    }

    public final float I(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        lj9 lj9Var;
        int i13;
        boolean z3 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i14 = 2;
        int i15 = (-abs) / 2;
        int i16 = -1;
        if (i5 < i7) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i6 < i8) {
            i16 = 1;
        }
        int i17 = i7 + i9;
        int i18 = i5;
        int i19 = i6;
        int i20 = 0;
        while (true) {
            if (i18 != i17) {
                if (z) {
                    i12 = i18;
                    i11 = i19;
                } else {
                    i11 = i18;
                    i12 = i19;
                }
                boolean z4 = z;
                if (i20 == z3) {
                    z2 = z3;
                    i13 = abs;
                    lj9Var = this;
                } else {
                    z2 = false;
                    lj9Var = this;
                    i13 = abs;
                }
                if (z2 == ((qj0) lj9Var.b).b(i11, i12)) {
                    if (i20 == 2) {
                        return loe.b(i18, i19, i5, i6);
                    }
                    i20++;
                }
                i15 += abs2;
                if (i15 > 0) {
                    if (i19 == i8) {
                        i10 = 2;
                        break;
                    }
                    i19 += i16;
                    i15 -= i13;
                }
                i18 += i9;
                abs = i13;
                z = z4;
                z3 = true;
                i14 = 2;
            } else {
                i10 = i14;
                break;
            }
        }
        if (i20 == i10) {
            return loe.b(i17, i8, i5, i6);
        }
        return Float.NaN;
    }

    public final float J(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        qj0 qj0Var = (qj0) this.b;
        float I = I(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f2 = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = qj0Var.a;
            if (i5 >= i7) {
                int i8 = i7 - 1;
                f2 = ((i7 - 1) - i) / (i5 - i);
                i5 = i8;
            } else {
                f2 = 1.0f;
            }
        }
        float f4 = i2;
        int i9 = (int) (f4 - ((i4 - i2) * f2));
        if (i9 < 0) {
            f3 = f4 / (i2 - i9);
        } else {
            int i10 = qj0Var.b;
            if (i9 >= i10) {
                f3 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f3 = 1.0f;
            }
        }
        return (I(i, i2, (int) (((i5 - i) * f3) + i), i6) + I) - 1.0f;
    }

    @Override
    public final void J1(RectF rectF) {
        rectF.set(((jjc) this.b).R);
    }

    @Override
    public final float P() {
        return b00.c(9.66f, dg0.d(((r61) this.b).Q), 0);
    }

    @Override
    public final int Q() {
        return ((r61) this.b).R;
    }

    @Override
    public final void a(int i, boolean z) {
        kg1 kg1Var = ((ig1) this.b).f;
        kg1Var.E = i;
        kg1Var.d(true);
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final boolean b(se4 se4Var) {
        return false;
    }

    @Override
    public final void d(yz6 yz6Var, boolean z) {
        switch (this.a) {
            case 3:
                if (yz6Var instanceof bab) {
                    ((bab) yz6Var).z.k().c(false);
                }
                r07 r07Var = ((b9) this.b).e;
                if (r07Var != null) {
                    r07Var.d(yz6Var, z);
                    return;
                }
                return;
            default:
                ((bp) this.b).g(yz6Var);
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        i20 i20Var = (i20) this.b;
        return k96.a0("AccDescrPlayerDuration", null, 2131754805, k96.G(i20Var.w2 / 60, "Minutes", new Object[0]) + ' ' + k96.G(i20Var.w2 % 60, "Seconds", new Object[0]), k96.G(i20Var.x2 / 60, "Minutes", new Object[0]) + ' ' + k96.G(i20Var.x2 % 60, "Seconds", new Object[0]));
    }

    @Override
    public final Object h(ik4 ik4Var, fw2 fw2Var) {
        Object h = ((sk4) this.b).h(new g73(ik4Var, (byte) 0), fw2Var);
        if (h == bx2.a) {
            return h;
        }
        return g5c.a;
    }

    @Override
    public final void i(yz6 yz6Var, c07 c07Var) {
        ((xc1) this.b).f.removeCallbacksAndMessages(yz6Var);
    }

    @Override
    public final void invalidate() {
        ((gb2) ((ya2) this.b).b).invalidate();
    }

    @Override
    public final void j(boolean z, float f2) {
        if (z) {
            MediaController.w().h0(MediaController.w().v0, f2);
        }
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && k27Var.I3()) {
            ((i20) this.b).W0(k27Var, false);
        }
    }

    @Override
    public final void k(boolean z) {
        b81 b81Var = (b81) this.b;
        b81Var.finishFragment();
        if (b81.n0(b81Var) != null && b81.o0(b81Var).getFragmentStack().size() >= 2) {
            d dVar = (d) b81.q0(b81Var).getFragmentStack().get(b81.p0(b81Var).getFragmentStack().size() - 2);
            if (dVar instanceof mu1) {
                ((mu1) dVar).d6(b81Var.Q, b81Var.R + 86400, z);
                return;
            }
            return;
        }
        mu1 mu1Var = b81Var.O;
        if (mu1Var != null) {
            mu1Var.d6(b81Var.Q, b81Var.R + 86400, z);
        }
    }

    @Override
    public final void m(String str) {
        ((mu1) ((bn0) this.b).c).ia(str, false);
    }

    @Override
    public final void n(k27 k27Var) {
        eo2 eo2Var = (eo2) this.b;
        eo2Var.t1.presentFragment(tt9.M(eo2Var.a, k27Var));
        eo2Var.dismiss();
    }

    @Override
    public final void o(boolean z) {
        fm0 fm0Var = ((r61) this.b).U;
        if (fm0Var != null && fm0Var.f != z) {
            fm0Var.a(z, true);
        }
    }

    @Override
    public final void q(yz6 yz6Var, c07 c07Var) {
        xc1 xc1Var = (xc1) this.b;
        Handler handler = xc1Var.f;
        wc1 wc1Var = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = xc1Var.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (yz6Var == ((wc1) arrayList.get(i)).b) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            wc1Var = (wc1) arrayList.get(i2);
        }
        handler.postAtTime(new vc1(this, wc1Var, c07Var, yz6Var), yz6Var, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public final boolean q2(int i, View view) {
        return false;
    }

    @Override
    public final void r() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            ((mu1) this.b).startActivityForResult(createChooser, 1);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        switch (this.a) {
            case 2:
                a1 a1Var = (a1) this.b;
                a1Var.l1(i, i2, z);
                a1Var.dismiss();
                return;
            default:
                gl.d3(new eg(this, i, (byte) 6), 50L);
                return;
        }
    }

    @Override
    public final void s1(boolean z) {
        ((jjc) this.b).setLanguagePillHidden(z);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final Task then(Object obj) {
        q7a q7aVar = (q7a) obj;
        dy2 dy2Var = ((by2) this.b).e;
        if (q7aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        yx2 yx2Var = dy2.r;
        return Tasks.whenAll(dy2Var.h(), dy2Var.m.h((pz2) dy2Var.e.b, null));
    }

    public final void u(ah2 ah2Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = ah2Var.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(ah2Var.e[0]), ah2Var);
        }
    }

    public final float v(vf4 vf4Var, vf4 vf4Var2) {
        int i = (int) vf4Var.b;
        int i2 = (int) vf4Var2.b;
        float J = J((int) vf4Var.a, i, (int) vf4Var2.a, i2);
        float J2 = J((int) vf4Var2.a, i2, (int) vf4Var.a, i);
        if (Float.isNaN(J)) {
            return J2 / 7.0f;
        }
        if (Float.isNaN(J2)) {
            return J / 7.0f;
        }
        return (J + J2) / 14.0f;
    }

    public final kj w(float f2, float f3, int i, int i2) {
        int i3;
        kj b;
        kj b2;
        int i4 = (int) (f3 * f2);
        int max = Math.max(0, i - i4);
        qj0 qj0Var = (qj0) this.b;
        int min = Math.min(qj0Var.a - 1, i + i4) - max;
        float f4 = 3.0f * f2;
        if (min >= f4) {
            int max2 = Math.max(0, i2 - i4);
            int min2 = Math.min(qj0Var.b - 1, i2 + i4) - max2;
            if (min2 >= f4) {
                qj0 qj0Var2 = (qj0) this.b;
                lj ljVar = new lj(qj0Var2, max, max2, min, min2, f2);
                int i5 = ljVar.e;
                int i6 = ljVar.c;
                int i7 = i5 + i6;
                int i8 = ljVar.f;
                int i9 = (i8 / 2) + ljVar.d;
                int[] iArr = new int[3];
                for (int i10 = 0; i10 < i8; i10++) {
                    if ((i10 & 1) == 0) {
                        i3 = (i10 + 1) / 2;
                    } else {
                        i3 = -((i10 + 1) / 2);
                    }
                    int i11 = i3 + i9;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i12 = i6;
                    while (i12 < i7 && !qj0Var2.b(i12, i11)) {
                        i12++;
                    }
                    int i13 = 0;
                    while (i12 < i7) {
                        if (qj0Var2.b(i12, i11)) {
                            if (i13 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i13 == 2) {
                                if (ljVar.a(iArr) && (b2 = ljVar.b(i11, i12, iArr)) != null) {
                                    return b2;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i13 = 1;
                            } else {
                                i13++;
                                iArr[i13] = iArr[i13] + 1;
                            }
                        } else {
                            if (i13 == 1) {
                                i13++;
                            }
                            iArr[i13] = iArr[i13] + 1;
                        }
                        i12++;
                    }
                    if (ljVar.a(iArr) && (b = ljVar.b(i11, i7, iArr)) != null) {
                        return b;
                    }
                }
                ArrayList arrayList = ljVar.b;
                if (!arrayList.isEmpty()) {
                    return (kj) arrayList.get(0);
                }
                throw uj7.a();
            }
            throw uj7.a();
        }
        throw uj7.a();
    }

    @Override
    public final jjc w2() {
        return (jjc) this.b;
    }

    public final LongSparseArray x(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j2);
    }

    @Override
    public final void B() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void e(ArrayList arrayList) {
    }

    @Override
    public final void g(float f2) {
    }

    @Override
    public final void p(int i) {
    }

    @Override
    public final void l(boolean z, boolean z2) {
    }

    public lj9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public lj9(yi5 yi5Var) {
        this.a = (byte) 9;
        fre.h(yi5Var);
        this.b = yi5Var;
    }

    public lj9(by2 by2Var, String str) {
        this.a = (byte) 23;
        this.b = by2Var;
    }

    public lj9(byte b, boolean z) {
        this.a = b;
    }

    @Override
    public final void f(k27 k27Var, View view, int i) {
    }
}
