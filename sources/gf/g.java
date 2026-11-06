package gf;

import a8.r9;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.tasks.TaskCompletionSource;
import gb.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import jg.x1;
import jg.y1;
import l.d0;
import l.w;
import li.b2;
import li.f2;
import li.g1;
import li.i0;
import li.m3;
import li.s4;
import li.t3;
import li.x;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ab;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.gu;
import org.telegram.messenger.h0;
import org.telegram.messenger.hd;
import org.telegram.messenger.hu;
import org.telegram.messenger.ij;
import org.telegram.messenger.kv;
import org.telegram.messenger.l0;
import org.telegram.messenger.o0;
import org.telegram.messenger.ta;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.b61;
import org.telegram.ui.hw;
import org.telegram.ui.rz;
import org.telegram.ui.xz;
import w7.s;
public final class g implements i6.a, xz, y1, com.google.android.gms.common.api.internal.p, im0, t4, i0, w, m.l, ce.c, o0.a, ta, ab, ue.a, lm0 {
    public final int f13888a;
    public Object f13889b;

    public g(int i7) {
        this.f13888a = i7;
    }

    @Override
    public boolean A(l.k kVar) {
        m.i iVar = (m.i) this.f13889b;
        if (kVar == iVar.f19121c) {
            return false;
        }
        ((d0) kVar).A.getClass();
        iVar.getClass();
        w wVar = iVar.f19122e;
        if (wVar == null) {
            return false;
        }
        return wVar.A(kVar);
    }

    @Override
    public Object B(ce.d dVar, kd.c cVar) {
        Object B = ((q4.q) this.f13889b).B(new a1(dVar, 1), cVar);
        if (B == jd.a.f16643a) {
            return B;
        }
        return gd.k.f13829a;
    }

