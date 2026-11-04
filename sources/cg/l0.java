package cg;

import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import b8.zb;
import ci.e9;
import ci.y4;
import ei.z6;
import gi.f7;
import gi.i2;
import gi.va;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import mi.l3;
import mi.q3;
import mi.t3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.Cells.e1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ci;
import org.telegram.ui.di;
import org.telegram.ui.hm;
import org.telegram.ui.ji;
import org.telegram.ui.kl;
import org.telegram.ui.r4;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.wm;
public final class l0 implements Runnable {
    public final int f4719a;
    public final int f4720b;
    public final Object f4721c;

    public l0(int i3, Object obj, int i10) {
        this.f4719a = i10;
        this.f4720b = i3;
        this.f4721c = obj;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i3;
        boolean z11;
        int i10;
        int i11 = this.f4719a;
        boolean z12 = false;
        int i12 = this.f4720b;
        Object obj = this.f4721c;
        switch (i11) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", h10.i(i12).f22848n);
                ((q4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ConnectionsManager.getInstance(((e9) obj).f5029a).cancelRequest(i12, true);
                return;
            case 2:
                dh.f fVar = (dh.f) obj;
                if (fVar.f9001b) {
                    u10 u10Var = fVar.d;
                    if (u10Var != null) {
                        if (i12 < 300) {
                            z12 = true;
                        }
                        u10Var.a(Boolean.valueOf(z12));
                        try {
                            fVar.f9000a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f9002c = true;
                    int max = Math.max(50, i12 - 100);
                    org.telegram.messenger.g0.i3(new l0(fVar, max, 2), max);
                    return;
                }
                return;
            case 3:
                ((e2.f) obj).f9342b.onAudioFocusChange(i12);
                return;
            case 4:
                z6 z6Var = (z6) obj;
                ArrayList arrayList3 = z6Var.f11279g;
                z6Var.v(arrayList3);
                y4 y4Var = z6Var.J;
                Collections.sort(arrayList3, y4Var);
                ArrayList arrayList4 = z6Var.h;
                z6Var.v(arrayList4);
                Collections.sort(arrayList4, y4Var);
                hs.f(i12).k(324, new Object[0]);
                return;
            case 5:
                ((gi.o) obj).a(Integer.valueOf(i12));
                return;
            case 6:
                ((u10) obj).a(Integer.valueOf(i12));
                return;
            case 7:
                ((i2) obj).M0(i12);
                return;
            case 8:
                hp.s1(i12).Y3((ArrayList) obj, true);
                return;
            case 9:
                va vaVar = (va) obj;
                int i13 = vaVar.f13706c;
                vaVar.l();
                vaVar.Y1 = false;
                File file = vaVar.L1.O0;
                if (file != null) {
                    file.delete();
                    vaVar.L1.O0 = null;
                }
                vaVar.V(vaVar.L1, true);
                CharSequence[] charSequenceArr = {vaVar.f13710d1.getText()};
                if (hp.s1(i13).X4()) {
                    arrayList = li.b0(i13).W(charSequenceArr, true, true);
                } else {
                    arrayList = new ArrayList();
                }
                CharSequence[] charSequenceArr2 = {vaVar.L1.C0};
                if (hp.s1(i13).X4()) {
                    arrayList2 = li.b0(i13).W(charSequenceArr2, true, true);
                } else {
                    arrayList2 = new ArrayList();
                }
                f7 f7Var = vaVar.L1;
                if (TextUtils.equals(f7Var.C0, charSequenceArr[0]) && li.K(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                f7Var.f12725k = z10;
                vaVar.L1.C0 = new SpannableString(vaVar.f13710d1.getText());
                vaVar.y();
                vaVar.x();
                f7 f7Var2 = vaVar.L1;
                if (f7Var2 != null && f7Var2.K) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                vaVar.P1 = i3;
                vaVar.L1 = (f7) vaVar.I1.get(i12);
                vaVar.N(0, 1);
                vaVar.M(0, 1);
                vaVar.f13714e1.f13923b.f35594g3.O(false);
                vaVar.f13710d1.setText(vaVar.L1.C0);
                return;
            case 10:
                l2.f fVar2 = ((k2.r0) obj).N;
                l2.a Q = fVar2.Q();
                fVar2.V(Q, 1034, new l2.c(Q, i12, 1, (char) 0));
                return;
            case 11:
                ((kg.e0) obj).g(i12);
                return;
            case 12:
                kh.g gVar = (kh.g) obj;
                gVar.getClass();
                try {
                    gVar.f17291a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 13:
                try {
                    SQLiteDatabase sQLiteDatabase = ((qr) obj).f24936b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i12).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i12).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 14:
                String str = g2.n0.f11873a;
                g2.d dVar = ((k2.c0) ((m2.u) ((m2.t) obj).f19007c)).f16459a.C;
                k2.v vVar = new k2.v(i12, 2);
                dVar.getClass();
                if (Looper.myLooper() == ((g2.j0) dVar.f11820c).f11857a.getLooper()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zb.p(z11);
                dVar.f11818a++;
                dVar.A(new g2.c(0, dVar, vVar));
                Integer num = (Integer) dVar.f11821e;
                dVar.G(Integer.valueOf(i12));
                return;
            case 15:
                mi.c0 c0Var = (mi.c0) obj;
                mi.f0 f0Var = c0Var.f19504f;
                if (c0Var.f19502c && f0Var.F != null && f0Var.f20029a != null) {
                    c0Var.d = true;
                    c0Var.f19500a.m(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    mi.d0 d0Var = f0Var.F;
                    mi.a aVar = f0Var.f20029a;
                    t3 t3Var = ((l3) d0Var).f19735a;
                    t3Var.r3(false);
                    t3Var.f19916p3.T1(new q3(t3Var, aVar, i12), c0Var);
                    return;
                }
                return;
            case 16:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                return;
            case 17:
                hp.s1(i12).V2(0, ((TLRPC.Chat) obj).f27001id, true);
                return;
            case 18:
                ((r4) ((org.telegram.ui.f) obj).f45115b).a0(i12, true);
                return;
            case 19:
                q1 q1Var = ((e1) obj).f29104a;
                int i14 = q1Var.M5;
                if (i12 == i14) {
                    org.telegram.ui.Cells.c0 c0Var2 = (org.telegram.ui.Cells.c0) q1Var.H5.get(i14);
                    if (c0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = c0Var2.f29025s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var2.b(false);
                        if (!q1Var.P5.f26887p1) {
                            if (c0Var2.f29016j != null) {
                                q1Var.n();
                            } else if (c0Var2.f29015i != null) {
                                q1Var.n();
                                l1 l1Var = q1Var.Ra;
                                if (l1Var != null) {
                                    l1Var.x1(q1Var, c0Var2.f29015i);
                                }
                            }
                        }
                    }
                    q1Var.M5 = -1;
                    q1Var.p2();
                    return;
                }
                return;
            case 20:
                td tdVar = ((sd) obj).f49480f;
                tdVar.getClass();
                tdVar.c(i12);
                return;
            case 21:
                wm wmVar = ((ci) obj).f44360g;
                if (wmVar.Xb == i12) {
                    wmVar.lb();
                    return;
                }
                return;
            case 22:
                wm wmVar2 = ((di) obj).f44717g;
                if (wmVar2.Xb == i12) {
                    wmVar2.lb();
                    return;
                }
                return;
            case 23:
                ((ji) obj).f46626a.l(this.f4720b, 0, true, 0, true, 0);
                return;
            case 24:
                wm wmVar3 = ((ci) obj).f44360g;
                if (wmVar3.Xb == i12) {
                    wmVar3.lb();
                    return;
                }
                return;
            case 25:
                wm wmVar4 = ((di) obj).f44717g;
                if (wmVar4.Xb == i12) {
                    wmVar4.lb();
                    return;
                }
                return;
            case 26:
                wm wmVar5 = ((di) obj).f44717g;
                if (wmVar5.Xb == i12) {
                    wmVar5.lb();
                    return;
                }
                return;
            case 27:
                wm wmVar6 = ((kl) obj).f46979x0;
                wmVar6.C0.h1(i12, wmVar6.N4);
                return;
            case 28:
                i10 = ((d2) ((hm) obj).f45934a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i12, true);
                return;
            default:
                hs.f(i12).k(4, new Object[0]);
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.q1((ir) obj, 1), 250L);
                return;
        }
    }

    public l0(Object obj, int i3, int i10) {
        this.f4719a = i10;
        this.f4721c = obj;
        this.f4720b = i3;
    }
}
