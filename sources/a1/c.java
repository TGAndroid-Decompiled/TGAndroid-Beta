package a1;

import a4.k;
import ag.c3;
import ag.g2;
import ag.h2;
import ag.h3;
import ag.i3;
import ag.j2;
import ag.m3;
import ag.r0;
import ag.z2;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b2.d1;
import b2.u0;
import bb.e0;
import bb.f0;
import bi.a6;
import bi.c0;
import bi.d4;
import bi.k2;
import bi.k3;
import bi.l3;
import bi.n1;
import bi.n4;
import bi.q0;
import bi.q6;
import bi.r5;
import bi.s6;
import bi.y0;
import bi.z5;
import c3.u;
import com.google.android.gms.tasks.OnSuccessListener;
import e2.l0;
import e2.o;
import e9.l1;
import e9.q1;
import e9.s;
import ei.n;
import ei.r;
import h2.i;
import h2.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import n4.q;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.gs;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.o20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.l5;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
import org.telegram.ui.ux;
import v7.u7;
public final class c implements OnSuccessListener, i, o20, u1, i5.e, kt, q0, ux, a6, l1, n, fe.e, c3.g, o {
    public final int f34a;
    public final Object f35b;

    public c(Object obj, int i10) {
        this.f34a = i10;
        this.f35b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public z60 a(n1 n1Var) {
        return z60.H((k2) ((a6.i) this.f35b).f307b, n1Var);
    }

    @Override
    public Object apply(Object obj) {
        ((k6.h) this.f35b).getClass();
        String v = f0.f2556b.v((e0) obj);
        kotlin.jvm.internal.i.d(v, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(v));
        byte[] bytes = v.getBytes(rd.a.f46479a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void b(j jVar) {
        a4.j jVar2 = (a4.j) jVar;
        jVar2.clear();
        ((k) this.f35b).f274b.add(jVar2);
    }

    @Override
    public Object c(Object obj, Object obj2) {
        return s.x((List) ((Collection) obj2), new q(((q1) this.f35b).f6405f, obj));
    }

    public void d(int i10) {
        c0 c0Var = (c0) this.f35b;
        c0Var.f2883c = i10;
        c0Var.e(i10);
    }

    @Override
    public long g(long j10) {
        u uVar = (u) this.f35b;
        return l0.j((j10 * uVar.e) / 1000000, 0L, uVar.f3697j - 1);
    }

    @Override
    public void h(x1 x1Var, int i10) {
        switch (this.f34a) {
            case 4:
                z2 z2Var = (z2) ((ag.e) this.f35b).f489b;
                i3 f7 = i3.f(z2.f0(z2Var));
                ArrayList arrayList = z2Var.f821b;
                int i11 = f7.f566a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f7.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        h3 c10 = f7.c(((Integer) arrayList.get(i13)).intValue());
                        f7.f567b.remove(c10);
                        f7.a(c10.f552b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f551a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new c3(1));
                        if ("hello".equals(c10.f552b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull a2 = vp.r1(i11).a2(d20.i(i11).e());
                            if (a2 != null) {
                                a2.flags2 &= -5;
                                a2.business_greeting_message = null;
                                hs.a0(i11).j2(a2, true);
                            }
                        } else if ("away".equals(c10.f552b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull a22 = vp.r1(i11).a2(d20.i(i11).e());
                            if (a22 != null) {
                                a22.flags2 &= -9;
                                a22.business_away_message = null;
                                hs.a0(i11).j2(a22, true);
                            }
                        }
                    }
                    f7.l();
                    hs a02 = hs.a0(i11);
                    a02.f15938a.c(new r0(a02, arrayList, 1));
                    zs.f(i11).k(121, new Object[0]);
                }
                z2.b0(z2Var);
                return;
            default:
                ((n4) this.f35b).run();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f34a) {
            case 24:
                ((d1) obj).y((b2.f) this.f35b);
                return;
            case 25:
                ((d1) obj).w((b2.u1) this.f35b);
                return;
            case 26:
                ((d1) obj).A((d2.d) this.f35b);
                return;
            case 27:
                ((d1) obj).m(((i2.c0) this.f35b).f7821a.Q);
                return;
            default:
                ((d1) obj).F((u0) this.f35b);
                return;
        }
    }

    @Override
    public void j(int i10) {
        boolean z10;
        int i11;
        ei.b bVar = (ei.b) this.f35b;
        r rVar = bVar.f6597a;
        ei.e eVar = bVar.f6601g;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ArrayList arrayList = eVar.f6629a;
            if (u7.a(i10, 4) || u7.a(i10, 2)) {
                gi.a e = rVar.e();
                ViewGroup viewGroup = bVar.f6605l;
                if (viewGroup != null) {
                    e.b(viewGroup.getY(), bVar.f6604k.getWidth(), bVar.f6605l.getY() + bVar.f6605l.getHeight());
                }
                eVar.f6630b = e.f7532b;
                while (eVar.f6630b > arrayList.size()) {
                    arrayList.add(new ei.c(arrayList.size()));
                }
                for (int i12 = 0; i12 < eVar.f6630b; i12++) {
                    ei.c cVar = (ei.c) arrayList.get(i12);
                    cVar.f6607a.set(e.c(i12));
                    cVar.b(eVar.f6638m, eVar.f6639n, eVar.f6640o);
                    cVar.c(eVar.f6636k);
                    int i13 = eVar.f6641p;
                    int i14 = eVar.f6642q;
                    int i15 = eVar.f6643r;
                    int i16 = eVar.f6644s;
                    cVar.f6624u = i13;
                    cVar.v = i14;
                    cVar.f6625w = i15;
                    cVar.f6626x = i16;
                }
            }
            eVar.f6631c = bVar.f6606m;
            eVar.d = bVar.f6604k;
            int i17 = 1;
            if (rVar.f6676j > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !z10;
            if (eVar.f6637l != z11) {
                eVar.f6637l = z11;
                if (!z10) {
                    i11 = 5;
                } else {
                    i11 = 1;
                }
                eVar.f6638m = i11;
                if (!z10) {
                    i17 = 10;
                }
                eVar.f6639n = i17;
                eVar.f6640o = Math.max(i11, i17);
                for (int i18 = 0; i18 < eVar.f6630b; i18++) {
                    ((ei.c) arrayList.get(i18)).b(eVar.f6638m, eVar.f6639n, eVar.f6640o);
                }
                eVar.f();
            }
            int i19 = rVar.f6677k;
            int i20 = rVar.f6678l;
            eVar.f6645t = i19;
            eVar.f6646u = i20;
            eVar.f();
            eVar.e();
            Runnable runnable = bVar.f6602i;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i10;
        g2 g2Var;
        g2 g2Var2;
        int i11;
        int i12 = this.f34a;
        Object obj3 = this.f35b;
        switch (i12) {
            case 2:
                h2 h2Var = (h2) obj3;
                a51 a51Var = (a51) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                float floatValue = ((Float) serializable).floatValue();
                Float f7 = (Float) serializable2;
                int i13 = a51Var.d;
                if (i13 == -1) {
                    boolean z10 = !h2Var.d;
                    h2Var.d = z10;
                    ((t8) view).setChecked(z10);
                    h2Var.f546a.f30819f3.O(true);
                    h2Var.c0(true);
                    return;
                } else if (i13 == -2) {
                    ?? k2Var = new org.telegram.ui.ActionBar.k2(null);
                    k2Var.f645n = h2Var.f550n;
                    k2Var.f643c = new ag.e0(h2Var, view);
                    h2Var.presentFragment((org.telegram.ui.ActionBar.k2) k2Var);
                    return;
                } else if (a51Var.f7680a == 5 && i13 >= 0 && i13 < h2Var.f549f.length) {
                    if (!cd.X ? floatValue >= view.getMeasuredWidth() - i0.L(76.0f) : floatValue <= i0.L(76.0f)) {
                        if (h2Var.f549f[a51Var.d].isEmpty()) {
                            ((l5) view).setChecked(true);
                            h2Var.f549f[a51Var.d].add(new g2(0, 1439));
                            h2Var.b0(a51Var.d);
                        } else {
                            h2Var.f549f[a51Var.d].clear();
                            ((l5) view).setChecked(false);
                        }
                        ((l5) view).setValue(h2.e0(h2Var.f549f[a51Var.d]));
                        h2Var.c0(true);
                        return;
                    }
                    int i14 = (a51Var.d + 6) % 7;
                    int i15 = 0;
                    for (int i16 = 0; i16 < h2Var.f549f[i14].size(); i16++) {
                        if (((g2) h2Var.f549f[i14].get(i16)).f533b > i15) {
                            i15 = ((g2) h2Var.f549f[i14].get(i16)).f533b;
                        }
                    }
                    int max = Math.max(0, i15 - 1439);
                    int i17 = (a51Var.d + 1) % 7;
                    int i18 = 1440;
                    for (int i19 = 0; i19 < h2Var.f549f[i17].size(); i19++) {
                        if (((g2) h2Var.f549f[i17].get(i19)).f532a < i18) {
                            i18 = ((g2) h2Var.f549f[i17].get(i19)).f532a;
                        }
                    }
                    int i20 = i18 + 1439;
                    CharSequence charSequence = a51Var.f24292l;
                    ArrayList arrayList = h2Var.f549f[a51Var.d];
                    int i21 = 0;
                    for (int i22 = 0; i22 < 7; i22++) {
                        ArrayList arrayList2 = h2Var.f549f[i22];
                        if (arrayList2 != null) {
                            i21 = Math.max(1, arrayList2.size()) + i21;
                        }
                    }
                    j2 j2Var = new j2(charSequence, arrayList, max, i20, 28 - i21);
                    j2Var.f589f = new a3.d(h2Var, 8);
                    j2Var.h = new f(10, h2Var, a51Var);
                    h2Var.presentFragment(j2Var);
                    return;
                } else {
                    return;
                }
            case 3:
                final j2 j2Var2 = (j2) obj3;
                a51 a51Var2 = (a51) obj;
                final View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                int i23 = j2Var2.f588c;
                int i24 = j2Var2.d;
                ArrayList arrayList3 = j2Var2.f587b;
                int i25 = a51Var2.d;
                if (i25 == -1) {
                    j2Var2.f591r = !j2Var2.f591r;
                    arrayList3.clear();
                    if (j2Var2.f591r) {
                        arrayList3.add(new g2(0, 1439));
                    }
                    t8 t8Var = (t8) view2;
                    boolean z11 = j2Var2.f591r;
                    a51Var2.e = z11;
                    t8Var.setChecked(z11);
                    boolean z12 = j2Var2.f591r;
                    if (z12) {
                        i11 = t6.f20966f6;
                    } else {
                        i11 = t6.f20948e6;
                    }
                    t8Var.b(t6.x0(null, i11, false), z12);
                    j2Var2.f590n.f30819f3.O(true);
                    a3.d dVar = j2Var2.f589f;
                    if (dVar != null) {
                        dVar.run();
                        return;
                    }
                    return;
                } else if (i25 == -2) {
                    if (!arrayList3.isEmpty() && !j2Var2.Y()) {
                        int i26 = ((g2) i0.a.g(1, arrayList3)).f533b;
                        int j10 = Utilities.j(i26 + 30, i24 - 1, i23);
                        arrayList3.add(new g2(j10, Utilities.j((i26 + 1560) / 2, i24, j10 + 1)));
                    } else {
                        if (j2Var2.Y()) {
                            arrayList3.clear();
                        }
                        int j11 = Utilities.j(480, i24 - 1, i23);
                        arrayList3.add(new g2(j11, Utilities.j(1200, i24, j11 + 1)));
                    }
                    a3.d dVar2 = j2Var2.f589f;
                    if (dVar2 != null) {
                        dVar2.run();
                    }
                    j2Var2.f590n.f30819f3.O(true);
                    return;
                } else if (a51Var2.f7680a == 3 && (i10 = i25 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i27 = i10 - 1;
                    if (i27 >= 0) {
                        g2Var = (g2) arrayList3.get(i27);
                    } else {
                        g2Var = null;
                    }
                    final g2 g2Var3 = (g2) arrayList3.get(i10);
                    int i28 = i10 + 1;
                    if (i28 < arrayList3.size()) {
                        g2Var2 = (g2) arrayList3.get(i28);
                    } else {
                        g2Var2 = null;
                    }
                    int i29 = a51Var2.d % 3;
                    if (i29 == 0) {
                        Activity parentActivity = j2Var2.getParentActivity();
                        String L0 = cd.L0(2131752750, null);
                        int i30 = g2Var3.f532a;
                        if (g2Var != null) {
                            i23 = g2Var.f533b + 1;
                        }
                        s4.W(parentActivity, L0, i30, i23, g2Var3.f533b - 1, new q20() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num3 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        j2 j2Var3 = j2Var2;
                                        boolean Z = j2Var3.Z();
                                        int intValue = num3.intValue();
                                        g2Var3.f532a = intValue;
                                        ((p8) view2).w(g2.a(intValue), true);
                                        if (Z != j2Var3.Z()) {
                                            j2Var3.f590n.f30819f3.O(true);
                                        }
                                        a3.d dVar3 = j2Var3.f589f;
                                        if (dVar3 != null) {
                                            dVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        j2 j2Var4 = j2Var2;
                                        boolean Z2 = j2Var4.Z();
                                        int intValue2 = num3.intValue();
                                        g2Var3.f533b = intValue2;
                                        ((p8) view2).w(g2.a(intValue2), true);
                                        if (Z2 != j2Var4.Z()) {
                                            j2Var4.f590n.f30819f3.O(true);
                                        }
                                        a3.d dVar4 = j2Var4.f589f;
                                        if (dVar4 != null) {
                                            dVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i29 == 1) {
                        Activity parentActivity2 = j2Var2.getParentActivity();
                        String L02 = cd.L0(2131752756, null);
                        int i31 = g2Var3.f533b;
                        int i32 = g2Var3.f532a + 1;
                        if (g2Var2 != null) {
                            i24 = g2Var2.f532a - 1;
                        }
                        s4.W(parentActivity2, L02, i31, i32, i24, new q20() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num3 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        j2 j2Var3 = j2Var2;
                                        boolean Z = j2Var3.Z();
                                        int intValue = num3.intValue();
                                        g2Var3.f532a = intValue;
                                        ((p8) view2).w(g2.a(intValue), true);
                                        if (Z != j2Var3.Z()) {
                                            j2Var3.f590n.f30819f3.O(true);
                                        }
                                        a3.d dVar3 = j2Var3.f589f;
                                        if (dVar3 != null) {
                                            dVar3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        j2 j2Var4 = j2Var2;
                                        boolean Z2 = j2Var4.Z();
                                        int intValue2 = num3.intValue();
                                        g2Var3.f533b = intValue2;
                                        ((p8) view2).w(g2.a(intValue2), true);
                                        if (Z2 != j2Var4.Z()) {
                                            j2Var4.f590n.f30819f3.O(true);
                                        }
                                        a3.d dVar4 = j2Var4.f589f;
                                        if (dVar4 != null) {
                                            dVar4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i29 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new g2(0, 1439));
                        }
                        j2Var2.f590n.f30819f3.O(true);
                        a3.d dVar3 = j2Var2.f589f;
                        if (dVar3 != null) {
                            dVar3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
            default:
                a51 a51Var3 = (a51) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                if (((d4[]) obj3)[0] != null && (view3 instanceof q6)) {
                    ((q6) view3).B();
                    return;
                }
                return;
            case 5:
                Integer num4 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                m3.Y((m3) obj3, (a51) obj, (View) obj2);
                return;
        }
    }

    @Override
    public void m() {
        switch (this.f34a) {
            case 8:
                y0 y0Var = (y0) this.f35b;
                n1 n1Var = y0Var.d;
                bi.a aVar = y0Var.f3457f;
                if (aVar != null) {
                    aVar.f2832s = true;
                    aVar.f2831r = n1Var.f3226k2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.f2818b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = s6.f(n1Var.getText());
                    }
                }
                l3 l3Var = y0Var.h;
                if (l3Var != null && y0Var.f3457f != null) {
                    d4.R1(l3Var.f3182a);
                    return;
                }
                return;
            case 13:
                ((r5) this.f35b).g();
                return;
            default:
                z5 z5Var = (z5) this.f35b;
                bi.a aVar2 = z5Var.f2881a;
                if (aVar2 != null) {
                    aVar2.f2832s = true;
                    aVar2.f2831r = z5Var.f3481r.f3226k2;
                }
                z5Var.w();
                k3 k3Var = z5Var.E;
                if (k3Var != null && z5Var.f2881a != null) {
                    d4.R1(k3Var.f3169a);
                    return;
                }
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f34a) {
            case 0:
                ((b) this.f35b).invoke(obj);
                return;
            case 16:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 17:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 18:
                ((e1.b) this.f35b).invoke(obj);
                return;
            default:
                ((e1.b) this.f35b).invoke(obj);
                return;
        }
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((Switch) this.f35b).invalidate();
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        bi.s4 s4Var = (bi.s4) this.f35b;
        if (arrayList.isEmpty() || ((gs) arrayList.get(0)).f15760a <= 0) {
            return false;
        }
        s4Var.run(((gs) arrayList.get(0)).f15760a);
        ayVar.finishFragment();
        return true;
    }

    @Override
    public void E(float f7, int i10) {
    }
}