    public float C(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        cc.b bVar = (cc.b) this.f13889b;
        float z9 = z(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.f6044a;
            if (i13 >= i15) {
                int i16 = i15 - 1;
                f10 = ((i15 - 1) - i7) / (i13 - i7);
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f12 = i10;
        int i17 = (int) (f12 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f12 / (i10 - i17);
        } else {
            int i18 = bVar.f6045b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (z(i7, i10, (int) (((i13 - i7) * f11) + i7), i14) + z9) - 1.0f;
    }

    @Override
    public Cursor C0(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13889b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override
    public void D() {
        int i7 = this.f13888a;
    }

    public void E() {
        h6.h hVar = (h6.h) this.f13889b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f14253i.iterator();
            while (it2.hasNext()) {
                ((h6.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public void H0() {
        hu huVar = (hu) this.f13889b;
        hu.j0(huVar, null);
        huVar.f22986a0 = null;
    }

    @Override
    public void I0(CharSequence charSequence) {
        m3 m3Var = ((s4) this.f13889b).N;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                m3Var.f18698a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        ((b2) this.f13889b).x0(i7, i10, z9);
    }

    @Override
    public void L1() {
        s4 s4Var = (s4) this.f13889b;
        m3 m3Var = s4Var.N;
        if (m3Var != null) {
            li.a aVar = s4Var.f18986a;
            t3.S1(m3Var.f18698a);
        }
    }

    @Override
    public void O(float f10, float f11) {
        kv kvVar;
        l1 l1Var;
        hu huVar = (hu) this.f13889b;
        gu guVar = huVar.f22986a0;
        if (guVar != null && (l1Var = (kvVar = huVar.f22450a).F) != null) {
            l1Var.b1(kvVar.E, guVar.f22707c);
        }
    }

    @Override
    public h9 S0() {
        return (s4) this.f13889b;
    }

    @Override
    public boolean U0(float f10, float f11) {
        hu huVar = (hu) this.f13889b;
        gu i02 = hu.i0(huVar, f10, f11);
        i02 = (i02 == null || i02.f22706b) ? null : null;
        huVar.f22986a0 = i02;
        if (i02 != null) {
            return true;
        }
        return false;
    }

    @Override
    public li.a V0() {
        return ((s4) this.f13889b).f18986a;
    }

    @Override
    public a0.h X0() {
        switch (this.f13888a) {
            case 7:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void a(float f10) {
        x xVar = (x) this.f13889b;
        ij ijVar = xVar.P;
        if (ijVar == null) {
            return;
        }
        ijVar.f23204b0 = f10;
        MediaController.B().i0(xVar.P, f10);
    }

    @Override
    public boolean a1() {
        s4 s4Var = (s4) this.f13889b;
        m3 m3Var = s4Var.N;
        if (m3Var != null) {
            li.a aVar = s4Var.f18986a;
            if (m3Var.f18698a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        l7.a aVar = new l7.a((TaskCompletionSource) obj2);
        l7.i iVar = (l7.i) ((l7.c) obj).n();
        String str = ((l7.b) this.f13889b).f18195l;
        Parcel L0 = iVar.L0();
        int i7 = l7.f.f18199a;
        L0.writeStrongBinder(aVar);
        L0.writeString(str);
        iVar.M0(L0, 2);
    }

    @Override
    public void b(g1 g1Var) {
        m3 m3Var = ((s4) this.f13889b).N;
        if (m3Var != null) {
            t3 t3Var = m3Var.f18698a;
            t3.Q1(t3Var, g1Var);
            t3Var.f18887o3.r(g1Var, true);
        }
    }

    @Override
    public void c(l.k kVar, boolean z9) {
        if (kVar instanceof d0) {
            ((d0) kVar).f17644z.k().c(false);
        }
        w wVar = ((m.i) this.f13889b).f19122e;
        if (wVar != null) {
            wVar.c(kVar, z9);
        }
    }

    @Override
    public boolean c1(View view, float f10, float f11) {
        hu huVar = (hu) this.f13889b;
        if (huVar.f22986a0 != null) {
            gu i02 = hu.i0(huVar, f10, f11);
            gu guVar = huVar.f22986a0;
            if (i02 == guVar) {
                kv kvVar = huVar.f22450a;
                l1 l1Var = kvVar.F;
                if (l1Var != null) {
                    l1Var.v1(kvVar.E, guVar.f22707c);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13889b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(float f10) {
        ij ijVar = ((x) this.f13889b).P;
        if (ijVar == null) {
            return;
        }
        ijVar.f23204b0 = f10;
    }

    @Override
    public void d1(int i7, int i10) {
        s4 s4Var = (s4) this.f13889b;
        m3 m3Var = s4Var.N;
        if (m3Var != null) {
            li.a aVar = s4Var.f18986a;
            f2 f2Var = m3Var.f18698a.Q3;
            if (f2Var != null) {
                f2Var.f(i7, i10);
            }
        }
    }

    @Override
    public boolean f(rz rzVar) {
        return false;
    }

    @Override
    public void g(ij ijVar) {
        ii.d0 d0Var = (ii.d0) this.f13889b;
        d0Var.f15506q1.presentFragment(fm0.M(d0Var.f28613a, ijVar));
        d0Var.dismiss();
    }

    @Override
    public CharSequence getContentDescription() {
        w10 w10Var;
        switch (this.f13888a) {
            case 26:
                return " ";
            case 27:
                t7 t7Var = (t7) this.f13889b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(t7Var.f30531s)) {
                        sb2.append(t7Var.f30531s);
                    }
                    s7 s7Var = t7Var.f30530r;
                    if (s7Var != null && (w10Var = s7Var.f30277e) != null) {
                        CharSequence charSequence = (CharSequence) w10Var.d(0, Integer.valueOf(t7Var.f30528f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) t7Var.f30530r.f30277e.d(-1, Integer.valueOf(t7Var.f30530r.b()));
                        CharSequence charSequence3 = (CharSequence) t7Var.f30530r.f30277e.d(1, Integer.valueOf(t7Var.f30530r.a()));
                        if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence2);
                            sb2.append(" – ");
                            sb2.append(charSequence3);
                        }
                    }
                    if (sb2.length() <= 0) {
                        return null;
                    }
                    return sb2.toString();
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return t7Var.f30531s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                b8 b8Var = (b8) this.f13889b;
                sb3.append(hd.G(b8Var.f32090t2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(hd.G(b8Var.f32090t2 % 60, "Seconds", new Object[0]));
                String sb4 = sb3.toString();
                return hd.a0("AccDescrPlayerDuration", null, 2131754806, sb4, hd.G(b8Var.f32092u2 / 60, "Minutes", new Object[0]) + ' ' + hd.G(b8Var.f32092u2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public void i1() {
        s4 s4Var = (s4) this.f13889b;
        m3 m3Var = s4Var.N;
        if (m3Var != null) {
            li.a aVar = s4Var.f18986a;
            t3 t3Var = m3Var.f18698a;
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.g();
            }
            t3Var.f18887o3.onContentChanged();
        }
    }

    public float j(hc.c cVar, hc.c cVar2) {
        int i7 = (int) cVar.f3181b;
        int i10 = (int) cVar2.f3181b;
        float C = C((int) cVar.f3180a, i7, (int) cVar2.f3180a, i10);
        float C2 = C((int) cVar2.f3180a, i10, (int) cVar.f3180a, i7);
        if (Float.isNaN(C)) {
            return C2 / 7.0f;
        }
        if (Float.isNaN(C2)) {
            return C / 7.0f;
        }
        return (C + C2) / 14.0f;
    }

    @Override
    public boolean j0() {
        return true;
    }

    public hc.a k(float f10, float f11, int i7, int i10) {
        int i11;
        hc.a b10;
        hc.a b11;
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i7 - i12);
        cc.b bVar = (cc.b) this.f13889b;
        int min = Math.min(bVar.f6044a - 1, i7 + i12) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i10 - i12);
            int min2 = Math.min(bVar.f6045b - 1, i10 + i12) - max2;
            if (min2 >= f12) {
                cc.b bVar2 = (cc.b) this.f13889b;
                hc.b bVar3 = new hc.b(bVar2, max, max2, min, min2, f10);
                int i13 = bVar3.f14459e;
                int i14 = bVar3.f14458c;
                int i15 = i13 + i14;
                int i16 = bVar3.f14460f;
                int i17 = (i16 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i18 = 0; i18 < i16; i18++) {
                    if ((i18 & 1) == 0) {
                        i11 = (i18 + 1) / 2;
                    } else {
                        i11 = -((i18 + 1) / 2);
                    }
                    int i19 = i11 + i17;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i20 = i14;
                    while (i20 < i15 && !bVar2.b(i20, i19)) {
                        i20++;
                    }
                    int i21 = 0;
                    while (i20 < i15) {
                        if (bVar2.b(i20, i19)) {
                            if (i21 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i21 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i21 = 1;
                            } else {
                                i21++;
                                iArr[i21] = iArr[i21] + 1;
                            }
                        } else {
                            if (i21 == 1) {
                                i21++;
                            }
                            iArr[i21] = iArr[i21] + 1;
                        }
                        i20++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f14457b;
                if (!arrayList.isEmpty()) {
                    return (hc.a) arrayList.get(0);
                }
                throw bc.e.a();
            }
            throw bc.e.a();
        }
        throw bc.e.a();
    }

    @Override
    public boolean k1(int i7) {
        switch (this.f13888a) {
            case 7:
                if (i7 == ((yl0) this.f13889b).f16738d0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public void l(boolean z9, float f10) {
        int[] iArr;
        int round;
        switch (this.f13888a) {
            case 26:
                b61 b61Var = (b61) ((org.telegram.ui.Cells.i0) this.f13889b);
                int i7 = (int) (k6.f28082q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                k6.f28082q = f10;
                if (i7 != i10) {
                    ThemeActivity themeActivity = b61Var.f44201f.f45507e;
                    xi0 xi0Var = (xi0) themeActivity.f42009b.K(themeActivity.f42017f0);
                    if (xi0Var != null) {
                        ((z8) xi0Var.f56951a).setText(hd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (k6.f28082q * 100.0f))));
                    }
                    k6.F(true);
                    return;
                }
                return;
            case 27:
                t7 t7Var = (t7) this.f13889b;
                s7 s7Var = t7Var.f30530r;
                if (s7Var != null && t7Var.f30529n != null) {
                    if (s7Var.f30276c != null) {
                        double length = f10 * (iArr.length - 1);
                        int j3 = Utilities.j((int) Math.floor(length), t7Var.f30530r.f30276c.length - 1, 0);
                        int j10 = Utilities.j((int) Math.ceil(length), t7Var.f30530r.f30276c.length - 1, 0);
                        int[] iArr2 = t7Var.f30530r.f30276c;
                        round = Math.round(g0.W1(Math.round(((float) (length - Math.floor(length))) * t7Var.f30530r.d) / t7Var.f30530r.d, iArr2[j3], iArr2[j10]));
                    } else {
                        round = Math.round(((t7Var.f30530r.a() - t7Var.f30530r.b()) * f10) + s7Var.b());
                    }
                    int i11 = t7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = t7Var.f30528f;
                    if (i12 != round) {
                        if (t7Var.c(i12) != t7Var.c(round)) {
                            g0.c4(t7Var.f30527e);
                        }
                        t7Var.f30528f = round;
                        t7Var.e(round, true);
                        c20 c20Var = t7Var.f30529n;
                        if (c20Var != null) {
                            c20Var.a(Integer.valueOf(t7Var.f30528f));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z9) {
                    MediaController.B().i0(MediaController.B().f21292u0, f10);
                }
                ij ijVar = MediaController.B().f21292u0;
                if (ijVar != null && ijVar.J3()) {
                    ((b8) this.f13889b).b1(ijVar, false);
                    return;
                }
                return;
        }
    }

    @Override
    public void m1(ArrayList arrayList) {
        boolean z9;
        switch (this.f13888a) {
            case 7:
                yl0 yl0Var = (yl0) this.f13889b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    yl0Var.J.add(((x1) arrayList.get(i7)).f16978a);
                }
                hw hwVar = yl0Var.U;
                if (hwVar != null) {
                    if (yl0Var.D0 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    hwVar.d(z9, false);
                }
                yl0Var.f();
                return;
            default:
                return;
        }
    }

    public boolean n() {
        return ((h0) this.f13889b).f22774c;
    }

    public StringBuilder o() {
        mf.a aVar = (mf.a) this.f13889b;
        if (aVar instanceof q) {
            StringBuilder sb2 = ((q) aVar).f13949b.f13934b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public boolean o1() {
        return true;
    }

    @Override
    public void p(Bitmap bitmap) {
        ((i6.h) this.f13889b).e(bitmap, 3);
    }

    @Override
    public void q(int i7) {
        boolean z9;
        switch (this.f13888a) {
            case 7:
                yl0 yl0Var = (yl0) this.f13889b;
                yl0Var.D0--;
                yl0Var.f16740e0 = i7;
                if (yl0Var.f16742f0 != i7) {
                    yl0Var.f16756s.clear();
                }
                if (yl0Var.f16743g0 != i7) {
                    yl0Var.I.clear();
                }
                yl0Var.N = true;
                hw hwVar = yl0Var.U;
                if (hwVar != null) {
                    if (yl0Var.D0 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    hwVar.d(z9, true);
                }
                yl0Var.f();
                hw hwVar2 = yl0Var.U;
                if (hwVar2 != null) {
                    hwVar2.c();
                    return;
                }
                return;
            default:
                g0.h3(new fi.h9(this, 25));
                return;
        }
    }

    @Override
    public int q0() {
        switch (this.f13888a) {
            case 26:
                return 0;
            case 27:
                s7 s7Var = ((t7) this.f13889b).f30530r;
                if (s7Var == null) {
                    return 0;
                }
                int[] iArr = s7Var.f30276c;
                if (iArr != null) {
                    return s7Var.d * (iArr.length - 1);
                }
                return s7Var.a() - s7Var.b();
            default:
                return 0;
        }
    }

    @Override
    public void s(float f10, float f11) {
        hu huVar = (hu) this.f13889b;
        gu i02 = hu.i0(huVar, f10, f11);
        gu guVar = huVar.f22986a0;
        if (i02 != guVar) {
            guVar = null;
        }
        hu.j0(huVar, guVar);
    }

    @Override
    public void t() {
        s4 s4Var = (s4) this.f13889b;
        m3 m3Var = s4Var.N;
        if (m3Var != null) {
            t3.T1(m3Var.f18698a, s4Var.f18986a);
        }
    }

    @Override
    public void t0() {
        hu huVar = (hu) this.f13889b;
        hu.j0(huVar, huVar.f22986a0);
    }

    @Override
    public a0.h v0() {
        switch (this.f13888a) {
            case 7:
                return null;
            default:
                return null;
        }
    }

    @Override
    public i9 w0() {
        m3 m3Var = ((s4) this.f13889b).N;
        if (m3Var != null) {
            return m3Var.f18698a.getTextSelectionHelper();
        }
        return null;
    }

    public ia.b y(JSONObject jSONObject) {
        ia.d bVar;
        int i7 = jSONObject.getInt("settings_version");
        if (i7 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.", null);
            bVar = new nb.a(11);
        } else {
            bVar = new pb.b(11);
        }
        return bVar.c((s) this.f13889b, jSONObject);
    }

    public float z(int i7, int i10, int i11, int i12) {
        boolean z9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        g gVar;
        int i21;
        boolean z11 = true;
        if (Math.abs(i12 - i10) > Math.abs(i11 - i7)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = -1;
        if (i13 < i15) {
            i17 = 1;
        } else {
            i17 = -1;
        }
        if (i14 < i16) {
            i24 = 1;
        }
        int i25 = i15 + i17;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 != i25) {
                if (z9) {
                    i19 = i27;
                } else {
                    i19 = i26;
                }
                if (z9) {
                    i20 = i26;
                } else {
                    i20 = i27;
                }
                boolean z12 = z9;
                if (i28 == z11) {
                    z10 = z11;
                    i21 = abs;
                    gVar = this;
                } else {
                    z10 = false;
                    gVar = this;
                    i21 = abs;
                }
                if (z10 == ((cc.b) gVar.f13889b).b(i19, i20)) {
                    if (i28 == 2) {
                        return r9.b(i26, i27, i13, i14);
                    }
                    i28++;
                }
                i23 += abs2;
                if (i23 > 0) {
                    if (i27 == i16) {
                        i18 = 2;
                        break;
                    }
                    i27 += i24;
                    i23 -= i21;
                }
                i26 += i17;
                abs = i21;
                z9 = z12;
                z11 = true;
                i22 = 2;
            } else {
                i18 = i22;
                break;
            }
        }
        if (i28 == i18) {
            return r9.b(i25, i16, i13, i14);
        }
        return Float.NaN;
    }

    public g(Object obj, int i7) {
        this.f13888a = i7;
        this.f13889b = obj;
    }

    public g() {
        this.f13888a = 9;
        this.f13889b = new HashMap();
    }

    public g(String str, long j3) {
        this.f13888a = 21;
        this.f13889b = new l0(str, j3);
    }

    public g(String str, Set set) {
        this.f13888a = 22;
        this.f13889b = new o0(str, set);
    }

    public g(Context context, Uri uri) {
        this.f13888a = 19;
        this.f13889b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g(String str, boolean z9) {
        this.f13888a = 20;
        this.f13889b = new h0(str, z9);
    }

    private final void r() {
    }

    private final void u() {
    }

    private final void v() {
    }

    @Override
    public void e() {
    }

    private final void x(ArrayList arrayList) {
    }

    @Override
    public void h(ij ijVar, View view, int i7) {
    }

    @Override
    public void l1(View view, float f10, float f11) {
    }

    @Override
    public void m(View view, float f10, float f11) {
    }

    @Override
    public void w(View view, float f10, float f11) {
    }
}
