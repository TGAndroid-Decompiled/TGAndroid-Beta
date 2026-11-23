package ah;

import ai.u0;
import ai.z;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bi.e6;
import bi.e9;
import bi.h0;
import bi.m0;
import bi.o1;
import bi.p6;
import bi.v6;
import bi.y;
import di.d7;
import di.f2;
import di.f8;
import di.gb;
import di.h1;
import di.i8;
import di.o0;
import fi.b5;
import fi.f9;
import fi.k4;
import fi.r3;
import fi.u1;
import fi.z3;
import hi.db;
import hi.g3;
import hi.i3;
import hi.i9;
import hi.m3;
import hi.pa;
import hi.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kg.k0;
import m.o3;
import oi.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q2;
import org.telegram.messenger.q9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Cells.w;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.v;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xd;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ao0;
import org.telegram.ui.bn;
import sg.j0;
public final class h implements View.OnClickListener {
    public final int f1073a;
    public final Object f1074b;
    public final Object f1075c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i7) {
        this.f1073a = i7;
        this.f1074b = obj;
        this.f1075c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        hi.p pVar;
        String G;
        u0 u0Var;
        long j3;
        ti tiVar;
        boolean v12;
        sa0 sa0Var;
        int i7 = this.f1073a;
        CharSequence charSequence = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.f1075c;
        Object obj3 = this.f1074b;
        switch (i7) {
            case 0:
                ((o) obj3).a(view, (HashSet) obj2, (Runnable) obj);
                return;
            case 1:
                new y((Context) obj2, null, null, (q9) obj).show();
                ((bi.g) obj3).dismiss();
                return;
            case 2:
                y yVar = (y) obj3;
                boolean[] zArr = (boolean[]) obj2;
                i6 i6Var = (i6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    u9.c(yVar.f30223a).e(yVar.T1, new bi.j(yVar, zArr, i6Var, 0));
                    return;
                }
                return;
            case 3:
                m0 m0Var = (m0) obj3;
                int i10 = m0Var.f30223a;
                q9 q9Var = m0Var.f3826i2;
                new h1((Context) obj2, (i6) obj, i10, q9Var.d.title, q9Var.h, false).show();
                m0Var.dismiss();
                return;
            case 4:
                m0 m0Var2 = (m0) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                i6 i6Var2 = (i6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    u9.c(m0Var2.f30223a).e(m0Var2.U1, new bi.j(m0Var2, zArr2, i6Var2, 1));
                    return;
                }
                return;
            case 5:
                p6 p6Var = (p6) obj3;
                ((x60) obj2).v();
                fq0 fq0Var = p6Var.f3966a;
                e6 e6Var = new e6(p6Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = v6.V;
                fq0Var.h(null, e6Var);
                return;
            case 6:
                Context context = (Context) obj2;
                i6 i6Var3 = (i6) obj;
                if (((o0) obj3).B1.f5266a == cg.b.f5268a) {
                    new gb(context, i6Var3).show();
                    return;
                }
                return;
            case 7:
                final w2 w2Var = (w2) obj2;
                final hi.e eVar = (hi.e) obj;
                w2Var.f30230c0 = false;
                eVar.setLoading(true);
                ((i8) obj3).a(new w10() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                                if (booleanValue) {
                                    w2Var2.dismiss();
                                    return;
                                }
                                final hi.e eVar2 = eVar;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var2.f30230c0 = false;
                                                eVar2.setLoading(false);
                                                return;
                                            default:
                                                w2Var2.f30230c0 = false;
                                                eVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var3 = w2Var;
                                if (booleanValue2) {
                                    w2Var3.dismiss();
                                    return;
                                }
                                final hi.e eVar3 = eVar;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var3.f30230c0 = false;
                                                eVar3.setLoading(false);
                                                return;
                                            default:
                                                w2Var3.f30230c0 = false;
                                                eVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 8:
                final w2 w2Var2 = (w2) obj2;
                final hi.e eVar2 = (hi.e) obj;
                w2Var2.f30230c0 = false;
                eVar2.setLoading(true);
                ((f8) obj3).a(new w10() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var22 = w2Var2;
                                if (booleanValue) {
                                    w2Var22.dismiss();
                                    return;
                                }
                                final hi.e eVar22 = eVar2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var22.f30230c0 = false;
                                                eVar22.setLoading(false);
                                                return;
                                            default:
                                                w2Var22.f30230c0 = false;
                                                eVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
                                if (booleanValue2) {
                                    w2Var3.dismiss();
                                    return;
                                }
                                final hi.e eVar3 = eVar2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var3.f30230c0 = false;
                                                eVar3.setLoading(false);
                                                return;
                                            default:
                                                w2Var3.f30230c0 = false;
                                                eVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 9:
                ((u1) obj3).a(Long.valueOf(((long[]) obj2)[0]));
                ((w2) obj).dismiss();
                return;
            case 10:
                z3 z3Var = ((r3) obj3).f12494x;
                z3Var.D0((i9) obj2, (TL_stories.StoryItem) obj);
                r3 r3Var = z3Var.f12822d1;
                if (r3Var != null) {
                    r3Var.a();
                    return;
                }
                return;
            case 11:
                r3 r3Var2 = (r3) obj3;
                f9 f9Var = (f9) obj;
                ((y0) obj2).performHapticFeedback(3);
                kc Y = kc.Y();
                if (Y != null) {
                    Y.Q(2131624056, 36, g0.T2(gd.N0(2131745737, null), new f2(29, r3Var2, f9Var))).j();
                    return;
                }
                return;
            case 12:
                k4 k4Var = (k4) obj3;
                e9 e9Var = new e9(k4Var, 3);
                b5 b5Var = k4Var.f12186b;
                new bv(e9Var, b5Var.getContext(), b5Var.f11781s, (ArrayList) obj2).show();
                ((x60) obj).v();
                return;
            case 13:
                db dbVar = (db) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                fi.b bVar = (fi.b) obj;
                x60 x60Var = dbVar.V0;
                if (x60Var == null || !x60Var.E()) {
                    hi.p pVar2 = new hi.p(dbVar, 0);
                    boolean q10 = i10.i(dbVar.V).q();
                    if (q10) {
                        pVar = null;
                    } else {
                        pVar = new hi.p(dbVar, 1);
                    }
                    x60 G2 = x60.G(frameLayout, bVar, dbVar.T0);
                    dbVar.V0 = G2;
                    G2.p(13, g0.L(200.0f), gd.O0("StoryPeriodHint"));
                    dbVar.V0.k();
                    int i11 = 0;
                    while (true) {
                        int[] iArr = s.Q1;
                        if (i11 < 4) {
                            int i12 = iArr[i11];
                            x60 x60Var2 = dbVar.V0;
                            if (i12 == Integer.MAX_VALUE) {
                                G = gd.O0("StoryPeriodKeep");
                            } else {
                                G = gd.G(i12 / 3600, "Hours", new Object[0]);
                            }
                            String str = G;
                            int i13 = n6.E8;
                            x60Var2.b(0, null, str, i13, i13, new u0(pVar2, i12, 10));
                            if (!q10 && i12 != 86400 && i12 != Integer.MAX_VALUE) {
                                u0Var = new u0(pVar, i12, 11);
                            } else {
                                u0Var = null;
                            }
                            x60Var2.N(u0Var);
                            if (dbVar.X0 == i11) {
                                dbVar.V0.M();
                            }
                            i11++;
                        } else {
                            x60 x60Var3 = dbVar.V0;
                            x60Var3.f41892s = 0;
                            x60Var3.a0();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 14:
                ef efVar = (ef) obj2;
                i3 i3Var = (i3) obj;
                m3 m3Var = ((g3) obj3).f14527c;
                ArrayList arrayList = m3Var.f14900i0;
                if (arrayList.contains(efVar)) {
                    arrayList.remove(efVar);
                } else if (arrayList.size() + 1 > m3Var.S) {
                    int i14 = -m3Var.O;
                    m3Var.O = i14;
                    g0.E3(i14, i3Var, null);
                    q2.APP_ERROR.a();
                    return;
                } else {
                    arrayList.add(efVar);
                }
                g0.Z3(m3Var.d);
                m3Var.j();
                return;
            case 15:
                pa paVar = (pa) obj3;
                Context context2 = (Context) obj2;
                j0 j0Var = (j0) obj;
                if (paVar.l1) {
                    sg.q qVar = new sg.q(context2, paVar.f15585q1);
                    paVar.D1 = qVar;
                    qVar.J0(paVar.f15573k1.f57335a, 2);
                    qVar.f57443s1 = new androidx.activity.n(paVar, j0Var, 1);
                    qVar.f57442r1 = new d7(2, paVar, j0Var);
                    qVar.show();
                    return;
                }
                Runnable runnable = paVar.f15593u1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                kg.e eVar3 = (kg.e) obj3;
                x60 G3 = x60.G(((bn) obj2).getLayoutContainer(), (i6) obj, eVar3.f18386n);
                G3.c(2131232092, gd.N0(2131753699, null), new kg.d(eVar3, 1), true);
                G3.F();
                if (eVar3.f18391y != null) {
                    G3.c(2131232365, gd.N0(2131753700, null), new kg.d(eVar3, 2), false);
                }
                G3.b0(g0.L(10.0f), g0.L(7.0f));
                G3.f41892s = 0;
                G3.a0();
                return;
            case 17:
                k0 k0Var = (k0) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                ao0 ao0Var = (ao0) obj;
                hi.e eVar4 = k0Var.Y1;
                if (!eVar4.R) {
                    eVar4.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = mp.u1(k0Var.f30223a).q1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(k0Var.f30223a).sendRequest(updateconnectedbot, new o1(21, k0Var, ao0Var));
                    return;
                }
                return;
            case 18:
                ni.a aVar = (ni.a) obj3;
                w10 w10Var = (w10) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                boolean z11 = aVar.U1;
                if (chat != null && !v3.w(27, chat)) {
                    z10 = true;
                }
                aVar.e1(w10Var, z11, z10);
                return;
            case 19:
                ((o3) obj3).a();
                ((a6) obj2).D((oi.k0) obj);
                return;
            case 20:
                v vVar = (v) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                i6 i6Var4 = (i6) obj;
                hi.e eVar5 = vVar.f40517b2;
                if (eVar5.f14340e0 && !eVar5.R) {
                    if (vVar.e1()) {
                        vVar.dismiss();
                        return;
                    }
                    eVar5.setLoading(true);
                    TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                    savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                    ConnectionsManager.getInstance(vVar.f30223a).sendRequestTyped(savetone, new d3.b(1), new h0(vVar, i6Var4, aiComposeTone, 7));
                    return;
                }
                return;
            case 21:
                ((boolean[]) obj3)[0] = false;
                ((z4) obj2).I(-1, 0, true);
                ((w2) ((h6.o) obj).f13936b).f30268y0.run();
                return;
            case 22:
                Runnable runnable2 = (Runnable) obj;
                x4 x4Var = (x4) obj2;
                t1 t1Var = ((t1[]) obj3)[0];
                if (t1Var != null) {
                    t1Var.setOnDismissListener(null);
                }
                runnable2.run();
                x4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 23:
                bz.f23308o0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = mp.g1().edit();
                edit.putInt("mapPreviewType", bz.f23308o0);
                edit.apply();
                ((Runnable) obj).run();
                ((AlertDialog$Builder) obj2).f28835a.M0.run();
                return;
            case 24:
                ((d8) obj3).f34233n.Y0((w) obj2, (fj) obj);
                return;
            case 25:
                ti tiVar2 = (ti) obj3;
                g2 g2Var = (g2) obj2;
                i6 i6Var5 = (i6) obj;
                g2 g2Var2 = tiVar2.f39956a2;
                int i15 = tiVar2.H3;
                bi biVar = tiVar2.G2;
                org.telegram.ui.Components.ef efVar2 = tiVar2.f39962c2;
                if (efVar2 != null) {
                    j3 = efVar2.k();
                } else {
                    j3 = 0;
                }
                tiVar2.L2 = j3;
                biVar.setEffect(j3);
                tiVar2.f30241g1 = true;
                if (tiVar2.F1 - tiVar2.G1 < 0) {
                    g0.D3(tiVar2.f40020u1);
                    g0.D3(tiVar2.f40024v1);
                    try {
                        biVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!mp.u1(i15).K3() && mp.u1(i15).X4 > tiVar2.G1) {
                        tiVar2.E1(g2Var);
                    }
                    org.telegram.ui.Components.ef efVar3 = tiVar2.f39962c2;
                    if (efVar3 != null) {
                        efVar3.h(false);
                        tiVar2.f39962c2 = null;
                        return;
                    }
                    return;
                }
                if (tiVar2.F3 == null && (g2Var2 instanceof bn)) {
                    bn bnVar = (bn) g2Var2;
                    if (bnVar.c()) {
                        org.telegram.ui.Components.b5.J(tiVar2.getContext(), bnVar.a(), new z(tiVar2, j3, 4), i6Var5);
                        tiVar = tiVar2;
                        tiVar.w1(false, false);
                        return;
                    }
                }
                li liVar = tiVar2.f40029w2;
                if (liVar != tiVar2.f39967e2 && liVar != tiVar2.f39987l2) {
                    if (!liVar.M(true, 0, 0, j3, tiVar2.g1())) {
                        tiVar2.B4 = true;
                        tiVar2.dismiss();
                    }
                    v12 = false;
                    tiVar = tiVar2;
                } else {
                    tiVar = tiVar2;
                    v12 = tiVar.v1(true, 0, 0, j3, tiVar2.g1());
                }
                org.telegram.ui.Components.ef efVar4 = tiVar.f39962c2;
                if (efVar4 != null) {
                    efVar4.h(!v12);
                    tiVar.f39962c2 = null;
                }
                tiVar.w1(false, false);
                return;
            case 26:
                ti tiVar3 = (ti) obj3;
                fj fjVar = (fj) obj2;
                tiVar3.w1(!tiVar3.X1, true);
                TLRPC.Message message = fjVar.f24073k;
                boolean z12 = tiVar3.X1;
                message.invert_media = z12;
                ((sa0) obj).a(!z12, true);
                tiVar3.f39962c2.f(fjVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar3.f39967e2;
                if (chatAttachAlertPhotoLayout != null && (sa0Var = chatAttachAlertPhotoLayout.f32876e1) != null) {
                    sa0Var.a(!tiVar3.X1, true);
                }
                tiVar3.f39962c2.n(!tiVar3.X1);
                return;
            case 27:
                hi.e eVar6 = (hi.e) obj;
                ((w10) obj2).a(new vf.b(new lo(eVar6, 6), new xd(26, (gr) obj3, eVar6)));
                return;
            case 28:
                Context context3 = (Context) obj2;
                ((fr) obj3).getClass();
                g0.g(((x8) obj).f32430a.getText().toString());
                if (g0.G3()) {
                    Toast.makeText(context3, gd.N0(2131743949, null), 0).show();
                    return;
                }
                return;
            default:
                mt mtVar = (mt) obj3;
                di.q qVar2 = (di.q) obj2;
                ai.e eVar7 = (ai.e) obj;
                try {
                    charSequence = ((ClipboardManager) mtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(mtVar.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    qVar2.setText(charSequence);
                    qVar2.setSelection(0, qVar2.getText().length());
                }
                eVar7.run();
                return;
        }
    }

    public h(Object obj, Runnable runnable, Object obj2, int i7) {
        this.f1073a = i7;
        this.f1074b = obj;
        this.d = runnable;
        this.f1075c = obj2;
    }
}
